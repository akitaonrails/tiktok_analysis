package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0hc6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1210800hc6 {
    public static String LIZIZ = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
    public static C1210800hc6 LIZJ;
    public final Keva LIZ;

    public C1210800hc6() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recommend_friends_in_dm");
        sbLIZ.append(LIZIZ);
        this.LIZ = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }
}
