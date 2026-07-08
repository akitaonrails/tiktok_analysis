package X;

import android.content.Context;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0W7O, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W7O {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00df A[Catch: Exception -> 0x01b8, all -> 0x01ce, TryCatch #3 {Exception -> 0x01b8, blocks: (B:39:0x00d1, B:41:0x00df, B:43:0x00e3, B:46:0x00f2, B:48:0x010c, B:50:0x0114, B:51:0x011a, B:53:0x0120, B:55:0x012a, B:62:0x0142, B:64:0x014b, B:57:0x012f, B:59:0x0137, B:82:0x01b0, B:83:0x01b7), top: B:101:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b0 A[Catch: Exception -> 0x01b8, all -> 0x01ce, TRY_ENTER, TryCatch #3 {Exception -> 0x01b8, blocks: (B:39:0x00d1, B:41:0x00df, B:43:0x00e3, B:46:0x00f2, B:48:0x010c, B:50:0x0114, B:51:0x011a, B:53:0x0120, B:55:0x012a, B:62:0x0142, B:64:0x014b, B:57:0x012f, B:59:0x0137, B:82:0x01b0, B:83:0x01b7), top: B:101:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d2  */
    /* JADX WARN: Type inference failed for: r1v12, types: [X.0W7M] */
    /* JADX WARN: Type inference failed for: r9v3, types: [X.0W7L, android.content.ServiceConnection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0W7P LIZ(android.content.Context r15) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0W7O.LIZ(android.content.Context):X.0W7P");
    }

    public static boolean LIZIZ(Context context) {
        Method methodLJIIIZ = C0W7Q.LJIIIZ("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (methodLJIIIZ == null) {
            return false;
        }
        Object objLJIIJJI = C0W7Q.LJIIJJI(null, methodLJIIIZ, context);
        if ((objLJIIJJI instanceof Integer) && Intrinsics.LJFF(objLJIIJJI, 0)) {
            return true;
        }
        return false;
    }
}
