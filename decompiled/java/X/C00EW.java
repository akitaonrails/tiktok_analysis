package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00EW, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00EW {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00EW)) {
            return false;
        }
        C00EW c00ew = (C00EW) obj;
        return Intrinsics.LJFF(this.LIZ, c00ew.LIZ) && Intrinsics.LJFF(this.LIZIZ, c00ew.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c00ew.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c00ew.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoPickTrackParams(creationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", shootWay=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", pickId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C00EW(String str, String str2, String str3) {
        this(str, str2, str3, "");
    }

    public C00EW(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }

    public static C00EW LIZ(C00EW c00ew, String str, String str2, int i) {
        String str3;
        String str4 = null;
        if ((i & 1) != 0) {
            str3 = c00ew.LIZ;
        } else {
            str3 = null;
        }
        if ((i & 2) != 0) {
            str4 = c00ew.LIZIZ;
        }
        if ((i & 4) != 0) {
            str = c00ew.LIZJ;
        }
        if ((i & 8) != 0) {
            str2 = c00ew.LIZLLL;
        }
        c00ew.getClass();
        return new C00EW(str3, str4, str, str2);
    }
}
