package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentIndependentPriceDefaultConfig;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.03cO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel$requestIndependentPricing$1", f = "CCDCAddCardViewModel.kt", l = {3699, 3706}, m = "invokeSuspend")
public final class C881003cO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C881503cT LL;
    public int LLILLJJLI;
    public final /* synthetic */ CCDCAddCardViewModel LLILLL;
    public final /* synthetic */ PaymentInfo LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C881003cO(CCDCAddCardViewModel cCDCAddCardViewModel, PaymentInfo paymentInfo, String str, Function0<Unit> function0, InterfaceC1364105Vn<? super C881003cO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = cCDCAddCardViewModel;
        this.LLILZ = paymentInfo;
        this.LLILZIL = str;
        this.LLILZLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C881003cO(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.03cT, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        String str;
        HashMap<String, Object> map;
        long jLongValue;
        Object obj3;
        Object objLIZIZ = obj;
        C1C7U.LIZ("CCDCAddCardViewModel@23a2.requestIndependentPricing$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1713070ugD.LIZIZ(obj3);
                this.LLILLL.LLJ.remove(obj3);
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C1AF0.LJ(th2);
            C03OI c03oi = C03OI.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILZIL);
            sbLIZ.append(" independent pricing exception");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c03oi.getClass();
            C03OI.LJFF("CCDCAddCardViewModel", strLIZIZ);
            CCDCAddCardViewModel cCDCAddCardViewModel = this.LLILLL;
            cCDCAddCardViewModel.setStateImmediate(new AwS580S0100000_1(cCDCAddCardViewModel, 140));
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZIZ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("CCDCAddCardViewModel@23a2.requestIndependentPricing$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C881503cT c881503cT = this.LL;
            C155000ia.LIZIZ(objLIZIZ);
            obj3 = c881503cT;
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            final C099F c099fLIZIZ = C090F.LIZIZ();
            ?? r2 = new Object() { // from class: X.03cT
                @C14EU(threadMode = ThreadMode.MAIN)
                public final void onResult(C03OD c03od) {
                    if (!c03od.LIZLLL) {
                        return;
                    }
                    if (c099fLIZIZ.isCompleted()) {
                        C1713070ugD.LIZIZ(this);
                    } else {
                        c099fLIZIZ.LJIIZILJ(c03od);
                        C1713070ugD.LIZIZ(this);
                    }
                }
            };
            this.LLILLL.LLJ.add((Object) r2);
            C1713070ugD.LIZ(r2);
            if (this.LLILLL.RQ2()) {
                C1440005kM.LIZ(new C862203Ym(this.LLILZ.paymentMethod, true, true));
            } else {
                EnterParams enterParams = this.LLILLL.LLILLJJLI;
                if (enterParams != null && (map = enterParams.trackParams) != null) {
                    obj2 = map.get("previous_page");
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof String) {
                    str = (String) obj2;
                } else {
                    str = null;
                }
                C1440005kM.LIZ(new C03OO(this.LLILZ.paymentMethod, true, true, Intrinsics.LJFF(str, "payment_method")));
            }
            Long l = EcPaymentIndependentPriceDefaultConfig.LIZJ().addCardWaitTime;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 15000;
            }
            C881303cR c881303cR = new C881303cR(c099fLIZIZ, null);
            this.LL = r2;
            this.LLILLJJLI = 1;
            objLIZIZ = C099A.LIZIZ(jLongValue, c881303cR, this);
            obj3 = r2;
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("CCDCAddCardViewModel@23a2.requestIndependentPricing$1");
                return objLJFF;
            }
        }
        C03OD c03od = (C03OD) objLIZIZ;
        C1713070ugD.LIZIZ(obj3);
        this.LLILLL.LLJ.remove(obj3);
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C881103cP c881103cP = new C881103cP(c03od, this.LLILZIL, this.LLILZ, this.LLILZLL, this.LLILLL, null);
        this.LL = null;
        this.LLILLJJLI = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c881103cP) == objLJFF) {
            C1C7U.LIZIZ("CCDCAddCardViewModel@23a2.requestIndependentPricing$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CCDCAddCardViewModel@23a2.requestIndependentPricing$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
