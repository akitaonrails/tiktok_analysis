package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FL4, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0FL4 extends C0I7D {
    public C0F9G LLIZ;
    public C0F9G LLIZLLLIL;
    public boolean LLJ;

    public final C0F9G getEditListener() {
        C0F9G c0f9g = this.LLIZLLLIL;
        return c0f9g == null ? this.LLIZ : c0f9g;
    }

    @Override // X.C21410318qb, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        final InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection == null) {
            return null;
        }
        return new InputConnectionWrapper(inputConnectionOnCreateInputConnection, this) { // from class: X.0FLp
            public final /* synthetic */ InputConnection LIZ;
            public final /* synthetic */ C0FL4 LIZIZ;

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean sendKeyEvent(KeyEvent keyEvent) {
                InputConnection inputConnectionLIZIZ;
                if (this.LIZIZ.getEditListener() == null) {
                    return super.sendKeyEvent(keyEvent);
                }
                C0F9G editListener = this.LIZIZ.getEditListener();
                if (editListener != null && (inputConnectionLIZIZ = editListener.LIZIZ(this.LIZ)) != null) {
                    return inputConnectionLIZIZ.sendKeyEvent(keyEvent);
                }
                return super.sendKeyEvent(keyEvent);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(inputConnectionOnCreateInputConnection, true);
                this.LIZ = inputConnectionOnCreateInputConnection;
                this.LIZIZ = this;
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean commitText(CharSequence charSequence, int i) {
                try {
                    return super.commitText(charSequence, i);
                } catch (NullPointerException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return true;
                }
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean deleteSurroundingText(int i, int i2) {
                InputConnection inputConnectionLIZIZ;
                if (this.LIZIZ.getEditListener() == null) {
                    return super.deleteSurroundingText(i, i2);
                }
                C0F9G editListener = this.LIZIZ.getEditListener();
                if (editListener != null && (inputConnectionLIZIZ = editListener.LIZIZ(this.LIZ)) != null) {
                    return inputConnectionLIZIZ.deleteSurroundingText(i, i2);
                }
                return super.deleteSurroundingText(i, i2);
            }
        };
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.LLJ) {
            setCursorVisible(false);
        }
        return zOnTouchEvent;
    }

    @Override // android.widget.TextView
    public void setCursorVisible(boolean z) {
        this.LLJ = z;
        super.setCursorVisible(z);
    }

    public final void setEditTextListener(C0F9G c0f9g) {
        this.LLIZLLLIL = c0f9g;
    }

    public final void setTextMentionListener(C0F9G c0f9g) {
        this.LLIZ = c0f9g;
    }

    public C0FL4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.xv);
        this.LLJ = true;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        C0F9G editListener = getEditListener();
        if (editListener != null) {
            editListener.LIZ(i, i2);
        }
    }
}
