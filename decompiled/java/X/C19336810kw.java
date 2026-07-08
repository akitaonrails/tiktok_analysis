package X;

import android.os.SystemClock;
import android.view.ViewGroup;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import org.json.JSONException;

/* JADX INFO: renamed from: X.10kw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19336810kw extends AbstractC1542200qEc {
    public final int $t;

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        if (this.$t != 0) {
            super.LJLIIIL(interfaceC1541990qEH);
        } else {
            LJLIIIL$0(this, interfaceC1541990qEH);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLJI(InterfaceC1541990qEH interfaceC1541990qEH) {
        if (2 - this.$t != 0) {
            super.LJLJI(interfaceC1541990qEH);
        } else {
            LJLJI$0(this, interfaceC1541990qEH);
        }
    }

    @Override // X.AbstractC1542100qES
    public final void LJLLJ(SparkContext sparkContext, C1548490qOl c1548490qOl) throws JSONException {
        switch (this.$t) {
            case 1:
                LJLLJ$0(this, sparkContext, c1548490qOl);
                break;
            case 2:
            default:
                super.LJLLJ(sparkContext, c1548490qOl);
                break;
            case 3:
                LJLLJ$1(this, sparkContext, c1548490qOl);
                break;
        }
    }

    public C19336810kw(int i) {
        this.$t = i;
    }

    public static final void LJLIIIL$0(C19336810kw c19336810kw, InterfaceC1541990qEH interfaceC1541990qEH) {
        C1867460yhE.LIZ.getClass();
        Map<String, Long> map = C1867460yhE.LIZIZ;
        Long l = (Long) ((LinkedHashMap) map).get("consent_h5");
        if (l != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("type", "consent_h5");
            c2344009Gk.LJIIIIZZ("sub_type", "consent_h5");
            c2344009Gk.LIZJ(C1514430pVp.LIZLLL().booleanValue() ? 1 : 0, "is_cold_start_first_launch");
            c2344009Gk.LIZLLL(jElapsedRealtime, "from_start_to_current_duration");
            C20684815ws.LJIILLIIL("intention_detection_flag", c2344009Gk.LIZ);
            map.remove("consent_h5");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("scene:");
            sbLIZ.append("consent_h5");
            sbLIZ.append(", duration:");
            sbLIZ.append(jElapsedRealtime);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static final void LJLJI$0(C19336810kw c19336810kw, InterfaceC1541990qEH interfaceC1541990qEH) {
        C1075770e6J c1075770e6J;
        C1537480q70 hybridContext = interfaceC1541990qEH.getHybridContext();
        if (hybridContext != null && (c1075770e6J = (C1075770e6J) hybridContext.LJFF(C1075770e6J.class)) != null) {
            c1075770e6J.LJIJ(C1545130qJL.class, new C1545130qJL() { // from class: X.0yzo
                public static final Map<String, EnumC1544180qHo> LIZIZ;
                public static final Set<String> LIZJ;

                static {
                    EnumC1544180qHo enumC1544180qHo = EnumC1544180qHo.CURRENT_THREAD;
                    EnumC1544180qHo enumC1544180qHo2 = EnumC1544180qHo.MAIN_THREAD;
                    LIZIZ = C2097608Jq.LJIIIIZZ(new Pair("getPrefetchResult", enumC1544180qHo), new Pair("x.getStorageItem", enumC1544180qHo), new Pair("x.removeStorageItem", enumC1544180qHo), new Pair("x.setStorageItem", enumC1544180qHo), new Pair("x.getStorageInfo", enumC1544180qHo), new Pair("fetch", enumC1544180qHo), new Pair("getAppInfo", enumC1544180qHo), new Pair("x.getAppInfo", enumC1544180qHo), new Pair("x.getSettings", enumC1544180qHo), new Pair("x.request", enumC1544180qHo), new Pair("appInfo", enumC1544180qHo), new Pair("x.reportAppLog", enumC1544180qHo), new Pair("getSelectedDSP", enumC1544180qHo), new Pair("getAvailableDSPs", enumC1544180qHo), new Pair("canShowAddSongEntrance", enumC1544180qHo), new Pair("getImageColorsWithParams", enumC1544180qHo), new Pair("updateBulletinItemRawData", enumC1544180qHo), new Pair("x.publishEvent", enumC1544180qHo), new Pair("x.subscribeEvent", enumC1544180qHo), new Pair("subscribeBulletin", enumC1544180qHo), new Pair("removeCurrentBulletinItem", enumC1544180qHo), new Pair("reportBulletinCardAction", enumC1544180qHo2), new Pair("x.publishPageEvent", enumC1544180qHo2), new Pair("showBulletinPopup", enumC1544180qHo2), new Pair("showBulletinUnsubscribeIntroSheet", enumC1544180qHo2), new Pair("playBulletinMusic", enumC1544180qHo2), new Pair("addSongToMusicApp", enumC1544180qHo2), new Pair("showBulletinTemplatePost", enumC1544180qHo2), new Pair("postBulletinMessage", enumC1544180qHo2), new Pair("closeBulletinLynxContainer", enumC1544180qHo2), new Pair("openBulletinSettingsPage", enumC1544180qHo2), new Pair("showNoticeSubscribeCard", enumC1544180qHo2), new Pair("sendInboxWorkbenchUpdateEvent", enumC1544180qHo2), new Pair("didUpdateBulletinAccountInfo", enumC1544180qHo2), new Pair("x.vibrate", enumC1544180qHo2), new Pair("x.showToast", enumC1544180qHo2), new Pair("toast", enumC1544180qHo2), new Pair("close", enumC1544180qHo2), new Pair("dialog", enumC1544180qHo2), new Pair("x.showLoading", enumC1544180qHo2), new Pair("x.hideLoading", enumC1544180qHo2), new Pair("x.configureStatusBar", enumC1544180qHo2), new Pair("x.setContainer", enumC1544180qHo2), new Pair("x.close", enumC1544180qHo2), new Pair("x.open", enumC1544180qHo2));
                    LIZJ = C13LQ.LJLIIL(new String[]{"x.publishEvent", "x.subscribeEvent"});
                }

                @Override // X.C1545130qJL
                public final EnumC1544180qHo LIZ(String str) {
                    if (!((Boolean) C279020Awe.LIZ.getValue()).booleanValue() && LIZJ.contains(str)) {
                        return EnumC1544180qHo.MAIN_THREAD;
                    }
                    EnumC1544180qHo enumC1544180qHo = LIZIZ.get(str);
                    if (enumC1544180qHo == null) {
                        return EnumC1544180qHo.MAIN_THREAD;
                    }
                    return enumC1544180qHo;
                }
            });
        }
    }

    public static final void LJLLJ$0(C19336810kw c19336810kw, SparkContext sparkContext, C1548490qOl c1548490qOl) throws JSONException {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        SparkContext sparkContext2;
        String strLJJIL;
        if (c1548490qOl.LIZIZ == 2 && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1548490qOl.LIZ) != null && (sparkContext2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext()) != null && (strLJJIL = sparkContext2.LJJIL()) != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIJLIJ(null, strLJJIL, false);
        }
    }

    public static final void LJLLJ$1(C19336810kw c19336810kw, SparkContext sparkContext, C1548490qOl c1548490qOl) {
        ViewGroup.LayoutParams layoutParams;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1548490qOl.LIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null || (layoutParams = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getLayoutParams()) == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        layoutParams.width = -1;
        layoutParams.height = -1;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = c1548490qOl.LIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
            C786410Ut5.C6(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2, layoutParams);
        }
    }
}
