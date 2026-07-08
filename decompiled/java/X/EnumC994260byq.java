package X;

/* JADX INFO: renamed from: X.0byq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public enum EnumC994260byq {
    Simultaneously,
    Individually;

    public static EnumC994260byq forId(int i) {
        if (i != 1) {
            if (i == 2) {
                return Individually;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unknown trim path type ");
            sbLIZ.append(i);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return Simultaneously;
    }

    public static EnumC994260byq valueOf(String str) {
        return (EnumC994260byq) C08FF.LIZ(EnumC994260byq.class, str);
    }
}
