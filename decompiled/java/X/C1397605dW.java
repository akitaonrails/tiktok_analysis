package X;

import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import com.ss.android.ugc.aweme.im.b2c.actionbar.ActionBarButtonConfBusiness;
import java.util.List;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.05dW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1397605dW {
    public static String LIZIZ(C1422405hW c1422405hW) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sections=");
        sbLIZ.append(LJFF(10, c1422405hW.LIZJ));
        sbLIZ.append(", items=");
        sbLIZ.append(LIZJ(10, c1422405hW.LIZIZ));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final String LIZLLL(AbstractC677870QiP abstractC677870QiP) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{itemId=");
        sbLIZ.append(abstractC677870QiP.LIZJ);
        sbLIZ.append(",bizType=");
        sbLIZ.append(abstractC677870QiP.LIZIZ);
        sbLIZ.append(",techType=");
        sbLIZ.append(abstractC677870QiP.LIZ);
        sbLIZ.append(",sectionId=");
        sbLIZ.append(abstractC677870QiP.LIZLLL);
        sbLIZ.append(",lynxKey=");
        sbLIZ.append(LJ(abstractC677870QiP, "lynx_card_key"));
        sbLIZ.append(",height=");
        sbLIZ.append(LJ(abstractC677870QiP, "height"));
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZ(List list, List list2) {
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LP.LJJLIIIJ(C13LP.LL(list2, 10), null, "{", "}", 0, null, new AwS581S0100000_2(list, (List<ActionBarButtonConfBusiness>) 371), 25));
        if (list2.size() > 10) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(",total=");
            sbLIZ2.append(list2.size());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            strLIZIZ = "";
        }
        sbLIZ.append(strLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final String LIZJ(int i, List list) {
        String strLJJLIIIJ = C13LP.LJJLIIIJ(C13LP.LL(list, i), null, e3.e, e3.f, 0, null, AFwS229S0000000_2.get$arr$(562), 25);
        if (list.size() > i) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJJLIIIJ);
            sbLIZ.append(",total=");
            sbLIZ.append(list.size());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return strLJJLIIIJ;
    }

    public static final String LJ(AbstractC677870QiP abstractC677870QiP, String str) {
        n nVar;
        k kVarLJJIIZ;
        k kVar = abstractC677870QiP.LJFF;
        if (kVar instanceof n) {
            nVar = (n) kVar;
        } else {
            nVar = null;
        }
        if (nVar == null || (kVarLJJIIZ = nVar.LJJIIZ(str)) == null) {
            return "";
        }
        if (kVarLJJIIZ instanceof q) {
            return kVarLJJIIZ.LJIILJJIL().LJIL();
        }
        return kVarLJJIIZ.toString();
    }

    public static final String LJFF(int i, List list) {
        String strLJJLIIIJ = C13LP.LJJLIIIJ(C13LP.LL(list, i), null, e3.e, e3.f, 0, null, AFwS229S0000000_2.get$arr$(561), 25);
        if (list.size() > i) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJJLIIIJ);
            sbLIZ.append(",total=");
            sbLIZ.append(list.size());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return strLJJLIIIJ;
    }
}
