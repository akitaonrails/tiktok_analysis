package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionResult;

/* JADX INFO: renamed from: X.0Cs2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicedetection.handler.AudioLoudnessHandler", f = "AudioLoudnessHandler.kt", l = {LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT}, m = "onUpdateResult")
public final class C327120Cs2 extends AbstractC23140094w {
    public VoiceDetectionResult LL;
    public long LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C327110Cs1 LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327120Cs2(C327110Cs1 c327110Cs1, InterfaceC1364105Vn<? super C327120Cs2> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c327110Cs1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AudioLoudnessHandler@cf39.onUpdateResult$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objOnUpdateResult = this.LLILZ.onUpdateResult(null, this);
        C1C7U.LIZIZ("AudioLoudnessHandler@cf39.onUpdateResult$1");
        return objOnUpdateResult;
    }
}
