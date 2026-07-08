package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03BJ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03BJ extends LinearLayout {
    public C03BJ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void setBeginningChildViewsInvisible(int i) {
        int i2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (i3 <= i - 1) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            C786410Ut5.LJLLLLLL(i2, childAt);
        }
    }

    public C03BJ(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), 0, 0);
        int i2 = 0;
        do {
            addView(C786410Ut5.Td(C786410Ut5.ne(context), R.layout.i7t, this, false));
            i2++;
        } while (i2 < 6);
    }
}
