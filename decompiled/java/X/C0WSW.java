package X;

import Y.ARunnableS0S2101000_13;
import com.bytedance.pumbaa.utility.worker.PumbaaWorkerThread;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WSW, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WSW {
    public static final CopyOnWriteArrayList<C0WSX> LIZ = new CopyOnWriteArrayList<>();
    public static boolean LIZIZ;

    public static void LIZ(String str, Function0 function0, int i, Throwable th) {
        String str2;
        if (!C2187451AjH.LJIIJ() && i != 6) {
            if (!((Boolean) C1852707Nl.LJIILIIL.getValue()).booleanValue()) {
                if (((Boolean) C1852707Nl.LJIIL.getValue()).booleanValue() && Intrinsics.LJFF("Helios:Network-Invoke", str)) {
                    return;
                }
            } else {
                return;
            }
        }
        Iterator<C0WSX> it2 = LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(str, function0, i, th);
        }
        if (!LIZIZ) {
            return;
        }
        if (function0 != null) {
            str2 = (String) function0.invoke();
        } else {
            str2 = null;
        }
        if (!LIZIZ) {
            return;
        }
        C786410Ut5.LJJZZIII(PumbaaWorkerThread.getHandler(), new ARunnableS0S2101000_13(i, str2, str, th, 2));
    }
}
