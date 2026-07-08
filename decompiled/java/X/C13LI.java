package X;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.13LI, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13LI {
    public static C13LH LIZ(String str) {
        boolean z;
        String str2;
        String str3;
        C13LH c13lh = C13LJ.LJIIIZ.get(str);
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getRecordFromMd5 queryMd5=");
        sbLIZ.append(str);
        sbLIZ.append(" hit=");
        if (c13lh != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" hitResourceKey=");
        String str4 = null;
        if (c13lh != null) {
            str2 = c13lh.LIZ;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        sbLIZ.append(" hitMd5=");
        if (c13lh != null) {
            str3 = c13lh.LIZIZ;
        } else {
            str3 = null;
        }
        sbLIZ.append(str3);
        sbLIZ.append(" hitExt=");
        if (c13lh != null) {
            str4 = c13lh.LIZJ;
        }
        sbLIZ.append(str4);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LIZ("MaterialResCache", strLIZIZ);
        return c13lh;
    }

    public static C13LH LIZIZ(String str) {
        boolean z;
        String str2;
        Boolean boolValueOf;
        C13LH c13lh = C13LJ.LJIIJ.get(str);
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getRecordFromResourceKey resourceKey=");
        sbLIZ.append(str);
        sbLIZ.append(" hit=");
        if (c13lh != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" hitMd5=");
        Integer num = null;
        if (c13lh != null) {
            str2 = c13lh.LIZIZ;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        sbLIZ.append(" isAssetMaterial=");
        if (c13lh != null) {
            boolValueOf = Boolean.valueOf(c13lh.LIZLLL);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(" assetType=");
        if (c13lh != null) {
            num = c13lh.LJ;
        }
        sbLIZ.append(num);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LIZ("MaterialResCache", strLIZIZ);
        return c13lh;
    }

    public static void LIZJ(String str, Integer num, String str2, boolean z, String str3) {
        String strLJI = C19995213Li.LJI(str, str3);
        String lowerCase = str3.toLowerCase(Locale.ROOT);
        C13LH c13lh = new C13LH(str2, num, strLJI, z, lowerCase);
        if (strLJI.length() > 0) {
            C13LJ.LJIIIZ.put(strLJI, c13lh);
        }
        if (str.length() > 0) {
            C13LJ.LJIIIZ.put(str, c13lh);
        }
        if (lowerCase.length() > 0 && strLJI.length() > 0) {
            ConcurrentHashMap<String, C13LH> concurrentHashMap = C13LJ.LJIIIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJI);
            sbLIZ.append('_');
            sbLIZ.append(lowerCase);
            concurrentHashMap.put(C2188811AlT.LIZIZ(sbLIZ), c13lh);
        }
        C13LJ.LJIIJ.put(str2, c13lh);
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateInMemoryCache resourceKey=");
        sbLIZ2.append(str2);
        sbLIZ2.append(" inputMd5=");
        sbLIZ2.append(str);
        sbLIZ2.append(" normalizedMd5=");
        sbLIZ2.append(strLJI);
        sbLIZ2.append(" ext=");
        sbLIZ2.append(lowerCase);
        sbLIZ2.append(" isAssetMaterial=");
        sbLIZ2.append(z);
        sbLIZ2.append(" assetType=");
        sbLIZ2.append(num);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        c13ss.getClass();
        C13SS.LIZ("MaterialResCache", strLIZIZ);
    }
}
