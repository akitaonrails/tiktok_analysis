package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsPageViewModel;

/* JADX INFO: renamed from: X.0HRZ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsPageViewModel", f = "MixStudioResultsPageViewModel.kt", l = {401}, m = "cancelGeneration")
public final class C0HRZ extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ MixStudioResultsPageViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HRZ(MixStudioResultsPageViewModel mixStudioResultsPageViewModel, InterfaceC1364105Vn<? super C0HRZ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = mixStudioResultsPageViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixStudioResultsPageViewModel@c4bf.cancelGeneration$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLJJLI.vQ2(this);
        C1C7U.LIZIZ("MixStudioResultsPageViewModel@c4bf.cancelGeneration$1");
        return objVQ2;
    }
}
