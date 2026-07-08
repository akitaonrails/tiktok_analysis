package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.03E3, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03E3 extends FrameLayout {
    public final TuxTextView LL;

    public C03E3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        C786410Ut5.R6(tuxTextView, new FrameLayout.LayoutParams(-2, -2));
        tuxTextView.setGravity(16);
        int iLIZIZ = (int) C418440Gaw.LIZIZ(4);
        int iLIZIZ2 = (int) C418440Gaw.LIZIZ(2);
        tuxTextView.setPadding(iLIZIZ, iLIZIZ2, iLIZIZ, iLIZIZ2);
        this.LL = tuxTextView;
        addView(tuxTextView);
    }
}
