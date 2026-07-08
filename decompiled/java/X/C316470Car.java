package X;

import com.ss.android.ugc.aweme.base.vm.MentionListViewModel;

/* JADX INFO: renamed from: X.0Car, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.vm.MentionListViewModel", f = "MentionListViewModel.kt", l = {619}, m = "searchGroupInMention")
public final class C316470Car extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ MentionListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C316470Car(MentionListViewModel mentionListViewModel, InterfaceC1364105Vn<? super C316470Car> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = mentionListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MentionListViewModel@ff55.searchGroupInMention$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objFQ2 = this.LLILLJJLI.FQ2(this);
        C1C7U.LIZIZ("MentionListViewModel@ff55.searchGroupInMention$1");
        return objFQ2;
    }
}
