package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0mTN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1397590mTN extends FrameLayout {
    public C1397590mTN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.xt);
        if (isInEditMode()) {
            C1397570mTL c1397570mTL = new C1397570mTL(context);
            c1397570mTL.LIZLLL = "I'm a title.";
            c1397570mTL.LJ = "I'm some message";
            addView(c1397570mTL.LIZIZ());
        }
    }
}
