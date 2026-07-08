package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10Wk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19259610Wk {
    public static final C19259610Wk LIZ = new C19259610Wk();
    public static final ArrayList<String> LIZIZ = C1697810uHb.LJ("preinstall", "preload_conf", "preload_pai", "id_matching");
    public static final Keva LIZJ = Keva.getRepo("attribution_data_repo");
    public static final List<InterfaceC19259710Wl> LIZLLL = new ArrayList();

    public static final C1553620qX2 LIZJ() {
        Keva keva = LIZJ;
        keva.getInt("ec_mall_code", -100);
        boolean z = keva.getBoolean("is_ec_mall_ug_new_user", false);
        keva.getLong("adgroup_id", -1L);
        keva.getString("deeplink", "");
        return new C1553620qX2(z);
    }

    public static final String LIZLLL() {
        return LIZJ.getString("media_source", "");
    }

    public static final String LJ() {
        return LIZJ.getString("origin_data", "");
    }

    public static final boolean LJI() {
        return LIZJ.getBoolean("is_ready", false);
    }

    public final String LJFF() {
        Keva keva = LIZJ;
        String string = keva.getString("match_type", "");
        if (string == null || string.length() == 0 || !LIZIZ.contains(string.toLowerCase(Locale.ROOT))) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZLLL());
        sbLIZ.append('_');
        sbLIZ.append(keva.getString("campaign", ""));
        sbLIZ.append('_');
        sbLIZ.append(keva.getInt("df_code", 0));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C19260310Wr LIZIZ() {
        String strLIZLLL = LIZLLL();
        Keva keva = LIZJ;
        return new C19260310Wr(strLIZLLL, keva.getString("campaign", ""), keva.getString("campaign_id", ""), keva.getString("adset", ""), keva.getString("adset_id", ""), keva.getString("gid", ""), keva.getString("af_dp", ""), keva.getString("af_status", ""));
    }

    public static final void LIZ(C19260010Wo c19260010Wo) {
        List<InterfaceC19259710Wl> list = LIZLLL;
        synchronized (list) {
            try {
                ((ArrayList) list).add(c19260010Wo);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static final void LJII(int i, Map map) {
        String string;
        String string2;
        if (map == null) {
            return;
        }
        Object obj = map.get("media_source");
        Object obj2 = "";
        if (obj == null) {
            obj = "";
        }
        String string3 = obj.toString();
        Object obj3 = map.get("campaign");
        if (obj3 == null) {
            obj3 = "";
        }
        String string4 = obj3.toString();
        Object obj4 = map.get("campaign_id");
        if (obj4 == null) {
            obj4 = "";
        }
        String string5 = obj4.toString();
        if (map.get("af_adset") != null) {
            string = String.valueOf(map.get("af_adset"));
        } else {
            Object obj5 = map.get("adset");
            if (obj5 == null) {
                obj5 = "";
            }
            string = obj5.toString();
        }
        if (map.get("af_adset_id") != null) {
            string2 = String.valueOf(map.get("af_adset_id"));
        } else {
            Object obj6 = map.get("adset_id");
            if (obj6 == null) {
                obj6 = "";
            }
            string2 = obj6.toString();
        }
        Object obj7 = map.get("af_sub2");
        if (obj7 == null) {
            obj7 = "";
        }
        String string6 = obj7.toString();
        Object obj8 = map.get("af_dp");
        if (obj8 == null) {
            obj8 = "";
        }
        String string7 = obj8.toString();
        Object obj9 = map.get("match_type");
        if (obj9 == null) {
            obj9 = "";
        }
        String string8 = obj9.toString();
        Object obj10 = map.get("af_status");
        if (obj10 != null) {
            obj2 = obj10;
        }
        String string9 = obj2.toString();
        C19260310Wr c19260310Wr = new C19260310Wr(string3, string4, string5, string, string2, string6, string7, string9);
        Iterator it2 = ((ArrayList) LIZLLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC19259710Wl) it2.next()).LIZ(c19260310Wr);
        }
        Keva keva = LIZJ;
        keva.storeBoolean("is_ready", true);
        if (!TextUtils.isEmpty(string3)) {
            keva.storeString("media_source", string3);
        }
        if (!TextUtils.isEmpty(string4)) {
            keva.storeString("campaign", string4);
        }
        if (!TextUtils.isEmpty(string5)) {
            keva.storeString("campaign_id", string5);
        }
        if (!TextUtils.isEmpty(string)) {
            keva.storeString("adset", string);
        }
        if (!TextUtils.isEmpty(string2)) {
            keva.storeString("adset_id", string2);
        }
        if (!TextUtils.isEmpty(string6)) {
            keva.storeString("gid", string6);
        }
        if (!TextUtils.isEmpty(string8)) {
            keva.storeString("match_type", string8);
        }
        if (!TextUtils.isEmpty(string7)) {
            keva.storeString("af_dp", string7);
        }
        keva.storeInt("df_code", i);
        if (!TextUtils.isEmpty(string9)) {
            keva.storeString("af_status", string9);
        }
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
            keva.storeString("origin_data", C309390CAv.LIZIZ(map));
        }
    }

    public static final void LJIIIIZZ(int i, long j, String str, boolean z) {
        Keva keva = LIZJ;
        keva.storeInt("ec_mall_code", i);
        keva.storeBoolean("is_ec_mall_ug_new_user", z);
        keva.storeLong("adgroup_id", j);
        keva.storeString("deeplink", str);
    }
}
