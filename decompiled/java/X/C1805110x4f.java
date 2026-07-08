package X;

import com.bytedance.android.live.walletclean.presentation.assem.body.viewmodel.RechargePanelBodyViewModel;

/* JADX INFO: renamed from: X.0x4f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.walletclean.presentation.assem.body.viewmodel.RechargePanelBodyViewModel", f = "RechargePanelBodyViewModel.kt", l = {537}, m = "showData")
public final class C1805110x4f extends AbstractC23140094w {
    public C1805210x4p LL;
    public C1805530x5L LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ RechargePanelBodyViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1805110x4f(RechargePanelBodyViewModel rechargePanelBodyViewModel, InterfaceC1364105Vn<? super C1805110x4f> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = rechargePanelBodyViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RechargePanelBodyViewModel@d42d.showData$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objEQ2 = this.LLILZ.EQ2(null, null, null, this);
        C1C7U.LIZIZ("RechargePanelBodyViewModel@d42d.showData$1");
        return objEQ2;
    }
}
