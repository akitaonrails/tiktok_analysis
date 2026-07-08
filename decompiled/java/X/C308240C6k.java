package X;

import java.util.LinkedList;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0C6k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C308240C6k {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C308250C6l());
    public static final C01GW LIZIZ = C452501pT.LIZ(EnumC452301pR.PUBLICATION, new C293520Bew());

    public static int LIZ() {
        return ((Number) LIZIZ.getValue()).intValue();
    }

    public static final boolean LIZIZ() {
        C01GW c01gw = C0BIQ.LIZ;
        return 2 == LIZ() || LIZ() == 3;
    }

    public static final void LIZJ(int i, String str, boolean z) {
        C2344809Gs.LIZLLL(3, "TabVisibility", str);
        if (1 != LIZ() && LIZ() != 3) {
            return;
        }
        C01GW c01gw = LIZ;
        ((LinkedList) c01gw.getValue()).add(new Pair(Integer.valueOf(i), Boolean.valueOf(z)));
        if (((LinkedList) c01gw.getValue()).size() > 3) {
            ((LinkedList) c01gw.getValue()).poll();
        }
    }
}
