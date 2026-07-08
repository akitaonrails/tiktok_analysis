package X;

import Y.AObjectS392S0100000_17;
import Y.AObjectS531S0100000_17;
import Y.ARunnableS117S0100000_17;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.ScalableDowngradeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0elU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1101300elU implements InterfaceC1077610e9H {
    public static int LJIILIIL = -1;
    public final DataChannel LIZ;
    public final Function2<EnumC1087640ePS, EnumC1087640ePS, Unit> LIZIZ;
    public final Function0<Integer> LIZJ;
    public long LJ;
    public long LJFF;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public InterfaceC1100800ekg LJIIJJI;
    public EnumC1087640ePS LIZLLL = EnumC1087640ePS.LEVEL_NORMAL;
    public final long LJI = ScalableDowngradeSetting.INSTANCE.upgradeIntervalMs();
    public final ARunnableS117S0100000_17 LJIIJ = new ARunnableS117S0100000_17(this, 267);
    public final ARunnableS117S0100000_17 LJIIL = new ARunnableS117S0100000_17(this, 266);

    @Override // X.InterfaceC1077610e9H
    public final Map<EnumC1087640ePS, Long> LIZLLL() {
        return null;
    }

    @Override // X.InterfaceC1077610e9H
    public final void destroy() {
        this.LJII = true;
        ScalableDowngradeSetting.INSTANCE.setDisableLog(false);
        C473410IhP.LJ(this.LJIIL);
        C473410IhP.LJ(this.LJIIJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    @Override // X.InterfaceC1077610e9H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1101300elU.LIZ():void");
    }

    @Override // X.InterfaceC1077610e9H
    public final void onPause() {
        this.LJFF = -1L;
    }

    @Override // X.InterfaceC1077610e9H
    public final void start() {
        if (this.LJII || this.LJIIIIZZ) {
            return;
        }
        this.LJIIIIZZ = true;
        C473410IhP.LIZJ(this.LJIIJ, Mp4ScreenVideoLoadTimeout.CONTROL);
    }

    @Override // X.InterfaceC1077610e9H
    public final void onResume() {
        this.LJFF = SystemClock.elapsedRealtime();
    }

    @Override // X.InterfaceC1077610e9H
    public final EnumC1087640ePS LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1077610e9H
    public final void LIZIZ(InterfaceC1100800ekg interfaceC1100800ekg) {
        this.LJIIJJI = interfaceC1100800ekg;
    }

    public C1101300elU(DataChannel dataChannel, AObjectS531S0100000_17 aObjectS531S0100000_17, AObjectS392S0100000_17 aObjectS392S0100000_17) {
        this.LIZ = dataChannel;
        this.LIZIZ = aObjectS531S0100000_17;
        this.LIZJ = aObjectS392S0100000_17;
    }
}
