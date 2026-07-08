package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OQJ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OQJ {
    public final String LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final String LJ;

    public final int hashCode() {
        return (((((((this.LIZIZ * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + this.LIZ.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0OQJ)) {
            return false;
        }
        return Intrinsics.LJFF(this.LIZ, ((C0OQJ) obj).LIZ);
    }

    public C0OQJ(String str, int i, String str2, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = str2;
    }
}
