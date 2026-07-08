package Y;

import X.AbstractC1143290frD;
import X.C013C;
import X.C09C2;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1335180kqi;
import X.C1335190kqj;
import X.C1720106oR;
import X.C1C7U;
import X.C20335414hc;
import X.C20441214yg;
import X.C204575153d;
import X.C20530215Vc;
import X.C20589415hU;
import X.C20644815qQ;
import X.C2188811AlT;
import X.C2197011Ayh;
import X.C438710HIf;
import X.C805380Via;
import X.EnumC1334360kpO;
import X.EnumC714850S2h;
import X.InterfaceC204578153g;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.app.Activity;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.explore.data.ExploreDataLruPool;
import com.ss.android.ugc.aweme.minis.debug.ui.MinisDebugSettingFragment;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MiniDramaFragment;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MiniGameFragment;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public class ARunnableS33S1200000_31 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$3() {
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZJ(this.s0));
        c1331670kl3LJIIIIZZ.LJJIJL((Context) this.l1);
        c1331670kl3LJIIIIZZ.LJJIII = (EnumC1334360kpO) this.l2;
        if (C1335180kqi.LIZLLL()) {
            c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.CUSTOM;
            c1331670kl3LJIIIIZZ.LJJJJJ = "explore_feed_image_cache";
        } else if (C1335190kqj.LIZJ()) {
            c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.CUSTOM;
            c1331670kl3LJIIIIZZ.LJJJJJ = "photomode_image_cache_v2";
        }
        if (C20530215Vc.LIZJ()) {
            c1331670kl3LJIIIIZZ.LJJIFFI();
        } else {
            c1331670kl3LJIIIIZZ.LJIILIIL();
        }
    }

    public final void LIZ$0() throws JSONException {
        Activity activityMR;
        Activity activityMR2;
        Activity activityMR3;
        Activity activityMR4;
        Activity activityMR5;
        Activity activityMR6;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receive msg : ");
        sbLIZ.append(this.s0);
        sbLIZ.append(" from ");
        sbLIZ.append(((InterfaceC204578153g) this.l1).LIZLLL());
        C2188811AlT.LIZIZ(sbLIZ);
        String str = this.s0;
        if (str == null || str.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject(this.s0);
        String strOptString = jSONObject.optString("method");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("payload");
        int iOptInt = jSONObject.optInt("callbackId");
        if (!Intrinsics.LJFF(strOptString, "setDebugSettings")) {
            C20335414hc c20335414hc = (C20335414hc) ((LinkedHashMap) ((MiniDramaFragment) this.l2).LLLZI).get(strOptString);
            if (c20335414hc != null) {
                c20335414hc.LIZIZ.invoke(jSONObjectOptJSONObject, Integer.valueOf(iOptInt));
                return;
            }
            return;
        }
        boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("enableDomainCheck");
        boolean zOptBoolean2 = jSONObjectOptJSONObject.optBoolean("enableAdMock");
        boolean zOptBoolean3 = jSONObjectOptJSONObject.optBoolean("enableIAPMock");
        boolean zOptBoolean4 = jSONObjectOptJSONObject.optBoolean("enableSubscriptionMock");
        boolean zOptBoolean5 = jSONObjectOptJSONObject.optBoolean("enableVConsole");
        boolean zOptBoolean6 = jSONObjectOptJSONObject.optBoolean("enableDevInfoPanel");
        C2197011Ayh.LIZ.getClass();
        JSONObject jSONObjectLJ = C2197011Ayh.LJ();
        jSONObjectLJ.put("IS_NATIVE_GAME_DEBUG_ENABLE_DOMAIN_CHECK_MOCK", zOptBoolean);
        C2197011Ayh.LJIIIIZZ(jSONObjectLJ);
        JSONObject jSONObjectLJ2 = C2197011Ayh.LJ();
        jSONObjectLJ2.put("IS_NATIVE_GAME_DEBUG_ENABLE_IAA_MOCK", zOptBoolean2);
        C2197011Ayh.LJIIIIZZ(jSONObjectLJ2);
        JSONObject jSONObjectLJ3 = C2197011Ayh.LJ();
        jSONObjectLJ3.put("IS_NATIVE_GAME_DEBUG_ENABLE_IAP_MOCK", zOptBoolean3);
        C2197011Ayh.LJIIIIZZ(jSONObjectLJ3);
        JSONObject jSONObjectLJ4 = C2197011Ayh.LJ();
        jSONObjectLJ4.put("IS_NATIVE_GAME_DEBUG_ENABLE_SUBSCRIPTION_MOCK", zOptBoolean4);
        C2197011Ayh.LJIIIIZZ(jSONObjectLJ4);
        C2197011Ayh.LIZLLL().storeBoolean("IS_NATIVE_GAME_DEBUG_ENABLE_VCONSOLE", zOptBoolean5);
        C2197011Ayh.LIZLLL().storeBoolean("IS_NATIVE_GAME_DEBUG_ENABLE_STATISTICS_LAYER", zOptBoolean6);
        MinisDebugSettingFragment minisDebugSettingFragment = C204575153d.LIZIZ;
        if (minisDebugSettingFragment != null && (activityMR6 = minisDebugSettingFragment.MR()) != null) {
            activityMR6.runOnUiThread(new ARunnableS3S0120000_31(minisDebugSettingFragment, true, zOptBoolean, 2));
        }
        MinisDebugSettingFragment minisDebugSettingFragment2 = C204575153d.LIZIZ;
        if (minisDebugSettingFragment2 != null && (activityMR5 = minisDebugSettingFragment2.MR()) != null) {
            activityMR5.runOnUiThread(new ARunnableS3S0120000_31(minisDebugSettingFragment2, true, zOptBoolean2, 3));
        }
        MinisDebugSettingFragment minisDebugSettingFragment3 = C204575153d.LIZIZ;
        if (minisDebugSettingFragment3 != null && (activityMR4 = minisDebugSettingFragment3.MR()) != null) {
            activityMR4.runOnUiThread(new ARunnableS3S0120000_31(minisDebugSettingFragment3, true, zOptBoolean3, 4));
        }
        MinisDebugSettingFragment minisDebugSettingFragment4 = C204575153d.LIZIZ;
        if (minisDebugSettingFragment4 != null && (activityMR3 = minisDebugSettingFragment4.MR()) != null) {
            activityMR3.runOnUiThread(new ARunnableS3S0120000_31(minisDebugSettingFragment4, true, zOptBoolean4, 5));
        }
        MinisDebugSettingFragment minisDebugSettingFragment5 = C204575153d.LIZIZ;
        if (minisDebugSettingFragment5 != null && (activityMR2 = minisDebugSettingFragment5.MR()) != null) {
            activityMR2.runOnUiThread(new ARunnableS3S0120000_31(minisDebugSettingFragment5, true, zOptBoolean5, 6));
        }
        MinisDebugSettingFragment minisDebugSettingFragment6 = C204575153d.LIZIZ;
        if (minisDebugSettingFragment6 == null || (activityMR = minisDebugSettingFragment6.MR()) == null) {
            return;
        }
        activityMR.runOnUiThread(new ARunnableS3S0120000_31(minisDebugSettingFragment6, true, zOptBoolean6, 1));
    }

    public final void LIZ$1() throws JSONException {
        Activity activityMR;
        Activity activityMR2;
        Activity activityMR3;
        Activity activityMR4;
        Activity activityMR5;
        Activity activityMR6;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receive msg : ");
        sbLIZ.append(this.s0);
        sbLIZ.append(" from ");
        sbLIZ.append(((InterfaceC204578153g) this.l1).LIZLLL());
        ((MiniGameFragment) this.l2).VT(C2188811AlT.LIZIZ(sbLIZ));
        String str = this.s0;
        if (str == null || str.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject(this.s0);
        String strOptString = jSONObject.optString("method");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("payload");
        if (Intrinsics.LJFF(strOptString, "setDebugSettings") && !jSONObjectOptJSONObject.isNull("enableDomainCheck") && !jSONObjectOptJSONObject.isNull("enableAdMock") && !jSONObjectOptJSONObject.isNull("enableIAPMock") && jSONObjectOptJSONObject.has("enableDomainCheck") && jSONObjectOptJSONObject.has("enableAdMock") && jSONObjectOptJSONObject.has("enableIAPMock")) {
            boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("enableDomainCheck");
            boolean zOptBoolean2 = jSONObjectOptJSONObject.optBoolean("enableAdMock");
            boolean zOptBoolean3 = jSONObjectOptJSONObject.optBoolean("enableIAPMock");
            boolean zOptBoolean4 = jSONObjectOptJSONObject.optBoolean("enableSubscriptionMock");
            C013C c013c = new C013C();
            c013c.element = jSONObjectOptJSONObject.optBoolean("enableVConsole");
            C013C c013c2 = new C013C();
            c013c2.element = jSONObjectOptJSONObject.optBoolean("enableDevInfoPanel");
            C2197011Ayh.LIZ.getClass();
            JSONObject jSONObjectLJ = C2197011Ayh.LJ();
            jSONObjectLJ.put("IS_NATIVE_GAME_DEBUG_ENABLE_DOMAIN_CHECK_MOCK", zOptBoolean);
            C2197011Ayh.LJIIIIZZ(jSONObjectLJ);
            JSONObject jSONObjectLJ2 = C2197011Ayh.LJ();
            jSONObjectLJ2.put("IS_NATIVE_GAME_DEBUG_ENABLE_IAA_MOCK", zOptBoolean2);
            C2197011Ayh.LJIIIIZZ(jSONObjectLJ2);
            JSONObject jSONObjectLJ3 = C2197011Ayh.LJ();
            jSONObjectLJ3.put("IS_NATIVE_GAME_DEBUG_ENABLE_IAP_MOCK", zOptBoolean3);
            C2197011Ayh.LJIIIIZZ(jSONObjectLJ3);
            JSONObject jSONObjectLJ4 = C2197011Ayh.LJ();
            jSONObjectLJ4.put("IS_NATIVE_GAME_DEBUG_ENABLE_SUBSCRIPTION_MOCK", zOptBoolean4);
            C2197011Ayh.LJIIIIZZ(jSONObjectLJ4);
            C2197011Ayh.LIZLLL().storeBoolean("IS_NATIVE_GAME_DEBUG_ENABLE_VCONSOLE", c013c.element);
            C2197011Ayh.LIZLLL().storeBoolean("IS_NATIVE_GAME_DEBUG_ENABLE_STATISTICS_LAYER", c013c2.element);
            MinisDebugSettingFragment minisDebugSettingFragment = C204575153d.LIZIZ;
            if (minisDebugSettingFragment != null && (activityMR6 = minisDebugSettingFragment.MR()) != null) {
                activityMR6.runOnUiThread(new ARunnableS3S0120000_31(minisDebugSettingFragment, true, zOptBoolean, 2));
            }
            MinisDebugSettingFragment minisDebugSettingFragment2 = C204575153d.LIZIZ;
            if (minisDebugSettingFragment2 != null && (activityMR5 = minisDebugSettingFragment2.MR()) != null) {
                activityMR5.runOnUiThread(new ARunnableS3S0120000_31(minisDebugSettingFragment2, true, zOptBoolean2, 3));
            }
            MinisDebugSettingFragment minisDebugSettingFragment3 = C204575153d.LIZIZ;
            if (minisDebugSettingFragment3 != null && (activityMR4 = minisDebugSettingFragment3.MR()) != null) {
                activityMR4.runOnUiThread(new ARunnableS3S0120000_31(minisDebugSettingFragment3, true, zOptBoolean3, 4));
            }
            MinisDebugSettingFragment minisDebugSettingFragment4 = C204575153d.LIZIZ;
            if (minisDebugSettingFragment4 != null && (activityMR3 = minisDebugSettingFragment4.MR()) != null) {
                activityMR3.runOnUiThread(new ARunnableS3S0120000_31(minisDebugSettingFragment4, true, zOptBoolean4, 5));
            }
            boolean z = c013c.element;
            MinisDebugSettingFragment minisDebugSettingFragment5 = C204575153d.LIZIZ;
            if (minisDebugSettingFragment5 != null && (activityMR2 = minisDebugSettingFragment5.MR()) != null) {
                activityMR2.runOnUiThread(new ARunnableS3S0120000_31(minisDebugSettingFragment5, true, z, 6));
            }
            boolean z2 = c013c2.element;
            MinisDebugSettingFragment minisDebugSettingFragment6 = C204575153d.LIZIZ;
            if (minisDebugSettingFragment6 != null && (activityMR = minisDebugSettingFragment6.MR()) != null) {
                activityMR.runOnUiThread(new ARunnableS3S0120000_31(minisDebugSettingFragment6, true, z2, 1));
            }
            Activity activityHS = ((MiniGameFragment) this.l2).hS();
            if (activityHS != null) {
                activityHS.runOnUiThread(new ARunnableS64S0300000_31(c013c2, c013c, (MiniGameFragment) this.l2, 3));
            }
        }
    }

    public final void LIZ$2() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("destroy: destroy spark, tag=");
        sbLIZ.append(this.s0);
        sbLIZ.append(", popupKey=");
        sbLIZ.append(((C20644815qQ) this.l1).LIZ.popupKey);
        C20589415hU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        try {
            ((SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) this.l2).LJJ(true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1720106oR.LIZIZ("FeedPopupLog", "DynamicPopupLog", e);
            C805380Via.LIZJ(e, "DynamicPopupLog");
        }
    }

    public static final void run$0(ARunnableS33S1200000_31 aRunnableS33S1200000_31) {
        boolean zLIZ;
        C1C7U.LIZ("MiniDramaFragment@ea5a.initWSServer$4$1");
        try {
            aRunnableS33S1200000_31.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MiniDramaFragment@ea5a.initWSServer$4$1");
    }

    public static final void run$1(ARunnableS33S1200000_31 aRunnableS33S1200000_31) {
        boolean zLIZ;
        C1C7U.LIZ("MiniGameFragment@6eb9.initWSServer$4$1");
        try {
            aRunnableS33S1200000_31.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MiniGameFragment@6eb9.initWSServer$4$1");
    }

    public static final void run$2(ARunnableS33S1200000_31 aRunnableS33S1200000_31) {
        AbstractC1143290frD abstractC1143290frD = (AbstractC1143290frD) aRunnableS33S1200000_31.l1;
        String str = aRunnableS33S1200000_31.s0;
        JSONObject jSONObject = (JSONObject) aRunnableS33S1200000_31.l2;
        abstractC1143290frD.getClass();
        C1C7U.LIZ("TraceLogger@e3a7.i$3L");
        C20441214yg.LJIIIZ(str, abstractC1143290frD.LJFF(str, jSONObject));
        C1C7U.LIZIZ("TraceLogger@e3a7.i$3L");
    }

    public static final void run$3(ARunnableS33S1200000_31 aRunnableS33S1200000_31) {
        AbstractC1143290frD abstractC1143290frD = (AbstractC1143290frD) aRunnableS33S1200000_31.l1;
        String str = aRunnableS33S1200000_31.s0;
        JSONObject jSONObject = (JSONObject) aRunnableS33S1200000_31.l2;
        abstractC1143290frD.getClass();
        C1C7U.LIZ("TraceLogger@e3a7.w$2L");
        C20441214yg.LJIIL(str, abstractC1143290frD.LJFF(str, jSONObject));
        C1C7U.LIZIZ("TraceLogger@e3a7.w$2L");
    }

    public static final void run$4(ARunnableS33S1200000_31 aRunnableS33S1200000_31) {
        AbstractC1143290frD abstractC1143290frD = (AbstractC1143290frD) aRunnableS33S1200000_31.l1;
        String str = aRunnableS33S1200000_31.s0;
        JSONObject jSONObject = (JSONObject) aRunnableS33S1200000_31.l2;
        abstractC1143290frD.getClass();
        C1C7U.LIZ("TraceLogger@e3a7.e$2L");
        C20441214yg.LJ(str, abstractC1143290frD.LJFF(str, jSONObject));
        C1C7U.LIZIZ("TraceLogger@e3a7.e$2L");
    }

    public static final void run$5(ARunnableS33S1200000_31 aRunnableS33S1200000_31) {
        boolean zLIZ;
        C1C7U.LIZ("FeedPopupSparkManager@3661.destroy$1$1");
        try {
            aRunnableS33S1200000_31.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedPopupSparkManager@3661.destroy$1$1");
    }

    public static final void run$6(ARunnableS33S1200000_31 aRunnableS33S1200000_31) {
        boolean zLIZ;
        C1C7U.LIZ("LightenHelper@f2a4.lightenPreloadDMAvatar$1");
        try {
            aRunnableS33S1200000_31.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LightenHelper@f2a4.lightenPreloadDMAvatar$1");
    }

    public static final void run$7(ARunnableS33S1200000_31 aRunnableS33S1200000_31) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreDataLruPool@665e.persistPayloadAsync$1");
        try {
            ((ExploreDataLruPool) aRunnableS33S1200000_31.l1).LIZJ().LIZIZ(aRunnableS33S1200000_31.s0, C09C2.LIZ().LJIILL((ExploreAwemeList) aRunnableS33S1200000_31.l2));
        } finally {
            try {
            } finally {
                if (!zLIZ) {
                }
            }
        }
        C1C7U.LIZIZ("ExploreDataLruPool@665e.persistPayloadAsync$1");
    }

    public ARunnableS33S1200000_31(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
        this.l2 = obj2;
    }
}
