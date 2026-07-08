package X;

/* JADX INFO: renamed from: X.0YG0, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YG0 {
    public static final boolean LIZ(C0Y9G c0y9g, EnumC871430YGn enumC871430YGn) {
        int i = C0YG1.LIZ[enumC871430YGn.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return c0y9g.LJI;
                }
                throw new C1954807lC();
            }
            return c0y9g.LJFF;
        }
        if (c0y9g.LJFF && !c0y9g.LJI) {
            return true;
        }
        return false;
    }
}
