package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.0pjx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1523190pjx {
    public static final AbstractC1906590ziL LIZ = C1906580ziK.LIZJ();
    public static final ArrayList<C1523170pjv> LIZIZ = new ArrayList<>();
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1523220pk0());

    public static final void LIZ(AbstractC1387200mCc abstractC1387200mCc, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(abstractC1387200mCc);
        sbLIZ.append(' ');
        sbLIZ.append(str);
        LIZIZ.add(new C1523170pjv(jCurrentTimeMillis, C2188811AlT.LIZIZ(sbLIZ)));
    }
}
