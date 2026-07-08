package X;

import android.content.Context;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ub7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1709910ub7 extends LinearLayout {
    public final TuxTextView LL;
    public final LinearLayout LLILLJJLI;

    public C1709910ub7(Context context) {
        super(context, null, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTuxFont(62);
        tuxTextView.setTextColorRes(R.attr.a1h);
        this.LL = tuxTextView;
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        this.LLILLJJLI = linearLayout2;
        setOrientation(1);
        setPadding(C1722120uuo.LIZJ(12), C1722120uuo.LIZJ(8), C1722120uuo.LIZJ(12), C1722120uuo.LIZJ(8));
        addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(tuxTextView, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
    }
}
