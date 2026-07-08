package X;

import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.ArrayList;
import java.util.regex.Matcher;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0XjY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856940XjY {
    public static String LIZ = "";
    public static String LIZIZ = "";

    public static String LJ() {
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "hashtag_multi_language_and_emoji", true) == 0) {
            return !TextUtils.isEmpty(LIZ) ? LIZ : "#([\\u0030-\\u0039\\u0041-\\u005A\\u005F\\u0061-\\u007A\\u00C0-\\u02B8\\u0370-\\u058F\\u0600-\\u077F\\u0900-\\u1DBF\\u1E00-\\u1FFF\\u2150-\\u218F\\u2C00-\\u2DDF\\u2E80-\\u2FDF\\u3040-\\u31FF\\u3400-\\u4DBF\\u4E00-\\uA6FF\\uA720-\\uABFF\\uAC00-\\uD7A3]|[\\uFF61-\\uFF9F\\uFFE8-\\uFFEE\\uFF10-\\uFF19\\uFF21-\\uFF3A\\uFF41-\\uFF5A\\u3040-\\u309F\\u30A0-\\u30FF\\uFF01-\\uFF5E\\uFFE0-\\uFFE5]|(?:[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?|[\\u200d\\uFE0F?]))+";
        }
        SettingsManager.LIZLLL().getClass();
        if (!TextUtils.isEmpty(SettingsManager.LJI("new_hashtag_regex", "")) && TextUtils.isEmpty(LIZIZ)) {
            LIZIZ = "#($newHashTagRegexSetting)+";
        }
        return TextUtils.isEmpty(LIZIZ) ? !TextUtils.isEmpty(LIZ) ? LIZ : "#([\\u0030-\\u0039\\u0041-\\u005A\\u005F\\u0061-\\u007A\\u00C0-\\u02B8\\u0370-\\u058F\\u0600-\\u077F\\u0900-\\u1DBF\\u1E00-\\u1FFF\\u2150-\\u218F\\u2C00-\\u2DDF\\u2E80-\\u2FDF\\u3040-\\u31FF\\u3400-\\u4DBF\\u4E00-\\uA6FF\\uA720-\\uABFF\\uAC00-\\uD7A3]|[\\uFF61-\\uFF9F\\uFFE8-\\uFFEE\\uFF10-\\uFF19\\uFF21-\\uFF3A\\uFF41-\\uFF5A\\u3040-\\u309F\\u30A0-\\u30FF\\uFF01-\\uFF5E\\uFFE0-\\uFFE5]|(?:[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?|[\\u200d\\uFE0F?]))+" : LIZIZ;
    }

    public static boolean LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJ());
        sbLIZ.append(e3.c);
        return PatternProtector.compile(C2188811AlT.LIZIZ(sbLIZ)).matcher(str).find();
    }

    public static ArrayList<String> LIZLLL(String str) {
        Matcher matcher = PatternProtector.compile(LJ()).matcher(str);
        ArrayList<String> arrayList = new ArrayList<>();
        while (matcher.find()) {
            arrayList.add(matcher.group());
        }
        return arrayList;
    }

    public static C857030Xjh LIZ(int i, String str) {
        if (str == null) {
            return new C857030Xjh("", 0, 0);
        }
        C857030Xjh c857030Xjh = new C857030Xjh();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("#");
        sbLIZ.append(str);
        sbLIZ.append(" ");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c857030Xjh.LIZ = i;
        c857030Xjh.LIZJ = strLIZIZ;
        c857030Xjh.LIZIZ = i + strLIZIZ.length();
        return c857030Xjh;
    }

    public static C857030Xjh LIZIZ(String str, String str2) {
        if (str2 != null && str != null) {
            C857030Xjh c857030Xjh = new C857030Xjh();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("#");
            sbLIZ.append(str2);
            sbLIZ.append(" ");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            int length = str.length();
            c857030Xjh.LIZ = length;
            c857030Xjh.LIZJ = strLIZIZ;
            c857030Xjh.LIZIZ = length + strLIZIZ.length();
            return c857030Xjh;
        }
        return new C857030Xjh("", 0, 0);
    }
}
