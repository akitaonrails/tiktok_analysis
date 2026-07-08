package X;

import com.ss.android.ugc.aweme.internalshare.impl.refactor.vm.ShareContactListViewModel;

/* JADX INFO: renamed from: X.06ZO, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.refactor.vm.ShareContactListViewModel", f = "ShareContactListViewModel.kt", l = {182, 194}, m = "doRefresh")
public final class C06ZO extends AbstractC23140094w {
    public C1364850lcZ LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ShareContactListViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06ZO(ShareContactListViewModel shareContactListViewModel, InterfaceC1364105Vn<? super C06ZO> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = shareContactListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareContactListViewModel@dcfa.doRefresh$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLL.vQ2(this);
        C1C7U.LIZIZ("ShareContactListViewModel@dcfa.doRefresh$1");
        return objVQ2;
    }
}
