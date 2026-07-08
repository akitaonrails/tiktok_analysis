package X;

import com.ss.android.ugc.aweme.base.vm.MentionListViewModel;

/* JADX INFO: renamed from: X.0Cap, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.vm.MentionListViewModel", f = "MentionListViewModel.kt", l = {480}, m = "mixSearchRefresh")
public final class C316450Cap extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ MentionListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C316450Cap(MentionListViewModel mentionListViewModel, InterfaceC1364105Vn<? super C316450Cap> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = mentionListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MentionListViewModel@ff55.mixSearchRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objZQ2 = this.LLILLJJLI.zQ2(0L, null, this);
        C1C7U.LIZIZ("MentionListViewModel@ff55.mixSearchRefresh$1");
        return objZQ2;
    }
}
