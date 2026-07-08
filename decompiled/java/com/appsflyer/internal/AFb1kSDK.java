package com.appsflyer.internal;

import X.C08RN;
import X.C0VSJ;
import X.C2188811AlT;
import X.C786450Ut9;
import android.app.Application;
import android.content.Context;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes4.dex */
public final class AFb1kSDK {
    public static String values;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static String AFKeystoreWrapper(File file) throws Throwable {
        byte[] bArr;
        RandomAccessFile randomAccessFile;
        ?? r4 = 0;
        byte[] bArr2 = null;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
            bArr = null;
        }
        try {
            bArr2 = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr2);
            randomAccessFile.close();
            try {
                randomAccessFile.close();
                r4 = bArr2;
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                r4 = bArr2;
            }
        } catch (IOException e3) {
            e = e3;
            bArr = bArr2;
            randomAccessFile2 = randomAccessFile;
            TryCatchGuardChecker.doCheck(e);
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                }
            }
            r4 = bArr;
        } catch (Throwable th2) {
            th = th2;
            r4 = randomAccessFile;
            TryCatchGuardChecker.doCheck(th);
            if (r4 != 0) {
                try {
                    r4.close();
                    throw th;
                } catch (IOException e5) {
                    TryCatchGuardChecker.doCheck(e5);
                    throw th;
                }
            }
            throw th;
        }
        ?? r42 = r4;
        if (r4 == 0) {
            r42 = new byte[0];
        }
        return new String((byte[]) r42, Charset.defaultCharset());
    }

    public static File INVOKEVIRTUAL_com_appsflyer_internal_AFb1kSDK_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public static synchronized String valueOf(AFd1lSDK aFd1lSDK, AFd1qSDK aFd1qSDK) {
        if (aFd1lSDK.AFKeystoreWrapper == null) {
            return values;
        }
        if (values == null) {
            String strAFKeystoreWrapper = aFd1qSDK.AFKeystoreWrapper("AF_INSTALLATION", (String) null);
            if (strAFKeystoreWrapper != null) {
                values = strAFKeystoreWrapper;
            } else {
                try {
                    C0VSJ c0vsj = new C0VSJ(INVOKEVIRTUAL_com_appsflyer_internal_AFb1kSDK_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(aFd1lSDK.AFKeystoreWrapper), "AF_INSTALLATION");
                    if (!c0vsj.exists()) {
                        values = System.currentTimeMillis() + "-" + Math.abs(new SecureRandom().nextLong());
                    } else {
                        values = AFKeystoreWrapper(c0vsj);
                        c0vsj.delete();
                    }
                    aFd1qSDK.AFInAppEventParameterName("AF_INSTALLATION", values);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (values != null) {
                AppsFlyerProperties.getInstance().set("uid", values);
            }
        }
        return values;
    }
}
