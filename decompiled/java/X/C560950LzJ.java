package X;

/* JADX INFO: renamed from: X.0LzJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C560950LzJ {
    public final String LIZ;
    public final String LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftDeleteExtraInfo(scene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", deleteScene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C560950LzJ(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }

    public /* synthetic */ C560950LzJ(String str, String str2, int i) {
        this((i & 1) != 0 ? "un_know" : str, (i & 2) != 0 ? "un_know" : str2);
    }
}
