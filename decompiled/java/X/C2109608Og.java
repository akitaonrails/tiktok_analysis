package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08Og, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2109608Og {
    public static final Keva LIZ = Keva.getRepo("preinstall_multi_language_repo");

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ() {
        /*
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            java.lang.String r1 = X.C844470XAv.LJIILL
            java.lang.String r0 = "googleplay"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r4 = 1
            r5 = 0
            if (r0 != 0) goto L5a
            java.lang.String r0 = "local_test"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L5a
            com.bytedance.keva.Keva r1 = X.C2109608Og.LIZ
            java.lang.String r3 = "is_compress_language"
            boolean r0 = r1.contains(r3)
            if (r0 == 0) goto L28
            boolean r0 = r1.getBoolean(r3, r5)
            return r0
        L28:
            boolean r0 = X.C844470XAv.LJIJI
            if (r0 != 0) goto L54
            android.content.Context r0 = X.C844470XAv.LIZ()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4f
            android.content.pm.PackageManager r2 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4f
            android.content.Context r0 = X.C844470XAv.LIZ()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4f
            java.lang.String r1 = r0.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4f
            r0 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r0 = X.C786410Ut5.V3(r2, r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4f
            android.os.Bundle r1 = r0.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4f
            if (r1 == 0) goto L53
            java.lang.String r0 = "compress_language_resources"
            boolean r0 = r1.getBoolean(r0, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4f
            if (r0 != r4) goto L53
            goto L54
        L4f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L53:
            r4 = 0
        L54:
            com.bytedance.keva.Keva r0 = X.C2109608Og.LIZ
            r0.storeBoolean(r3, r4)
            return r4
        L5a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2109608Og.LIZJ():boolean");
    }

    public static boolean LIZIZ(Context context, String str, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("compressed_languages/");
        sbLIZ.append(str);
        sbLIZ.append(".apk");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("splitcompat/");
        C844470XAv.LIZ.getClass();
        sbLIZ2.append(C844470XAv.LJ());
        sbLIZ2.append("/verified-splits");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("base-");
        sbLIZ3.append(str);
        sbLIZ3.append(".apk");
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        try {
            LIZ(context, strLIZIZ, strLIZIZ2, strLIZIZ3);
            if (z) {
                LIZ.storeBoolean("has_finish_first_launch_process", true);
            }
            LIZ.storeBoolean(strLIZIZ3, true);
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7 A[Catch: all -> 0x00ce, LOOP:0: B:28:0x00b1->B:30:0x00b7, LOOP_END, TRY_LEAVE, TryCatch #11 {all -> 0x00ce, blocks: (B:27:0x00af, B:28:0x00b1, B:30:0x00b7), top: B:84:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00bb A[EDGE_INSN: B:86:0x00bb->B:31:0x00bb BREAK  A[LOOP:0: B:28:0x00b1->B:30:0x00b7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.content.Context r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2109608Og.LIZ(android.content.Context, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
