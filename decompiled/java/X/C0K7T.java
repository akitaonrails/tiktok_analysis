package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K7T, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K7T implements InterfaceC512170K6t {
    public final String LIZ;
    public final Long LIZIZ;
    public final Long LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0K7T)) {
            return false;
        }
        C0K7T c0k7t = (C0K7T) obj;
        return Intrinsics.LJFF(this.LIZ, c0k7t.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0k7t.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0k7t.LIZJ) && this.LIZLLL == c0k7t.LIZLLL;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Long l = this.LIZIZ;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.LIZJ;
        return ((iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubSpaceEditorActionEvent(action=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", postId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", commentId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mode=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0K7T(String str, Long l, Long l2, int i) {
        this.LIZ = str;
        this.LIZIZ = l;
        this.LIZJ = l2;
        this.LIZLLL = i;
    }

    public /* synthetic */ C0K7T(String str, Long l, Long l2, int i, int i2) {
        this(str, (i2 & 2) != 0 ? null : l, (i2 & 4) != 0 ? null : l2, (i2 & 8) != 0 ? 0 : i);
    }
}
