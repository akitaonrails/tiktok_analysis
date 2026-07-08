package X;

import defpackage.c3;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: renamed from: X.0pt1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1528810pt1 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(139));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(140));

    public static void LIZ() {
        c3 c3Var = (c3) LIZIZ.getValue();
        List listLLIIII = C13LP.LLIIII(c3Var.LLILZ.values());
        c3Var.LLILZ.clear();
        Iterator it2 = listLLIIII.iterator();
        while (it2.hasNext()) {
            ((C09AE) it2.next()).LIZIZ(new CancellationException("cancelled by #cancelAll"));
        }
    }
}
