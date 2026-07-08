package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.hybridkit.ssc.utils.HostReg;
import com.ss.android.ugc.aweme.hybridkit.ssc.utils.Path;
import com.ss.android.ugc.aweme.hybridkit.ssc.utils.PathReg;
import com.ss.android.ugc.aweme.hybridkit.ssc.utils.RuleUnit;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: X.0ptE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1528940ptE {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017f  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C08N7 LIZIZ(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1528940ptE.LIZIZ(java.lang.String):X.08N7");
    }

    public static String LJ(String str) {
        Uri uri;
        if (C830060WhI.LIZ(str) || (uri = UriProtector.parse(str)) == null) {
            return null;
        }
        return uri.getPath();
    }

    public static String LIZ(String str, Map<String, String> map) {
        if (C830060WhI.LIZ(str)) {
            return null;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.endsWith(entry.getKey())) {
                return entry.getValue();
            }
        }
        return null;
    }

    public static String LJFF(String str, List list) {
        if (list != null && !list.isEmpty() && !C830060WhI.LIZ(str)) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                HostReg hostReg = (HostReg) it2.next();
                String str2 = hostReg.test;
                if (!C830060WhI.LIZ(str2)) {
                    try {
                        if (PatternProtector.compile(str2).matcher(str).find()) {
                            return hostReg.key;
                        }
                        continue;
                    } catch (PatternSyntaxException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C08N7 LIZJ(com.ss.android.ugc.aweme.hybridkit.ssc.utils.RuleUnit r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1528940ptE.LIZJ(com.ss.android.ugc.aweme.hybridkit.ssc.utils.RuleUnit, java.lang.String, java.lang.String):X.08N7");
    }

    public static C08N7 LIZLLL(String str, String str2, Map map) {
        RuleUnit ruleUnit;
        Path path = (Path) map.get(str2);
        String strLJ = LJ(str);
        C08N7 c08n7 = new C08N7();
        c08n7.LIZ = C786410Ut5.j4("%s%s", new Object[]{str2, strLJ});
        if (path == null) {
            return c08n7;
        }
        RuleUnit ruleUnit2 = path.exact.get(strLJ);
        if (ruleUnit2 != null) {
            c08n7 = LIZJ(ruleUnit2, str, str2);
        }
        List<PathReg> list = path.regs;
        if (!list.isEmpty()) {
            for (PathReg pathReg : list) {
                String str3 = pathReg.test;
                if (!C830060WhI.LIZ(str3) && !C830060WhI.LIZ(strLJ)) {
                    try {
                        if (PatternProtector.compile(str3).matcher(strLJ).find() && (ruleUnit = pathReg.rule) != null) {
                            c08n7 = LIZJ(ruleUnit, str, str2);
                            return c08n7;
                        }
                    } catch (PatternSyntaxException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
        return c08n7;
    }
}
