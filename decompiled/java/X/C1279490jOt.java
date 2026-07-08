package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.experiment.TakoAudioConfig;
import com.ss.android.ugc.aweme.tako.experiment.TakoAudioDuckingConfig;
import com.ss.android.ugc.aweme.tako.experiment.TakoMediaConfig;
import com.ss.android.ugc.aweme.tako.experiment.TakoVideoConfig;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: renamed from: X.0jOt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C07QN("tako_ai_video_media_config")
public final class C1279490jOt {
    public static final C1279490jOt LIZ = new C1279490jOt();

    @C09DK(isDefault = true)
    public static final String LIZIZ;
    public static final C01GW LIZJ;

    static {
        String strLJIILL;
        try {
            strLJIILL = C1222790hvR.LIZ().LJIILL(new TakoMediaConfig(new TakoVideoConfig(360, 640, 2, 240000, 300000, 150000), new TakoAudioConfig(new TakoAudioDuckingConfig(-20.0d, -30.0d, 1.0d, 0.001d, 1.0d, 0.01d, 1.0d, false))));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strLJIILL = "";
        }
        LIZIZ = strLJIILL;
        LIZJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(14));
    }
}
