package X;

/* JADX INFO: renamed from: X.0iVO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1245080iVO {
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Boolean LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeleteData(isSuccess=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", deleteNid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", deleteUid=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", hasRead=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1245080iVO(Boolean bool, boolean z, String str, String str2, int i) {
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        bool = (i & 8) != 0 ? null : bool;
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = bool;
    }
}
