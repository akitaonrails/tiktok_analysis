package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.017T, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C017T extends AbstractC401801hI {
    public final String LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C017T)) {
            return false;
        }
        C017T c017t = (C017T) obj;
        return Intrinsics.LJFF(this.LIZ, c017t.LIZ) && this.LIZIZ == c017t.LIZIZ && Intrinsics.LJFF(this.LIZJ, c017t.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchStickerNoResult(keyword=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", byNeedMore=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", searchId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C017T(String str, boolean z, String str2) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = str2;
    }
}
