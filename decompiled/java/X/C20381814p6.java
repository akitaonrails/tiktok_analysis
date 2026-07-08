package X;

import Y.ACListenerS165S0100000_31;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.14p6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20381814p6 extends AbstractC960470b6L<C094800Xi> {
    public final InterfaceC20381914p7 LL;
    public final TextView LLILLJJLI;

    public C20381814p6(View view, InterfaceC20381914p7 interfaceC20381914p7) {
        super(view);
        this.LL = interfaceC20381914p7;
        TextView textView = (TextView) view.findViewById(R.id.tv_title);
        this.LLILLJJLI = textView;
        C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.ctc, view.getContext());
        if (c20743516FdLIZLLL != null) {
            c20743516FdLIZLLL.setBounds(0, 0, (int) C497740JfY.LIZIZ(16.0f), (int) C497740JfY.LIZIZ(16.0f));
        }
        textView.setCompoundDrawables(c20743516FdLIZLLL, null, null, null);
        textView.setCompoundDrawablePadding((int) C497740JfY.LIZIZ(4.0f));
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        this.LLILLJJLI.setText(((C094800Xi) obj).LIZ);
        C786410Ut5.I7(new ACListenerS165S0100000_31(this, 194), this.itemView);
    }
}
