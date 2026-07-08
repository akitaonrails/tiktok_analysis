package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0GdX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420050GdX {
    public View LIZ;

    public final View LIZIZ(Context context) {
        View view;
        View view2 = this.LIZ;
        if (view2 != null) {
            return view2;
        }
        if (C424430Gkb.LIZ()) {
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            C786410Ut5.R6(tuxTextView, layoutParams);
            tuxTextView.LJJJJI(19.0f);
            view = tuxTextView;
        } else {
            TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
            int i = C1358650lSZ.LLJI;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i);
            layoutParams2.gravity = 17;
            C786410Ut5.M6(tuxIconView, layoutParams2);
            view = tuxIconView;
        }
        this.LIZ = view;
        return view;
    }

    public final void LIZ(Integer num, String str) {
        TextView textView;
        TuxIconView tuxIconView;
        View view = this.LIZ;
        if ((view instanceof TuxIconView) && (tuxIconView = (TuxIconView) view) != null && num != null) {
            tuxIconView.setIconRes(num.intValue());
        }
        View view2 = this.LIZ;
        if ((view2 instanceof TuxTextView) && (textView = (TextView) view2) != null) {
            textView.setText(str);
        }
    }
}
