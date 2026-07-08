package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GeL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420550GeL extends LinearLayout implements C0T8B {
    @Override // X.C0T8B
    public final boolean h() {
        return false;
    }

    public C420550GeL(Context context, AttributeSet attributeSet) {
        Integer numLIZJ;
        super(context, attributeSet);
        setGravity(16);
        C16F5 c16f5 = new C16F5(context, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (C497740JfY.LJJ()) {
            layoutParams.rightMargin = (int) C497740JfY.LIZIZ(12);
        } else {
            layoutParams.leftMargin = (int) C497740JfY.LIZIZ(12);
        }
        c16f5.setTextSize(14.0f);
        c16f5.setSingleLine();
        c16f5.setTypeface(C1119920fFW.LIZJ(c16f5.getTextSize(), 500, context));
        Context context2 = c16f5.getContext();
        if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.ee, context2)) != null) {
            c16f5.setTextColor(numLIZJ.intValue());
        }
        c16f5.setText(context.getResources().getString(2131841051));
        addView(c16f5, layoutParams);
    }
}
