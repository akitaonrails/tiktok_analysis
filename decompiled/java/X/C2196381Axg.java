package X;

import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.NetworkResponse;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.1Axg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2196381Axg {
    public static final /* synthetic */ int LIZ = 0;

    public static Integer LIZ(C2196371Axf c2196371Axf, NetworkResponse networkResponse) {
        Integer num;
        if (!C297070Bkf.LIZ() || networkResponse == null || (num = networkResponse.errorCode) == null) {
            return null;
        }
        int iIntValue = num.intValue();
        C2196371Axf.Companion.getClass();
        if (!C2196371Axf.META_REVAMP_ERROR_CODES.contains(Integer.valueOf(iIntValue))) {
            return null;
        }
        if (c2196371Axf != null) {
            c2196371Axf.setNetError(networkResponse.netCode, networkResponse.netError);
        }
        return Integer.valueOf(iIntValue);
    }

    public static void LIZIZ(String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        String str6;
        EnumC1236600iHi enumC1236600iHi;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str3 != null && str3.length() > 0) {
            linkedHashMap.put("net_code", str3);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        MinisMetaResp minisMetaResp = C2195221Avo.LJIIJ;
        if (minisMetaResp == null || (str6 = minisMetaResp.minisCategory) == null || str6.length() <= 0) {
            if (z) {
                str6 = "mini_game";
            } else {
                str6 = "short_drama";
            }
        }
        linkedHashMap2.put("minis_category", str6);
        if (str5 != null && str5.length() > 0) {
            linkedHashMap2.put("flow_id", str5);
        }
        if (str4 != null && str4.length() > 0) {
            linkedHashMap2.put("net_error", C13LN.LJZL(100, str4));
        }
        C1232830iBd c1232830iBd = C1232830iBd.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("minis_client_entrance_");
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String strValueOf = String.valueOf(i);
        if (!(!linkedHashMap.isEmpty())) {
            linkedHashMap = null;
        }
        if (!(!linkedHashMap2.isEmpty())) {
            linkedHashMap2 = null;
        }
        if (z) {
            enumC1236600iHi = EnumC1236600iHi.AUTH_MINIGAME;
        } else {
            enumC1236600iHi = EnumC1236600iHi.AUTH_MINIS;
        }
        EnumC21632119lH enumC21632119lH = EnumC21632119lH.TTOP;
        EnumC19415410xc enumC19415410xc = EnumC19415410xc.MOBILE;
        c1232830iBd.getClass();
        C1232830iBd.LIZ(str, strLIZIZ, strValueOf, null, linkedHashMap, linkedHashMap2, enumC1236600iHi, enumC21632119lH, enumC19415410xc);
    }
}
