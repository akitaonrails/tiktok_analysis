package X;

/* JADX INFO: renamed from: X.0u9T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692770u9T {
    public static C1695170uDL LIZ(String str, C1693430uAX c1693430uAX, long j, InterfaceC1690500u5o interfaceC1690500u5o, InterfaceC594710NUf interfaceC594710NUf, C13BV c13bv, int i, int i2) {
        C13BV c13bv2;
        int i3 = i;
        C13BV c13bv3 = c13bv;
        if ((i2 & 32) != 0) {
            c13bv3 = C13BV.INSTANCE;
        }
        if ((i2 & 64) != 0) {
            c13bv2 = C13BV.INSTANCE;
        } else {
            c13bv2 = null;
        }
        if ((i2 & 128) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        int i4 = i2 & 256;
        return new C1695170uDL(new C1695120uDG(c1693430uAX, interfaceC594710NUf, interfaceC1690500u5o, str, c13bv3, c13bv2), i3, 1, j);
    }
}
