package X;

import com.ss.android.ugc.aweme.publicgroup.vm.GroupListViewModel;

/* JADX INFO: renamed from: X.0i6Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.publicgroup.vm.GroupListViewModel", f = "GroupListViewModel.kt", l = {175}, m = "fetchGroupList")
public final class C1229690i6Z extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ GroupListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1229690i6Z(GroupListViewModel groupListViewModel, InterfaceC1364105Vn<? super C1229690i6Z> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = groupListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupListViewModel@5b8e.fetchGroupList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLJJLI.vQ2(false, this);
        C1C7U.LIZIZ("GroupListViewModel@5b8e.fetchGroupList$1");
        return objVQ2;
    }
}
