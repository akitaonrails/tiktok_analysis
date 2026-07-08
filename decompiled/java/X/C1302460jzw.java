package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.AFwS258S0000000_20;

/* JADX INFO: renamed from: X.0jzw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1302460jzw {
    public static String LIZ(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("UNKNOWN (");
                            sbLIZ.append(i);
                            sbLIZ.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }
                        return "EXTERNAL";
                    }
                    return "SPEAKER";
                }
                return "WIRED_HEADSET";
            }
            return "Bluetooth Device";
        }
        return "EARPIECE";
    }

    public static String LIZJ(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[**:**:**:**:");
        sbLIZ.append(C13LN.LL(4, str));
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C1302410jzr LIZLLL(List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1302410jzr c1302410jzr = (C1302410jzr) it2.next();
            if (c1302410jzr.LLILLJJLI == 4) {
                return c1302410jzr;
            }
        }
        return null;
    }

    public static boolean LJ(C1302410jzr c1302410jzr) {
        if (c1302410jzr == null || c1302410jzr.LLILLJJLI != 1) {
            return false;
        }
        return true;
    }

    public static void LJFF(List list) {
        if (!((ArrayList) list).isEmpty()) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                if (((C1302410jzr) it2.next()).LLILLJJLI == 3) {
                    final AFwS258S0000000_20 aFwS258S0000000_20 = AFwS258S0000000_20.get$arr$(17);
                    ((ArrayList) list).removeIf(new Predicate() { // from class: X.0jzy
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return ((Boolean) aFwS258S0000000_20.invoke(obj)).booleanValue();
                        }
                    });
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZIZ(int r15, android.content.Context r16, java.util.List r17) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1302460jzw.LIZIZ(int, android.content.Context, java.util.List):java.util.List");
    }
}
