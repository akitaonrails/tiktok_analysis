package X;

import com.ss.android.ugc.aweme.mention.viewmodel.VideoCaptionMentionRecommendViewModel;

/* JADX INFO: renamed from: X.0Cbm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mention.viewmodel.VideoCaptionMentionRecommendViewModel", f = "VideoCaptionMentionRecommendViewModel.kt", l = {35}, m = "onRefresh")
public final class C317040Cbm extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ VideoCaptionMentionRecommendViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317040Cbm(VideoCaptionMentionRecommendViewModel videoCaptionMentionRecommendViewModel, InterfaceC1364105Vn<? super C317040Cbm> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = videoCaptionMentionRecommendViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoCaptionMentionRecommendViewModel@a0c7.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("VideoCaptionMentionRecommendViewModel@a0c7.onRefresh$1");
        return objOnRefresh;
    }
}
