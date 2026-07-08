package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent.aiself.AlbumAiSelfTaskViewModel;

/* JADX INFO: renamed from: X.0Lof, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent.aiself.AlbumAiSelfTaskViewModel", f = "AlbumAiSelfTaskViewModel.kt", l = {43, 45}, m = "refreshAiSelfModelStatus")
public final class C554350Lof extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AlbumAiSelfTaskViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C554350Lof(AlbumAiSelfTaskViewModel albumAiSelfTaskViewModel, InterfaceC1364105Vn<? super C554350Lof> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = albumAiSelfTaskViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AlbumAiSelfTaskViewModel@33fe.refreshAiSelfModelStatus$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objXQ2 = this.LLILLJJLI.xQ2(this);
        C1C7U.LIZIZ("AlbumAiSelfTaskViewModel@33fe.refreshAiSelfModelStatus$1");
        return objXQ2;
    }
}
