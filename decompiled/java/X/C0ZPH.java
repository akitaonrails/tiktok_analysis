package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZPH, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZPH {
    public static final C0ZPH LIZJ = new C0ZPH(false, null);
    public final boolean LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZPH)) {
            return false;
        }
        C0ZPH c0zph = (C0ZPH) obj;
        return this.LIZ == c0zph.LIZ && Intrinsics.LJFF(this.LIZIZ, c0zph.LIZIZ);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        String str = this.LIZIZ;
        return iZ2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryPreloadActiveState(active=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", deactivateReason=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZPH(boolean z, String str) {
        this.LIZ = z;
        this.LIZIZ = str;
    }
}
