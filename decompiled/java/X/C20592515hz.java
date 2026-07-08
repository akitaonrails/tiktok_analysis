package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15hz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20592515hz {
    public static final C20592515hz LIZIZ = new C20592515hz(0);
    public static final C20592515hz LIZJ = new C20592515hz(1);
    public static final C20592515hz LIZLLL = new C20592515hz(2);
    public final int LIZ;

    public final String toString() {
        String str = Intrinsics.LJFF(this, LIZIZ) ? "COMPACT" : Intrinsics.LJFF(this, LIZJ) ? "MEDIUM" : Intrinsics.LJFF(this, LIZLLL) ? "EXPANDED" : "UNKNOWN";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WindowHeightSizeClass: ");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public C20592515hz(int i) {
        this.LIZ = i;
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
        if (Intrinsics.LJFF(C20592515hz.class, cls) && this.LIZ == ((C20592515hz) obj).LIZ) {
            return true;
        }
        return false;
    }
}
