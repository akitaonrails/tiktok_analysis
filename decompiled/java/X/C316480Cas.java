package X;

import com.ss.android.ugc.aweme.base.vm.MentionListViewModel;

/* JADX INFO: renamed from: X.0Cas, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.vm.MentionListViewModel", f = "MentionListViewModel.kt", l = {454}, m = "mixSearchLoadMore")
public final class C316480Cas extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MentionListViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C316480Cas(MentionListViewModel mentionListViewModel, InterfaceC1364105Vn<? super C316480Cas> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = mentionListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MentionListViewModel@ff55.mixSearchLoadMore$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objYQ2 = this.LLILLL.yQ2(0L, null, this);
        C1C7U.LIZIZ("MentionListViewModel@ff55.mixSearchLoadMore$1");
        return objYQ2;
    }
}
