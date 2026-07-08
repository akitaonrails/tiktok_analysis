package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.06Uh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1615706Uh implements InterfaceC340040DUs {
    public final ConstraintLayout LL;
    public final TuxIconView LLILLJJLI;
    public final TuxIconView LLILLL;
    public final ConstraintLayout LLILZ;
    public final TuxTextView LLILZIL;
    public final TuxIconView LLILZLL;
    public final FrameLayout LLIZ;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public static C1615706Uh LIZ(View view) {
        int i = R.id.coo;
        TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.coo, view);
        if (tuxIconView != null) {
            i = R.id.cp0;
            TuxIconView tuxIconView2 = (TuxIconView) C1616006Uk.LIZ(R.id.cp0, view);
            if (tuxIconView2 != null) {
                i = R.id.e0s;
                ConstraintLayout constraintLayout = (ConstraintLayout) C1616006Uk.LIZ(R.id.e0s, view);
                if (constraintLayout != null) {
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                    i = R.id.vct;
                    TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.vct, view);
                    if (tuxTextView != null) {
                        i = R.id.vcv;
                        TuxIconView tuxIconView3 = (TuxIconView) C1616006Uk.LIZ(R.id.vcv, view);
                        if (tuxIconView3 != null) {
                            i = R.id.y0w;
                            FrameLayout frameLayout = (FrameLayout) C1616006Uk.LIZ(R.id.y0w, view);
                            if (frameLayout != null) {
                                return new C1615706Uh(constraintLayout2, tuxIconView, tuxIconView2, constraintLayout, tuxTextView, tuxIconView3, frameLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public C1615706Uh(ConstraintLayout constraintLayout, TuxIconView tuxIconView, TuxIconView tuxIconView2, ConstraintLayout constraintLayout2, TuxTextView tuxTextView, TuxIconView tuxIconView3, FrameLayout frameLayout) {
        this.LL = constraintLayout;
        this.LLILLJJLI = tuxIconView;
        this.LLILLL = tuxIconView2;
        this.LLILZ = constraintLayout2;
        this.LLILZIL = tuxTextView;
        this.LLILZLL = tuxIconView3;
        this.LLIZ = frameLayout;
    }
}
