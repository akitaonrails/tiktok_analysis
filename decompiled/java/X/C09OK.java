package X;

import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.09OK, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09OK {
    public static final C0K6E LIZ(Integer num, Throwable th) {
        boolean z;
        Integer num2 = num;
        if (th == null) {
            return new C0K6E(num2, 30);
        }
        Integer num3 = (Integer) C09RB.LJIIL(C09RB.LJIJI(C09RB.LJIJI(C13LQ.LJIIJJI(new String[]{"errorCode", "code", "statusCode"}), new AwS582S0100000_3(th, 19)), AnonymousClass0207.get$arr$(5)));
        if (num3 == null || num3.intValue() == 0) {
            num3 = num2;
        }
        String strLIZJ = C2188008hi.LIZJ(th, "errorMsg", "message");
        String strLIZJ2 = C2188008hi.LIZJ(th, "xTtLogId", "logId");
        String strLIZJ3 = C2188008hi.LIZJ(th, "prompt");
        if (num3 != null) {
            num2 = num3;
        }
        if (strLIZJ == null) {
            strLIZJ = th.getMessage();
        }
        if (num3 == null && ((strLIZJ2 == null || a0.LJJJIL(strLIZJ2)) && (strLIZJ3 == null || a0.LJJJIL(strLIZJ3)))) {
            z = false;
        } else {
            z = true;
        }
        return new C0K6E(strLIZJ, num2, strLIZJ3, z, strLIZJ2);
    }
}
