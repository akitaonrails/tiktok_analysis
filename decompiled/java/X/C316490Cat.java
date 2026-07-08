package X;

import com.ss.android.ugc.aweme.base.vm.MentionListViewModel;
import com.ss.android.ugc.aweme.search.model.SearchUserSugResponse;

/* JADX INFO: renamed from: X.0Cat, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.vm.MentionListViewModel", f = "MentionListViewModel.kt", l = {576, 590}, m = "queryDataForSearchList")
public final class C316490Cat extends AbstractC23140094w {
    public SearchUserSugResponse LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ MentionListViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C316490Cat(MentionListViewModel mentionListViewModel, InterfaceC1364105Vn<? super C316490Cat> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = mentionListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MentionListViewModel@ff55.queryDataForSearchList$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objEQ2 = this.LLILZ.EQ2(false, null, this);
        C1C7U.LIZIZ("MentionListViewModel@ff55.queryDataForSearchList$1");
        return objEQ2;
    }
}
