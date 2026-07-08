package X;

import com.ss.android.ugc.aweme.base.vm.MentionListViewModel;

/* JADX INFO: renamed from: X.0Caw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.vm.MentionListViewModel", f = "MentionListViewModel.kt", l = {106, 116, 119, 121}, m = "onRefresh")
public final class C316520Caw extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ MentionListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C316520Caw(MentionListViewModel mentionListViewModel, InterfaceC1364105Vn<? super C316520Caw> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = mentionListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MentionListViewModel@ff55.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("MentionListViewModel@ff55.onRefresh$1");
        return objOnRefresh;
    }
}
