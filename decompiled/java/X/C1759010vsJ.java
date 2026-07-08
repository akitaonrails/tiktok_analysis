package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0vsJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1759010vsJ {
    public static C1760970vvT LIZ(String str) {
        HashMap<String, C1760970vvT> map = C1760970vvT.LJIILIIL;
        C1760970vvT c1760970vvT = map.get(str);
        if (c1760970vvT == null) {
            c1760970vvT = new C1760970vvT(str);
            map.put(str, c1760970vvT);
        }
        return c1760970vvT;
    }
}
