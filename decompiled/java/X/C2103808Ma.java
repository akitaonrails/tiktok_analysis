package X;

import android.app.ActivityManager;
import android.app.Service;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.08Ma, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2103808Ma {
    public static String LIZ;

    public static String LIZ(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(CardStruct.IStatusCode.DEFAULT);
                sbLIZ.append(hexString);
                hexString = C2188811AlT.LIZIZ(sbLIZ);
            }
            sb.append(hexString);
            sb.append("");
        }
        return sb.toString().toUpperCase().trim();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(4:70|27|60|28)|(4:29|(1:31)(1:72)|45|(1:47)(2:(4:68|49|(4:52|(3:74|54|77)(1:76)|75|50)|73)|57))|32|58|33|45|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c1, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(android.content.Context r6) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2103808Ma.LIZIZ(android.content.Context):java.lang.String");
    }

    public static boolean LIZJ(Context context) {
        String strLIZIZ = LIZIZ(context);
        if (strLIZIZ == null || strLIZIZ.contains(":") || !strLIZIZ.equals(context.getPackageName())) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(Context context, Class<? extends Service> cls) {
        if (context != null && cls != null) {
            try {
                for (ActivityManager.RunningServiceInfo runningServiceInfo : C2204961BRm.LJIIIIZZ((ActivityManager) C786410Ut5.H2(context, "activity"), Integer.MAX_VALUE, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe/bvZip/6gIBD6uwdlSu5D6RQ/6M4", null))) {
                    if (runningServiceInfo != null && runningServiceInfo.service != null && TextUtils.equals(cls.getName(), C2204961BRm.LJJIJIIJIL(runningServiceInfo.service, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe/bvZip/6gIBD6uwdlSu5D6RQ/6M4", null)))) {
                        return true;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }
}
