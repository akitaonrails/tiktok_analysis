package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.services.audio.ITTSCallback;
import kotlin.Unit;

/* JADX INFO: renamed from: X.090M, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.texttospeach.TTSServiceFactory", f = "TTSServiceFactory.kt", l = {26}, m = "fetchTTSAudioFile")
public final class C090M extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C2376609Sy LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C090M(C2376609Sy c2376609Sy, InterfaceC1364105Vn<? super C090M> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c2376609Sy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSServiceFactory@ad37.fetchTTSAudioFile$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objFetchTTSAudioFile = this.LLILLJJLI.fetchTTSAudioFile((String) null, (String) null, (String) null, (CreativeInfo) null, false, false, (ITTSCallback) null, (InterfaceC1364105Vn<? super Unit>) this);
        C1C7U.LIZIZ("TTSServiceFactory@ad37.fetchTTSAudioFile$1");
        return objFetchTTSAudioFile;
    }
}
