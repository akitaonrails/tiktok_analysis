package X;

/* JADX INFO: renamed from: X.0j3z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1266530j3z {
    public static final C1266530j3z LIZ = new C1266530j3z();
    public static InterfaceC1267020j4m LIZIZ;

    public final void onEvent(EnumC1269710j97 enumC1269710j97) {
        InterfaceC1267020j4m interfaceC1267020j4m = LIZIZ;
        if (interfaceC1267020j4m != null) {
            C1266800j4Q c1266800j4Q = (C1266800j4Q) interfaceC1267020j4m;
            int i = C1270020j9c.LIZ[enumC1269710j97.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C1266350j3h c1266350j3h = c1266800j4Q.LIZ;
                        if (c1266350j3h.LLILZLL.LJJJJJL == EnumC1269710j97.START) {
                            c1266350j3h.LLILZ(null, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C1266350j3h c1266350j3h2 = c1266800j4Q.LIZ;
                if (c1266350j3h2.LLILZLL.LJJJJJL != EnumC1269710j97.HOST_PREVIEW_FIRST_FRAME) {
                    return;
                }
                c1266350j3h2.LLILZIL();
                return;
            }
            C1266350j3h c1266350j3h3 = c1266800j4Q.LIZ;
            if (c1266350j3h3.LLILZLL.LJJJJJL != EnumC1269710j97.LIVESTREAM_CREATED) {
                return;
            }
            c1266350j3h3.LLILZIL();
        }
    }
}
