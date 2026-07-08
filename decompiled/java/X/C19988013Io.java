package X;

/* JADX INFO: renamed from: X.13Io, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19988013Io {
    public static final C13H0 LIZ = C13H4.LIZ("kotlinx.serialization.json.JsonUnquotedLiteral", C13GX.LIZ);

    public static final long LIZIZ(C13GN c13gn) {
        String strValueOf;
        C19987913In c19987913In = new C19987913In(c13gn.LIZJ());
        long jLJIIIIZZ = c19987913In.LJIIIIZZ();
        if (c19987913In.LJFF() != 10) {
            int i = c19987913In.LIZ;
            int i2 = i - 1;
            if (i != c19987913In.LJ.length() && i2 >= 0) {
                strValueOf = String.valueOf(c19987913In.LJ.charAt(i2));
            } else {
                strValueOf = "EOF";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected input to contain a single valid number, but got '");
            sbLIZ.append(strValueOf);
            sbLIZ.append("' after it");
            AbstractC19987713Il.LJIILLIIL(c19987913In, C2188811AlT.LIZIZ(sbLIZ), i2, null, 4);
            throw null;
        }
        return jLJIIIIZZ;
    }

    public static final void LIZ(AbstractC19979113Fd abstractC19979113Fd, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Element ");
        sbLIZ.append(C13LE.LIZ(abstractC19979113Fd.getClass()));
        sbLIZ.append(" is not a ");
        sbLIZ.append(str);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
