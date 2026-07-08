package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ugE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class ViewOnFocusChangeListenerC1713080ugE implements TextWatcher, View.OnFocusChangeListener {
    public EditText LL;
    public TextView LLILLJJLI;
    public int LLILLL = 100;
    public View.OnFocusChangeListener LLILZ;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string;
        TextView textView;
        boolean z;
        if (editable != null && (string = editable.toString()) != null && (textView = this.LLILLJJLI) != null) {
            if (string.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            LIZ(string.length(), textView, z);
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int length;
        Editable editableLLJILLL;
        View.OnFocusChangeListener onFocusChangeListener = this.LLILZ;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
        if (!Intrinsics.LJFF(view, this.LL)) {
            return;
        }
        boolean z2 = false;
        if (z) {
            EditText editText = this.LL;
            if (editText != null) {
                editText.addTextChangedListener(this);
            }
            EditText editText2 = this.LL;
            if (editText2 != null && (editableLLJILLL = C2204961BRm.LLJILLL(editText2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmZZPb2TzaSm6ItPsk1vIiKahyiP6OhAurIPQT2gRDgJVHDt7yAflBbyFbBZHjObXnniSUndzIyTEm2bU4ZRwnzHIcM4yi", null))) != null) {
                length = editableLLJILLL.length();
            } else {
                length = 0;
            }
            TextView textView = this.LLILLJJLI;
            if (textView != null) {
                if (length > 0) {
                    z2 = true;
                }
                LIZ(length, textView, z2);
                return;
            }
            return;
        }
        EditText editText3 = this.LL;
        if (editText3 != null) {
            editText3.removeTextChangedListener(this);
        }
        TextView textView2 = this.LLILLJJLI;
        if (textView2 == null) {
            return;
        }
        LIZ(0, textView2, false);
    }

    public final void LIZ(int i, TextView textView, boolean z) {
        if (z) {
            C12ES.LJIILL(0, textView);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i);
            sbLIZ.append('/');
            sbLIZ.append(this.LLILLL);
            textView.setText(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C0H1U.LIZIZ(textView);
        textView.setText("");
    }
}
