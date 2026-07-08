package X;

import java.util.List;

/* JADX INFO: renamed from: X.0M3W, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M3W {
    public static final C562180M3c LIZIZ = new Object() { // from class: X.0M3c
    };
    public C0M3Y LIZ;

    public C0M3W(C0M3Y c0m3y) {
        this.LIZ = c0m3y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<C561950M2f> LIZ(List<? extends C561950M2f> list) {
        if (!list.isEmpty()) {
            C0M3Y c0m3y = this.LIZ;
            if (c0m3y.LIZ != EnumC562200M3e.FREE_UP_SPACE) {
                int i = C0M3Z.LIZ[c0m3y.LIZ().ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                throw new C1954807lC();
                            }
                            return list;
                        }
                        C0M3U.LIZJ(list);
                        return list;
                    }
                    for (C561950M2f c561950M2f : list) {
                        if (c561950M2f instanceof C0M0P) {
                            C0M0P c0m0p = (C0M0P) c561950M2f;
                            c0m0p.LJJIIJZLJL = C562270M3l.LJI(c0m0p).LIZ;
                        }
                    }
                    return C0M3U.LIZIZ(list);
                }
                C0M3U.LIZLLL(list, (List) this.LIZ.LIZLLL.getValue());
                return C0M3U.LIZIZ(list);
            }
            return list;
        }
        return list;
    }
}
