package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0zc9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1902750zc9 {
    public static final /* synthetic */ int LIZLLL = 0;
    public C0ZBB LIZ;
    public Boolean LIZIZ;
    public boolean LIZJ;

    public static Keva LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("inbox_follower_keva:");
        C0XQ7.LJ();
        sbLIZ.append(C0XQ7.LIZ.LJIIJ().getCurUserId());
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }
}
