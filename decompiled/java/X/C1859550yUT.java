package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yUT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1859550yUT {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final InterfaceC1859200yTu LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1859550yUT)) {
            return false;
        }
        C1859550yUT c1859550yUT = (C1859550yUT) obj;
        return this.LIZ == c1859550yUT.LIZ && this.LIZIZ == c1859550yUT.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1859550yUT.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1859550yUT.LIZLLL) && Intrinsics.LJFF(this.LJ, c1859550yUT.LJ);
    }

    public C1859550yUT(int i, int i2, String str, String str2, InterfaceC1859200yTu interfaceC1859200yTu) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = interfaceC1859200yTu;
    }
}
