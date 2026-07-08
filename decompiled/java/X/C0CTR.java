package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CTR, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.nuj.HomeTabNujLaunchHelper$reportOnTabRefresh$2", f = "HomeTabNujLaunchHelper.kt", l = {307, 308}, m = "invokeSuspend")
public final class C0CTR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C0CTS LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CTR(C19EG c19eg, boolean z, C0CTS c0cts, InterfaceC1364105Vn<? super C0CTR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19eg;
        this.LLILLL = z;
        this.LLILZ = c0cts;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CTR(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HomeTabNujLaunchHelper@afd.reportOnTabRefresh$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("HomeTabNujLaunchHelper@afd.reportOnTabRefresh$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                C1C7U.LIZIZ("HomeTabNujLaunchHelper@afd.reportOnTabRefresh$2");
                return objLJFF;
            }
        }
        C1DFB c1dfb = C0PEM.LIZJ;
        C0CTT c0ctt = new C0CTT(this.LLILLJJLI, this.LLILLL, this.LLILZ, null);
        this.LL = 2;
        if (C23250099c.LJI(this, c1dfb, c0ctt) == objLJFF) {
            C1C7U.LIZIZ("HomeTabNujLaunchHelper@afd.reportOnTabRefresh$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("HomeTabNujLaunchHelper@afd.reportOnTabRefresh$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
