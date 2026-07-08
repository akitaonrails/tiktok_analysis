package X;

import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.ss.android.ugc.aweme.ml.ab.SmartGameAnchorAIStrategyExperiment;
import java.util.concurrent.ConcurrentLinkedDeque;

/* JADX INFO: renamed from: X.152E, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C152E {
    public final AbstractC1511510pR7 LIZ;
    public boolean LIZIZ;

    public C152E() {
        C1511390pQv c1511390pQvLIZ = C1511420pQy.LIZ();
        C1510230pP3 c1510230pP3 = new C1510230pP3(SmartGameAnchorAIStrategyExperiment.SCENE);
        ConcurrentLinkedDeque<C152G> concurrentLinkedDeque = C152D.LIZ;
        c1510230pP3.LIZIZ = SmartGameAnchorAIStrategyExperiment.INSTANCE.getConfig();
        this.LIZ = c1511390pQvLIZ.LIZ(SmartGameAnchorAIStrategyExperiment.SCENE, c1510230pP3);
    }

    public static void LIZ(Object obj, String str) {
        ILiveGameService iLiveGameService = (ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class);
        if (iLiveGameService != null) {
            iLiveGameService.XL0(obj, str);
        }
    }
}
