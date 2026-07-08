package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* JADX INFO: renamed from: X.0F90, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F90 extends C0I7D {
    public View.OnKeyListener LLIZ;
    public InterfaceC384650F6h LLIZLLLIL;

    @Override // X.C21410318qb, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        final InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        return new InputConnectionWrapper(inputConnectionOnCreateInputConnection) { // from class: X.0FLs
            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean sendKeyEvent(KeyEvent keyEvent) {
                C0F90 c0f90 = this.LIZ;
                View.OnKeyListener onKeyListener = c0f90.LLIZ;
                if (onKeyListener != null && onKeyListener.onKey(c0f90, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                return super.sendKeyEvent(keyEvent);
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean deleteSurroundingText(int i, int i2) {
                if (i == 1 && i2 == 0) {
                    if (sendKeyEvent(new KeyEvent(0, 67)) && sendKeyEvent(new KeyEvent(1, 67))) {
                        return true;
                    }
                    return false;
                }
                return super.deleteSurroundingText(i, i2);
            }
        };
    }

    public final void setOnSelectionChangedListener(InterfaceC384650F6h interfaceC384650F6h) {
        this.LLIZLLLIL = interfaceC384650F6h;
    }

    public final void setSoftKeyListener(View.OnKeyListener onKeyListener) {
        this.LLIZ = onKeyListener;
    }

    public C0F90(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        InterfaceC384650F6h interfaceC384650F6h = this.LLIZLLLIL;
        if (interfaceC384650F6h != null) {
            interfaceC384650F6h.LIZ(i);
        }
    }
}
