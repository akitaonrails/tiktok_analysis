package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.0NFw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C590980NFw {
    public static final AtomicReference<Aweme> LIZ = new AtomicReference<>(null);
    public static final AtomicReference<String> LIZIZ = new AtomicReference<>(null);
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public static final AtomicBoolean LJ = new AtomicBoolean(false);
    public static final AtomicBoolean LJFF = new AtomicBoolean(false);
    public static final AtomicBoolean LJI = new AtomicBoolean(false);
    public static final CopyOnWriteArrayList<InterfaceC590990NFx> LJII = new CopyOnWriteArrayList<>();
    public static boolean LJIIIIZZ;

    public static Aweme LIZ() {
        Aweme andSet = LIZ.getAndSet(null);
        if (andSet != null) {
            LJFF.set(false);
            LIZIZ();
        }
        return andSet;
    }

    public static void LIZIZ() {
        Iterator<InterfaceC590990NFx> it2 = LJII.iterator();
        while (it2.hasNext()) {
            it2.next().n0();
        }
    }
}
