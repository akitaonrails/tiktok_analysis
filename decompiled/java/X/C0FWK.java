package X;

import android.R;
import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;

/* JADX INFO: renamed from: X.0FWK, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FWK extends C21410318qb {
    public C0FWK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) throws Throwable {
        int selectionStart;
        if (i == 67 && keyEvent.getAction() == 0 && (selectionStart = getSelectionStart()) == getSelectionEnd()) {
            Editable editableT = C2204961BRm.t(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm9YYzNzjswHj2F3VAulxUa0OAqDFRqxwzyTj883OIPvjFpOJd3pSl8Mx0/7F/+CBOfyty2TMEcq4lKr6stJA==", null));
            if (editableT == null) {
                return super.onKeyDown(i, keyEvent);
            }
            if (selectionStart > 0) {
                C0JCT[] c0jctArr = (C0JCT[]) editableT.getSpans(selectionStart - 1, selectionStart, C0JCT.class);
                if (c0jctArr.length != 0) {
                    Object objLJIL = C13LQ.LJIL(c0jctArr);
                    setSelection(editableT.getSpanStart(objLJIL), editableT.getSpanEnd(objLJIL));
                    return true;
                }
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) throws Throwable {
        super.onSelectionChanged(i, i2);
        Editable editableT = C2204961BRm.t(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm9YYzNzjswHj2F3VAulxUa0OAqDFRqxwzyTj883OIPvjFpOJd3pSl8Mx0/7F/+CBOfyty2TMEcq4lKr6stJA==", null));
        if (editableT == null) {
            return;
        }
        C089E c089e = new C089E(editableT.getSpans(0, editableT.length(), C0JCT.class));
        while (c089e.hasNext()) {
            Object next = c089e.next();
            int spanStart = editableT.getSpanStart(next);
            int spanEnd = editableT.getSpanEnd(next);
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
