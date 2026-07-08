package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.07d7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1904707d7 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(java.lang.String r5) {
        /*
            java.lang.String r0 = "/obj/"
            r4 = 0
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r5, r0, r4)     // Catch: java.lang.Exception -> L3c
            if (r0 == 0) goto L39
            r0 = 1
            char[] r2 = new char[r0]     // Catch: java.lang.Exception -> L3c
            r3 = 47
            r2[r4] = r3     // Catch: java.lang.Exception -> L3c
            r0 = 2
            r1 = 4
            java.util.List r2 = kotlin.text.a0.LJJLIIIJ(r5, r2, r4, r1, r0)     // Catch: java.lang.Exception -> L3c
            int r0 = r2.size()     // Catch: java.lang.Exception -> L3c
            if (r0 != r1) goto L39
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L3c
            r1.append(r3)     // Catch: java.lang.Exception -> L3c
            r0 = 3
            java.lang.Object r0 = r2.get(r0)     // Catch: java.lang.Exception -> L3c
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L3c
            r1.append(r0)     // Catch: java.lang.Exception -> L3c
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L3c
        L31:
            X.0uus r0 = X.C1717770unn.LIZJ()     // Catch: java.lang.Exception -> L3c
            r0.isOffline()     // Catch: java.lang.Exception -> L3c
            goto L3b
        L39:
            r1 = r5
            goto L31
        L3b:
            return r1
        L3c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C1AF0.LJ(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1904707d7.LIZIZ(java.lang.String):java.lang.String");
    }

    public static Object LIZ(String str, Map map) {
        Object next;
        if (map == null) {
            return null;
        }
        try {
            Object obj = map.get(str);
            if (obj != null) {
                return obj;
            }
            String strLIZIZ = LIZIZ(str);
            Object obj2 = map.get(strLIZIZ);
            if (obj2 != null) {
                return obj2;
            }
            Iterator it2 = map.entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    String str2 = (String) ((Map.Entry) next).getKey();
                    boolean z = false;
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        boolean z2 = true;
                        if (i >= str2.length()) {
                            break;
                        }
                        if (str2.charAt(i) != '*') {
                            z2 = false;
                        }
                        if (z2) {
                            i2++;
                        }
                        i++;
                    }
                    if (i2 == 1) {
                        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str2, new String[]{"*"}, 0, 6);
                        if ((u.LJJIIJZLJL(str2, "*", false) || u.LJJIIJZLJL(strLIZIZ, (String) ListProtector.get(listLJJLIIIJILLIZJL, 0), false)) && (u.LJIIZILJ(str2, "*", false) || u.LJIIZILJ(strLIZIZ, (String) C13LP.LJJLIIIJJI(listLJJLIIIJILLIZJL), false))) {
                            z = true;
                        }
                    }
                    if (z) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry != null) {
                Object value = entry.getValue();
                if (value != null) {
                    return value;
                }
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return null;
        }
    }
}
