package X;

import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.livestreamv2.videoquality.strategycenter.model.BitrateConfig;
import com.ss.ttlivestreamer.livestreamv2.videoquality.strategycenter.model.StrategyConfig;
import java.util.Map;

/* JADX INFO: renamed from: X.1D52, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public abstract class C1D52 extends C1D54 {
    public EnumC2249801D3y LJI;
    public int LJII;
    public C1D49 LJIIIIZZ;

    @Override // X.C1D54
    public void LIZIZ(int i) {
        if (!C1283420jVE.LIZ()) {
        } else {
            throw new AndroidRuntimeException("SourceStrategy does not support updateLevel");
        }
    }

    public final void LIZJ(C1D49 c1d49) {
        if (c1d49 != null) {
            this.LIZJ = c1d49.LIZIZ();
            this.LJII = c1d49.LIZ();
            this.LJI = c1d49.LJ;
            this.LJ.LJFF = this.LIZJ;
        }
        this.LJIIIIZZ = c1d49;
    }

    public C1D52(StrategyConfig strategyConfig, Map<String, BitrateConfig> map) {
        super(strategyConfig, map);
        C1D5G c1d5g = this.LJ;
        c1d5g.LIZ = strategyConfig.LIZ;
        c1d5g.LIZIZ = strategyConfig.defaultLevel;
        c1d5g.LIZJ = strategyConfig.gearShiftRule;
        c1d5g.LIZLLL = strategyConfig.gearShiftType;
    }
}
