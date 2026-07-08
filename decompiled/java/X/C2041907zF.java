package X;

import Y.ARunnableS103S0100000_3;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07zF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2041907zF {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C2042207zI());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1977607os());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1977507or());
    public static final HashMap<WeakReference<Object>, Runnable> LIZLLL = new HashMap<>();
    public static final Map<Object, Runnable> LJ = new LinkedHashMap();
    public static boolean LJFF;

    public static void LIZIZ(Function0 function0) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII(C2113808Pw.LIZIZ.LL, new ARunnableS103S0100000_3(function0, 31));
        }
    }

    public static final void LIZJ(Object obj) {
        if (obj != null && ((Boolean) LIZJ.getValue()).booleanValue()) {
            LIZIZ(new C1977407oq(obj));
        }
    }

    public static final void LIZ(Object obj, Runnable runnable) {
        if (obj != null && ((Boolean) LIZJ.getValue()).booleanValue()) {
            if (runnable != null) {
                LIZIZ(new C2042507zL(obj, runnable));
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }
}
