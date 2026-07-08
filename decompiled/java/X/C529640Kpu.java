package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Kpu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C529640Kpu extends C529590Kpp {
    public final TuxTextView LLJJJIL;
    public final View LLJJJJ;
    public final /* synthetic */ C529630Kpt LLJJJJJIL;

    @Override // X.C529590Kpp, X.C529620Kps
    public final void P5(ViewGroup viewGroup) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_ugc_photo_template_hint", true, false)) {
            C339190DRl.LIZLLL(this.LLJJJIL);
            int iLIZIZ = C497820Jfg.LIZIZ(this.itemView.getContext());
            if (iLIZIZ <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(320))) {
                this.LLJJIJI = C529630Kpt.LLJILLL;
                this.LLJJJIL.setMaxLines(3);
            } else if (iLIZIZ <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(480))) {
                this.LLJJIJI = C529630Kpt.LLJJ;
                this.LLJJJIL.setMaxLines(4);
            } else {
                this.LLJJIJI = C529630Kpt.LLJJI;
                this.LLJJJIL.setMaxLines(6);
            }
        } else {
            C339190DRl.LIZIZ(this.LLJJJIL);
        }
        super.P5(viewGroup);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C529640Kpu(C529630Kpt c529630Kpt, ViewGroup viewGroup) {
        super(c529630Kpt, viewGroup);
        this.LLJJJJJIL = c529630Kpt;
        this.LLJJJIL = (TuxTextView) this.itemView.findViewById(R.id.fpd);
        this.LLJJJJ = this.itemView.findViewById(R.id.o1o);
    }
}
