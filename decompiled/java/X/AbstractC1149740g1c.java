package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM;
import com.bytedance.android.live.wallet.viewmodel.exchange.base.BaseLiveIncomeExchangeDialogVM;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeStandardizeUISetting;
import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.0g1c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1149740g1c extends AbstractC1149720g1a implements InterfaceC1149940g1w {
    public final int LJII;
    public final long LJIIIIZZ;

    public abstract BaseLiveIncomeExchangeDialogVM LJII();

    public abstract int LJIIIIZZ();

    public abstract String LJIIIZ();

    public abstract String LJIIJ();

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
    
        r1 = true;
     */
    @Override // X.InterfaceC1150010g23
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean show() {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1149740g1c.show():boolean");
    }

    @Override // X.InterfaceC1149940g1w
    public final Context context() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1149940g1w
    public final void LIZ(C1149890g1r c1149890g1r) {
        int i;
        boolean z;
        boolean z2;
        C1144330fst c1144330fst;
        if (LiveRechargeStandardizeUISetting.INSTANCE.getValue() && !this.LIZLLL) {
            C786410Ut5.LJLIIL(this.LJIIIIZZ, C820670WHh.LIZ, new Runnable() { // from class: X.0g1f
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("BaseLiveIncomeExchangeDialog@8371.renderWithExchangeData$1");
                    try {
                        C784440Upu.LIZ().LIZIZ(new C0IF2(1));
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("BaseLiveIncomeExchangeDialog@8371.renderWithExchangeData$1");
                }
            });
        }
        Context context = this.LIZ;
        if (context != null) {
            C1149870g1p c1149870g1p = this.LIZIZ.LJII;
            WalletStruct walletStructTF1 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().TF1();
            BaseLiveIncomeExchangeDialogVM baseLiveIncomeExchangeDialogVMLJII = LJII();
            C1149870g1p c1149870g1p2 = this.LIZIZ.LJII;
            baseLiveIncomeExchangeDialogVMLJII.getClass();
            if (ExchangeDialogVM.EQ2(c1149870g1p2)) {
                this.LIZLLL = true;
                z = !LIZJ().CQ2(false);
                BaseLiveIncomeExchangeDialogVM baseLiveIncomeExchangeDialogVMLJII2 = LJII();
                baseLiveIncomeExchangeDialogVMLJII2.getClass();
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_balance_exchange_window_dont_show_again");
                c474500IjALIZ.LJJII(Long.valueOf(C500260Jjc.LJJLIIIJ(baseLiveIncomeExchangeDialogVMLJII2.LLJILJILJ.LIZ)), "room_id");
                c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
                c474500IjALIZ.LIZ();
                i = 2131841565;
            } else {
                if (LIZJ().CQ2(false)) {
                    this.LIZLLL = true;
                    i = 2131855703;
                } else {
                    i = 2131841563;
                }
                z = false;
            }
            int iLJIIIIZZ = LJIIIIZZ();
            String strLJIIJ = LJIIJ();
            String strLJIIIZ = LJIIIZ();
            if (walletStructTF1 != null && walletStructTF1.autoExchangeSupported && InterfaceC1094160eZy.S0.LIZIZ().intValue() > 1 && !LJII().LLJJJIL) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c1149870g1p != null) {
                c1144330fst = c1149870g1p.LIZJ;
            } else {
                c1144330fst = null;
            }
            this.LJ = new C1149810g1j(strLJIIJ, strLJIIIZ, i, iLJIIIIZZ, 2131841608, z2, z, c1144330fst, null, 2496);
            LiveDialog liveDialog = this.LIZJ;
            if (liveDialog == null) {
                C1150150g2H c1150150g2H = new C1150150g2H(context, LJII());
                c1150150g2H.setId(this.LJII);
                c1150150g2H.LIZ(LIZLLL().LIZIZ, c1149890g1r.LIZ);
                LIZLLL().LIZIZ = "";
                LIZLLL().LJII = c1150150g2H;
                BaseLiveIncomeExchangeDialogVM baseLiveIncomeExchangeDialogVMLJII3 = LJII();
                baseLiveIncomeExchangeDialogVMLJII3.getClass();
                C1144350fsv c1144350fsv = baseLiveIncomeExchangeDialogVMLJII3.LLJILJILJ;
                C1149680g1W.LJIIIZ(c1144350fsv.LIZ, c1144350fsv.LIZJ, baseLiveIncomeExchangeDialogVMLJII3.AQ2(baseLiveIncomeExchangeDialogVMLJII3.LLJJIJIL), "anchor_income", baseLiveIncomeExchangeDialogVMLJII3.LLJILJILJ.LIZLLL, 1, C500260Jjc.LJJJI(Boolean.valueOf(baseLiveIncomeExchangeDialogVMLJII3.BQ2())) ? 1 : 0, 0);
                LIZIZ();
                return;
            }
            C1150150g2H c1150150g2H2 = (C1150150g2H) liveDialog.findViewById(this.LJII);
            if (c1150150g2H2 == null) {
                return;
            }
            c1150150g2H2.LIZ(LIZLLL().LIZIZ, c1149890g1r.LIZ);
        }
    }

    public AbstractC1149740g1c(Context context, C1144350fsv c1144350fsv) {
        super(context, c1144350fsv);
        this.LJII = View.generateViewId();
        this.LJIIIIZZ = 500L;
    }
}
