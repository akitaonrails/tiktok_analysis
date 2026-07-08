package X;

/* JADX INFO: renamed from: X.0tlt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1678150tlt {
    public static final long LIZ = C1682430tsn.LJ(14);

    public static final long LIZ(long j, long j2) {
        if (C1682440tso.LJ(j2)) {
            if (!C1682440tso.LJ(j)) {
                if (C1682440tso.LIZIZ(j) == 0) {
                    long j3 = LIZ;
                    float fLIZLLL = C1682440tso.LIZLLL(j2);
                    C1682430tsn.LIZ(j3);
                    return C1682430tsn.LJFF(C1682440tso.LIZLLL(j3) * fLIZLLL, C1682440tso.LIZIZ(j3));
                }
                float fLIZLLL2 = C1682440tso.LIZLLL(j2);
                C1682430tsn.LIZ(j);
                return C1682430tsn.LJFF(C1682440tso.LIZLLL(j) * fLIZLLL2, C1682440tso.LIZIZ(j));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cannot convert Em to Px when style.fontSize is Em (");
            sbLIZ.append((Object) C1682440tso.LJFF(j2));
            sbLIZ.append("). Please declare the style.fontSize with Sp units instead.");
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("The multiplier must be in em, but was ");
        sbLIZ2.append((Object) C1682440tso.LJFF(j2));
        sbLIZ2.append('.');
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
