package X;

import android.text.SpannableString;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0GzY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C433700GzY {
    public final TextPaint LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public boolean LIZLLL;
    public final TextView LJ;

    public static SpannableString LIZ(SpannableString spannableString, int i, int i2) {
        Object c098200Yq;
        int iIntValue = i - i2;
        C433710GzZ.LIZ.getClass();
        try {
            Matcher matcher = ((Pattern) C433710GzZ.LIZIZ.getValue()).matcher(spannableString);
            int i3 = iIntValue;
            while (matcher.find()) {
                int iStart = matcher.start();
                int iEnd = matcher.end();
                if (iStart < i3 && iEnd > i3) {
                    i3 = iStart;
                }
            }
            c098200Yq = Integer.valueOf(i3);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((Object) spannableString.subSequence(0, iIntValue));
        sbLIZ.append("...");
        return new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static int LIZIZ(int i, TextView textView, CharSequence charSequence) {
        TextView textView2 = new TextView(textView.getContext());
        textView2.setTextSize(0, textView.getTextSize());
        textView2.setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier());
        textView2.setTypeface(textView.getTypeface());
        textView2.setIncludeFontPadding(textView.getIncludeFontPadding());
        textView2.setText(charSequence);
        textView2.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), textView.getPaddingBottom());
        textView2.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        return textView2.getMeasuredHeight();
    }

    public C433700GzY(TextView textView, TextPaint textPaint, int i, String str, int i2) {
        this.LIZJ = 4;
        this.LIZ = textPaint;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LJ = textView;
    }
}
