package X;

/* JADX INFO: renamed from: X.18eO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public enum EnumC21334618eO {
    VISIBLE(0),
    HIDDEN(1),
    SCROLL(2);

    public final int LL;

    public int intValue() {
        return this.LL;
    }

    public static EnumC21334618eO fromInt(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return SCROLL;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unknown enum value: ");
                sbLIZ.append(i);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return HIDDEN;
        }
        return VISIBLE;
    }

    EnumC21334618eO(int i) {
        this.LL = i;
    }
}
