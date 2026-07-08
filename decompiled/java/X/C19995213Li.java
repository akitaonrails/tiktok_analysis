package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.model.BaseInfo;
import com.ss.android.ugc.effectmanager.common.model.MaterialResource;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.13Li, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19995213Li {
    public static final Regex LIZ = new Regex("^[0-9a-fA-F]{32}$");

    public static String LIZIZ(String str) {
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(a0.LJL(LJIIIZ(str), e3.d, LJIIIZ(str)), new String[]{"_"}, 0, 6);
        if (listLJJLIIIJILLIZJL.size() > 2 && Intrinsics.LJFF(ListProtector.get(listLJJLIIIJILLIZJL, 0), "asset") && C2095008Iq.LJIIJJI((String) ListProtector.get(listLJJLIIIJILLIZJL, 1)) != null) {
            return C13LP.LJJLIIIJ(C13LP.LJJJJIZL(listLJJLIIIJILLIZJL, 2), "_", null, null, 0, null, null, 62);
        }
        return "";
    }

    public static String LIZJ(MaterialResource materialResource) {
        String ext;
        if (materialResource.isAssetMaterial()) {
            return LIZ(materialResource.getAssetType(), materialResource.getResourceKey());
        }
        String resourceKey = materialResource.getResourceKey();
        String uri = materialResource.getUri();
        BaseInfo baseInfo = materialResource.getBaseInfo();
        if (baseInfo != null) {
            ext = baseInfo.getExt();
        } else {
            ext = null;
        }
        String strLJII = LJII(ext);
        String strLJI = LJI(uri, strLJII);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(resourceKey);
        sbLIZ.append('_');
        sbLIZ.append(strLJI);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getCacheBaseName resourceKey=");
        sbLIZ2.append(resourceKey);
        sbLIZ2.append(" md5=");
        sbLIZ2.append(uri);
        sbLIZ2.append(" normalizedMd5=");
        sbLIZ2.append(strLJI);
        sbLIZ2.append(" ext=");
        sbLIZ2.append(strLJII);
        sbLIZ2.append(" baseName=");
        sbLIZ2.append(strLIZIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        c13ss.getClass();
        C13SS.LIZ("MaterialNameProcessor", strLIZIZ2);
        return strLIZIZ;
    }

    public static String LIZLLL(String str) {
        int iLJJJJI = a0.LJJJJI(str, e3.d, 0, 6);
        if (iLJJJJI >= 0) {
            return LJII(str.substring(iLJJJJI + 1));
        }
        Pair pairLJIIIIZZ = LJIIIIZZ(str);
        List list = (List) pairLJIIIIZZ.getFirst();
        int iIntValue = ((Number) pairLJIIIIZZ.getSecond()).intValue();
        if (iIntValue >= 0 && iIntValue < C1697810uHb.LJIIJ(list)) {
            return LJII((String) ListProtector.get(list, iIntValue + 1));
        }
        return "";
    }

    public static String LJ(MaterialResource materialResource) {
        String strLIZIZ;
        boolean z = false;
        String ext = null;
        if (materialResource.isAssetMaterial()) {
            Integer assetType = materialResource.getAssetType();
            String resourceKey = materialResource.getResourceKey();
            BaseInfo baseInfo = materialResource.getBaseInfo();
            if (baseInfo != null) {
                ext = baseInfo.getExt();
            }
            String strLIZ = LIZ(assetType, resourceKey);
            String strLJII = LJII(ext);
            if (strLJII.length() > 0 && !Intrinsics.LJFF(strLJII, "zip")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZ);
                sbLIZ.append('.');
                sbLIZ.append(strLJII);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return strLIZ;
        }
        String resourceKey2 = materialResource.getResourceKey();
        String uri = materialResource.getUri();
        BaseInfo baseInfo2 = materialResource.getBaseInfo();
        if (baseInfo2 != null) {
            ext = baseInfo2.getExt();
        }
        String strLJII2 = LJII(ext);
        String strLJI = LJI(uri, strLJII2);
        if (strLJII2 == null || strLJII2.length() == 0) {
            z = true;
        }
        if (!z && !Intrinsics.LJFF(strLJII2, "zip")) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(resourceKey2);
            sbLIZ2.append('_');
            sbLIZ2.append(strLJI);
            sbLIZ2.append('.');
            sbLIZ2.append(strLJII2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(resourceKey2);
            sbLIZ3.append('_');
            sbLIZ3.append(strLJI);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("getFullResourceName resourceKey=");
        sbLIZ4.append(resourceKey2);
        sbLIZ4.append(" md5=");
        sbLIZ4.append(uri);
        sbLIZ4.append(" normalizedMd5=");
        sbLIZ4.append(strLJI);
        sbLIZ4.append(" ext=");
        sbLIZ4.append(strLJII2);
        sbLIZ4.append(" fullName=");
        sbLIZ4.append(strLIZIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
        c13ss.getClass();
        C13SS.LIZ("MaterialNameProcessor", strLIZIZ2);
        return strLIZIZ;
    }

    public static boolean LJFF(String str) {
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(a0.LJL(LJIIIZ(str), e3.d, LJIIIZ(str)), new String[]{"_"}, 0, 6);
        if (listLJJLIIIJILLIZJL.size() <= 2 || !Intrinsics.LJFF(ListProtector.get(listLJJLIIIJILLIZJL, 0), "asset") || C2095008Iq.LJIIJJI((String) ListProtector.get(listLJJLIIIJILLIZJL, 1)) == null) {
            return false;
        }
        return true;
    }

    public static String LJII(String str) {
        if (str != null && str.length() != 0) {
            return a0.LJJJJZ(e3.d, a0.LJLIIIL(str).toString()).toLowerCase(Locale.ROOT);
        }
        return "";
    }

    public static Pair LJIIIIZZ(String str) {
        int iNextIndex;
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(a0.LJL(str, e3.d, str), new String[]{"_"}, 0, 6);
        ListIterator listIterator = listLJJLIIIJILLIZJL.listIterator(listLJJLIIIJILLIZJL.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (LIZ.matches((String) listIterator.previous())) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            } else {
                iNextIndex = -1;
                break;
            }
        }
        return new Pair(listLJJLIIIJILLIZJL, Integer.valueOf(iNextIndex));
    }

    public static String LJIIIZ(String str) {
        return a0.LJJJLL("_zip", str);
    }

    public static String LIZ(Integer num, String str) {
        int iIntValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("asset_");
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        sbLIZ.append(iIntValue);
        sbLIZ.append('_');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJI(String str, String str2) {
        boolean z;
        String strLJLL;
        String strLJII = LJII(str2);
        if (strLJII != null && strLJII.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && str.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('_');
            sbLIZ.append(strLJII);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (u.LJIIZILJ(str.toLowerCase(Locale.ROOT), strLIZIZ, false)) {
                strLJLL = C13LN.LJLL(strLIZIZ.length(), str);
            } else {
                strLJLL = str;
            }
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("normalizeMd5ForFileName inputMd5=");
            sbLIZ2.append(str);
            sbLIZ2.append(" ext=");
            sbLIZ2.append(strLJII);
            sbLIZ2.append(" normalizedMd5=");
            sbLIZ2.append(strLJLL);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c13ss.getClass();
            C13SS.LIZ("MaterialNameProcessor", strLIZIZ2);
            return strLJLL;
        }
        C13SS c13ss2 = C13SS.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("normalizeMd5ForFileName keep md5=");
        sbLIZ3.append(str);
        sbLIZ3.append(" ext=");
        sbLIZ3.append(strLJII);
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        c13ss2.getClass();
        C13SS.LIZ("MaterialNameProcessor", strLIZIZ3);
        return str;
    }
}
