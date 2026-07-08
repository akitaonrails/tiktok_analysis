package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yE2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1849360yE2 {
    public final C1849210yDn LIZ;
    public final InterfaceC1525090pn1 LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1849360yE2)) {
            return false;
        }
        C1849360yE2 c1849360yE2 = (C1849360yE2) obj;
        return Intrinsics.LJFF(this.LIZ, c1849360yE2.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1849360yE2.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        return "InitializeParam(storageService=" + this.LIZ + ", jsApiCenter=" + this.LIZIZ + ")";
    }

    public C1849360yE2(C1849210yDn c1849210yDn, C21346018gE c21346018gE) {
        this.LIZ = c1849210yDn;
        this.LIZIZ = c21346018gE;
    }
}
