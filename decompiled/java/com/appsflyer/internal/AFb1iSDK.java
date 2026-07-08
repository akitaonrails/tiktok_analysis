package com.appsflyer.internal;

import X.C08RN;
import X.C0VSJ;
import X.C2188811AlT;
import X.C786450Ut9;
import android.app.Application;
import android.content.Context;
import com.appsflyer.AFLogger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class AFb1iSDK implements AFb1tSDK {
    public final AFd1lSDK AFKeystoreWrapper;

    @Override // com.appsflyer.internal.AFb1tSDK
    public final void AFInAppEventParameterName() {
        try {
            if (new C0VSJ(INVOKEVIRTUAL_com_appsflyer_internal_AFb1iSDK_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(this.AFKeystoreWrapper.AFKeystoreWrapper), "AFRequestCache").exists()) {
                return;
            }
            new C0VSJ(INVOKEVIRTUAL_com_appsflyer_internal_AFb1iSDK_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(this.AFKeystoreWrapper.AFKeystoreWrapper), "AFRequestCache").mkdir();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.appsflyer.internal.AFb1tSDK
    public final void valueOf() {
        try {
            C0VSJ c0vsj = new C0VSJ(INVOKEVIRTUAL_com_appsflyer_internal_AFb1iSDK_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(this.AFKeystoreWrapper.AFKeystoreWrapper), "AFRequestCache");
            if (!c0vsj.exists()) {
                c0vsj.mkdir();
                return;
            }
            File[] fileArrListFiles = c0vsj.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file : fileArrListFiles) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1aSDK aFg1aSDK = AFg1aSDK.CACHE;
                aFLogger.i(aFg1aSDK, "Found cached request" + file.getName());
                aFLogger.i(aFg1aSDK, "Deleting " + file.getName() + " from cache");
                file.delete();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.appsflyer.internal.AFb1tSDK
    public final List<AFb1qSDK> values() {
        ArrayList arrayList = new ArrayList();
        try {
            C0VSJ c0vsj = new C0VSJ(INVOKEVIRTUAL_com_appsflyer_internal_AFb1iSDK_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(this.AFKeystoreWrapper.AFKeystoreWrapper), "AFRequestCache");
            if (!c0vsj.exists()) {
                c0vsj.mkdir();
            }
            File[] fileArrListFiles = c0vsj.listFiles();
            if (fileArrListFiles == null) {
                return arrayList;
            }
            for (File file : fileArrListFiles) {
                AFLogger.INSTANCE.i(AFg1aSDK.CACHE, "Found cached request" + file.getName());
                arrayList.add(values(file));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return arrayList;
    }

    public AFb1iSDK(AFd1lSDK aFd1lSDK) {
        this.AFKeystoreWrapper = aFd1lSDK;
    }

    public static File INVOKEVIRTUAL_com_appsflyer_internal_AFb1iSDK_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) throws Throwable {
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

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x004e: MOVE (r5 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:16777294), block:B:22:0x004e */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.appsflyer.internal.AFb1qSDK values(java.io.File r6) throws java.lang.Throwable {
        /*
            java.lang.String r3 = "could not close load reader"
            r5 = 0
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L50
            X.0VSP r1 = new X.0VSP     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L50
            r1.<init>(r6)     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L50
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L50
            r4.<init>(r1, r0)     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L50
            long r1 = r6.length()     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L4d
            int r0 = (int) r1     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L4d
            char[] r0 = new char[r0]     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L4d
            r4.read(r0)     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L4d
            com.appsflyer.internal.AFb1qSDK r1 = new com.appsflyer.internal.AFb1qSDK     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L4d
            r1.<init>(r0)     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L4d
            java.lang.String r0 = r6.getName()     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L4d
            r1.AFInAppEventParameterName = r0     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L4d
            r4.close()     // Catch: java.io.IOException -> L2a
            goto L32
        L2a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r3, r0)
            return r1
        L32:
            return r1
        L33:
            r1 = move-exception
            goto L37
        L35:
            r1 = move-exception
            r4 = r5
        L37:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r0 = "error while loading request from cache"
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r0, r1)     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L4c
            r4.close()     // Catch: java.io.IOException -> L45
            return r5
        L45:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r3, r0)
        L4c:
            return r5
        L4d:
            r1 = move-exception
            r5 = r4
            goto L51
        L50:
            r1 = move-exception
        L51:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            if (r5 == 0) goto L61
            r5.close()     // Catch: java.io.IOException -> L5a
            throw r1
        L5a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r3, r0)
        L61:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1iSDK.values(java.io.File):com.appsflyer.internal.AFb1qSDK");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.appsflyer.internal.AFb1tSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String AFInAppEventType(com.appsflyer.internal.AFb1qSDK r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1iSDK.AFInAppEventType(com.appsflyer.internal.AFb1qSDK):java.lang.String");
    }

    @Override // com.appsflyer.internal.AFb1tSDK
    public final boolean values(String str) {
        C0VSJ c0vsj = new C0VSJ(new C0VSJ(INVOKEVIRTUAL_com_appsflyer_internal_AFb1iSDK_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(this.AFKeystoreWrapper.AFKeystoreWrapper), "AFRequestCache"), str);
        AFLogger.INSTANCE.i(AFg1aSDK.CACHE, "Deleting " + str + " from cache");
        if (c0vsj.exists()) {
            try {
                return c0vsj.delete();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        return true;
    }
}
