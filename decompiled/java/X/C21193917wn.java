package X;

import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.settings.SeaLiveLynxPinCardConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.BFFCardConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LynxCardInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopupCardBffData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: renamed from: X.17wn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21193917wn {
    public static final C21193917wn LIZ = new C21193917wn();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(169));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(959));
    public static Boolean LIZLLL;

    public static String LIZIZ(PopupCardVO popupCardVO) {
        String strLJIIIIZZ;
        if (popupCardVO == null) {
            return "{}";
        }
        if (LJI(popupCardVO).length() > 0) {
            String str = popupCardVO.popRespData;
            if (str == null) {
                String str2 = popupCardVO.oecInitData;
                if (str2 == null) {
                    return "{}";
                }
                return str2;
            }
            return str;
        }
        Object obj = popupCardVO.rawResponse;
        if (obj == null || (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(obj)) == null) {
            return "{}";
        }
        return strLJIIIIZZ;
    }

    public static Pair LIZJ(PopupCardVO popupCardVO) {
        if (popupCardVO == null) {
            return new Pair(Boolean.FALSE, "");
        }
        String strLJI = LJI(popupCardVO);
        if (C123100dR.LIZ(strLJI)) {
            return new Pair(Boolean.TRUE, strLJI);
        }
        return new Pair(Boolean.FALSE, "");
    }

    public static Map LIZLLL(Integer num) {
        String str;
        SeaLiveLynxPinCardConfig seaLiveLynxPinCardConfig;
        HashMap map = new HashMap();
        map.put("is_lynx_offline", LIZLLL);
        Map map2 = (Map) LIZJ.getValue();
        if (map2 != null && (seaLiveLynxPinCardConfig = (SeaLiveLynxPinCardConfig) map2.get(String.valueOf(num))) != null) {
            str = seaLiveLynxPinCardConfig.schema;
        } else {
            str = null;
        }
        if (C123100dR.LIZ(str)) {
            map.put("is_lynx", Boolean.TRUE);
            map.put("schema", str);
            return map;
        }
        map.put("is_lynx", Boolean.FALSE);
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJ(com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp r3) {
        /*
            if (r3 == 0) goto Le
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopupCardBffData r0 = r3.bffData
            if (r0 == 0) goto Le
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.BFFCardConfig r0 = r0.cardConfig
            if (r0 == 0) goto Le
            java.lang.String r2 = r0.cardSchema
            if (r2 != 0) goto L1b
        Le:
            r2 = 0
            if (r3 == 0) goto L1b
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LynxCardInfo r0 = r3.lynxCardInfo
            if (r0 == 0) goto L2b
            java.lang.String r0 = r0.lynxCardSchema
            if (r0 != 0) goto L29
            if (r3 != 0) goto L2b
        L1b:
            r1 = 1
            if (r2 == 0) goto L27
            int r0 = r2.length()
            if (r0 == 0) goto L27
            r0 = 0
        L25:
            r1 = r1 ^ r0
            return r1
        L27:
            r0 = 1
            goto L25
        L29:
            r2 = r0
            goto L1b
        L2b:
            int r0 = r3.cardType
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = LJII(r0)
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21193917wn.LJ(com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJFF(com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO r2) {
        /*
            if (r2 == 0) goto Le
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopupCardBffData r0 = r2.bffData
            if (r0 == 0) goto Le
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.BFFCardConfig r0 = r0.cardConfig
            if (r0 == 0) goto Le
            java.lang.String r0 = r0.cardSchema
            if (r0 != 0) goto L1b
        Le:
            r0 = 0
            if (r2 == 0) goto L1b
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LynxCardInfo r1 = r2.lynxCardInfo
            if (r1 == 0) goto L2b
            java.lang.String r1 = r1.lynxCardSchema
            if (r1 != 0) goto L29
            if (r2 != 0) goto L2b
        L1b:
            r1 = 1
            if (r0 == 0) goto L27
            int r0 = r0.length()
            if (r0 == 0) goto L27
            r0 = 0
        L25:
            r1 = r1 ^ r0
            return r1
        L27:
            r0 = 1
            goto L25
        L29:
            r0 = r1
            goto L1b
        L2b:
            int r0 = r2.cardType
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = LJII(r0)
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21193917wn.LJFF(com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO):boolean");
    }

    public static String LJI(PopupCardVO popupCardVO) {
        String str;
        BFFCardConfig bFFCardConfig;
        String str2;
        if (popupCardVO == null) {
            return "";
        }
        PopupCardBffData popupCardBffData = popupCardVO.bffData;
        if (popupCardBffData != null && (bFFCardConfig = popupCardBffData.cardConfig) != null && (str2 = bFFCardConfig.cardSchema) != null && str2.length() > 0) {
            return str2;
        }
        String str3 = popupCardVO.lynxCardSchema;
        if (str3 != null && str3.length() > 0) {
            return str3;
        }
        LynxCardInfo lynxCardInfo = popupCardVO.lynxCardInfo;
        if (lynxCardInfo != null && (str = lynxCardInfo.lynxCardSchema) != null && str.length() > 0) {
            return str;
        }
        String strLJII = LJII(Integer.valueOf(popupCardVO.cardType));
        if (strLJII == null) {
            return "";
        }
        return strLJII;
    }

    public static String LJII(Integer num) {
        SeaLiveLynxPinCardConfig seaLiveLynxPinCardConfig;
        String str;
        Map map = (Map) LIZJ.getValue();
        if (map != null && (seaLiveLynxPinCardConfig = (SeaLiveLynxPinCardConfig) map.get(String.valueOf(num))) != null && (str = seaLiveLynxPinCardConfig.schema) != null && str.length() > 0) {
            return str;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LIZ(java.lang.Object r44, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveVoucher r45) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21193917wn.LIZ(java.lang.Object, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveVoucher):java.lang.Object");
    }
}
