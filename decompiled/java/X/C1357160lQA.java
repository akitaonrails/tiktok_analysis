package X;

import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: X.0lQA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1357160lQA {
    public final int LIZ;
    public final float LIZIZ;
    public final TextView LIZJ;
    public final Matcher LIZLLL = PatternProtector.compile("\\*\\*([^*]+)\\*\\*").matcher("");

    public final void LIZ(SpannableStringBuilder spannableStringBuilder) {
        String strGroup;
        Matcher matcher = this.LIZLLL;
        matcher.reset(spannableStringBuilder);
        if (!matcher.find() || matcher.group(1) == null || (strGroup = matcher.group(1)) == null) {
            return;
        }
        try {
            spannableStringBuilder.delete(matcher.start(0), matcher.end(0));
            int iStart = matcher.start(0);
            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(strGroup);
            C444920HcY c444920HcY = new C444920HcY(42, true);
            C0GV0 c0gv0 = new C0GV0(this.LIZJ, this.LIZ, this.LIZIZ);
            C786410Ut5.q2(spannableStringBuilderValueOf, c444920HcY, 0, spannableStringBuilderValueOf.length(), 33);
            C786410Ut5.q2(spannableStringBuilderValueOf, c0gv0, 0, spannableStringBuilderValueOf.length(), 33);
            spannableStringBuilder.insert(iStart, (CharSequence) spannableStringBuilderValueOf);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ(spannableStringBuilder);
    }

    public C1357160lQA(TextView textView, int i, float f) {
        this.LIZ = i;
        this.LIZIZ = f;
        this.LIZJ = textView;
    }
}
