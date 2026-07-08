package X;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.StyleSpan;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0GuF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430410GuF extends RecyclerView.ViewHolder {
    public final TuxTextView LL;
    public final TuxIconView LLILLJJLI;

    public C430410GuF(View view) {
        super(view);
        this.LL = (TuxTextView) view.findViewById(R.id.zrg);
        this.LLILLJJLI = (TuxIconView) view.findViewById(R.id.cr_);
    }

    public static boolean N5(int i, TextPaint textPaint, String str) {
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, i).setMaxLines(2).setEllipsize(null).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(false).build();
        if (staticLayoutBuild.getLineCount() > 2 || staticLayoutBuild.getLineEnd(staticLayoutBuild.getLineCount() - 1) < str.length()) {
            return false;
        }
        return true;
    }

    public static SpannableString L5(Context context, String str, String str2, Function0 function0) {
        SpannableString spannableString = new SpannableString(str);
        int iLJJJJI = a0.LJJJJI(str, str2, 0, 6);
        if (iLJJJJI >= 0) {
            int length = str2.length() + iLJJJJI;
            C786410Ut5.p2(spannableString, new C0ID5(context, function0, 2), iLJJJJI, length, 33);
            C786410Ut5.p2(spannableString, new StyleSpan(1), iLJJJJI, length, 33);
        }
        return spannableString;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void I5(com.bytedance.tux.input.TuxTextView r11, android.content.Context r12, java.lang.String r13, java.lang.String r14, int r15, kotlin.jvm.functions.Function0 r16) {
        /*
            android.text.TextPaint r8 = r11.getPaint()
            if (r15 <= 0) goto L87
            r0 = 6
            r6 = 0
            int r3 = kotlin.text.a0.LJJJJI(r13, r14, r6, r0)
            if (r3 < 0) goto L87
            boolean r0 = N5(r15, r8, r13)
            if (r0 != 0) goto L91
            java.text.BreakIterator r2 = java.text.BreakIterator.getCharacterInstance()
            r2.setText(r13)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r0 = r2.first()
        L24:
            r7 = -1
            if (r0 == r7) goto L35
            if (r0 > r3) goto L35
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.add(r0)
            int r0 = r2.next()
            goto L24
        L35:
            int[] r5 = X.C13LP.LLII(r1)
            int r0 = r5.length
            r10 = 1
            if (r0 == 0) goto L91
            int r4 = r5.length
            int r4 = r4 - r10
            r3 = 0
        L40:
            java.lang.String r2 = "… "
            if (r3 > r4) goto L6b
            int r9 = r3 + r4
            int r9 = r9 >>> r10
            r0 = r5[r9]
            java.lang.String r1 = r13.substring(r6, r0)
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r1)
            r0.append(r2)
            r0.append(r14)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            boolean r0 = N5(r15, r8, r0)
            if (r0 == 0) goto L68
            int r3 = r9 + 1
            r7 = r9
            goto L40
        L68:
            int r4 = r9 + (-1)
            goto L40
        L6b:
            if (r7 < 0) goto L91
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r0 = r5[r7]
            java.lang.String r0 = r13.substring(r6, r0)
            r1.append(r0)
            r1.append(r2)
            r1.append(r14)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
        L84:
            if (r0 == 0) goto L87
            r13 = r0
        L87:
            r0 = r16
            android.text.SpannableString r0 = L5(r12, r13, r14, r0)
            r11.setText(r0)
            return
        L91:
            r0 = r13
            goto L84
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C430410GuF.I5(com.bytedance.tux.input.TuxTextView, android.content.Context, java.lang.String, java.lang.String, int, kotlin.jvm.functions.Function0):void");
    }
}
