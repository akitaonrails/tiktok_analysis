package X;

import com.ss.android.ugc.aweme.services.audio.IVoiceDetectorConfig;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionParam;
import com.ss.android.ugc.gamora.editor.audioservice.service.voicedetection.VoiceDetectorService;

/* JADX INFO: renamed from: X.0o7k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicedetection.VoiceDetectorService", f = "VoiceDetectorService.kt", l = {69}, m = "doDetect")
public final class C1461060o7k extends AbstractC23140094w {
    public Object LL;
    public VoiceDetectionParam LLILLJJLI;
    public IVoiceDetectorConfig LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ VoiceDetectorService LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1461060o7k(VoiceDetectorService voiceDetectorService, InterfaceC1364105Vn<? super C1461060o7k> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = voiceDetectorService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VoiceDetectorService@fce2.doDetect$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLIZ.LIZ(null, null, null, this);
        C1C7U.LIZIZ("VoiceDetectorService@fce2.doDetect$1");
        return objLIZ;
    }
}
