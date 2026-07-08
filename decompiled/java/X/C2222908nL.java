package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08nL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2222908nL {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(String str) {
        if (str != null && !TextUtils.isEmpty(str)) {
            try {
                if (Intrinsics.LJFF("mounted", C786410Ut5.X3())) {
                    C0VSJ c0vsj = new C0VSJ(str);
                    if (c0vsj.exists()) {
                        c0vsj.delete();
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079 A[Catch: IOException -> 0x00a8, TRY_ENTER, TryCatch #10 {IOException -> 0x00a8, blocks: (B:17:0x0044, B:19:0x004f, B:45:0x0079, B:47:0x007e, B:49:0x0083, B:65:0x00a4, B:59:0x0095, B:61:0x009a, B:63:0x009f), top: B:93:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e A[Catch: IOException -> 0x00a8, TryCatch #10 {IOException -> 0x00a8, blocks: (B:17:0x0044, B:19:0x004f, B:45:0x0079, B:47:0x007e, B:49:0x0083, B:65:0x00a4, B:59:0x0095, B:61:0x009a, B:63:0x009f), top: B:93:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083 A[Catch: IOException -> 0x00a8, TryCatch #10 {IOException -> 0x00a8, blocks: (B:17:0x0044, B:19:0x004f, B:45:0x0079, B:47:0x007e, B:49:0x0083, B:65:0x00a4, B:59:0x0095, B:61:0x009a, B:63:0x009f), top: B:93:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0095 A[Catch: IOException -> 0x00a8, TRY_ENTER, TryCatch #10 {IOException -> 0x00a8, blocks: (B:17:0x0044, B:19:0x004f, B:45:0x0079, B:47:0x007e, B:49:0x0083, B:65:0x00a4, B:59:0x0095, B:61:0x009a, B:63:0x009f), top: B:93:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009a A[Catch: IOException -> 0x00a8, TryCatch #10 {IOException -> 0x00a8, blocks: (B:17:0x0044, B:19:0x004f, B:45:0x0079, B:47:0x007e, B:49:0x0083, B:65:0x00a4, B:59:0x0095, B:61:0x009a, B:63:0x009f), top: B:93:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009f A[Catch: IOException -> 0x00a8, TryCatch #10 {IOException -> 0x00a8, blocks: (B:17:0x0044, B:19:0x004f, B:45:0x0079, B:47:0x007e, B:49:0x0083, B:65:0x00a4, B:59:0x0095, B:61:0x009a, B:63:0x009f), top: B:93:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b9 A[Catch: IOException -> 0x00c7, TryCatch #9 {IOException -> 0x00c7, blocks: (B:73:0x00b4, B:75:0x00b9, B:77:0x00be, B:79:0x00c3), top: B:91:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00be A[Catch: IOException -> 0x00c7, TryCatch #9 {IOException -> 0x00c7, blocks: (B:73:0x00b4, B:75:0x00b9, B:77:0x00be, B:79:0x00c3), top: B:91:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c3 A[Catch: IOException -> 0x00c7, TRY_LEAVE, TryCatch #9 {IOException -> 0x00c7, blocks: (B:73:0x00b4, B:75:0x00b9, B:77:0x00be, B:79:0x00c3), top: B:91:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.lang.String r11, java.lang.String r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2222908nL.LIZ(java.lang.String, java.lang.String):void");
    }

    public static void LIZIZ(String str, boolean z) {
        if (str != null && !TextUtils.isEmpty(str)) {
            C0VSJ c0vsj = new C0VSJ(str);
            if (!c0vsj.exists()) {
                if (!z) {
                    c0vsj.mkdirs();
                    return;
                }
                try {
                    File parentFile = c0vsj.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    c0vsj.createNewFile();
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }
}
