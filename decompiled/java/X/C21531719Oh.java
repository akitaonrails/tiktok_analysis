package X;

/* JADX INFO: renamed from: X.19Oh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21531719Oh implements Comparable {
    public C21531519Of LL;
    public final /* synthetic */ C21531419Oe LLILLJJLI;

    public final String toString() {
        String strLIZIZ = "[ ";
        if (this.LL != null) {
            int i = 0;
            do {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(this.LL.LJIIIIZZ[i]);
                sbLIZ.append(" ");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                i++;
            } while (i < 9);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append("] ");
        sbLIZ2.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public C21531719Oh(C21531419Oe c21531419Oe) {
        this.LLILLJJLI = c21531419Oe;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.LL.LIZJ - ((C21531519Of) obj).LIZJ;
    }
}
