package X;

import com.ss.android.ugc.aweme.toplive.vm.ToplivePageListViewModel;

/* JADX INFO: renamed from: X.0IwA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.toplive.vm.ToplivePageListViewModel", f = "ToplivePageListViewModel.kt", l = {104, 106}, m = "fetchList")
public final class C482560IwA extends AbstractC23140094w {
    public boolean LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ToplivePageListViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C482560IwA(ToplivePageListViewModel toplivePageListViewModel, InterfaceC1364105Vn<? super C482560IwA> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = toplivePageListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ToplivePageListViewModel@1c07.fetchList$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLL.vQ2(false, this);
        C1C7U.LIZIZ("ToplivePageListViewModel@1c07.fetchList$1");
        return objVQ2;
    }
}
