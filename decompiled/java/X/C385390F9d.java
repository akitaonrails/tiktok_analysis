package X;

import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0F9d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C385390F9d {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str, Context context, TextPaint textPaint) {
        if (context == null) {
            return str;
        }
        StaticLayout staticLayout = new StaticLayout(str, textPaint, C497820Jfg.LIZIZ(context) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        StringBuilder sb = new StringBuilder();
        int lineCount = staticLayout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            CharSequence charSequenceSubSequence = str.subSequence(staticLayout.getLineStart(i), staticLayout.getLineEnd(i));
            sb.append(charSequenceSubSequence);
            if (i != staticLayout.getLineCount() - 1 && !a0.LJJIJIL(charSequenceSubSequence, "\n")) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
