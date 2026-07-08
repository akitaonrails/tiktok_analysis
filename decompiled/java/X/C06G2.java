package X;

/* JADX INFO: renamed from: X.06G2, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06G2 {
    public static EnumC1578706Gb LIZ(EnumC1579606Gk enumC1579606Gk) {
        int i = C06G1.LIZ[enumC1579606Gk.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    throw new C1954807lC();
                }
                return EnumC1578706Gb.GONE;
            }
            return EnumC1578706Gb.GREY;
        }
        return EnumC1578706Gb.ORANGE;
    }
}
