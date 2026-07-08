package X;

import android.app.Application;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XED, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XED {
    public static List LIZIZ() {
        List<String> listLLIIII;
        LinkedHashSet linkedHashSet;
        String strLJII;
        InputMethodManager inputMethodManager;
        try {
            linkedHashSet = new LinkedHashSet();
            C844470XAv.LIZ.getClass();
            Object objH2 = C786410Ut5.H2(C844470XAv.LIZ(), "input_method");
            strLJII = null;
            inputMethodManager = objH2 instanceof InputMethodManager ? (InputMethodManager) objH2 : null;
        } catch (NoClassDefFoundError e) {
            TryCatchGuardChecker.doCheck(e);
            listLLIIII = C13BV.INSTANCE;
        }
        if (inputMethodManager == null) {
            return C13LP.LLIIII(linkedHashSet);
        }
        InputMethodSubtype currentInputMethodSubtype = inputMethodManager.getCurrentInputMethodSubtype();
        if (currentInputMethodSubtype != null) {
            if (!Intrinsics.LJFF(currentInputMethodSubtype.getMode(), "keyboard")) {
                currentInputMethodSubtype = null;
            }
            if (currentInputMethodSubtype != null) {
                strLJII = LJII(currentInputMethodSubtype);
            }
        }
        if (strLJII == null) {
            strLJII = "";
        }
        if (strLJII.length() > 0) {
            linkedHashSet.add(strLJII);
        }
        Iterator<InputMethodInfo> it2 = inputMethodManager.getEnabledInputMethodList().iterator();
        while (it2.hasNext()) {
            for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it2.next(), true)) {
                if (Intrinsics.LJFF(inputMethodSubtype.getMode(), "keyboard")) {
                    String strLJII2 = LJII(inputMethodSubtype);
                    if (strLJII2.length() > 0) {
                        linkedHashSet.add(strLJII2);
                    }
                }
            }
        }
        listLLIIII = C13LP.LLIIII(linkedHashSet);
        C526890KlT.LIZJ = listLLIIII;
        return listLLIIII;
    }

    public static List LIZLLL() {
        List<String> list = C526890KlT.LIZJ;
        if (list != null) {
            return list;
        }
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            return LIZIZ();
        }
        C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.0Kn0
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MusicRequestDataProvider$Companion@c13c.provideKeyBoardLanguageList$2");
                try {
                    C526890KlT.LIZIZ.getClass();
                    C0XED.LIZIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MusicRequestDataProvider$Companion@c13c.provideKeyBoardLanguageList$2");
            }
        });
        return C13BV.INSTANCE;
    }

    public static long LJI() {
        Long l = C526890KlT.LIZLLL;
        if (l != null) {
            return l.longValue();
        }
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            return LIZJ();
        }
        C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.0Kn1
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MusicRequestDataProvider$Companion@c13c.provideRemainingDiskSpace$2");
                try {
                    C526890KlT.LIZIZ.getClass();
                    C0XED.LIZJ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MusicRequestDataProvider$Companion@c13c.provideRemainingDiskSpace$2");
            }
        });
        return 0L;
    }

    public static long LIZJ() {
        Context contextLIZ;
        Object c098200Yq;
        String path;
        long jLLFFF;
        StorageStatsManager storageStatsManager;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ == null || (contextLIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null) {
            contextLIZ = C1BWL.LIZ();
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                Object objH2 = C786410Ut5.H2(contextLIZ, "storagestats");
                jLLFFF = ((!(objH2 instanceof StorageStatsManager) || (storageStatsManager = (StorageStatsManager) objH2) == null) ? 0L : storageStatsManager.getFreeBytes(StorageManager.UUID_DEFAULT)) / ((long) 1000000);
            } else {
                File fileLIZ = LIZ(contextLIZ);
                if (fileLIZ == null || (path = fileLIZ.getPath()) == null) {
                    path = Environment.getDataDirectory().getPath();
                }
                jLLFFF = C2204961BRm.LLFFF(new StatFs(path), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOetZ5bPzzc3OnQU4+0Y1iu623tf/PzhT+jWk2pxGkqFXsvD1mz7", null)) / ((long) 1000000);
            }
            c098200Yq = Long.valueOf(jLLFFF);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Long l = (Long) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        if (l == null) {
            return 0L;
        }
        long jLongValue = l.longValue();
        C526890KlT.LIZLLL = Long.valueOf(jLongValue);
        return jLongValue;
    }

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

    public static Map LJ(C0XED c0xed) {
        LinkedHashMap linkedHashMap;
        synchronized (c0xed) {
            linkedHashMap = new LinkedHashMap(c0xed.LJFF(null));
            if (C563640M8s.LIZ() && C526890KlT.LIZLLL != null) {
                C526890KlT.LIZIZ.getClass();
                C051V.LIZ(linkedHashMap, "keyboard_language", LIZLLL().toArray(new String[0]));
                C051V.LIZ(linkedHashMap, "remaining_disk_space", Long.valueOf(LJI()));
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJII(android.view.inputmethod.InputMethodSubtype r9) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            r8 = 1
            r7 = 0
            if (r1 < r0) goto L13
            java.lang.String r6 = r9.getLanguageTag()
            int r0 = r6.length()
            if (r0 <= 0) goto L13
        L12:
            return r6
        L13:
            java.lang.String r2 = r9.getLocale()
            java.lang.String r6 = ""
            if (r2 == 0) goto L12
            int r0 = r2.length()
            if (r0 <= 0) goto L12
            char[] r1 = new char[r8]
            r0 = 95
            r1[r7] = r0
            r0 = 6
            java.util.List r5 = kotlin.text.a0.LJJLIIIJ(r2, r1, r7, r7, r0)
            int r1 = r5.size()
            if (r1 == r8) goto L77
            r4 = 2
            if (r1 == r4) goto L65
            r0 = 3
            if (r1 == r0) goto L4d
            java.util.Locale r3 = new java.util.Locale
            java.lang.Object r0 = X.C13LP.LJJJLL(r5)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L43
            r0 = r6
        L43:
            r3.<init>(r0)
        L46:
            java.lang.String r0 = r3.toLanguageTag()
            if (r0 == 0) goto L12
            return r0
        L4d:
            java.util.Locale r3 = new java.util.Locale
            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r5, r7)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r5, r8)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r5, r4)
            java.lang.String r0 = (java.lang.String) r0
            r3.<init>(r2, r1, r0)
            goto L46
        L65:
            java.util.Locale r3 = new java.util.Locale
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r5, r7)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r5, r8)
            java.lang.String r0 = (java.lang.String) r0
            r3.<init>(r1, r0)
            goto L46
        L77:
            java.util.Locale r3 = new java.util.Locale
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r5, r7)
            java.lang.String r0 = (java.lang.String) r0
            r3.<init>(r0)
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XED.LJII(android.view.inputmethod.InputMethodSubtype):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.Map<java.lang.String, java.lang.Object> LJFF(java.util.Map<java.lang.String, java.lang.Object> r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.Class<com.ss.android.ugc.aweme.services.music.IMusicBridgeService> r0 = com.ss.android.ugc.aweme.services.music.IMusicBridgeService.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L7a
            com.ss.android.ugc.aweme.services.music.IMusicBridgeService r0 = (com.ss.android.ugc.aweme.services.music.IMusicBridgeService) r0     // Catch: java.lang.Throwable -> L7a
            r2 = 1
            if (r0 == 0) goto L19
            boolean r0 = r0.enableBAAccountRequestRecommendMusic()     // Catch: java.lang.Throwable -> L7a
            if (r0 != r2) goto L19
            goto L1b
        L19:
            r0 = 0
            goto L1c
        L1b:
            r0 = 1
        L1c:
            if (r0 == 0) goto L71
            com.ss.android.ugc.aweme.commerce.BizAccount r1 = X.C0XEE.LIZ()     // Catch: java.lang.Throwable -> L7a
            X.1Ds4 r0 = X.C0CHQ.LIZ()     // Catch: java.lang.Throwable -> L7a
            X.0o1f r0 = r0.getAccountService()     // Catch: java.lang.Throwable -> L7a
            boolean r0 = r0.LJIIJJI()     // Catch: java.lang.Throwable -> L7a
            if (r0 != 0) goto L49
            if (r1 == 0) goto L39
            boolean r0 = r1.isVerifiedBA()     // Catch: java.lang.Throwable -> L7a
            if (r0 != r2) goto L39
            goto L3b
        L39:
            r0 = 0
            goto L3c
        L3b:
            r0 = 1
        L3c:
            if (r0 != 0) goto L49
            if (r1 == 0) goto L47
            boolean r0 = r1.getRestrictCommerceMusic()     // Catch: java.lang.Throwable -> L7a
            if (r0 != r2) goto L47
            goto L4b
        L47:
            r0 = 0
            goto L4c
        L49:
            r0 = 1
            goto L4f
        L4b:
            r0 = 1
        L4c:
            if (r0 != 0) goto L49
            r0 = 0
        L4f:
            if (r7 == 0) goto L5e
            java.lang.String r1 = "is_ba_account"
            if (r0 != 0) goto L56
            r2 = 0
        L56:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L7a
            X.C051V.LIZ(r7, r1, r0)     // Catch: java.lang.Throwable -> L7a
            goto L6f
        L5e:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L7a
            r7.<init>()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = "is_ba_account"
            if (r0 != 0) goto L68
            r2 = 0
        L68:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L7a
            X.C051V.LIZ(r7, r1, r0)     // Catch: java.lang.Throwable -> L7a
        L6f:
            monitor-exit(r6)
            return r7
        L71:
            if (r7 != 0) goto L78
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L7a
            r7.<init>()     // Catch: java.lang.Throwable -> L7a
        L78:
            monitor-exit(r6)
            return r7
        L7a:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XED.LJFF(java.util.Map):java.util.Map");
    }
}
