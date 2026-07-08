package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0VY9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VY9 {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("zero", "one", "two", "few", "many", "other");
    public static final Pattern LIZIZ = PatternProtector.compile("\\{([a-zA-Z_][a-zA-Z0-9_]*)\\}");
    public static final Pattern LIZJ = PatternProtector.compile("\\{\\{([a-zA-Z_][a-zA-Z0-9_]*)\\}\\}");

    public static String LIZ(String str, Map map, boolean z) {
        Pattern pattern;
        String strQuoteReplacement;
        if (z) {
            pattern = LIZJ;
        } else {
            pattern = LIZIZ;
        }
        Matcher matcher = pattern.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            Object obj = map.get(matcher.group(1));
            if (obj == null) {
                strQuoteReplacement = matcher.group(0);
            } else {
                strQuoteReplacement = Matcher.quoteReplacement(obj.toString());
            }
            matcher.appendReplacement(stringBuffer, strQuoteReplacement);
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
