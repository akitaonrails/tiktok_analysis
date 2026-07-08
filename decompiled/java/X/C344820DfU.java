package X;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS102S0400000_4;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0DfU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C344820DfU {
    public static final /* synthetic */ int LIZ = 0;

    public static SpannableStringBuilder LIZ(C19EG c19eg, String str, final Function2 function2) {
        int iIntValue;
        StringBuilder sb = new StringBuilder(str);
        Regex regex = new Regex("\\[([^\\]]*)\\]\\(([^\\)]*)\\)");
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(regex.replace(sb, new AwS102S0400000_4(map, (HashMap<String, String>) map2, (HashMap<String, Integer>) sb, (StringBuilder) new C118300cf(), (C118300cf) 2)));
        try {
            final int iLIZ = C960203pA.LIZ(R.attr.a1h, c19eg);
            final int iLIZ2 = C960203pA.LIZ(R.attr.a1h, c19eg);
            for (final Map.Entry entry : map.entrySet()) {
                final String str2 = (String) entry.getKey();
                AbstractC344840DfW abstractC344840DfW = new AbstractC344840DfW(iLIZ, iLIZ2) { // from class: X.0DfV
                    @Override // android.text.style.ClickableSpan
                    public final void onClick(View view) {
                        function2.invoke(str2, entry.getValue());
                    }

                    @Override // X.AbstractC344840DfW, android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        super.updateDrawState(textPaint);
                        textPaint.setUnderlineText(false);
                    }
                };
                Integer num = (Integer) map2.get(str2);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                int length = str2.length() + iIntValue;
                C786410Ut5.q2(spannableStringBuilder, abstractC344840DfW, iIntValue, length, 33);
                C786410Ut5.q2(spannableStringBuilder, new C444920HcY(12, true), iIntValue, length, 33);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
        }
        return new SpannableStringBuilder(spannableStringBuilder);
    }
}
