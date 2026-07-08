package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0kcE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1326200kcE {
    public static final C1326200kcE LIZ = new C1326200kcE();
    public static Keva LIZIZ;

    public final synchronized Keva LIZIZ() {
        Keva repo;
        repo = LIZIZ;
        if (repo == null) {
            repo = Keva.getRepo("im_image_cache_space_repo");
            LIZIZ = repo;
        }
        return repo;
    }

    public final long LIZ(String str) {
        Keva kevaLIZIZ = LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cache_space_total_");
        sbLIZ.append(str);
        return kevaLIZIZ.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
    }

    public final void LIZJ(long j, String str) {
        Keva kevaLIZIZ = LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cache_space_total_");
        sbLIZ.append(str);
        kevaLIZIZ.storeLong(C2188811AlT.LIZIZ(sbLIZ), j);
    }
}
