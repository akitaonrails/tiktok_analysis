package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0dD8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1041560dD8 {
    /* JADX WARN: Can't wrap try/catch for region: R(63:0|2|(1:4)(2:72|(2:74|(1:79)))|5|(1:7)(58:29|(7:31|(1:71)(1:37)|38|(3:40|(1:42)(8:48|(3:51|(2:252|53)(1:253)|49)|236|54|(1:56)|57|232|58)|43)(2:64|(3:240|66|(1:68)(0))(0))|44|(1:46)|47)|9|(1:11)(1:28)|12|(2:16|(3:18|(3:22|(4:25|(3:248|27|251)(1:250)|249|23)|247)|80))|81|(1:83)(1:94)|84|(1:86)|87|(1:89)|90|(1:92)|93|95|243|96|104|(1:106)(1:139)|107|(6:109|(1:113)|114|(1:118)|119|(1:121)(2:136|(1:138)))|(1:123)|124|(1:135)(1:128)|129|(1:133)|134|140|234|141|147|150|(1:152)(1:231)|153|(2:155|(1:157))(1:(4:224|(1:230)(1:228)|229|157))|158|(1:160)(1:222)|161|(1:165)|166|(1:168)|169|(1:171)|172|(1:175)|176|(1:178)(1:(2:216|(1:218)(2:219|(1:221))))|179|(1:181)|182|(1:184)|185|(1:187)(6:199|(1:206)(1:205)|238|207|(1:211)|214)|188|(1:196)|197|198)|8|9|(0)(0)|12|(3:14|16|(0))|81|(0)(0)|84|(0)|87|(0)|90|(0)|93|95|243|96|104|(0)(0)|107|(0)|(0)|124|(2:126|135)(0)|129|(2:131|133)|134|140|234|141|147|150|(0)(0)|153|(0)(0)|158|(0)(0)|161|(2:163|165)(0)|166|(0)|169|(0)|172|(1:175)|176|(0)(0)|179|(0)|182|(0)|185|(0)(0)|188|(4:190|192|194|196)|197|198|(2:(0)|(1:246))) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0217, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x021a, code lost:
    
        r2 = ((java.lang.Integer) X.AbstractC1041580dDA.LJI(r14, "page_depth_of_report_show", r19, "page_depth_of_report_show", java.lang.Integer.class, 0)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0232, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0233, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2);
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x04be, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x04bf, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x04c3, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x04c4, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x04c7, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x04cd, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x04ce, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0214, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x05b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fd  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1041660dDI LIZ(android.os.Bundle r19) {
        /*
            Method dump skipped, instruction units count: 1906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1041560dD8.LIZ(android.os.Bundle):X.0dDI");
    }

    public static void LIZIZ(boolean z, Uri uri) {
        int i;
        try {
            String path = uri.getPath();
            if (TextUtils.isEmpty(path)) {
                return;
            }
            HashMap map = new HashMap();
            map.put("url", path);
            String host = uri.getHost();
            if (!TextUtils.isEmpty(host)) {
                map.put("host", host);
            }
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            map.put("is_sec_url_wrapped", String.valueOf(i));
            C20684815ws.LJIILLIIL("awewebview_append_common_params", map);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
