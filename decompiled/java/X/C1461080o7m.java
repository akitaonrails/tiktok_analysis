package X;

/* JADX INFO: renamed from: X.0o7m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicedetection.AutoMusicRecommendDetectorConfig", f = "AutoMusicRecommendDetectorConfig.kt", l = {120}, m = "getVoiceDetectPath")
public final class C1461080o7m extends AbstractC23140094w {
    public long LL;
    public long LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1461010o7f LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1461080o7m(C1461010o7f c1461010o7f, InterfaceC1364105Vn<? super C1461080o7m> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c1461010o7f;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoMusicRecommendDetectorConfig@5330.getVoiceDetectPath$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object voiceDetectPath = this.LLILZIL.getVoiceDetectPath(this);
        C1C7U.LIZIZ("AutoMusicRecommendDetectorConfig@5330.getVoiceDetectPath$1");
        return voiceDetectPath;
    }
}
