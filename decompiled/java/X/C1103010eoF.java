package X;

/* JADX INFO: renamed from: X.0eoF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1103010eoF {
    public static final EnumC1102990eoD LIZ(EnumC1102980eoC enumC1102980eoC) {
        int i = C1103020eoG.LIZ[enumC1102980eoC.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return EnumC1102990eoD.DEFAULT;
                    }
                    throw new C1954807lC();
                }
                return EnumC1102990eoD.HIGHLIGHT;
            }
            return EnumC1102990eoD.COLORFUL;
        }
        return EnumC1102990eoD.GRAY;
    }
}
