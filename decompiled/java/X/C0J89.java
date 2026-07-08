package X;

import android.app.Activity;
import android.os.Message;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDedupOptExp;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ab.TopGifterColdStartConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.feedpage.LiveStateApi;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS193S0000000_7;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.api.room.FrequencyGroup;
import webcast.api.room.StrategyData;

/* JADX INFO: renamed from: X.0J89, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J89 {
    public static volatile boolean LJ;
    public static volatile Message LJFF;
    public static volatile boolean LJI;
    public static long LJII;
    public static Aweme LJIIIIZZ;
    public static WeakReference<C0J8J> LJIILJJIL;
    public static final C0J89 LIZ = new C0J89();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(142));
    public static volatile C0J8B LIZJ = C0J8B.IDLE;
    public static volatile C0J8D LIZLLL = C0J8D.IDLE;
    public static boolean LJIIIZ = true;
    public static final Set<String> LJIIJ = new LinkedHashSet();
    public static final Set<Integer> LJIIJJI = new LinkedHashSet();
    public static final C01GW LJIIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(143));
    public static final C01GW LJIILIIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(141));

    public static Map LIZ() {
        FrequencyGroup frequencyGroup;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        StrategyData strategyData = (StrategyData) LJIIL.getValue();
        if (strategyData != null && (frequencyGroup = strategyData.globalFrequency) != null) {
            long j = ((TopGifterColdStartConfig) C0J8K.LIZIZ.getValue()).timeout;
            linkedHashMap.put("set_frequency_param", String.valueOf(frequencyGroup.dailyCount));
            linkedHashMap.put("set_time_gap_param", String.valueOf(frequencyGroup.triggerGap));
            linkedHashMap.put("set_hot_request_ns_param", String.valueOf(j));
        }
        return linkedHashMap;
    }

    public static Keva LIZIZ() {
        return (Keva) LJIILIIL.getValue();
    }

    public static void LJII() throws JSONException {
        Aweme aweme;
        if (LiveDedupOptExp.INSTANCE.disableUnread() || (aweme = LJIIIIZZ) == null) {
            return;
        }
        LIZ.getClass();
        LiveStateApi liveStateApi = (LiveStateApi) LIZIZ.getValue();
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("channel_id", 112);
        jSONObject.put("req_from", "fyp_preview_live_unread");
        jSONObject.put("gen_time", jCurrentTimeMillis);
        jSONObject.put("is_backup", 0);
        liveStateApi.collectUnreadRequest(C786410Ut5.J3(jSONObject), aweme.getAid()).LJJLL(new C09JN() { // from class: X.0J8F
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("ColdStartLiveReloadManager@e897.unRead$1$1");
                C1C7U.LIZIZ("ColdStartLiveReloadManager@e897.unRead$1$1");
            }
        }, new C09JN() { // from class: X.0J8G
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("ColdStartLiveReloadManager@e897.unRead$1$2");
                C1C7U.LIZIZ("ColdStartLiveReloadManager@e897.unRead$1$2");
            }
        });
    }

    public static void LJI() {
        long j = LIZIZ().getLong("live_last_timestamp", 0L);
        long j2 = LIZIZ().getLong("live_day_count", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (C963140bAe.LIZLLL(j, jCurrentTimeMillis)) {
            LIZIZ().storeLong("live_day_count", j2 + 1);
        } else {
            LIZIZ().storeLong("live_day_count", 1L);
        }
        LIZIZ().storeLong("live_last_timestamp", jCurrentTimeMillis);
    }

    public static void LJ(int i) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(LIZ());
        c2344009Gk.LJIIIIZZ("user_id", ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
        c2344009Gk.LIZJ(i, "failed_reason");
        C20684815ws.LJIILLIIL("livesdk_strategy_top_gifter_launch_failed", c2344009Gk.LIZ);
    }

    public static void LJFF(boolean z) {
        boolean z2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notifyData:  ");
        sbLIZ.append(LIZLLL);
        sbLIZ.append("     ");
        sbLIZ.append(LIZJ);
        sbLIZ.append("    ");
        boolean z3 = true;
        if (LJIILJJIL == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ.append(z2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (LJ) {
            if (LJFF != null) {
                LIZJ(false, LJFF, null);
            }
            if (z) {
                LJII();
                return;
            }
            return;
        }
        if (z) {
            int i = C0J8C.LIZ[LIZLLL.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            LJII();
                            return;
                        }
                        throw new C1954807lC();
                    }
                    if (LIZJ == C0J8B.SUCCESS) {
                        LJI();
                    } else {
                        z3 = false;
                        LJII();
                    }
                    LIZJ(z3, LJFF, LJIIIIZZ);
                    return;
                }
                LJII();
                return;
            }
            return;
        }
        int i2 = C0J8C.LIZIZ[LIZJ.ordinal()];
        if (i2 == 1) {
            return;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 == 5) {
                        LIZJ(false, LJFF, LJIIIIZZ);
                        return;
                    }
                    throw new C1954807lC();
                }
                LIZJ(false, LJFF, LJIIIIZZ);
                return;
            }
            LIZJ(true, LJFF, LJIIIIZZ);
            LJI();
            return;
        }
        LIZLLL = C0J8D.DIRECT_UPDATE;
    }

    public static void LIZLLL(int i, int i2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(LIZ());
        c2344009Gk.LJIIIIZZ("user_id", ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
        c2344009Gk.LIZJ(i, "failed_reason");
        c2344009Gk.LIZJ(i2, "is_request_failed");
        C20684815ws.LJIILLIIL("livesdk_strategy_top_gifter_hot_request_failed", c2344009Gk.LIZ);
    }

    public static void LIZJ(boolean z, Message message, Aweme aweme) {
        boolean z2;
        boolean z3;
        C0J8J c0j8j;
        boolean z4 = false;
        if (z && ((TopGifterColdStartConfig) C0J8K.LIZIZ.getValue()).prePullStream) {
            List listSingletonList = Collections.singletonList(aweme);
            C1ACY c1acy = C1ACY.LIZ;
            Activity activityLIZ = C2421209eE.LIZ();
            c1acy.getClass();
            C1ACY.LJIIJJI(0, activityLIZ, listSingletonList, true);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("invokeCallback: ");
        sbLIZ.append(z);
        sbLIZ.append("     ");
        if (message == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ.append(z2);
        sbLIZ.append("    ");
        if (aweme == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        sbLIZ.append(z3);
        sbLIZ.append("  ");
        WeakReference<C0J8J> weakReference = LJIILJJIL;
        if (weakReference == null || weakReference.get() == null) {
            z4 = true;
        }
        sbLIZ.append(z4);
        C2188811AlT.LIZIZ(sbLIZ);
        WeakReference<C0J8J> weakReference2 = LJIILJJIL;
        if (weakReference2 != null && (c0j8j = weakReference2.get()) != null) {
            c0j8j.LIZ(z, message, aweme);
        }
        LJI = true;
    }
}
