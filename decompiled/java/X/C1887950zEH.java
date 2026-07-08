package X;

import Y.ACListenerS92S0300000_28;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.flexbox.FlexboxLayout$LayoutParams;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0zEH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1887950zEH extends AbstractC960470b6L<C1868310yib> {
    public final InterfaceC1868340yie LL;

    public final void L5(C1868310yib c1868310yib) {
        int i;
        int i2;
        ViewGroup viewGroup = (ViewGroup) this.itemView;
        viewGroup.setPadding((int) C497740JfY.LIZIZ(16.0f), 0, (int) C497740JfY.LIZIZ(16.0f), (int) C497740JfY.LIZIZ(4.0f));
        C786410Ut5.LJJJJI(viewGroup);
        ArrayList<C1868300yia> arrayList = new ArrayList(c1868310yib.LIZIZ);
        ListProtector.add(arrayList, 0, c1868310yib.LIZ);
        for (C1868300yia c1868300yia : arrayList) {
            TextView textView = new TextView(viewGroup.getContext());
            FlexboxLayout$LayoutParams flexboxLayout$LayoutParams = new FlexboxLayout$LayoutParams(-2, -2);
            ((ViewGroup.MarginLayoutParams) flexboxLayout$LayoutParams).rightMargin = (int) C497740JfY.LIZIZ(8.0f);
            ((ViewGroup.MarginLayoutParams) flexboxLayout$LayoutParams).bottomMargin = (int) C497740JfY.LIZIZ(8.0f);
            C786410Ut5.g6(textView, flexboxLayout$LayoutParams);
            textView.setGravity(17);
            textView.setPadding((int) C497740JfY.LIZIZ(4.0f), (int) C497740JfY.LIZIZ(2.0f), (int) C497740JfY.LIZIZ(4.0f), (int) C497740JfY.LIZIZ(2.0f));
            C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.eny, textView.getContext());
            if (c20743516FdLIZLLL != null) {
                c20743516FdLIZLLL.setBounds(0, 0, (int) C497740JfY.LIZIZ(12.0f), (int) C497740JfY.LIZIZ(12.0f));
            }
            int i3 = R.attr.c9j;
            int i4 = R.attr.c95;
            if (c20743516FdLIZLLL != null) {
                Context context = textView.getContext();
                if (c1868300yia.LIZJ) {
                    i2 = R.attr.c9j;
                } else {
                    i2 = R.attr.c95;
                }
                c20743516FdLIZLLL.setTint(C497740JfY.LIZLLL(i2, context));
            }
            textView.setCompoundDrawables(null, null, c20743516FdLIZLLL, null);
            textView.setCompoundDrawablePadding((int) C497740JfY.LIZIZ(2.0f));
            C786410Ut5.T7(textView, new ACListenerS92S0300000_28(c1868300yia, this, c1868310yib, 12));
            textView.setText(c1868300yia.LIZIZ);
            Context context2 = viewGroup.getContext();
            if (!c1868300yia.LIZJ) {
                i4 = R.attr.c63;
            }
            textView.setBackgroundColor(C497740JfY.LIZLLL(i4, context2));
            if (c1868300yia.LIZJ) {
                i = R.drawable.f8a;
            } else {
                i = R.drawable.f8b;
            }
            C439101nJ.LIZLLL(i, textView);
            Context context3 = viewGroup.getContext();
            if (!c1868300yia.LIZJ) {
                i3 = R.attr.ewy;
            }
            textView.setTextColor(C497740JfY.LIZLLL(i3, context3));
            viewGroup.addView(textView);
        }
    }

    public C1887950zEH(C21532619Oq c21532619Oq, InterfaceC1868340yie interfaceC1868340yie) {
        super(c21532619Oq);
        this.LL = interfaceC1868340yie;
    }

    @Override // X.AbstractC960470b6L
    public final /* bridge */ /* synthetic */ void I5(int i, Object obj) {
        L5((C1868310yib) obj);
    }
}
