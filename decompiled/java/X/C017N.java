package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.017N, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C017N extends AbstractC401801hI {
    public final String LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C017N)) {
            return false;
        }
        C017N c017n = (C017N) obj;
        return Intrinsics.LJFF(this.LIZ, c017n.LIZ) && this.LIZIZ == c017n.LIZIZ && Intrinsics.LJFF(this.LIZJ, c017n.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchStickerError(keyword=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", byNeedMore=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", searchId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C017N(String str, boolean z, String str2) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = str2;
    }
}
