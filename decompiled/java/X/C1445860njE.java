package X;

/* JADX INFO: renamed from: X.0njE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1445860njE {
    public static final C1445860njE LIZ = new C1445860njE();

    public static long LIZ(int i) {
        long jLJI = C214694190i.LIZIZ.LJI();
        if (jLJI != 1) {
            return jLJI;
        }
        if (i != 0) {
            return 4L;
        }
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser == null || !currentUser.LJIIIZ()) {
            return 1L;
        }
        return 3L;
    }
}
