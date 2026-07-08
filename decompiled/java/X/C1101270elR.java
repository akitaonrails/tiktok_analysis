package X;

import Y.AObjectS392S0100000_17;
import Y.AObjectS531S0100000_17;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.ProgressiveDowngradeConfig;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.ScalableDowngradeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.0elR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1101270elR implements InterfaceC1077610e9H {
    public static C1101180elI LJIILL;
    public final String LIZ;
    public final DataChannel LIZIZ;
    public final Function2<EnumC1087640ePS, EnumC1087640ePS, Unit> LIZJ;
    public final Function0<Integer> LIZLLL;
    public volatile long LJFF;
    public volatile boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public long LJIIJ;
    public InterfaceC1100800ekg LJIILJJIL;
    public EnumC1087640ePS LJ = EnumC1087640ePS.LEVEL_NORMAL;
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(370));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(371));
    public final C01GW LJIIL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(369));
    public final C1101310elV LJIILIIL = new AbstractC467020ITc() { // from class: X.0elV
        @Override // X.AbstractC467020ITc, X.InterfaceC1101120elC
        public final void LIZJ(InterfaceC1100800ekg interfaceC1100800ekg, C1100750ekb c1100750ekb) {
            final EnumC1087640ePS enumC1087640ePS;
            if (this.LIZ.LJI) {
                return;
            }
            final C1101180elI c1101180elI = c1100750ekb.LIZJ;
            Map<String, Object> map = C1338270kvh.LIZ;
            this.LIZ.LJFF().add(c1101180elI);
            if (this.LIZ.LJFF().size() < ScalableDowngradeSetting.getDowngradeByScoreInterval()) {
                return;
            }
            if (this.LIZ.LJFF >= 0 && SystemClock.elapsedRealtime() - this.LIZ.LJFF >= Mp4ScreenVideoLoadTimeout.CONTROL) {
                List<C1101180elI> listLJFF = this.LIZ.LJFF();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJFF, 10));
                Iterator<C1101180elI> it2 = listLJFF.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Float.valueOf(it2.next().LIZIZ));
                }
                final float fLJJIZ = (float) C13LP.LJJIZ(arrayList);
                final float fLJ = this.LIZ.LJ("fps");
                final float fLJ2 = this.LIZ.LJ("battery_temp");
                final float fLJ3 = this.LIZ.LJ("drop3");
                final float fLJ4 = this.LIZ.LJ("cpu_speed");
                this.LIZ.LJFF().clear();
                C1101270elR c1101270elR = this.LIZ;
                if (fLJJIZ > ((ProgressiveDowngradeConfig) c1101270elR.LJIIL.getValue()).getUpgradeScoreThreshold()) {
                    enumC1087640ePS = EnumC1087640ePS.LEVEL_NORMAL;
                } else if (fLJJIZ < ((ProgressiveDowngradeConfig) c1101270elR.LJIIL.getValue()).getDowngradeScoreThreshold()) {
                    int iOrdinal = c1101270elR.LJ.ordinal();
                    enumC1087640ePS = EnumC1087640ePS.LEVEL_SERIOUS;
                    if (iOrdinal <= enumC1087640ePS.ordinal()) {
                        enumC1087640ePS = EnumC1087640ePS.LEVEL_CRITICAL;
                    }
                } else {
                    enumC1087640ePS = c1101270elR.LJ;
                }
                final C1101270elR c1101270elR2 = this.LIZ;
                C473410IhP.LIZIZ(new Runnable() { // from class: X.0elT
                    public final void LIZ() {
                        InterfaceC1100990ekz interfaceC1100990ekzMessage;
                        C1101270elR c1101270elR3 = c1101270elR2;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("pastAvgScoreResult = ");
                        sbLIZ.append(fLJJIZ);
                        sbLIZ.append(", and level = ");
                        sbLIZ.append(enumC1087640ePS.name());
                        C2188811AlT.LIZIZ(sbLIZ);
                        c1101270elR3.getClass();
                        Map<String, Object> map2 = C1338270kvh.LIZ;
                        InterfaceC1100800ekg interfaceC1100800ekg2 = c1101270elR2.LJIILJJIL;
                        Float fValueOf = (interfaceC1100800ekg2 == null || (interfaceC1100990ekzMessage = interfaceC1100800ekg2.message()) == null) ? null : Float.valueOf(interfaceC1100990ekzMessage.LIZIZ(5));
                        C1101270elR c1101270elR4 = c1101270elR2;
                        EnumC1087640ePS enumC1087640ePS2 = enumC1087640ePS;
                        float f = fLJJIZ;
                        float f2 = fLJ;
                        float f3 = fLJ2;
                        float f4 = fLJ3;
                        float f5 = fLJ4;
                        if (enumC1087640ePS2 != c1101270elR4.LJ) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Change downgrade level: ");
                            sbLIZ2.append(c1101270elR4.LJ);
                            sbLIZ2.append(" to ");
                            sbLIZ2.append(enumC1087640ePS2);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            ScalableDowngradeSetting.INSTANCE.setDisableLog(enumC1087640ePS2.ordinal() < EnumC1087640ePS.LEVEL_HIGH.ordinal());
                            c1101270elR4.LIZJ.invoke(c1101270elR4.LJ, enumC1087640ePS2);
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            EnumC1087640ePS enumC1087640ePS3 = c1101270elR4.LJ;
                            long j = jCurrentTimeMillis - c1101270elR4.LJIIJ;
                            boolean z = enumC1087640ePS2.ordinal() < enumC1087640ePS3.ordinal();
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_scalable_downgrade_change");
                            c474500IjALIZ.LJIJJLI(c1101270elR4.LIZIZ);
                            c474500IjALIZ.LJJII(Integer.valueOf(c1101270elR4.LJ.ordinal()), "from_level");
                            c474500IjALIZ.LJJII(Integer.valueOf(enumC1087640ePS2.ordinal()), "to_level");
                            c474500IjALIZ.LJJII(c1101270elR4.LIZLLL.invoke(), "member_count");
                            c474500IjALIZ.LJJII("component", "strategy_name");
                            c474500IjALIZ.LJJII(z ? "downgrade" : "upgrade", "strategy_status");
                            c474500IjALIZ.LJJII(c1101270elR4.LIZ, "host_broadcast_scene");
                            c474500IjALIZ.LJJII(Long.valueOf(j), "last_level_duration");
                            c474500IjALIZ.LJJIFFI(Float.valueOf(f), "realtime_performance_score");
                            c474500IjALIZ.LJJIFFI(Float.valueOf(f2), "realtime_fps_score");
                            c474500IjALIZ.LJJIFFI(Float.valueOf(f5), "realtime_cpu_speed_score");
                            c474500IjALIZ.LJJIFFI(Float.valueOf(f3), "realtime_thermal_score");
                            c474500IjALIZ.LJJIFFI(Float.valueOf(f4), "realtime_drop3_score");
                            c474500IjALIZ.LJJIFFI(Float.valueOf(fValueOf != null ? fValueOf.floatValue() : 0.0f), "msg_qps");
                            c474500IjALIZ.LIZ();
                            c1101270elR4.LJI(c1101270elR4.LJ, jCurrentTimeMillis);
                            c1101270elR4.LJIIJ = System.currentTimeMillis();
                            c1101270elR4.LJ = enumC1087640ePS2;
                        }
                        C1101270elR.LJIILL = c1101180elI;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("PerfProgressiveDowngradeTriggerByScore@89d5.perfMetricListener$1$onScoreResult$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("PerfProgressiveDowngradeTriggerByScore@89d5.perfMetricListener$1$onScoreResult$1");
                    }
                });
                return;
            }
            this.LIZ.LJFF().clear();
        }
    };

    @Override // X.InterfaceC1077610e9H
    public final void destroy() {
        this.LJI = true;
        ScalableDowngradeSetting.INSTANCE.setDisableLog(false);
        InterfaceC1100800ekg interfaceC1100800ekg = this.LJIILJJIL;
        if (interfaceC1100800ekg != null) {
            interfaceC1100800ekg.LJII(this.LJIILIIL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    @Override // X.InterfaceC1077610e9H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1101270elR.LIZ():void");
    }

    @Override // X.InterfaceC1077610e9H
    public final Map<EnumC1087640ePS, Long> LIZLLL() {
        LJI(this.LJ, System.currentTimeMillis());
        return (Map) this.LJIIIZ.getValue();
    }

    public final List<C1101180elI> LJFF() {
        return (List) this.LJIIJJI.getValue();
    }

    @Override // X.InterfaceC1077610e9H
    public final void onPause() {
        this.LJFF = -1L;
    }

    @Override // X.InterfaceC1077610e9H
    public final void start() {
        InterfaceC1100800ekg interfaceC1100800ekg;
        if (this.LJI || this.LJII || (interfaceC1100800ekg = this.LJIILJJIL) == null) {
            return;
        }
        this.LJII = true;
        interfaceC1100800ekg.LJIIIIZZ(this.LJIILIIL);
    }

    @Override // X.InterfaceC1077610e9H
    public final void onResume() {
        this.LJFF = SystemClock.elapsedRealtime();
    }

    @Override // X.InterfaceC1077610e9H
    public final EnumC1087640ePS LIZJ() {
        return this.LJ;
    }

    @Override // X.InterfaceC1077610e9H
    public final void LIZIZ(InterfaceC1100800ekg interfaceC1100800ekg) {
        this.LJIILJJIL = interfaceC1100800ekg;
    }

    public final float LJ(String str) {
        Float fValueOf;
        List<C1101180elI> listLJFF = LJFF();
        ArrayList arrayList = new ArrayList();
        Iterator<C1101180elI> it2 = listLJFF.iterator();
        while (it2.hasNext()) {
            C491530JPj c491530JPj = it2.next().LIZJ.get(str);
            if (c491530JPj != null && (fValueOf = Float.valueOf(c491530JPj.LIZIZ)) != null) {
                arrayList.add(fValueOf);
            }
        }
        return (float) C13LP.LJJIZ(arrayList);
    }

    public final void LJI(EnumC1087640ePS enumC1087640ePS, long j) {
        long jLongValue;
        long j2 = j - this.LJIIJ;
        Long l = (Long) ((Map) this.LJIIIZ.getValue()).get(enumC1087640ePS);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        ((Map) this.LJIIIZ.getValue()).put(enumC1087640ePS, Long.valueOf(jLongValue + j2));
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0elV] */
    public C1101270elR(DataChannel dataChannel, String str, AObjectS392S0100000_17 aObjectS392S0100000_17, AObjectS531S0100000_17 aObjectS531S0100000_17) {
        this.LIZ = str;
        this.LIZIZ = dataChannel;
        this.LIZJ = aObjectS531S0100000_17;
        this.LIZLLL = aObjectS392S0100000_17;
    }
}
