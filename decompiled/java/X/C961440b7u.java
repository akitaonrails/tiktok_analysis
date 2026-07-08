package X;

/* JADX INFO: renamed from: X.0b7u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C961440b7u {
    public static final String LIZ(EnumC961090b7L enumC961090b7L) {
        if (enumC961090b7L == null) {
            return "";
        }
        int i = C961270b7d.LIZ[enumC961090b7L.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new C1954807lC();
                    }
                    return "new";
                }
                return "last_time";
            }
            return "click";
        }
        return "preload";
    }
}
