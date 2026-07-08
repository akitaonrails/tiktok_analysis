package X;

import android.content.Context;
import android.content.res.Resources;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.16El, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20741716El {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(265));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(266));

    public static String LIZIZ(String str) {
        String string;
        Integer numLIZ;
        Context contextLIZIZ = C14P7.LIZIZ();
        if (str != null) {
            string = a0.LJLIIIL(str).toString();
        } else {
            string = null;
        }
        if (!Intrinsics.LJFF(string, "dark")) {
            if (!Intrinsics.LJFF(string, "light") && contextLIZIZ != null && (numLIZ = C1308910kAL.LIZ(R.attr.g0d, contextLIZIZ)) != null && numLIZ.intValue() == 0) {
                return "Dark";
            }
            return "Light";
        }
        return "Dark";
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int LJ(String str) {
        if (str == null) {
            return 41;
        }
        switch (str.hashCode()) {
            case -2075419153:
                if (!str.equals("P3_Semibold")) {
                    return 41;
                }
                return 72;
            case -1878905648:
                if (!str.equals("P2_Semibold")) {
                    return 41;
                }
                return 62;
            case -1687436011:
                if (!str.equals("LargeTitle_Semibold")) {
                    return 41;
                }
                return 122;
            case -1682392143:
                if (!str.equals("P1_Semibold")) {
                    return 41;
                }
                return 52;
            case -1401011141:
                if (!str.equals("SmallText2_Regular")) {
                    return 41;
                }
                return 91;
            case -781223674:
                if (!str.equals("H4_Semibold")) {
                    return 41;
                }
                return 42;
            case -628105945:
                if (!str.equals("H2_Regular")) {
                    return 41;
                }
                return 21;
            case -584710169:
                if (!str.equals("H3_Semibold")) {
                    return 41;
                }
                return 32;
            case -521510333:
                if (!str.equals("P1_Bold")) {
                    return 41;
                }
                return 53;
            case -492881182:
                if (!str.equals("P2_Bold")) {
                    return 41;
                }
                return 63;
            case -464252031:
                if (!str.equals("P3_Bold")) {
                    return 41;
                }
                return 73;
            case -392759522:
                if (!str.equals("P1_Regular")) {
                    return 41;
                }
                return 51;
            case -388196664:
                if (!str.equals("H2_Semibold")) {
                    return 41;
                }
                return 22;
            case -191683159:
                if (!str.equals("H1_Semibold")) {
                    return 41;
                }
                return 12;
            case 51952425:
                str.equals("H4_Regular");
                return 41;
            case 287298848:
                if (!str.equals("P3_Regular")) {
                    return 41;
                }
                return 71;
            case 406443322:
                if (!str.equals("SmallText1_Regular")) {
                    return 41;
                }
                return 81;
            case 968394811:
                if (!str.equals("H1_Bold")) {
                    return 41;
                }
                return 13;
            case 997023962:
                if (!str.equals("H2_Bold")) {
                    return 41;
                }
                return 23;
            case 1025653113:
                if (!str.equals("H3_Bold")) {
                    return 41;
                }
                return 33;
            case 1054282264:
                if (!str.equals("H4_Bold")) {
                    return 41;
                }
                return 43;
            case 1179348518:
                if (!str.equals("H1_Regular")) {
                    return 41;
                }
                return 11;
            case 1421546036:
                if (!str.equals("SmallText2_Semibold")) {
                    return 41;
                }
                return 92;
            case 1618059541:
                if (!str.equals("SmallText1_Semibold")) {
                    return 41;
                }
                return 82;
            case 1721080231:
                if (!str.equals("SmallText1_Bold")) {
                    return 41;
                }
                return 83;
            case 1749709382:
                if (!str.equals("SmallText2_Bold")) {
                    return 41;
                }
                return 93;
            case 1859406888:
                if (!str.equals("H3_Regular")) {
                    return 41;
                }
                return 31;
            case 2094753311:
                if (!str.equals("P2_Regular")) {
                    return 41;
                }
                return 61;
            default:
                return 41;
        }
    }

    public static Integer LIZ(String str, String str2) {
        Context contextLIZIZ = C14P7.LIZIZ();
        if (contextLIZIZ == null || str == null || str.length() == 0) {
            return null;
        }
        String strLIZIZ = LIZIZ(str2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(strLIZIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        C01GW c01gw = C07EB.LIZ;
        if (((Number) c01gw.getValue()).intValue() == 1) {
            C01GW c01gw2 = LIZ;
            if (((C13M5) c01gw2.getValue()).LIZIZ.get(strLIZIZ2) != null) {
                return (Integer) ((C13M5) c01gw2.getValue()).LIZIZ.get(strLIZIZ2);
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("tux://color?token=");
        sbLIZ2.append(str);
        sbLIZ2.append("&from=search-top1_nimble_card&theme=");
        sbLIZ2.append(strLIZIZ);
        Integer numLJ = C2248361CzK.LJ(contextLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
        if (((Number) c01gw.getValue()).intValue() == 1) {
            ((C13M5) LIZ.getValue()).LIZ(strLIZIZ2, numLJ);
        }
        return numLJ;
    }

    public static String LIZLLL(String str, List list) {
        Object obj;
        Resources resources;
        Resources resources2;
        Object objLJJJLL;
        int iIntValue;
        Resources resources3;
        Object[] array;
        Integer num;
        Resources resources4;
        Map map = (Map) C20742516Et.LIZ.getValue();
        if (map != null && map.containsKey(str)) {
            obj = map.get(str);
        } else {
            obj = null;
        }
        Pair pair = (Pair) obj;
        if (pair == null) {
            return null;
        }
        int iIntValue2 = ((Number) pair.getFirst()).intValue();
        int i = C20742316Er.LIZ[((EnumC20742416Es) pair.getSecond()).ordinal()];
        if (i != 1) {
            if (i != 2) {
                Context contextLIZIZ = C14P7.LIZIZ();
                if (contextLIZIZ == null || (resources4 = contextLIZIZ.getResources()) == null) {
                    return null;
                }
                return resources4.getString(iIntValue2);
            }
            if (list != null) {
                objLJJJLL = C13LP.LJJJLL(list);
            } else {
                objLJJJLL = null;
            }
            if ((objLJJJLL instanceof Integer) && (num = (Integer) objLJJJLL) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            Context contextLIZIZ2 = C14P7.LIZIZ();
            if (contextLIZIZ2 == null || (resources3 = contextLIZIZ2.getResources()) == null) {
                return null;
            }
            if (list == null || (array = list.toArray(new Object[0])) == null) {
                array = new Object[0];
            }
            return resources3.getQuantityString(iIntValue2, iIntValue, Arrays.copyOf(array, array.length));
        }
        if (list != null && !list.isEmpty()) {
            Context contextLIZIZ3 = C14P7.LIZIZ();
            if (contextLIZIZ3 == null || (resources2 = contextLIZIZ3.getResources()) == null) {
                return null;
            }
            Object[] array2 = list.toArray(new Object[0]);
            return resources2.getString(iIntValue2, Arrays.copyOf(array2, array2.length));
        }
        Context contextLIZIZ4 = C14P7.LIZIZ();
        if (contextLIZIZ4 == null || (resources = contextLIZIZ4.getResources()) == null) {
            return null;
        }
        return resources.getString(iIntValue2);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce A[PHI: r0
      0x00ce: PHI (r0v23 java.lang.Integer) = (r0v22 java.lang.Integer), (r0v28 java.lang.Integer) binds: [B:29:0x00b0, B:33:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C698190Ra5 LIZJ(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20741716El.LIZJ(java.lang.String, java.lang.String, java.lang.String):X.0Ra5");
    }
}
