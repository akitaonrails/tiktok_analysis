package X;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.0ZIJ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public class C0ZIJ extends C0I7D {
    public C0ZIJ(Context context) {
        super(context, null, 6, 0);
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(TextWatcher textWatcher) {
        super.addTextChangedListener(textWatcher);
    }

    @Override // android.widget.EditText
    public void setSelection(int i) {
        super.setSelection(i);
    }

    public C0ZIJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
    }

    @Override // android.widget.EditText
    public final void setSelection(int i, int i2) {
        super.setSelection(i, i2);
    }
}
