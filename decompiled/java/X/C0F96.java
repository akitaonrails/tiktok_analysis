package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;

/* JADX INFO: renamed from: X.0F96, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F96 extends C0I7D {
    public C0F96(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent != null && keyEvent.getAction() == 1) {
            clearFocus();
            return false;
        }
        return super.onKeyPreIme(i, keyEvent);
    }
}
