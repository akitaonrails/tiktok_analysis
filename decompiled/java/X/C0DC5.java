package X;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DC5, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DC5 implements InterfaceC340040DUs {
    public final ConstraintLayout LL;
    public final TuxIconView LLILLJJLI;
    public final TextView LLILLL;
    public final View LLILZ;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public static C0DC5 LIZ(View view) {
        int i = R.id.l_a;
        TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.l_a, view);
        if (tuxIconView != null) {
            i = R.id.tv_title;
            TextView textView = (TextView) C1616006Uk.LIZ(R.id.tv_title, view);
            if (textView != null) {
                i = R.id.v_divider;
                View viewLIZ = C1616006Uk.LIZ(R.id.v_divider, view);
                if (viewLIZ != null) {
                    return new C0DC5((ConstraintLayout) view, tuxIconView, textView, viewLIZ);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public C0DC5(ConstraintLayout constraintLayout, TuxIconView tuxIconView, TextView textView, View view) {
        this.LL = constraintLayout;
        this.LLILLJJLI = tuxIconView;
        this.LLILLL = textView;
        this.LLILZ = view;
    }
}
