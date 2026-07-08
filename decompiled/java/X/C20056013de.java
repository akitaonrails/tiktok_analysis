package X;

/* JADX INFO: renamed from: X.13de, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20056013de {
    public static final AbstractC20055413dY LIZ(InterfaceC1691470u7N interfaceC1691470u7N, int i) {
        AbstractC20055413dY abstractC20055413dY = interfaceC1691470u7N.LJIJJ().LLILZLL;
        if (abstractC20055413dY != null && (abstractC20055413dY.LLILZ & i) != 0) {
            do {
                int i2 = abstractC20055413dY.LLILLL;
                if ((i2 & 2) != 0) {
                    break;
                }
                if ((i2 & i) != 0) {
                    return abstractC20055413dY;
                }
                abstractC20055413dY = abstractC20055413dY.LLILZLL;
            } while (abstractC20055413dY != null);
        }
        return null;
    }
}
