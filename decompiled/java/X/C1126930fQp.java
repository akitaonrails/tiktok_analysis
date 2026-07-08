package X;

import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import u4.q0;

/* JADX INFO: renamed from: X.0fQp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1126930fQp extends AbstractC1126560fQE {
    public final View LLLILZ;
    public final String LLLILZJ;
    public final String LLLILZLLLI;
    public final C520690KbT LLLIZZ;
    public final C1295960jpS LLLJ;
    public final C1324720kZq LLLJIL;
    public final C16F5 LLLJL;
    public final C520690KbT LLLL;

    @Override // X.AbstractC1126560fQE
    public final void h6() {
        q0.LJIJ(this.LLLILZ, new C1151960g5C(this, 2));
    }

    @Override // X.AbstractC1126560fQE
    public final String R5() {
        return this.LLLILZJ;
    }

    public C1126930fQp(View view) {
        super(view);
        this.LLLILZ = view;
        this.LLLILZJ = "LiveGiftFirstRechargeViewHolderV2";
        this.LLLILZLLLI = C497740JfY.LJIJI(2131840820);
        this.LLLIZZ = (C520690KbT) this.itemView.findViewById(R.id.xw8);
        C16F5 c16f5 = (C16F5) this.itemView.findViewById(R.id.ycb);
        this.LLLJL = c16f5;
        this.LLLJ = (C1295960jpS) this.itemView.findViewById(R.id.f718i0b);
        this.LLLJIL = (C1324720kZq) this.itemView.findViewById(R.id.kgq);
        if (c16f5 != null) {
            c16f5.setTypeface(C1119920fFW.LIZJ(c16f5.getTextSize(), 500, this.itemView.getContext()));
        }
        this.LLLL = (C520690KbT) this.itemView.findViewById(R.id.chf);
        this.itemView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1151620g4e(this, 1));
    }

    @Override // X.AbstractC1126560fQE
    public final void N5(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI, DataChannel dataChannel, int i) {
        boolean z;
        super.N5(abstractC1126600fQI, dataChannel, i);
        C20441214yg.LIZIZ(this.LLLILZJ, "bindView portrait");
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = this.LLJJLIIIJLLLLLLLZ;
        if (abstractC1126600fQI2 != null) {
            z = abstractC1126600fQI2.LIZJ;
        } else {
            z = false;
        }
        C1126920fQo.LIZLLL(z, this.LLLJ, this.LLJILLL, this.LLJJI, this.LLLJIL);
        C520690KbT c520690KbT = this.LLLIZZ;
        if (c520690KbT != null) {
            C500260Jjc.LJIILIIL(c520690KbT);
        }
        C16F5 c16f5 = this.LLLJL;
        if (c16f5 != null) {
            C500260Jjc.LJIILIIL(c16f5);
        }
        C1126920fQo.LJ(this.LLJIJIL, z);
        C1126920fQo.LIZJ(this.LLJJIJI, this.LLJJIII, z);
        C16F5 c16f52 = this.LLJJJJ;
        if (c16f52 != null) {
            c16f52.setText(C497740JfY.LJIJI(2131841735));
        }
        C1126920fQo.LIZIZ(z, this.LLLL, this.LLJJIII);
        C1125760fOw.LIZIZ(this.LLJJIJI, this.LLJIJIL);
    }
}
