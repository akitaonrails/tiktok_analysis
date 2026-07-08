package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hbe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1210520hbe {
    public static final C1210520hbe LIZ = new C1210520hbe();
    public static C1210530hbf LIZIZ;

    public static Keva LIZ(C1210520hbe c1210520hbe) {
        Keva keva;
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        C1210530hbf c1210530hbf = LIZIZ;
        String str = null;
        if (c1210530hbf != null) {
            keva = c1210530hbf.LIZ;
            str = c1210530hbf.LIZIZ;
        } else {
            keva = null;
        }
        if (Intrinsics.LJFF(str, curUserId) && keva != null) {
            return keva;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cele_json_");
        sbLIZ.append(curUserId);
        Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
        LIZIZ = new C1210530hbf(repo, curUserId);
        return repo;
    }
}
