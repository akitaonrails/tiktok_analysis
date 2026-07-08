package X;

/* JADX INFO: renamed from: X.0png, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1525500png {
    public boolean LIZ;
    public final String LIZIZ;
    public String LIZJ;
    public long LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PatchResult(success=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", data=~~~, errMsg=");
        sbLIZ.append((Object) this.LIZJ);
        sbLIZ.append(", timeConsumed=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1525500png(boolean z, String str, String str2, int i) {
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? "" : str2;
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = 0L;
    }
}
