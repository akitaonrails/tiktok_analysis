package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ewW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1108140ewW extends C09AY implements Function1<Boolean, Unit> {
    public C1108140ewW() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            C1108350ewr.LIZLLL(Collections.singletonList(1), SpeechEngineDefines.TTS_WORK_MODE_BOTH, EnumC1108060ewO.KEY_BOARD);
        } else {
            C786410Ut5.LJLIIL(700L, C473410IhP.LIZ(), new Runnable() { // from class: X.0ewX
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SubscriptionExplainCardManager@f1b6.observeOther$13$1");
                    try {
                        C1108350ewr.LIZJ(Collections.singletonList(1), SpeechEngineDefines.TTS_WORK_MODE_BOTH, EnumC1108060ewO.KEY_BOARD);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SubscriptionExplainCardManager@f1b6.observeOther$13$1");
                }
            });
        }
        return Unit.LIZ;
    }
}
