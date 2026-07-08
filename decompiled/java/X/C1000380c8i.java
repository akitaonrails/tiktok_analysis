package X;

import Y.AObjectS387S0100000_12;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.DynamicVideo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.spark.IAdSparkUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0c8i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1000380c8i implements InterfaceC1000440c8o {
    public static final C1000380c8i LIZ = new C1000380c8i();
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;
    public static final C01GW LIZLLL;
    public static final C01GW LJ;
    public static final HashMap<String, C1000400c8k> LJFF;
    public static WeakReference<Context> LJI;
    public static int LJII;
    public static int LJIIIIZZ;
    public static int LJIIIZ;

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        LIZIZ = C452501pT.LIZ(enumC452301pR, new C1000460c8q());
        LIZJ = C452501pT.LIZ(enumC452301pR, new C1000450c8p());
        LIZLLL = C452501pT.LIZ(enumC452301pR, new C989210bqh());
        LJ = C452501pT.LIZ(enumC452301pR, new C989520brC());
        LJFF = new HashMap<>();
    }

    public static int LJFF() {
        return ((Number) LIZIZ.getValue()).intValue();
    }

    public static final Pair<Integer, Integer> LJI() {
        return new Pair<>(Integer.valueOf(LJII), Integer.valueOf(LJIIIIZZ));
    }

    public final void LIZLLL() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        C622680Oba.LIZLLL(this);
        for (Map.Entry<String, C1000400c8k> entry : LJFF.entrySet()) {
            if (entry.getValue().LJ && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = entry.getValue().LIZLLL) != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
            }
        }
        LJFF.clear();
        LJII = 0;
        LJIIIIZZ = 0;
        LJIIIZ = 0;
    }

    public static final C1000400c8k LJ(String str) {
        return LJFF.get(str);
    }

    public final void LIZIZ(Context context) {
        if (context == null) {
            return;
        }
        LJI = new WeakReference<>(context);
        C622680Oba.LIZJ(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onAdFeedRefreshEvent(C739830T0j c739830T0j) {
        ViewGroup viewGroup;
        Iterator<Map.Entry<String, C1000400c8k>> it2 = LJFF.entrySet().iterator();
        while (it2.hasNext()) {
            C1000400c8k value = it2.next().getValue();
            if (value.LJ) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = value.LIZLLL;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                    ViewParent parent = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getParent();
                    if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                        C786410Ut5.LJJJLZIJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, viewGroup);
                    }
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
                }
            }
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "dc_release", value.LIZ.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(value.LIZIZ ? 1 : 0), "is_first");
            c1022820ciuLIZLLL.LJII();
        }
        LJFF.clear();
        LJIIIZ = 0;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onDynamicAdReadyEvent(C1000410c8l c1000410c8l) {
        int iHashCode;
        InterfaceC1541990qEH kitView;
        int i = c1000410c8l.LIZ;
        for (C1000400c8k c1000400c8k : LJFF.values()) {
            if (c1000400c8k.LJ) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1000400c8k.LIZLLL;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
                    iHashCode = kitView.hashCode();
                } else {
                    iHashCode = 0;
                }
                if (iHashCode == i) {
                    c1000400c8k.LIZJ = 1;
                    c1000400c8k.LJFF = c1000410c8l.LIZIZ;
                    Aweme aweme = c1000400c8k.LIZ;
                    Video video = aweme.getVideo();
                    if (video != null) {
                        video.setDuration(c1000410c8l.LIZIZ);
                    }
                    C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "dc_ready", aweme.getAwemeRawAd());
                    c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(c1000400c8k.LIZIZ ? 1 : 0), "is_first");
                    c1022820ciuLIZLLL.LIZIZ(Long.valueOf(System.currentTimeMillis() - c1000400c8k.LJI), "time");
                    c1022820ciuLIZLLL.LJII();
                    return;
                }
            }
        }
    }

    public static final void LJII(int i, int i2) throws JSONException {
        InterfaceC1541990qEH kitView;
        LJII = i;
        LJIIIIZZ = i2;
        for (C1000400c8k c1000400c8k : LJFF.values()) {
            if (c1000400c8k.LJ) {
                JSONObject jSONObjectPut = new JSONObject().put("viewPortWidth", i).put("viewPortHeight", i2);
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1000400c8k.LIZLLL;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
                    if (jSONObjectPut == null) {
                        jSONObjectPut = new JSONObject() { // from class: X.0c8m
                        };
                    }
                    kitView.LIZ("onDCViewSize", jSONObjectPut);
                }
            }
        }
    }

    public static void LJIIJJI(String str, boolean z) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        ViewGroup viewGroup;
        if (str == null) {
            return;
        }
        HashMap<String, C1000400c8k> map = LJFF;
        C1000400c8k c1000400c8k = map.get(str);
        if (c1000400c8k != null && c1000400c8k.LJ && c1000400c8k != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1000400c8k.LIZLLL) != null) {
            ViewParent parent = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, viewGroup);
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
            if (z) {
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "dc_release", c1000400c8k.LIZ.getAwemeRawAd());
                c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(c1000400c8k.LIZIZ ? 1 : 0), "is_first");
                c1022820ciuLIZLLL.LJII();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("releaseCacheByAwemeId, awemeId: ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        map.remove(str);
    }

    public static void LJIIL(int i, List list) {
        if (i >= 0 && i < list.size()) {
            Aweme aweme = (Aweme) ListProtector.get(list, i);
            if (!C1017070cZd.LJLJLJ(aweme)) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("trigger release cache, index = ");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
            LJIIJJI(aweme.getAid(), true);
        }
    }

    @Override // X.InterfaceC1000440c8o
    public final void LIZ(Aweme aweme, boolean z) throws JSONException {
        WeakReference<Context> weakReference;
        Context context;
        AwemeRawAd awemeRawAd;
        DynamicVideo dynamicVideo;
        String str;
        SparkContext sparkContext;
        C1029690ctz c1029690ctzLJJIIJZLJL;
        String string;
        String string2;
        if (aweme != null && (weakReference = LJI) != null && (context = weakReference.get()) != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && (dynamicVideo = awemeRawAd.getDynamicVideo()) != null && (str = dynamicVideo.lynxScheme) != null && str.length() != 0) {
            HashMap<String, C1000400c8k> map = LJFF;
            if (map.get(aweme.getAid()) != null) {
                return;
            }
            final C1000400c8k c1000400c8k = new C1000400c8k(aweme, z);
            c1000400c8k.LJ = true;
            map.put(aweme.getAid(), c1000400c8k);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preload start, lynxScheme: ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            c1000400c8k.LJI = System.currentTimeMillis();
            if (c1000400c8k.LJ) {
                Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
                n nVar = new n();
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 != null) {
                    Long adId = awemeRawAd2.getAdId();
                    if (adId != null) {
                        string = adId.toString();
                    } else {
                        string = null;
                    }
                    nVar.LJJIIJ("adId", string);
                    nVar.LJJIIJ("creativeId", awemeRawAd2.getCreativeIdStr());
                    nVar.LJJIIJ("logExtra", awemeRawAd2.getLogExtra());
                    Long groupId = awemeRawAd2.getGroupId();
                    if (groupId != null) {
                        string2 = groupId.toString();
                    } else {
                        string2 = null;
                    }
                    nVar.LJJIIJ("groupId", string2);
                }
                builderBuildUpon.appendQueryParameter("initialData", nVar.toString());
                Bundle bundle = new Bundle();
                C01GW c01gw = LIZLLL;
                InterfaceC1000280c8Y interfaceC1000280c8Y = (InterfaceC1000280c8Y) c01gw.getValue();
                if (interfaceC1000280c8Y != null) {
                    interfaceC1000280c8Y.LJIJJ(context, bundle, aweme);
                }
                IAdSparkUtils iAdSparkUtilsLJFF = AdSparkUtils.LJFF();
                if (iAdSparkUtilsLJFF == null || (sparkContext = iAdSparkUtilsLJFF.LIZJ(context, builderBuildUpon.toString(), bundle, null, false)) == null) {
                    sparkContext = new SparkContext();
                }
                C1541950qED.LIZJ.getClass();
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(context, sparkContext).LIZ(false);
                c1000400c8k.LIZLLL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
                InterfaceC1000280c8Y interfaceC1000280c8Y2 = (InterfaceC1000280c8Y) c01gw.getValue();
                if (interfaceC1000280c8Y2 != null && (c1029690ctzLJJIIJZLJL = interfaceC1000280c8Y2.LJJIIJZLJL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, (String) LJ.getValue(), new AbstractC1024610cln() { // from class: X.0c8j
                    @Override // X.AbstractC1537870q7d
                    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onLoadUriSuccess, uri: ");
                        sbLIZ2.append(interfaceC1541990qEH);
                        C2188811AlT.LIZIZ(sbLIZ2);
                    }

                    @Override // X.AbstractC1537870q7d
                    public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str2, String str3) {
                        C1000400c8k c1000400c8k2 = c1000400c8k;
                        c1000400c8k2.LJII = str3;
                        c1000400c8k2.LJIIIIZZ = true;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onLoadFail error:");
                        sbLIZ2.append(str3);
                        sbLIZ2.append(", uri: ");
                        sbLIZ2.append(str2);
                        C2188811AlT.LIZIZ(sbLIZ2);
                    }
                })) != null) {
                    c1029690ctzLJJIIJZLJL.LIZ(bundle, builderBuildUpon.toString(), C1000150c8L.LIZ().enableDynamicAd);
                }
            }
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "dc_prerender", aweme.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(z ? 1 : 0), "is_first");
            c1022820ciuLIZLLL.LJII();
        }
    }

    public final void LIZJ(Aweme aweme, AObjectS387S0100000_12 aObjectS387S0100000_12) {
        boolean z;
        if (aweme == null || !C1017070cZd.LJLJLJ(aweme)) {
            return;
        }
        C1000400c8k c1000400c8kLJ = LJ(aweme.getAid());
        int i = 0;
        if (c1000400c8kLJ != null && c1000400c8kLJ.LIZJ == 1) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkForFallback ");
        sbLIZ.append(!z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!z) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                awemeRawAd.setDynamicVideo(null);
            }
            aObjectS387S0100000_12.invoke();
            LJIIJJI(aweme.getAid(), false);
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (c1000400c8kLJ == null) {
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "dc_show_failed", awemeRawAd2);
                c1022820ciuLIZLLL.LIZIZ("data_load_fail", "fail_reason");
                c1022820ciuLIZLLL.LIZIZ("dynamicAdCache not found", "error_discription");
                c1022820ciuLIZLLL.LJII();
            } else if (c1000400c8kLJ.LIZLLL == null) {
                C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("draw_ad", "dc_show_failed", awemeRawAd2);
                c1022820ciuLIZLLL2.LIZIZ("data_load_fail", "fail_reason");
                c1022820ciuLIZLLL2.LIZIZ("lynxView is null", "error_discription");
                c1022820ciuLIZLLL2.LJII();
            } else if (c1000400c8kLJ.LJIIIIZZ) {
                C1022820ciu c1022820ciuLIZLLL3 = C2184171Adz.LIZLLL("draw_ad", "dc_show_failed", awemeRawAd2);
                c1022820ciuLIZLLL3.LIZIZ("data_load_fail", "fail_reason");
                c1022820ciuLIZLLL3.LIZIZ(c1000400c8kLJ.LJII, "error_discription");
                c1022820ciuLIZLLL3.LJII();
            } else if (c1000400c8kLJ.LIZJ != 1) {
                C1022820ciu c1022820ciuLIZLLL4 = C2184171Adz.LIZLLL("draw_ad", "dc_show_failed", awemeRawAd2);
                c1022820ciuLIZLLL4.LIZIZ("load_timeout", "fail_reason");
                c1022820ciuLIZLLL4.LJII();
            }
            C1022820ciu c1022820ciuLIZLLL5 = C2184171Adz.LIZLLL("draw_ad", "dc_downgrade", aweme.getAwemeRawAd());
            if (c1000400c8kLJ != null && !c1000400c8kLJ.LIZIZ) {
                i = 1;
            }
            c1022820ciuLIZLLL5.LIZIZ(Integer.valueOf(i ^ 1), "is_first");
            c1022820ciuLIZLLL5.LJII();
        }
    }

    public final void LJIIIZ(int i, List<? extends Aweme> list) throws JSONException {
        if (i >= 0 && i < list.size()) {
            Aweme aweme = (Aweme) ListProtector.get(list, i);
            if (!C1017070cZd.LJLJLJ(aweme)) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("trigger preload again, index = ");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
            LIZ(aweme, false);
        }
    }

    public final void LJIIJ(int i, List<? extends Aweme> list) throws JSONException {
        if (list == null) {
            return;
        }
        int i2 = LJIIIZ;
        if (i > i2) {
            LJIIL(i - ((Number) LIZJ.getValue()).intValue(), list);
            LJIIIZ(LJFF() + i, list);
        } else if (i < i2) {
            LJIIL(((Number) LIZJ.getValue()).intValue() + i, list);
            LJIIIZ(i - LJFF(), list);
        }
        LJIIIZ = i;
    }

    public final void LJIIIIZZ(Aweme aweme, List list, int i) {
        if (aweme != null && C1017070cZd.LJLJLJ(aweme)) {
            LJIIJJI(aweme.getAid(), true);
        }
        LJIIIZ(i + LJFF(), list);
    }
}
