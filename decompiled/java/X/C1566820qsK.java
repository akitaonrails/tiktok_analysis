package X;

import com.bytedance.android.live.walletclean.presentation.assem.header.viewmodel.RechargePanelHeaderViewModel;

/* JADX INFO: renamed from: X.0qsK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.bytedance.android.live.walletclean.presentation.assem.header.viewmodel.RechargePanelHeaderViewModel", f = "RechargePanelHeaderViewModel.kt", l = {90}, m = "buildNoticeInput")
public final class C1566820qsK extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ RechargePanelHeaderViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1566820qsK(RechargePanelHeaderViewModel rechargePanelHeaderViewModel, InterfaceC1364105Vn<? super C1566820qsK> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = rechargePanelHeaderViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RechargePanelHeaderViewModel@ef55.buildNoticeInput$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLL.vQ2(null, this);
        C1C7U.LIZIZ("RechargePanelHeaderViewModel@ef55.buildNoticeInput$1");
        return objVQ2;
    }
}
