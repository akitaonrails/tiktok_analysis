package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GeF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420490GeF {
    public static final void LIZ(View view, int i, Integer num) {
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.k1_);
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        }
        TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.k1_);
        if (tuxIconView2 != null) {
            tuxIconView2.setIconRes(i);
        }
        TuxIconView tuxIconView3 = (TuxIconView) view.findViewById(R.id.k1_);
        if (tuxIconView3 != null) {
            tuxIconView3.setTintColorRes(R.attr.a1h);
        }
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.xom);
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        if (num != null) {
            TextView textView = (TextView) view.findViewById(R.id.xom);
            if (textView != null) {
                textView.setText(num.intValue());
                return;
            }
            return;
        }
        TextView textView2 = (TextView) view.findViewById(R.id.xom);
        if (textView2 == null) {
            return;
        }
        textView2.setText("");
    }
}
