package X;

import com.ss.android.ugc.gamora.editorpro.capabilities.audio.record.logic.AudioRecordActivityViewModel;

/* JADX INFO: renamed from: X.0E4Q, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.audio.record.logic.AudioRecordActivityViewModel", f = "AudioRecordActivityViewModel.kt", l = {262}, m = "getComposeAudioPath")
public final class C0E4Q extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AudioRecordActivityViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0E4Q(AudioRecordActivityViewModel audioRecordActivityViewModel, InterfaceC1364105Vn<? super C0E4Q> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = audioRecordActivityViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AudioRecordActivityViewModel@463c.getComposeAudioPath$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objYQ2 = this.LLILLL.yQ2(null, this);
        C1C7U.LIZIZ("AudioRecordActivityViewModel@463c.getComposeAudioPath$1");
        return objYQ2;
    }
}
