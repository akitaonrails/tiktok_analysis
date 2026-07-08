package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: renamed from: X.0DQg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C338880DQg {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, TextView textView, String str2, final TextView textView2, View view, InterfaceC1631630sYr interfaceC1631630sYr) {
        textView.setText(str);
        if (C041J.LIZ(str2)) {
            C337180DJs.LIZJ(textView2);
            C337180DJs.LIZJ(view);
            textView2.setText(str2);
            textView2.measure(0, 0);
            textView.measure(0, 0);
            view.measure(0, 0);
            int measuredWidth = textView2.getMeasuredWidth();
            int measuredWidth2 = textView.getMeasuredWidth();
            int measuredWidth3 = view.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = -2;
            C786410Ut5.W5(textView, layoutParams);
            ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
            layoutParams2.width = -2;
            C786410Ut5.W5(textView2, layoutParams2);
            final C338860DQe c338860DQe = new C338860DQe(textView2, measuredWidth3, view, measuredWidth2, measuredWidth, textView, interfaceC1631630sYr);
            ((View) textView2.getParent()).addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0DQf
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    ((View) textView2.getParent()).removeOnLayoutChangeListener(this);
                    c338860DQe.invoke();
                }
            });
            return;
        }
        C337180DJs.LIZ(view);
        C337180DJs.LIZ(textView2);
        ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
        layoutParams3.width = -2;
        C786410Ut5.W5(textView, layoutParams3);
        textView.measure(0, 0);
        int measuredWidth4 = textView.getMeasuredWidth();
        if (interfaceC1631630sYr == null) {
            return;
        }
        interfaceC1631630sYr.invoke(Integer.valueOf(measuredWidth4), 0, Integer.valueOf(measuredWidth4), 0);
    }
}
