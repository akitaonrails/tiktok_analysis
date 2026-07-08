package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zLZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1892470zLZ {
    public static final EnumC1892470zLZ B_LIVE_PIN_CARD;
    public static final EnumC1892470zLZ C_LIVE_PIN_CARD;
    public static final EnumC1892470zLZ FYP_LIVE_CARD;
    public static final /* synthetic */ EnumC1892470zLZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1892470zLZ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1892470zLZ enumC1892470zLZ = new EnumC1892470zLZ("FYP_LIVE_CARD", 0, "fyp_live_card");
        FYP_LIVE_CARD = enumC1892470zLZ;
        EnumC1892470zLZ enumC1892470zLZ2 = new EnumC1892470zLZ("C_LIVE_PIN_CARD", 1, "c_live_pin_card");
        C_LIVE_PIN_CARD = enumC1892470zLZ2;
        EnumC1892470zLZ enumC1892470zLZ3 = new EnumC1892470zLZ("B_LIVE_PIN_CARD", 2, "b_live_pin_card");
        B_LIVE_PIN_CARD = enumC1892470zLZ3;
        EnumC1892470zLZ[] enumC1892470zLZArr = {enumC1892470zLZ, enumC1892470zLZ2, enumC1892470zLZ3};
        LLILLJJLI = enumC1892470zLZArr;
        LLILLL = new C2254308sP(enumC1892470zLZArr);
    }

    public static EnumC1892470zLZ[] values() {
        return (EnumC1892470zLZ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1892470zLZ valueOf(String str) {
        return (EnumC1892470zLZ) C08FF.LIZ(EnumC1892470zLZ.class, str);
    }

    public EnumC1892470zLZ(String str, int i, String str2) {
        this.LL = str2;
    }
}
