package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0h0k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1187640h0k implements InterfaceC340040DUs {
    public final ConstraintLayout LL;
    public final TuxTextView LLILLJJLI;
    public final TuxIconView LLILLL;
    public final ConstraintLayout LLILZ;
    public final TuxTextView LLILZIL;
    public final TuxTextView LLILZLL;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public static C1187640h0k LIZ(View view) {
        int i = R.id.r6g;
        TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.r6g, view);
        if (tuxTextView != null) {
            i = R.id.r6h;
            TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.r6h, view);
            if (tuxIconView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.r6j;
                TuxTextView tuxTextView2 = (TuxTextView) C1616006Uk.LIZ(R.id.r6j, view);
                if (tuxTextView2 != null) {
                    i = R.id.r6l;
                    TuxTextView tuxTextView3 = (TuxTextView) C1616006Uk.LIZ(R.id.r6l, view);
                    if (tuxTextView3 != null) {
                        return new C1187640h0k(constraintLayout, constraintLayout, tuxIconView, tuxTextView, tuxTextView2, tuxTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public C1187640h0k(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TuxIconView tuxIconView, TuxTextView tuxTextView, TuxTextView tuxTextView2, TuxTextView tuxTextView3) {
        this.LL = constraintLayout;
        this.LLILLJJLI = tuxTextView;
        this.LLILLL = tuxIconView;
        this.LLILZ = constraintLayout2;
        this.LLILZIL = tuxTextView2;
        this.LLILZLL = tuxTextView3;
    }
}
