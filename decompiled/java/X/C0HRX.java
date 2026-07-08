package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsPageViewModel;

/* JADX INFO: renamed from: X.0HRX, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsPageViewModel", f = "MixStudioResultsPageViewModel.kt", l = {352}, m = "shareToStory")
public final class C0HRX extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MixStudioResultsPageViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HRX(MixStudioResultsPageViewModel mixStudioResultsPageViewModel, InterfaceC1364105Vn<? super C0HRX> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = mixStudioResultsPageViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixStudioResultsPageViewModel@c4bf.shareToStory$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objEQ2 = this.LLILLL.EQ2(null, this);
        C1C7U.LIZIZ("MixStudioResultsPageViewModel@c4bf.shareToStory$1");
        return objEQ2;
    }
}
