package X;

import android.text.Editable;
import android.text.Selection;

/* JADX INFO: renamed from: X.18or, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21399518or implements InterfaceC21400018ow {
    public static final C21399518or LIZ = new C21399518or();

    @Override // X.InterfaceC21400018ow
    public final boolean LIZ(Editable editable) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        Object[] spans = editable.getSpans(selectionStart, selectionEnd, C0GVZ.class);
        int length = spans.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Object obj = spans[i];
            if (editable.getSpanEnd(obj) == selectionStart) {
                if (obj != null) {
                    if (selectionStart == selectionEnd) {
                        z = true;
                    }
                    editable.delete(editable.getSpanStart(obj), editable.getSpanEnd(obj));
                }
            } else {
                i++;
            }
        }
        return z;
    }
}
