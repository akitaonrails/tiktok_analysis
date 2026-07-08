package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.08OU, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08OU {
    public static volatile Context LIZ;
    public static volatile boolean LIZIZ;
    public static String LIZJ;
    public static volatile String LIZLLL;

    public static File LIZ(Context context) throws Throwable {
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

    public static void LIZJ(Context context) {
        if (context == null) {
            return;
        }
        LIZ = context;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZ(context).getAbsolutePath());
        String str = File.separator;
        sbLIZ.append(str);
        sbLIZ.append("ph_out");
        LIZLLL = C2188811AlT.LIZIZ(sbLIZ);
        C0VSJ c0vsj = new C0VSJ(LIZLLL);
        if (!c0vsj.exists() && !LIZIZ) {
            synchronized (C08OU.class) {
                try {
                    if (!LIZIZ) {
                        try {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(LIZ(context).getAbsolutePath());
                            sbLIZ2.append(str);
                            sbLIZ2.append("ph_reg");
                            LIZJ = C2188811AlT.LIZIZ(sbLIZ2);
                            C0VSJ c0vsj2 = new C0VSJ(LIZJ);
                            if (c0vsj2.exists()) {
                                c0vsj2.delete();
                            }
                            c0vsj2.mkdir();
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(LIZJ);
                            sbLIZ3.append(str);
                            sbLIZ3.append("ph_index");
                            C0VSJ c0vsj3 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ3));
                            if (!LIZIZ(context, "ph_index", c0vsj3)) {
                                LIZJ = null;
                                return;
                            }
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append(LIZJ);
                            sbLIZ4.append(str);
                            sbLIZ4.append("ph_raw");
                            C0VSJ c0vsj4 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ4));
                            if (!LIZIZ(context, "ph_raw", c0vsj4)) {
                                LIZJ = null;
                                return;
                            }
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append(LIZLLL);
                            sbLIZ5.append(".tmp");
                            C0VSJ c0vsj5 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ5));
                            if (c0vsj5.exists()) {
                                c0vsj5.delete();
                            }
                            c0vsj5.mkdir();
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append(LIZJ);
                            sbLIZ6.append(str);
                            sbLIZ6.append("ph_raw");
                            C0VSJ c0vsj6 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ6));
                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                            sbLIZ7.append(LIZJ);
                            sbLIZ7.append(str);
                            sbLIZ7.append("ph_index");
                            if (!LIZLLL(c0vsj6, new C0VSJ(C2188811AlT.LIZIZ(sbLIZ7)), c0vsj5)) {
                                c0vsj5.delete();
                            } else if (!c0vsj5.renameTo(c0vsj)) {
                                c0vsj5.delete();
                                c0vsj.delete();
                            } else {
                                LIZIZ = true;
                            }
                            c0vsj3.delete();
                            c0vsj4.delete();
                            c0vsj2.delete();
                        } finally {
                            try {
                            } finally {
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0064 A[Catch: Exception -> 0x0068, TRY_LEAVE, TryCatch #6 {Exception -> 0x0068, blocks: (B:41:0x005f, B:43:0x0064), top: B:50:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(android.content.Context r6, java.lang.String r7, X.C0VSJ r8) throws java.lang.Throwable {
        /*
            r5 = 0
            r2 = 0
            android.content.res.AssetManager r0 = r6.getAssets()     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L44
            java.io.InputStream r0 = r0.open(r7)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L44
            X.0VSV r4 = new X.0VSV     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L44
            r4.<init>(r8)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L44
            com.bytedance.compression.zstd.ZstdInputStream r3 = new com.bytedance.compression.zstd.ZstdInputStream     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L3a
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L3a
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c
        L18:
            int r1 = r3.read(r2)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c
            r0 = -1
            if (r1 == r0) goto L23
            r4.write(r2, r5, r1)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c
            goto L18
        L23:
            r4.flush()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c
            r4.close()     // Catch: java.lang.Exception -> L2d
            r3.close()     // Catch: java.lang.Exception -> L2d
            goto L31
        L2d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L31:
            r0 = 1
            return r0
        L33:
            r1 = move-exception
            goto L37
        L35:
            r1 = move-exception
            r2 = r3
        L37:
            r0 = r2
            r2 = r4
            goto L5a
        L3a:
            r1 = move-exception
            goto L3e
        L3c:
            r1 = move-exception
            r2 = r3
        L3e:
            r0 = r2
            r2 = r4
            goto L46
        L41:
            r1 = move-exception
            r0 = r2
            goto L5a
        L44:
            r1 = move-exception
            r0 = r2
        L46:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L4e
            r2.close()     // Catch: java.lang.Exception -> L54
        L4e:
            if (r0 == 0) goto L58
            r0.close()     // Catch: java.lang.Exception -> L54
            return r5
        L54:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L58:
            return r5
        L59:
            r1 = move-exception
        L5a:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L62
            r2.close()     // Catch: java.lang.Exception -> L68
        L62:
            if (r0 == 0) goto L6c
            r0.close()     // Catch: java.lang.Exception -> L68
            throw r1
        L68:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L6c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08OU.LIZIZ(android.content.Context, java.lang.String, X.0VSJ):boolean");
    }

    public static boolean LIZLLL(C0VSJ c0vsj, C0VSJ c0vsj2, C0VSJ c0vsj3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        BufferedReader bufferedReader = null;
        C0VSP c0vsp = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new C0VSF(c0vsj2));
            while (true) {
                try {
                    String line = bufferedReader2.readLine();
                    if (line != null) {
                        String[] strArrSplit = line.split(":");
                        arrayList.add(strArrSplit[0]);
                        arrayList2.add(Long.valueOf(Long.parseLong(strArrSplit[1])));
                    } else {
                        try {
                            break;
                        } catch (IOException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        try {
                            bufferedReader.close();
                            return false;
                        } catch (IOException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            return false;
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        try {
                            bufferedReader.close();
                            throw th2;
                        } catch (IOException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            throw th2;
                        }
                    }
                }
            }
            bufferedReader2.close();
            try {
                String str = (String) arrayList.get(0);
                long jLongValue = ((Long) arrayList2.get(0)).longValue();
                C0VSP c0vsp2 = new C0VSP(c0vsj);
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c0vsj3);
                    sbLIZ.append(File.separator);
                    sbLIZ.append(str);
                    C0VSV c0vsv = new C0VSV(new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)));
                    int i = (int) jLongValue;
                    if (i > 512) {
                        i = 512;
                    }
                    byte[] bArr = new byte[i];
                    long j = 0;
                    boolean z = false;
                    int i2 = 0;
                    while (true) {
                        int i3 = c0vsp2.read(bArr);
                        if (i3 != -1) {
                            c0vsv.write(bArr);
                            j += (long) i3;
                            PrintStream printStream = System.out;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("read num = ");
                            sbLIZ2.append(i3);
                            sbLIZ2.append(" name = ");
                            sbLIZ2.append(str);
                            sbLIZ2.append(" limit = ");
                            sbLIZ2.append(jLongValue);
                            sbLIZ2.append(" total = ");
                            sbLIZ2.append(j);
                            printStream.println(C2188811AlT.LIZIZ(sbLIZ2));
                            if (z) {
                                c0vsv.close();
                                i2++;
                                if (i2 < arrayList.size()) {
                                    str = (String) arrayList.get(i2);
                                    long jLongValue2 = ((Long) arrayList2.get(i2)).longValue();
                                    long j2 = jLongValue2 - jLongValue;
                                    PrintStream printStream2 = System.out;
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("tmp ===== ");
                                    sbLIZ3.append(j2);
                                    printStream2.println(C2188811AlT.LIZIZ(sbLIZ3));
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append(c0vsj3);
                                    sbLIZ4.append(File.separator);
                                    sbLIZ4.append(str);
                                    c0vsv = new C0VSV(new C0VSJ(C2188811AlT.LIZIZ(sbLIZ4)));
                                    i = (int) j2;
                                    if (i > 512) {
                                        i = 512;
                                    }
                                    bArr = new byte[i];
                                    jLongValue = jLongValue2;
                                    z = false;
                                }
                            }
                            if (((long) i) + j > jLongValue) {
                                i = (int) (jLongValue - j);
                                bArr = new byte[i];
                                z = true;
                            }
                        }
                        try {
                            c0vsp2.close();
                            return true;
                        } catch (IOException e4) {
                            TryCatchGuardChecker.doCheck(e4);
                            return true;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c0vsp = c0vsp2;
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        try {
                            c0vsp.close();
                            return false;
                        } catch (IOException e5) {
                            TryCatchGuardChecker.doCheck(e5);
                            return false;
                        }
                    } catch (Throwable th4) {
                        TryCatchGuardChecker.doCheck(th4);
                        try {
                            c0vsp.close();
                            throw th4;
                        } catch (IOException e6) {
                            TryCatchGuardChecker.doCheck(e6);
                            throw th4;
                        }
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }
}
