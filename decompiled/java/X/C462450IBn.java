package X;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.experiment.PersonalizedEmojiExperiment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan;
import com.ss.android.ugc.aweme.comment.widgets.MentionSpan;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0IBn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C462450IBn {
    public static final Pattern LIZ = PatternProtector.compile("(?:[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?)");

    public static SpannableString LIZ(CommentPersonalizedEmoji commentPersonalizedEmoji) {
        int iIntValue;
        String str = "";
        if (commentPersonalizedEmoji != null && commentPersonalizedEmoji.emoji != null) {
            SpannableString spannableString = new SpannableString(commentPersonalizedEmoji.emoji);
            String strValueOf = String.valueOf(commentPersonalizedEmoji.emoji);
            Integer num = commentPersonalizedEmoji.score;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            Integer numValueOf = Integer.valueOf(iIntValue);
            String str2 = commentPersonalizedEmoji.strategy;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = commentPersonalizedEmoji.source;
            if (str3 != null) {
                str = str3;
            }
            C786410Ut5.p2(spannableString, new CommentEmojiSpan(strValueOf, numValueOf, str2, str, 1), 0, spannableString.length(), 33);
            return spannableString;
        }
        return new SpannableString("");
    }

    public static int LIZJ(String str) {
        int i = 0;
        if (str == null) {
            return 0;
        }
        if (!TextUtils.isEmpty(str)) {
            while (LIZ.matcher(str).find()) {
                i++;
            }
        }
        return i;
    }

    public static void LIZIZ(CharSequence charSequence, int i, int i2, CommentContextSource commentContextSource) {
        CharSequence charSequenceSubSequence;
        SpannableStringBuilder spannableStringBuilder;
        MentionSpan[] mentionSpanArr;
        int iIntValue;
        SpannableStringBuilder spannableStringBuilder2;
        Integer num;
        SpannableStringBuilder spannableStringBuilder3;
        CommentEmojiSpan[] commentEmojiSpanArr;
        if (charSequence != null && (charSequenceSubSequence = charSequence.subSequence(i, i + i2)) != null) {
            boolean z = charSequenceSubSequence instanceof SpannableStringBuilder;
            if (z) {
                spannableStringBuilder = (SpannableStringBuilder) charSequenceSubSequence;
            } else {
                spannableStringBuilder = null;
            }
            if (spannableStringBuilder != null) {
                mentionSpanArr = (MentionSpan[]) spannableStringBuilder.getSpans(0, ((SpannableStringBuilder) charSequenceSubSequence).length(), MentionSpan.class);
            } else {
                mentionSpanArr = null;
            }
            if (mentionSpanArr != null && mentionSpanArr.length == 1) {
                return;
            }
            ArrayList<C462460IBo> arrayList = new ArrayList();
            Matcher matcher = LIZ.matcher(charSequenceSubSequence);
            while (matcher.find()) {
                arrayList.add(new C462460IBo(matcher.start(), matcher.end(), matcher.group()));
            }
            if (!arrayList.isEmpty()) {
                if (!z || (spannableStringBuilder3 = (SpannableStringBuilder) charSequenceSubSequence) == null || (commentEmojiSpanArr = (CommentEmojiSpan[]) spannableStringBuilder3.getSpans(0, ((SpannableStringBuilder) charSequenceSubSequence).length(), CommentEmojiSpan.class)) == null || commentEmojiSpanArr.length == 0) {
                    if (arrayList.size() == 1 && PersonalizedEmojiExperiment.LIZIZ()) {
                        C0I2X c0i2x = C0I2X.LIZ;
                        String string = ((C462460IBo) ListProtector.get(arrayList, 0)).LIZJ.toString();
                        c0i2x.getClass();
                        C0I2X.LIZ(string);
                    }
                    HashMap map = new HashMap();
                    for (C462460IBo c462460IBo : arrayList) {
                        if (map.containsKey(c462460IBo.LIZJ) && (num = (Integer) map.get(c462460IBo.LIZJ)) != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        map.put(c462460IBo.LIZJ, Integer.valueOf(iIntValue + 1));
                        CommentEmojiSpan commentEmojiSpan = new CommentEmojiSpan(c462460IBo.LIZJ.toString(), 0, "", "system_emoji_board", 1);
                        int i3 = c462460IBo.LIZ + i;
                        int i4 = c462460IBo.LIZIZ + i;
                        if (i3 >= 0 && i3 < charSequence.length() && i4 > 0 && i4 <= charSequence.length()) {
                            if ((charSequence instanceof SpannableStringBuilder) && (spannableStringBuilder2 = (SpannableStringBuilder) charSequence) != null) {
                                int i5 = c462460IBo.LIZ + i;
                                if (i5 < 0) {
                                    i5 = 0;
                                }
                                int i6 = c462460IBo.LIZIZ + i;
                                int length = ((SpannableStringBuilder) charSequence).length();
                                if (i6 > length) {
                                    i6 = length;
                                }
                                C786410Ut5.q2(spannableStringBuilder2, commentEmojiSpan, i5, i6, 33);
                            }
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("check emoji error, origin string: ");
                            sbLIZ.append((Object) charSequence);
                            C1344030l4z.LIZJ("EmojiViewHelper", C2188811AlT.LIZIZ(sbLIZ));
                            String string2 = charSequence.toString();
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJIIIIZZ("origin_string", string2);
                            C1350920lG6.LJJJ(c2344009Gk, "emoji_span_error");
                        }
                    }
                    C1350920lG6.LIZ.getClass();
                    for (Map.Entry entry : map.entrySet()) {
                        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
                        CharSequence charSequence2 = (CharSequence) entry.getKey();
                        int iIntValue2 = ((Number) entry.getValue()).intValue();
                        c1350920lG6.getClass();
                        C1350920lG6.LLIIII(charSequence2, "system_emoji_board", iIntValue2, 0, "", null, commentContextSource);
                    }
                }
            }
        }
    }
}
