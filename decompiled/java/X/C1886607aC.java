package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: X.07aC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1886607aC {
    public static String LIZ(String str, String str2) {
        String strGroup = null;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(".*(((");
            sbLIZ.append(str2);
            sbLIZ.append("=[^;]*)|(");
            sbLIZ.append(str2);
            sbLIZ.append("=\"[\";]*))|(");
            sbLIZ.append(str2);
            sbLIZ.append("=.*$)).*");
            Matcher matcher = PatternProtector.compile(C2188811AlT.LIZIZ(sbLIZ)).matcher(str);
            if (!matcher.matches()) {
                return null;
            }
            strGroup = matcher.group(1);
            return strGroup;
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return strGroup;
        }
    }
}
