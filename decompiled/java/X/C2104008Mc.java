package X;

import android.content.Context;
import com.bytedance.common.utility.Logger;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.08Mc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2104008Mc {
    public static final AtomicInteger LIZ = new AtomicInteger(0);
    public static volatile String LIZIZ = null;

    /* JADX WARN: Can't wrap try/catch for region: R(10:61|28|63|29|(4:30|(1:32)(1:73)|46|(1:48)(2:(4:59|50|(4:53|(3:75|55|78)(1:77)|76|51)|74)|58))|33|65|34|46|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c8, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(android.content.Context r6) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2104008Mc.LIZ(android.content.Context):java.lang.String");
    }

    public static boolean LIZIZ(Context context) {
        String strLIZ = LIZ(context);
        if (strLIZ == null || strLIZ.contains(":") || !strLIZ.equals(context.getPackageName())) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(Context context) {
        Logger.debug();
        int i = LIZ.get();
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            return LIZIZ(context);
        }
        return false;
    }
}
