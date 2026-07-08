package X;

/* JADX INFO: renamed from: X.0byp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public enum EnumC994250byp {
    SIMULTANEOUSLY,
    INDIVIDUALLY;

    public static EnumC994250byp forId(int i) {
        if (i != 1) {
            if (i == 2) {
                return INDIVIDUALLY;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unknown trim path type ");
            sbLIZ.append(i);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return SIMULTANEOUSLY;
    }

    public static EnumC994250byp valueOf(String str) {
        return (EnumC994250byp) C08FF.LIZ(EnumC994250byp.class, str);
    }
}
