package X;

import android.os.Handler;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.commentdetector.HighIntentCommentDetector;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fJl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122550fJl extends C09AY implements Function1<HashMap<String, String>, Unit> {
    public final /* synthetic */ HighIntentCommentDetector LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122550fJl(HighIntentCommentDetector highIntentCommentDetector) {
        super(1);
        this.LL = highIntentCommentDetector;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(HashMap<String, String> map) {
        final HashMap<String, String> map2 = map;
        final HighIntentCommentDetector highIntentCommentDetector = this.LL;
        highIntentCommentDetector.getClass();
        String str = map2.get("trigger_event");
        Runnable runnable = new Runnable() { // from class: X.0fJi
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("HighIntentCommentDetector@b20c.showToolTipByInteractionData$runnable$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("HighIntentCommentDetector@b20c.showToolTipByInteractionData$runnable$1");
            }

            public final void LIZ() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                HighIntentCommentDetector highIntentCommentDetector2 = highIntentCommentDetector;
                if (jCurrentTimeMillis - highIntentCommentDetector2.LLIZLLLIL >= Mp4ScreenVideoLoadTimeout.CONTROL) {
                    String strX1 = highIntentCommentDetector2.x1("");
                    C20441214yg.LIZIZ("DM_guidance", "showDmCreatorTooltip");
                    highIntentCommentDetector.z1(strX1, "interaction_prediction", "", map2);
                    return;
                }
                C20441214yg.LIZIZ("DM_guidance", "tooltip driven by high intent comment in 5s, we don't show it again. ");
                if (highIntentCommentDetector.y1().vQ2()) {
                    C1122420fJY c1122420fJY = highIntentCommentDetector.LLIZ;
                    if (c1122420fJY != null) {
                        c1122420fJY.LIZIZ();
                    }
                    C20441214yg.LIZIZ("DM_guidance", "highIntentPSPStrategyDetector tryToRegisterPSPDetectStrategy() again.");
                }
            }
        };
        if (Intrinsics.LJFF(str, "livesdk_audience_live_message")) {
            C20441214yg.LIZIZ("DM_guidance", "The strategy is triggered by comment. We need to do a pending check in 3s");
            C786410Ut5.LJLIIL(3000L, (Handler) highIntentCommentDetector.LLILLL.getValue(), runnable);
        } else {
            runnable.run();
        }
        return Unit.LIZ;
    }
}
