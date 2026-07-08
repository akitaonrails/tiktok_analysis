package X;

import Y.AObjectS308S0200000_2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05la, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1447605la implements InterfaceC1447905ld {
    public final C1447305lX LIZ;
    public final InterfaceC1449905lx<C1447405lY> LIZIZ = C1449705lv.LIZ(new C1447405lY(0), null, new C1447205lW(this));

    @Override // X.InterfaceC1447905ld
    public final C1447405lY getState() {
        return this.LIZIZ.getState();
    }

    public C1447605la(C1447305lX c1447305lX) {
        this.LIZ = c1447305lX;
    }

    @Override // X.InterfaceC1447905ld
    public final void LIZIZ(AbstractC1446905lT abstractC1446905lT) {
        this.LIZIZ.LIZ().invoke(abstractC1446905lT);
    }

    @Override // X.InterfaceC1447905ld
    public final Function0 LIZ(C2217481Bqc c2217481Bqc, Function1 function1) {
        return C1449705lv.LIZIZ(this.LIZIZ, c2217481Bqc, new AObjectS308S0200000_2(c2217481Bqc, function1, 2));
    }
}
