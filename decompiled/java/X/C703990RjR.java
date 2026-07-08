package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.flexbox.FlexboxLayout$LayoutParams;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0RjR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703990RjR {
    public static View LIZ(Context context, boolean z) {
        if (z) {
            View view = new View(context);
            C786410Ut5.LJLLLLLL(8, view);
            view.setId(R.id.eks);
            int i = ConstraintSizeVM.LLIZ;
            C786410Ut5.W5(view, new FlexboxLayout$LayoutParams(i, i));
            return view;
        }
        TuxTextView tuxTextView = new TuxTextView(new ContextThemeWrapper(context, R.style.y0), null, 6, 0);
        tuxTextView.setText(" · ");
        C786410Ut5.LLLLZLL(tuxTextView, 8);
        tuxTextView.setId(R.id.eks);
        tuxTextView.setTuxFont(82);
        Integer numLJFF = C0SXP.LJFF();
        if (numLJFF != null) {
            tuxTextView.setTuxFont(numLJFF.intValue());
        }
        tuxTextView.setTextColorRes(R.attr.a1k);
        Integer numLJ = C0SXP.LJ(context);
        if (numLJ != null) {
            tuxTextView.setTextColor(numLJ.intValue());
        }
        C786410Ut5.R6(tuxTextView, new FlexboxLayout$LayoutParams(-2, -2));
        C0H9H.LIZJ(ConstraintSizeVM.LLIZ, tuxTextView);
        return tuxTextView;
    }
}
