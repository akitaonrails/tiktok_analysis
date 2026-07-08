package X;

import Y.ARunnableS124S0100000_24;
import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;

/* JADX INFO: renamed from: X.0qpB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1564870qpB {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(367));
    public static AFwS264S0000000_24 LIZIZ;
    public static AFwS264S0000000_24 LIZJ;
    public static AFwS264S0000000_24 LIZLLL;

    public static void LIZ(CopyOnWriteArrayList copyOnWriteArrayList) {
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            Iterator it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                LIZJ((C1564850qp9) it2.next());
            }
            copyOnWriteArrayList.clear();
        }
    }

    public static void LIZIZ(CopyOnWriteArrayList copyOnWriteArrayList) {
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            LIZJ((C1564850qp9) copyOnWriteArrayList.remove(0));
            if (!copyOnWriteArrayList.isEmpty()) {
                C786410Ut5.LJLIIL(50L, (Handler) LIZ.getValue(), new ARunnableS124S0100000_24(copyOnWriteArrayList, 73));
            }
        }
    }

    public static void LIZJ(C1564850qp9 c1564850qp9) {
        if (c1564850qp9.LLILLL) {
            C823050WQl.LIZIZ().execute(new ARunnableS124S0100000_24(c1564850qp9, 74));
        } else {
            c1564850qp9.LLILZIL.invoke();
        }
    }
}
