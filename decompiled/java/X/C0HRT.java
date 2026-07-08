package X;

import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsPageViewModel;

/* JADX INFO: renamed from: X.0HRT, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsPageViewModel", f = "MixStudioResultsPageViewModel.kt", l = {334}, m = "openSharePanel")
public final class C0HRT extends AbstractC23140094w {
    public Object LL;
    public FragmentManager LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ MixStudioResultsPageViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HRT(MixStudioResultsPageViewModel mixStudioResultsPageViewModel, InterfaceC1364105Vn<? super C0HRT> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = mixStudioResultsPageViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixStudioResultsPageViewModel@c4bf.openSharePanel$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objAQ2 = this.LLILZ.AQ2(null, null, this);
        C1C7U.LIZIZ("MixStudioResultsPageViewModel@c4bf.openSharePanel$1");
        return objAQ2;
    }
}
