package X;

import android.text.Editable;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.18pq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21405618pq {
    public EditText LIZ;
    public int LIZIZ = 1;
    public boolean LIZJ;
    public boolean LIZLLL;

    public final void LIZ() throws Throwable {
        EditText editText = this.LIZ;
        if (editText != null && this.LIZJ) {
            this.LIZJ = false;
            LIZIZ(editText, this.LIZIZ);
            InputMethodManager inputMethodManager = (InputMethodManager) editText.getContext().getSystemService(InputMethodManager.class);
            if (inputMethodManager != null) {
                inputMethodManager.restartInput(editText);
            }
        }
    }

    public final void LIZIZ(EditText editText, int i) throws Throwable {
        int length;
        int selectionStart = editText.getSelectionStart();
        int selectionEnd = editText.getSelectionEnd();
        this.LIZLLL = true;
        try {
            editText.setInputType(i);
            this.LIZLLL = false;
            Editable editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apOA8Tfal2k955pok+D5Nuc+KXfiICafpuV1", null));
            if (editableLLJILLL != null) {
                length = editableLLJILLL.length();
            } else {
                length = 0;
            }
            editText.setSelection(C13LZ.LJ(selectionStart, 0, length), C13LZ.LJ(selectionEnd, 0, length));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZLLL = false;
            throw th;
        }
    }
}
