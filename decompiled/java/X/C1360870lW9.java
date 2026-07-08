package X;

import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.method.KeyListener;
import android.view.ViewGroup;
import android.widget.EditText;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0lW9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1360870lW9 {
    public static final void LIZJ(EditText editText) {
        if (editText == null) {
            return;
        }
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
        editText.setCursorVisible(true);
    }

    public static final int LIZ(C21410318qb c21410318qb, int i) {
        int paddingLeft;
        int paddingRight;
        if (c21410318qb == null) {
            return i;
        }
        ViewGroup.LayoutParams layoutParams = c21410318qb.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            paddingLeft = i - c21410318qb.getPaddingLeft();
            paddingRight = c21410318qb.getPaddingRight();
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            paddingLeft = ((i - c21410318qb.getPaddingLeft()) - c21410318qb.getPaddingRight()) - marginLayoutParams.leftMargin;
            paddingRight = marginLayoutParams.rightMargin;
        }
        return paddingLeft - paddingRight;
    }

    public static final void LIZLLL(C21410318qb c21410318qb, boolean z) {
        if (c21410318qb == null) {
            return;
        }
        if (!z) {
            if (c21410318qb.getKeyListener() != null) {
                c21410318qb.setTag(-1043131756, c21410318qb.getKeyListener());
            }
            c21410318qb.setKeyListener(null);
        } else {
            Object tag = c21410318qb.getTag(-1043131756);
            if (!(tag instanceof KeyListener)) {
                return;
            }
            c21410318qb.setKeyListener((KeyListener) tag);
        }
    }

    public static final void LIZIZ(C21410318qb c21410318qb, int i, Integer num) {
        Editable editableLLJILLL;
        int iLIZ;
        int lineCount;
        if (c21410318qb != null && (editableLLJILLL = C2204961BRm.LLJILLL(c21410318qb, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+saov9yDsjZ/V3VE7CgEru6hDC+QUtQhsh5TuZGA==", null))) != null && editableLLJILLL.length() != 0) {
            if (num != null) {
                iLIZ = num.intValue();
            } else {
                iLIZ = LIZ(c21410318qb, c21410318qb.getMaxWidth());
            }
            try {
                if (c21410318qb.getLayout() == null) {
                    lineCount = new StaticLayout(C2204961BRm.LLJILLL(c21410318qb, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+saov9yDsjZ/V3VE7CgEru6hDC+QUtQhsh5TuZGA==", null)), c21410318qb.getPaint(), iLIZ, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount();
                } else {
                    lineCount = c21410318qb.getLayout().getLineCount();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                lineCount = 0;
            }
            if (lineCount > i || C2204961BRm.LLJILLL(c21410318qb, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+saov9yDsjZ/V3VE7CgEru6hDC+QUtQhsh5TuZGA==", null)).length() > 100) {
                String string = C2204961BRm.LLJILLL(c21410318qb, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+saov9yDsjZ/V3VE7CgEru6hDC+QUtQhsh5TuZGA==", null)).toString();
                int i2 = i * 50;
                if (string.length() >= i2) {
                    string = string.substring(0, i2);
                }
                String strSubstring = string.substring(0, string.length() - 1);
                for (int length = strSubstring.length() - 1; length >= 0 && Character.isHighSurrogate(strSubstring.charAt(length)); length--) {
                    strSubstring = strSubstring.substring(0, length);
                }
                c21410318qb.setText(strSubstring);
                c21410318qb.setSelection(C2204961BRm.LLJILLL(c21410318qb, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+saov9yDsjZ/V3VE7CgEru6hDC+QUtQhsh5TuZGA==", null)).length());
            }
        }
    }
}
