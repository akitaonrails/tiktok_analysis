package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PaymentApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfoItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfoReqInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfoResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.03Ou, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.utils.BindUrlManager$queryBindInfo$1", f = "BindUrlManager.kt", l = {94}, m = "invokeSuspend")
public final class C837003Ou extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<BindInfoReqInfo> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C837103Ov LLILZ;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ PaymentMethod LLIZ;
    public final /* synthetic */ Function1<String, Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C837003Ou(List<BindInfoReqInfo> list, String str, C837103Ov c837103Ov, Function1<? super Boolean, Unit> function1, boolean z, PaymentMethod paymentMethod, Function1<? super String, Unit> function12, InterfaceC1364105Vn<? super C837003Ou> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = str;
        this.LLILZ = c837103Ov;
        this.LLILZIL = function1;
        this.LLILZLL = z;
        this.LLIZ = paymentMethod;
        this.LLIZLLLIL = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C837003Ou(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Response response;
        BindInfoResponseData bindInfoResponseData;
        BindInfoItem next;
        Function1<String, Unit> function1;
        List<BindInfoItem> list;
        C1C7U.LIZ("BindUrlManager@23c2.queryBindInfo$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                List<BindInfoReqInfo> list2 = this.LLILLJJLI;
                String str = this.LLILLL;
                C921103ir.LIZ.getClass();
                BindInfoRequest bindInfoRequest = new BindInfoRequest(list2, str, null, C921103ir.LIZ("order_submit", "binding"));
                C837103Ov c837103Ov = this.LLILZ;
                this.LL = 1;
                c837103Ov.getClass();
                C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
                PaymentApi.LIZ.getClass();
                C877403bo.LJ(bindInfoRequest).LJL(C11S5.LIZ()).LIZIZ(new C1077404Jg(c23260099m, 9));
                obj = c23260099m.LIZ();
                if (obj == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BindUrlManager@23c2.queryBindInfo$1");
                    return objLJFF;
                }
            }
            response = (Response) obj;
            bindInfoResponseData = (BindInfoResponseData) response.data;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILZIL.invoke(false);
            C1AF0.LJ(th);
        }
        if (response.isCodeOK() && bindInfoResponseData != null) {
            if (this.LLILZLL && (list = bindInfoResponseData.bindInfoList) != null) {
                C837103Ov c837103Ov2 = this.LLILZ;
                for (BindInfoItem bindInfoItem : list) {
                    String str2 = bindInfoItem.paymentMethodId;
                    if (str2 != null) {
                        c837103Ov2.LIZ.put(str2, bindInfoItem);
                    }
                }
            }
            List<BindInfoItem> list3 = bindInfoResponseData.bindInfoList;
            if (list3 != null) {
                PaymentMethod paymentMethod = this.LLIZ;
                Iterator<BindInfoItem> it2 = list3.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.paymentMethodId, paymentMethod.id)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                BindInfoItem bindInfoItem2 = next;
                if (bindInfoItem2 != null && (function1 = this.LLIZLLLIL) != null) {
                    function1.invoke(bindInfoItem2.paymentMethodBindUrl);
                }
            }
            this.LLILZIL.invoke(false);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("BindUrlManager@23c2.queryBindInfo$1");
            return unit;
        }
        this.LLILZIL.invoke(false);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BindUrlManager@23c2.queryBindInfo$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
