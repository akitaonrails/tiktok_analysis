package X;

import com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionListVM;

/* JADX INFO: renamed from: X.0OAd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionListVM", f = "AddYoursCollectionListVM.kt", l = {35}, m = "onLoadMore")
public final class C614970OAd extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AddYoursCollectionListVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C614970OAd(AddYoursCollectionListVM addYoursCollectionListVM, InterfaceC1364105Vn<? super C614970OAd> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = addYoursCollectionListVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddYoursCollectionListVM@bf39.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILLJJLI.onLoadMore(0L, this);
        C1C7U.LIZIZ("AddYoursCollectionListVM@bf39.onLoadMore$1");
        return objOnLoadMore;
    }
}
