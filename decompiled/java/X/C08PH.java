package X;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import cs.bd.o.a;
import cs.bd.o.b;
import cs.bd.o.c;
import cs.bd.o.e;
import cs.bd.o.f;
import cs.bd.o.n;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.08PH, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08PH {
    public static boolean LIZIZ(Context context, String str, String str2) {
        try {
            String[] list = context.getAssets().list(str);
            if (list.length <= 0) {
                try {
                    throw null;
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            new C0VSJ(str2).mkdirs();
            for (String str3 : list) {
                LIZIZ(context, str + "/" + str3, str2 + "/" + str3);
            }
            return true;
        } catch (Exception th) {
            return false;
        }
    }

    public static void LIZ() {
        C08PQ fVar;
        a cVar;
        boolean z;
        boolean z2;
        C08PI.LIZ(65537, new C08PQ() { // from class: X.08P3
            @Override // X.C08PQ
            public final Object LIZ(long j, String str, Object obj) {
                return C08P2.LIZIZ(C2110608Oq.LIZIZ.LIZ);
            }
        });
        C08PI.LIZ(65538, new C08PQ() { // from class: X.08PK
            @Override // X.C08PQ
            public final Object LIZ(long j, String str, Object obj) {
                Context context = C2110608Oq.LIZIZ.LIZ;
                return context != null ? context.getPackageName() : "";
            }
        });
        C08PI.LIZ(65539, new C08PQ() { // from class: X.08Or
            @Override // X.C08PQ
            public final Object LIZ(long j, String str, Object obj) throws Throwable {
                Context context = C2110608Oq.LIZIZ.LIZ;
                File file = C786450Ut9.LIZJ;
                if (file == null || !C786450Ut9.LJ) {
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
                            Object obj2 = declaredField.get(objInvoke);
                            if (obj2 instanceof Application) {
                                applicationContext = ((Application) obj2).getApplicationContext();
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
                    file = C786450Ut9.LIZJ;
                }
                C0VSJ c0vsj = new C0VSJ(file, ".osdata");
                if (!c0vsj.exists()) {
                    c0vsj.mkdirs();
                }
                return c0vsj.getAbsolutePath();
            }
        });
        C08PI.LIZ(65540, new C08PQ() { // from class: X.08PJ
            @Override // X.C08PQ
            public final Object LIZ(long j, String str, Object obj) {
                try {
                    if (C08PH.LIZIZ(C2110608Oq.LIZIZ.LIZ, str, obj.toString())) {
                        return "OK";
                    }
                    return null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return null;
                }
            }
        });
        C08PI.LIZ(65541, new C08PQ() { // from class: X.08Os
            @Override // X.C08PQ
            public final Object LIZ(long j, String str, Object obj) throws Throwable {
                InputStream inputStreamOpen;
                C0VSV c0vsv;
                String strLIZIZ = str;
                AssetManager assets = C2110608Oq.LIZIZ.LIZ.getAssets();
                if (!strLIZIZ.startsWith(e3.d)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(e3.d);
                    sbLIZ.append(strLIZIZ);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                String[] list = assets.list("");
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (int i2 = 0; i2 < list.length; i2++) {
                    if (list[i2].endsWith(strLIZIZ)) {
                        String str2 = list[i2];
                        String absolutePath = File.createTempFile("osext", "").getAbsolutePath();
                        C0VSV c0vsv2 = null;
                        try {
                            inputStreamOpen = assets.open(str2);
                            try {
                                c0vsv = new C0VSV(absolutePath);
                                try {
                                    try {
                                        byte[] bArr = new byte[256];
                                        long j2 = 0;
                                        while (true) {
                                            int i3 = inputStreamOpen.read(bArr);
                                            if (i3 > 0) {
                                                c0vsv.write(bArr, i, i3);
                                                j2 += (long) i3;
                                                i = 0;
                                            } else {
                                                try {
                                                    break;
                                                } catch (IOException e) {
                                                    e = e;
                                                    TryCatchGuardChecker.doCheck(e);
                                                    c0vsv2 = c0vsv;
                                                    c0vsv = c0vsv2;
                                                }
                                            }
                                        }
                                        c0vsv.flush();
                                        if (j2 > 0) {
                                            arrayList.add(absolutePath);
                                        }
                                    } catch (IOException e2) {
                                        e = e2;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    c0vsv2 = c0vsv;
                                    TryCatchGuardChecker.doCheck(th);
                                    n.LIZIZ(inputStreamOpen);
                                    n.LIZIZ(c0vsv2);
                                    throw th;
                                }
                            } catch (IOException e3) {
                                e = e3;
                                TryCatchGuardChecker.doCheck(e);
                                c0vsv = c0vsv2;
                                n.LIZIZ(inputStreamOpen);
                                n.LIZIZ(c0vsv);
                            } catch (Throwable th2) {
                                th = th2;
                                TryCatchGuardChecker.doCheck(th);
                                TryCatchGuardChecker.doCheck(th);
                                n.LIZIZ(inputStreamOpen);
                                n.LIZIZ(c0vsv2);
                                throw th;
                            }
                        } catch (IOException e4) {
                            e = e4;
                            inputStreamOpen = null;
                        } catch (Throwable th3) {
                            th = th3;
                            inputStreamOpen = null;
                        }
                        n.LIZIZ(inputStreamOpen);
                        n.LIZIZ(c0vsv);
                    }
                }
                return arrayList.toArray(new String[i]);
            }
        });
        C08PI.LIZ(65542, new C08PQ() { // from class: X.08PG
            /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
            @Override // X.C08PQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LIZ(long r5, java.lang.String r7, java.lang.Object r8) {
                /*
                    r4 = this;
                    X.08Oq r0 = X.C2110608Oq.LIZIZ
                    android.content.Context r0 = r0.LIZ
                    android.content.pm.PackageManager r2 = r0.getPackageManager()
                    java.lang.String r1 = r0.getPackageName()
                    r0 = 0
                    android.content.pm.ApplicationInfo r1 = X.C786410Ut5.V3(r2, r1, r0)
                    java.lang.String r0 = r1.sourceDir
                    if (r0 != 0) goto L17
                    java.lang.String r0 = r1.publicSourceDir
                L17:
                    java.util.Map r2 = cs.bd.o.m.LIZIZ(r0)
                    java.lang.String r3 = ""
                    if (r2 == 0) goto L48
                    r1 = 1903654775(0x71777777, float:1.22539554E30)
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                    java.util.HashMap r2 = (java.util.HashMap) r2
                    boolean r0 = r2.containsKey(r0)
                    if (r0 == 0) goto L48
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                    java.lang.Object r1 = r2.get(r0)
                    java.lang.String r1 = (java.lang.String) r1
                L38:
                    if (r1 == 0) goto L73
                    int r0 = r1.length()
                    if (r0 <= 0) goto L73
                    org.json.JSONObject r2 = new org.json.JSONObject
                    r2.<init>(r1)
                    java.lang.String r0 = "meta_umeng_channel"
                    goto L4a
                L48:
                    r1 = r3
                    goto L38
                L4a:
                    java.lang.String r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r2, r0)     // Catch: org.json.JSONException -> L4f
                    goto L54
                L4f:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    r0 = r3
                L54:
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    r1.append(r0)
                    java.lang.String r0 = ";"
                    r1.append(r0)
                    java.lang.String r0 = "release_build"
                    java.lang.String r3 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r2, r0)     // Catch: org.json.JSONException -> L68
                    goto L6c
                L68:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                L6c:
                    r1.append(r3)
                    java.lang.String r3 = r1.toString()
                L73:
                    int r0 = r3.length()
                    if (r0 != 0) goto L7b
                    java.lang.String r3 = "None"
                L7b:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C08PG.LIZ(long, java.lang.String, java.lang.Object):java.lang.Object");
            }
        });
        C08PI.LIZ(65543, new C08PQ() { // from class: X.08Ov
            @Override // X.C08PQ
            public final Object LIZ(long j, String str, Object obj) {
                try {
                    Class<?> cls = Class.forName("com.ss.android.ugc.quota.service.BDNetworkTagDependImpl");
                    Method declaredMethod = cls.getDeclaredMethod("markAsNewUser", new Class[0]);
                    declaredMethod.setAccessible(true);
                    Object objNewInstance = cls.newInstance();
                    if (objNewInstance == null) {
                        return null;
                    }
                    if (((Boolean) declaredMethod.invoke(objNewInstance, new Object[0])).booleanValue()) {
                        return "newUser";
                    }
                    return null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return null;
                }
            }
        });
        String[] strArr = {"com.bytedance.ttnet.TTNetInit"};
        int length = strArr.length;
        int i = 0;
        boolean z3 = true;
        while (true) {
            if (i >= length) {
                fVar = new f();
                break;
            }
            try {
                Class.forName(strArr[i]);
                z2 = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                z2 = false;
            }
            z3 &= z2;
            if (!z3) {
                fVar = new e();
                break;
            }
            i++;
        }
        C08PI.LIZ(196609, fVar);
        C08PI.LIZ(196610, fVar);
        C08PI.LIZ(196611, fVar);
        String[] strArr2 = {"com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils"};
        int length2 = strArr2.length;
        int i2 = 0;
        boolean z4 = true;
        while (true) {
            if (i2 >= length2) {
                cVar = new c();
                break;
            }
            try {
                Class.forName(strArr2[i2]);
                z = true;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                z = false;
            }
            z4 &= z;
            if (!z4) {
                cVar = new b();
                break;
            }
            i2++;
        }
        synchronized (a.class) {
            a.LIZ = cVar;
        }
        C08PI.LIZ(131073, cVar);
        C08PI.LIZ(131074, cVar);
    }
}
