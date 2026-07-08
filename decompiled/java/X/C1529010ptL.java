package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.ArrayList;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: X.0ptL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1529010ptL {
    public static String LIZ(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str);
        Matcher matcher = PatternProtector.compile("(<sup>(\\d+)</sup>\\s*)+<sup>(\\d+)</sup>").matcher(sb);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            String strGroup = matcher.group();
            Matcher matcher2 = PatternProtector.compile("<sup>(\\d+)</sup>").matcher(strGroup);
            StringBuilder sb2 = new StringBuilder("<sup>");
            while (matcher2.find()) {
                String strGroup2 = matcher2.group(1);
                if (strGroup2 != null) {
                    sb2.append(strGroup2);
                    sb2.append(",");
                }
            }
            sb2.deleteCharAt(sb2.length() - 1);
            sb2.append("</sup>");
            String string = sb2.toString();
            arrayList.add(new C1529020ptM(iStart, iEnd, string));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start: ");
            sbLIZ.append(iStart);
            sbLIZ.append(", end: ");
            sbLIZ.append(iEnd);
            sbLIZ.append(", group: ");
            sbLIZ.append(strGroup);
            sbLIZ.append(", merge: ");
            sbLIZ.append(string);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        for (C1529020ptM c1529020ptM : C13LP.LJLJJLL(arrayList)) {
            sb.replace(c1529020ptM.LIZ, c1529020ptM.LIZIZ, c1529020ptM.LIZJ);
        }
        return sb.toString();
    }
}
