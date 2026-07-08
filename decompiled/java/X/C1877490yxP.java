package X;

import com.ss.android.ugc.feed.platform.popup.dynamic.DynamicPopupInfo;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0yxP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1877490yxP {
    public static final C1877490yxP LIZ = new C1877490yxP();

    public static void LIZJ(String str, DynamicPopupInfo dynamicPopupInfo) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        Map<String, String> map = dynamicPopupInfo.traceInfo;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c2344009Gk.LJFF(entry.getKey(), entry.getValue());
            }
        }
        c2344009Gk.LJFF("dynamic_reach_show_time", str);
        C20684815ws.LJIILLIIL("dynamic_reach_record", c2344009Gk.LIZ);
    }

    public static void LIZ(final EnumC20645715qZ enumC20645715qZ, final String str, final String str2, final String str3, final String str4, final String str5, final String str6) {
        if (!((Boolean) C266140Abs.LIZ.getValue()).booleanValue()) {
            return;
        }
        C05QD.LIZ(new Runnable() { // from class: X.0yxN
            public final void LIZ() {
                Pair[] pairArr = new Pair[7];
                pairArr[0] = new Pair("stage", enumC20645715qZ.getStage());
                pairArr[1] = new Pair("reason", str);
                C1877490yxP c1877490yxP = C1877490yxP.LIZ;
                String str7 = str2;
                c1877490yxP.getClass();
                if (str7 == null) {
                    str7 = "";
                }
                pairArr[2] = new Pair("popup_key", str7);
                String str8 = str3;
                c1877490yxP.getClass();
                if (str8 == null) {
                    str8 = "";
                }
                pairArr[3] = new Pair("trigger_id", str8);
                String str9 = str4;
                c1877490yxP.getClass();
                if (str9 == null) {
                    str9 = "";
                }
                pairArr[4] = new Pair("fetch_timing", str9);
                String str10 = str5;
                c1877490yxP.getClass();
                if (str10 == null) {
                    str10 = "";
                }
                pairArr[5] = new Pair("trigger_timing", str10);
                String str11 = str6;
                c1877490yxP.getClass();
                pairArr[6] = new Pair("extra", str11 != null ? str11 : "");
                C20684815ws.LJIILLIIL("dynamic_popup_monitor", C2097608Jq.LJIIIIZZ(pairArr));
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FeedDynamicPopupMonitor@d6d3.mob$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FeedDynamicPopupMonitor@d6d3.mob$1");
            }
        });
    }
}
