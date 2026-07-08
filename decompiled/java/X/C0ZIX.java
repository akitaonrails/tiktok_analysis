package X;

import Y.AComparatorS33S0000000_14;
import android.text.SpannableStringBuilder;
import com.ss.android.ugc.aweme.lexical.platform.span.MentionSpan;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ZIX, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZIX {
    public static final Map<String, C0ZIY> LIZ = new LinkedHashMap();

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C07ZX LIZ(java.lang.CharSequence r15) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ZIX.LIZ(java.lang.CharSequence):X.07ZX");
    }

    public static CharSequence LIZIZ(String str, Integer num, Map map, Function0 function0) {
        int iIntValue;
        int i;
        C0ZIY c0ziy;
        if (str.length() == 0) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("parseDesc: input=");
        sbLIZ.append(str);
        C1454340nwu.LIZ("DescRequestHelperV2", C2188811AlT.LIZIZ(sbLIZ));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        ArrayList<C0ZIZ> arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            int iLJJJ = a0.LJJJ(spannableStringBuilder, "@KK~m-", i2, false, 4);
            if (iLJJJ < 0) {
                break;
            }
            i2 = iLJJJ + 6;
            int i3 = i2;
            while (i3 < spannableStringBuilder.length() && Character.isDigit(spannableStringBuilder.charAt(i3))) {
                i3++;
            }
            if (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == '^' && (i = i3 + 1) >= 0 && (c0ziy = (C0ZIY) map.get(spannableStringBuilder.subSequence(iLJJJ, i).toString())) != null) {
                arrayList.add(new C0ZIZ(iLJJJ, i, c0ziy));
                i2 = i;
            }
        }
        if (arrayList.isEmpty()) {
            return spannableStringBuilder;
        }
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS33S0000000_14(11));
        }
        for (C0ZIZ c0ziz : arrayList) {
            int i4 = c0ziz.LIZ;
            String str2 = c0ziz.LIZJ.LIZLLL;
            int i5 = c0ziz.LIZIZ;
            if (i4 >= 0 && i5 <= spannableStringBuilder.length() && i4 < i5) {
                spannableStringBuilder.replace(i4, i5, (CharSequence) str2);
                int length = str2.length() + i4;
                if (length <= spannableStringBuilder.length() && i4 < length) {
                    String userId = c0ziz.LIZJ.LIZJ.getUserId();
                    C0ZIY c0ziy2 = c0ziz.LIZJ;
                    int i6 = c0ziy2.LIZ;
                    String atUserType = c0ziy2.LIZJ.getAtUserType();
                    String secUid = c0ziz.LIZJ.LIZJ.getSecUid();
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    MentionSpan mentionSpan = new MentionSpan(str2, iIntValue, c0ziz.LIZJ.LIZJ.getCommentId(), userId, atUserType, i6, secUid);
                    if (i6 == 5) {
                        String awemeId = c0ziz.LIZJ.LIZJ.getAwemeId();
                        mentionSpan.awemeId = awemeId;
                        mentionSpan.mStruct.setAwemeId(awemeId);
                        mentionSpan.LIZ(c0ziz.LIZJ.LIZIZ);
                    }
                    C786410Ut5.q2(spannableStringBuilder, mentionSpan, i4, length, 33);
                    if (i6 == 5) {
                        C786410Ut5.q2(spannableStringBuilder, function0.invoke(), i4, length, 33);
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("parseDesc: set span [");
                    sbLIZ2.append(i4);
                    sbLIZ2.append(", ");
                    sbLIZ2.append(length);
                    sbLIZ2.append(')');
                    C1454340nwu.LIZ("DescRequestHelperV2", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }
        C1454340nwu.LIZ("DescRequestHelperV2", "parseDesc: result=" + ((Object) spannableStringBuilder));
        return spannableStringBuilder;
    }
}
