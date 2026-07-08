package X;

import com.bytedance.retrofit2.Retrofit;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.08lT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2211308lT {
    public static String LIZIZ(Throwable th) {
        PrintWriter printWriter;
        String string = null;
        try {
            StringWriter stringWriter = new StringWriter();
            printWriter = new PrintWriter(stringWriter);
            try {
                th.printStackTrace(printWriter);
                Throwable cause = th.getCause();
                if (cause != null) {
                    cause.printStackTrace(printWriter);
                    Throwable cause2 = cause.getCause();
                    if (cause2 != null) {
                        cause2.printStackTrace(printWriter);
                    }
                }
                string = stringWriter.toString();
            } catch (Throwable th2) {
                th = th2;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    if (printWriter != null) {
                    }
                    return string;
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    if (printWriter != null) {
                        printWriter.close();
                    }
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            printWriter = null;
        }
        printWriter.close();
        return string;
    }

    public static boolean LIZ(String str, List<String> list) {
        boolean zEndsWith;
        if (!C2093608Ic.LJ(str) && !C0IKQ.LIZ(list)) {
            for (String str2 : list) {
                if (!C2093608Ic.LJ(str2)) {
                    if (C0X2R.LJ) {
                        if (str.endsWith(str2)) {
                            return true;
                        }
                    } else if (!C2093608Ic.LJ(str) && !C2093608Ic.LJ(str2)) {
                        if (!str.equalsIgnoreCase(str2)) {
                            String lowerCase = str.toLowerCase();
                            if (str2.startsWith(e3.d)) {
                                zEndsWith = lowerCase.endsWith(str2.toLowerCase());
                            } else {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(e3.d);
                                sbLIZ.append(str2.toLowerCase());
                                zEndsWith = lowerCase.endsWith(C2188811AlT.LIZIZ(sbLIZ));
                            }
                            if (zEndsWith) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void LIZJ(String str, List<String> list) {
        if (!C2093608Ic.LJ(str) && list != null) {
            for (String str2 : str.split(",")) {
                if (!C2093608Ic.LJ(str2) && !LIZ(str2, list)) {
                    list.add(str2.trim());
                }
            }
        }
    }

    public static void LIZLLL(C08I7<String, Retrofit> c08i7, InterfaceC1904907d9 interfaceC1904907d9) {
        if (c08i7 != null && c08i7.LJFF() > 0) {
            Map<String, Retrofit> mapLIZJ = c08i7.LIZJ();
            Collection<Retrofit> collectionValues = mapLIZJ.values();
            synchronized (mapLIZJ) {
                try {
                    Iterator<Retrofit> it2 = collectionValues.iterator();
                    while (it2.hasNext()) {
                        List<InterfaceC1904907d9> list = it2.next().LJIIIIZZ;
                        if (list != null && !list.contains(interfaceC1904907d9)) {
                            list.add(interfaceC1904907d9);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static void LJ(C08I7<String, Retrofit> c08i7, InterfaceC1904907d9 interfaceC1904907d9) {
        if (c08i7 != null && c08i7.LJFF() > 0) {
            Map<String, Retrofit> mapLIZJ = c08i7.LIZJ();
            Collection<Retrofit> collectionValues = mapLIZJ.values();
            synchronized (mapLIZJ) {
                try {
                    Iterator<Retrofit> it2 = collectionValues.iterator();
                    while (it2.hasNext()) {
                        List<InterfaceC1904907d9> list = it2.next().LJIIIIZZ;
                        if (list != null) {
                            list.remove(interfaceC1904907d9);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
