package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0H8d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C436090H8d implements InterfaceC340040DUs {
    public final ConstraintLayout LL;
    public final TuxIconView LLILLJJLI;
    public final C197039127h LLILLL;
    public final TuxIconView LLILZ;
    public final ConstraintLayout LLILZIL;
    public final TuxTextView LLILZLL;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public static C436090H8d LIZ(View view) {
        int i = R.id.e2k;
        TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.e2k, view);
        if (tuxIconView != null) {
            i = R.id.j3f;
            C197039127h c197039127h = (C197039127h) C1616006Uk.LIZ(R.id.j3f, view);
            if (c197039127h != null) {
                i = R.id.mk3;
                TuxIconView tuxIconView2 = (TuxIconView) C1616006Uk.LIZ(R.id.mk3, view);
                if (tuxIconView2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i = R.id.xzd;
                    TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.xzd, view);
                    if (tuxTextView != null) {
                        return new C436090H8d(constraintLayout, tuxIconView, c197039127h, tuxIconView2, constraintLayout, tuxTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public C436090H8d(ConstraintLayout constraintLayout, TuxIconView tuxIconView, C197039127h c197039127h, TuxIconView tuxIconView2, ConstraintLayout constraintLayout2, TuxTextView tuxTextView) {
        this.LL = constraintLayout;
        this.LLILLJJLI = tuxIconView;
        this.LLILLL = c197039127h;
        this.LLILZ = tuxIconView2;
        this.LLILZIL = constraintLayout2;
        this.LLILZLL = tuxTextView;
    }
}
