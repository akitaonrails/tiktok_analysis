package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0H7N, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H7N implements InterfaceC340040DUs {
    public final ConstraintLayout LL;
    public final TuxIconView LLILLJJLI;
    public final ConstraintLayout LLILLL;
    public final TuxTextView LLILZ;
    public final TuxIconView LLILZIL;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public static C0H7N LIZ(View view) {
        int i = R.id.avb;
        TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.avb, view);
        if (tuxIconView != null) {
            i = R.id.avc;
            ConstraintLayout constraintLayout = (ConstraintLayout) C1616006Uk.LIZ(R.id.avc, view);
            if (constraintLayout != null) {
                ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                i = R.id.avx;
                TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.avx, view);
                if (tuxTextView != null) {
                    i = R.id.e1v;
                    TuxIconView tuxIconView2 = (TuxIconView) C1616006Uk.LIZ(R.id.e1v, view);
                    if (tuxIconView2 != null) {
                        return new C0H7N(constraintLayout2, tuxIconView, constraintLayout, tuxTextView, tuxIconView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public C0H7N(ConstraintLayout constraintLayout, TuxIconView tuxIconView, ConstraintLayout constraintLayout2, TuxTextView tuxTextView, TuxIconView tuxIconView2) {
        this.LL = constraintLayout;
        this.LLILLJJLI = tuxIconView;
        this.LLILLL = constraintLayout2;
        this.LLILZ = tuxTextView;
        this.LLILZIL = tuxIconView2;
    }
}
