package X;

import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedDiggDetailListVM;

/* JADX INFO: renamed from: X.0Olu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedDiggDetailListVM", f = "VibeFeedDiggDetailListVM.kt", l = {368}, m = "onLoadLatest")
public final class C629080Olu extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ VibeFeedDiggDetailListVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C629080Olu(VibeFeedDiggDetailListVM vibeFeedDiggDetailListVM, InterfaceC1364105Vn<? super C629080Olu> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = vibeFeedDiggDetailListVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VibeFeedDiggDetailListVM@4fc.onLoadLatest$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnLoadLatest = this.LLILLJJLI.onLoadLatest(null, this);
        C1C7U.LIZIZ("VibeFeedDiggDetailListVM@4fc.onLoadLatest$1");
        return objOnLoadLatest;
    }
}
