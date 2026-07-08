package X;

import android.app.Application;
import android.content.Context;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.09KY, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09KY {
    public static final C09KY LIZ = new C09KY();

    public static Map LIZ(File file) {
        Object c098200Yq;
        Object c098200Yq2;
        boolean zIsDirectory;
        long length;
        long j;
        int i;
        try {
            c098200Yq = file.getCanonicalFile();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = file.getAbsoluteFile();
        }
        File file2 = (File) c098200Yq;
        try {
            c098200Yq2 = Os.stat(file2.getAbsolutePath());
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
            c098200Yq2 = null;
        }
        StructStat structStat = (StructStat) c098200Yq2;
        if (structStat != null) {
            zIsDirectory = OsConstants.S_ISDIR(structStat.st_mode);
        } else {
            zIsDirectory = file2.isDirectory();
        }
        if (zIsDirectory) {
            length = 0;
        } else if (structStat != null) {
            length = structStat.st_size;
        } else {
            length = file2.length();
        }
        long jLastModified = file2.lastModified() / 1000;
        if (structStat != null) {
            j = structStat.st_atime;
        } else {
            j = jLastModified;
        }
        if (structStat != null) {
            jLastModified = structStat.st_mtime;
        }
        Pair[] pairArr = new Pair[5];
        if (zIsDirectory) {
            i = 16877;
        } else {
            i = 33188;
        }
        pairArr[0] = new Pair("mode", Integer.valueOf(i));
        pairArr[1] = new Pair("size", Long.valueOf(length));
        pairArr[2] = new Pair("lastAccessedTime", Long.valueOf(j));
        pairArr[3] = new Pair("lastModifiedTime", Long.valueOf(jLastModified));
        pairArr[4] = new Pair("__amgMinigameIsDirectory", Boolean.valueOf(zIsDirectory));
        return C2097608Jq.LJII(pairArr);
    }

    public static String LIZIZ(File file) {
        String strConcat;
        String strLJIJ = C08QA.LJIJ(file);
        if (!(!a0.LJJJIL(strLJIJ))) {
            strLJIJ = null;
        }
        if (strLJIJ == null || (strConcat = e3.d.concat(strLJIJ)) == null) {
            strConcat = "";
        }
        return "ttfile://user/saved/" + (System.currentTimeMillis() + "_" + u.LJJIFFI(UUID.randomUUID().toString(), "-", "", false) + strConcat);
    }

    public static String LIZLLL(String str) {
        String lowerCase;
        String string;
        if (str == null || (string = a0.LJLIIIL(str).toString()) == null || (lowerCase = string.toLowerCase(Locale.ROOT)) == null || lowerCase.length() == 0) {
            lowerCase = null;
        }
        if (lowerCase == null) {
            lowerCase = "md5";
        }
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != -903629273) {
            return iHashCode != 107902 ? null : null;
        }
        if (!lowerCase.equals("sha256")) {
            return null;
        }
        return lowerCase;
    }

    public static C09KX LJFF(C1304160k2g c1304160k2g) {
        Object obj;
        C2353409Ka c2353409Ka = c1304160k2g.LJIIIZ;
        File canonicalFile = new C0VSJ(c2353409Ka.LIZIZ.path).getCanonicalFile();
        File canonicalFile2 = new C0VSJ(c2353409Ka.LIZJ.path).getCanonicalFile();
        File canonicalFile3 = new C0VSJ(c2353409Ka.LIZ.path).getCanonicalFile();
        File canonicalFile4 = new C0VSJ(c2353409Ka.LIZLLL.path).getCanonicalFile();
        Context contextLIZ = c1304160k2g.LIZ();
        File file = C786450Ut9.LIZJ;
        if (file == null || !C786450Ut9.LJ) {
            try {
                C786450Ut9.LIZJ = contextLIZ.getFilesDir();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Context applicationContext = null;
                try {
                    Class<?> cls = Class.forName("android.app.ActivityThread");
                    Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                    Field declaredField = cls.getDeclaredField("mInitialApplication");
                    declaredField.setAccessible(true);
                    obj = declaredField.get(objInvoke);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Error: ");
                    sbLIZ.append(e.getMessage());
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                }
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream2 = System.out;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Application context obtained through ActivityThread: ");
                    sbLIZ2.append(applicationContext);
                    printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
                    if (applicationContext != null) {
                        C786450Ut9.LIZJ = applicationContext.getFilesDir();
                        C08RN.LIZ(applicationContext);
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(th.getMessage());
                    sbLIZ3.append(":");
                    sbLIZ3.append(C08RN.LIZJ());
                    sbLIZ3.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
                }
                System.out.println("Error: mInitialApplication is not an instance of Application");
                StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                sbLIZ32.append(th.getMessage());
                sbLIZ32.append(":");
                sbLIZ32.append(C08RN.LIZJ());
                sbLIZ32.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ32));
            }
            file = C786450Ut9.LIZJ;
        }
        return new C09KX(canonicalFile, canonicalFile2, canonicalFile3, canonicalFile4, new C0VSJ(file, "minigame-runtime/saved-files"));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050 A[Catch: all -> 0x0069, LOOP:0: B:19:0x004a->B:21:0x0050, LOOP_END, TRY_LEAVE, TryCatch #2 {all -> 0x0069, blocks: (B:18:0x0048, B:19:0x004a, B:21:0x0050), top: B:41:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0055 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(java.io.File r6, java.lang.String r7) throws java.security.NoSuchAlgorithmException {
        /*
            int r1 = r7.hashCode()
            r0 = -903629273(0xffffffffca23b627, float:-2682249.8)
            if (r1 == r0) goto L39
            r0 = 107902(0x1a57e, float:1.51203E-40)
            if (r1 == r0) goto L2a
            r0 = 3528965(0x35d905, float:4.945133E-39)
            if (r1 != r0) goto L7c
            java.lang.String r0 = "sha1"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L7c
            java.lang.String r0 = "SHA-1"
            java.security.MessageDigest r5 = java.security.MessageDigest.getInstance(r0)
        L21:
            X.0VSP r4 = new X.0VSP
            r4.<init>(r6)
            r0 = 8192(0x2000, float:1.148E-41)
            r3 = 0
            goto L48
        L2a:
            java.lang.String r0 = "md5"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L7c
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r5 = java.security.MessageDigest.getInstance(r0)
            goto L21
        L39:
            java.lang.String r0 = "sha256"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L7c
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r5 = java.security.MessageDigest.getInstance(r0)
            goto L21
        L48:
            byte[] r2 = new byte[r0]     // Catch: java.lang.Throwable -> L69
        L4a:
            int r1 = r4.read(r2)     // Catch: java.lang.Throwable -> L69
            if (r1 <= 0) goto L55
            r0 = 0
            r5.update(r2, r0, r1)     // Catch: java.lang.Throwable -> L69
            goto L4a
        L55:
            X.C2107108Nh.LIZ(r4, r3)
            byte[] r2 = r5.digest()
            Y.AObjectS109S0000000_3 r1 = new Y.AObjectS109S0000000_3
            r0 = 0
            r1.<init>(r0)
            java.lang.String r0 = ""
            java.lang.String r0 = X.C13LQ.LJJIJIL(r2, r0, r1)
            return r0
        L69:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L71
            throw r1     // Catch: java.lang.Throwable -> L6e
        L6e:
            r0 = move-exception
            r3 = r1
            goto L72
        L71:
            r0 = move-exception
        L72:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L76
            goto L78
        L76:
            r0 = move-exception
            goto L72
        L78:
            X.C2107108Nh.LIZ(r4, r3)
            throw r0
        L7c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "unsupported digest algorithm"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09KY.LIZJ(java.io.File, java.lang.String):java.lang.String");
    }

    public static String LJ(File file, File file2) {
        Object c098200Yq;
        Object c098200Yq2;
        String str;
        try {
            c098200Yq = file.getCanonicalFile();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = file.getAbsoluteFile();
        }
        File file3 = (File) c098200Yq;
        try {
            c098200Yq2 = file2.getCanonicalFile();
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) != null) {
            c098200Yq2 = file2.getAbsoluteFile();
        }
        String path = ((File) c098200Yq2).getPath();
        String str2 = File.separator;
        if (u.LJIIZILJ(path, str2, false)) {
            str = path;
        } else {
            str = path + str2;
        }
        if (Intrinsics.LJFF(file3.getPath(), path)) {
            return "";
        }
        if (u.LJJIIJZLJL(file3.getPath(), str, false)) {
            return u.LJJI(a0.LJJJJZ(str, file3.getPath()), File.separatorChar, '/', false);
        }
        return null;
    }

    public static String LJI(File file, C09KX c09kx) {
        Object c098200Yq;
        try {
            c098200Yq = file.getCanonicalFile();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = file.getAbsoluteFile();
        }
        File file2 = (File) c098200Yq;
        String strLJ = LJ(file2, c09kx.LIZ);
        boolean z = true;
        if (strLJ != null) {
            if (strLJ.length() != 0) {
                z = false;
            }
            if (z) {
                return "ttfile://user";
            }
            return "ttfile://user/".concat(strLJ);
        }
        String strLJ2 = LJ(file2, c09kx.LIZIZ);
        if (strLJ2 != null) {
            if (strLJ2.length() != 0) {
                z = false;
            }
            if (z) {
                return "ttfile://temp";
            }
            return "ttfile://temp/".concat(strLJ2);
        }
        String strLJ3 = LJ(file2, c09kx.LIZLLL);
        if (strLJ3 != null) {
            if (strLJ3.length() != 0) {
                z = false;
            }
            if (z) {
                return "ttpluginfile://";
            }
            return "ttpluginfile://".concat(strLJ3);
        }
        String strLJ4 = LJ(file2, c09kx.LIZJ);
        if (strLJ4 != null) {
            return strLJ4;
        }
        return null;
    }
}
