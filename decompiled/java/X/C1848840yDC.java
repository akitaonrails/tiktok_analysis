package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yDC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1848840yDC {
    public final C1848740yD2 LIZ;
    public final InterfaceC1525090pn1 LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1848840yDC)) {
            return false;
        }
        C1848840yDC c1848840yDC = (C1848840yDC) obj;
        return Intrinsics.LJFF(this.LIZ, c1848840yDC.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1848840yDC.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        return "InitializeParam(storageService=" + this.LIZ + ", jsApiCenter=" + this.LIZIZ + ")";
    }

    public C1848840yDC(C1848740yD2 c1848740yD2, C21346018gE c21346018gE) {
        this.LIZ = c1848740yD2;
        this.LIZIZ = c21346018gE;
    }
}
