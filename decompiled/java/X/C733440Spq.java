package X;

import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;

/* JADX INFO: renamed from: X.0Spq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel", f = "VideoShareViewModel.kt", l = {593}, m = "maybeCanShowExternalShare")
public final class C733440Spq extends AbstractC23140094w {
    public boolean LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ VideoShareViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C733440Spq(VideoShareViewModel videoShareViewModel, InterfaceC1364105Vn<? super C733440Spq> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = videoShareViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoShareViewModel@3d60.maybeCanShowExternalShare$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objHQ2 = this.LLILZ.HQ2(this);
        C1C7U.LIZIZ("VideoShareViewModel@3d60.maybeCanShowExternalShare$1");
        return objHQ2;
    }
}
