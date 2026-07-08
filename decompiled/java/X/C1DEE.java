package X;

import Y.ARunnableS104S0200000_35;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.1DEE, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final /* synthetic */ class C1DEE extends C2217421BqW implements InterfaceC1631620sYq<C1DEC, C1DEF<?>, Object, Unit> {
    public static final C1DEE LL = new C1DEE();

    public C1DEE() {
        super(3, C1DEC.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(C1DEC c1dec, C1DEF<?> c1def, Object obj) {
        C1DEC c1dec2 = c1dec;
        C1DEF<?> c1def2 = c1def;
        if (c1dec2.LIZ <= 0) {
            c1def2.LIZIZ(Unit.LIZ);
        } else {
            ARunnableS104S0200000_35 aRunnableS104S0200000_35 = new ARunnableS104S0200000_35(c1def2, c1dec2, 11);
            CoroutineContext context = c1def2.getContext();
            c1def2.LIZ(AnonymousClass0958.LIZLLL(context).invokeOnTimeout(c1dec2.LIZ, aRunnableS104S0200000_35, context));
        }
        return Unit.LIZ;
    }
}
