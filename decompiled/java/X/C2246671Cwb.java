package X;

import android.content.Context;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftVideoPlayerPerfOptSetting;
import com.bytedance.live.render.engine.alphaplayer.model.VideoFileModelKotlin;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1Cwb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2246671Cwb {
    public static final C2246671Cwb LIZ = new C2246671Cwb();
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;
    public static final int LIZLLL;
    public static final long LJ;
    public static final int LJFF;
    public static final int LJI;
    public static final Map<String, C19378510rf> LJII;
    public static final Map<String, C19378410re> LJIIIIZZ;
    public static final Map<String, C19378610rg> LJIIIZ;
    public static long LJIIJ;

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        LIZIZ = C452501pT.LIZ(enumC452301pR, AFwS221S0000000_31.get$arr$(380));
        LIZJ = C452501pT.LIZ(enumC452301pR, AFwS221S0000000_31.get$arr$(379));
        LiveGiftVideoPlayerPerfOptSetting liveGiftVideoPlayerPerfOptSetting = LiveGiftVideoPlayerPerfOptSetting.INSTANCE;
        LIZLLL = liveGiftVideoPlayerPerfOptSetting.playerCacheSize();
        LJ = liveGiftVideoPlayerPerfOptSetting.playerCacheExpiredTime() * LSPassThroughRecordSizeConfig.DEFAULT;
        liveGiftVideoPlayerPerfOptSetting.playerPreloadSize();
        int iConfigCacheSize = liveGiftVideoPlayerPerfOptSetting.configCacheSize();
        LJFF = iConfigCacheSize;
        LJI = liveGiftVideoPlayerPerfOptSetting.configCacheTrimSize();
        boolean zUseConcurrentMap = liveGiftVideoPlayerPerfOptSetting.useConcurrentMap();
        LJII = zUseConcurrentMap ? new ConcurrentHashMap<>() : new HashMap<>();
        LJIIIIZZ = zUseConcurrentMap ? new ConcurrentHashMap<>(iConfigCacheSize) : new HashMap<>(iConfigCacheSize);
        LJIIIZ = zUseConcurrentMap ? new ConcurrentHashMap<>(iConfigCacheSize) : new HashMap<>(iConfigCacheSize);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJ() {
        Iterator<Map.Entry<String, C19378510rf>> it2 = LJII.entrySet().iterator();
        while (it2.hasNext()) {
            C19378510rf value = it2.next().getValue();
            value.getClass();
            try {
                value.LJI = true;
                ((C2246981Cx6) value.LIZJ).release();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        LJII.clear();
    }

    public static void LIZJ(boolean z) {
        int i;
        if (z && (i = LJI) > 0) {
            Map<String, C19378410re> map = LJIIIIZZ;
            if (map.size() >= LJFF) {
                C11W2.LIZ(map, i, EnumC19360910op.DESCENDING);
                return;
            }
            return;
        }
        LJIIIIZZ.clear();
    }

    public static void LIZLLL(boolean z) {
        int i;
        if (z && (i = LJI) > 0) {
            Map<String, C19378610rg> map = LJIIIZ;
            if (map.size() >= LJFF) {
                C11W2.LIZ(map, i, EnumC19360910op.DESCENDING);
                return;
            }
            return;
        }
        LJIIIZ.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String LJI(String str) {
        C19378410re c19378410re;
        if (LiveGiftVideoPlayerPerfOptSetting.INSTANCE.isEnableConfig() && (c19378410re = LJIIIIZZ.get(str)) != null) {
            c19378410re.LIZIZ();
            String str2 = (String) c19378410re.LIZJ;
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static VideoFileModelKotlin LJII(String str) {
        if (!LiveGiftVideoPlayerPerfOptSetting.INSTANCE.isEnableConfig()) {
            return new VideoFileModelKotlin();
        }
        C19378610rg c19378610rg = LJIIIZ.get(str);
        if (c19378610rg != null) {
            c19378610rg.LIZIZ();
            VideoFileModelKotlin videoFileModelKotlin = (VideoFileModelKotlin) c19378610rg.LIZJ;
            if (videoFileModelKotlin != null) {
                return videoFileModelKotlin;
            }
        }
        return null;
    }

    public static void LIZ(final String str, final String str2) {
        if (!LiveGiftVideoPlayerPerfOptSetting.INSTANCE.isEnableConfig()) {
            return;
        }
        final Map<String, C19378410re> map = LJIIIIZZ;
        if (map.size() >= LJFF) {
            LIZJ(true);
        }
        if (map.get(str) == null) {
            map.put(str, (C19378410re) new AbstractC19378310rd<String>(str, str2, map) { // from class: X.10re
            });
        }
    }

    public static void LIZIZ(String str, VideoFileModelKotlin videoFileModelKotlin) {
        if (!LiveGiftVideoPlayerPerfOptSetting.INSTANCE.isEnableConfig()) {
            return;
        }
        Map<String, C19378610rg> map = LJIIIZ;
        if (map.size() >= LJFF) {
            LIZLLL(true);
        }
        if (map.get(str) == null) {
            map.put(str, new C19378610rg(map, str, videoFileModelKotlin));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(android.content.Context r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2246671Cwb.LJFF(android.content.Context, java.lang.String):void");
    }

    public static void LJIIIZ(String str, C2246981Cx6 c2246981Cx6) {
        if (!LiveGiftVideoPlayerPerfOptSetting.INSTANCE.isEnableReplay() || a0.LJJJIL(str)) {
            return;
        }
        Map<String, C19378510rf> map = LJII;
        if (map.size() >= LIZLLL) {
            LJ();
        }
        C19378510rf c19378510rf = map.get(str);
        if (c19378510rf == null) {
            c19378510rf = new C19378510rf(map, str, c2246981Cx6, LJ);
            map.put(str, c19378510rf);
        }
        C19378510rf c19378510rf2 = c19378510rf;
        Runnable runnable = (Runnable) c19378510rf2.LJII.getValue();
        if (runnable != null) {
            LIZ.getClass();
            C786410Ut5.LJLIIL(c19378510rf2.LIZLLL, (Handler) LIZJ.getValue(), runnable);
        }
    }

    public static boolean LJIIJ(int i, int i2) {
        Number numberValueOf;
        int i3 = i2 - i;
        long j = LJIIJ;
        if (j <= 0 || j >= 4000 || j < 1000) {
            numberValueOf = Integer.valueOf(LiveGiftVideoPlayerPerfOptSetting.INSTANCE.playerPreloadDuration());
        } else {
            numberValueOf = Float.valueOf(j * LiveGiftVideoPlayerPerfOptSetting.INSTANCE.playerPreloadThreshold());
        }
        if (i3 <= numberValueOf.intValue()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C2246981Cx6 LJIIIIZZ(String str, Context context, InterfaceC2247071CxF interfaceC2247071CxF, boolean z) {
        C2246981Cx6 c2246981Cx6;
        Integer numValueOf;
        if (LiveGiftVideoPlayerPerfOptSetting.INSTANCE.isEnableReplay() && z) {
            C19378510rf c19378510rf = LJII.get(str);
            Integer numValueOf2 = null;
            if (c19378510rf != null) {
                c19378510rf.LIZIZ();
                c2246981Cx6 = (C2246981Cx6) c19378510rf.LIZJ;
                if (!C176600m4.LIZIZ(Boolean.valueOf(c19378510rf.LJI)) && c2246981Cx6 != null) {
                    Runnable runnable = (Runnable) c19378510rf.LJII.getValue();
                    if (runnable != null) {
                        LIZ.getClass();
                        ((Handler) LIZJ.getValue()).removeCallbacks(runnable);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("obtainSinglePlayer valid cache=");
                    sbLIZ.append(c19378510rf);
                    C20441214yg.LJIIIZ("LiveGiftVideoCacheManager_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
                    return c2246981Cx6;
                }
            } else {
                c2246981Cx6 = null;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("obtainSinglePlayer invalid cache=");
            if (c19378510rf != null) {
                numValueOf = Integer.valueOf(c19378510rf.hashCode());
            } else {
                numValueOf = null;
            }
            sbLIZ2.append(numValueOf);
            sbLIZ2.append(" cachedPlayer=");
            if (c2246981Cx6 != null) {
                numValueOf2 = Integer.valueOf(c2246981Cx6.hashCode());
            }
            sbLIZ2.append(numValueOf2);
            sbLIZ2.append(", create a new TTEnginePlayerImplKotlin");
            C20441214yg.LJIIIZ("LiveGiftVideoCacheManager_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ2));
            return new C2246981Cx6(context, interfaceC2247071CxF);
        }
        C20441214yg.LJIIIZ("LiveGiftVideoCacheManager_gift_video_engine", "obtainSinglePlayer no cache mechanism, create a new TTEnginePlayerImplKotlin");
        return new C2246981Cx6(context, interfaceC2247071CxF);
    }
}
