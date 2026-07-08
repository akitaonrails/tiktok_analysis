package X;

import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: renamed from: X.04Al, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1054504Al {
    public static C1056604Bg LIZ;
    public static C04CD LIZIZ = new C04CD(0, 0, 0);
    public static C04BW LIZJ = new C04BW(null, null, null, 63);
    public static final Keva LIZLLL;
    public static long LJ;

    static {
        HashMap map;
        Type type;
        Keva repo = Keva.getRepo("app_level_algorithm_metrics");
        LIZLLL = repo;
        String string = repo.getString("pdp_cache_date", "");
        String str = new SimpleDateFormat("yyyy_MM_dd", Locale.getDefault()).format(new Date());
        if (!Intrinsics.LJFF(string, str)) {
            repo.storeString("pdp_cache_date", str);
            repo.storeInt("pdp_daily_pv", 0);
            repo.storeString("pdp_daily_visits", C1741890vQh.LJIIIIZZ(new HashMap()));
        }
        int i = repo.getInt("pdp_daily_pv", 0);
        String string2 = repo.getString("pdp_daily_visits", "");
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) {
                type = new TypeToken<HashMap<String, Integer>>() { // from class: X.04Cc
                }.getType();
            } else {
                C13JX c13jx = KTypeProjection.LIZJ;
                C13JW c13jwLJII = C13LE.LJII(String.class);
                c13jx.getClass();
                type = C2371409Qy.LIZJ(C13LE.LJIIIZ(HashMap.class, C13JX.LIZ(c13jwLJII), C13JX.LIZ(C13LE.LJII(Integer.TYPE))));
            }
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, string2, type);
            if (!(objFromJson instanceof HashMap)) {
                objFromJson = null;
            }
            map = (HashMap) objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (map == null) {
            map = new HashMap();
        }
        LIZ = new C1056604Bg(i, map);
    }

    public static void LIZIZ() {
        C04CD c04cd = LIZIZ;
        LIZIZ = C04CD.LIZ(c04cd, 0, 0, c04cd.LIZJ + 1, 3);
    }

    public static Map LIZ(String str) {
        int iIntValue;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZJ = C04BW.LIZ(LIZJ, null, (SystemClock.elapsedRealtime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - LJ, 0, 0, null, 59);
        C1056604Bg c1056604Bg = LIZ;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("pdp_daily_pv", Integer.valueOf(c1056604Bg.LIZ));
        Integer num = c1056604Bg.LIZIZ.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        pairArr[1] = new Pair("enter_pdp_count_for_today_promotion_c_end", Integer.valueOf(iIntValue));
        linkedHashMap.putAll(C2097608Jq.LJIIJ(pairArr));
        C04CD c04cd = LIZIZ;
        linkedHashMap.putAll(C2097608Jq.LJIIJ(new Pair("pdp_session_pv", Integer.valueOf(c04cd.LIZ)), new Pair("buy_now_count", Integer.valueOf(c04cd.LIZIZ)), new Pair("add_to_cart_count", Integer.valueOf(c04cd.LIZJ))));
        C04BW c04bw = LIZJ;
        linkedHashMap.putAll(C2097608Jq.LJIIJ(new Pair("product_id", c04bw.LIZ), new Pair("product_price", c04bw.LIZIZ), new Pair("stay_time_sec", Long.valueOf(c04bw.LIZJ)), new Pair("sku_open_count", Integer.valueOf(c04bw.LIZLLL)), new Pair("sku_switch_count", Integer.valueOf(c04bw.LJ)), new Pair("coupon_list", c04bw.LJFF)));
        return linkedHashMap;
    }
}
