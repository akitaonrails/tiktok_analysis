package X;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.ss.android.ugc.aweme.poi.osp.repo.model.DisclaimerData;
import com.ss.android.ugc.aweme.poi.osp.repo.model.HighlightWord;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0h8f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1192550h8f {
    public static final SpannableStringBuilder LIZ(DisclaimerData disclaimerData, Integer num, Integer num2, int i, final int i2, final Function1<? super HighlightWord, Unit> function1) {
        String str = disclaimerData.text;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (num != null) {
            C786410Ut5.q2(spannableStringBuilder, new C444920HcY(num.intValue(), false), 0, spannableStringBuilder.length(), 17);
        }
        if (num2 != null) {
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(num2.intValue()), 0, spannableStringBuilder.length(), 17);
        }
        List<HighlightWord> list = disclaimerData.highlightWords;
        if (list != null) {
            ArrayList<HighlightWord> arrayList = new ArrayList();
            for (HighlightWord highlightWord : list) {
                if (C1533950q1J.LJ(highlightWord.placeholder)) {
                    arrayList.add(highlightWord);
                }
            }
            for (final HighlightWord highlightWord2 : arrayList) {
                String str2 = highlightWord2.placeholder;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = highlightWord2.text;
                if (str3 == null) {
                    str3 = "";
                }
                int iLJJJ = a0.LJJJ(spannableStringBuilder, str2, 0, false, 6);
                if (iLJJJ >= 0) {
                    spannableStringBuilder.replace(iLJJJ, str2.length() + iLJJJ, (CharSequence) str3);
                    int length = str3.length() + iLJJJ;
                    if (length <= spannableStringBuilder.length()) {
                        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(i, false), iLJJJ, length, 17);
                        C786410Ut5.q2(spannableStringBuilder, new AbstractC426530Gnz() { // from class: X.0h8e
                            @Override // android.text.style.ClickableSpan
                            public final void onClick(View view) {
                                function1.invoke(highlightWord2);
                            }

                            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                            public final void updateDrawState(TextPaint textPaint) {
                                super.updateDrawState(textPaint);
                                textPaint.setColor(i2);
                                textPaint.setUnderlineText(false);
                            }
                        }, iLJJJ, length, 17);
                    }
                }
            }
        }
        return spannableStringBuilder;
    }
}
