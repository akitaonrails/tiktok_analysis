package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00qZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C204500qZ extends AbstractC399701gx {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C204500qZ) && Intrinsics.LJFF(this.LIZ, ((C204500qZ) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchStickerAction(keyword=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C204500qZ(String str) {
        this.LIZ = str;
    }
}
