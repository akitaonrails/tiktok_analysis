package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0pjn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1523090pjn {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(SparkContext sparkContext) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("schema", sparkContext.LJIJI());
        String strLIZIZ = LIZIZ("previous_page", sparkContext.LJIJI());
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        linkedHashMap.put("previous_page", strLIZIZ);
        return linkedHashMap;
    }

    public static String LIZIZ(String str, String str2) {
        if (!a0.LJJJIL(str) && !a0.LJJJIL(str2)) {
            try {
                return UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str2), str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2341109Fh.LIZ.getClass();
                C2341109Fh.LIZJ(e);
                return null;
            }
        }
        return null;
    }

    public static void LIZJ(SparkContext sparkContext, int i, int i2, String str, long j, int i3) {
        Object obj;
        int i4;
        Long lLJIILIIL;
        if ((i3 & 4) != 0) {
            obj = "";
        } else {
            obj = null;
        }
        if ((i3 & 8) != 0) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if ((i3 & 16) != 0) {
            i2 = -1;
        }
        if ((i3 & 32) != 0) {
            str = "";
        }
        if ((i3 & 128) != 0) {
            j = 0;
        }
        Map mapLIZ = LIZ(sparkContext);
        String strLIZIZ = LIZIZ("init_time", sparkContext.LJIJI());
        if (strLIZIZ != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strLIZIZ)) != null) {
            j = lLJIILIIL.longValue();
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        mapLIZ.put("load_status", Integer.valueOf(i));
        mapLIZ.put("start_click_to_now", Long.valueOf(jCurrentTimeMillis));
        mapLIZ.put("source", obj);
        mapLIZ.put("is_success", Integer.valueOf(i4));
        mapLIZ.put("error_code", Integer.valueOf(i2));
        mapLIZ.put("error_message", str);
        mapLIZ.put("is_retry", 0);
        C1326370kcV.LIZ(new AwS556S0100000_12(mapLIZ, (Map<String, Object>) 851));
    }
}
