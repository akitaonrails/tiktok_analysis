package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1EKR, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EKR extends C09AY implements Function0<Boolean> {
    public C1EKR() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf((C1EKN.LIZ() & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 2048);
    }
}
