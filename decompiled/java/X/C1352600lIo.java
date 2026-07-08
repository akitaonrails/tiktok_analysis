package X;

import com.ss.android.ugc.aweme.comment.audio.ui.recorder.CommentAudioRecordViewModel;

/* JADX INFO: renamed from: X.0lIo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.audio.ui.recorder.CommentAudioRecordViewModel", f = "CommentAudioRecordViewModel.kt", l = {144}, m = "startTimerAndWaveUpdate")
public final class C1352600lIo extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CommentAudioRecordViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1352600lIo(CommentAudioRecordViewModel commentAudioRecordViewModel, InterfaceC1364105Vn<? super C1352600lIo> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = commentAudioRecordViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentAudioRecordViewModel@64b9.startTimerAndWaveUpdate$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objXQ2 = this.LLILLJJLI.xQ2(this);
        C1C7U.LIZIZ("CommentAudioRecordViewModel@64b9.startTimerAndWaveUpdate$1");
        return objXQ2;
    }
}
