package X;

import Y.AComparatorS513S0100000_14;
import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.widgets.MentionSpan;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0lNF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1355350lNF extends C0I7D {
    public InterfaceC1355360lNG LLIZ;

    @Override // X.C21410318qb, android.widget.EditText, android.widget.TextView
    public Editable getText() {
        Editable text;
        Object obj;
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt4+4MaryORY/Y+wckeQUgHJMu", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/bytedance/tux/input/TuxEditText", "getText", this, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/bytedance/tux/input/TuxEditText", "getText", null, objArr, this, c0wzw, false);
            text = (Editable) c0wsuLIZIZ.LIZIZ;
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            C21410318qb c21410318qb = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (C21410318qb) obj;
            text = super.getText();
            c0wst.LIZ(998, "com/bytedance/tux/input/TuxEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        }
        return text == null ? new SpannableStringBuilder("") : text;
    }

    @Override // X.C21410318qb, android.widget.EditText, android.widget.TextView
    public /* bridge */ /* synthetic */ CharSequence getText() {
        return C2204961BRm.U(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt4+4MaryORY/Y+wckeQUgHJMu", null));
    }

    @Override // X.C21410318qb, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        final InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection == null) {
            return null;
        }
        return new InputConnectionWrapper(inputConnectionOnCreateInputConnection, this) { // from class: X.0lKU
            public final EditText LIZ;
            public boolean LIZIZ;

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean sendKeyEvent(KeyEvent keyEvent) throws Throwable {
                int i;
                int selectionStart = this.LIZ.getSelectionStart();
                int selectionEnd = this.LIZ.getSelectionEnd();
                if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67) {
                    C0FLJ c0fljLIZIZ = LIZIZ(selectionStart, selectionEnd);
                    if (c0fljLIZIZ == null) {
                        this.LIZIZ = false;
                        return super.sendKeyEvent(keyEvent);
                    }
                    if (!this.LIZIZ && selectionStart != (i = c0fljLIZIZ.LIZ)) {
                        this.LIZIZ = true;
                        if (Build.VERSION.SDK_INT >= 25) {
                            setSelection(i, c0fljLIZIZ.LIZIZ);
                            return true;
                        }
                        setSelection(c0fljLIZIZ.LIZIZ, i);
                        return true;
                    }
                    this.LIZIZ = false;
                    return super.sendKeyEvent(keyEvent);
                }
                C0FLJ c0fljLIZIZ2 = LIZIZ(selectionStart, selectionEnd);
                if (c0fljLIZIZ2 != null && c0fljLIZIZ2.LIZIZ == selectionEnd) {
                    this.LIZIZ = false;
                }
                return super.sendKeyEvent(keyEvent);
            }

            {
                this.LIZ = this;
            }

            public final C0FLJ LIZIZ(int i, int i2) throws Throwable {
                MentionSpan[] mentionSpanArr;
                Editable editableLLJILLL = C2204961BRm.LLJILLL(this.LIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt4+4MaryORY/Y+wckeQUgHJMu", null));
                if (editableLLJILLL.length() == 0) {
                    mentionSpanArr = new MentionSpan[0];
                } else {
                    mentionSpanArr = (MentionSpan[]) editableLLJILLL.getSpans(0, editableLLJILLL.length(), MentionSpan.class);
                    Arrays.sort(mentionSpanArr, new AComparatorS513S0100000_14(editableLLJILLL, 2));
                }
                for (MentionSpan mentionSpan : mentionSpanArr) {
                    int spanStart = C2204961BRm.LLJILLL(this.LIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt4+4MaryORY/Y+wckeQUgHJMu", null)).getSpanStart(mentionSpan);
                    int spanEnd = C2204961BRm.LLJILLL(this.LIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt4+4MaryORY/Y+wckeQUgHJMu", null)).getSpanEnd(mentionSpan);
                    if (new C0FLJ(spanStart, spanEnd).LIZ(i, i2)) {
                        return new C0FLJ(spanStart, spanEnd);
                    }
                }
                return null;
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
                MentionSpan[] mentionSpanArr;
                if (i == 1) {
                    if (i2 == 0) {
                        Editable editableLLJILLL = C2204961BRm.LLJILLL(this.LIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt4+4MaryORY/Y+wckeQUgHJMu", null));
                        if (editableLLJILLL != null && editableLLJILLL.length() != 0) {
                            int length = editableLLJILLL.length();
                            int iMax = Math.max(this.LIZ.getSelectionStart() - i, 0);
                            int iMin = Math.min(this.LIZ.getSelectionEnd(), length);
                            C089E c089e = new C089E(editableLLJILLL.getSpans(0, length, CharacterStyle.class));
                            int i3 = iMax;
                            int i4 = iMin;
                            boolean z = false;
                            boolean z2 = false;
                            while (c089e.hasNext()) {
                                CharacterStyle characterStyle = (CharacterStyle) c089e.next();
                                if (!(characterStyle instanceof MentionSpan) || ((MentionSpan) characterStyle).getType() != 1) {
                                    int spanStart = editableLLJILLL.getSpanStart(characterStyle);
                                    int spanEnd = editableLLJILLL.getSpanEnd(characterStyle);
                                    if (!z && spanStart <= iMax && spanEnd > iMax) {
                                        z = true;
                                        i3 = spanStart;
                                    }
                                    if (!z2 && spanStart < iMin && spanEnd >= iMin) {
                                        z2 = true;
                                        i4 = spanEnd;
                                    }
                                    if (z && z2) {
                                        break;
                                    }
                                }
                            }
                            if (i3 > i4) {
                                int i5 = i4;
                                i4 = i3;
                                i3 = i5;
                            }
                            C0FLJ c0fljLIZIZ = LIZIZ(i3, i4);
                            if (c0fljLIZIZ != null && (mentionSpanArr = (MentionSpan[]) editableLLJILLL.getSpans(c0fljLIZIZ.LIZ, c0fljLIZIZ.LIZIZ, MentionSpan.class)) != null && mentionSpanArr.length != 0) {
                                if (sendKeyEvent(new KeyEvent(0, 67)) && sendKeyEvent(new KeyEvent(1, 67))) {
                                    return true;
                                }
                                return false;
                            }
                            editableLLJILLL.delete(i3, i4);
                        }
                        return false;
                    }
                } else if (i < 0) {
                    return super.deleteSurroundingText(-i2, -i);
                }
                return super.deleteSurroundingText(i, i2);
            }
        };
    }

    public final void setSelectionChangeCallback(InterfaceC1355360lNG interfaceC1355360lNG) {
        this.LLIZ = interfaceC1355360lNG;
    }

    public C1355350lNF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.xv);
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        InterfaceC1355360lNG interfaceC1355360lNG = this.LLIZ;
        if (interfaceC1355360lNG != null) {
            interfaceC1355360lNG.LIZ(i, i2, false);
        }
    }
}
