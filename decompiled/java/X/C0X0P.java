package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0X0P, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X0P {
    public static final Pattern LJ = PatternProtector.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern LJFF = PatternProtector.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        return this.LIZ;
    }

    public static C0X0P LIZIZ(String str) {
        Matcher matcher = LJ.matcher(str);
        if (matcher.lookingAt()) {
            String strGroup = matcher.group(1);
            Locale locale = Locale.US;
            String lowerCase = strGroup.toLowerCase(locale);
            String lowerCase2 = matcher.group(2).toLowerCase(locale);
            Matcher matcher2 = LJFF.matcher(str);
            String str2 = null;
            for (int iEnd = matcher.end(); iEnd < str.length(); iEnd = matcher2.end()) {
                matcher2.region(iEnd, str.length());
                if (matcher2.lookingAt()) {
                    String strGroup2 = matcher2.group(1);
                    if (strGroup2 != null && strGroup2.equalsIgnoreCase("charset")) {
                        String strGroup3 = matcher2.group(2);
                        if (strGroup3 != null) {
                            if (strGroup3.startsWith("'") && strGroup3.endsWith("'") && strGroup3.length() > 2) {
                                strGroup3 = strGroup3.substring(1, strGroup3.length() - 1);
                            }
                        } else {
                            strGroup3 = matcher2.group(3);
                        }
                        if (str2 != null && !strGroup3.equalsIgnoreCase(str2)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Multiple charsets defined: \"");
                            sbLIZ.append(str2);
                            sbLIZ.append("\" and: \"");
                            sbLIZ.append(strGroup3);
                            sbLIZ.append("\" for: \"");
                            sbLIZ.append(str);
                            sbLIZ.append('\"');
                            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        str2 = strGroup3;
                    }
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Parameter is not formatted correctly: \"");
                    sbLIZ2.append(str.substring(iEnd));
                    sbLIZ2.append("\" for: \"");
                    sbLIZ2.append(str);
                    sbLIZ2.append('\"');
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            return new C0X0P(str, lowerCase, lowerCase2, str2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("No subtype found for: \"");
        sbLIZ3.append(str);
        sbLIZ3.append('\"');
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    public static C0X0P LIZJ(String str) {
        try {
            return LIZIZ(str);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final Charset LIZ(Charset charset) {
        try {
            String str = this.LIZLLL;
            if (str != null) {
                charset = Charset.forName(str);
                return charset;
            }
            return charset;
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C0X0P) && ((C0X0P) obj).LIZ.equals(this.LIZ)) {
            return true;
        }
        return false;
    }

    public C0X0P(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }
}
