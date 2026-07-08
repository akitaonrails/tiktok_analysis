package X;

import Y.ACListenerS111S0200000_7;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0K2b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C510950K2b extends C0K3V {
    public final View LL;
    public final TextView LLILLJJLI;
    public final ViewGroup LLILLL;

    public C510950K2b(View view) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = (TextView) view.findViewById(R.id.rsd);
        this.LLILLL = (ViewGroup) view.findViewById(R.id.wi4);
    }

    @Override // X.C0K3V
    public final void I5(AbstractC511160K2w abstractC511160K2w, InterfaceC2753014t interfaceC2753014t) {
        C511140K2u c511140K2u;
        String str = null;
        if (!(abstractC511160K2w instanceof C511140K2u) || (c511140K2u = (C511140K2u) abstractC511160K2w) == null || !(interfaceC2753014t instanceof C511370K3r)) {
            return;
        }
        TextView textView = this.LLILLJJLI;
        if (textView != null) {
            String strLJII = c511140K2u.LIZ.previewTextIndicator;
            if (strLJII != null) {
                if (strLJII.length() == 0) {
                    strLJII = C511520K4g.LJII(2131849261);
                }
                str = strLJII;
            }
            textView.setText(str);
        }
        ViewGroup viewGroup = this.LLILLL;
        if (viewGroup != null) {
            viewGroup.setBackground(C510570K0p.LIZ((int) C511520K4g.LIZ(8.0f), C426930God.LIZ(R.attr.fa6, this.LL.getContext()), 0, (int) C511520K4g.LIZ(0.0f)));
        }
        ViewGroup viewGroup2 = this.LLILLL;
        if (viewGroup2 != null) {
            C786410Ut5.K7(viewGroup2, new ACListenerS111S0200000_7(interfaceC2753014t, this, 43));
        }
    }
}
