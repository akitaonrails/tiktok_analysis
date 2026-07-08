package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0ZzR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C917750ZzR {
    public static C917760ZzS LIZ;
    public static C917760ZzS LIZIZ;

    public static Map LIZJ() {
        Integer num;
        Integer num2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C917760ZzS c917760ZzS = LIZ;
        linkedHashMap.put("is_revenue_share", (c917760ZzS == null || (c917760ZzS.LIZIZ == null ? c917760ZzS == null || c917760ZzS.LIZ != 1 : ((num = c917760ZzS.LIZIZ) != null && num.intValue() == 0) || ((num2 = c917760ZzS.LIZIZ) != null && num2.intValue() == 1))) ? CardStruct.IStatusCode.DEFAULT : "1");
        linkedHashMap.put("revenue_share_type", LJFF(c917760ZzS != null ? c917760ZzS.LIZIZ : null));
        return linkedHashMap;
    }

    public static void LIZ(Map map) {
        String str;
        Integer num;
        Integer num2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C917760ZzS c917760ZzS = LIZIZ;
        if (c917760ZzS == null) {
            c917760ZzS = LIZ;
        }
        Integer num3 = null;
        if (c917760ZzS != null && (c917760ZzS.LIZIZ == null ? !(c917760ZzS == null || c917760ZzS.LIZ != 1) : !(((num = c917760ZzS.LIZIZ) != null && num.intValue() == 0) || ((num2 = c917760ZzS.LIZIZ) != null && num2.intValue() == 1)))) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_revenue_share", str);
        if (c917760ZzS != null) {
            num3 = c917760ZzS.LIZIZ;
        }
        linkedHashMap.put("revenue_share_type", LJFF(num3));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    public static void LIZIZ(Map map) {
        for (Map.Entry entry : ((LinkedHashMap) LIZJ()).entrySet()) {
            ((HashMap) map).put(entry.getKey(), entry.getValue());
        }
    }

    public static String LJ(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return C497740JfY.LJIJI(2131854388);
            }
            if (num.intValue() == 2) {
                return C497740JfY.LJIJI(2131854390);
            }
            if (num.intValue() == 3) {
                return C497740JfY.LJIJI(2131854392);
            }
            return "";
        }
        return "";
    }

    public static String LJFF(Integer num) {
        if (num != null) {
            if (num.intValue() == 0) {
                return "";
            }
            if (num.intValue() == 1) {
                return "all_for_guests";
            }
            if (num.intValue() == 2) {
                return "more_for_guests";
            }
            if (num.intValue() == 3) {
                return "more_for_host";
            }
            return "unknown";
        }
        return "unknown";
    }

    public static boolean LJI(boolean z) {
        if (z) {
            return LiveAbLabelSetting.INSTANCE.getBooleanValue("multiguest_revenue_share_close_enable");
        }
        return true;
    }

    public static void LJII(String str) {
        C20441214yg.LIZIZ("revenue_share", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL(int r2, java.lang.Integer r3) {
        /*
            r0 = 0
            boolean r0 = LJI(r0)
            if (r0 == 0) goto L2a
            r1 = 1
            if (r3 == 0) goto L33
            int r0 = r3.intValue()
            if (r0 != r1) goto L18
            r0 = 2131854384(0x7f118430, float:1.9342442E38)
        L13:
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
            return r0
        L18:
            r1 = 3
            int r0 = r3.intValue()
            if (r0 != r1) goto L23
            r0 = 2131854386(0x7f118432, float:1.9342446E38)
            goto L13
        L23:
            r3.intValue()
            r0 = 2131854385(0x7f118431, float:1.9342444E38)
            goto L13
        L2a:
            com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestRevenueAreaBackUpSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestRevenueAreaBackUpSetting.INSTANCE
            boolean r0 = r0.isShieldUs()
            if (r0 != 0) goto L39
            goto L35
        L33:
            if (r2 != r1) goto L39
        L35:
            r0 = 2131852875(0x7f117e4b, float:1.933938E38)
            goto L13
        L39:
            r0 = 2131852876(0x7f117e4c, float:1.9339383E38)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C917750ZzR.LIZLLL(int, java.lang.Integer):java.lang.String");
    }

    public static void LJIIIIZZ(Integer num, Integer num2, String str) {
        int iIntValue = 0;
        if (!LJI(false)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestRevenueShareSettingHelper#updateNewestShareRevenueSnapshot, shareRevenueSwitch = ");
        sbLIZ.append(num);
        sbLIZ.append(" shareRevenueRatio = ");
        sbLIZ.append(num2);
        sbLIZ.append(" source=");
        sbLIZ.append(str);
        sbLIZ.append('}');
        LJII(C2188811AlT.LIZIZ(sbLIZ));
        if (num != null) {
            iIntValue = num.intValue();
        }
        LIZ = new C917760ZzS(iIntValue, num2);
    }
}
