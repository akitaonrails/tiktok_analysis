package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0qhG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1559960qhG {
    public static String LIZJ = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
    public static C1559960qhG LIZLLL;
    public final Keva LIZ;
    public volatile boolean LIZIZ;

    public C1559960qhG() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("maf_red_point_repo");
        sbLIZ.append(LIZJ);
        this.LIZ = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }
}
