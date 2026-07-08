package X;

/* JADX INFO: renamed from: X.0ZvJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C915190ZvJ {
    public final String LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FromPage(fromPageStr=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isFromActivitySchema=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", forceUserFromPageValue=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C915190ZvJ(String str, boolean z, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, false);
    }

    public C915190ZvJ(String str, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
