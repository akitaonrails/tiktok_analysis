package X;

import Y.ACListenerS162S0100000_28;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.zhiliaoapp.musically.R;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0zcL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1902870zcL extends AbstractC1903430zdF<C890720Yww> implements C0Z37<C890720Yww>, InterfaceC1508640pMU {
    public final View LLJ;
    public final TuxTextView LLJI;
    public final C197039127h LLJIJIL;
    public final TuxIconView LLJILJIL;
    public Integer LLJILJILJ;

    @Override // X.InterfaceC1508640pMU
    public final String T() {
        return "DMPushVH";
    }

    @Override // X.AbstractC1903430zdF
    public final void reportShowEvent() {
        MultiViewModel multiViewModelN5 = N5();
        if (multiViewModelN5 == null || multiViewModelN5.LLJLL) {
            return;
        }
        multiViewModelN5.LLJLL = true;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), new C346540DiG(CoroutineExceptionHandler.LJJLIL, 3), null, new C1478305qX("dm_turn_on_notification_bar_v2", null), 2);
        MultiViewModel.IQ2("notification_setting_alert_show");
    }

    public C1902870zcL(View view) {
        super(view);
        this.LLJ = view;
        this.LLJI = (TuxTextView) view.findViewById(R.id.sje);
        this.LLJIJIL = (C197039127h) view.findViewById(R.id.pnp);
        this.LLJILJIL = (TuxIconView) view.findViewById(R.id.e1v);
    }

    @Override // X.AbstractC1903430zdF
    public final void R5(AbstractC895380ZAq abstractC895380ZAq) {
        Integer numValueOf = Integer.valueOf(((C890720Yww) abstractC895380ZAq).LLILLJJLI);
        this.LLJILJILJ = numValueOf;
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            Context contextL5 = L5();
            if (contextL5 == null) {
                contextL5 = C1383370m6R.LIZ;
            }
            if (C889930Yvf.LIZ.LIZJ() == C05RV.BUSINESS_INBOX) {
                this.LLJI.setText(contextL5.getString(2131845305));
                this.LLJIJIL.setText(contextL5.getString(2131845304));
            } else if (iIntValue != 0) {
                if (iIntValue == 1) {
                    this.LLJI.setText(contextL5.getString(2131845548));
                    this.LLJIJIL.setText(contextL5.getString(2131845550));
                }
            } else {
                this.LLJI.setText(contextL5.getString(2131845549));
                this.LLJIJIL.setText(contextL5.getString(2131845559));
            }
        }
        C786410Ut5.U8(this.LLJIJIL, new ACListenerS162S0100000_28(this, 159));
        C786410Ut5.a9(this.LLJILJIL, new ACListenerS162S0100000_28(this, 160));
    }

    @Override // X.C0Z37
    public final void LJZI(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        I5(i, interfaceC1891350zJl);
    }
}
