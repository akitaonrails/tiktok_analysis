package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.08mI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2216408mI {
    public static final C2216408mI LIZ = new C2216408mI();
    public static Keva LIZIZ;

    public final synchronized Keva LIZ() {
        Keva repo;
        repo = LIZIZ;
        if (repo == null) {
            repo = Keva.getRepo("critical_flow_repo");
            LIZIZ = repo;
        }
        return repo;
    }

    public static long LIZIZ(String str) {
        Keva kevaLIZ = LIZ.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("share_head_show_performance");
        sbLIZ.append(str);
        long j = kevaLIZ.getLong(C2188811AlT.LIZIZ(sbLIZ), -1L);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("share_head_show_performance");
        sbLIZ2.append(str);
        kevaLIZ.erase(C2188811AlT.LIZIZ(sbLIZ2));
        return j;
    }
}
