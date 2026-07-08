package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.18vs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21443018vs {
    public static final Pattern LIZ = PatternProtector.compile("[\\\\&]");
    public static final Pattern LIZIZ = PatternProtector.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern LIZJ;
    public static final C21443718vz LIZLLL;

    static {
        PatternProtector.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
        LIZJ = PatternProtector.compile("[ \t\r\n]+");
        LIZLLL = new C21443718vz();
    }

    public static String LIZ(String str) {
        if (LIZ.matcher(str).find()) {
            Pattern pattern = LIZIZ;
            C21443718vz c21443718vz = LIZLLL;
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                StringBuilder sb = new StringBuilder(str.length() + 16);
                int iEnd = 0;
                do {
                    sb.append((CharSequence) str, iEnd, matcher.start());
                    C21443718vz.LIZ(matcher.group(), sb);
                    iEnd = matcher.end();
                } while (matcher.find());
                if (iEnd != str.length()) {
                    sb.append((CharSequence) str, iEnd, str.length());
                }
                return sb.toString();
            }
            return str;
        }
        return str;
    }
}
