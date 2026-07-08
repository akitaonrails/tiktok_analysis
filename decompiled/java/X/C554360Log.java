package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent.aiself.AlbumAiSelfTaskViewModel;

/* JADX INFO: renamed from: X.0Log, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent.aiself.AlbumAiSelfTaskViewModel", f = "AlbumAiSelfTaskViewModel.kt", l = {74}, m = "refreshLatestAISelfTask")
public final class C554360Log extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AlbumAiSelfTaskViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C554360Log(AlbumAiSelfTaskViewModel albumAiSelfTaskViewModel, InterfaceC1364105Vn<? super C554360Log> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = albumAiSelfTaskViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AlbumAiSelfTaskViewModel@33fe.refreshLatestAISelfTask$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objYQ2 = this.LLILLJJLI.yQ2(this);
        C1C7U.LIZIZ("AlbumAiSelfTaskViewModel@33fe.refreshLatestAISelfTask$1");
        return objYQ2;
    }
}
