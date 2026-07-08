package X;

/* JADX INFO: renamed from: X.0yYk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862200yYk {
    public int LIZ = 0;
    public int LIZIZ = -1;
    public String LIZJ = "";

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HttpError(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(String str) {
        if (str == null) {
            str = "";
        }
        this.LIZJ = str;
    }
}
