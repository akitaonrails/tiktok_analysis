package X;

/* JADX INFO: renamed from: X.0MvV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C584070MvV {
    public static final C01GW LIZ;
    public static final boolean LIZIZ;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C288860BTw());
        LIZ = c01gwLIZIZ;
        LIZIZ = ((Number) c01gwLIZIZ.getValue()).intValue() >= 1;
    }

    public static EnumC584530MwF LIZ() {
        int iIntValue = ((Number) LIZ.getValue()).intValue();
        return iIntValue != 1 ? iIntValue != 2 ? EnumC584530MwF.NONE : EnumC584530MwF.DYNAMIC_BLUR : EnumC584530MwF.STATIC_BLUR;
    }
}
