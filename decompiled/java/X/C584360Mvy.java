package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Mvy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C584360Mvy {
    public static final List<WeakReference<Function1<Integer, Unit>>> LIZ = new ArrayList();
    public static final Map<Integer, ArrayList<Function0<Unit>>> LIZIZ = new LinkedHashMap();
    public static int LIZJ;
    public static int LIZLLL;

    public static final boolean LIZ() {
        return LIZJ < 4;
    }

    public static final boolean LIZIZ() {
        return LIZJ <= 5;
    }

    public static final boolean LIZJ() {
        C1602860roS.LIZ.getClass();
        if (C1602860roS.LJ()) {
            return !C1150504el.LIZ().LJIIIZ("feed_total");
        }
        C799900VZk.LIZ.getClass();
        return !C0CP9.LIZ();
    }

    public static void LIZLLL(int i) {
        LIZIZ.remove(Integer.valueOf(i));
    }

    public static final void LJ(int i) {
        LIZLLL = i;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        LIZLLL(3);
                    }
                } else {
                    LIZLLL(2);
                }
            } else {
                LIZLLL(1);
            }
        } else {
            LIZLLL(0);
        }
        ArrayList arrayList = (ArrayList) ((LinkedHashMap) LIZIZ).get(Integer.valueOf(LIZLLL));
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((Function0) it2.next()).invoke();
            }
        }
    }
}
