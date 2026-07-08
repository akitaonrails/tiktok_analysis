package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.18nn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21392918nn implements InterfaceC1611090s1j {
    public static final C21392918nn LIZ = new C21392918nn();
    public static long LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;

    @Override // X.InterfaceC1611090s1j
    public final void LIZJ() {
        LIZJ = true;
    }

    @Override // X.InterfaceC1611090s1j
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1611090s1j
    public final void LJFF() {
    }

    @Override // X.InterfaceC1611090s1j
    public final Pair LIZ(C19EG c19eg) {
        C21392818nm c21392818nm = new C21392818nm(c19eg);
        return new Pair(c21392818nm, c21392818nm.getSearchButtonBarDisabled$tablet_release());
    }

    @Override // X.InterfaceC1611090s1j
    public final void LIZLLL(boolean z) {
        LIZLLL = z;
    }

    @Override // X.InterfaceC1611090s1j
    public final void LJ(Integer num) {
        if (num != null) {
            num.intValue();
        } else {
            C1389340mG4.LIZJ(null, null).LIZIZ();
        }
    }

    public static int LJI(int i, boolean z) {
        double d;
        double d2;
        if (z) {
            d = i;
            d2 = 0.44d;
        } else {
            d = i;
            d2 = 0.21d;
        }
        return C341940Daq.LIZ(Math.min(Math.max(d * d2, 156.0d), 454.0d));
    }
}
