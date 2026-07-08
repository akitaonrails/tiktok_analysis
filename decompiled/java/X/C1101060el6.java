package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveHostCpuInfoFetchExp;
import com.bytedance.android.livesdk.performance.PerfItemConfig;
import com.bytedance.android.livesdk.performance.RealtimeGameHostPerfScoreSettings;
import com.bytedance.android.livesdk.performance.RealtimeHostPerfScoreSettings;
import com.bytedance.android.livesdk.performance.RealtimePerfScoreSettings;
import com.bytedance.android.livesdk.performance.ScorePiecewise;
import com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0el6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1101060el6 implements InterfaceC1100800ekg {
    public static volatile C1100750ekb LJIJI;
    public static final Map<String, C1100750ekb> LJIJJ = new ConcurrentHashMap();
    public final String LIZ;
    public final InterfaceC1100960ekw LIZIZ;
    public final InterfaceC1101100elA LIZJ;
    public final InterfaceC1100980eky LIZLLL;
    public final InterfaceC1100970ekx LJ;
    public final InterfaceC1100990ekz LJFF;
    public final C310630CFp LJI;
    public final InterfaceC1100950ekv LJII;
    public final InterfaceC1101000el0 LJIIIIZZ;
    public final InterfaceC1100940eku LJIIIZ;
    public final InterfaceC1101140elE[] LJIIJ;
    public final ArrayList<InterfaceC1101120elC> LJIIJJI;
    public volatile boolean LJIIL;
    public volatile boolean LJIILIIL;
    public final C1101110elB LJIILJJIL;
    public final C1101110elB LJIILL;
    public final C1101110elB LJIILLIIL;
    public final C1101110elB LJIIZILJ;
    public final C1101110elB LJIJ;

    @Override // X.InterfaceC1100800ekg
    public final synchronized void destroy() {
        stop();
        for (InterfaceC1101140elE interfaceC1101140elE : this.LJIIJ) {
            interfaceC1101140elE.destroy();
        }
        C1EOY c1eoy = C1EOY.LIZ;
        if (Intrinsics.LJFF(C1EOY.LJIJI, this.LJFF)) {
            C1EOY.LJIJI = null;
        }
        Iterator it2 = new ArrayList(this.LJIIJJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1101120elC) it2.next()).LIZLLL(this);
        }
        this.LJIIJJI.clear();
        this.LJIIL = true;
    }

    @Override // X.InterfaceC1100800ekg
    public final C1100760ekc LJFF() {
        return new C1100760ekc(this.LIZJ.LJ(), this.LIZJ.LIZJ(), this.LIZJ.LJFF(), this.LIZJ.LIZ(), this.LIZJ.LIZIZ());
    }

    @Override // X.InterfaceC1100800ekg
    public final C1100750ekb LJIIIZ() {
        C1100750ekb c1100750ekb;
        if (!this.LJIILIIL) {
            return null;
        }
        synchronized (this) {
            try {
                for (InterfaceC1101140elE interfaceC1101140elE : this.LJIIJ) {
                    interfaceC1101140elE.LJI();
                }
                Iterator<InterfaceC1101120elC> it2 = this.LJIIJJI.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ();
                }
                C1101180elI c1101180elILJIILIIL = LJIILIIL(this.LJIILJJIL);
                c1100750ekb = new C1100750ekb(Intrinsics.LJFF(this.LJIILJJIL, this.LJIILL) ? c1101180elILJIILIIL : LJIILIIL(this.LJIILL), Intrinsics.LJFF(this.LJIILJJIL, this.LJIILLIIL) ? c1101180elILJIILIIL : LJIILIIL(this.LJIILLIIL), c1101180elILJIILIIL, RealtimeHostPerfScoreSettings.isEnabled() ? LJIIJJI(this.LJIIZILJ) : null, RealtimeGameHostPerfScoreSettings.isEnabled() ? LJIIJJI(this.LJIJ) : null);
                LJIJI = c1100750ekb;
                ((ConcurrentHashMap) LJIJJ).put(this.LIZ, c1100750ekb);
                Iterator<InterfaceC1101120elC> it3 = this.LJIIJJI.iterator();
                while (it3.hasNext()) {
                    it3.next().LIZJ(this, c1100750ekb);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c1100750ekb;
    }

    @Override // X.InterfaceC1100800ekg
    public final void start() {
        if (this.LJIILIIL) {
            return;
        }
        synchronized (this) {
            try {
                if (this.LJIILIIL) {
                    return;
                }
                for (InterfaceC1101140elE interfaceC1101140elE : this.LJIIJ) {
                    interfaceC1101140elE.start();
                }
                C1EOY c1eoy = C1EOY.LIZ;
                C1EOY.LJIJI = this.LJFF;
                Iterator<InterfaceC1101120elC> it2 = this.LJIIJJI.iterator();
                while (it2.hasNext()) {
                    it2.next().LJIIIZ(this);
                }
                this.LJIILIIL = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1100800ekg
    public final void stop() {
        if (this.LJIILIIL) {
            synchronized (this) {
                try {
                    if (this.LJIILIIL) {
                        for (InterfaceC1101140elE interfaceC1101140elE : this.LJIIJ) {
                            interfaceC1101140elE.stop();
                        }
                        Iterator<InterfaceC1101120elC> it2 = this.LJIIJJI.iterator();
                        while (it2.hasNext()) {
                            it2.next().onStop();
                        }
                        this.LJIILIIL = false;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.InterfaceC1100800ekg
    public final InterfaceC1101000el0 LIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC1100800ekg
    public final InterfaceC1100960ekw LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1100800ekg
    public final InterfaceC1100970ekx LIZJ() {
        return this.LJ;
    }

    @Override // X.InterfaceC1100800ekg
    public final InterfaceC1100940eku LIZLLL() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC1100800ekg
    public final InterfaceC1100950ekv LJ() {
        return this.LJII;
    }

    @Override // X.InterfaceC1100800ekg
    public final C310630CFp LJI() {
        return this.LJI;
    }

    @Override // X.InterfaceC1100800ekg
    public final InterfaceC1100980eky LJIIJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1100800ekg
    public final boolean isDestroyed() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC1100800ekg
    public final InterfaceC1100990ekz message() {
        return this.LJFF;
    }

    public C1101060el6(InterfaceC1101080el8 interfaceC1101080el8) {
        String strScene = interfaceC1101080el8.scene();
        this.LIZ = strScene == null ? "default" : strScene;
        InterfaceC1100960ekw interfaceC1100960ekwLIZIZ = interfaceC1101080el8.LIZIZ();
        interfaceC1100960ekwLIZIZ = interfaceC1100960ekwLIZIZ == null ? new InterfaceC1100960ekw() { // from class: X.0elJ
            public final Set<Function1<Double, Unit>> LIZ = new LinkedHashSet();

            @Override // X.InterfaceC1101140elE
            public final synchronized void LJI() {
                if (this.LIZ.isEmpty()) {
                    return;
                }
                double dLIZ = LIZ();
                Iterator<Function1<Double, Unit>> it2 = this.LIZ.iterator();
                while (it2.hasNext()) {
                    it2.next().invoke(Double.valueOf(dLIZ));
                }
            }

            @Override // X.InterfaceC1101140elE
            public final void start() {
            }

            @Override // X.InterfaceC1101140elE
            public final void stop() {
            }

            @Override // X.InterfaceC1100820eki
            public final double LIZ() {
                C1163660gO4.LIZ.getClass();
                HashMap<String, Double> map = C1163660gO4.LIZIZ;
                if (RealtimePerfScoreSettings.INSTANCE.useOtisCpuSpeed() && LiveHostCpuInfoFetchExp.INSTANCE.isEnable()) {
                    Double d = map.get("cpu_speed_otis");
                    if (d != null) {
                        return d.doubleValue();
                    }
                    return 0.0d;
                }
                Double d2 = map.get("cpu_speed");
                if (d2 != null) {
                    return d2.doubleValue();
                }
                return 0.0d;
            }

            @Override // X.InterfaceC1101140elE
            public final void destroy() {
                this.LIZ.clear();
            }

            @Override // X.InterfaceC1100820eki
            public final double getCpuRate() {
                Double d;
                C1163660gO4.LIZ.getClass();
                HashMap<String, Double> map = C1163660gO4.LIZIZ;
                if (!(RealtimePerfScoreSettings.INSTANCE.useOtisCpuRate() && LiveHostCpuInfoFetchExp.INSTANCE.isEnable()) || (d = map.get("cpu_rate_otis")) == null) {
                    return 0.0d;
                }
                return d.doubleValue();
            }

            @Override // X.InterfaceC1100820eki
            public final double LIZJ() {
                int iLJ = C1305320k4Y.LJ(C497740JfY.LJII());
                if (iLJ != -999) {
                    return LIZ() / ((double) iLJ);
                }
                return 0.0d;
            }

            @Override // X.InterfaceC1100820eki
            public final synchronized void LIZIZ(C1090250eTf c1090250eTf) {
                this.LIZ.add(c1090250eTf);
            }
        } : interfaceC1100960ekwLIZIZ;
        this.LIZIZ = interfaceC1100960ekwLIZIZ;
        this.LIZJ = ((IHostPerformanceMonitor) C1161920gLG.LIZJ(IHostPerformanceMonitor.class)).OK1();
        InterfaceC1100980eky interfaceC1100980ekyLJFF = interfaceC1101080el8.LJFF();
        interfaceC1100980ekyLJFF = interfaceC1100980ekyLJFF == null ? new InterfaceC1100980eky() { // from class: X.0Vxc
            public final Set<Function1<Long, Unit>> LIZ = new LinkedHashSet();

            @Override // X.InterfaceC1101140elE
            public final synchronized void LJI() {
                if (this.LIZ.isEmpty()) {
                    return;
                }
                long jLIZIZ = LIZIZ();
                Iterator<Function1<Long, Unit>> it2 = this.LIZ.iterator();
                while (it2.hasNext()) {
                    it2.next().invoke(Long.valueOf(jLIZIZ));
                }
            }

            @Override // X.InterfaceC1101140elE
            public final synchronized void destroy() {
                this.LIZ.clear();
            }

            @Override // X.InterfaceC1101140elE
            public final void start() {
            }

            @Override // X.InterfaceC1101140elE
            public final void stop() {
            }

            @Override // X.InterfaceC1090200eTa
            public final long LIZ() {
                C1163660gO4.LIZ.getClass();
                Long l = C1163660gO4.LIZJ.get("mem_java_total");
                if (l != null) {
                    return l.longValue();
                }
                return -1L;
            }

            @Override // X.InterfaceC1090200eTa
            public final long LIZIZ() {
                C1163660gO4.LIZ.getClass();
                Long l = C1163660gO4.LIZJ.get("mem_java_used");
                if (l != null) {
                    return l.longValue();
                }
                return -1L;
            }

            @Override // X.InterfaceC1090200eTa
            public final float LIZJ() {
                C1163660gO4 c1163660gO4 = C1163660gO4.LIZ;
                c1163660gO4.getClass();
                Long l = C1163660gO4.LIZJ.get("mem_app_allocate");
                long jLongValue = l != null ? l.longValue() : -999L;
                c1163660gO4.getClass();
                Long l2 = C1163660gO4.LIZJ.get("mem_pss_total");
                long jLongValue2 = l2 != null ? l2.longValue() : -999L;
                if (jLongValue == -999 || jLongValue2 == -999) {
                    return -999.0f;
                }
                return (float) (jLongValue2 / jLongValue);
            }

            @Override // X.InterfaceC1090200eTa
            public final float LJFF() {
                C1163660gO4 c1163660gO4 = C1163660gO4.LIZ;
                c1163660gO4.getClass();
                Long l = C1163660gO4.LIZJ.get("mem_java_max");
                if (l != null) {
                    long jLongValue = l.longValue();
                    c1163660gO4.getClass();
                    if (C1163660gO4.LIZJ.get("mem_java_used") != null) {
                        return r0.longValue() / jLongValue;
                    }
                }
                return -1.0f;
            }

            @Override // X.InterfaceC1090200eTa
            public final void LIZLLL(C1090190eTZ c1090190eTZ) {
                this.LIZ.add(c1090190eTZ);
            }
        } : interfaceC1100980ekyLJFF;
        this.LIZLLL = interfaceC1100980ekyLJFF;
        C1ADU c1aduLIZJ = interfaceC1101080el8.LIZJ();
        c1aduLIZJ = c1aduLIZJ == null ? new C2184001Adi() : c1aduLIZJ;
        this.LJ = c1aduLIZJ;
        interfaceC1101080el8.message();
        C1101570elv c1101570elv = new C1101570elv();
        this.LJFF = c1101570elv;
        C310630CFp c310630CFp = new C310630CFp();
        this.LJI = c310630CFp;
        InterfaceC1100950ekv interfaceC1100950ekvLJ = interfaceC1101080el8.LJ();
        interfaceC1100950ekvLJ = interfaceC1100950ekvLJ == null ? new InterfaceC1100950ekv() { // from class: X.0IXV
            public final Set<Function1<Float, Unit>> LIZ = new LinkedHashSet();

            @Override // X.InterfaceC1101140elE
            public final void start() {
            }

            @Override // X.InterfaceC1101140elE
            public final void stop() {
            }

            @Override // X.InterfaceC1101140elE
            public final void LJI() {
                if (this.LIZ.isEmpty()) {
                    return;
                }
                float f = C476230Ilx.LIZ.LJFF;
                Iterator<Function1<Float, Unit>> it2 = this.LIZ.iterator();
                while (it2.hasNext()) {
                    it2.next().invoke(Float.valueOf(f));
                }
            }

            @Override // X.InterfaceC1101140elE
            public final void destroy() {
                this.LIZ.clear();
            }

            @Override // X.InterfaceC1088600eR0
            public final float getBatteryTemperature() {
                return C476230Ilx.LIZ.LJFF;
            }
        } : interfaceC1100950ekvLJ;
        this.LJII = interfaceC1100950ekvLJ;
        interfaceC1101080el8.LIZ();
        InterfaceC1101000el0 interfaceC1101000el0 = new InterfaceC1101000el0() { // from class: X.0eNb
            @Override // X.InterfaceC1101140elE
            public final void LJI() {
            }

            @Override // X.InterfaceC1101140elE
            public final void destroy() {
            }

            @Override // X.InterfaceC1101140elE
            public final void start() {
            }

            @Override // X.InterfaceC1101140elE
            public final void stop() {
            }

            @Override // X.InterfaceC1101000el0
            public final float LJ() {
                Object c098200Yq;
                try {
                    C1276840jKc c1276840jKc = C1276840jKc.LIZ;
                    c1276840jKc.getClass();
                    Map<String, String> map = C1276840jKc.LJIIL;
                    String str = (String) ((LinkedHashMap) map).get("out_cap_fps");
                    float f = str != null ? CastFloatProtector.parseFloat(str) : 0.0f;
                    c1276840jKc.getClass();
                    String str2 = (String) ((LinkedHashMap) map).get("in_cap_fps");
                    float f2 = str2 != null ? CastFloatProtector.parseFloat(str2) : 0.0f;
                    if (f == 0.0f || f2 == 0.0f) {
                        return -1.0f;
                    }
                    if (f > f2) {
                        return 0.0f;
                    }
                    c098200Yq = Float.valueOf((f2 - f) / f2);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    c098200Yq = Float.valueOf(-1.0f);
                }
                return ((Number) c098200Yq).floatValue();
            }
        };
        this.LJIIIIZZ = interfaceC1101000el0;
        interfaceC1101080el8.LIZLLL();
        InterfaceC1100940eku interfaceC1100940eku = new InterfaceC1100940eku() { // from class: X.0IiD
            @Override // X.InterfaceC1101140elE
            public final void LJI() {
            }

            @Override // X.InterfaceC1101140elE
            public final void destroy() {
            }

            @Override // X.InterfaceC1101140elE
            public final void start() {
            }

            @Override // X.InterfaceC1101140elE
            public final void stop() {
            }

            @Override // X.InterfaceC1100940eku
            public final float LJIIIZ() {
                Object c098200Yq;
                try {
                    C1276840jKc.LIZ.getClass();
                    String str = (String) ((LinkedHashMap) C1276840jKc.LJIIL).get("effect_process_time");
                    c098200Yq = Float.valueOf(str != null ? CastFloatProtector.parseFloat(str) : -1.0f);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    c098200Yq = Float.valueOf(-1.0f);
                }
                return ((Number) c098200Yq).floatValue();
            }
        };
        this.LJIIIZ = interfaceC1100940eku;
        this.LJIIJ = new InterfaceC1101140elE[]{interfaceC1100960ekwLIZIZ, interfaceC1100980ekyLJFF, c1aduLIZJ, c1101570elv, c310630CFp, interfaceC1100950ekvLJ, interfaceC1101000el0, interfaceC1100940eku};
        this.LJIIJJI = new ArrayList<>();
        Map<String, Object> map = C1338270kvh.LIZ;
        C1101110elB c1101110elBLJI = interfaceC1101080el8.LJI(this);
        if (c1101110elBLJI == null) {
            InterfaceC1101080el8.LIZ.getClass();
            c1101110elBLJI = C1101020el2.LIZ(this);
        }
        this.LJIILJJIL = c1101110elBLJI;
        InterfaceC1101080el8.LIZ.getClass();
        this.LJIILL = C1101020el2.LIZ(this);
        this.LJIILLIIL = new C1101110elB(new C1101090el9[]{new C1101090el9("fps", new AwS561S0100000_17(this, 5), C1101070el7.LIZ), new C1101090el9("drop3", new AwS561S0100000_17(this, 6), C1101070el7.LIZLLL), new C1101090el9("battery_temp", new AwS561S0100000_17(this, 7), C1101070el7.LIZIZ), new C1101090el9("cpu_speed", new AwS561S0100000_17(this, 8), C1101070el7.LIZJ)}, C1101070el7.LJ, C1101070el7.LJFF);
        AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(this, 17);
        RealtimeHostPerfScoreSettings realtimeHostPerfScoreSettings = RealtimeHostPerfScoreSettings.INSTANCE;
        C1101090el9[] c1101090el9Arr = {new C1101090el9("drop3", awS561S0100000_17, realtimeHostPerfScoreSettings.drop3Config()), new C1101090el9("battery_temp", new AwS561S0100000_17(this, 18), realtimeHostPerfScoreSettings.temperatureConfig()), new C1101090el9("cpu_speed", new AwS561S0100000_17(this, 19), realtimeHostPerfScoreSettings.cpuSpeedConfig()), new C1101090el9("video_drop_frame", new AwS561S0100000_17(this, 20), realtimeHostPerfScoreSettings.videoDropFrameConfig()), new C1101090el9("effect_render_time", new AwS561S0100000_17(this, 0), realtimeHostPerfScoreSettings.effectRenderTimeConfig())};
        RealtimePerfScoreSettings realtimePerfScoreSettings = RealtimePerfScoreSettings.INSTANCE;
        this.LJIIZILJ = new C1101110elB(c1101090el9Arr, realtimePerfScoreSettings.levelConfig(), realtimePerfScoreSettings.maxScore());
        AwS561S0100000_17 awS561S0100000_172 = new AwS561S0100000_17(this, 14);
        RealtimeGameHostPerfScoreSettings realtimeGameHostPerfScoreSettings = RealtimeGameHostPerfScoreSettings.INSTANCE;
        this.LJIJ = new C1101110elB(new C1101090el9[]{new C1101090el9("battery_temp", awS561S0100000_172, realtimeGameHostPerfScoreSettings.temperatureConfig()), new C1101090el9("cpu_speed", new AwS561S0100000_17(this, 15), realtimeGameHostPerfScoreSettings.cpuSpeedConfig()), new C1101090el9("video_drop_frame", new AwS561S0100000_17(this, 16), realtimeGameHostPerfScoreSettings.videoDropFrameConfig())}, realtimeGameHostPerfScoreSettings.levelConfig(), realtimeGameHostPerfScoreSettings.maxScore());
    }

    @Override // X.InterfaceC1100800ekg
    public final synchronized void LJII(InterfaceC1101120elC interfaceC1101120elC) {
        this.LJIIJJI.remove(interfaceC1101120elC);
    }

    @Override // X.InterfaceC1100800ekg
    public final synchronized void LJIIIIZZ(InterfaceC1101120elC interfaceC1101120elC) {
        if (!this.LJIIJJI.contains(interfaceC1101120elC)) {
            this.LJIIJJI.add(interfaceC1101120elC);
        }
    }

    public final C1101180elI LJIIJJI(C1101110elB c1101110elB) {
        ArrayList<C1101130elD> arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        float weight = 0.0f;
        for (C1101090el9 c1101090el9 : c1101110elB.LIZ) {
            PerfItemConfig perfItemConfig = c1101090el9.LIZJ;
            if (perfItemConfig != null) {
                float fFloatValue = c1101090el9.LIZIZ.invoke().floatValue();
                if (fFloatValue < 0.0f) {
                    weight += perfItemConfig.getWeight();
                    linkedHashMap.put(c1101090el9.LIZ, new C491530JPj(fFloatValue, -1.0f));
                } else {
                    float fLJIILJJIL = LJIILJJIL(fFloatValue, perfItemConfig) * c1101110elB.LIZJ;
                    Map<String, Object> map = C1338270kvh.LIZ;
                    if (fLJIILJJIL < 0.0f) {
                        weight += perfItemConfig.getWeight();
                        linkedHashMap.put(c1101090el9.LIZ, new C491530JPj(fFloatValue, -1.0f));
                    } else {
                        arrayList.add(new C1101130elD(fLJIILJJIL, perfItemConfig.getWeight()));
                        linkedHashMap.put(c1101090el9.LIZ, new C491530JPj(fFloatValue, fLJIILJJIL));
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return new C1101180elI(this.LIZJ.LJ(), 0.0f, linkedHashMap, EnumC1101170elH.UNKNOWN, C963140bAe.LIZIZ());
        }
        float size = weight / arrayList.size();
        float f = 0.0f;
        float f2 = 0.0f;
        for (C1101130elD c1101130elD : arrayList) {
            float f3 = c1101130elD.LIZ;
            float f4 = c1101130elD.LIZIZ + size;
            f2 += f3 * f4;
            f += f4;
        }
        if (f == 0.0f) {
            return new C1101180elI(this.LIZJ.LJ(), 0.0f, linkedHashMap, EnumC1101170elH.UNKNOWN, C963140bAe.LIZIZ());
        }
        float fFloatValue2 = ((Number) C13LZ.LJII(Float.valueOf(f2 / f), new C0F28(0.0f, c1101110elB.LIZJ))).floatValue();
        return new C1101180elI(this.LIZJ.LJ(), fFloatValue2, linkedHashMap, LJIIL(c1101110elB, fFloatValue2), C963140bAe.LIZIZ());
    }

    public final C1101180elI LJIILIIL(C1101110elB c1101110elB) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        float weight = 0.0f;
        float weight2 = 0.0f;
        for (C1101090el9 c1101090el9 : c1101110elB.LIZ) {
            PerfItemConfig perfItemConfig = c1101090el9.LIZJ;
            if (perfItemConfig != null) {
                Number numberInvoke = c1101090el9.LIZIZ.invoke();
                float fLJIILJJIL = LJIILJJIL(numberInvoke.floatValue(), perfItemConfig) * c1101110elB.LIZJ;
                if (fLJIILJJIL >= 0.0f) {
                    linkedHashMap.put(c1101090el9.LIZ, new C491530JPj(numberInvoke.floatValue(), fLJIILJJIL));
                    weight2 += fLJIILJJIL * perfItemConfig.getWeight();
                    weight += perfItemConfig.getWeight();
                }
            }
        }
        if (weight == 0.0f) {
            return new C1101180elI(this.LIZJ.LJ(), 0.0f, linkedHashMap, EnumC1101170elH.UNKNOWN, C963140bAe.LIZIZ());
        }
        float fFloatValue = ((Number) C13LZ.LJII(Float.valueOf(weight2 / weight), new C0F28(0.0f, c1101110elB.LIZJ))).floatValue();
        return new C1101180elI(this.LIZJ.LJ(), fFloatValue, linkedHashMap, LJIIL(c1101110elB, fFloatValue), C963140bAe.LIZIZ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EnumC1101170elH LJIIL(C1101110elB c1101110elB, float f) {
        List<Float> listSubList = c1101110elB.LIZIZ;
        int iIntValue = 0;
        if (listSubList.size() > 5) {
            listSubList = listSubList.subList(0, 5);
        }
        int size = listSubList.size();
        while (iIntValue < size) {
            if (f <= ((Number) ListProtector.get(listSubList, iIntValue)).floatValue()) {
                EnumC1101170elH[] enumC1101170elHArrValues = EnumC1101170elH.values();
                IntRange intRangeLJIIIZ = C1697810uHb.LJIIIZ(listSubList);
                if (intRangeLJIIIZ instanceof C13LY) {
                    iIntValue = ((Number) C13LZ.LJII(Integer.valueOf(iIntValue), (C13LY) intRangeLJIIIZ)).intValue();
                } else if (!intRangeLJIIIZ.isEmpty()) {
                    if (iIntValue < intRangeLJIIIZ.getStart().intValue()) {
                        iIntValue = intRangeLJIIIZ.getStart().intValue();
                    } else if (iIntValue > intRangeLJIIIZ.LJFF().intValue()) {
                        iIntValue = intRangeLJIIIZ.LJFF().intValue();
                    }
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Cannot coerce value to an empty range: ");
                    sbLIZ.append(intRangeLJIIIZ);
                    sbLIZ.append('.');
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
                return enumC1101170elHArrValues[iIntValue + 1];
            }
            iIntValue++;
        }
        return EnumC1101170elH.PERFECT;
    }

    public static float LJIILJJIL(float f, PerfItemConfig perfItemConfig) {
        ScorePiecewise scorePiecewise;
        float edge;
        float edge2;
        List<ScorePiecewise> pieces = perfItemConfig.getPieces();
        if (pieces == null) {
            return -1.0f;
        }
        int size = pieces.size();
        float factor = 0.0f;
        for (int i = 0; i < size; i++) {
            ScorePiecewise scorePiecewise2 = (ScorePiecewise) ListProtector.get(pieces, i);
            if (i > 0) {
                scorePiecewise = (ScorePiecewise) ListProtector.get(pieces, i - 1);
            } else {
                scorePiecewise = null;
            }
            if (f <= scorePiecewise2.getEdge()) {
                float base = perfItemConfig.getBase() + factor;
                if (scorePiecewise != null) {
                    edge = scorePiecewise.getEdge();
                } else {
                    edge = 0.0f;
                }
                return ((Number) C13LZ.LJII(Float.valueOf(base + ((f - edge) * scorePiecewise2.getFactor())), new C0F28(0.0f, 1.0f))).floatValue();
            }
            float edge3 = scorePiecewise2.getEdge();
            if (scorePiecewise != null) {
                edge2 = scorePiecewise.getEdge();
            } else {
                edge2 = 0.0f;
            }
            factor += (edge3 - edge2) * scorePiecewise2.getFactor();
        }
        return -1.0f;
    }
}
