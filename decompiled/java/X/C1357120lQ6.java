package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lQ6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1357120lQ6 extends C0I7D {
    public C0QX8 LLIZ;

    @Override // X.C21410318qb, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        editorInfo.imeOptions &= -1073741825;
        return inputConnectionOnCreateInputConnection;
    }

    @Override // X.C21410318qb, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        C0QX8 c0qx8;
        if ((i == 16908322 || i == 16908337) && (c0qx8 = this.LLIZ) != null) {
            c0qx8.LIZ();
        }
        return super.onTextContextMenuItem(i);
    }

    public final void setOnPasteListener(C0QX8 c0qx8) {
        this.LLIZ = c0qx8;
    }

    public C1357120lQ6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.xv);
    }
}
