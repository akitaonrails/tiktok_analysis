package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.viewmodel.exchange.UGExchangeDialogVM;
import kotlin.jvm.internal.AwS261S0300000_17;

/* JADX INFO: renamed from: X.0g1Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1149710g1Z extends AbstractC1149720g1a implements InterfaceC1149940g1w {
    public final InterfaceC1149850g1n LJII;
    public final int LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final long LJIIJ;

    @Override // X.AbstractC1149720g1a
    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
    public final UGExchangeDialogVM LIZJ() {
        return (UGExchangeDialogVM) this.LJIIIZ.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        if (r4.LLJJJIL == false) goto L29;
     */
    @Override // X.InterfaceC1150010g23
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean show() {
        /*
            r10 = this;
            com.bytedance.android.live.wallet.viewmodel.exchange.UGExchangeDialogVM r4 = r10.LIZJ()
            r4.getClass()
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r0 = com.bytedance.android.live.wallet.IWalletService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.wallet.IWalletService r0 = (com.bytedance.android.live.wallet.IWalletService) r0
            com.bytedance.android.live.wallet.IWalletCenter r0 = r0.walletCenter()
            com.bytedance.android.live.wallet.model.BalanceStruct r9 = r0.g52()
            if (r9 == 0) goto L80
            com.bytedance.android.live.wallet.model.BalanceStructExtra r0 = r9.exchangeInfo
            if (r0 == 0) goto L80
            long r7 = r0.getCoins()
        L21:
            X.0fsv r0 = r4.LLJJJ
            int r6 = r0.LIZIZ
            java.lang.String r3 = r0.LIZLLL
            long r1 = r0.LIZJ
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r0.LIZ
            boolean r0 = X.C1131530fYF.LIZ(r1, r0, r3)
            r3 = 1
            r5 = 0
            if (r0 == 0) goto L44
            if (r6 != r3) goto L44
        L35:
            android.content.Context r0 = r10.LIZ
            if (r0 == 0) goto L43
            r10.LJ()
            com.bytedance.android.live.wallet.viewmodel.exchange.UGExchangeDialogVM r0 = r10.LIZJ()
            r0.VQ2()
        L43:
            return r3
        L44:
            if (r9 == 0) goto L7d
            com.bytedance.android.live.wallet.model.BalanceStructExtra r0 = r9.exchangeInfo
            if (r0 == 0) goto L7d
            boolean r0 = r9.validUser
            if (r0 == 0) goto L7d
            long r1 = r4.LLJJIJIIJIL
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 > 0) goto L7d
            X.14i1<java.lang.Integer> r0 = X.InterfaceC1094160eZy.L0
            java.lang.Object r0 = r0.LIZIZ()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            com.bytedance.android.livesdk.livesetting.other.LiveExchangeCancelLimit r0 = com.bytedance.android.livesdk.livesetting.other.LiveExchangeCancelLimit.INSTANCE
            int r0 = r0.getValue()
            if (r1 < r0) goto L7e
            r1 = 1
        L69:
            X.14i1<java.lang.Boolean> r0 = X.InterfaceC1094160eZy.M0
            java.lang.Object r0 = r0.LIZIZ()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L35
            if (r1 == 0) goto L35
            boolean r0 = r4.LLJJJIL
            if (r0 != 0) goto L35
        L7d:
            return r5
        L7e:
            r1 = 0
            goto L69
        L80:
            r7 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1149710g1Z.show():boolean");
    }

    @Override // X.InterfaceC1149940g1w
    public final Context context() {
        return this.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c A[PHI: r14
      0x007c: PHI (r14v10 java.lang.String) = (r14v1 java.lang.String), (r14v11 java.lang.String) binds: [B:22:0x007a, B:18:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080 A[PHI: r14
      0x0080: PHI (r14v9 java.lang.String) = (r14v1 java.lang.String), (r14v10 java.lang.String) binds: [B:22:0x007a, B:24:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c9  */
    @Override // X.InterfaceC1149940g1w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C1149890g1r r28) {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1149710g1Z.LIZ(X.0g1r):void");
    }

    public C1149710g1Z(Context context, C1144350fsv c1144350fsv, InterfaceC1149850g1n interfaceC1149850g1n) {
        super(context, c1144350fsv);
        this.LJII = interfaceC1149850g1n;
        this.LJIIIIZZ = View.generateViewId();
        this.LJIIIZ = C292401Bi.LIZ(new AwS261S0300000_17(context, this, c1144350fsv, 10));
        this.LJIIJ = ((long) c1144350fsv.LIZIZ) - ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0();
    }
}
