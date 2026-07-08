package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GeN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420570GeN extends LinearLayout implements C0T8B {
    public final C16F5 LL;

    @Override // X.C0T8B
    public final boolean h() {
        return true;
    }

    public final void setText(String str) {
        this.LL.setText(str);
    }

    public C420570GeN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setGravity(16);
        C16F5 c16f5 = new C16F5(context, null);
        this.LL = c16f5;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (C497740JfY.LJJ()) {
            layoutParams.rightMargin = (int) C497740JfY.LIZIZ(12);
        } else {
            layoutParams.leftMargin = (int) C497740JfY.LIZIZ(12);
        }
        c16f5.setTextSize(14.0f);
        c16f5.setSingleLine();
        c16f5.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        c16f5.setMarqueeRepeatLimit(-1);
        c16f5.setFocusable(true);
        c16f5.setFocusableInTouchMode(true);
        c16f5.setTypeface(C1119920fFW.LIZJ(c16f5.getTextSize(), 500, context));
        c16f5.setTextColor(getResources().getColor(R.color.f569bc));
        c16f5.setText(context.getResources().getString(2131841865));
        addView(c16f5, layoutParams);
    }
}
