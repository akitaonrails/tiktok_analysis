package X;

import Y.ACListenerS162S0100000_28;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0zIK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1890460zIK extends RecyclerView.ViewHolder implements C0Z37<C1777820wMe>, InterfaceC1508640pMU {
    public final View LL;
    public final Fragment LLILLJJLI;
    public final TuxTextView LLILLL;
    public final C197039127h LLILZ;
    public final TuxIconView LLILZIL;
    public Integer LLILZLL;
    public C1777820wMe LLIZ;

    @Override // X.InterfaceC1508640pMU
    public final String T() {
        return "DMPushVH";
    }

    public C1890460zIK(View view, Fragment fragment) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = fragment;
        this.LLILLL = (TuxTextView) view.findViewById(R.id.sje);
        this.LLILZ = (C197039127h) view.findViewById(R.id.pnp);
        this.LLILZIL = (TuxIconView) view.findViewById(R.id.e1v);
    }

    public final void I5(boolean z, boolean z2) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1642606bw("im_push", z, z2, this, null), 3);
    }

    @Override // X.C0Z37
    public final void LJZI(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        String string;
        Context contextRequireContext;
        Context contextRequireContext2;
        String string2;
        Context contextRequireContext3;
        Context contextRequireContext4;
        String string3;
        Context contextRequireContext5;
        Context contextRequireContext6;
        C1777820wMe c1777820wMe = (C1777820wMe) interfaceC1891350zJl;
        this.LLIZ = c1777820wMe;
        Integer numValueOf = Integer.valueOf(c1777820wMe.LL);
        this.LLILZLL = numValueOf;
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            if (C06NU.LIZ()) {
                C197039127h c197039127h = this.LLILZ;
                c197039127h.setButtonSize(1);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(6));
                c197039127h.setBackground(c384050F3z.LIZ(this.LL.getContext()));
            }
            String string4 = null;
            if (C889930Yvf.LIZ.LIZJ() == C05RV.BUSINESS_INBOX) {
                TuxTextView tuxTextView = this.LLILLL;
                Fragment fragment = this.LLILLJJLI;
                if (fragment != null && (contextRequireContext6 = fragment.requireContext()) != null) {
                    string3 = contextRequireContext6.getString(2131845305);
                } else {
                    string3 = null;
                }
                tuxTextView.setText(string3);
                C197039127h c197039127h2 = this.LLILZ;
                Fragment fragment2 = this.LLILLJJLI;
                if (fragment2 != null && (contextRequireContext5 = fragment2.requireContext()) != null) {
                    string4 = contextRequireContext5.getString(2131845304);
                }
                c197039127h2.setText(string4);
            } else if (iIntValue != 0) {
                if (iIntValue == 1) {
                    TuxTextView tuxTextView2 = this.LLILLL;
                    Fragment fragment3 = this.LLILLJJLI;
                    if (fragment3 != null && (contextRequireContext4 = fragment3.requireContext()) != null) {
                        string2 = contextRequireContext4.getString(2131845548);
                    } else {
                        string2 = null;
                    }
                    tuxTextView2.setText(string2);
                    C197039127h c197039127h3 = this.LLILZ;
                    Fragment fragment4 = this.LLILLJJLI;
                    if (fragment4 != null && (contextRequireContext3 = fragment4.requireContext()) != null) {
                        string4 = contextRequireContext3.getString(2131845550);
                    }
                    c197039127h3.setText(string4);
                }
            } else {
                TuxTextView tuxTextView3 = this.LLILLL;
                Fragment fragment5 = this.LLILLJJLI;
                if (fragment5 != null && (contextRequireContext2 = fragment5.requireContext()) != null) {
                    string = contextRequireContext2.getString(2131845549);
                } else {
                    string = null;
                }
                tuxTextView3.setText(string);
                C197039127h c197039127h4 = this.LLILZ;
                Fragment fragment6 = this.LLILLJJLI;
                if (fragment6 != null && (contextRequireContext = fragment6.requireContext()) != null) {
                    string4 = contextRequireContext.getString(2131845559);
                }
                c197039127h4.setText(string4);
            }
        }
        C786410Ut5.I7(new ACListenerS162S0100000_28(this, 138), this.LL);
        C786410Ut5.a9(this.LLILZIL, new ACListenerS162S0100000_28(this, 139));
    }
}
