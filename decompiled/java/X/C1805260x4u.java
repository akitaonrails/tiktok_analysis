package X;

import Y.ACListenerS59S0101000_27;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.model.ExchangeDisplayInfo;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0x4u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1805260x4u extends RecyclerView.ViewHolder {
    public final View LL;
    public final TuxTextView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxIconView LLILZ;
    public final /* synthetic */ C1806990x7h LLILZIL;

    public final void I5(int i) {
        Integer numValueOf;
        boolean z;
        RevenueExchange revenueExchange;
        WalletStruct walletStructTF1 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().TF1();
        ExchangeDisplayInfo exchangeDisplayInfoKL2 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().kL2();
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            Boolean boolValueOf = null;
            if (exchangeDisplayInfoKL2 != null) {
                numValueOf = Integer.valueOf(exchangeDisplayInfoKL2.exchangeEntranceTitle);
            } else {
                numValueOf = null;
            }
            if (walletStructTF1 != null && (revenueExchange = walletStructTF1.revenue) != null) {
                boolValueOf = Boolean.valueOf(revenueExchange.isRevenue());
            }
            boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
            if (walletStructTF1 != null && walletStructTF1.isPeriodicPayout) {
                z = true;
            } else {
                z = false;
            }
            tuxTextView.setText(C1805860x5s.LIZ(i, numValueOf, zLJJJI, z));
        }
        TuxTextView tuxTextView2 = this.LLILLL;
        if (tuxTextView2 != null) {
            C786410Ut5.h9(tuxTextView2, new ACListenerS59S0101000_27(this.LLILZIL, i, 2));
        }
        C1591306Kx.LJII(this.LL, Integer.valueOf(exchangeDisplayInfoKL2.exchangeEntranceIcon));
        TuxTextView tuxTextView3 = this.LLILLL;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(C1151100g3o.LIZJ(i));
        }
        if (this.LLILZIL.LLILLL.LLLFFI == 2) {
            TuxTextView tuxTextView4 = this.LLILLJJLI;
            if (tuxTextView4 != null) {
                tuxTextView4.setEnabled(true);
            }
            TuxTextView tuxTextView5 = this.LLILLL;
            if (tuxTextView5 != null) {
                tuxTextView5.setEnabled(true);
            }
            TuxIconView tuxIconView = this.LLILZ;
            if (tuxIconView != null) {
                tuxIconView.setEnabled(true);
                return;
            }
            return;
        }
        TuxTextView tuxTextView6 = this.LLILLJJLI;
        if (tuxTextView6 != null) {
            tuxTextView6.setEnabled(false);
        }
        TuxTextView tuxTextView7 = this.LLILLL;
        if (tuxTextView7 != null) {
            tuxTextView7.setEnabled(false);
        }
        TuxIconView tuxIconView2 = this.LLILZ;
        if (tuxIconView2 == null) {
            return;
        }
        tuxIconView2.setEnabled(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1805260x4u(C1806990x7h c1806990x7h, View view) {
        super(view);
        this.LLILZIL = c1806990x7h;
        this.LL = view;
        this.LLILLJJLI = (TuxTextView) view.findViewById(R.id.h8_);
        this.LLILLL = (TuxTextView) view.findViewById(R.id.h7o);
        this.LLILZ = (TuxIconView) view.findViewById(R.id.h7e);
    }
}
