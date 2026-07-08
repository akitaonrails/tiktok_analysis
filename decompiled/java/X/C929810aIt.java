package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0aIt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C929810aIt {
    public static int LIZ = 1;
    public static final List<C929840aIw> LIZIZ;
    public static C11JL LIZJ;
    public static long LIZLLL;

    static {
        ArrayList arrayList = new ArrayList();
        LIZIZ = arrayList;
        arrayList.add(new C929840aIw(1, 2));
        arrayList.add(new C929840aIw(2, 1));
        arrayList.add(new C929840aIw(2, 3));
        arrayList.add(new C929840aIw(3, 1));
    }

    public static boolean LIZ() {
        int i = LIZ;
        return i == 2 || i == 3;
    }

    public static void LIZIZ(int i) {
        List<C929840aIw> list = LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (((C929840aIw) obj).LIZ == LIZ) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            for (Object obj2 : arrayList) {
                if (((C929840aIw) obj2).LIZIZ == i) {
                    if (obj2 != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("transitionTo ");
                        sbLIZ.append(i);
                        C20441214yg.LIZIZ("ReservationStateMachine", C2188811AlT.LIZIZ(sbLIZ));
                        LIZ = i;
                        return;
                    }
                    return;
                }
            }
        }
    }
}
