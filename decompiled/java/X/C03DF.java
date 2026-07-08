package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03DF, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03DF {
    public static View LIZ(Context context, String str) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        View view = new View(context);
        view.setBackground(context.getDrawable(R.drawable.cxi));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(view.getResources().getDimensionPixelOffset(R.dimen.ed), view.getResources().getDimensionPixelOffset(R.dimen.ea));
        layoutParams.setMarginStart(view.getResources().getDimensionPixelOffset(R.dimen.eb));
        layoutParams.topMargin = view.getResources().getDimensionPixelOffset(R.dimen.f595ec);
        C786410Ut5.W5(view, layoutParams);
        linearLayout.addView(view);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginStart(tuxTextView.getResources().getDimensionPixelOffset(R.dimen.ef));
        C786410Ut5.R6(tuxTextView, layoutParams2);
        tuxTextView.setTuxFont(41);
        tuxTextView.setTextColorRes(R.attr.a1h);
        tuxTextView.setText(str);
        linearLayout.addView(tuxTextView);
        linearLayout.setPadding(0, 0, 0, context.getResources().getDimensionPixelOffset(R.dimen.ee));
        return linearLayout;
    }
}
