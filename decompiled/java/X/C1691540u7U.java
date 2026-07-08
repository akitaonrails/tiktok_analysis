package X;

/* JADX INFO: renamed from: X.0u7U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1691540u7U {
    public final InterfaceC594710NUf LIZ;
    public final InterfaceC1690500u5o LIZIZ;
    public final EnumC1671200tag LIZJ;
    public final C1691560u7W LIZLLL;

    public C1691540u7U(InterfaceC594710NUf interfaceC594710NUf, InterfaceC1690500u5o interfaceC1690500u5o, EnumC1671200tag enumC1671200tag, int i) {
        C1691560u7W c1691560u7W;
        this.LIZ = interfaceC594710NUf;
        this.LIZIZ = interfaceC1690500u5o;
        this.LIZJ = enumC1671200tag;
        if (i > 0) {
            c1691560u7W = new C1691560u7W(i);
        } else {
            c1691560u7W = null;
        }
        this.LIZLLL = c1691560u7W;
    }

    public static C1692150u8T LIZ(C1691540u7U c1691540u7U, String str, C1693430uAX c1693430uAX, int i, long j, int i2) {
        int i3;
        EnumC1671200tag enumC1671200tag;
        InterfaceC1690500u5o interfaceC1690500u5o;
        InterfaceC594710NUf interfaceC594710NUf;
        long jLIZ = j;
        int i4 = i;
        C1693430uAX c1693430uAX2 = c1693430uAX;
        if ((i2 & 2) != 0) {
            c1693430uAX2 = C1693430uAX.LIZLLL;
        }
        boolean z = true;
        if ((i2 & 4) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if ((i2 & 8) == 0) {
            z = false;
        }
        if ((i2 & 16) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        if ((i2 & 32) != 0) {
            jLIZ = C1682390tsj.LIZ(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
        }
        if ((i2 & 64) != 0) {
            enumC1671200tag = c1691540u7U.LIZJ;
        } else {
            enumC1671200tag = null;
        }
        if ((i2 & 128) != 0) {
            interfaceC1690500u5o = c1691540u7U.LIZIZ;
        } else {
            interfaceC1690500u5o = null;
        }
        if ((i2 & 256) != 0) {
            interfaceC594710NUf = c1691540u7U.LIZ;
        } else {
            interfaceC594710NUf = null;
        }
        c1691540u7U.getClass();
        return LIZIZ(c1691540u7U, new C1692220u8a(str), c1693430uAX2, i3, z, i4, null, jLIZ, enumC1671200tag, interfaceC1690500u5o, interfaceC594710NUf, false, 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008c  */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0tu6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1692150u8T LIZIZ(X.C1691540u7U r20, X.C1692220u8a r21, X.C1693430uAX r22, int r23, boolean r24, int r25, java.util.List r26, long r27, X.EnumC1671200tag r29, X.InterfaceC1690500u5o r30, X.InterfaceC594710NUf r31, boolean r32, int r33) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1691540u7U.LIZIZ(X.0u7U, X.0u8a, X.0uAX, int, boolean, int, java.util.List, long, X.0tag, X.0u5o, X.0NUf, boolean, int):X.0u8T");
    }
}
