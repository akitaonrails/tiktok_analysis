package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0N8f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C588990N8f {
    public static final String LIZ(C622570ObP c622570ObP) {
        String str;
        String strLJJLIIIJ;
        String str2 = "";
        if (c622570ObP == null) {
            return "";
        }
        String str3 = (String) C13LP.LJJJLL(c622570ObP.LJII);
        if (str3 == null) {
            str3 = "";
        }
        if (!c622570ObP.LJIILIIL ? (str = (String) C13LP.LJJJLL(c622570ObP.LJIIIZ)) != null : (str = (String) C13LP.LJJJLL(c622570ObP.LJIIJJI)) != null) {
            str2 = str;
        }
        String strLIZ = c622570ObP.LIZ();
        if (c622570ObP.LJIILIIL) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(c622570ObP.LJIIJJI, ",", null, null, 0, null, null, 62);
        } else {
            strLJJLIIIJ = C13LP.LJJLIIIJ(c622570ObP.LJIIIZ, ",", null, null, 0, null, null, 62);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("itemIds=");
        sbLIZ.append(str3);
        sbLIZ.append(';');
        sbLIZ.append(str2);
        sbLIZ.append("&beforeItemIds=");
        sbLIZ.append(strLIZ);
        sbLIZ.append("&afterItemIds=");
        sbLIZ.append(strLJJLIIIJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LIZIZ(C1023640ckE c1023640ckE, C622570ObP c622570ObP) {
        String strLJJLIIIJ;
        String strLJJLIIIJ2;
        String str;
        if (c622570ObP == null) {
            return;
        }
        String strLIZ = c622570ObP.LIZ();
        String strLJJLIIIJ3 = C13LP.LJJLIIIJ(c622570ObP.LJIIIIZZ, ",", null, null, 0, null, null, 62);
        if (c622570ObP.LJIILIIL) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(c622570ObP.LJIIJJI, ",", null, null, 0, null, null, 62);
        } else {
            strLJJLIIIJ = C13LP.LJJLIIIJ(c622570ObP.LJIIIZ, ",", null, null, 0, null, null, 62);
        }
        if (c622570ObP.LJIILIIL) {
            strLJJLIIIJ2 = C13LP.LJJLIIIJ(c622570ObP.LJIIL, ",", null, null, 0, null, null, 62);
        } else {
            strLJJLIIIJ2 = C13LP.LJJLIIIJ(c622570ObP.LJIIJ, ",", null, null, 0, null, null, 62);
        }
        boolean z = !c622570ObP.LJIILIIL;
        C622550ObN.LIZ(c622570ObP, new Pair(strLIZ, strLJJLIIIJ));
        C1010080cOM.LIZ.getClass();
        c1023640ckE.withParam(C1010080cOM.LIZIZ, strLIZ);
        c1023640ckE.withParam(C1010080cOM.LIZJ, strLJJLIIIJ3);
        c1023640ckE.withParam(C1010080cOM.LIZLLL, strLJJLIIIJ);
        c1023640ckE.withParam(C1010080cOM.LJ, strLJJLIIIJ2);
        C1002190cBd c1002190cBd = C1010080cOM.LJII;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c1023640ckE.withParam(c1002190cBd, str);
        Pair pairLIZIZ = C622550ObN.LIZIZ(c622570ObP);
        if (pairLIZIZ != null) {
            Object first = pairLIZIZ.getFirst();
            Object second = pairLIZIZ.getSecond();
            c1023640ckE.withParam(C1010080cOM.LJFF, first);
            c1023640ckE.withParam(C1010080cOM.LJI, second);
        }
    }
}
