package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gc2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C419120Gc2 extends LinearLayout {
    public final TuxTextView LL;
    public C1765700w36 LLILLJJLI;
    public int LLILLL;
    public final int LLILZ;

    public final void setCountDownInfo(String str) {
        CharSequence text;
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            text = tuxTextView.getText();
        } else {
            text = null;
        }
        if (!Intrinsics.LJFF(str, text)) {
            TuxTextView tuxTextView2 = this.LL;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(str);
            }
            TuxTextView tuxTextView3 = this.LL;
            if (tuxTextView3 != null) {
                tuxTextView3.setTextColorRes(R.attr.a1q);
            }
        }
    }

    public C419120Gc2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZ = 72;
        setOrientation(0);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTextAlignment(5);
        tuxTextView.setTuxFont(72);
        tuxTextView.setTextColorRes(R.attr.a1q);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(1);
        tuxTextView.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130)));
        this.LL = tuxTextView;
        addView(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
    }
}
