package X;

import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13Pu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20006813Pu {
    public static final /* synthetic */ int LJI = 0;
    public final String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public int LJ = -1;
    public boolean LJFF;

    public final String LIZ() {
        String strLJI;
        String str = this.LIZLLL;
        if ((str == null || a0.LJJJIL(str)) && (strLJI = C13SB.LJI(this.LIZ)) != null) {
            this.LIZLLL = C20006413Pq.LIZIZ(strLJI);
        }
        return this.LIZLLL;
    }

    public final String LIZIZ() {
        String strLJI;
        String str = this.LIZIZ;
        if ((str == null || a0.LJJJIL(str)) && (strLJI = C13SB.LJI(this.LIZ)) != null) {
            this.LIZIZ = C20006413Pq.LIZLLL(strLJI);
        }
        return this.LIZIZ;
    }

    public final int LIZJ() {
        String strLJI;
        if (this.LJ == -1) {
            this.LJ = (!C13SB.LJ(this.LIZ) || (strLJI = C13SB.LJI(this.LIZ)) == null) ? 0 : C20006413Pq.LJ(strLJI);
        }
        return this.LJ;
    }

    public final String LIZLLL() {
        String strLJI;
        String str = this.LIZJ;
        if ((str == null || a0.LJJJIL(str)) && (strLJI = C13SB.LJI(this.LIZ)) != null) {
            a0.LJJJJI(strLJI, "/", 0, 6);
            int iLJJJJI = a0.LJJJJI(strLJI, "_v", 0, 6);
            this.LIZJ = iLJJJJI > 0 ? u.LJJI(strLJI.substring(iLJJJJI + 2, a0.LJJIIZI(strLJI, "size", false) ? a0.LJJJJI(strLJI, "_size", 0, 6) : a0.LJJJJI(strLJI, "_model", 0, 6)), '_', '.', false) : "1.0";
        }
        return this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalModelInfo{name=");
        sbLIZ.append(LIZIZ());
        sbLIZ.append("',version=");
        sbLIZ.append(LIZLLL());
        sbLIZ.append("',size=");
        sbLIZ.append(LIZJ());
        sbLIZ.append("'}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20006813Pu(String str) {
        this.LIZ = str;
    }
}
