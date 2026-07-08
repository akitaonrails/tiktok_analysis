package X;

/* JADX INFO: renamed from: X.0l8K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1346100l8K {
    public static final C1346000l8A LIZ(C0XM9 c0xm9) {
        C1345980l88 c1345980l88;
        Object obj = c0xm9.LJIIIIZZ;
        Object obj2 = null;
        if (!(obj instanceof C1345980l88) || (c1345980l88 = (C1345980l88) obj) == null) {
            return null;
        }
        Object obj3 = c1345980l88.LJJI.get(C1346000l8A.class);
        if (obj3 instanceof C1346000l8A) {
            obj2 = obj3;
        }
        return (C1346000l8A) obj2;
    }

    public static final boolean LIZIZ(C0XM9 c0xm9, int i) {
        C1346000l8A c1346000l8ALIZ = LIZ(c0xm9);
        if (c1346000l8ALIZ == null || (c1346000l8ALIZ.LIZ & i) <= 0) {
            return false;
        }
        return true;
    }
}
