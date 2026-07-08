package X;

import Y.ARunnableS120S0100000_20;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0kl7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1331710kl7 {
    public static final ExecutorService LIZ = C823050WQl.LJFF();
    public static volatile Map<C1331510kkn, WeakReference<C1331790klF>> LIZIZ = new LinkedHashMap(80, 0.75f, false);

    public static void LIZ(C1331510kkn c1331510kkn) {
        LIZ.execute(new ARunnableS120S0100000_20(c1331510kkn, 409));
    }
}
