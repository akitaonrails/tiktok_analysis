package X;

import Y.AfS5S2300000_7;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.ApiMonitorSamplingRateDic;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Jzw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C510380Jzw extends C0K02 {
    public static final C510380Jzw LIZ = new C510380Jzw();

    public static final void LJIJJ(String str) {
        JSONObject jSONObject = new JSONObject();
        if (str == null) {
            str = "";
        }
        C0K04.LJFF("show_entrance", str, jSONObject);
        LJIL("subscription_entrance_click", jSONObject);
    }

    public static final void LJIJJLI(String str) {
        JSONObject jSONObject = new JSONObject();
        if (str == null) {
            str = "";
        }
        C0K04.LJFF("show_entrance", str, jSONObject);
        LJIL("subscription_entrance_show", jSONObject);
    }

    public static final void LJIILIIL(long j, Throwable th) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        JSONObject jSONObject = new JSONObject();
        C0K02.LJIIJJI(th, jSONObject);
        C0K04.LJ("cost", jCurrentTimeMillis, jSONObject);
        LJJ("subscription_get_sub_info_failed", jSONObject);
    }

    public static final void LJIJ(long j, Throwable th) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        JSONObject jSONObject = new JSONObject();
        C0K02.LJIIJJI(th, jSONObject);
        C0K04.LJ("cost", jCurrentTimeMillis, jSONObject);
        LJIL("subscription_get_emotes_failed", jSONObject);
    }

    public static final void LJIJI(long j, Throwable th) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        JSONObject jSONObject = new JSONObject();
        C0K02.LJIIJJI(th, jSONObject);
        C0K04.LJ("cost", jCurrentTimeMillis, jSONObject);
        LJIL("subscription_privilege_all_detail_failed", jSONObject);
    }

    public static void LJIL(String str, JSONObject jSONObject) {
        if (C500260Jjc.LJIJ(DataChannelGlobal.LLILZ)) {
            C0K02.LJIIJ(jSONObject);
            C0K04.LJFF("event_id", str, jSONObject);
            C1CC2.LJIIIIZZ("ttlive_client_subscription_live_anchor_monitor", 0, jSONObject);
        } else {
            if (!LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_client_subscription_live_audience_monitor", 0.01d)) {
                return;
            }
            C0K02.LJIIJ(jSONObject);
            C0K04.LJFF("event_id", str, jSONObject);
            C1CC2.LJIILL(0, 1, "ttlive_client_subscription_live_audience_monitor", jSONObject);
        }
    }

    public static void LJJ(String str, JSONObject jSONObject) {
        User user;
        if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_client_subscription_broadcast_monitor")) {
            InterfaceC2262081DgM curUser = ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUser();
            if ((curUser instanceof User) && (user = (User) curUser) != null) {
                long id = user.getId();
                C0K04.LJ("current_user_id", id, jSONObject);
                C0K04.LJ("current_anchor_id", id, jSONObject);
                C0K04.LJIIIZ(jSONObject, "anchor_qualification", User.sSubPermission);
                C0K04.LJIIIIZZ(jSONObject, "device_score", TTliveAnchorDeviceScoreSetting.INSTANCE.getValue());
                C0K04.LJ("network_type", TTNetInit.getEffectiveConnectionType(), jSONObject);
            }
            C0K04.LJFF("event_id", str, jSONObject);
            C1CC2.LJIIIIZZ("ttlive_client_subscription_broadcast_monitor", 0, jSONObject);
        }
    }

    public static final void LJIILL(C474500IjA c474500IjA, C238400w2 c238400w2, String str, String str2, Map map) {
        LJIIZILJ(c474500IjA, c238400w2, str, str2, map);
        c474500IjA.LJJII(Long.valueOf(System.currentTimeMillis() - c238400w2.element), "cost");
    }

    public static final void LJIIZILJ(C474500IjA c474500IjA, C238400w2 c238400w2, String str, String str2, Map map) {
        c474500IjA.LJJII(Long.valueOf(c238400w2.element), "start_time");
        if (str == null) {
            str = "";
        }
        c474500IjA.LJJII(str, "show_entrance");
        if (str2 != null && str2.length() != 0) {
            c474500IjA.LJJII(str2, "path");
        }
        c474500IjA.LJIL();
        c474500IjA.LJJIIZI(map);
    }

    public static C11NZ LJIILJJIL(C11NZ c11nz, final EnumC510330Jzr enumC510330Jzr, final String str, final String str2, final Map map, final Function1 function1) {
        Object c098200Yq;
        String str3;
        boolean z;
        if (enumC510330Jzr == EnumC510330Jzr.GENERAL) {
            try {
                double dNextDouble = AbstractC19994813Le.Default.nextDouble();
                ApiMonitorSamplingRateDic apiMonitorSamplingRateDic = ApiMonitorSamplingRateDic.INSTANCE;
                if (str2 == null) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                if (dNextDouble <= apiMonitorSamplingRateDic.getValue(str3)) {
                    z = true;
                } else {
                    z = false;
                }
                c098200Yq = Boolean.valueOf(z);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Boolean bool = Boolean.TRUE;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = bool;
            }
            if (!((Boolean) c098200Yq).booleanValue()) {
                return c11nz;
            }
        }
        final C238400w2 c238400w2 = new C238400w2();
        return c11nz.LJJIJIL(new AfS5S2300000_7(enumC510330Jzr, str, str2, map, c238400w2, 0)).LJJIJIIJIL(new C09JN() { // from class: X.0Jzv
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("SubscribeMonitor@400b.monitorMetricsForApiObservable$3");
                BaseResponse baseResponse = (BaseResponse) obj;
                String str4 = "";
                if (function1.invoke((C470590Icr<T>) baseResponse).booleanValue()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("livesdk_subscription_");
                    sbLIZ.append(enumC510330Jzr.getEvent());
                    sbLIZ.append("_succeed_new");
                    C474500IjA c474500IjALIZ = C0IJT.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    C510380Jzw.LJIILL(c474500IjALIZ, c238400w2, str, str2, map);
                    c474500IjALIZ.LJJII(baseResponse.LIZIZ, "logid");
                    c474500IjALIZ.LIZ();
                    int i = C510350Jzt.LIZ[enumC510330Jzr.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                long j = c238400w2.element;
                                String str5 = baseResponse.LIZIZ;
                                long jCurrentTimeMillis = System.currentTimeMillis() - j;
                                JSONObject jSONObject = new JSONObject();
                                if (str5 != null) {
                                    str4 = str5;
                                }
                                C0K04.LJFF("response", str4, jSONObject);
                                C0K04.LJ("cost", jCurrentTimeMillis, jSONObject);
                                C510380Jzw.LJIL("subscription_privilege_all_detail_succeed", jSONObject);
                            }
                        } else {
                            long j2 = c238400w2.element;
                            String str6 = baseResponse.LIZIZ;
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - j2;
                            JSONObject jSONObject2 = new JSONObject();
                            if (str6 != null) {
                                str4 = str6;
                            }
                            C0K04.LJFF("response", str4, jSONObject2);
                            C0K04.LJ("cost", jCurrentTimeMillis2, jSONObject2);
                            C510380Jzw.LJIL("subscription_get_emotes_succeed", jSONObject2);
                        }
                    } else {
                        long j3 = c238400w2.element;
                        String str7 = baseResponse.LIZIZ;
                        long jCurrentTimeMillis3 = System.currentTimeMillis() - j3;
                        JSONObject jSONObject3 = new JSONObject();
                        if (str7 != null) {
                            str4 = str7;
                        }
                        C0K04.LJFF("response", str4, jSONObject3);
                        C0K04.LJ("cost", jCurrentTimeMillis3, jSONObject3);
                        C510380Jzw.LJJ("subscription_get_sub_info_succeed", jSONObject3);
                    }
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("livesdk_subscription_");
                    sbLIZ2.append(enumC510330Jzr.getEvent());
                    sbLIZ2.append("_failed_new");
                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    C510380Jzw.LJIILL(c474500IjALIZ2, c238400w2, str, str2, map);
                    c474500IjALIZ2.LJJII(baseResponse.LIZIZ, "logid");
                    C1811850xFX c1811850xFX = new C1811850xFX(100010001, 0, "");
                    JSONObject jSONObject4 = new JSONObject();
                    C0K02.LJIIJJI(c1811850xFX, jSONObject4);
                    Iterator<String> itKeys = jSONObject4.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        try {
                            c474500IjALIZ2.LJJII(jSONObject4.get(next), next);
                            C189200o6.m2constructorimpl(c474500IjALIZ2);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            C189200o6.m2constructorimpl(new C098200Yq(th2));
                        }
                    }
                    c474500IjALIZ2.LIZ();
                    int i2 = C510350Jzt.LIZ[enumC510330Jzr.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                C510380Jzw.LJIJI(c238400w2.element, c1811850xFX);
                            }
                        } else {
                            C510380Jzw.LJIJ(c238400w2.element, c1811850xFX);
                        }
                    } else {
                        C510380Jzw.LJIILIIL(c238400w2.element, c1811850xFX);
                    }
                }
                C1C7U.LIZIZ("SubscribeMonitor@400b.monitorMetricsForApiObservable$3");
            }
        }).LJJIJIIJI(new AfS5S2300000_7(enumC510330Jzr, str, str2, map, c238400w2, 1)).LJJIIZ(new InterfaceC781210Ukh() { // from class: X.0Jzx
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("livesdk_subscription_");
                sbLIZ.append(enumC510330Jzr.getEvent());
                sbLIZ.append("_failed_new");
                C474500IjA c474500IjALIZ = C0IJT.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                C510380Jzw.LJIILL(c474500IjALIZ, c238400w2, str, str2, map);
                Map<String, String> map2 = map;
                if (map2.containsKey("cancelledKey")) {
                    c474500IjALIZ.LJJII(map2.get("cancelledKey"), "error_code");
                }
                c474500IjALIZ.LIZ();
            }
        });
    }
}
