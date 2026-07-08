package com.bytedance.android.live.walletclean.presentation.assem.header.viewmodel;

import X.C1556790qc9;
import X.C1566230qrN;
import X.C1568590qvB;
import X.C1570060qxY;
import X.C1796830wrJ;
import X.InterfaceC0148002o;
import X.InterfaceC1566260qrQ;
import X.InterfaceC1567090qsl;
import X.InterfaceC1567100qsm;
import X.InterfaceC1567140qsq;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* JADX INFO: loaded from: classes25.dex */
public final class RechargePanelHeaderViewModel extends AssemViewModel<C1556790qc9> {
    public final InterfaceC1566260qrQ LL;
    public final InterfaceC1567090qsl LLILLJJLI;
    public final InterfaceC1567100qsm LLILLL;
    public final InterfaceC1567140qsq LLILZ;
    public final IapService LLILZIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1556790qc9(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(X.C1566250qrP r8, X.InterfaceC1364105Vn<? super X.C1567200qsw> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C1566820qsK
            if (r0 == 0) goto L52
            r6 = r9
            X.0qsK r6 = (X.C1566820qsK) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L52
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r5 = r6.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r3 = 1
            if (r0 == 0) goto L34
            if (r0 != r3) goto L58
            java.lang.Object r2 = r6.LL
            java.lang.String r2 = (java.lang.String) r2
            X.C155000ia.LIZIZ(r5)
        L26:
            java.lang.String r5 = (java.lang.String) r5
            com.bytedance.android.live.iap.service.IapService r0 = r7.LLILZIL
            java.lang.String r1 = r0.getBillingCountryCode()
            X.0qsw r0 = new X.0qsw
            r0.<init>(r2, r5, r1)
            return r0
        L34:
            X.C155000ia.LIZIZ(r5)
            boolean r0 = r8.LLIZ
            if (r0 == 0) goto L4f
            java.lang.String r2 = "live_room_recharge_panel"
        L3d:
            X.0qsm r1 = r7.LLILLL
            X.0504 r0 = new X.0504
            r0.<init>(r3)
            r6.LL = r2
            r6.LLILZ = r3
            java.lang.Object r5 = r1.LJ(r0, r6)
            if (r5 != r4) goto L26
            return r4
        L4f:
            java.lang.String r2 = "recharge_panel"
            goto L3d
        L52:
            X.0qsK r6 = new X.0qsK
            r6.<init>(r7, r9)
            goto L12
        L58:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.walletclean.presentation.assem.header.viewmodel.RechargePanelHeaderViewModel.vQ2(X.0qrP, X.05Vn):java.lang.Object");
    }

    public RechargePanelHeaderViewModel(C1566230qrN c1566230qrN, C1568590qvB c1568590qvB, C1796830wrJ c1796830wrJ, C1570060qxY c1570060qxY, IapService iapService) {
        this.LL = c1566230qrN;
        this.LLILLJJLI = c1568590qvB;
        this.LLILLL = c1796830wrJ;
        this.LLILZ = c1570060qxY;
        this.LLILZIL = iapService;
    }
}
