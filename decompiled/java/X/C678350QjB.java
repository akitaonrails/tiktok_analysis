package X;

import Y.AObjectS314S0200000_18;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0QjB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C678350QjB extends C679510Ql3 {
    public final int LJIIJJI;
    public Map<String, String> LJIIL;
    public Map<String, ? extends Object> LJIILIIL;
    public List<? extends Class<? extends InterfaceC1063710dmr>> LJIILJJIL;
    public final C1162570gMJ LJIILL;
    public final Integer LJIILLIIL;
    public final C1312970kGt LJIIZILJ;
    public C678340QjA LJIJ;
    public boolean LJIJI;
    public C679540Ql6 LJIJJ;
    public Map<String, String> LJIJJLI;
    public Function1<? super SparkContext, Unit> LJIL;
    public Function1<? super C1538590q8n, Unit> LJJ;
    public Map<Class<?>, ? extends Object> LJJI;

    /* JADX WARN: Illegal instructions before constructor call */
    public C678350QjB(Map map, Map map2, Integer num, AObjectS314S0200000_18 aObjectS314S0200000_18, C1168140gVI c1168140gVI, int i) {
        int i2;
        if ((i & 1) != 0) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        map = (i & 2) != 0 ? null : map;
        map2 = (i & 4) != 0 ? null : map2;
        num = (i & 32) != 0 ? null : num;
        boolean z = (i & 256) != 0;
        aObjectS314S0200000_18 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : aObjectS314S0200000_18;
        c1168140gVI = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : c1168140gVI;
        super(map2, null);
        this.LJIIJJI = i2;
        this.LJIIL = map;
        this.LJIILIIL = map2;
        this.LJIILJJIL = null;
        this.LJIILL = null;
        this.LJIILLIIL = num;
        this.LJIIZILJ = null;
        this.LJIJ = null;
        this.LJIJI = z;
        this.LJIJJ = null;
        this.LJIJJLI = null;
        this.LJIL = aObjectS314S0200000_18;
        this.LJJ = c1168140gVI;
        this.LJJI = null;
    }
}
