package X;

import android.app.ActivityManager;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.livesdk.dataChannel.BroadcastShareScreenDefinition;
import com.bytedance.android.livesdk.game.broadcast.setting.MobileGameFeedbackAnalyseInfo;
import com.bytedance.android.livesdk.livesetting.broadcast.GameLiveAnchorBlackCheckConfigSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0UVz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C773530UVz {
    public static C0UW9 LIZLLL;
    public static ActivityManager LJIJ;
    public static volatile C0UW2 LJIJJLI;
    public static InterfaceC420801kM LJJ;
    public static final C773530UVz LIZ = new C773530UVz();
    public static final Object LIZIZ = new Object();
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final AtomicLong LJ = new AtomicLong(0);
    public static final AtomicLong LJFF = new AtomicLong(0);
    public static final List<Long> LJI = Collections.synchronizedList(new ArrayList());
    public static final List<Long> LJII = Collections.synchronizedList(new ArrayList());
    public static final List<Long> LJIIIIZZ = Collections.synchronizedList(new ArrayList());
    public static final List<Pair<Float, Boolean>> LJIIIZ = Collections.synchronizedList(new ArrayList());
    public static final List<Boolean> LJIIJ = Collections.synchronizedList(new ArrayList());
    public static final List<Boolean> LJIIJJI = Collections.synchronizedList(new ArrayList());
    public static final List<Long> LJIIL = Collections.synchronizedList(new ArrayList());
    public static final List<Integer> LJIILIIL = Collections.synchronizedList(new ArrayList());
    public static final List<Double> LJIILJJIL = Collections.synchronizedList(new ArrayList());
    public static final List<Double> LJIILL = Collections.synchronizedList(new ArrayList());
    public static final List<Double> LJIILLIIL = Collections.synchronizedList(new ArrayList());
    public static final List<Long> LJIIZILJ = Collections.synchronizedList(new ArrayList());
    public static final AtomicBoolean LJIJI = new AtomicBoolean(false);
    public static final AtomicBoolean LJIJJ = new AtomicBoolean(false);
    public static final AtomicBoolean LJIL = new AtomicBoolean(false);

    public final synchronized C0UW2 LJII() {
        C0UW2 c0uw2;
        if (LJIJJLI != null) {
            c0uw2 = LJIJJLI;
        } else {
            c0uw2 = new C0UW2();
            LIZIZ(c0uw2);
            LJIJJLI = c0uw2;
        }
        return c0uw2;
    }

    public final synchronized void LJIIIZ() {
        Map<String, Object> map = C1338270kvh.LIZ;
        LJIJI.set(false);
        LJIL.set(false);
        LJ.set(0L);
        LJI.clear();
        LJII.clear();
        LJIIIIZZ.clear();
        LJIIIZ.clear();
        LJIIJ.clear();
        LJIIJJI.clear();
        LJIIL.clear();
        LJIILIIL.clear();
        LJIILJJIL.clear();
        LJIILL.clear();
        LJIILLIIL.clear();
        LJIIZILJ.clear();
        InterfaceC420801kM interfaceC420801kM = LJJ;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        LJJ = null;
    }

    public static void LJIIJJI() {
        Double d;
        Double d2;
        C1163660gO4.LIZ.getClass();
        Double d3 = (Double) C1163660gO4.LIZ("livesdk_game_broadcast_feedback_diagnose").get("cpu_rate");
        Double dValueOf = Double.valueOf(0.0d);
        double d4 = -999.0d;
        LJIILLIIL.add(Double.valueOf(((d3 != null && d3.equals(dValueOf)) || (d2 = (Double) C1163660gO4.LIZ("livesdk_game_broadcast_feedback_diagnose").get("cpu_rate")) == null) ? -999.0d : d2.doubleValue()));
        Double d5 = (Double) C1163660gO4.LIZ("livesdk_game_broadcast_feedback_diagnose").get("cpu_speed");
        double dDoubleValue = ((d5 == null || !d5.equals(dValueOf)) && (d = (Double) C1163660gO4.LIZ("livesdk_game_broadcast_feedback_diagnose").get("cpu_speed")) != null) ? d.doubleValue() : -999.0d;
        LJIILJJIL.add(Double.valueOf(dDoubleValue));
        int iLJ = C1305320k4Y.LJ(C497740JfY.LJII());
        if (iLJ != -999 && dDoubleValue != -999.0d) {
            d4 = dDoubleValue / ((double) iLJ);
        }
        LJIILL.add(Double.valueOf(d4));
    }

    public static void LJIIL() {
        C1300340jwW c1300340jwW = C476230Ilx.LIZ;
        double dLJ = (c1300340jwW.LJ() <= 0 || c1300340jwW.LJI() <= 0) ? -999.0d : ((double) c1300340jwW.LJ()) / ((double) c1300340jwW.LJI());
        int power_low = MobileGameFeedbackAnalyseInfo.INSTANCE.getValue().getPower_low();
        if (dLJ < 0.0d || dLJ * ((double) 100) >= power_low) {
            LJIIJJI.add(Boolean.FALSE);
        } else {
            LJIIJJI.add(Boolean.TRUE);
        }
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    public static void LJFF(JSONArray jSONArray) {
        Integer numValueOf;
        boolean z;
        String str;
        C0UWB c0uwb = (C0UWB) DataChannelGlobal.LLILZ.gg0(C931300aLI.class);
        Integer numValueOf2 = null;
        if (c0uwb != null) {
            numValueOf = Integer.valueOf(c0uwb.LIZ);
            numValueOf2 = Integer.valueOf(c0uwb.LIZIZ);
        } else {
            numValueOf = null;
        }
        C0UW9 c0uw9 = LIZLLL;
        int i = 0;
        if (c0uw9 != null && (c0uw9.LJIIIIZZ == 1 || c0uw9.LJIIIIZZ == 2)) {
            z = true;
        } else {
            z = false;
        }
        if (numValueOf != null && numValueOf.intValue() != 10001) {
            Map<Integer, String> map = C0UWE.LIZ;
            if (numValueOf.intValue() != 10002 && numValueOf.intValue() != 10003 && numValueOf.intValue() != 10004 && numValueOf.intValue() != 10006 && numValueOf.intValue() != 10007 && numValueOf.intValue() != 10009 && numValueOf.intValue() != 10010) {
                if (numValueOf.intValue() == 4 || numValueOf.intValue() == 107 || (numValueOf.intValue() == 20001 && numValueOf2 != null && numValueOf2.intValue() == -1)) {
                    str = "network_interrupt";
                } else if (C0UWE.LIZJ(numValueOf.intValue(), numValueOf2)) {
                    str = "android_battery_opt";
                } else {
                    str = "other";
                }
            } else {
                str = "business_interrupt";
            }
        } else if (z) {
            str = "android_process_kill";
        } else {
            str = "";
            String strValueOf = String.valueOf(i);
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            jSONArray.put(LIZ("diagnose_live_interrupt", strValueOf, arrayList));
        }
        i = 1;
        String strValueOf2 = String.valueOf(i);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(str);
        jSONArray.put(LIZ("diagnose_live_interrupt", strValueOf2, arrayList2));
    }

    public static void LJIIJ(JSONObject jSONObject) {
        long j;
        int i;
        if (GameLiveAnchorBlackCheckConfigSetting.INSTANCE.getValue().getEnable()) {
            try {
                j = JSONObjectProtectorUtils.getLong(jSONObject, "real_bitrate");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                j = -1;
            }
            try {
                i = JSONObjectProtectorUtils.getInt(jSONObject, "in_cap_fps");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                i = -1;
            }
            Map<String, Object> map = C1338270kvh.LIZ;
            if (j != -1 && i != -1) {
                synchronized (C19377810rY.LIZ) {
                    C19377810rY.LIZIZ(i);
                    C19377810rY.LIZJ(i, j);
                    C19377810rY.LIZ(j);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LIZIZ(X.C0UW2 r15) {
        /*
            Method dump skipped, instruction units count: 979
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C773530UVz.LIZIZ(X.0UW2):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(org.json.JSONArray r16, X.C0UW2 r17) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C773530UVz.LIZJ(org.json.JSONArray, X.0UW2):void");
    }

    public static void LIZLLL(JSONArray jSONArray, C0UW2 c0uw2) {
        int i;
        String str = "";
        if (LIZLLL != null) {
            MobileGameFeedbackAnalyseInfo mobileGameFeedbackAnalyseInfo = MobileGameFeedbackAnalyseInfo.INSTANCE;
            float real_fps_proportion = mobileGameFeedbackAnalyseInfo.getValue().getReal_fps_proportion();
            long real_fps_size = mobileGameFeedbackAnalyseInfo.getValue().getReal_fps_size();
            double d = c0uw2.LJFF;
            double d2 = c0uw2.LJIIIIZZ;
            boolean z = c0uw2.LJIIIZ;
            if (d < real_fps_size) {
                if (LJIJI.get()) {
                    str = "low_avg_real_framerate";
                    i = 1;
                }
                i = 0;
            } else if (d2 >= real_fps_proportion) {
                if (LJIJI.get()) {
                    str = "large_part_of_low_real_framerate";
                    i = 1;
                }
                i = 0;
            } else {
                if (z && LJIJI.get()) {
                    str = "continuous_low_framerate_for_long_time";
                    i = 1;
                }
                i = 0;
            }
            synchronized (LIZIZ) {
                try {
                    c0uw2.LJJIJIIJI = i;
                    c0uw2.LJJIJIIJIL = str;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C773530UVz c773530UVz = LIZ;
            String strValueOf = String.valueOf(i);
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            c773530UVz.getClass();
            if (jSONArray.put(LIZ("diagnose_video_framerate", strValueOf, arrayList)) != null) {
                return;
            }
        }
        synchronized (LIZIZ) {
            try {
                c0uw2.LJJIJIIJI = 0;
                c0uw2.LJJIJIIJIL = "";
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        jSONArray.put(LIZ("diagnose_video_framerate", CardStruct.IStatusCode.DEFAULT, null));
    }

    public static void LJ(JSONArray jSONArray, C0UW2 c0uw2) {
        boolean z;
        int i;
        String str = "";
        MobileGameFeedbackAnalyseInfo mobileGameFeedbackAnalyseInfo = MobileGameFeedbackAnalyseInfo.INSTANCE;
        long rtt_size = mobileGameFeedbackAnalyseInfo.getValue().getRtt_size();
        long ping_value = mobileGameFeedbackAnalyseInfo.getValue().getPing_value();
        float ping_high_proportion = mobileGameFeedbackAnalyseInfo.getValue().getPing_high_proportion();
        long ping_number = mobileGameFeedbackAnalyseInfo.getValue().getPing_number();
        if (LIZLLL != null) {
            float f = c0uw2.LJIILL;
            int i2 = c0uw2.LJIILJJIL;
            float f2 = c0uw2.LJIILLIIL;
            double d = c0uw2.LJIIJJI;
            boolean z2 = c0uw2.LJIIL;
            if (c0uw2.LIZ < r1.LIZJ) {
                z = true;
            } else {
                z = false;
            }
            if (i2 >= ping_number) {
                if (f > ping_value || f2 > ping_high_proportion) {
                    if (z) {
                        str = "ping_abnormal_values_and_poor_live_and_game";
                    } else {
                        str = "ping_abnormal_values_and_live_preemption_game_bandwidth";
                    }
                    i = 1;
                }
                i = 0;
            } else {
                if (d > rtt_size) {
                    str = "high_avg_push_rtt";
                } else {
                    if (z2) {
                        str = "continuous_high_push_rtt_for_long_time";
                    }
                    i = 0;
                }
                i = 1;
            }
            synchronized (LIZIZ) {
                try {
                    c0uw2.LJJIJIL = i;
                    c0uw2.LJJIJL = str;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C773530UVz c773530UVz = LIZ;
            String strValueOf = String.valueOf(i);
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            c773530UVz.getClass();
            if (jSONArray.put(LIZ("diagnose_push_stream_network", strValueOf, arrayList)) != null) {
                return;
            }
        }
        synchronized (LIZIZ) {
            try {
                c0uw2.LJJIJIL = 0;
                c0uw2.LJJIJL = "";
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        jSONArray.put(LIZ("diagnose_push_stream_network", CardStruct.IStatusCode.DEFAULT, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(org.json.JSONArray r10, X.C0UW2 r11) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C773530UVz.LJI(org.json.JSONArray, X.0UW2):void");
    }

    public final synchronized void LJIIIIZZ(DataChannel dataChannel, C0UW2 c0uw2) {
        String str;
        String str2;
        String str3;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        Long lValueOf;
        String string7;
        String string8;
        String string9;
        Double dValueOf;
        Double dValueOf2;
        long j;
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        long jLongValue4;
        long jLongValue5;
        C779130UhL c779130UhL = (C779130UhL) ((LinkedHashMap) C0UW6.LIZ).get(C0UW5.HIGH_PING_TIPS_MODULE);
        if (c779130UhL != null && c779130UhL.LIZIZ.get()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        PushStreamInfo.Quality quality = (PushStreamInfo.Quality) dataChannelGlobal.gg0(BroadcastShareScreenDefinition.class);
        Integer numValueOf = null;
        if (quality != null) {
            str2 = quality.sdkKey;
        } else {
            str2 = null;
        }
        if (C772710USv.LIZLLL()) {
            str3 = "manual_speedtest";
        } else if (C772710USv.LIZJ()) {
            str3 = "auto_speedtest";
        } else {
            Map<String, String> mapLIZIZ = InterfaceC772390URp.p.LIZIZ();
            if (mapLIZIZ != null && !mapLIZIZ.isEmpty()) {
                str3 = "selected";
            } else {
                str3 = "default";
            }
        }
        String strLIZIZ = InterfaceC772390URp.q.LIZIZ();
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        String strLIZIZ2 = InterfaceC772390URp.r.LIZIZ();
        if (strLIZIZ2 == null) {
            strLIZIZ2 = "";
        }
        if (strLIZIZ.length() > 0 && strLIZIZ2.length() > 0) {
            str2 = strLIZIZ;
            str3 = strLIZIZ2;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_broadcast_core_live_info_for_feedback");
        c474500IjALIZ.LJIJJLI(dataChannel);
        if (c0uw2 == null || (string = Double.valueOf(c0uw2.LJJIIJ).toString()) == null) {
            string = "";
        }
        c474500IjALIZ.LJJII(string, "low_battery_proportion");
        if (c0uw2 == null || (string2 = Double.valueOf(c0uw2.LJJIII).toString()) == null) {
            string2 = "";
        }
        c474500IjALIZ.LJJII(string2, "power_save_mode_proportion");
        if (c0uw2 == null || (string3 = Integer.valueOf(c0uw2.LJ * 5).toString()) == null) {
            string3 = "";
        }
        c474500IjALIZ.LJJII(string3, "low_push_bitrate_max_continuous_duration");
        if (c0uw2 == null || (string4 = Double.valueOf(c0uw2.LIZJ).toString()) == null) {
            string4 = "";
        }
        c474500IjALIZ.LJJII(string4, "low_push_bitrate_proportion");
        if (c0uw2 == null || (string5 = Double.valueOf(c0uw2.LJIIIIZZ).toString()) == null) {
            string5 = "";
        }
        c474500IjALIZ.LJJII(string5, "low_push_framerate_proportion");
        if (c0uw2 == null || (string6 = Integer.valueOf(c0uw2.LJIIJ * 5).toString()) == null) {
            string6 = "";
        }
        c474500IjALIZ.LJJII(string6, "low_push_framerate_max_continuous_duration");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        C0UW9 c0uw9 = LIZLLL;
        if (c0uw9 != null) {
            lValueOf = Long.valueOf(c0uw9.LIZIZ);
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "room_id");
        if (c0uw2 == null || (string7 = Double.valueOf(c0uw2.LJIIJJI).toString()) == null) {
            string7 = "";
        }
        c474500IjALIZ.LJJII(string7, "avg_push_rtt");
        if (c0uw2 == null || (string8 = Integer.valueOf(c0uw2.LJIILIIL * 5).toString()) == null) {
            string8 = "";
        }
        c474500IjALIZ.LJJII(string8, "high_push_rtt_max_continuous_duration");
        if (c0uw2 == null || (string9 = Integer.valueOf(c0uw2.LJJII * 5).toString()) == null) {
            string9 = "";
        }
        c474500IjALIZ.LJJII(string9, "high_temperature_max_continuous_duration");
        if (c0uw2 != null) {
            dValueOf = Double.valueOf(c0uw2.LIZ);
        } else {
            dValueOf = null;
        }
        c474500IjALIZ.LJJIII("real_bitrate_avg", dValueOf);
        if (c0uw2 != null) {
            dValueOf2 = Double.valueOf(c0uw2.LJFF);
        } else {
            dValueOf2 = null;
        }
        c474500IjALIZ.LJJIII("real_video_framerate_avg", dValueOf2);
        long jLongValue6 = 0;
        if (c0uw2 != null) {
            j = c0uw2.LJJIZ;
        } else {
            j = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(j), "live_duration");
        if (c0uw2 != null) {
            fValueOf = Float.valueOf(c0uw2.LJJJ);
        } else {
            fValueOf = null;
        }
        c474500IjALIZ.LJJIFFI(fValueOf, "low_live_core_network_proportion");
        if (c0uw2 != null) {
            fValueOf2 = Float.valueOf(c0uw2.LJIILL);
        } else {
            fValueOf2 = null;
        }
        c474500IjALIZ.LJJIFFI(fValueOf2, "avg_ping");
        if (c0uw2 != null) {
            fValueOf3 = Float.valueOf(c0uw2.LJIILLIIL);
        } else {
            fValueOf3 = null;
        }
        c474500IjALIZ.LJJIFFI(fValueOf3, "high_ping_proportion");
        if (c0uw2 != null) {
            numValueOf = Integer.valueOf(c0uw2.LJIILJJIL);
        }
        c474500IjALIZ.LJJII(numValueOf, "valid_ping_count");
        c474500IjALIZ.LJJII(str2, "take_definition");
        c474500IjALIZ.LJJII(str3, "definition_type");
        c474500IjALIZ.LJJII(str, "show_high_ping_tips");
        Long l = (Long) dataChannelGlobal.gg0(C168S.class);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "live_tab_first_ts");
        Long l2 = (Long) dataChannelGlobal.gg0(C931180aL6.class);
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        } else {
            jLongValue2 = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(jLongValue2), "live_tab_last_ts");
        Long l3 = (Long) dataChannelGlobal.gg0(C931240aLC.class);
        if (l3 != null) {
            jLongValue3 = l3.longValue();
        } else {
            jLongValue3 = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(jLongValue3), "mobile_game_tab_first_ts");
        Long l4 = (Long) dataChannelGlobal.gg0(C931250aLD.class);
        if (l4 != null) {
            jLongValue4 = l4.longValue();
        } else {
            jLongValue4 = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(jLongValue4), "mobile_game_tab_last_ts");
        Long l5 = (Long) dataChannelGlobal.gg0(C931120aL0.class);
        if (l5 != null) {
            jLongValue5 = l5.longValue();
        } else {
            jLongValue5 = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(jLongValue5), "click_go_live_first_ts");
        Long l6 = (Long) dataChannelGlobal.gg0(C931150aL3.class);
        if (l6 != null) {
            jLongValue6 = l6.longValue();
        }
        c474500IjALIZ.LJJII(Long.valueOf(jLongValue6), "click_go_live_last_ts");
        c474500IjALIZ.LIZ();
    }

    public static JSONObject LIZ(String str, String str2, List list) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tag_name", str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("result", str2);
            if (list != null) {
                jSONObject2.put("reason", new JSONArray((Collection) list));
            }
            jSONObject.put("tag_result", jSONObject2);
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("buildJson() catch exception. e=");
            sbLIZ.append(e.getMessage());
            C20441214yg.LJ("GameBroadcastFeedbackDiagnose", C2188811AlT.LIZIZ(sbLIZ));
            return jSONObject;
        }
    }
}
