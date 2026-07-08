package X;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: renamed from: X.0DUF, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DUF extends LinearLayout {
    public final AppCompatTextView LL;

    public final void setTextColor(int i) {
        this.LL.setTextColor(i);
    }

    public final void setTextSize(float f) {
        this.LL.setTextSize(f);
    }

    public C0DUF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(appCompatTextView);
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setGravity(17);
        appCompatTextView.setIncludeFontPadding(false);
        appCompatTextView.setText("00:00:00");
        appCompatTextView.setTypeface(Typeface.MONOSPACE);
        this.LL = appCompatTextView;
        setOrientation(0);
        setGravity(16);
        setLayoutDirection(0);
        addView(appCompatTextView);
        setPadding(0, 0, 0, 0);
    }
}
