package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0e1f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1072890e1f {
    public static String LIZIZ = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
    public static C1072890e1f LIZJ;
    public final Keva LIZ;

    public C1072890e1f() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("i18n_recommmend_user_");
        sbLIZ.append(LIZIZ);
        this.LIZ = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }
}
