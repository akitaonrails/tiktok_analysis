package X;

import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.14np, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20373914np extends AbstractC960470b6L<C20373114nh> {
    public final InterfaceC20374014nq LL;

    public C20373914np(View view, InterfaceC20374014nq interfaceC20374014nq) {
        super(view);
        this.LL = interfaceC20374014nq;
        TextView textView = (TextView) view.findViewById(R.id.tv_title);
        C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.e_0, view.getContext());
        if (c20743516FdLIZLLL != null) {
            c20743516FdLIZLLL.setTint(C497740JfY.LIZLLL(R.attr.ezq, view.getContext()));
            c20743516FdLIZLLL.setBounds(0, 0, (int) C497740JfY.LIZIZ(14.0f), (int) C497740JfY.LIZIZ(14.0f));
        }
        textView.setCompoundDrawables(c20743516FdLIZLLL, null, null, null);
        textView.setCompoundDrawablePadding((int) C497740JfY.LIZIZ(4.0f));
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        C500260Jjc.LJLIIIL(500L, this.itemView, new AwS610S0100000_31(this, 527));
    }
}
