package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PaymentApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfoItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfoReqInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfoResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03Nr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel$queryBindInfo$1", f = "MiniOspViewModel.kt", l = {3185}, m = "invokeSuspend")
public final class C834103Nr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MiniOspViewModel LLILLJJLI;
    public final /* synthetic */ List<BindInfoReqInfo> LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ PaymentMethod LLILZIL;
    public final /* synthetic */ Function1<String, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C834103Nr(MiniOspViewModel miniOspViewModel, List<BindInfoReqInfo> list, boolean z, PaymentMethod paymentMethod, Function1<? super String, Unit> function1, InterfaceC1364105Vn<? super C834103Nr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = miniOspViewModel;
        this.LLILLL = list;
        this.LLILZ = z;
        this.LLILZIL = paymentMethod;
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C834103Nr(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        PaymentMethodsData paymentMethodsData;
        Response response;
        BindInfoResponseData bindInfoResponseData;
        Function1<String, Unit> function1;
        List<BindInfoItem> list;
        C1C7U.LIZ("MiniOspViewModel@8f4.queryBindInfo$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        BindInfoItem bindInfoItem = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                BillInfoData billInfoData = this.LLILLJJLI.LLIZ;
                if (billInfoData != null && (paymentMethodsData = billInfoData.paymentMethods) != null) {
                    str = paymentMethodsData.saleRegion;
                } else {
                    str = null;
                }
                C921103ir.LIZ.getClass();
                String strLIZ = C921103ir.LIZ("order_submit", "binding");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Scene.SCENE_SERVICE, "coupon_purchase");
                BindInfoRequest bindInfoRequest = new BindInfoRequest(this.LLILLL, str, C786410Ut5.J3(jSONObject), strLIZ);
                MiniOspViewModel miniOspViewModel = this.LLILLJJLI;
                this.LL = 1;
                miniOspViewModel.getClass();
                C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
                PaymentApi.LIZ.getClass();
                C877403bo.LJ(bindInfoRequest).LJL(C11S5.LIZ()).LIZIZ(new C1077404Jg(c23260099m, 8));
                obj = c23260099m.LIZ();
                if (obj == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MiniOspViewModel@8f4.queryBindInfo$1");
                    return objLJFF;
                }
            }
            response = (Response) obj;
            bindInfoResponseData = (BindInfoResponseData) response.data;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI.setState(AFwS228S0000000_1.get$arr$(281));
        }
        if (response.isCodeOK() && bindInfoResponseData != null) {
            if (this.LLILZ && (list = bindInfoResponseData.bindInfoList) != null) {
                MiniOspViewModel miniOspViewModel2 = this.LLILLJJLI;
                for (BindInfoItem bindInfoItem2 : list) {
                    String str2 = bindInfoItem2.paymentMethodId;
                    if (str2 != null) {
                        miniOspViewModel2.LLLLLLJ.put(str2, bindInfoItem2);
                    }
                }
            }
            List<BindInfoItem> list2 = bindInfoResponseData.bindInfoList;
            if (list2 != null) {
                PaymentMethod paymentMethod = this.LLILZIL;
                Iterator<BindInfoItem> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    BindInfoItem next = it2.next();
                    if (Intrinsics.LJFF(next.paymentMethodId, paymentMethod.id)) {
                        bindInfoItem = next;
                        break;
                    }
                }
                BindInfoItem bindInfoItem3 = bindInfoItem;
                if (bindInfoItem3 != null && (function1 = this.LLILZLL) != null) {
                    function1.invoke(bindInfoItem3.paymentMethodBindUrl);
                }
            }
            this.LLILLJJLI.setState(AFwS228S0000000_1.get$arr$(280));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MiniOspViewModel@8f4.queryBindInfo$1");
            return unit;
        }
        this.LLILLJJLI.setState(AFwS228S0000000_1.get$arr$(279));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MiniOspViewModel@8f4.queryBindInfo$1");
        return unit2;
    }
}
