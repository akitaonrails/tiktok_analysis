package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EC6, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EC6 {
    public final String LIZ;
    public final String LIZIZ;

    public C0EC6() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0EC6)) {
            return false;
        }
        C0EC6 c0ec6 = (C0EC6) obj;
        return Intrinsics.LJFF(this.LIZ, c0ec6.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0ec6.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditorProMusicMobBean(fromLocation=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0EC6(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
