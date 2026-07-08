package X;

import kotlin.text.u;

/* JADX INFO: renamed from: X.152M, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C152M {
    public static C1065380dpY LIZ(String str) {
        C152U c152u = C152U.LJFF;
        c152u.getClass();
        if (!C152U.LJII.contains(str)) {
            AnonymousClass1523 anonymousClass1523 = AnonymousClass1523.LJFF;
            anonymousClass1523.getClass();
            if (!AnonymousClass1523.LJII.contains(str)) {
                if (u.LJJIIJZLJL(str, "g_broadcast", false)) {
                    return C152Q.LJFF;
                }
                if (u.LJJIIJZLJL(str, "g_watch", false)) {
                    return C152T.LJFF;
                }
                if (u.LJJIIJZLJL(str, "g_interaction", false)) {
                    return C152N.LJFF;
                }
                C152Q c152q = C152Q.LJFF;
                c152q.getClass();
                if (C152Q.LJIIIIZZ.contains(str)) {
                    return c152q;
                }
                if (u.LJJIIJZLJL(str, "g_ttgp", false)) {
                    return C152F.LJFF;
                }
                return null;
            }
            return anonymousClass1523;
        }
        return c152u;
    }
}
