package X;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.18pA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21401418pA implements TextWatcher {
    public final EditText LL;
    public C21401518pB LLILLL;
    public final boolean LLILLJJLI = false;
    public boolean LLILZ = true;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C21401418pA(EditText editText) {
        this.LL = editText;
    }

    public static void LIZ(EditText editText, int i) throws Throwable {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableLLJILJILJ = C2204961BRm.LLJILJILJ(editText, new C0WZX("dTF6Tg0zW9KSUFouTxvWKDBqnPCbp91NWL3i1h9WvCaYRvtphqUCEUIb4Njmhl8qcQ==", new String[]{"01789"}));
            int selectionStart = Selection.getSelectionStart(editableLLJILJILJ);
            int selectionEnd = Selection.getSelectionEnd(editableLLJILJILJ);
            e.LIZ().LJIIIZ(editableLLJILJILJ);
            if (selectionStart >= 0) {
                if (selectionEnd >= 0) {
                    Selection.setSelection(editableLLJILJILJ, selectionStart, selectionEnd);
                    return;
                } else {
                    Selection.setSelection(editableLLJILJILJ, selectionStart);
                    return;
                }
            }
            if (selectionEnd < 0) {
                return;
            }
            Selection.setSelection(editableLLJILJILJ, selectionEnd);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.18pB] */
    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.LL.isInEditMode() && this.LLILZ) {
            if ((!this.LLILLJJLI && !e.LJ()) || i2 > i3 || !(charSequence instanceof Spannable)) {
                return;
            }
            int iLIZJ = e.LIZ().LIZJ();
            if (iLIZJ != 0) {
                if (iLIZJ != 1) {
                    if (iLIZJ != 3) {
                        return;
                    }
                } else {
                    e.LIZ().LJIIIIZZ(i, i3 + i, charSequence, 0);
                    return;
                }
            }
            e eVarLIZ = e.LIZ();
            if (this.LLILLL == null) {
                final EditText editText = this.LL;
                this.LLILLL = new AbstractC20101313kx(editText) { // from class: X.18pB
                    public final Reference<EditText> LIZ;

                    @Override // X.AbstractC20101313kx
                    public final void LIZIZ() throws Throwable {
                        C21401418pA.LIZ(this.LIZ.get(), 1);
                    }

                    {
                        this.LIZ = new WeakReference(editText);
                    }
                };
            }
            eVarLIZ.LJIIJ(this.LLILLL);
        }
    }
}
