package X;

import android.os.Build;
import android.text.Editable;
import android.text.style.UnderlineSpan;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.0FLr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C388650FLr extends InputConnectionWrapper {
    public final EditText LIZ;
    public final List<C0FLJ> LIZIZ;
    public boolean LIZJ;
    public C0FLJ LIZLLL;

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        int i;
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67) {
            int selectionStart = this.LIZ.getSelectionStart();
            C0FLJ c0fljLIZ = C0FLI.LIZ(selectionStart, this.LIZ.getSelectionEnd(), this.LIZIZ);
            if (c0fljLIZ == null) {
                this.LIZJ = false;
                return super.sendKeyEvent(keyEvent);
            }
            if (!this.LIZJ && selectionStart != (i = c0fljLIZ.LIZ)) {
                this.LIZJ = true;
                this.LIZLLL = c0fljLIZ;
                if (Build.VERSION.SDK_INT >= 25) {
                    setSelection(i, c0fljLIZ.LIZIZ);
                    return true;
                }
                setSelection(c0fljLIZ.LIZIZ, i);
                return true;
            }
            this.LIZJ = false;
            return super.sendKeyEvent(keyEvent);
        }
        return super.sendKeyEvent(keyEvent);
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
    public final boolean deleteSurroundingText(int i, int i2) throws Throwable {
        UnderlineSpan[] underlineSpanArr;
        if (i == 1) {
            if (i2 == 0) {
                Editable editableLLJILLL = C2204961BRm.LLJILLL(this.LIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSULBhVsNGlUIe7S2inHHxEOLHZohrBy81LkbjKYUcfF3b18wpw=", null));
                if (editableLLJILLL != null && editableLLJILLL.length() != 0) {
                    int length = editableLLJILLL.length();
                    int selectionStart = this.LIZ.getSelectionStart() - i;
                    if (selectionStart < 0) {
                        selectionStart = 0;
                    }
                    int selectionEnd = this.LIZ.getSelectionEnd();
                    if (selectionEnd > length) {
                        selectionEnd = length;
                    }
                    C089E c089e = new C089E(editableLLJILLL.getSpans(0, length, UnderlineSpan.class));
                    int i3 = selectionEnd;
                    boolean z = false;
                    boolean z2 = false;
                    int i4 = selectionStart;
                    while (c089e.hasNext()) {
                        Object next = c089e.next();
                        int spanStart = editableLLJILLL.getSpanStart(next);
                        int spanEnd = editableLLJILLL.getSpanEnd(next);
                        if (!z && spanStart <= selectionStart && spanEnd > selectionStart) {
                            i4 = spanStart - 1;
                            z = true;
                        }
                        if (!z2 && spanStart < selectionEnd && spanEnd >= selectionEnd) {
                            z2 = true;
                            i3 = spanEnd;
                        }
                        if (z && z2) {
                            break;
                        }
                    }
                    if (i4 > i3) {
                        int i5 = i3;
                        i3 = i4;
                        i4 = i5;
                    }
                    C0FLJ c0fljLIZ = C0FLI.LIZ(i4, i3, this.LIZIZ);
                    if (c0fljLIZ != null && (underlineSpanArr = (UnderlineSpan[]) editableLLJILLL.getSpans(c0fljLIZ.LIZ, c0fljLIZ.LIZIZ, UnderlineSpan.class)) != null && underlineSpanArr.length != 0) {
                        if (sendKeyEvent(new KeyEvent(0, 67)) && sendKeyEvent(new KeyEvent(1, 67))) {
                            return true;
                        }
                        return false;
                    }
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    editableLLJILLL.delete(i4, i3);
                }
                return false;
            }
        } else if (i < 0) {
            int i6 = -i2;
            i2 = -i;
            i = i6;
        }
        return super.deleteSurroundingText(i, i2);
    }

    public C388650FLr(InputConnection inputConnection, C21410318qb c21410318qb, List list) {
        super(inputConnection, true);
        this.LIZ = c21410318qb;
        this.LIZIZ = list;
    }
}
