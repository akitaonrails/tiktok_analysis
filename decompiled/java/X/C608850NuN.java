package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NuN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.helper.SessionListPreloadHelper$preloadRefactorVHBasedOnTypeDistribution$1", f = "SessionListPreloadHelper.kt", l = {}, m = "invokeSuspend")
public final class C608850NuN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19EG LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C608850NuN(C19EG c19eg, InterfaceC1364105Vn<? super C608850NuN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19eg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C608850NuN(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SessionListPreloadHelper@4a7b.preloadRefactorVHBasedOnTypeDistribution$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C506101y7.LIZ(this.LL.getLifecycle(), new Runnable() { // from class: X.0NuO
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SessionListPreloadHelper@4a7b.preloadRefactorVHBasedOnTypeDistribution$1$1");
                try {
                    C888590YtV.LJFF.clear();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SessionListPreloadHelper@4a7b.preloadRefactorVHBasedOnTypeDistribution$1$1");
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SessionListPreloadHelper@4a7b.preloadRefactorVHBasedOnTypeDistribution$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
