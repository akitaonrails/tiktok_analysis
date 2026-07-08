package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04FY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04FY {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Integer LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C04FY)) {
            return false;
        }
        C04FY c04fy = (C04FY) obj;
        return Intrinsics.LJFF(this.LIZ, c04fy.LIZ) && Intrinsics.LJFF(this.LIZIZ, c04fy.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c04fy.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c04fy.LIZLLL) && Intrinsics.LJFF(this.LJ, c04fy.LJ);
    }

    public /* synthetic */ C04FY(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, null);
    }

    public C04FY(String str, String str2, String str3, String str4, Integer num) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = num;
    }
}
