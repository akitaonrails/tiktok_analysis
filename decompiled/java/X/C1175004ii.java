package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04ii, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1175004ii {
    public final String LIZ;
    public final String LIZIZ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1175004ii)) {
            return false;
        }
        C1175004ii c1175004ii = (C1175004ii) obj;
        return Intrinsics.LJFF(this.LIZ, c1175004ii.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1175004ii.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EmojiUiItem(displayText=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", shortcut=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1175004ii(String str) {
        this.LIZ = str;
    }
}
