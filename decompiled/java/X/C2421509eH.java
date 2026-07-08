package X;

import android.content.Context;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.zoin.decode.DecodeProcessor;
import com.bytedance.zoin.model.AbstractModule;
import com.bytedance.zoin.model.LibDependency;
import com.bytedance.zoin.model.ModuleManager;
import com.ss.android.agilelogger.ALog;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.09eH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2421509eH {
    public static final ConcurrentHashMap<String, Boolean> LIZ = new ConcurrentHashMap<>();

    public static void LIZ(String str, C2422109eN c2422109eN) {
        PrintStream printStream = System.err;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ZOIN load compressed library ");
        sbLIZ.append(str);
        sbLIZ.append(" ");
        C2421309eF.LIZ.getClass();
        sbLIZ.append(C2421409eG.LIZIZ);
        printStream.println(C2188811AlT.LIZIZ(sbLIZ));
        for (LibDependency libDependency : ModuleManager.getDependencyList()) {
            if (libDependency.libName.substring(3).replace(".so", "").equals(str)) {
                PrintStream printStream2 = System.err;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ZOIN load so ");
                sbLIZ2.append(str);
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
                Iterator<String> it2 = libDependency.depsList.iterator();
                while (it2.hasNext()) {
                    LIZIZ(it2.next(), c2422109eN);
                }
                LIZIZ(libDependency.libName, c2422109eN);
                return;
            }
        }
        PrintStream printStream3 = System.err;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("ZOIN load compressed library ");
        sbLIZ3.append(str);
        sbLIZ3.append(" Failed!!!");
        printStream3.println(C2188811AlT.LIZIZ(sbLIZ3));
    }

    public static void LIZIZ(String str, C2422109eN c2422109eN) {
        AbstractModule value;
        C2421909eL c2421909eLDoLoad;
        if (Boolean.TRUE.equals(LIZ.get(str))) {
            PrintStream printStream = System.err;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ZOIN already success:");
            sbLIZ.append(str);
            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C2421409eG c2421409eG = C2421309eF.LIZ;
        if (!C2421409eG.LIZIZ) {
            c2421409eG.getClass();
        } else {
            for (Map.Entry<String, AbstractModule> entry : c2421409eG.LIZ.entrySet()) {
                if (entry.getValue().moduleType == 0 && entry.getValue().findByFileName(str) != null) {
                    value = entry.getValue();
                    break;
                }
            }
        }
        value = null;
        if (value != null && !value.isDecoded()) {
            PrintStream printStream2 = System.err;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ZOIN decode when use ");
            sbLIZ2.append(str);
            printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            C2421409eG c2421409eG2 = C2421309eF.LIZ;
            String str2 = value.moduleName;
            c2421409eG2.getClass();
            C2418109dj c2418109djLIZLLL = C2418109dj.LIZLLL();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("zoin start decode module ");
            sbLIZ3.append(str2);
            sbLIZ3.append(" force:");
            sbLIZ3.append(false);
            c2418109djLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ3));
            AbstractModule abstractModule = c2421409eG2.LIZ.get(str2);
            if (abstractModule == null) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("cant find module when decode async ");
                sbLIZ4.append(str2);
                c2421909eLDoLoad = new C2421909eL(100, new C2418409dm(C2188811AlT.LIZIZ(sbLIZ4)));
            } else {
                c2421909eLDoLoad = abstractModule.doLoad(false);
                if (DecodeProcessor.hasProcessed) {
                    C2418109dj.LIZLLL().getClass();
                    String strLIZJ = C2418109dj.LIZJ();
                    try {
                        try {
                            C2421709eJ.LJ();
                            C794210VDn c794210VDn = new C794210VDn((File) new C0VSJ(C2421709eJ.LIZIZ(), "zoin_load.log"), true);
                            c794210VDn.write(strLIZJ);
                            c794210VDn.close();
                            C2421709eJ.LJFF();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C2421709eJ.LJFF();
                            throw th;
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new RuntimeException(e);
                    }
                }
            }
            PrintStream printStream3 = System.err;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("ZOIN decode when use ");
            sbLIZ5.append(str);
            sbLIZ5.append(" result:");
            sbLIZ5.append(c2421909eLDoLoad.toString());
            printStream3.println(C2188811AlT.LIZIZ(sbLIZ5));
        }
        if (ModuleManager.isSoCompressed(str)) {
            C0VSJ c0vsj = new C0VSJ(C2421709eJ.LIZIZ(), str);
            PrintStream printStream4 = System.err;
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("ZOIN load by path >= 6.0");
            sbLIZ6.append(c0vsj.getPath());
            printStream4.println(C2188811AlT.LIZIZ(sbLIZ6));
            String path = c0vsj.getPath();
            c2422109eN.getClass();
            try {
                System.load(path);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new RuntimeException(e2);
            }
        } else {
            PrintStream printStream5 = System.err;
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("ZOIN load origin: ");
            sbLIZ7.append(str.substring(3).replace(".so", ""));
            printStream5.println(C2188811AlT.LIZIZ(sbLIZ7));
            String strReplace = str.substring(3).replace(".so", "");
            c2422109eN.getClass();
            if (C1304550k3J.LIZJ == null) {
                try {
                    Class cls = Boolean.TYPE;
                    Method declaredMethod = Librarian.class.getDeclaredMethod("loadLibraryInternal", String.class, cls, cls, Context.class);
                    C1304550k3J.LIZJ = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append("find loadLibraryInternal failed ");
                    sbLIZ8.append(strReplace);
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("ZOIN", C2188811AlT.LIZIZ(sbLIZ8));
                    throw new RuntimeException(e3);
                }
            }
            try {
                Method method = C1304550k3J.LIZJ;
                Boolean bool = Boolean.FALSE;
                method.invoke(null, strReplace, bool, bool, null);
            } catch (IllegalAccessException e4) {
                TryCatchGuardChecker.doCheck(e4);
                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                sbLIZ9.append("call loadLibraryInternal failed access ");
                sbLIZ9.append(strReplace);
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("ZOIN", C2188811AlT.LIZIZ(sbLIZ9));
                throw new RuntimeException(e4);
            } catch (InvocationTargetException e5) {
                TryCatchGuardChecker.doCheck(e5);
                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                sbLIZ10.append("call loadLibraryInternal failed invoke ");
                sbLIZ10.append(strReplace);
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("ZOIN", C2188811AlT.LIZIZ(sbLIZ10));
                throw new RuntimeException(e5);
            }
        }
        LIZ.put(str, Boolean.TRUE);
        PrintStream printStream6 = System.err;
        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
        sbLIZ11.append("ZOIN loadLibrary ");
        sbLIZ11.append(str);
        sbLIZ11.append(" success");
        printStream6.println(C2188811AlT.LIZIZ(sbLIZ11));
    }
}
