package X;

import X.C1C7U;
import Y.ARunnableS89S0200000_20;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.bytedance.android.livesdk.media.ttlhadaptive.gear.config.GearStrategySettingConfig;
import com.bytedance.android.livesdk.media.ttlhadaptive.gear.config.TTLHGearAdaptiveConfig;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.ILyraxNetProber;
import com.ss.lyrax.net.LyraxNetProberBandwidthResult;
import com.ss.lyrax.net.LyraxNetProberResult;
import com.ss.ttlivestreamer.livestreamv2.videoquality.controler.model.VideoQualityMockConfig;
import com.ss.ttlivestreamer.livestreamv2.videoquality.portrait.VideoQualityPortrait;
import com.ss.ttlivestreamer.livestreamv2.videoquality.probe.BwProbeWrapper;
import com.ss.ttlivestreamer.livestreamv2.videoquality.probe.cache.BwProbeCacheResult;
import com.ss.ttlivestreamer.livestreamv2.videoquality.probe.model.select.BwProbeBaseGearSelectConfig;
import com.ss.ttlivestreamer.livestreamv2.videoquality.strategycenter.model.BitrateConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1D4t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2250011D4t {
    public C1D41 LIZ;
    public C1D5U LIZIZ;
    public C2250071D4z LIZJ;
    public C1D50 LIZLLL;
    public C1282880jUM LJ;
    public InterfaceC2249921D4k LJFF;
    public InterfaceC2249921D4k LJI;
    public BwProbeBaseGearSelectConfig LJII;
    public TTLHGearAdaptiveConfig LJIIIIZZ;
    public C1268340j6u LJIIIZ;
    public Map<String, String> LJIIJ;
    public C2249971D4p LJIIJJI;
    public C1D5F LJIIL;
    public C1D53 LJIILIIL;
    public C1D5I LJIILJJIL;
    public C1D5M LJIILL;
    public VideoQualityMockConfig LJIILLIIL;
    public C1D4A LJIIZILJ;
    public BwProbeWrapper LJIJ;
    public C1282870jUL LJIJI;
    public boolean LJIL;
    public C1D5H LJJ;
    public boolean LJJI;
    public long LJJIFFI;
    public int LJJIII;
    public boolean LJJIIJ;
    public boolean LJJIIJZLJL;
    public boolean LJJIIZ;
    public C1D49 LJJIIZI;
    public C1D49 LJJIJ;
    public int LJJIJL;
    public boolean LJJIJLIJ;
    public EnumC1277260jLI LJJIL;
    public EnumC773550UWb LJJII = EnumC773550UWb.DEFAULT;
    public EnumC783720Uok LJJIJIIJI = EnumC783720Uok.DEFAULT;
    public EnumC2249781D3w LJJIJIIJIL = EnumC2249781D3w.DEFAULT;
    public EnumC1283150jUn LJJIJIL = EnumC1283150jUn.DEFAULT;
    public String LJJIZ = "";
    public final AtomicBoolean LJJJ = new AtomicBoolean(false);
    public C2250051D4x LJIJJ = new C2250051D4x();
    public C1D48 LJIJJLI = new C1D48();

    public static int LJI(long j, long j2) {
        if (j == -1) {
            return -1;
        }
        return (int) (j - j2);
    }

    public final boolean LIZ() {
        C1D50 c1d50;
        return this.LJJIIJZLJL && (c1d50 = this.LIZLLL) != null && c1d50.LJJ;
    }

    public final void LIZLLL() {
        if (this.LJIIIIZZ == null || this.LIZJ == null) {
            return;
        }
        if ((LJIILJJIL() || LJIILIIL()) && this.LJIIIZ == null) {
            TTLHGearAdaptiveConfig tTLHGearAdaptiveConfig = this.LJIIIIZZ;
            C2250071D4z c2250071D4z = this.LIZJ;
            this.LJIIIZ = new C1268340j6u(tTLHGearAdaptiveConfig, c2250071D4z.LJFF, c2250071D4z.LJIJJ);
            C1266470j3t c1266470j3t = new C1266470j3t();
            Map<String, BitrateConfig> mapLIZ = this.LJIIJJI.LIZ();
            JSONArray jSONArray = new JSONArray();
            if (mapLIZ != null) {
                try {
                    ArrayList arrayList = new ArrayList();
                    Iterator<Map.Entry<String, BitrateConfig>> it2 = mapLIZ.entrySet().iterator();
                    while (it2.hasNext()) {
                        BitrateConfig value = it2.next().getValue();
                        if (!TextUtils.isEmpty(value.level)) {
                            int size = arrayList.size();
                            while (size > 0) {
                                int i = size - 1;
                                if (((JSONObject) arrayList.get(i)).optLong("max_bitrate", -1L) >= value.maxBitrate) {
                                    break;
                                } else {
                                    size = i;
                                }
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("level", CastIntegerProtector.parseInt(value.level));
                            jSONObject.put("fps", value.fps);
                            jSONObject.put("width", value.width);
                            jSONObject.put("height", value.height);
                            jSONObject.put("default_bitrate", value.defaultBitrate);
                            jSONObject.put("max_bitrate", value.maxBitrate);
                            jSONObject.put("min_bitrate", value.minBitrate);
                            if (LJIILIIL() && !TextUtils.isEmpty(value.sdkKey)) {
                                jSONObject.put("sdkKey", value.sdkKey);
                            }
                            arrayList.add(size, jSONObject);
                        }
                    }
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        jSONArray.put(arrayList.get(i2));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            c1266470j3t.LJ = jSONArray;
            C2250071D4z c2250071D4z2 = this.LIZJ;
            if (c2250071D4z2 != null) {
                c1266470j3t.LJI = c2250071D4z2.LJIILJJIL;
                c1266470j3t.LJII = c2250071D4z2.LJIILL;
            }
            try {
                C1D5F c1d5f = this.LJIIL;
                if (c1d5f != null && !TextUtils.isEmpty(c1d5f.LJIIJJI)) {
                    c1266470j3t.LIZLLL = new JSONObject(this.LJIIL.LJIIJJI);
                }
                if (this.LJIIJ != null) {
                    c1266470j3t.LJIIIIZZ = new JSONObject(this.LJIIJ);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            C1267080j4s c1267080j4s = this.LJIIIZ.LIZIZ;
            c1267080j4s.LIZ(c1267080j4s.LIZ, c1266470j3t);
            C1267180j52 c1267180j52 = new C1267180j52();
            EnumC1283150jUn enumC1283150jUn = this.LJJIJIL;
            if (enumC1283150jUn == EnumC1283150jUn.STAGE) {
                c1267180j52.LIZ = EnumC1268000j6M.LIVE;
            } else if (enumC1283150jUn == EnumC1283150jUn.GAME) {
                c1267180j52.LIZ = EnumC1268000j6M.GAME_LIVE;
                c1267180j52.LIZIZ = EnumC1268010j6N.ANCHOR;
            }
            C1267080j4s c1267080j4s2 = this.LJIIIZ.LIZIZ;
            c1267080j4s2.LIZ(c1267080j4s2.LIZLLL, c1267180j52);
        }
    }

    public final C1282850jUJ LJFF() {
        LyraxNetProberBandwidthResult bandwidthResult;
        C1D50 c1d50;
        C1D50 c1d502;
        final BwProbeWrapper bwProbeWrapper = this.LJIJ;
        C1282850jUJ bandwidthResult2 = null;
        if (bwProbeWrapper != null) {
            if (this.LJJIIJZLJL && (c1d502 = this.LIZLLL) != null && c1d502.LJIL) {
                final InterfaceC1283000jUY interfaceC1283000jUY = bwProbeWrapper.LIZJ;
                C2214021Bl2.LIZ(bwProbeWrapper.LIZIZ, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.videoquality.probe.BwProbeWrapper.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("BwProbeWrapper@901e.getBandwidthResultAsyncWait$1");
                        try {
                            if (interfaceC1283000jUY != null) {
                                BwProbeWrapper bwProbeWrapper2 = BwProbeWrapper.this;
                                bwProbeWrapper2.LJFF = bwProbeWrapper2.LIZJ.getBandwidthResult();
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("BwProbeWrapper@901e.getBandwidthResultAsyncWait$1");
                    }
                });
                bandwidthResult2 = bwProbeWrapper.LJFF;
            } else {
                InterfaceC1283000jUY interfaceC1283000jUY2 = bwProbeWrapper.LIZJ;
                if (interfaceC1283000jUY2 != null) {
                    bandwidthResult2 = interfaceC1283000jUY2.getBandwidthResult();
                }
            }
        }
        C1282870jUL c1282870jUL = this.LJIJI;
        if (c1282870jUL == null) {
            return bandwidthResult2;
        }
        if (this.LJJIIJZLJL && (c1d50 = this.LIZLLL) != null && c1d50.LJIL) {
            C2214021Bl2.LIZ(c1282870jUL.LIZIZ, new ARunnableS89S0200000_20(c1282870jUL, c1282870jUL.LIZLLL, 73));
            bandwidthResult = c1282870jUL.LJFF;
        } else {
            ILyraxNetProber iLyraxNetProber = c1282870jUL.LIZLLL;
            if (iLyraxNetProber == null) {
                return bandwidthResult2;
            }
            bandwidthResult = iLyraxNetProber.getBandwidthResult();
        }
        if (bandwidthResult == null) {
            return bandwidthResult2;
        }
        LyraxNetProberResult lyraxNetProberResult = bandwidthResult.result;
        return new C1282850jUJ(lyraxNetProberResult != null ? lyraxNetProberResult.value() : 2, (int) bandwidthResult.bandwidth, (int) bandwidthResult.event3, bandwidthResult.message);
    }

    public final C1D4A LJII() {
        C1D50 c1d50 = this.LIZLLL;
        if (c1d50 == null || this.LIZJ == null || !c1d50.LJII) {
            return null;
        }
        if (this.LJIIZILJ == null) {
            this.LJIIZILJ = new C1D4A();
        }
        return this.LJIIZILJ;
    }

    public final int LJIIIIZZ() {
        int i;
        VideoQualityMockConfig videoQualityMockConfig = this.LJIILLIIL;
        return (videoQualityMockConfig == null || videoQualityMockConfig.mockProbeSwitch != 1 || (i = videoQualityMockConfig.mockProbeNetworkType) <= -1) ? this.LIZJ.LJI : i;
    }

    public final JSONObject LJIIJ() {
        int i;
        if (this.LJIJJ != null) {
            C1D49 c1d49LJIIIZ = LJIIIZ(null);
            this.LJJIJ = c1d49LJIIIZ;
            C2250051D4x c2250051D4x = this.LJIJJ;
            C2250071D4z c2250071D4z = this.LIZJ;
            C1D50 c1d50 = this.LIZLLL;
            c2250051D4x.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                if (c2250071D4z != null) {
                    jSONObject.put("open_probe_for_key_user", c2250071D4z.LJIIIIZZ);
                    jSONObject.put("recommend_level_server", c1d49LJIIIZ.LJII);
                }
                if (c1d50 != null) {
                    jSONObject.put("live_go_live_bandwidth_test_enable", c1d50.LIZIZ);
                }
                if (c1d49LJIIIZ != null && !TextUtils.isEmpty(c1d49LJIIIZ.LIZJ())) {
                    jSONObject.put("r10_definition_recommend", c1d49LJIIIZ.LIZJ());
                }
                if (c1d49LJIIIZ != null && (i = c1d49LJIIIZ.LIZIZ) != -1) {
                    jSONObject.put("r10_speedtest_result", i);
                }
                if (c1d49LJIIIZ != null) {
                    jSONObject.put("r10_final_speedtest_result", c1d49LJIIIZ.LIZ());
                }
                HashMap<EnumC2250061D4y, String> map = c2250051D4x.LIZJ;
                EnumC2250061D4y enumC2250061D4y = EnumC2250061D4y.LIVECORE_SPEED_TEST_TIME_RESULT;
                String str = map.get(enumC2250061D4y);
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put(enumC2250061D4y.getKey(), str);
                }
                if (c2250051D4x.LJIIJ != -1) {
                    jSONObject.put(EnumC2250061D4y.SPEED_TEST_END_RESULT.getKey(), String.valueOf(c2250051D4x.LJIIJ));
                }
                if (c2250051D4x.LJIIIZ != -1) {
                    jSONObject.put(EnumC2250061D4y.SPEED_TEST_END_STATUS.getKey(), String.valueOf(c2250051D4x.LJIIIZ));
                }
                return jSONObject;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public final BwProbeCacheResult LJIIJJI() {
        C1D50 c1d50;
        BwProbeCacheResult bwProbeCacheResultLIZ;
        C1D5F c1d5f = this.LJIIL;
        if (c1d5f != null && c1d5f.LJIIJ == 1) {
            if (LJII() != null) {
                C1D5P c1d5p = new C1D5P();
                c1d5p.LIZ = this.LJJIJIL;
                EnumC804650VhP enumC804650VhPFromNetworkTypeInt = EnumC804650VhP.fromNetworkTypeInt(LJIIIIZZ());
                c1d5p.LIZLLL = this.LIZLLL.LJIIIIZZ;
                VideoQualityMockConfig videoQualityMockConfig = this.LJIILLIIL;
                if (videoQualityMockConfig != null && videoQualityMockConfig.mockProbeSwitch == 1) {
                    c1d5p.LIZIZ = videoQualityMockConfig.ignoreWifiProbeCache == 1;
                    c1d5p.LIZJ = videoQualityMockConfig.ignoreMobileProbeCache == 1;
                }
                Context context = this.LIZJ.LJFF;
                if (context != null && ((!c1d5p.LIZIZ || enumC804650VhPFromNetworkTypeInt != EnumC804650VhP.WIFI) && (!c1d5p.LIZJ || enumC804650VhPFromNetworkTypeInt != EnumC804650VhP.MOBILE))) {
                    String strLIZ = C1D4A.LIZ(c1d5p.LIZ, enumC804650VhPFromNetworkTypeInt);
                    SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, "probe_cache");
                    String string = sharedPreferencesLIZJ.getString(strLIZ, "");
                    if (!TextUtils.isEmpty(string) && (bwProbeCacheResultLIZ = BwProbeCacheResult.LIZ(string)) != null) {
                        long j = bwProbeCacheResultLIZ.cacheTs;
                        long jCurrentTimeMillis = System.currentTimeMillis() - j;
                        long j2 = ((long) c1d5p.LIZLLL) * 24 * 3600000;
                        if (j <= 0 || jCurrentTimeMillis > j2) {
                            sharedPreferencesLIZJ.edit().putString(strLIZ, "").apply();
                        } else {
                            bwProbeCacheResultLIZ.LIZ = c1d5p.LIZ;
                            if (this.LJIIL.LJIIIZ == 1 || bwProbeCacheResultLIZ.level >= this.LIZJ.LIZLLL) {
                                return bwProbeCacheResultLIZ;
                            }
                        }
                    }
                }
            }
            return null;
        }
        C1D50 c1d502 = this.LIZLLL;
        if (c1d502 == null || this.LIZJ == null) {
            return null;
        }
        BwProbeWrapper bwProbeWrapper = this.LJIJ;
        if ((bwProbeWrapper == null && this.LJIJI == null) || !c1d502.LJII) {
            return null;
        }
        BwProbeCacheResult bwProbeCacheResultLIZIZ = bwProbeWrapper != null ? C1275110jHp.LIZIZ(this.LIZJ.LJFF, this.LJJIJIL) : null;
        if (this.LJIJI != null) {
            bwProbeCacheResultLIZIZ = C1275110jHp.LIZIZ(this.LIZJ.LJFF, this.LJJIJIL);
        }
        if (bwProbeCacheResultLIZIZ == null) {
            return null;
        }
        long j3 = bwProbeCacheResultLIZIZ.cacheTs;
        long j4 = ((long) this.LIZLLL.LJIIIIZZ) * 24 * 3600000;
        List<C1283050jUd> list = this.LIZJ.LIZJ;
        C2249971D4p c2249971D4p = this.LJIIJJI;
        if (c2249971D4p != null) {
            List<C1283050jUd> listLIZLLL = c2249971D4p.LIZLLL();
            if (!C086I.LIZIZ(listLIZLLL)) {
                list = listLIZLLL;
            }
        }
        if (!C086I.LIZIZ(list)) {
            for (int i = 0; i < list.size(); i++) {
            }
        }
        if (j3 <= 0 || System.currentTimeMillis() - j3 >= j4) {
            if (this.LJIJ != null) {
                C1275110jHp.LIZ(this.LIZJ.LJFF, this.LJJIJIL);
            }
            if (this.LJIJI == null) {
                return null;
            }
            C1275110jHp.LIZ(this.LIZJ.LJFF, this.LJJIJIL);
            return null;
        }
        int i2 = bwProbeCacheResultLIZIZ.level;
        if (i2 < this.LIZJ.LIZLLL) {
            return null;
        }
        if (this.LJIIL.LJI != 1) {
            if (C086I.LIZIZ(list)) {
                return null;
            }
            Iterator<C1283050jUd> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().LIZIZ == i2) {
                }
            }
            return null;
        }
        if ((this.LIZLLL.LJIIIZ && bwProbeCacheResultLIZIZ.netType != LJIIIIZZ()) || (c1d50 = this.LIZLLL) == null) {
            return null;
        }
        if (c1d50.LJIIJ) {
            if (!c1d50.LJIIJ) {
                return null;
            }
            int i3 = bwProbeCacheResultLIZIZ.protocol;
            if (i3 != 3) {
                if (i3 == 4 && this.LJJIIJZLJL) {
                    return bwProbeCacheResultLIZIZ;
                }
                return null;
            }
            if (this.LJJIIJZLJL) {
                return null;
            }
        }
        return bwProbeCacheResultLIZIZ;
    }

    public final boolean LJIILIIL() {
        TTLHGearAdaptiveConfig tTLHGearAdaptiveConfig;
        GearStrategySettingConfig gearStrategySettingConfig;
        return this.LJJIJIL == EnumC1283150jUn.GAME && (tTLHGearAdaptiveConfig = this.LJIIIIZZ) != null && (gearStrategySettingConfig = tTLHGearAdaptiveConfig.strategySettingConfig) != null && gearStrategySettingConfig.LIZ();
    }

    public final boolean LJIILJJIL() {
        TTLHGearAdaptiveConfig tTLHGearAdaptiveConfig;
        GearStrategySettingConfig gearStrategySettingConfig;
        return this.LJJIJIL == EnumC1283150jUn.STAGE && (tTLHGearAdaptiveConfig = this.LJIIIIZZ) != null && (gearStrategySettingConfig = tTLHGearAdaptiveConfig.strategySettingConfig) != null && gearStrategySettingConfig.LIZ();
    }

    public final void LJIIZILJ() {
        if (this.LIZJ != null && this.LJIL) {
            this.LJIL = false;
            C1D5H c1d5h = this.LJJ;
            if (c1d5h != null) {
                c1d5h.cancel();
            }
            this.LJJIJL = 0;
            HashMap map = (HashMap) C1867350yh3.LIZ;
            Timer timer = (Timer) map.get("probe_progress_task");
            if (timer != null) {
                timer.cancel();
                map.remove("probe_progress_task");
            }
            if (this.LJIJ != null) {
                if (LIZ()) {
                    this.LJIJ.LJI();
                } else {
                    BwProbeWrapper bwProbeWrapper = this.LJIJ;
                    bwProbeWrapper.getClass();
                    C1283420jVE.LIZIZ();
                    InterfaceC1283000jUY interfaceC1283000jUY = bwProbeWrapper.LIZJ;
                    if (interfaceC1283000jUY != null) {
                        interfaceC1283000jUY.stop();
                    }
                }
            }
            if (this.LJIJI != null) {
                if (LIZ()) {
                    this.LJIJI.LJI();
                    return;
                }
                C1282870jUL c1282870jUL = this.LJIJI;
                c1282870jUL.getClass();
                C1283420jVE.LIZIZ();
                ILyraxNetProber iLyraxNetProber = c1282870jUL.LIZLLL;
                if (iLyraxNetProber != null) {
                    iLyraxNetProber.stopProbe();
                }
            }
        }
    }

    public final void LIZIZ(C1D49 c1d49) {
        String sdkKey;
        EnumC2178851APb enumC2178851APb;
        if (this.LJJIJIL == EnumC1283150jUn.STAGE) {
            int iLIZIZ = c1d49.LIZIZ();
            List<C1283050jUd> list = this.LIZJ.LIZJ;
            C2249971D4p c2249971D4p = this.LJIIJJI;
            if (c2249971D4p != null) {
                List<C1283050jUd> listLIZLLL = c2249971D4p.LIZLLL();
                if (!C086I.LIZIZ(listLIZLLL)) {
                    list = listLIZLLL;
                }
            }
            c1d49.LIZLLL = C1282950jUT.LIZJ(iLIZIZ, list);
            return;
        }
        C1D46 c1d46 = c1d49.LIZ;
        if (c1d46 != null && (enumC2178851APb = c1d46.LIZLLL) != null) {
            sdkKey = enumC2178851APb.getSdkKey();
        } else {
            sdkKey = "";
        }
        c1d49.LJIJJLI = sdkKey;
    }

    public final void LIZJ(C1D49 c1d49) {
        c1d49.LJII = this.LIZJ.LIZLLL;
        c1d49.LJIIJJI = this.LJJIJIIJI;
        c1d49.LJIILIIL = this.LJJIJIL;
        C2250051D4x c2250051D4x = this.LJIJJ;
        if (c2250051D4x != null) {
            c1d49.LJIIIIZZ = c2250051D4x.LIZLLL;
        }
        c1d49.LJJIIJZLJL = EnumC804650VhP.fromNetworkTypeInt(LJIIIIZZ());
    }

    public final void LJ(C1D49 c1d49) {
        InterfaceC2249921D4k interfaceC2249921D4k;
        InterfaceC2190001AnO c2249911D4j;
        int i;
        C1D5F c1d5f;
        C1D5F c1d5f2;
        if ((this.LJJIJIL != EnumC1283150jUn.STAGE || ((c1d5f2 = this.LJIIL) != null && c1d5f2.LIZ == 1)) && (interfaceC2249921D4k = this.LJFF) != null) {
            if (!(interfaceC2249921D4k instanceof C2249891D4h) && !(interfaceC2249921D4k instanceof C2249901D4i)) {
                c2249911D4j = new C2189991AnN(c1d49.LIZ(), c1d49.LJIJ);
                c1d49.LJJIIZ = "bottom_line";
            } else {
                LIZLLL();
                if (this.LJIIIZ != null) {
                    C1267100j4u c1267100j4u = new C1267100j4u();
                    if (c1d49.LJIIJJI == EnumC783720Uok.MANUAL) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    c1267100j4u.LIZIZ = i;
                    c1267100j4u.LIZJ = c1d49.LJIJI ? 1 : 0;
                    c1267100j4u.LIZLLL = c1d49.LJFF ? 1 : 0;
                    c1267100j4u.LIZ = this.LJJIIJ ? 1 : 0;
                    c1267100j4u.LJ = this.LJJIIJZLJL ? 1 : 0;
                    c1267100j4u.LJFF = c1d49.LJIJ;
                    c1267100j4u.LJI = c1d49.LIZIZ;
                    c1267100j4u.LJII = c1d49.LJJII;
                    c1267100j4u.LJIIIIZZ = new Double(c1d49.LJJIII).floatValue();
                    c1267100j4u.LJIIIZ = c1d49.LIZ();
                    if (!TextUtils.isEmpty(c1d49.LIZJ)) {
                        try {
                            JSONObject jSONObject = new JSONObject(c1d49.LIZJ);
                            long j = c1d49.LJIIIIZZ;
                            c1267100j4u.LJIIJJI = LJI(jSONObject.optLong("dns_time", -1L), j);
                            c1267100j4u.LJIIL = LJI(jSONObject.optLong("socket_connect_time", -1L), j);
                            c1267100j4u.LJIILIIL = LJI(jSONObject.optLong("rtmp_connect_time", -1L), j);
                            c1267100j4u.LJIILJJIL = LJI(jSONObject.optLong("start_send_packet_time", -1L), j);
                            long j2 = c1d49.LJIIIIZZ;
                            if (j2 != -1) {
                                c1267100j4u.LJIILL = LJI(c1d49.LJIIIZ, j2);
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    EnumC804650VhP enumC804650VhP = c1d49.LJJIIJZLJL;
                    if (enumC804650VhP != null) {
                        c1267100j4u.LJIILLIIL = enumC804650VhP.getKey();
                    }
                    c1267100j4u.LJIIJ = (int) c1d49.LJJIFFI;
                    c1267100j4u.LJIIZILJ = c1d49.LJII;
                    c1267100j4u.LJIJ = this.LIZLLL.LJIJ;
                    if (c1d49.LJ == EnumC2249801D3y.FROM_FILE_CACHE) {
                        c1267100j4u.LJJIII = 100;
                    } else {
                        c1267100j4u.LJJIII = 101;
                        if (this.LJJIJIL == EnumC1283150jUn.STAGE && (c1d5f = this.LJIIL) != null && c1d5f.LJIIIIZZ == 1 && LJIILJJIL()) {
                            c1267100j4u.LJIIIZ = -1;
                        }
                        BwProbeCacheResult bwProbeCacheResultLJIIJJI = LJIIJJI();
                        if (bwProbeCacheResultLJIIJJI != null) {
                            c1267100j4u.LJIJJ = bwProbeCacheResultLJIIJJI.netSpeed;
                            c1267100j4u.LJIJJLI = bwProbeCacheResultLJIIJJI.finalNetSpeed;
                            c1267100j4u.LJIJI = bwProbeCacheResultLJIIJJI.protocol;
                            c1267100j4u.LJIL = bwProbeCacheResultLJIIJJI.rtt;
                            c1267100j4u.LJJ = (float) bwProbeCacheResultLJIIJJI.lossRate;
                        }
                    }
                    C1267080j4s c1267080j4s = this.LJIIIZ.LIZIZ;
                    c1267080j4s.LIZ(c1267080j4s.LJI, c1267100j4u);
                    C1267130j4x c1267130j4x = new C1267130j4x();
                    C1D5M c1d5m = this.LJIILL;
                    if (c1d5m != null) {
                        c1267130j4x.LIZJ = LJIILLIIL("golive_speedtest_low_prob_wifi", c1d5m.LIZ);
                        c1267130j4x.LJ = LJIILLIIL("golive_speedtest_high_prob_wifi", this.LJIILL.LIZ);
                        c1267130j4x.LIZLLL = LJIILLIIL("golive_speedtest_low_prob_mobile", this.LJIILL.LIZ);
                        c1267130j4x.LJFF = LJIILLIIL("golive_speedtest_high_prob_mobile", this.LJIILL.LIZ);
                    }
                    C1267080j4s c1267080j4s2 = this.LJIIIZ.LIZIZ;
                    c1267080j4s2.LIZ(c1267080j4s2.LJFF, c1267130j4x);
                    c2249911D4j = new C2249911D4j(this.LJIIIZ, c1d49);
                } else {
                    c2249911D4j = null;
                }
                c1d49.LJJIIZ = "adaptive";
            }
            C1D46 c1d46LIZLLL = this.LJFF.LIZLLL(c2249911D4j);
            this.LJJIZ = c1d49.LJJIJ;
            if (c1d46LIZLLL != null) {
                c1d49.LIZ = c1d46LIZLLL;
            } else {
                if (this.LJI != null) {
                    c1d49.LIZ = this.LJI.LIZLLL(new C2189991AnN(c1d49.LIZ(), c1d49.LJIJ));
                }
                c1d49.LJJIIZ = "adaptive_backup";
            }
            if (this.LJFF instanceof C2249891D4h) {
                LIZLLL();
                C1268340j6u c1268340j6u = this.LJIIIZ;
                if (c1268340j6u != null) {
                    C1267080j4s c1267080j4s3 = c1268340j6u.LIZIZ;
                    c1267080j4s3.getClass();
                    c1267080j4s3.LJFF = new C1267130j4x();
                    c1267080j4s3.LJI = new C1267100j4u();
                }
            }
        }
    }

    public final C1D49 LJIIIZ(C776580UdE c776580UdE) {
        boolean z;
        InterfaceC2249921D4k interfaceC2249921D4k;
        EnumC1277260jLI enumC1277260jLI;
        C1D5F c1d5f;
        BwProbeCacheResult bwProbeCacheResultLJIIJJI;
        C1D50 c1d50 = this.LIZLLL;
        if (c1d50 != null && c1d50.LIZ) {
            C1D49 c1d49 = this.LJJIJ;
            if (c1d49 != null && c1d50.LJIILLIIL) {
                return c1d49;
            }
            C1D49 c1d492 = this.LJJIIZI;
            if (c1d492 != null) {
                if (this.LJJIIZ) {
                    c1d492.LJ = EnumC2249801D3y.CURRENT_RESULT;
                } else {
                    c1d492.LJ = EnumC2249801D3y.FROM_MEMORY_CACHE;
                }
                c1d492.LJIIJJI = this.LJJIJIIJI;
            }
            if (c1d492 != null) {
                boolean z2 = this.LJIL;
                c1d492.LJFF = z2;
                if (this.LJJIIZ) {
                    c1d492.LJ = EnumC2249801D3y.CURRENT_RESULT;
                    if (z2) {
                        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("getProbeResultNow, Fatal state.");
                        InterfaceC1283430jVF interfaceC1283430jVF = C1283030jUb.LIZ.LIZ;
                        if (interfaceC1283430jVF != null) {
                            interfaceC1283430jVF.LJFF("BwProbeServiceImpl.getProbeResultNow", androidRuntimeException);
                        }
                        c1d492.LJI = "succeed_invalid_status";
                        return c1d492;
                    }
                    if (this.LJJIJIIJI == EnumC783720Uok.MANUAL) {
                        if (this.LJJIJIIJIL == EnumC2249781D3w.MANUAL_PROBE_APPLY) {
                            c1d492.LJI = "selected";
                            return c1d492;
                        }
                        if (c1d492.LJJ.equals("failed_use_cache")) {
                            this.LJIJJ.LJII = true;
                            c1d492.LJI = "manual_failed_io_cache";
                            return c1d492;
                        }
                        this.LJIJJ.LJII = false;
                        c1d492.LJI = "manual_succeed";
                        return c1d492;
                    }
                    if (c1d492.LJJ.equals("failed_use_cache")) {
                        this.LJIJJ.LJII = true;
                        c1d492.LJI = "failed_io_cache";
                        return c1d492;
                    }
                    this.LJIJJ.LJII = false;
                    c1d492.LJI = "succeed";
                    return c1d492;
                }
                c1d492.LJ = EnumC2249801D3y.FROM_MEMORY_CACHE;
                C2250051D4x c2250051D4x = this.LJIJJ;
                c2250051D4x.getClass();
                c2250051D4x.LJI = c1d492.LIZJ();
                c2250051D4x.LJIJ = c1d492.LJJIIZ;
                c2250051D4x.LJIJI = c1d492.LJJIIZI;
                if (this.LJIL) {
                    c1d492.LJI = "running_memory_cache";
                    return c1d492;
                }
                if (this.LJJIJLIJ) {
                    c1d492.LJI = "manual_canceled_memory_cache";
                    return c1d492;
                }
                if (this.LJJIJIIJI == EnumC783720Uok.MANUAL) {
                    c1d492.LJI = "manual_failed_memory_cache";
                    return c1d492;
                }
                c1d492.LJI = "failed_memory_cache";
                return c1d492;
            }
            if ((c776580UdE == null || !c776580UdE.LIZ) && this.LIZJ != null && this.LJIL && c1d50.LIZJ) {
                C1282850jUJ c1282850jUJLJFF = LJFF();
                if (c1282850jUJLJFF == null) {
                    C1283420jVE.LIZLLL("BwProbeServiceImpl", "getCurrentResult: null result");
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getCurrentResult:");
                    sbLIZ.append(c1282850jUJLJFF.LIZ);
                    sbLIZ.append(";");
                    sbLIZ.append(c1282850jUJLJFF.LIZIZ);
                    sbLIZ.append(";");
                    sbLIZ.append(c1282850jUJLJFF.LIZJ);
                    sbLIZ.append(";");
                    sbLIZ.append(c1282850jUJLJFF.LIZLLL);
                    sbLIZ.append(";");
                    sbLIZ.append(this.LJJIJIL);
                    C1283420jVE.LIZLLL("BwProbeServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
                    try {
                        C1D49 c1d493 = new C1D49();
                        JSONObject jSONObject = new JSONObject(c1282850jUJLJFF.LIZLLL);
                        int iOptInt = jSONObject.optInt("level");
                        c1d493.LIZ = new C1D46(iOptInt, this.LJJIJIL);
                        c1d493.LJIJJ = iOptInt;
                        if (c1282850jUJLJFF.LIZ == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c1d493.LJIJI = z;
                        int iOptInt2 = jSONObject.optInt("reason", -1);
                        if (z) {
                            iOptInt2 = 0;
                        }
                        c1d493.LIZIZ = c1282850jUJLJFF.LIZIZ;
                        c1d493.LJIJ = jSONObject.optInt("bwProbeRealProtocol", -1);
                        c1d493.LJJII = jSONObject.optInt("rttAvg", -1);
                        c1d493.LJJIII = jSONObject.optDouble("lossRateAvg", -1.0d);
                        c1d493.LJJIIJ = jSONObject.optString("bw_probe_id", "");
                        c1d493.LIZJ = c1282850jUJLJFF.LIZLLL;
                        c1d493.LJ = EnumC2249801D3y.CURRENT_RESULT;
                        c1d493.LJFF = true;
                        int i = c1282850jUJLJFF.LIZ;
                        C2250051D4x c2250051D4x2 = this.LJIJJ;
                        if (c2250051D4x2 != null) {
                            c1d493.LJJIFFI = System.currentTimeMillis() - c2250051D4x2.LIZLLL;
                        }
                        LIZJ(c1d493);
                        c1d493.LJIIZILJ = iOptInt2;
                        c1d493.LJIILLIIL = i;
                        c1d493.LJIIL = this.LJJIL;
                        C2250051D4x c2250051D4x3 = this.LJIJJ;
                        if (c2250051D4x3 != null) {
                            if (iOptInt2 != -1) {
                                c2250051D4x3.LJIIJ = iOptInt2;
                            }
                            if (i != -1) {
                                c2250051D4x3.LJIIIZ = i;
                            }
                            c2250051D4x3.LIZLLL(c1d493);
                        }
                        LJIJJLI(c1d493);
                        LJ(c1d493);
                        LIZIZ(c1d493);
                        C2250051D4x c2250051D4x4 = this.LJIJJ;
                        if (c2250051D4x4 != null) {
                            c2250051D4x4.LJI = c1d493.LIZJ();
                            c2250051D4x4.LJIJ = c1d493.LJJIIZ;
                            c2250051D4x4.LJIJI = c1d493.LJJIIZI;
                        }
                        C1D5I c1d5i = this.LJIILJJIL;
                        if ((c1d5i == null || c1d5i.LIZLLL != 1 || c1d493.LJJI <= -1) && (!z || (c1d493.LIZIZ() < c1d493.LJII && ((!LJIILJJIL() && !LJIILIIL()) || !this.LIZLLL.LJIJI)))) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("getCurrentProbeResult abort ->");
                            sbLIZ2.append(this.LJJIJIL);
                            sbLIZ2.append(";");
                            sbLIZ2.append(c1d493.LIZIZ());
                            sbLIZ2.append(";");
                            sbLIZ2.append(this.LIZJ.LIZLLL);
                            C1283420jVE.LIZLLL("BwProbeServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
                        }
                        if (c1d493.LJJ.equals("failed_use_cache")) {
                            this.LJIJJ.LJII = true;
                            c1d493.LJI = "running_io_cache";
                            return c1d493;
                        }
                        this.LJIJJ.LJII = false;
                        c1d493.LJI = "running_success";
                        return c1d493;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
            if (this.LJIILIIL == null && (bwProbeCacheResultLJIIJJI = LJIIJJI()) != null) {
                C1D49 c1d494 = new C1D49();
                LJIJI(c1d494, bwProbeCacheResultLJIIJJI);
                if (this.LJIIL.LJI == 1) {
                    LJ(c1d494);
                }
                LIZJ(c1d494);
                c1d494.LJIIL = this.LJJIL;
                LIZIZ(c1d494);
                C2250051D4x c2250051D4x5 = this.LJIJJ;
                if (c2250051D4x5 != null) {
                    c2250051D4x5.LJII = true;
                    C1D50 c1d502 = this.LIZLLL;
                    if (c1d502 != null && !c1d502.LJIJJ) {
                        c2250051D4x5.LJIIJ = 0;
                        c2250051D4x5.LIZJ.put(EnumC2250061D4y.SPEED_TEST_END_RESULT, String.valueOf(0));
                        int i2 = c2250051D4x5.LJIIIZ;
                        if (i2 != -1) {
                            c2250051D4x5.LIZJ.put(EnumC2250061D4y.SPEED_TEST_END_STATUS, String.valueOf(i2));
                        }
                    }
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("ProbeCache getCacheResult success-->");
                sbLIZ3.append(c1d494.LIZIZ());
                sbLIZ3.append(";");
                sbLIZ3.append(bwProbeCacheResultLJIIJJI.netType);
                sbLIZ3.append(";");
                sbLIZ3.append(LJIIIIZZ());
                C1283420jVE.LIZLLL("BwProbeServiceImpl", C2188811AlT.LIZIZ(sbLIZ3));
                if (this.LJIL) {
                    c1d494.LJI = "running_io_cache";
                    return c1d494;
                }
                if (this.LJJIJLIJ) {
                    c1d494.LJI = "manual_canceled_io_cache";
                    return c1d494;
                }
                if (this.LJJIJIIJI == EnumC783720Uok.MANUAL) {
                    c1d494.LJI = "manual_failed_io_cache";
                    return c1d494;
                }
                c1d494.LJI = "failed_io_cache";
                return c1d494;
            }
            C1D49 c1d495 = new C1D49();
            if (this.LIZJ != null) {
                c1d495.LJ = EnumC2249801D3y.FROM_RECOMMEND_LEVEL;
                LIZJ(c1d495);
                if ((this.LJJIJIL != EnumC1283150jUn.STAGE || ((c1d5f = this.LJIIL) != null && c1d5f.LIZ == 1)) && (interfaceC2249921D4k = this.LJFF) != null) {
                    C1D46 c1d46LIZJ = interfaceC2249921D4k.LIZJ(this.LIZJ.LIZLLL);
                    c1d46LIZJ.LJFF = true;
                    c1d495.LIZ = c1d46LIZJ;
                }
                c1d495.LJIIL = this.LJJIL;
                LIZIZ(c1d495);
                C2250051D4x c2250051D4x6 = this.LJIJJ;
                if (c2250051D4x6 != null && (enumC1277260jLI = c1d495.LJIIL) != null) {
                    c2250051D4x6.LJIJJ = enumC1277260jLI.value();
                }
            }
            if (this.LJIL) {
                c1d495.LJI = "running_recommend";
                return c1d495;
            }
            if (this.LJJIJLIJ) {
                c1d495.LJI = "manual_canceled_no_cache";
                return c1d495;
            }
            if (this.LJJIJIIJI == EnumC783720Uok.MANUAL) {
                c1d495.LJI = "manual_failed_no_cache";
                return c1d495;
            }
            c1d495.LJI = "failed_no_cache";
            return c1d495;
        }
        return null;
    }

    public final void LJIJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("safeRelease ->");
        sbLIZ.append(str);
        sbLIZ.append(";");
        sbLIZ.append(this.LJJJ.get());
        C1283420jVE.LIZLLL("BwProbeServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LJJJ.getAndSet(true)) {
            C1D5H c1d5h = this.LJJ;
            if (c1d5h != null) {
                c1d5h.cancel();
            }
            this.LJJIJL = 0;
            HashMap map = (HashMap) C1867350yh3.LIZ;
            Timer timer = (Timer) map.get("probe_progress_task");
            if (timer != null) {
                timer.cancel();
                map.remove("probe_progress_task");
            }
            LJIIZILJ();
            if (this.LJIJ != null) {
                if (LIZ()) {
                    BwProbeWrapper bwProbeWrapper = this.LJIJ;
                    bwProbeWrapper.getClass();
                    C1283420jVE.LIZIZ();
                    bwProbeWrapper.LJ();
                    bwProbeWrapper.LIZLLL();
                } else {
                    this.LJIJ.LIZJ();
                }
            }
            if (this.LJIJI != null) {
                if (LIZ()) {
                    C1282870jUL c1282870jUL = this.LJIJI;
                    c1282870jUL.getClass();
                    C1283420jVE.LIZIZ();
                    c1282870jUL.LJ();
                    c1282870jUL.LIZLLL();
                } else {
                    this.LJIJI.LIZJ();
                }
            }
            this.LIZ = null;
            this.LIZIZ = null;
            C2250071D4z c2250071D4z = this.LIZJ;
            if (c2250071D4z != null) {
                c2250071D4z.LJFF = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x01ed A[Catch: Exception -> 0x0328, TryCatch #2 {Exception -> 0x0328, blocks: (B:55:0x0139, B:57:0x0162, B:59:0x016a, B:60:0x0174, B:62:0x0179, B:63:0x017e, B:65:0x0186, B:66:0x018d, B:68:0x0195, B:70:0x01a7, B:71:0x01af, B:72:0x01b7, B:81:0x01cd, B:83:0x01d1, B:84:0x01ed, B:86:0x01f1, B:88:0x01f5, B:89:0x0201, B:91:0x020e, B:92:0x0213, B:94:0x021b, B:95:0x0222, B:97:0x022e, B:98:0x0233, B:100:0x0238, B:101:0x023d, B:103:0x0245, B:104:0x024a, B:106:0x024f, B:107:0x0254, B:109:0x025c, B:110:0x0263, B:112:0x0277, B:113:0x027f, B:115:0x0285, B:116:0x028d, B:118:0x0295, B:119:0x029d, B:121:0x02a1, B:123:0x02a9, B:124:0x02b1, B:143:0x02ef, B:147:0x02fe, B:144:0x02f5, B:146:0x02f9, B:148:0x0305, B:150:0x0317, B:151:0x031e, B:153:0x0322, B:126:0x02b8, B:128:0x02c0, B:129:0x02c3, B:131:0x02c9, B:132:0x02cc, B:134:0x02d2, B:135:0x02d5, B:137:0x02da, B:138:0x02df, B:140:0x02e3), top: B:162:0x0139 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(X.C1D45 r22) {
        /*
            Method dump skipped, instruction units count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2250011D4t.LJIJJ(X.1D45):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI(X.C1D49 r25) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2250011D4t.LJIJJLI(X.1D49):void");
    }

    public static float LJIILLIIL(String str, Map map) {
        Float f;
        if (map != null && map.containsKey(str)) {
            VideoQualityPortrait videoQualityPortrait = (VideoQualityPortrait) map.get(str);
            if (videoQualityPortrait.dataType == EnumC2215461BnM.FLOAT && (f = videoQualityPortrait.LIZ) != null) {
                return f.floatValue();
            }
            return -1.0f;
        }
        return -1.0f;
    }

    public final void LJIILL(EnumC773550UWb enumC773550UWb, EnumC783720Uok enumC783720Uok) {
        this.LJJII = enumC773550UWb;
        C1D41 c1d41 = this.LIZ;
        if (c1d41 != null) {
            c1d41.LIZJ(enumC773550UWb, enumC783720Uok);
        }
    }

    public final void LJIJI(C1D49 c1d49, BwProbeCacheResult bwProbeCacheResult) {
        c1d49.LIZ = new C1D46(bwProbeCacheResult.level, this.LJJIJIL);
        int i = bwProbeCacheResult.netSpeed;
        c1d49.LIZIZ = i;
        c1d49.LJJI = Math.max(i, bwProbeCacheResult.finalNetSpeed);
        c1d49.LJIJ = bwProbeCacheResult.protocol;
        c1d49.LJ = EnumC2249801D3y.FROM_FILE_CACHE;
        c1d49.LJFF = false;
        c1d49.LJJII = bwProbeCacheResult.rtt;
        c1d49.LJJIII = bwProbeCacheResult.lossRate;
    }

    public final void LJIIL(int i, int i2, String str) {
        boolean z;
        long jCurrentTimeMillis;
        int i3;
        C0UWQ c0uwq;
        C1D50 c1d50;
        int i4;
        C1D50 c1d502;
        C1D50 c1d503;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleProbeMessage result:");
        sbLIZ.append(this.LJJIJIIJI);
        sbLIZ.append(";");
        sbLIZ.append(this.LJJIJLIJ);
        sbLIZ.append(";");
        sbLIZ.append(i);
        sbLIZ.append(";");
        sbLIZ.append(i2);
        sbLIZ.append(";");
        sbLIZ.append(this.LJJI);
        sbLIZ.append(str);
        sbLIZ.append(";");
        C1283420jVE.LIZLLL("BwProbeServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LJIL) {
            return;
        }
        if ((this.LJJIJ != null && (c1d503 = this.LIZLLL) != null && c1d503.LJIILLIIL) || this.LIZLLL == null || this.LIZJ == null || i == 3) {
            return;
        }
        try {
            LJIIZILJ();
            int i5 = 1;
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("level", -1);
            int iOptInt2 = jSONObject.optInt("reason", -1);
            if (z) {
                iOptInt2 = 0;
            }
            int iOptInt3 = jSONObject.optInt("useProbeResult", 0);
            C2250051D4x c2250051D4x = this.LJIJJ;
            if (c2250051D4x == null) {
                jCurrentTimeMillis = 0;
            } else {
                try {
                    jCurrentTimeMillis = System.currentTimeMillis() - c2250051D4x.LIZLLL;
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("handleProbeMessage parse fail:");
                    sbLIZ2.append(e);
                    C1283420jVE.LIZLLL("BwProbeServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
                    LJIILL(EnumC773550UWb.BAD_CONNECTION, this.LJJIJIIJI);
                    this.LJJI = false;
                    LJIIZILJ();
                    return;
                }
            }
            VideoQualityMockConfig videoQualityMockConfig = this.LJIILLIIL;
            if (videoQualityMockConfig != null && videoQualityMockConfig.mockProbeSwitch == 1) {
                i3 = videoQualityMockConfig.mockProbeNetSpeed;
                if (i3 <= -1) {
                    i3 = i2;
                }
                int i6 = videoQualityMockConfig.mockProbeDuration;
                if (i6 > -1) {
                    jCurrentTimeMillis = i6;
                }
                int i7 = videoQualityMockConfig.mockProbeStatusCode;
                if (i7 > -1) {
                    if (i7 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    iOptInt2 = i7;
                }
            } else {
                i3 = i2;
            }
            C1D49 c1d49 = new C1D49();
            c1d49.LJIJ = jSONObject.optInt("bwProbeRealProtocol", -1);
            c1d49.LJJII = jSONObject.optInt("rttAvg", -1);
            c1d49.LJJIII = jSONObject.optDouble("lossRateAvg", -1.0d);
            c1d49.LJJIIJ = jSONObject.optString("bw_probe_id", "");
            c1d49.LIZ = new C1D46(iOptInt, this.LJJIJIL);
            c1d49.LJIJI = z;
            c1d49.LJIJJ = iOptInt;
            c1d49.LIZIZ = i3;
            c1d49.LIZJ = str;
            c1d49.LJ = EnumC2249801D3y.CURRENT_RESULT;
            c1d49.LJFF = false;
            c1d49.LJIIIZ = System.currentTimeMillis();
            C1D50 c1d504 = this.LIZLLL;
            if (i3 >= 0 && c1d504 != null) {
                long j = i3;
                if (j > c1d504.LJIILJJIL) {
                    c0uwq = C0UWQ.GOOD_NETWORK;
                } else if (j > c1d504.LJIILIIL) {
                    c0uwq = C0UWQ.NORMAL_NETWORK;
                } else {
                    c0uwq = C0UWQ.POOR_NETWORK;
                }
            } else {
                c0uwq = C0UWQ.DEFAULT;
            }
            c1d49.LJIIJ = c0uwq;
            c1d49.LJJIFFI = jCurrentTimeMillis;
            LIZJ(c1d49);
            c1d49.LJIILL = iOptInt2;
            c1d49.LJIILJJIL = i;
            c1d49.LJIIL = this.LJJIL;
            C2250051D4x c2250051D4x2 = this.LJIJJ;
            if (c2250051D4x2 != null) {
                if (iOptInt2 != -1) {
                    c2250051D4x2.LJIIJ = iOptInt2;
                }
                if (i != -1) {
                    c2250051D4x2.LJIIIZ = i;
                }
                c2250051D4x2.LIZLLL(c1d49);
            }
            LJIJJLI(c1d49);
            LJ(c1d49);
            LIZIZ(c1d49);
            C2250051D4x c2250051D4x3 = this.LJIJJ;
            if (c2250051D4x3 != null) {
                c2250051D4x3.LJI = c1d49.LIZJ();
                c2250051D4x3.LJIJ = c1d49.LJJIIZ;
                c2250051D4x3.LJIJI = c1d49.LJJIIZI;
            }
            if (c1d49.LJJI > -1 || ((z && (c1d49.LIZ() >= this.LIZLLL.LJI || LJIILJJIL() || LJIILIIL())) || (LJIILIIL() && (c1d502 = this.LIZLLL) != null && c1d502.LJJIII))) {
                this.LJJIIZ = true;
                this.LJJIIZI = c1d49;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("callback FinishedProbeResult:");
                sbLIZ3.append(c1d49);
                C1283420jVE.LIZLLL("BwProbeServiceImpl", C2188811AlT.LIZIZ(sbLIZ3));
                C1D5U c1d5u = this.LIZIZ;
                if (c1d5u != null) {
                    ((C2250001D4s) c1d5u).LJIJJ(this.LJJIIZI);
                }
                LJIILL(EnumC773550UWb.GOOD_CONNECTION, this.LJJIJIIJI);
            } else {
                C1D5U c1d5u2 = this.LIZIZ;
                if (c1d5u2 != null && this.LJJIJIL == EnumC1283150jUn.STAGE) {
                    ((C2250001D4s) c1d5u2).LJIJJ(null);
                }
                LJIILL(EnumC773550UWb.BAD_CONNECTION, this.LJJIJIIJI);
            }
            if (z) {
                C1D41 c1d41 = this.LIZ;
                if (c1d41 != null) {
                    c1d41.LIZ(c1d49);
                }
            } else {
                if (this.LJJIJIL == EnumC1283150jUn.GAME && this.LIZ != null) {
                    if (LJIILIIL() && (c1d50 = this.LIZLLL) != null && c1d50.LJJIII) {
                        c1d49.LJIILJJIL = 1;
                    }
                    this.LIZ.LIZ(c1d49);
                }
                LJIILL(EnumC773550UWb.PROBE_FAILED, this.LJJIJIIJI);
            }
            if (i != 3 || this.LJJI) {
                if (this.LJJII == EnumC773550UWb.GOOD_CONNECTION) {
                    i4 = 0;
                } else {
                    i4 = 4;
                }
                if (!z) {
                    i5 = i4;
                }
                if (this.LJJI) {
                    i5 = 3;
                }
                this.LJIJJLI.LIZ(c1d49, i5, iOptInt3, this.LJJIFFI, iOptInt2);
            }
            this.LJJI = false;
        } catch (Exception e2) {
            e = e2;
        }
    }
}
