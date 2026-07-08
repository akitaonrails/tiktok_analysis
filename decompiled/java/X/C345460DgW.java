package X;

import android.text.TextUtils;
import android.view.ViewTreeObserver;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0DgW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C345460DgW {
    public static void LIZ(final TuxTextView tuxTextView) {
        final CharSequence text = tuxTextView.getText();
        final int i = 1;
        final int i2 = 999;
        C786410Ut5.x3(tuxTextView.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0DgV
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                int paddingLeft = tuxTextView.getPaddingLeft();
                int paddingRight = tuxTextView.getPaddingRight();
                if (TextUtils.ellipsize(text, tuxTextView.getPaint(), ((tuxTextView.getWidth() - paddingLeft) - paddingRight) * tuxTextView.getMaxLines(), TextUtils.TruncateAt.END).length() < text.length()) {
                    tuxTextView.getLayoutParams().height = tuxTextView.getHeight();
                    tuxTextView.setMaxLines(999);
                    C21382118m3.LIZIZ(tuxTextView, i, i2, 1, 0);
                }
                C786410Ut5.C3(tuxTextView.getViewTreeObserver(), this);
            }
        });
    }
}
