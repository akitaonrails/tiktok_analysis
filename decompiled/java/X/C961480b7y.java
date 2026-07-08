package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0b7y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C961480b7y {
    public final int LIZ;
    public final long LIZIZ;
    public final boolean LIZJ;
    public final long LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public long LJII = -1;

    public final int hashCode() {
        return (((((((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ.hashCode();
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(C961480b7y.class, cls)) {
            return false;
        }
        C961480b7y c961480b7y = (C961480b7y) obj;
        if (this.LIZ == c961480b7y.LIZ && this.LIZIZ == c961480b7y.LIZIZ && this.LIZJ == c961480b7y.LIZJ && this.LIZLLL == c961480b7y.LIZLLL && Intrinsics.LJFF(this.LJ, c961480b7y.LJ)) {
            return true;
        }
        return false;
    }

    public C961480b7y(int i, long j, boolean z, long j2, String str, String str2, String str3) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = z;
        this.LIZLLL = j2;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = str3;
    }
}
