package X;

/* JADX INFO: renamed from: X.0X7x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C843710X7x {
    public static EnumC843700X7w LIZ(int i) {
        for (EnumC843700X7w enumC843700X7w : EnumC843700X7w.values()) {
            if (enumC843700X7w.getCode() == i) {
                return enumC843700X7w;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unknown error code: ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
