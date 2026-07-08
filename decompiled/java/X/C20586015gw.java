package X;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;

/* JADX INFO: renamed from: X.15gw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20586015gw extends C20586215gy {
    @Override // X.C20586215gy
    public final boolean LJIIIZ(KeyEvent keyEvent) {
        int selectionStart;
        Editable editableLLLIILIL;
        if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 67 || (selectionStart = getSelectionStart()) != getSelectionEnd() || (editableLLLIILIL = C2204961BRm.LLLIILIL(this, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+D9GpUDqpxijmBP151Ekm/NvrUkPJB0NWtppm1pV+sJ1qqoUOK5czQ==", null))) == null) {
            return false;
        }
        C0JCS[] c0jcsArr = (C0JCS[]) editableLLLIILIL.getSpans(selectionStart - 1, selectionStart, C0JCS.class);
        if (c0jcsArr.length != 0) {
            Object objLJIL = C13LQ.LJIL(c0jcsArr);
            setSelection(editableLLLIILIL.getSpanStart(objLJIL), editableLLLIILIL.getSpanEnd(objLJIL));
            return true;
        }
        return false;
    }

    public C20586015gw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.C20586215gy
    public final void LJIIIIZZ(int i, int i2) {
        if (getSelectionStart() == getSelectionEnd() && i == 1 && i2 == 0) {
            LJIIIZ(new KeyEvent(0, 67));
        }
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) throws Throwable {
        super.onSelectionChanged(i, i2);
        Editable editableLLLIILIL = C2204961BRm.LLLIILIL(this, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+D9GpUDqpxijmBP151Ekm/NvrUkPJB0NWtppm1pV+sJ1qqoUOK5czQ==", null));
        if (editableLLLIILIL == null) {
            return;
        }
        C089E c089e = new C089E(editableLLLIILIL.getSpans(0, editableLLLIILIL.length(), C0JCS.class));
        while (c089e.hasNext()) {
            Object next = c089e.next();
            int spanStart = editableLLLIILIL.getSpanStart(next);
            int spanEnd = editableLLLIILIL.getSpanEnd(next);
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
            if (i3 <= i2 && i2 < spanEnd) {
                if (Math.abs(i2 - spanStart) < Math.abs(i2 - spanEnd)) {
                    setSelection(i, spanStart);
                    return;
                } else {
                    setSelection(i, spanEnd);
                    return;
                }
            }
        }
    }
}
