package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.google.api.client.googleapis.GoogleUtils;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: X.09Nz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2363709Nz {
    public static final String LIZIZ = new C2363709Nz().LIZ;
    public final String LIZ;

    public C2363709Nz() {
        String property = System.getProperty("java.version");
        String strLIZIZ = null;
        if (property != null) {
            String strLIZ = LIZ(property, null);
            if (strLIZ != null) {
                strLIZIZ = strLIZ;
            } else {
                Matcher matcher = PatternProtector.compile("^(\\d+)[^\\d]?").matcher(property);
                if (matcher.find()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(matcher.group(1));
                    sbLIZ.append(".0.0");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        }
        String strValue = C09O0.OS_NAME.value();
        String strValue2 = C09O0.OS_VERSION.value();
        String str = GoogleUtils.LIZ;
        StringBuilder sb = new StringBuilder("gl-java/");
        sb.append(LIZ(strLIZIZ, strLIZIZ));
        sb.append(" gdcl/");
        sb.append(LIZ(str, str));
        if (strValue != null && strValue2 != null) {
            sb.append(" ");
            sb.append(strValue.toLowerCase().replaceAll("[^\\w\\d\\-]", "-"));
            sb.append("/");
            sb.append(LIZ(strValue2, strValue2));
        }
        this.LIZ = sb.toString();
    }

    public final String toString() {
        return this.LIZ;
    }

    public static String LIZ(String str, String str2) {
        if (str == null) {
            return null;
        }
        Matcher matcher = PatternProtector.compile("(\\d+\\.\\d+\\.\\d+).*").matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return str2;
    }
}
