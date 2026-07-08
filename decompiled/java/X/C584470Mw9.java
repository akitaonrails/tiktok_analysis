package X;

import Y.ARunnableS88S0000000_9;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.classopt.container.AdClassContainerA;
import com.ss.android.ugc.aweme.classopt.container.AdClassContainerB;
import com.ss.android.ugc.aweme.classopt.container.LiveClassContainerA;
import com.ss.android.ugc.aweme.classopt.container.LiveClassContainerB;
import com.ss.android.ugc.aweme.classopt.container.PhotoModeClassContainerA;
import com.ss.android.ugc.aweme.classopt.container.PhotoModeClassContainerB;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.util.IStartupFeedAwemesService;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Mw9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C584470Mw9 {
    public static final Map<String, EnumC584340Mvw> LIZ = new HashMap();
    public static int LIZIZ = -1;
    public static boolean LIZJ = true;
    public static boolean LIZLLL = false;
    public static int LJ = -1;
    public static int LJFF = -1;
    public static long LJI = 0;
    public static final IStartupFeedAwemesService LJII = (IStartupFeedAwemesService) PluggableExtentionKt.pluggableSpi(IStartupFeedAwemesService.class);
    public static final ARunnableS88S0000000_9 LJIIIIZZ = new ARunnableS88S0000000_9(20);
    public static final C583000Mtm LJIIIZ = new AbstractRunnableC583020Mto() { // from class: X.0Mtm
        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("FpsReportHelper@46a.<field>$1");
            try {
                C584470Mw9.LJFF("false");
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("FpsReportHelper@46a.<field>$1");
        }
    };
    public static boolean LJIIJ = false;
    public static final ARunnableS88S0000000_9 LJIIJJI = new ARunnableS88S0000000_9(21);
    public static final C583290MuF LJIIL = new AbstractC583010Mtn() { // from class: X.0MuF
        @Override // X.AbstractC583010Mtn
        public final void LIZ() {
            if (C584470Mw9.LJII("system_launch_1_minute", null)) {
                C2487409ou.LIZ(C584470Mw9.LJIIL);
            }
        }

        @Override // X.AbstractC583010Mtn
        public final void LIZIZ(boolean z) {
            if (z && C584470Mw9.LJ("system_launch_1_to_2_minute")) {
                C2487409ou.LIZLLL(60000L, C584470Mw9.LJIILJJIL);
            }
        }
    };
    public static final C583300MuG LJIILIIL = new AbstractC583010Mtn() { // from class: X.0MuG
        @Override // X.AbstractC583010Mtn
        public final void LIZ() {
            if (C584470Mw9.LJII("system_launch_1_minute_feed", null)) {
                C2487409ou.LIZ(C584470Mw9.LJIILIIL);
            }
        }

        @Override // X.AbstractC583010Mtn
        public final void LIZIZ(boolean z) {
            if (z && C584470Mw9.LJ("system_launch_1_to_2_minute_feed")) {
                C2487409ou.LIZLLL(60000L, C584470Mw9.LJIILL);
            }
        }
    };
    public static final ARunnableS88S0000000_9 LJIILJJIL = new ARunnableS88S0000000_9(22);
    public static final ARunnableS88S0000000_9 LJIILL = new ARunnableS88S0000000_9(23);
    public static final ARunnableS88S0000000_9 LJIILLIIL = new ARunnableS88S0000000_9(24);
    public static final HashMap<String, String> LJIIZILJ = new HashMap<>();
    public static int LJIJ = 0;
    public static volatile boolean LJIJI = false;

    public static void LJI() {
        if (LJIIJ) {
            C585110MxB.LIZ("search_sug").stop();
            LJIIJ = false;
        }
    }

    public static void LJIIIIZZ() {
        if (LJIIJ) {
            return;
        }
        if (((Boolean) C1219704pv.LIZIZ.getValue()).booleanValue()) {
            try {
                Thread.sleep(((Number) C1219704pv.LIZJ.getValue()).intValue());
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        LJIIJ = true;
        C0VWN.LIZ("search_sug", false).start();
        C2487409ou.LIZLLL(Mp4ScreenVideoLoadTimeout.CONTROL, LJIIJJI);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int LIZ(String str) {
        switch (str.hashCode()) {
            case -1006804125:
                if (str.equals("others")) {
                    return EnumC584480MwA.TYPE_OTHERS.getNum();
                }
                break;
            case -507788400:
                if (str.equals("photo_mode")) {
                    return EnumC584480MwA.TYPE_PHOTO_MODE.getNum();
                }
                break;
            case 3107:
                if (str.equals("ad")) {
                    return EnumC584480MwA.TYPE_AD.getNum();
                }
                break;
            case 108124:
                if (str.equals("mix")) {
                    return EnumC584480MwA.TYPE_MIX.getNum();
                }
                break;
            case 3322092:
                if (str.equals("live")) {
                    return EnumC584480MwA.TYPE_LIVE.getNum();
                }
                break;
            case 3327612:
                if (str.equals("long")) {
                    return EnumC584480MwA.TYPE_LONG.getNum();
                }
                break;
            case 109770997:
                if (str.equals("story")) {
                    return EnumC584480MwA.TYPE_STORY.getNum();
                }
                break;
            case 112202875:
                if (str.equals("video")) {
                    return EnumC584480MwA.TYPE_VIDEO.getNum();
                }
                break;
        }
        return EnumC584480MwA.TYPE_VIDEO.getNum();
    }

    public static String LIZIZ(Aweme aweme) {
        if (aweme == null) {
            return "others";
        }
        if (aweme.isAd()) {
            return "ad";
        }
        if (aweme.getAwemeType() != 40 && !aweme.getIsTikTokStory()) {
            if (AwemeExtKt.isMixAweme(aweme)) {
                return "mix";
            }
            if (AwemeSaaSExtKt.isLive(aweme)) {
                return "live";
            }
            if (AwemeExtKt.isPhotoMode(aweme)) {
                return "photo_mode";
            }
            if (aweme.getDistributeType() == 2) {
                return "long";
            }
            return "video";
        }
        return "story";
    }

    public static boolean LIZJ(String str) {
        if (((HashMap) LIZ).get(str) == EnumC584340Mvw.MONITORING) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(String str) {
        Map<String, EnumC584340Mvw> map = LIZ;
        Object obj = ((HashMap) map).get(str);
        if (obj == null) {
            ((HashMap) map).put(str, EnumC584340Mvw.NOT_MONITORED);
            return true;
        }
        if (obj == EnumC584340Mvw.NOT_MONITORED) {
            return true;
        }
        return false;
    }

    public static boolean LJ(String str) {
        C2407009bw.LIZ();
        if (!LIZLLL(str)) {
            return false;
        }
        ((HashMap) LIZ).put(str, EnumC584340Mvw.MONITORING);
        C0VWN.LIZ(str, false).start();
        return true;
    }

    public static void LJFF(String str) {
        C11HC c11hc;
        C311390CIn c311390CIn;
        if (((HashMap) LIZ).get("system_launch") == EnumC584340Mvw.MONITORED) {
            return;
        }
        HashMap map = new HashMap();
        map.put("is_pause", str);
        HashMap<String, String> map2 = LJIIZILJ;
        map.putAll(map2);
        map2.clear();
        LJII("system_launch", map);
        C2487409ou.LIZ(LJIIIZ);
        C303140BuS.LIZ = false;
        C303110BuP.LIZ = false;
        if (!C2041907zF.LJFF && ((Boolean) C2041907zF.LIZJ.getValue()).booleanValue()) {
            C2041907zF.LIZIZ(new C2042407zK());
        }
        if (((Boolean) C1228904rP.LIZLLL.getValue()).booleanValue()) {
            C0N5P c0n5p = C0N5P.LIZ;
            C0N5P.LJ("SystemLaunch");
        }
        LJII("system_launch_after_first_frame", map);
        LJII("system_launch_isolate_after_first_frame", null);
        C310770CGd.LIZ("system_launch").LIZ();
        if (C1252304vB.LIZ()) {
            EnumC309240CAg enumC309240CAg = EnumC309240CAg.AB;
            C309220CAe.LJFF(enumC309240CAg, "system_launch_ab_preload_experiment");
            C309220CAe.LIZIZ(enumC309240CAg, "system_launch_ab_preload_experiment");
        }
        C309380CAu.LJII.getClass();
        if (((Boolean) C274470ApJ.LIZLLL.getValue()).booleanValue()) {
            EnumC309240CAg enumC309240CAg2 = EnumC309240CAg.KV;
            C309220CAe.LJFF(enumC309240CAg2, "system_launcher_keva");
            C309220CAe.LIZIZ(enumC309240CAg2, "system_launcher_keva");
        }
        if (((Number) C311420CIq.LIZJ.getValue()).intValue() == 1 && (c11hc = (C11HC) C311420CIq.LJFF.getValue()) != null && (c11hc instanceof C311390CIn) && (c311390CIn = (C311390CIn) c11hc) != null) {
            c311390CIn.LIZJ = false;
        }
    }

    public static boolean LJII(String str, Map<String, String> map) {
        String str2;
        C2407009bw.LIZ();
        if (!LIZJ(str)) {
            return false;
        }
        ((HashMap) LIZ).put(str, EnumC584340Mvw.MONITORED);
        InterfaceC1602960roc interfaceC1602960rocLIZ = C0VWN.LIZ(str, false);
        if (map != null) {
            HashMap map2 = (HashMap) map;
            if (!map2.isEmpty()) {
                for (Map.Entry entry : map2.entrySet()) {
                    String str3 = (String) entry.getKey();
                    if (str3 != null && (str2 = (String) entry.getValue()) != null) {
                        interfaceC1602960rocLIZ.LIZ(str3, str2);
                    }
                }
            }
        }
        interfaceC1602960rocLIZ.stop();
        return true;
    }

    public static void LJIIJ(int i, Aweme aweme) {
        if (i == LIZIZ && LIZLLL) {
            C585110MxB.LIZ("video_play").LIZ("next_video", LIZIZ(aweme));
        }
        if (C584520MwE.LIZLLL) {
            C584520MwE.LIZLLL = false;
            return;
        }
        if (aweme == null) {
            return;
        }
        if (C584520MwE.LIZ && C584520MwE.LIZIZ && C584520MwE.LIZJ) {
            return;
        }
        if (aweme.isAd() && !C584520MwE.LIZ) {
            C584520MwE.LIZ = true;
            if (!((Boolean) C305490ByF.LIZJ.getValue()).booleanValue()) {
                return;
            }
            C584520MwE.LIZ(new AdClassContainerA(), new AdClassContainerB());
            return;
        }
        if (aweme.getAwemeType() == 40 || aweme.getIsTikTokStory() || AwemeExtKt.isMixAweme(aweme)) {
            return;
        }
        if (AwemeSaaSExtKt.isLive(aweme) && !C584520MwE.LIZIZ) {
            C584520MwE.LIZIZ = true;
            if (!((Boolean) C305500ByG.LIZJ.getValue()).booleanValue()) {
                return;
            }
            C584520MwE.LIZ(new LiveClassContainerA(), new LiveClassContainerB());
            return;
        }
        if (!AwemeExtKt.isPhotoMode(aweme) || C584520MwE.LIZJ) {
            return;
        }
        C584520MwE.LIZJ = true;
        if (!((Boolean) C305510ByH.LIZJ.getValue()).booleanValue()) {
            return;
        }
        C584520MwE.LIZ(new PhotoModeClassContainerA(), new PhotoModeClassContainerB());
    }

    public static void LJIIIZ(boolean z, String str, Aweme aweme, Aweme aweme2) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        if (Objects.equals(str, "homepage_hot")) {
            long j6 = 0;
            if (z) {
                j = 1;
            } else {
                j = 0;
            }
            if (aweme != null) {
                int awemeType = aweme.getAwemeType();
                LJ = awemeType;
                if (awemeType < 16384) {
                    j2 = ((long) awemeType) << 1;
                } else {
                    j2 = 0;
                }
                long jLIZ = LIZ(LIZIZ(aweme));
                if (jLIZ < 32) {
                    j3 = jLIZ << 31;
                } else {
                    j3 = 0;
                }
            } else {
                j2 = 0;
                j3 = 0;
            }
            if (aweme2 != null) {
                int awemeType2 = aweme2.getAwemeType();
                LJFF = awemeType2;
                if (awemeType2 < 16384) {
                    j5 = ((long) awemeType2) << 16;
                } else {
                    j5 = 0;
                }
                long jLIZ2 = LIZ(LIZIZ(aweme2));
                if (jLIZ2 < 32) {
                    j6 = jLIZ2 << 37;
                }
                j4 = j6;
                j6 = j5;
            } else {
                j4 = 0;
            }
            LJI = j + j2 + j6 + j3 + j4;
        }
    }
}
