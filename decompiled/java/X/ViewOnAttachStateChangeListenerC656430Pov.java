package X;

import Y.AfS179S0100000_10;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Pov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class ViewOnAttachStateChangeListenerC656430Pov extends AbstractC655570PnX implements View.OnAttachStateChangeListener {
    public static final /* synthetic */ int LLJJJJLIIL = 0;
    public final View LLJ;
    public final InterfaceC661680PxO LLJI;
    public InterfaceC656470Poz LLJIJIL;
    public final C661470Px3 LLJILJIL;
    public final C0GZM LLJILJILJ;
    public final TuxTextView LLJILLL;
    public final TuxTextView LLJJ;
    public final C427870Gq9 LLJJI;
    public final TuxTextView LLJJIII;
    public final View LLJJIJI;
    public final C0GZM LLJJIJIIJIL;
    public final ConstraintLayout LLJJIJIL;
    public final ConstraintLayout LLJJJ;
    public final int LLJJJIL;
    public final int LLJJJJ;
    public View.OnClickListener LLJJJJJIL;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // X.AbstractC655570PnX
    public final /* bridge */ /* synthetic */ ImageView I5() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC655570PnX
    public final C661470Px3 N5() {
        return this.LLJILJIL;
    }

    public ViewOnAttachStateChangeListenerC656430Pov(View view, InterfaceC641090PCp interfaceC641090PCp, C652990PjN c652990PjN, InterfaceC652950PjJ interfaceC652950PjJ, View view2, InterfaceC661680PxO interfaceC661680PxO) {
        C11NZ c11nzLIZIZ;
        super(view, interfaceC641090PCp, c652990PjN, interfaceC652950PjJ);
        this.LLJ = view2;
        this.LLJI = interfaceC661680PxO;
        this.LLJILJIL = (C661470Px3) view.findViewById(R.id.video_view);
        this.LLJILJILJ = (C0GZM) view.findViewById(R.id.cover);
        this.LLJILLL = (TuxTextView) view.findViewById(R.id.sgg);
        this.LLJJ = (TuxTextView) view.findViewById(R.id.mnh);
        this.LLJJI = (C427870Gq9) view.findViewById(R.id.bbz);
        this.LLJJIII = (TuxTextView) view.findViewById(R.id.bc6);
        this.LLJJIJI = view.findViewById(R.id.jsn);
        this.LLJJIJIIJIL = (C0GZM) view.findViewById(R.id.jso);
        this.LLJJIJIL = (ConstraintLayout) view.findViewById(R.id.ccd);
        this.LLJJJ = (ConstraintLayout) view.findViewById(R.id.tr1);
        this.LLJJJIL = C12ES.LJIIJ(view.getContext());
        this.LLJJJJ = C12ES.LJIIIIZZ(view.getContext());
        view.addOnAttachStateChangeListener(this);
        SAFHelper.LIZ.getClass();
        if (SAFHelper.LJIIJJI()) {
            c11nzLIZIZ = C1906580ziK.LIZJ().LJIIJ();
        } else {
            c11nzLIZIZ = C2214201BlK.LIZIZ();
        }
        c11nzLIZIZ.LJJLJLI(new AfS179S0100000_10(this, 8));
    }
}
