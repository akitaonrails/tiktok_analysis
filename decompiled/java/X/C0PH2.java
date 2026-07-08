package X;

import Y.ARunnableS110S0100000_10;
import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;

/* JADX INFO: renamed from: X.0PH2, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PH2 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(402));
    public static AFwS241S0000000_10 LIZIZ;
    public static AFwS241S0000000_10 LIZJ;
    public static AFwS241S0000000_10 LIZLLL;

    public static void LIZ() {
        if (LIZIZ == null) {
            LIZIZ = AFwS241S0000000_10.get$arr$(415);
        }
        if (LIZJ == null) {
            LIZJ = AFwS241S0000000_10.get$arr$(416);
        }
        if (LIZLLL == null) {
            LIZLLL = AFwS241S0000000_10.get$arr$(417);
        }
    }

    public static void LIZIZ(CopyOnWriteArrayList copyOnWriteArrayList) {
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            Iterator it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                LIZLLL((C0PH1) it2.next());
            }
            copyOnWriteArrayList.clear();
        }
    }

    public static void LIZJ(CopyOnWriteArrayList copyOnWriteArrayList) {
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            LIZLLL((C0PH1) copyOnWriteArrayList.remove(0));
            if (!copyOnWriteArrayList.isEmpty()) {
                C786410Ut5.LJLIIL(50L, (Handler) LIZ.getValue(), new ARunnableS110S0100000_10(copyOnWriteArrayList, 102));
            }
        }
    }

    public static void LIZLLL(C0PH1 c0ph1) {
        if (c0ph1.LLILLL) {
            C823050WQl.LIZJ().execute(new ARunnableS110S0100000_10(c0ph1, 103));
        } else {
            c0ph1.LLILZIL.invoke();
        }
    }
}
