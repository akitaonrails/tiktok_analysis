package X;

/* JADX INFO: renamed from: X.0kNu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1317320kNu {
    public final C1317410kO3 LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final int LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{type='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("', position=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", key='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append("'}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1317320kNu(C1317410kO3 c1317410kO3, String str) {
        this.LIZ = c1317410kO3;
        this.LIZIZ = str;
        this.LIZJ = c1317410kO3.getLayoutPosition();
        C1314690kJf c1314690kJf = c1317410kO3.LL.LLILLJJLI;
        if (c1314690kJf != null) {
            this.LIZLLL = c1314690kJf.LLLLZI;
            this.LJ = c1314690kJf.LLJJ;
        }
    }
}
