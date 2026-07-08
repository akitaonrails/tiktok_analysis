package X;

import com.ss.android.ugc.aweme.homepage.landing.ForceBackFYPViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08b7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.homepage.landing.ForceBackFYPViewModel$createJob$1", f = "ForceBackFYPViewModel.kt", l = {82, 83}, m = "invokeSuspend")
public final class C2147108b7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ ForceBackFYPViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2147108b7(long j, ForceBackFYPViewModel forceBackFYPViewModel, InterfaceC1364105Vn<? super C2147108b7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = forceBackFYPViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2147108b7(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("ForceBackFYPViewModel@d6ab.createJob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ForceBackFYPViewModel@d6ab.createJob$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("delay ");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(" time job to switch.");
            C1720106oR.LJI("LandingFYP", C2188811AlT.LIZIZ(sbLIZ));
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("ForceBackFYPViewModel@d6ab.createJob$1");
                return objLJFF;
            }
        }
        ForceBackFYPViewModel forceBackFYPViewModel = this.LLILLL;
        this.LL = 2;
        forceBackFYPViewModel.getClass();
        Object objLJI = C23250099c.LJI(this, C2108208Ns.LIZ, new C2147208b8(forceBackFYPViewModel, null));
        if (objLJI != C099R.LJFF()) {
            objLJI = Unit.LIZ;
        }
        if (objLJI == objLJFF) {
            C1C7U.LIZIZ("ForceBackFYPViewModel@d6ab.createJob$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ForceBackFYPViewModel@d6ab.createJob$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
