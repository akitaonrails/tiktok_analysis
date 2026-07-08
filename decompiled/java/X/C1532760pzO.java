package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0pzO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532760pzO {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C1534380q20 c1534380q20, String str, String str2, String str3, Throwable th, Map map) {
        c1534380q20.LIZIZ(str, str2, str3);
        C1534750q2b c1534750q2b = new C1534750q2b(str, str2, str3, th, map);
        InterfaceC1532860pzY.LIZ.getClass();
        InterfaceC1532860pzY interfaceC1532860pzY = C1532910pzd.LIZJ;
        if (interfaceC1532860pzY != null) {
            interfaceC1532860pzY.LIZ(c1534750q2b);
        }
    }

    public static /* synthetic */ void LIZIZ(C1534380q20 c1534380q20, String str, String str2, String str3, Throwable th, Map map, int i) {
        Throwable th2 = th;
        Map map2 = null;
        if ((i & 16) != 0) {
            th2 = null;
        }
        if ((i & 32) == 0) {
            map2 = map;
        }
        LIZ(c1534380q20, str, str2, str3, th2, map2);
    }

    public static void LIZJ(C1534380q20 c1534380q20, String str, String str2, String str3, Throwable th, Map map, int i) {
        Throwable th2 = th;
        Map map2 = null;
        if ((i & 16) != 0) {
            th2 = null;
        }
        if ((i & 32) == 0) {
            map2 = map;
        }
        c1534380q20.LIZIZ(str, str2, str3);
        C1534750q2b c1534750q2b = new C1534750q2b(str, str2, str3, th2, map2);
        InterfaceC1532860pzY.LIZ.getClass();
        InterfaceC1532860pzY interfaceC1532860pzY = C1532910pzd.LIZJ;
        if (interfaceC1532860pzY != null) {
            interfaceC1532860pzY.LIZ(c1534750q2b);
        }
        C1535890q4R.LIZ.getClass();
        if (C1535890q4R.LIZIZ) {
            if (th2 == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("illegal reach at ");
                sbLIZ.append(str);
                sbLIZ.append('$');
                sbLIZ.append(str2);
                sbLIZ.append(", ");
                sbLIZ.append(str3);
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }
}
