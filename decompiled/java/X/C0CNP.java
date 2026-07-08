package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0CNP, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CNP {
    public static final C0CNP LIZ = new C0CNP();
    public static final boolean LIZIZ;

    static {
        LIZIZ = LIZ().getBoolean("last_exp_group", false) != C2537109wv.LJ();
    }

    public static Keva LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("profile_optimize_exp_keva");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }
}
