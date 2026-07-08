package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w7k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1768580w7k {
    public static final C1768580w7k LIZ = new C1768580w7k();

    public static boolean LIZIZ(Uri uri) {
        if (uri == null) {
            return false;
        }
        String host = uri.getHost();
        String path = uri.getPath();
        if (!Intrinsics.LJFF(host, "ec") || !Intrinsics.LJFF(path, "/lynxview")) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(Uri uri) {
        if (uri == null) {
            return false;
        }
        String host = uri.getHost();
        String path = uri.getPath();
        if (!Intrinsics.LJFF(host, "ec") || !Intrinsics.LJFF(path, "/webview")) {
            return false;
        }
        return true;
    }

    public static void LIZLLL(Context context, Uri uri) {
        try {
            Uri.Builder builderBuildUpon = uri.buildUpon();
            builderBuildUpon.scheme("aweme");
            SmartRouter.buildRoute(context, builderBuildUpon.build().toString()).open();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0278, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x027c, code lost:
    
        throw r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x017f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[LOOP:0: B:20:0x0078->B:180:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0193 A[Catch: all -> 0x01a2, TRY_LEAVE, TryCatch #2 {all -> 0x01a2, blocks: (B:82:0x0179, B:87:0x0193, B:86:0x018f, B:84:0x017f), top: B:148:0x0179, inners: #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri LIZ(android.net.Uri r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1768580w7k.LIZ(android.net.Uri, boolean, boolean):android.net.Uri");
    }
}
