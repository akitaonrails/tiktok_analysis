package X;

import android.graphics.Rect;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03mx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C946503mx {
    public static final void LIZ(EditText editText, Integer num) {
        if (!editText.hasFocus()) {
            return;
        }
        String string = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70s3LAv+ax35Y9sLLCd2IIWaPAwpUWoDCXtWA==", null)).toString();
        if (num != null && num.intValue() >= 0 && num.intValue() <= string.length()) {
            editText.setSelection(num.intValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(com.bytedance.tux.icon.TuxIconView r4, X.C946403mw r5) {
        /*
            r1 = 2131368089(0x7f0a1899, float:1.8356118E38)
            java.lang.Object r3 = r4.getTag(r1)
            boolean r0 = r3 instanceof X.C946403mw
            r2 = 0
            if (r0 == 0) goto L16
            X.03mw r3 = (X.C946403mw) r3
        Le:
            if (r5 != 0) goto L18
            r0 = 8
            X.C786410Ut5.LJLLLLLL(r0, r4)
            return
        L16:
            r3 = r2
            goto Le
        L18:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r5)
            if (r0 == 0) goto L1f
            return
        L1f:
            r4.setTag(r1, r5)
            if (r3 == 0) goto La4
            int r1 = r5.LIZ
            int r0 = r3.LIZ
            if (r1 != r0) goto La4
        L2a:
            android.graphics.drawable.Drawable r1 = r5.LIZIZ
            if (r1 == 0) goto L4a
            if (r3 == 0) goto L48
            android.graphics.drawable.Drawable r0 = r3.LIZIZ
        L32:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L4a
            android.graphics.drawable.Drawable r0 = r5.LIZIZ
            r4.setImageDrawable(r0)
        L3d:
            int r1 = r5.LJ
            if (r1 <= 0) goto L47
            if (r3 == 0) goto Laa
            int r0 = r3.LJ
            if (r1 != r0) goto Laa
        L47:
            return
        L48:
            r0 = r2
            goto L32
        L4a:
            X.0GdJ r1 = r5.LIZJ
            if (r1 == 0) goto L60
            if (r3 == 0) goto L5e
            X.0GdJ r0 = r3.LIZJ
        L52:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L60
            X.0GdJ r0 = r5.LIZJ
            r4.setTuxIcon(r0)
            goto L3d
        L5e:
            r0 = r2
            goto L52
        L60:
            int r1 = r5.LIZLLL
            if (r1 <= 0) goto L6a
            if (r3 == 0) goto La0
            int r0 = r3.LIZLLL
            if (r1 != r0) goto La0
        L6a:
            java.lang.String r0 = r5.LJFF
            if (r0 == 0) goto L3d
            int r0 = r0.length()
            if (r0 == 0) goto L3d
            java.lang.String r0 = r5.LJFF
            if (r3 == 0) goto L7a
            java.lang.String r2 = r3.LJFF
        L7a:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            if (r0 != 0) goto L3d
            X.0kdB r1 = X.C1326790kdB.LIZ
            java.lang.String r0 = r5.LJFF
            r1.getClass()
            X.0kl3 r2 = X.C1326790kdB.LIZLLL(r0)
            android.content.Context r1 = r4.getContext()
            r0 = 2131099686(0x7f060026, float:1.7811732E38)
            android.graphics.drawable.Drawable r0 = X.C1308910kAL.LJ(r0, r1)
            r2.LJJIIZI(r0)
            r2.LJJI(r4)
            X.C786410Ut5.h3(r2)
            goto L3d
        La0:
            r4.setIconRes(r1)
            goto L3d
        La4:
            int r0 = r5.LIZ
            X.C786410Ut5.LLLLLLZZ(r4, r0)
            goto L2a
        Laa:
            r4.setTintColorRes(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C946503mx.LIZIZ(com.bytedance.tux.icon.TuxIconView, X.03mw):void");
    }

    public static final void LIZJ(View view, C946703mz c946703mz) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        if (c946703mz == null) {
            return;
        }
        Rect rect = new Rect(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
        Integer num = c946703mz.LIZ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = rect.left;
        }
        Integer num2 = c946703mz.LIZIZ;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = rect.top;
        }
        Integer num3 = c946703mz.LIZJ;
        if (num3 != null) {
            iIntValue3 = num3.intValue();
        } else {
            iIntValue3 = rect.right;
        }
        Integer num4 = c946703mz.LIZLLL;
        if (num4 != null) {
            iIntValue4 = num4.intValue();
        } else {
            iIntValue4 = rect.bottom;
        }
        Rect rect2 = new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4);
        if (!Intrinsics.LJFF(rect2, rect)) {
            view.setPadding(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public static final void LIZLLL(EditText editText, Object obj) throws Throwable {
        String string;
        Editable editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70s3LAv+ax35Y9sLLCd2IIWaPAwpUWoDCXtWA==", null));
        if (obj == null || (string = obj.toString()) == null) {
            string = "";
        }
        if ((string.length() == 0 && (editableLLJILLL == null || editableLLJILLL.length() == 0)) || !LJ(string, editableLLJILLL)) {
            return;
        }
        editText.setText(string);
    }

    public static final boolean LJ(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2 == null) {
            return true;
        }
        int length = charSequence.length();
        if (charSequence2 == null || length != charSequence2.length()) {
            return true;
        }
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
