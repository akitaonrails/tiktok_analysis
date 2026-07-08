package X;

/* JADX INFO: renamed from: X.1DFI, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DFI {
    public static final C09AU LIZ = new C09AU("COMPLETING_ALREADY");
    public static final C09AU LIZIZ = new C09AU("COMPLETING_WAITING_CHILDREN");
    public static final C09AU LIZJ = new C09AU("COMPLETING_RETRY");
    public static final C09AU LIZLLL = new C09AU("TOO_LATE_TO_CANCEL");
    public static final C09AU LJ = new C09AU("SEALED");
    public static final C1DFJ LJFF = new C1DFJ(false);
    public static final C1DFJ LJI = new C1DFJ(true);

    public static final Object LIZ(Object obj) {
        C2252741DFg c2252741DFg;
        C13WP c13wp;
        if ((obj instanceof C2252741DFg) && (c2252741DFg = (C2252741DFg) obj) != null && (c13wp = c2252741DFg.LIZ) != null) {
            return c13wp;
        }
        return obj;
    }
}
