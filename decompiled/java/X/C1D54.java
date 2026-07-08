package X;

import com.ss.ttlivestreamer.livestreamv2.videoquality.strategycenter.model.BitrateConfig;
import com.ss.ttlivestreamer.livestreamv2.videoquality.strategycenter.model.StrategyConfig;
import java.util.Map;

/* JADX INFO: renamed from: X.1D54, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public abstract class C1D54 implements C1D5S {
    public final StrategyConfig LIZ;
    public final Map<String, BitrateConfig> LIZIZ;
    public int LIZJ;
    public C1D54 LIZLLL;
    public final C1D5G LJ;
    public EnumC1283150jUn LJFF;

    public void LIZIZ(int i) {
        this.LIZJ = i;
    }

    public C1D54(StrategyConfig strategyConfig, Map<String, BitrateConfig> map) {
        C1D5G c1d5g = new C1D5G();
        this.LJ = c1d5g;
        this.LJFF = EnumC1283150jUn.DEFAULT;
        this.LIZ = strategyConfig;
        this.LIZIZ = map;
        c1d5g.LIZ = strategyConfig.LIZ;
    }
}
