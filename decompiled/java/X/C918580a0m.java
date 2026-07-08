package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0a0m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C918580a0m implements InterfaceC918940a1M {
    public final /* synthetic */ AtomicBoolean LIZ;
    public final /* synthetic */ C918560a0k LIZIZ;
    public final /* synthetic */ C918350a0P LIZJ;
    public final /* synthetic */ List<InterfaceC918590a0n> LIZLLL;
    public final /* synthetic */ int LJ;

    @Override // X.InterfaceC918940a1M
    public final void resume() {
        if (this.LIZ.compareAndSet(false, true)) {
            this.LIZIZ.LIZJ(this.LIZJ, this.LIZLLL, this.LJ + 1);
        }
    }

    @Override // X.InterfaceC918940a1M
    public final void LIZ(C918610a0p c918610a0p) {
        if (!this.LIZ.compareAndSet(false, true)) {
            return;
        }
        this.LIZIZ.LIZIZ(this.LIZJ, this.LIZLLL, this.LJ, c918610a0p);
    }

    public static final C918610a0p LIZIZ(EnumC918770a15 enumC918770a15, String str) {
        return new C918610a0p(EnumC918840a1C.PENDING, enumC918770a15, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C918580a0m(AtomicBoolean atomicBoolean, C918560a0k c918560a0k, C918350a0P c918350a0P, List<? extends InterfaceC918590a0n> list, int i) {
        this.LIZ = atomicBoolean;
        this.LIZIZ = c918560a0k;
        this.LIZJ = c918350a0P;
        this.LIZLLL = list;
        this.LJ = i;
    }
}
