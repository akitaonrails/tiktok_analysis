package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ueS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1711980ueS extends LinearLayout {
    public final TuxTextView LL;
    public final View LLILLJJLI;
    public final TuxTextView LLILLL;
    public final View LLILZ;

    public C1711980ueS(Context context) {
        super(context, null, 0);
        setOrientation(1);
        C426750GoL.LJIIL(this, Integer.valueOf(C1722120uuo.LIZJ(16)), 0, Integer.valueOf(C1722120uuo.LIZJ(16)), 0, 16);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, C1722120uuo.LIZJ(32), 0, C1722120uuo.LIZJ(18));
        C786410Ut5.R6(tuxTextView, layoutParams);
        tuxTextView.setGravity(8388611);
        tuxTextView.setTuxFont(42);
        tuxTextView.setTextColorRes(R.attr.a1h);
        this.LL = tuxTextView;
        addView(tuxTextView);
        View view = new View(context);
        C786410Ut5.W5(view, new LinearLayout.LayoutParams(-1, C1722120uuo.LIZJ(1)));
        view.setBackgroundColor(C1712770ufj.LIZ(R.attr.a02, context));
        this.LLILLJJLI = view;
        addView(view);
        TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams2.setMargins(0, C1722120uuo.LIZJ(17), 0, C1722120uuo.LIZJ(17));
        C786410Ut5.R6(tuxTextView2, layoutParams2);
        tuxTextView2.setGravity(8388611);
        tuxTextView2.setTuxFont(41);
        tuxTextView2.setTextColorRes(R.attr.a1h);
        this.LLILLL = tuxTextView2;
        addView(tuxTextView2);
        View view2 = new View(context);
        C786410Ut5.W5(view2, new LinearLayout.LayoutParams(-1, C1722120uuo.LIZJ(1)));
        view2.setBackgroundColor(C1712770ufj.LIZ(R.attr.a02, context));
        this.LLILZ = view2;
        addView(view2);
    }
}
