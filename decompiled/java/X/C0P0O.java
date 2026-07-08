package X;

import android.content.Context;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeTextConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeTextStruct;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0P0O, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0P0O {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, SpannableStringBuilder spannableStringBuilder, NoticeTextStruct noticeTextStruct, boolean z) {
        String str;
        Object c098200Yq;
        Object c098200Yq2;
        int size;
        List<NoticeTextConfig> list;
        NoticeTextConfig noticeTextConfig;
        Object c098200Yq3;
        Object c098200Yq4;
        String str2;
        String str3;
        String str4;
        NoticeTextConfig noticeTextConfig2;
        String str5;
        NoticeTextConfig noticeTextConfig3;
        String str6;
        NoticeTextConfig noticeTextConfig4 = noticeTextStruct.content;
        if (noticeTextConfig4 != null && (str = noticeTextConfig4.text) != null) {
            try {
                C01GW c01gw = C2248361CzK.LIZ;
                if (z) {
                    str6 = noticeTextConfig4.color;
                    if (str6 == null) {
                        str6 = "";
                    }
                    c098200Yq = C2248361CzK.LJ(context, str6);
                    C189200o6.m2constructorimpl(c098200Yq);
                } else {
                    str6 = noticeTextConfig4.unHighlightColor;
                    if (str6 == null) {
                        str6 = "";
                    }
                    c098200Yq = C2248361CzK.LJ(context, str6);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Integer num = (Integer) c098200Yq;
            try {
                C01GW c01gw2 = C2248361CzK.LIZ;
                if (!z ? (noticeTextConfig2 = noticeTextStruct.content) == null || (str5 = noticeTextConfig2.unHighlightFont) == null : (noticeTextConfig3 = noticeTextStruct.content) == null || (str5 = noticeTextConfig3.font) == null) {
                    str5 = "";
                }
                c098200Yq2 = C2248361CzK.LIZIZ(str5);
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = null;
            }
            Integer num2 = (Integer) c098200Yq2;
            Matcher matcher = PatternProtector.compile("\\[\\[text_link_(\\d)]]").matcher(str);
            List<NoticeTextConfig> list2 = noticeTextStruct.textConfigs;
            boolean z2 = false;
            if (list2 != null) {
                size = list2.size();
            } else {
                size = 0;
            }
            int iEnd = 0;
            while (matcher.find()) {
                if (iEnd != matcher.start()) {
                    String strSubstring = str.substring(iEnd, matcher.start());
                    spannableStringBuilder.append((CharSequence) strSubstring);
                    if (num != null) {
                        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(num.intValue()), spannableStringBuilder.length() - strSubstring.length(), spannableStringBuilder.length(), 33);
                    }
                    if (num2 != null) {
                        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(num2.intValue(), z2), spannableStringBuilder.length() - strSubstring.length(), spannableStringBuilder.length(), 33);
                    }
                }
                iEnd = matcher.end();
                int iIntValue = -1;
                try {
                    iIntValue = CastIntegerProtector.valueOf(matcher.group(1)).intValue() - 1;
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    C189200o6.m2constructorimpl(new C098200Yq(th3));
                }
                if (size > iIntValue && (list = noticeTextStruct.textConfigs) != null && C13LP.LJJJLZIJ(iIntValue, list) != null) {
                    List<NoticeTextConfig> list3 = noticeTextStruct.textConfigs;
                    if (list3 != null) {
                        noticeTextConfig = (NoticeTextConfig) ListProtector.get(list3, iIntValue);
                    } else {
                        noticeTextConfig = null;
                    }
                    try {
                        C01GW c01gw3 = C2248361CzK.LIZ;
                        if (!z ? noticeTextConfig == null || (str4 = noticeTextConfig.unHighlightColor) == null : noticeTextConfig == null || (str4 = noticeTextConfig.color) == null) {
                            str4 = "";
                        }
                        c098200Yq3 = C2248361CzK.LJ(context, str4);
                        C189200o6.m2constructorimpl(c098200Yq3);
                    } catch (Throwable th4) {
                        TryCatchGuardChecker.doCheck(th4);
                        c098200Yq3 = new C098200Yq(th4);
                        C189200o6.m2constructorimpl(c098200Yq3);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq3)) {
                        c098200Yq3 = null;
                    }
                    Integer num3 = (Integer) c098200Yq3;
                    try {
                        C01GW c01gw4 = C2248361CzK.LIZ;
                        if (!z ? noticeTextConfig == null || (str3 = noticeTextConfig.unHighlightFont) == null : noticeTextConfig == null || (str3 = noticeTextConfig.font) == null) {
                            str3 = "";
                        }
                        c098200Yq4 = C2248361CzK.LIZIZ(str3);
                        C189200o6.m2constructorimpl(c098200Yq4);
                    } catch (Throwable th5) {
                        TryCatchGuardChecker.doCheck(th5);
                        c098200Yq4 = new C098200Yq(th5);
                        C189200o6.m2constructorimpl(c098200Yq4);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq4)) {
                        c098200Yq4 = null;
                    }
                    Integer num4 = (Integer) c098200Yq4;
                    if (noticeTextConfig == null || (str2 = noticeTextConfig.text) == null) {
                        str2 = "";
                    }
                    spannableStringBuilder.append((CharSequence) str2);
                    if (num3 != null) {
                        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(num3.intValue()), spannableStringBuilder.length() - str2.length(), spannableStringBuilder.length(), 33);
                    } else if (num != null) {
                        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(num.intValue()), spannableStringBuilder.length() - str2.length(), spannableStringBuilder.length(), 33);
                    }
                    if (num4 != null) {
                        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(num4.intValue(), false), spannableStringBuilder.length() - str2.length(), spannableStringBuilder.length(), 33);
                    } else if (num2 != null) {
                        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(num2.intValue(), false), spannableStringBuilder.length() - str2.length(), spannableStringBuilder.length(), 33);
                    }
                }
                z2 = false;
            }
            if (iEnd < str.length()) {
                String strSubstring2 = str.substring(iEnd);
                spannableStringBuilder.append((CharSequence) strSubstring2);
                if (num != null) {
                    C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(num.intValue()), spannableStringBuilder.length() - strSubstring2.length(), spannableStringBuilder.length(), 33);
                }
                if (num2 != null) {
                    C786410Ut5.q2(spannableStringBuilder, new C444920HcY(num2.intValue(), z2), spannableStringBuilder.length() - strSubstring2.length(), spannableStringBuilder.length(), 33);
                }
            }
        }
    }

    public static SpannableStringBuilder LIZIZ(SpannableStringBuilder spannableStringBuilder, int i, int i2, CharSequence charSequence, CharSequence charSequence2) {
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("concatString() - startIndex = ");
        sbLIZ.append(i);
        sbLIZ.append(", endIndex = ");
        sbLIZ.append(i2);
        C1720106oR.LJI("inbox_view_utils", C2188811AlT.LIZIZ(sbLIZ));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append(charSequence);
        if (i != charSequence.length()) {
            spannableStringBuilder2.append((CharSequence) "...");
        }
        spannableStringBuilder2.append(spannableStringBuilder.subSequence(i, i2));
        if (i2 != spannableStringBuilder.length() - charSequence2.length()) {
            spannableStringBuilder2.append((CharSequence) "...");
        }
        spannableStringBuilder2.append(charSequence2);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("searchEllipsizeText2ExceptWidth: result:");
        sbLIZ2.append((Object) spannableStringBuilder2);
        C1720106oR.LJI("inbox_view_utils", C2188811AlT.LIZIZ(sbLIZ2));
        return spannableStringBuilder2;
    }

    public static SpannableStringBuilder LIZJ(SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, int i, int i2, int i3, int i4, boolean z) {
        int iOffsetByCodePoints;
        if (i < 0) {
            return spannableStringBuilder;
        }
        DynamicLayout dynamicLayout = new DynamicLayout(spannableStringBuilder, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (dynamicLayout.getLineCount() <= i2) {
            if (z || spannableStringBuilder.length() - 1 < i3 || dynamicLayout.getLineStart(dynamicLayout.getLineCount() - 1) != spannableStringBuilder.length() - i3) {
                return spannableStringBuilder;
            }
            CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence((spannableStringBuilder.length() - i3) - 1, spannableStringBuilder.length());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder.subSequence(0, (spannableStringBuilder.length() - i3) - 1));
            spannableStringBuilder2.append((CharSequence) "\n");
            spannableStringBuilder2.append(charSequenceSubSequence);
            return spannableStringBuilder2;
        }
        float fMeasureText = i - (textPaint.measureText("... ") + i4);
        int lineStart = dynamicLayout.getLineStart(i2 - 1);
        String string = spannableStringBuilder.toString();
        while (lineStart < spannableStringBuilder.length() - i3 && '\n' != spannableStringBuilder.charAt(lineStart) && (iOffsetByCodePoints = string.offsetByCodePoints(lineStart, 1)) <= spannableStringBuilder.length()) {
            fMeasureText -= textPaint.measureText(spannableStringBuilder, lineStart, iOffsetByCodePoints);
            if (fMeasureText <= 0.0f) {
                break;
            }
            lineStart = iOffsetByCodePoints;
        }
        CharSequence charSequenceSubSequence2 = spannableStringBuilder.subSequence(spannableStringBuilder.length() - i3, spannableStringBuilder.length());
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder.subSequence(0, lineStart));
        spannableStringBuilder3.append((CharSequence) "... ");
        spannableStringBuilder3.append(charSequenceSubSequence2);
        return spannableStringBuilder3;
    }

    public static SpannableStringBuilder LIZLLL(SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, int i, int i2, int i3, int i4, Pair pair) {
        int iOffsetByCodePoints;
        int iOffsetByCodePoints2;
        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(0, i3);
        CharSequence charSequenceSubSequence2 = spannableStringBuilder.subSequence(spannableStringBuilder.length() - i4, spannableStringBuilder.length());
        int iMeasureText = (int) textPaint.measureText(charSequenceSubSequence2.toString());
        int iMeasureText2 = (int) textPaint.measureText(charSequenceSubSequence.toString());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("searchEllipsizeText2ExceptWidth: text = ");
        sbLIZ.append((Object) spannableStringBuilder);
        sbLIZ.append(", width = ");
        sbLIZ.append(i);
        sbLIZ.append(", maxLine = ");
        sbLIZ.append(i2);
        sbLIZ.append(", headOffset = ");
        sbLIZ.append(i3);
        sbLIZ.append(", tailOffset = ");
        sbLIZ.append(i4);
        sbLIZ.append(",  firstHighLight = Pair<");
        sbLIZ.append(pair.getFirst());
        sbLIZ.append(", ");
        sbLIZ.append(pair.getSecond());
        sbLIZ.append('>');
        C1720106oR.LJI("inbox_view_utils", C2188811AlT.LIZIZ(sbLIZ));
        DynamicLayout dynamicLayout = new DynamicLayout(spannableStringBuilder, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (dynamicLayout.getLineCount() <= i2) {
            return spannableStringBuilder;
        }
        float fMeasureText = textPaint.measureText("...");
        String string = spannableStringBuilder.toString();
        float f = fMeasureText + iMeasureText;
        float f2 = i;
        float fMeasureText2 = f2 - f;
        int i5 = i2 - 1;
        int lineStart = dynamicLayout.getLineStart(i5);
        float fMeasureText3 = fMeasureText2;
        while (lineStart < spannableStringBuilder.length() - i4 && '\n' != spannableStringBuilder.charAt(lineStart) && (iOffsetByCodePoints2 = string.offsetByCodePoints(lineStart, 1)) < spannableStringBuilder.length() - i4) {
            fMeasureText3 -= textPaint.measureText(spannableStringBuilder, lineStart, iOffsetByCodePoints2);
            if (fMeasureText3 <= 0.0f) {
                break;
            }
            lineStart = iOffsetByCodePoints2;
        }
        if (((Number) pair.getFirst()).intValue() <= ((Number) pair.getSecond()).intValue() && ((Number) pair.getSecond()).intValue() <= lineStart) {
            return LIZIZ(spannableStringBuilder, i3, lineStart, charSequenceSubSequence, charSequenceSubSequence2);
        }
        int length = spannableStringBuilder.length() - i4;
        int lineStart2 = dynamicLayout.getLineStart(dynamicLayout.getLineCount() - i2);
        int lineEnd = dynamicLayout.getLineEnd(dynamicLayout.getLineCount() - i2);
        float f3 = (f2 - fMeasureText) - iMeasureText2;
        while (lineStart2 < lineEnd && '\n' != spannableStringBuilder.charAt(lineStart2)) {
            int iOffsetByCodePoints3 = string.offsetByCodePoints(lineStart2, 1);
            if (textPaint.measureText(spannableStringBuilder, lineStart2, lineEnd) < f3) {
                break;
            }
            lineStart2 = iOffsetByCodePoints3;
        }
        if (((Number) pair.getFirst()).intValue() <= ((Number) pair.getSecond()).intValue() && ((Number) pair.getFirst()).intValue() >= lineStart2) {
            return LIZIZ(spannableStringBuilder, lineStart2, length, charSequenceSubSequence, charSequenceSubSequence2);
        }
        if (((Number) pair.getFirst()).intValue() <= ((Number) pair.getSecond()).intValue()) {
            ((Number) pair.getFirst()).intValue();
            int lineStart3 = new DynamicLayout(LIZIZ(spannableStringBuilder, ((Number) pair.getFirst()).intValue(), (spannableStringBuilder.length() - i4) - 1, charSequenceSubSequence, charSequenceSubSequence2), textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineStart(i5) + ((Number) pair.getFirst()).intValue();
            while (lineStart3 < spannableStringBuilder.length() - i4 && '\n' != spannableStringBuilder.charAt(lineStart3) && (iOffsetByCodePoints = string.offsetByCodePoints(lineStart3, 1)) < spannableStringBuilder.length() - i4) {
                fMeasureText2 -= textPaint.measureText(spannableStringBuilder, lineStart3, iOffsetByCodePoints);
                if (fMeasureText2 <= 0.0f) {
                    break;
                }
                lineStart3 = iOffsetByCodePoints;
            }
            if (lineStart3 <= ((Number) pair.getSecond()).intValue()) {
                return LIZIZ(spannableStringBuilder, ((Number) pair.getFirst()).intValue(), lineStart3, charSequenceSubSequence, charSequenceSubSequence2);
            }
            int iIntValue = ((Number) pair.getSecond()).intValue();
            DynamicLayout dynamicLayout2 = new DynamicLayout(LIZIZ(spannableStringBuilder, i3, ((Number) pair.getSecond()).intValue(), charSequenceSubSequence, charSequenceSubSequence2), textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            int lineStart4 = dynamicLayout2.getLineStart(dynamicLayout2.getLineCount() - i2);
            int lineEnd2 = dynamicLayout2.getLineEnd(dynamicLayout2.getLineCount() - i2);
            if (lineEnd2 > iIntValue) {
                lineEnd2 = iIntValue;
            }
            float f4 = f3 - fMeasureText;
            while (lineStart4 < lineEnd2 && '\n' != spannableStringBuilder.charAt(lineStart4)) {
                int iOffsetByCodePoints4 = string.offsetByCodePoints(lineStart4, 1);
                if (textPaint.measureText(spannableStringBuilder, lineStart4, lineEnd2) < f4) {
                    break;
                }
                lineStart4 = iOffsetByCodePoints4;
            }
            return LIZIZ(spannableStringBuilder, lineStart4, iIntValue, charSequenceSubSequence, charSequenceSubSequence2);
        }
        return LIZIZ(spannableStringBuilder, 0, lineStart, charSequenceSubSequence, charSequenceSubSequence2);
    }
}
