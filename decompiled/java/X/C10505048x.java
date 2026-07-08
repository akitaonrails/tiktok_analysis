package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.048x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10505048x extends TuxTextView {
    public static final /* synthetic */ int LLJJJJ = 0;

    public C10505048x(Context context) {
        super(context, null, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        setGravity(8388627);
        setTextAlignment(4);
        setEllipsize(TextUtils.TruncateAt.END);
        setMaxLines(1);
        setTuxFont(102);
        setMinTextSize(12.0f);
        setTextColorRes(R.attr.a0p);
    }

    public final void LJJJJJ(Integer num, Integer num2, boolean z, boolean z2) {
        int i;
        if (z2) {
            i = 2;
        } else {
            i = 1;
        }
        setMaxLines(i);
        if (z) {
            setTuxFont(82);
            if (num2 != null) {
                setTextColor(num2.intValue());
                num2.intValue();
                return;
            } else {
                setTextColorRes(R.attr.zl);
                return;
            }
        }
        setTuxFont(102);
        setMinTextSize(12.0f);
        if (num != null) {
            setTextColor(num.intValue());
            num.intValue();
        } else {
            setTextColorRes(R.attr.a0p);
        }
    }
}
