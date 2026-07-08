package X;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: X.14XY, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14XY implements InterfaceC20096813kE {
    @Override // X.InterfaceC20096813kE
    public final C20098713kX LIZ(View view, C20098713kX c20098713kX) throws Throwable {
        CharSequence charSequenceCoerceToStyledText;
        if (c20098713kX.LIZ.getSource() == 2) {
            return c20098713kX;
        }
        ClipData clipDataLIZ = c20098713kX.LIZ.LIZ();
        int iLJJJJIZL = c20098713kX.LIZ.LJJJJIZL();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < clipDataLIZ.getItemCount(); i++) {
            ClipData.Item itemLJJIIZ = C2204961BRm.LJJIIZ(clipDataLIZ, i, new C0WZX("dTF6Tg0zW9KSVlgzQFyTbyKexxGTvZT7X3xo6pZpPuw+8ROmDgB4l0wFLr/4cRV4BhSkXE8=", new String[]{"01789"}));
            if ((iLJJJJIZL & 1) != 0) {
                charSequenceCoerceToStyledText = itemLJJIIZ.coerceToText(context);
                if (charSequenceCoerceToStyledText instanceof Spanned) {
                    charSequenceCoerceToStyledText = charSequenceCoerceToStyledText.toString();
                }
            } else {
                charSequenceCoerceToStyledText = itemLJJIIZ.coerceToStyledText(context);
            }
            if (charSequenceCoerceToStyledText != null) {
                if (!z) {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, iMax2);
                    editable.replace(iMax, iMax2, charSequenceCoerceToStyledText);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceCoerceToStyledText);
                }
            }
        }
        return null;
    }
}
