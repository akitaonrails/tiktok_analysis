package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15i0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20592615i0 {
    public static final C20592615i0 LIZIZ = new C20592615i0(0);
    public static final C20592615i0 LIZJ = new C20592615i0(1);
    public static final C20592615i0 LIZLLL = new C20592615i0(2);
    public final int LIZ;

    public final String toString() {
        String str = Intrinsics.LJFF(this, LIZIZ) ? "COMPACT" : Intrinsics.LJFF(this, LIZJ) ? "MEDIUM" : Intrinsics.LJFF(this, LIZLLL) ? "EXPANDED" : "UNKNOWN";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WindowWidthSizeClass: ");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public C20592615i0(int i) {
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
        if (Intrinsics.LJFF(C20592615i0.class, cls) && this.LIZ == ((C20592615i0) obj).LIZ) {
            return true;
        }
        return false;
    }
}
