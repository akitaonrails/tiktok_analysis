package X;

import android.os.Handler;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0exJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1108630exJ extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C1108550exB LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1108630exJ(C1108550exB c1108550exB) {
        super(1);
        this.LL = c1108550exB;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            LJIILJJIL(SpeechEngineDefines.TTS_WORK_MODE_BOTH, EnumC1108060ewO.LOCK_SCREEN);
        } else {
            Handler handlerLIZ = C473410IhP.LIZ();
            final C1108550exB c1108550exB = this.LL;
            C786410Ut5.LJLIIL(700L, handlerLIZ, new Runnable() { // from class: X.0exN
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AudienceCustomizedPerksBehavior@9d29.onRegister$1$1");
                    try {
                        LJIILIIL(SpeechEngineDefines.TTS_WORK_MODE_BOTH, EnumC1108060ewO.LOCK_SCREEN);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AudienceCustomizedPerksBehavior@9d29.onRegister$1$1");
                }
            });
        }
        return Unit.LIZ;
    }
}
