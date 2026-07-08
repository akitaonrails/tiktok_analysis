package X;

import Y.ALAdapterS16S0100000_20;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import tikcast.api.anchor_data.FinishEncourageLiveAchievement;

/* JADX INFO: renamed from: X.0ku5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1337270ku5 extends AbstractC1337430kuL {
    public FinishEncourageLiveAchievement LJIJ;
    public C16F5 LJIJI;
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
        C16F5 c16f5 = this.LJIJI;
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 0);
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
        animatorSet.addListener(new ALAdapterS16S0100000_20(this, 10));
        this.LIZIZ = animatorSet;
        animatorSet.start();
    }

    @Override // X.InterfaceC20482815Cw
    public final AbstractC1337320kuA getContainerType() {
        return C1337360kuE.LIZJ;
    }

    @Override // X.InterfaceC20482815Cw
    public final View LJIIIIZZ(Context context, ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ghp, viewGroup, false);
        this.LJIJI = (C16F5) viewTd.findViewById(R.id.z85);
        this.LJIJJ = (C1295960jpS) viewTd.findViewById(R.id.nrv);
        this.LIZ = viewTd;
        C786410Ut5.T4(viewTd, 0.0f);
        return viewTd;
    }

    @Override // X.AbstractC1337430kuL, X.InterfaceC20482815Cw
    public final void LIZIZ(int i, int i2, Object obj) {
        FinishEncourageLiveAchievement finishEncourageLiveAchievement;
        String str;
        super.LIZIZ(i, i2, obj);
        if ((obj instanceof FinishEncourageLiveAchievement) && (finishEncourageLiveAchievement = (FinishEncourageLiveAchievement) obj) != null) {
            this.LJIJ = finishEncourageLiveAchievement;
            C1295960jpS c1295960jpS = this.LJIJJ;
            if (c1295960jpS != null) {
                C1143680frq.LJIILL(c1295960jpS, "tiktok_live_broadcast_demand_12", C15CY.LJI(finishEncourageLiveAchievement, true), false, new C1339340kxQ(c1295960jpS, this, 2));
            }
            FinishEncourageLiveAchievement finishEncourageLiveAchievement2 = this.LJIJ;
            if (finishEncourageLiveAchievement2 == null || (str = finishEncourageLiveAchievement2.finishTitle) == null) {
                str = "";
            }
            C16F5 c16f5 = this.LJIJI;
            if (c16f5 != null) {
                C786410Ut5.LLJJJJ(c16f5, 8);
            }
            C16F5 c16f52 = this.LJIJI;
            if (c16f52 != null) {
                c16f52.setTextSize(1, this.LJI);
            }
            Typeface typefaceLJIIJJI = LJIIJJI();
            C16F5 c16f53 = this.LJIJI;
            if (c16f53 != null) {
                c16f53.setTypeface(typefaceLJIIJJI);
            }
            C16F5 c16f54 = this.LJIJI;
            if (c16f54 != null) {
                c16f54.setText(str);
            }
        }
    }
}
