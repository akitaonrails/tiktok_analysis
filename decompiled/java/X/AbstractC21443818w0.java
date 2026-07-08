package X;

/* JADX INFO: renamed from: X.18w0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21443818w0 {
    public static void LIZIZ(AbstractC21430218to abstractC21430218to, AbstractC21430218to abstractC21430218to2) {
        C21437418uy c21437418uy = null;
        C21437418uy c21437418uy2 = null;
        int length = 0;
        while (abstractC21430218to != null) {
            if (abstractC21430218to instanceof C21437418uy) {
                c21437418uy2 = (C21437418uy) abstractC21430218to;
                if (c21437418uy == null) {
                    c21437418uy = c21437418uy2;
                }
                length += c21437418uy2.LJFF.length();
            } else {
                LIZ(c21437418uy, c21437418uy2, length);
                c21437418uy = null;
                c21437418uy2 = null;
                length = 0;
            }
            if (abstractC21430218to == abstractC21430218to2) {
                break;
            } else {
                abstractC21430218to = abstractC21430218to.LJ;
            }
        }
        LIZ(c21437418uy, c21437418uy2, length);
    }

    public static void LIZ(C21437418uy c21437418uy, C21437418uy c21437418uy2, int i) {
        if (c21437418uy != null && c21437418uy2 != null && c21437418uy != c21437418uy2) {
            StringBuilder sb = new StringBuilder(i);
            sb.append(c21437418uy.LJFF);
            AbstractC21430218to abstractC21430218to = c21437418uy.LJ;
            AbstractC21430218to abstractC21430218to2 = c21437418uy2.LJ;
            while (abstractC21430218to != abstractC21430218to2) {
                sb.append(((C21437418uy) abstractC21430218to).LJFF);
                AbstractC21430218to abstractC21430218to3 = abstractC21430218to.LJ;
                abstractC21430218to.LJFF();
                abstractC21430218to = abstractC21430218to3;
            }
            c21437418uy.LJFF = sb.toString();
        }
    }
}
