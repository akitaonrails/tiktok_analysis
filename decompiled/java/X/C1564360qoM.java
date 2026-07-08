package X;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0qoM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1564360qoM {
    public static volatile int LIZIZ;
    public static int LJIIIIZZ;
    public static int LJIIIZ;
    public static Long LJIIJ;
    public static final C1564360qoM LIZ = new C1564360qoM();
    public static final List<String> LIZJ = new CopyOnWriteArrayList();
    public static final List<String> LIZLLL = new CopyOnWriteArrayList();
    public static final List<String> LJ = new CopyOnWriteArrayList();
    public static final List<String> LJFF = new CopyOnWriteArrayList();
    public static final List<String> LJI = new CopyOnWriteArrayList();
    public static final List<String> LJII = new CopyOnWriteArrayList();

    public static void LIZ() {
        LJIIIIZZ = 0;
        LJIIIZ = 0;
        LJIIJ = null;
        ((CopyOnWriteArrayList) LJ).clear();
        ((CopyOnWriteArrayList) LIZLLL).clear();
        ((CopyOnWriteArrayList) LIZJ).clear();
        LIZIZ = 0;
    }

    public final void LIZIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("filterLiveGapMin_");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str2);
        sbLIZ2.append("sessionHolder = ");
        sbLIZ2.append(hashCode());
        AbstractC827810Wdf.LIZ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
    }
}
