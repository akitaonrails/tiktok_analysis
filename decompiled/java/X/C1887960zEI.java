package X;

import Y.ACListenerS130S0200000_28;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout$LayoutParams;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0zEI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1887960zEI extends AbstractC960470b6L<C00US> {
    public final InterfaceC1878990yzp LL;

    public final void L5(C00US c00us) {
        int i;
        int i2;
        ViewGroup viewGroup = (ViewGroup) this.itemView;
        viewGroup.setPadding((int) C497740JfY.LIZIZ(16.0f), 0, 0, (int) C497740JfY.LIZIZ(4.0f));
        C786410Ut5.LJJJJI(viewGroup);
        for (C1868320yic c1868320yic : c00us.LIZ) {
            TextView textView = new TextView(viewGroup.getContext());
            FlexboxLayout$LayoutParams flexboxLayout$LayoutParams = new FlexboxLayout$LayoutParams(-2, -2);
            ((ViewGroup.MarginLayoutParams) flexboxLayout$LayoutParams).rightMargin = (int) C497740JfY.LIZIZ(12.0f);
            ((ViewGroup.MarginLayoutParams) flexboxLayout$LayoutParams).bottomMargin = (int) C497740JfY.LIZIZ(12.0f);
            C786410Ut5.g6(textView, flexboxLayout$LayoutParams);
            textView.setGravity(17);
            textView.setPadding((int) C497740JfY.LIZIZ(20.0f), (int) C497740JfY.LIZIZ(10.0f), (int) C497740JfY.LIZIZ(20.0f), (int) C497740JfY.LIZIZ(10.0f));
            C786410Ut5.T7(textView, new ACListenerS130S0200000_28(c1868320yic, this, 71));
            textView.setText(c1868320yic.LIZIZ);
            textView.setSelected(c1868320yic.LIZLLL);
            textView.setEnabled(c1868320yic.LJ);
            boolean z = c1868320yic.LIZLLL;
            int i3 = R.attr.c9j;
            if (z) {
                C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.ejp, viewGroup.getContext());
                if (c20743516FdLIZLLL != null) {
                    c20743516FdLIZLLL.setBounds(0, 0, (int) C497740JfY.LIZIZ(16.0f), (int) C497740JfY.LIZIZ(16.0f));
                    Context context = viewGroup.getContext();
                    if (c1868320yic.LIZJ) {
                        i2 = R.attr.c9j;
                    } else {
                        i2 = R.attr.c95;
                    }
                    c20743516FdLIZLLL.setTint(C497740JfY.LIZLLL(i2, context));
                }
                textView.setCompoundDrawables(c20743516FdLIZLLL, null, null, null);
                textView.setCompoundDrawablePadding((int) C497740JfY.LIZIZ(8.0f));
            }
            if (c1868320yic.LIZLLL && c1868320yic.LIZJ) {
                i = R.drawable.f7z;
            } else {
                i = R.drawable.f80;
            }
            C439101nJ.LIZLLL(i, textView);
            Context context2 = viewGroup.getContext();
            if (!c1868320yic.LIZLLL || !c1868320yic.LIZJ) {
                if (!c1868320yic.LJ) {
                    i3 = R.attr.ewz;
                } else {
                    i3 = R.attr.ewy;
                }
            }
            textView.setTextColor(C497740JfY.LIZLLL(i3, context2));
            viewGroup.addView(textView);
        }
    }

    public C1887960zEI(C21532619Oq c21532619Oq, InterfaceC1878990yzp interfaceC1878990yzp) {
        super(c21532619Oq);
        this.LL = interfaceC1878990yzp;
    }

    @Override // X.AbstractC960470b6L
    public final /* bridge */ /* synthetic */ void I5(int i, Object obj) {
        L5((C00US) obj);
    }
}
