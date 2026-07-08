package X;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.draft.model.MigrateRequireDraftResult;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0WJ9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WJ9 {
    public static final C0WJ9 LIZ = new C0WJ9();

    public static Uri LIZ(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("content://com.zhiliaoapp.musically.draftprovider/file/");
        sbLIZ.append(str);
        sbLIZ.append('&');
        sbLIZ.append(i);
        return UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static MigrateRequireDraftResult LIZJ(Context context, ContentResolver contentResolver, String str, int i) throws Throwable {
        C821050WIt.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.w2(context).getAbsolutePath());
        sbLIZ.append(File.separator);
        sbLIZ.append("migrate");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        try {
            C0VSJ c0vsj = new C0VSJ(strLIZIZ);
            if (!c0vsj.exists()) {
                c0vsj.mkdirs();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C0VSJ c0vsj2 = new C0VSJ(strLIZIZ + File.separator + str + ".zip");
        try {
            InputStream inputStreamLJ = C09NT.LJ(contentResolver, LIZ(i, str));
            if (inputStreamLJ != null) {
                Throwable th2 = null;
                try {
                    C0VSV c0vsv = new C0VSV(c0vsj2);
                    try {
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int i2 = inputStreamLJ.read(bArr);
                            if (i2 != -1) {
                                c0vsv.write(bArr, 0, i2);
                            } else {
                                c0vsv.flush();
                                C2107108Nh.LIZ(c0vsv, null);
                                C2107108Nh.LIZ(inputStreamLJ, null);
                                return new MigrateRequireDraftResult(str, 0, "", c0vsj2.getAbsolutePath());
                            }
                        }
                    } finally {
                        th = th;
                        try {
                            try {
                            } catch (Throwable th3) {
                                while (true) {
                                }
                            }
                        } catch (Throwable th4) {
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        TryCatchGuardChecker.doCheck(th5);
                    } catch (Throwable th6) {
                        th = th6;
                    }
                    try {
                        throw th5;
                    } catch (Throwable th7) {
                        th = th7;
                        th2 = th5;
                        TryCatchGuardChecker.doCheck(th);
                        C2107108Nh.LIZ(inputStreamLJ, th2);
                        throw th;
                    }
                }
            } else {
                return new MigrateRequireDraftResult(str, 300003, "", "");
            }
        } catch (FileNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return new MigrateRequireDraftResult(str, 300003, String.valueOf(e.getMessage()), "");
        } catch (IllegalArgumentException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return new MigrateRequireDraftResult(str, 300004, String.valueOf(e2.getMessage()), "");
        } catch (SecurityException e3) {
            TryCatchGuardChecker.doCheck(e3);
            return new MigrateRequireDraftResult(str, 300004, String.valueOf(e3.getMessage()), "");
        } catch (RuntimeException e4) {
            TryCatchGuardChecker.doCheck(e4);
            return new MigrateRequireDraftResult(str, 300004, String.valueOf(e4.getMessage()), "");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.database.Cursor, java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(android.content.Context r25, android.content.ContentResolver r26, java.lang.String r27, java.lang.String r28, int r29, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.services.draft.model.MigrateRequireDraftResult> r30) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WJ9.LIZIZ(android.content.Context, android.content.ContentResolver, java.lang.String, java.lang.String, int, X.05Vn):java.lang.Object");
    }
}
