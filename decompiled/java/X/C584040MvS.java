package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0MvS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C584040MvS {
    public static boolean LIZ;
    public static Boolean LIZIZ;
    public static final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());
    public static final CopyOnWriteArrayList<Runnable> LIZLLL = new CopyOnWriteArrayList<>();
    public static final RunnableC581500MrM LJ = RunnableC581500MrM.LL;

    public static void LIZ() {
        Iterator<Runnable> it2 = LIZLLL.iterator();
        while (it2.hasNext()) {
            C786410Ut5.LJJZZIII(LIZJ, it2.next());
        }
        LIZLLL.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.RunnableC584060MvU r9) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C584040MvS.LIZIZ(X.0MvU):void");
    }
}
