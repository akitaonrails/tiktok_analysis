package X;

/* JADX INFO: renamed from: X.0wKU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1776480wKU {
    public final EnumC1778520wNm LIZ;
    public final EnumC320480ChK LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1776480wKU)) {
            return false;
        }
        C1776480wKU c1776480wKU = (C1776480wKU) obj;
        return this.LIZ == c1776480wKU.LIZ && this.LIZIZ == c1776480wKU.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoDuplicateDecision(entryType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", conversationType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1776480wKU(EnumC1778520wNm enumC1778520wNm, EnumC320480ChK enumC320480ChK) {
        this.LIZ = enumC1778520wNm;
        this.LIZIZ = enumC320480ChK;
    }
}
