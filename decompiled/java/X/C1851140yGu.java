package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yGu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1851140yGu {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1851140yGu)) {
            return false;
        }
        C1851140yGu c1851140yGu = (C1851140yGu) obj;
        return Intrinsics.LJFF(this.LIZ, c1851140yGu.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1851140yGu.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1851140yGu.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1851140yGu.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MAEDraftItem(templateName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", zipUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", videoType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1851140yGu(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }
}
