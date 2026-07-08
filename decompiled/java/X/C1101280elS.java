package X;

import Y.AObjectS392S0100000_17;
import Y.AObjectS531S0100000_17;
import Y.ARunnableS50S0300000_17;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.ScalableDowngradeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.0elS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1101280elS implements InterfaceC1077610e9H {
    public static C1101180elI LJIILL;
    public final DataChannel LIZ;
    public final String LIZIZ;
    public final Function2<EnumC1087640ePS, EnumC1087640ePS, Unit> LIZJ;
    public final Function0<Integer> LIZLLL;
    public long LJFF;
    public volatile long LJI;
    public volatile boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public InterfaceC1100800ekg LJIIL;
    public long LJIILJJIL;
    public EnumC1087640ePS LJ = EnumC1087640ePS.LEVEL_NORMAL;
    public final long LJII = ScalableDowngradeSetting.INSTANCE.upgradeIntervalMs();
    public final C1101320elW LJIIJJI = new AbstractC467020ITc() { // from class: X.0elW
        @Override // X.AbstractC467020ITc, X.InterfaceC1101120elC
        public final void LIZJ(InterfaceC1100800ekg interfaceC1100800ekg, C1100750ekb c1100750ekb) {
            C1101180elI c1101180elI = c1100750ekb.LIZIZ;
            if (!this.LIZ.LJIIIIZZ && c1101180elI.LIZLLL != EnumC1101170elH.UNKNOWN && this.LIZ.LJI >= 0 && SystemClock.elapsedRealtime() - this.LIZ.LJI >= Mp4ScreenVideoLoadTimeout.CONTROL) {
                C473410IhP.LIZIZ(new ARunnableS50S0300000_17(this.LIZ, c1101180elI, interfaceC1100800ekg, 24));
            }
        }
    };
    public final C01GW LJIILIIL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(368));

    @Override // X.InterfaceC1077610e9H
    public final void destroy() {
        this.LJIIIIZZ = true;
        ScalableDowngradeSetting.INSTANCE.setDisableLog(false);
        InterfaceC1100800ekg interfaceC1100800ekg = this.LJIIL;
        if (interfaceC1100800ekg != null) {
            interfaceC1100800ekg.LJII(this.LJIIJJI);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    @Override // X.InterfaceC1077610e9H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1101280elS.LIZ():void");
    }

    @Override // X.InterfaceC1077610e9H
    public final Map<EnumC1087640ePS, Long> LIZLLL() {
        LJ(this.LJ, System.currentTimeMillis());
        return (Map) this.LJIILIIL.getValue();
    }

    @Override // X.InterfaceC1077610e9H
    public final void onPause() {
        this.LJI = -1L;
    }

    @Override // X.InterfaceC1077610e9H
    public final void start() {
        InterfaceC1100800ekg interfaceC1100800ekg;
        if (this.LJIIIIZZ || this.LJIIIZ || (interfaceC1100800ekg = this.LJIIL) == null) {
            return;
        }
        this.LJIIIZ = true;
        interfaceC1100800ekg.LJIIIIZZ(this.LJIIJJI);
    }

    @Override // X.InterfaceC1077610e9H
    public final void onResume() {
        this.LJI = SystemClock.elapsedRealtime();
    }

    @Override // X.InterfaceC1077610e9H
    public final EnumC1087640ePS LIZJ() {
        return this.LJ;
    }

    @Override // X.InterfaceC1077610e9H
    public final void LIZIZ(InterfaceC1100800ekg interfaceC1100800ekg) {
        this.LJIIL = interfaceC1100800ekg;
    }

    public final void LJ(EnumC1087640ePS enumC1087640ePS, long j) {
        long jLongValue;
        long j2 = j - this.LJIILJJIL;
        Long l = (Long) ((Map) this.LJIILIIL.getValue()).get(enumC1087640ePS);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        ((Map) this.LJIILIIL.getValue()).put(enumC1087640ePS, Long.valueOf(jLongValue + j2));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0elW] */
    public C1101280elS(DataChannel dataChannel, String str, AObjectS392S0100000_17 aObjectS392S0100000_17, AObjectS531S0100000_17 aObjectS531S0100000_17) {
        this.LIZ = dataChannel;
        this.LIZIZ = str;
        this.LIZJ = aObjectS531S0100000_17;
        this.LIZLLL = aObjectS392S0100000_17;
    }
}
