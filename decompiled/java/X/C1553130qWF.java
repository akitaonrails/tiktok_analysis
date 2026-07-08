package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qWF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1553130qWF {
    public static boolean LIZ;
    public static final List<InterfaceC1553210qWN> LIZIZ = new CopyOnWriteArrayList();
    public static final C1553120qWE LIZJ = new C1553120qWE();

    public static void LIZIZ(Function0 function0) {
        if (!LIZ) {
            return;
        }
        LIZ("GeckoBucketExecutor", function0.invoke());
    }

    public static void LJFF(Function0 function0) {
        String str;
        if (LIZ) {
            if (function0 == null) {
                str = "";
            } else {
                str = (String) function0.invoke();
            }
            LJ("GeckoBucketExecutor", str, null);
        }
    }

    public static void LIZ(String str, Object... objArr) {
        if (!LIZ) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) LIZIZ;
        if (copyOnWriteArrayList.size() == 0) {
            LIZJ.LIZIZ(objArr);
            return;
        }
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC1553210qWN) it2.next()).LIZIZ(objArr);
        }
    }

    public static void LIZLLL(String str, String str2) {
        if (!LIZ) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) LIZIZ;
        if (copyOnWriteArrayList.size() == 0) {
            LIZJ.getClass();
            return;
        }
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC1553210qWN) it2.next()).LIZ();
        }
    }

    public static void LIZJ(String str, String str2, Throwable th) {
        if (!LIZ) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) LIZIZ;
        if (copyOnWriteArrayList.size() == 0) {
            LIZJ.getClass();
            return;
        }
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC1553210qWN) it2.next()).e();
        }
    }

    public static void LJ(String str, String str2, Throwable th) {
        if (!LIZ) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) LIZIZ;
        if (copyOnWriteArrayList.size() == 0) {
            LIZJ.getClass();
            return;
        }
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC1553210qWN) it2.next()).w();
        }
    }
}
