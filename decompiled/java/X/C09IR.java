package X;

/* JADX INFO: renamed from: X.09IR, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09IR {
    public static final C09AU LIZ = new C09AU("NO_VALUE");

    public static final C2252331DDr LIZ(int i, int i2, EnumC2252401DDy enumC2252401DDy) {
        if (i >= 0) {
            if (i2 >= 0) {
                if (i <= 0 && i2 <= 0 && enumC2252401DDy != EnumC2252401DDy.SUSPEND) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
                    sbLIZ.append(enumC2252401DDy);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    strLIZIZ.toString();
                    throw new IllegalArgumentException(strLIZIZ);
                }
                int i3 = i2 + i;
                if (i3 < 0) {
                    i3 = Integer.MAX_VALUE;
                }
                return new C2252331DDr(i, i3, enumC2252401DDy);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("extraBufferCapacity cannot be negative, but was ");
            sbLIZ2.append(i2);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            strLIZIZ2.toString();
            throw new IllegalArgumentException(strLIZIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("replay cannot be negative, but was ");
        sbLIZ3.append(i);
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        strLIZIZ3.toString();
        throw new IllegalArgumentException(strLIZIZ3);
    }

    public static /* synthetic */ C2252331DDr LIZIZ(int i, int i2, EnumC2252401DDy enumC2252401DDy, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            enumC2252401DDy = EnumC2252401DDy.SUSPEND;
        }
        return LIZ(i, i2, enumC2252401DDy);
    }
}
