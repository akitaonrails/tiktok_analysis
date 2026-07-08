package X;

/* JADX INFO: renamed from: X.19Oo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21532419Oo {
    public C21537019Qi LIZ;
    public final /* synthetic */ C21536619Qe LIZIZ;

    public final String toString() {
        String strLIZIZ = "[ ";
        if (this.LIZ != null) {
            int i = 0;
            do {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(this.LIZ.LLIZLLLIL[i]);
                sbLIZ.append(" ");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                i++;
            } while (i < 9);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append("] ");
        sbLIZ2.append(this.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public C21532419Oo(C21536619Qe c21536619Qe) {
        this.LIZIZ = c21536619Qe;
    }
}
