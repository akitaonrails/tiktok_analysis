package X;

import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.bytedance.scene.Scene;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Dg8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261941Dg8 {
    public static long LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static long LJI;
    public static long LJII;
    public static volatile ScheduledFuture<?> LJIIIZ;
    public static volatile boolean LJIIJ;
    public static long LJIIL;
    public static long LJIILIIL;
    public static boolean LJIILJJIL;
    public static final C2261941Dg8 LIZ = new C2261941Dg8();
    public static boolean LIZIZ = C2214201BlK.LJIIJJI;
    public static EnumC2261951Dg9 LJIIIIZZ = EnumC2261951Dg9.UNKNOWN;
    public static final CopyOnWriteArrayList<Integer> LJIIJJI = new CopyOnWriteArrayList<>();
    public static final C01GW LJIILL = C452501pT.LIZIZ(new C2175831ADl());
    public static final C01GW LJIILLIIL = C452501pT.LIZIZ(new C1783970wWZ());

    public final synchronized void LIZLLL() {
        if (LJIIJ) {
            return;
        }
        C845400XEk.LIZIZ("WsOnlineRateMonitor", "[init]");
        if (LJII == 0) {
            LJII = C202094145s.LJII;
        }
        if (!LJIIJ) {
            C845400XEk.LIZIZ("WsOnlineRateMonitor", "[registerObserver]");
            C2214201BlK.LIZLLL().LJJLJLI(C2176191AEv.LL);
        }
        LJI(EnumC1781820wT6.ALL, new C0XGL());
        LJIIL(System.currentTimeMillis(), "record_date");
        LJII();
        LJIIJJI(this);
        LJIIJ = true;
    }

    public static Keva LIZIZ() {
        return (Keva) LJIILL.getValue();
    }

    public static HashMap LIZJ() {
        return (HashMap) LJIILLIIL.getValue();
    }

    public static boolean LJ() {
        return LJIIIIZZ == EnumC2261951Dg9.BACKGROUND_CONNECTED || LJIIIIZZ == EnumC2261951Dg9.FOREGROUND_CONNECTED;
    }

    public static void LJII() {
        if (LJIIIZ != null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[startRecordLoop], isAppBackground = ");
        sbLIZ.append(LIZIZ);
        C845400XEk.LIZIZ("WsOnlineRateMonitor", C2188811AlT.LIZIZ(sbLIZ));
        LJIIIZ = C823050WQl.LJ().scheduleAtFixedRate(RunnableC2176201AEw.LL, 60L, 60L, TimeUnit.SECONDS);
    }

    public static void LJIIJJI(C2261941Dg8 c2261941Dg8) {
        int value = LJIIIIZZ.getValue();
        c2261941Dg8.getClass();
        C20648087a.LIZ(new C0XGM(value));
    }

    public final void LJFF(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[recordStartConnection], isActivelyClosed = ");
        sbLIZ.append(LJIILJJIL);
        sbLIZ.append(", enterFrom = ");
        sbLIZ.append(str);
        C845400XEk.LIZIZ("WsOnlineRateMonitor", C2188811AlT.LIZIZ(sbLIZ));
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (LJI == 0) {
            long j = jUptimeMillis - LJII;
            LJI = j;
            LJIIL(j, "prepare_time");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[recordPrepareTime], prepareTime = ");
            sbLIZ2.append(LJI);
            C845400XEk.LIZIZ("WsOnlineRateMonitor", C2188811AlT.LIZIZ(sbLIZ2));
            if (LIZIZ) {
                LJIIIIZZ = EnumC2261951Dg9.BACKGROUND_DISCONNECTED;
                LJFF = jUptimeMillis;
            } else {
                LJIIIIZZ = EnumC2261951Dg9.FOREGROUND_DISCONNECTED;
                LJ = jUptimeMillis;
            }
            LJIIJJI(this);
        }
        if (!LJIILJJIL) {
            return;
        }
        LJIILJJIL = false;
        if (LJ()) {
            return;
        }
        C20648087a.LIZ(new C2261961DgA(jUptimeMillis));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f9, code lost:
    
        if (LIZIZ().getInt("if_once_connected", 0) == 1) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(X.EnumC1781820wT6 r53, kotlin.jvm.functions.Function1 r54) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2261941Dg8.LJI(X.0wT6, kotlin.jvm.functions.Function1):void");
    }

    public static void LJIIJ(EnumC1781820wT6 enumC1781820wT6, long j) {
        Integer numValueOf;
        EnumC2261951Dg9 enumC2261951Dg9;
        HashMap map = (HashMap) LIZJ().get(enumC1781820wT6);
        if (map != null) {
            Long l = (Long) map.get("scene_start_event");
            if (l != null) {
                numValueOf = Integer.valueOf((int) l.longValue());
            } else {
                numValueOf = null;
            }
            Long l2 = (Long) map.get("scene_start_time");
            if (numValueOf != null && l2 != null) {
                long jLongValue = j - l2.longValue();
                int iIntValue = numValueOf.intValue();
                EnumC2261951Dg9[] enumC2261951Dg9ArrValues = EnumC2261951Dg9.values();
                int length = enumC2261951Dg9ArrValues.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        enumC2261951Dg9 = enumC2261951Dg9ArrValues[i];
                        if (enumC2261951Dg9.getValue() == iIntValue) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        enumC2261951Dg9 = EnumC2261951Dg9.UNKNOWN;
                        break;
                    }
                }
                String strField = enumC2261951Dg9.field();
                map.put(strField, Long.valueOf(jLongValue));
                map.remove("scene_start_event");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[storeFirstDurationForSingleScene], scene = ");
                sbLIZ.append(enumC1781820wT6);
                sbLIZ.append(", eventName = ");
                sbLIZ.append(strField);
                sbLIZ.append(", currentTime = ");
                sbLIZ.append(j);
                sbLIZ.append(", startTime = ");
                sbLIZ.append(l2);
                sbLIZ.append(", duration = ");
                sbLIZ.append(jLongValue);
                C845400XEk.LIZIZ("WsOnlineRateMonitor", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public static void LJIIL(long j, String str) {
        C20648087a.LIZ(new C2261931Dg7(str, j));
    }

    public static void LJIIIIZZ(long j, long j2, String str) {
        for (EnumC1781820wT6 enumC1781820wT6 : LIZJ().keySet()) {
            LIZ.getClass();
            HashMap map = (HashMap) LIZJ().get(enumC1781820wT6);
            if (map != null && map.containsKey("scene_start_event")) {
                LJIIJ(enumC1781820wT6, j);
            } else {
                LJIIIZ(enumC1781820wT6, str, j, j2);
            }
        }
    }

    public static void LJIIIZ(EnumC1781820wT6 enumC1781820wT6, String str, long j, long j2) {
        long jLongValue;
        HashMap map = (HashMap) LIZJ().get(enumC1781820wT6);
        if (map != null) {
            long j3 = j - j2;
            Long l = (Long) map.get(str);
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            map.put(str, Long.valueOf(jLongValue + j3));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[storeDurationForSingleScene], scene = ");
            sbLIZ.append(enumC1781820wT6);
            sbLIZ.append(", eventName = ");
            sbLIZ.append(str);
            sbLIZ.append(", currentTime = ");
            sbLIZ.append(j);
            sbLIZ.append(", startTime = ");
            sbLIZ.append(j2);
            sbLIZ.append(", duration = ");
            sbLIZ.append(j3);
            C845400XEk.LIZIZ("WsOnlineRateMonitor", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static final void LIZ(EnumC1781820wT6 enumC1781820wT6, long j, long j2, long j3, long j4, long j5, long j6, int i) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Scene.SCENE_SERVICE, enumC1781820wT6.getValue());
        jSONObject.put("error_status_code", i);
        if (enumC1781820wT6 == EnumC1781820wT6.ALL) {
            LIZ.getClass();
            jSONObject.put("if_once_connected", LIZIZ().getInt("if_once_connected", 0));
            String strLJJIFFI = u.LJJIFFI(LIZIZ().getString("extra_info", ""), " ", "", false);
            if (strLJJIFFI.length() <= 30) {
                jSONObject.put("extra_info", strLJJIFFI);
            } else {
                jSONObject.put("extra_info", strLJJIFFI.substring(0, 30));
            }
        }
        jSONObject.put("foreground_online_time", j);
        jSONObject.put("foreground_offline_time", j2);
        jSONObject.put("background_online_time", j3);
        jSONObject.put("background_offline_time", j4);
        jSONObject.put("prepare_time", j5);
        jSONObject.put("total_time", j6);
        C20684815ws.LJIJ("ws_error_msg", jSONObject);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[checkIfDataValid], report fail, scene = ");
        sbLIZ.append(enumC1781820wT6);
        sbLIZ.append(", errorCode = ");
        sbLIZ.append(i);
        sbLIZ.append(", reportJson = ");
        sbLIZ.append(jSONObject);
        C845400XEk.LIZIZ("WsOnlineRateMonitor", C2188811AlT.LIZIZ(sbLIZ));
    }
}
