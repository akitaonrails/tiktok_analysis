package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.bagicon.BagGuideTooltipController;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.shopbag.api.BagAnimationApi;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveBagIconAnimationRequestBody;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11Xf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.shopbag.guide.BagTooltipRequestHelper$handleRequestBagToolTip$1", f = "BagTooltipRequestHelper.kt", l = {76}, m = "invokeSuspend")
public final class C19516511Xf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ EnumC598510Ndh LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ BagGuideTooltipController LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19516511Xf(EnumC598510Ndh enumC598510Ndh, boolean z, long j, long j2, BagGuideTooltipController bagGuideTooltipController, InterfaceC1364105Vn<? super C19516511Xf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = enumC598510Ndh;
        this.LLILZ = z;
        this.LLILZIL = j;
        this.LLILZLL = j2;
        this.LLIZ = bagGuideTooltipController;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C19516511Xf c19516511Xf = new C19516511Xf(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c19516511Xf.LLILLJJLI = obj;
        return c19516511Xf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0X52 c0x52;
        InterfaceC497601wk interfaceC497601wk;
        Object bagIconAnimationData = obj;
        C1C7U.LIZ("BagTooltipRequestHelper@402c.handleRequestBagToolTip$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                    C155000ia.LIZIZ(bagIconAnimationData);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(bagIconAnimationData);
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                if (C19516211Xc.LIZ.get()) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("BagTooltipRequestHelper@402c.handleRequestBagToolTip$1");
                    return unit;
                }
                if (this.LLILLL != EnumC598510Ndh.ROOM_ENTER) {
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("BagTooltipRequestHelper@402c.handleRequestBagToolTip$1");
                    return unit2;
                }
                BagAnimationApi bagAnimationApi = (BagAnimationApi) C0NSL.LIZ().create(BagAnimationApi.class);
                AtomicBoolean atomicBoolean = C19516211Xc.LIZ;
                List listLIZ = C19516211Xc.LIZ(false, this.LLILZ, this.LLILLL);
                if (((ArrayList) listLIZ).isEmpty()) {
                    Unit unit3 = Unit.LIZ;
                    C1C7U.LIZIZ("BagTooltipRequestHelper@402c.handleRequestBagToolTip$1");
                    return unit3;
                }
                LiveBagIconAnimationRequestBody liveBagIconAnimationRequestBody = new LiveBagIconAnimationRequestBody(this.LLILZIL, this.LLILZLL, C2286608xc.LJ(0), listLIZ);
                this.LLILLJJLI = interfaceC497601wk;
                this.LL = 1;
                bagIconAnimationData = bagAnimationApi.getBagIconAnimationData(liveBagIconAnimationRequestBody, this);
                if (bagIconAnimationData == objLJFF) {
                    C1C7U.LIZIZ("BagTooltipRequestHelper@402c.handleRequestBagToolTip$1");
                    return objLJFF;
                }
            }
            c0x52 = (C0X52) bagIconAnimationData;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c0x52 = null;
        }
        if (C19516211Xc.LIZ.get()) {
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("BagTooltipRequestHelper@402c.handleRequestBagToolTip$1");
            return unit4;
        }
        C23250099c.LIZLLL(interfaceC497601wk, C2126308Ur.LJFF, null, new C19516811Xi(c0x52, this.LLIZ, this.LLILZIL, null), 2);
        Unit unit5 = Unit.LIZ;
        C1C7U.LIZIZ("BagTooltipRequestHelper@402c.handleRequestBagToolTip$1");
        return unit5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
