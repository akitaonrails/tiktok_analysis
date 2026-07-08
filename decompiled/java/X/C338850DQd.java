package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: renamed from: X.0DQd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C338850DQd extends RecyclerView.ViewHolder {
    public final C01GW LL;

    public final View I5() {
        return (View) this.LL.getValue();
    }

    public C338850DQd(View view, boolean z) {
        int marginStart;
        int marginEnd;
        int marginStart2;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super(view);
        this.LL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS548S0100000_4(view, 530));
        if (z) {
            if (I5().getLayoutParams() instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) I5().getLayoutParams();
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(18.0f)));
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(18.0f)));
            }
            View viewI5 = I5();
            ViewGroup.LayoutParams layoutParams2 = I5().getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginStart = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart();
            } else {
                marginStart = 0;
            }
            Integer numValueOf = Integer.valueOf(marginStart);
            Integer numValueOf2 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(13.0f))));
            ViewGroup.LayoutParams layoutParams3 = I5().getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd();
            } else {
                marginEnd = 0;
            }
            C426750GoL.LJIIIZ(viewI5, numValueOf, numValueOf2, Integer.valueOf(marginEnd), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(13.0f)))), false, 16);
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                marginStart2 = ((ViewGroup.MarginLayoutParams) layoutParams4).getMarginStart();
            } else {
                marginStart2 = 0;
            }
            Integer numValueOf3 = Integer.valueOf(marginStart2);
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            if ((layoutParams5 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams5) != null) {
                i = marginLayoutParams.topMargin;
            } else {
                i = 0;
            }
            Integer numValueOf4 = Integer.valueOf(i);
            ViewGroup.LayoutParams layoutParams6 = view.getLayoutParams();
            C426750GoL.LJIIIZ(view, numValueOf3, numValueOf4, Integer.valueOf(layoutParams6 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams6).getMarginEnd() : 0), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(12.0f)))), false, 16);
        }
    }
}
