package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.record.logic.AudioRecordActivityViewModel;

/* JADX INFO: renamed from: X.0E4P, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.audio.record.logic.AudioRecordActivityViewModel", f = "AudioRecordActivityViewModel.kt", l = {122}, m = "saveRecordedAudioToEditModel")
public final class C0E4P extends AbstractC23140094w {
    public VideoPublishEditModel LL;
    public C0E48 LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ AudioRecordActivityViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0E4P(AudioRecordActivityViewModel audioRecordActivityViewModel, InterfaceC1364105Vn<? super C0E4P> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = audioRecordActivityViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AudioRecordActivityViewModel@463c.saveRecordedAudioToEditModel$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objZQ2 = this.LLILZ.zQ2(null, null, null, this);
        C1C7U.LIZIZ("AudioRecordActivityViewModel@463c.saveRecordedAudioToEditModel$1");
        return objZQ2;
    }
}
