package X;

/* JADX INFO: renamed from: X.0tsm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1682420tsm {
    public static int LIZ(float f, InterfaceC1690500u5o interfaceC1690500u5o) {
        float fLJJJJLL = interfaceC1690500u5o.LJJJJLL(f);
        if (Float.isInfinite(fLJJJJLL)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fLJJJJLL);
    }

    public static long LIZIZ(long j, InterfaceC1690500u5o interfaceC1690500u5o) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        return C1671180tae.LIZ(interfaceC1690500u5o.LLIIIJ(Float.intBitsToFloat((int) (j >> 32))), interfaceC1690500u5o.LLIIIJ(Float.intBitsToFloat((int) (j & 4294967295L))));
    }

    public static float LIZJ(long j, InterfaceC1690500u5o interfaceC1690500u5o) {
        if (!C1682450tsp.LIZ(C1682440tso.LIZJ(j), 4294967296L)) {
            C1682410tsl.LIZIZ("Only Sp can convert to Px");
        }
        return interfaceC1690500u5o.LJJJJLL(interfaceC1690500u5o.LLI(j));
    }

    public static long LIZLLL(long j, InterfaceC1690500u5o interfaceC1690500u5o) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fLJJJJLL = interfaceC1690500u5o.LJJJJLL(C1679680toM.LIZIZ(j));
        return (((long) Float.floatToRawIntBits(interfaceC1690500u5o.LJJJJLL(C1679680toM.LIZ(j)))) & 4294967295L) | (Float.floatToRawIntBits(fLJJJJLL) << 32);
    }
}
