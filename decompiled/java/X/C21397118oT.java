package X;

import android.text.Spannable;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* JADX INFO: renamed from: X.18oT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21397118oT extends InputConnectionWrapper {
    public InterfaceC21397318oV LIZ;

    public C21397118oT() {
        super(null, true);
    }

    public static boolean LIZIZ(Spannable spannable) {
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(spannable);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(spannable);
        if (composingSpanStart != -1 && composingSpanEnd != -1) {
            return true;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        InterfaceC21397318oV interfaceC21397318oV;
        if (keyEvent.getKeyCode() == 67 && keyEvent.getAction() == 0 && (interfaceC21397318oV = this.LIZ) != null && interfaceC21397318oV.LIZ()) {
            return true;
        }
        return super.sendKeyEvent(keyEvent);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        return super.commitText(charSequence, i);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        InterfaceC21397318oV interfaceC21397318oV;
        if (i == 1 && i2 == 0 && (interfaceC21397318oV = this.LIZ) != null && interfaceC21397318oV.LIZ()) {
            return true;
        }
        return super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        return super.setComposingRegion(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        return super.setComposingText(charSequence, i);
    }
}
