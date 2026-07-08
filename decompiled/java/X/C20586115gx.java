package X;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;

/* JADX INFO: renamed from: X.15gx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20586115gx extends C20586215gy {
    public C20586115gx(Context context) {
        super(context);
    }

    @Override // X.C20586215gy
    public final boolean LJIIIZ(KeyEvent keyEvent) {
        if (LJIIJ(keyEvent)) {
            return true;
        }
        return false;
    }

    public final boolean LJIIJ(KeyEvent keyEvent) throws Throwable {
        int selectionStart;
        Editable editableLLLIIII = C2204961BRm.LLLIIII(this, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CJOQQvvt2bwKJpt7MZ3hu7Ze2pP5ate6fGU", null));
        if (editableLLLIIII != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67 && (selectionStart = getSelectionStart()) == getSelectionEnd()) {
            C19656111vL[] c19656111vLArr = (C19656111vL[]) editableLLLIIII.getSpans(selectionStart - 1, selectionStart, C19656111vL.class);
            if (c19656111vLArr.length != 0) {
                Object objLJIL = C13LQ.LJIL(c19656111vLArr);
                setSelection(editableLLLIIII.getSpanStart(objLJIL), editableLLLIIII.getSpanEnd(objLJIL));
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent != null && LJIIJ(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public C20586115gx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.C20586215gy
    public final void LJIIIIZZ(int i, int i2) {
        if (getSelectionStart() == getSelectionEnd() && i <= 2 && i2 == 0) {
            LJIIIZ(new KeyEvent(0, 67));
        }
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) throws Throwable {
        super.onSelectionChanged(i, i2);
        Editable editableLLLIIII = C2204961BRm.LLLIIII(this, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CJOQQvvt2bwKJpt7MZ3hu7Ze2pP5ate6fGU", null));
        if (editableLLLIIII == null) {
            return;
        }
        C19656111vL[] c19656111vLArr = (C19656111vL[]) editableLLLIIII.getSpans(0, editableLLLIIII.length(), C19656111vL.class);
        if (c19656111vLArr.length != 0) {
            Object objLJIL = C13LQ.LJIL(c19656111vLArr);
            int spanStart = editableLLLIIII.getSpanStart(objLJIL);
            int spanEnd = editableLLLIIII.getSpanEnd(objLJIL);
            int i3 = spanStart + 1;
            if (i3 <= i && i < spanEnd) {
                if (Math.abs(i - spanStart) < Math.abs(i - spanEnd)) {
                    setSelection(spanStart, i2);
                    return;
                } else {
                    setSelection(spanEnd, i2);
                    return;
                }
            }
            if (i3 > i2 || i2 >= spanEnd) {
                return;
            }
            if (Math.abs(i2 - spanStart) < Math.abs(i2 - spanEnd)) {
                setSelection(i, spanStart);
            } else {
                setSelection(i, spanEnd);
            }
        }
    }
}
