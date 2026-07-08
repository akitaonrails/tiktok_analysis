package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18l0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21375618l0 {
    public final EnumC1779610wPX LIZ;
    public final AbstractC1784370wXD LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final int LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21375618l0)) {
            return false;
        }
        C21375618l0 c21375618l0 = (C21375618l0) obj;
        return this.LIZ == c21375618l0.LIZ && Intrinsics.LJFF(this.LIZIZ, c21375618l0.LIZIZ) && this.LIZJ == c21375618l0.LIZJ && this.LIZLLL == c21375618l0.LIZLLL && this.LJ == c21375618l0.LJ;
    }

    public C21375618l0(EnumC1779610wPX enumC1779610wPX, AbstractC1784370wXD abstractC1784370wXD, boolean z, boolean z2, int i, int i2) {
        z = (i2 & 4) != 0 ? false : z;
        z2 = (i2 & 8) != 0 ? false : z2;
        i = (i2 & 16) != 0 ? 0 : i;
        this.LIZ = enumC1779610wPX;
        this.LIZIZ = abstractC1784370wXD;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = i;
    }
}
