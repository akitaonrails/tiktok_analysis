package X;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Gw6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431560Gw6 {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(TextView textView, int i, int i2, int i3, int i4) {
        if (textView == null) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        while (i2 <= i) {
            arrayList.add(Integer.valueOf(i2));
            i2++;
        }
        int size = arrayList.size() - 1;
        int i5 = 1;
        int i6 = 0;
        while (i5 <= size) {
            int i7 = (i5 + size) / 2;
            int iIntValue = ((Number) ListProtector.get(arrayList, i7)).intValue();
            TextPaint textPaint = new TextPaint();
            textPaint.set(textView.getPaint());
            textPaint.setTextSize(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(textView.getText(), 0, textView.getText().length(), textPaint, i3);
            builderObtain.setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding());
            builderObtain.setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).setMaxLines(Integer.MAX_VALUE);
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 28) {
                builderObtain.setUseLineSpacingFromFallbacks(textView.isFallbackLineSpacing());
            } else {
                if (i8 >= 26) {
                }
                StaticLayout staticLayoutBuild = builderObtain.build();
                if ((textView.getMaxLines() == -1 && staticLayoutBuild.getLineCount() > textView.getMaxLines()) || (i4 > 0 && i4 != Integer.MAX_VALUE && staticLayoutBuild.getHeight() > i4)) {
                    i6 = i7 - 1;
                    size = i6;
                } else {
                    i6 = i5;
                    i5 = i7 + 1;
                }
            }
            builderObtain.setJustificationMode(textView.getJustificationMode());
            if (i8 >= 29) {
                builderObtain.setTextDirection(textView.getTextDirectionHeuristic());
            }
            StaticLayout staticLayoutBuild2 = builderObtain.build();
            if (textView.getMaxLines() == -1) {
                i6 = i5;
                i5 = i7 + 1;
            } else {
                i6 = i5;
                i5 = i7 + 1;
            }
        }
        return C439101nJ.LIZ(((Number) ListProtector.get(arrayList, i6)).intValue());
    }
}
