package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.09Gs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2344809Gs {
    public static volatile boolean LIZ;
    public static CopyOnWriteArrayList<InterfaceC2344709Gr> LIZIZ;
    public static Context LIZJ;

    public static void LIZ(Exception exc) {
        if (!C2345409Gy.LIZ()) {
            LIZIZ("", exc);
        }
    }

    public static void LJ(String str) {
        if (!C2345409Gy.LIZ()) {
            LIZLLL(3, null, str);
        }
    }

    public static void LJI(Throwable th) {
        CopyOnWriteArrayList<InterfaceC2344709Gr> copyOnWriteArrayList;
        if (!C2345409Gy.LIZ() && LIZ && (copyOnWriteArrayList = LIZIZ) != null) {
            for (InterfaceC2344709Gr interfaceC2344709Gr : copyOnWriteArrayList) {
                if (interfaceC2344709Gr != null && interfaceC2344709Gr.isEnable()) {
                    interfaceC2344709Gr.lw();
                    interfaceC2344709Gr.LIZLLL("AppLog", th);
                }
            }
        }
    }

    public static void LIZIZ(String str, Exception exc) throws Exception {
        CopyOnWriteArrayList<InterfaceC2344709Gr> copyOnWriteArrayList;
        if (!C2345409Gy.LIZ()) {
            if (C2213981Bky.LIZIZ.LIZLLL()) {
                if (exc instanceof RuntimeException) {
                    throw exc;
                }
                throw new RuntimeException(str, exc);
            }
            if (LIZ && (copyOnWriteArrayList = LIZIZ) != null) {
                for (InterfaceC2344709Gr interfaceC2344709Gr : copyOnWriteArrayList) {
                    if (interfaceC2344709Gr != null && interfaceC2344709Gr.isEnable()) {
                        interfaceC2344709Gr.lw();
                        interfaceC2344709Gr.LIZJ("AppLog", str, exc);
                    }
                }
            }
        }
    }

    public static synchronized void LIZJ(Context context, List<InterfaceC2344709Gr> list) {
        if (!LIZ) {
            if (context != null) {
                LIZJ = C786410Ut5.N3(context);
                if (!((ArrayList) list).isEmpty()) {
                    LIZIZ = new CopyOnWriteArrayList<>(list);
                }
                CopyOnWriteArrayList<InterfaceC2344709Gr> copyOnWriteArrayList = LIZIZ;
                if (copyOnWriteArrayList != null) {
                    for (InterfaceC2344709Gr interfaceC2344709Gr : copyOnWriteArrayList) {
                        if (interfaceC2344709Gr != null && interfaceC2344709Gr.isEnable()) {
                            interfaceC2344709Gr.init(LIZJ);
                        }
                    }
                }
                LIZ = true;
            } else {
                throw new IllegalArgumentException("Context can't be null!");
            }
        } else {
            throw new IllegalStateException("CrashlyticsWrapper already inited!");
        }
    }

    public static void LJFF(String str, String str2) {
        if (!C2345409Gy.LIZ()) {
            LIZLLL(2, str, str2);
        }
    }

    public static void LIZLLL(int i, String str, String str2) {
        CopyOnWriteArrayList<InterfaceC2344709Gr> copyOnWriteArrayList;
        String str3;
        if (!C2345409Gy.LIZ() && LIZ && (copyOnWriteArrayList = LIZIZ) != null) {
            for (InterfaceC2344709Gr interfaceC2344709Gr : copyOnWriteArrayList) {
                if (interfaceC2344709Gr != null && interfaceC2344709Gr.isEnable()) {
                    if (str == null) {
                        interfaceC2344709Gr.lw();
                        str3 = "AppLog";
                    } else {
                        str3 = str;
                    }
                    interfaceC2344709Gr.LIZ(i, str3, str2);
                }
            }
        }
    }
}
