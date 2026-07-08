package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsPageViewModel;

/* JADX INFO: renamed from: X.0HRY, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsPageViewModel", f = "MixStudioResultsPageViewModel.kt", l = {227, 231}, m = "favoriteCurrentSticker")
public final class C0HRY extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MixStudioResultsPageViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HRY(MixStudioResultsPageViewModel mixStudioResultsPageViewModel, InterfaceC1364105Vn<? super C0HRY> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = mixStudioResultsPageViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixStudioResultsPageViewModel@c4bf.favoriteCurrentSticker$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILLL.wQ2(null, this);
        C1C7U.LIZIZ("MixStudioResultsPageViewModel@c4bf.favoriteCurrentSticker$1");
        return objWQ2;
    }
}
