package X;

import Y.ALAdapterS16S0100000_20;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import tikcast.api.anchor_data.FinishEncourageDecoupling;

/* JADX INFO: renamed from: X.0ku6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1337280ku6 extends AbstractC1337430kuL {
    public FinishEncourageDecoupling LJIJ;
    public TuxTextView LJIJI;
    public C1295960jpS LJIJJ;

    @Override // X.AbstractC1337430kuL, X.InterfaceC20482815Cw
    public final long LJFF() {
        return 2750L;
    }

    @Override // X.AbstractC1337430kuL, X.InterfaceC20482815Cw
    public final void LJI() {
        try {
            C1295960jpS c1295960jpS = this.LJIJJ;
            if (c1295960jpS != null) {
                c1295960jpS.pauseAnimation();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        super.LJI();
    }

    @Override // X.AbstractC1337430kuL
    public final void LJIILIIL() {
        C1295960jpS c1295960jpS = this.LJIJJ;
        if (c1295960jpS != null) {
            C1296260jpw.LIZ(c1295960jpS);
        }
        TuxTextView tuxTextView = this.LJIJI;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
    }

    @Override // X.AbstractC1337430kuL
    public final void LJIILJJIL() {
        View view = this.LIZ;
        if (view == null) {
            return;
        }
        AnimatorSet animatorSetLJIIJ = AbstractC1337430kuL.LJIIJ(view);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorSetLJIIJ);
        animatorSet.addListener(new ALAdapterS16S0100000_20(this, 2));
        this.LIZIZ = animatorSet;
        animatorSet.start();
    }

    @Override // X.InterfaceC20482815Cw
    public final AbstractC1337320kuA getContainerType() {
        return C1337330kuB.LIZJ;
    }

    @Override // X.InterfaceC20482815Cw
    public final View LJIIIIZZ(Context context, ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ghn, viewGroup, false);
        this.LJIJI = (TuxTextView) viewTd.findViewById(R.id.zhh);
        this.LJIJJ = (C1295960jpS) viewTd.findViewById(R.id.nrw);
        this.LIZ = viewTd;
        C786410Ut5.T4(viewTd, 0.0f);
        return viewTd;
    }

    @Override // X.AbstractC1337430kuL, X.InterfaceC20482815Cw
    public final void LIZIZ(int i, int i2, Object obj) {
        FinishEncourageDecoupling finishEncourageDecoupling;
        String str;
        String str2;
        String str3;
        super.LIZIZ(i, i2, obj);
        Boolean boolValueOf = null;
        if ((obj instanceof FinishEncourageDecoupling) && (finishEncourageDecoupling = (FinishEncourageDecoupling) obj) != null) {
            this.LJIJ = finishEncourageDecoupling;
            C1295960jpS c1295960jpS = this.LJIJJ;
            if (c1295960jpS != null) {
                if (C500260Jjc.LJJJI(Boolean.valueOf(finishEncourageDecoupling.recvFirstGift))) {
                    str2 = "tiktok_live_broadcast_demand_13";
                } else {
                    str2 = "tiktok_live_broadcast_demand_12";
                }
                FinishEncourageDecoupling finishEncourageDecoupling2 = this.LJIJ;
                if (finishEncourageDecoupling2 != null) {
                    boolValueOf = Boolean.valueOf(finishEncourageDecoupling2.recvFirstGift);
                }
                if (C500260Jjc.LJJJI(boolValueOf)) {
                    str3 = "ttlive_finish_encourage_reward_diamonds_weak.zip";
                } else {
                    str3 = "ttlive_finish_encourage_reward_weak.zip";
                }
                C1143680frq.LJIILL(c1295960jpS, str2, str3, false, new C1339340kxQ(c1295960jpS, this, 0));
            }
            FinishEncourageDecoupling finishEncourageDecoupling3 = this.LJIJ;
            if (finishEncourageDecoupling3 == null || (str = finishEncourageDecoupling3.finishTitle) == null) {
                str = "";
            }
            TuxTextView tuxTextView = this.LJIJI;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
            TuxTextView tuxTextView2 = this.LJIJI;
            if (tuxTextView2 != null) {
                tuxTextView2.LJJJJI(this.LJI);
            }
            Typeface typefaceLJIIJJI = LJIIJJI();
            TuxTextView tuxTextView3 = this.LJIJI;
            if (tuxTextView3 != null) {
                tuxTextView3.setTypeface(typefaceLJIIJJI);
            }
            TuxTextView tuxTextView4 = this.LJIJI;
            if (tuxTextView4 != null) {
                tuxTextView4.setText(str);
            }
        }
    }
}
