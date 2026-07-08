package com.appsflyer.internal;

import X.C08QA;
import X.C08RN;
import X.C09BH;
import X.C0VSJ;
import X.C13BV;
import X.C13LP;
import X.C13LQ;
import X.C13SZ;
import X.C15438062q;
import X.C2188811AlT;
import X.C786450Ut9;
import android.app.Application;
import android.content.Context;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1dSDK;
import com.appsflyer.internal.AFd1fSDK;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public final class AFd1hSDK implements AFd1gSDK {
    public final AFd1lSDK AFInAppEventParameterName;

    @Override // com.appsflyer.internal.AFd1gSDK
    public final List<AFd1fSDK> AFInAppEventParameterName() {
        List<AFd1fSDK> listLJIJJLI;
        File[] fileArrListFiles;
        ArrayList arrayList;
        File[] fileArrListFiles2;
        synchronized (this) {
            try {
                File fileAFKeystoreWrapper = AFKeystoreWrapper();
                listLJIJJLI = null;
                if (fileAFKeystoreWrapper != null && (fileArrListFiles = fileAFKeystoreWrapper.listFiles()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (File file : fileArrListFiles) {
                        try {
                            fileArrListFiles2 = file.listFiles();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            AFg1fSDK.v$default(AFLogger.INSTANCE, AFg1aSDK.EXCEPTION_MANAGER, "Could not get stored exceptions\n " + th.getMessage(), false, 4, null);
                        }
                        if (fileArrListFiles2 != null) {
                            arrayList = new ArrayList();
                            for (File file2 : fileArrListFiles2) {
                                AFd1fSDK aFd1fSDKValueOf = AFd1fSDK.AFa1vSDK.valueOf(C09BH.LJI(file2, Charsets.UTF_8));
                                if (aFd1fSDKValueOf != null) {
                                    arrayList.add(aFd1fSDKValueOf);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            arrayList2.add(arrayList);
                        }
                    }
                    listLJIJJLI = C15438062q.LJIJJLI(arrayList2);
                }
                if (listLJIJJLI == null) {
                    listLJIJJLI = C13BV.INSTANCE;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        return listLJIJJLI;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final boolean AFInAppEventType() {
        return AFInAppEventType(new String[0]);
    }

    private final File AFKeystoreWrapper() {
        Context context = this.AFInAppEventParameterName.AFKeystoreWrapper;
        if (context == null) {
            return null;
        }
        C0VSJ c0vsj = new C0VSJ(INVOKEVIRTUAL_com_appsflyer_internal_AFd1hSDK_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context), "AFExceptionsCache");
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        return c0vsj;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final int values() {
        Iterator<AFd1fSDK> it2 = AFInAppEventParameterName().iterator();
        int i = 0;
        while (it2.hasNext()) {
            i += it2.next().valueOf;
        }
        return i;
    }

    public AFd1hSDK(AFd1lSDK aFd1lSDK) {
        this.AFInAppEventParameterName = aFd1lSDK;
    }

    public static File INVOKEVIRTUAL_com_appsflyer_internal_AFd1hSDK_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) throws Throwable {
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

    @Override // com.appsflyer.internal.AFd1gSDK
    public final boolean AFInAppEventType(String... strArr) {
        boolean zLJIIZILJ;
        synchronized (this) {
            try {
                File fileAFKeystoreWrapper = AFKeystoreWrapper();
                zLJIIZILJ = true;
                if (fileAFKeystoreWrapper != null) {
                    if (strArr.length == 0) {
                        AFg1fSDK.v$default(AFLogger.INSTANCE, AFg1aSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                        zLJIIZILJ = C08QA.LJIIZILJ(fileAFKeystoreWrapper);
                    } else {
                        AFg1fSDK.v$default(AFLogger.INSTANCE, AFg1aSDK.EXCEPTION_MANAGER, "delete all exceptions except for: " + C13LQ.LJJJ(strArr, ", ", null, null, null, 62), false, 4, null);
                        File[] fileArrListFiles = fileAFKeystoreWrapper.listFiles();
                        if (fileArrListFiles != null) {
                            ArrayList arrayList = new ArrayList();
                            for (File file : fileArrListFiles) {
                                if (C13LQ.LJJIJIIJI(file.getName(), strArr) < 0) {
                                    arrayList.add(file);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(Boolean.valueOf(C08QA.LJIIZILJ((File) it2.next())));
                            }
                            Set setLLIIJI = C13LP.LLIIJI(arrayList2);
                            if (setLLIIJI.isEmpty()) {
                                setLLIIJI = Collections.singleton(Boolean.TRUE);
                            }
                            Set set = setLLIIJI;
                            if (set.size() != 1 || !((Boolean) C13LP.LJJJJZ(set)).booleanValue()) {
                                zLJIIZILJ = false;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zLJIIZILJ;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final String AFInAppEventParameterName(Throwable th, String str) {
        String str2;
        C0VSJ c0vsj;
        AFd1fSDK aFd1fSDKValueOf;
        synchronized (this) {
            try {
                File fileAFKeystoreWrapper = AFKeystoreWrapper();
                str2 = null;
                if (fileAFKeystoreWrapper != null) {
                    c0vsj = new C0VSJ(fileAFKeystoreWrapper, "6.14.0");
                    if (!c0vsj.exists()) {
                        c0vsj.mkdirs();
                    }
                } else {
                    c0vsj = null;
                }
                if (c0vsj != null) {
                    try {
                        AFd1fSDK aFd1fSDK = new AFd1fSDK(th.getClass().getName() + ": " + str, AFe1vSDK.AFKeystoreWrapper(th + '\n' + C13LP.LJJLIIIJ(AFd1dSDK.values(th), "\n", null, null, 0, null, AFd1dSDK.AnonymousClass5.AFInAppEventParameterName, 30), "SHA-256"), C13SZ.LIZIZ(th), 0, 8, null);
                        String str3 = aFd1fSDK.values;
                        C0VSJ c0vsj2 = new C0VSJ(c0vsj, str3);
                        if (c0vsj2.exists() && (aFd1fSDKValueOf = AFd1fSDK.AFa1vSDK.valueOf(C09BH.LJI(c0vsj2, Charsets.UTF_8))) != null) {
                            aFd1fSDKValueOf.valueOf++;
                            aFd1fSDK = aFd1fSDKValueOf;
                        }
                        StringBuilder sb = new StringBuilder("label=");
                        String str4 = aFd1fSDK.AFKeystoreWrapper;
                        Charset charset = Charsets.UTF_8;
                        sb.append(Base64.encodeToString(str4.getBytes(charset), 2));
                        sb.append("\nhashName=");
                        sb.append(Base64.encodeToString(aFd1fSDK.values.getBytes(charset), 2));
                        sb.append("\nstackTrace=");
                        sb.append(Base64.encodeToString(aFd1fSDK.AFInAppEventType.getBytes(charset), 2));
                        sb.append("\nc=");
                        sb.append(aFd1fSDK.valueOf);
                        C09BH.LJIIIZ(c0vsj2, sb.toString(), Charsets.UTF_8);
                        str2 = str3;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        AFg1fSDK.v$default(AFLogger.INSTANCE, AFg1aSDK.EXCEPTION_MANAGER, "Could not cache exception\n " + e.getMessage(), false, 4, null);
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        return str2;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final void AFInAppEventType(int i, int i2) {
        File[] fileArrListFiles;
        synchronized (this) {
            try {
                File fileAFKeystoreWrapper = AFKeystoreWrapper();
                if (fileAFKeystoreWrapper != null && (fileArrListFiles = fileAFKeystoreWrapper.listFiles()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (File file : fileArrListFiles) {
                        int iValueOf = AFc1rSDK.valueOf(file.getName());
                        if (i > iValueOf || iValueOf > i2) {
                            arrayList.add(file);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(Boolean.valueOf(C08QA.LJIIZILJ((File) it2.next())));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
