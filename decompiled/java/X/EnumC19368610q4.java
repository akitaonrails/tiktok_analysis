package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10q4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19368610q4 {
    public static final /* synthetic */ EnumC19368610q4[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19368610q4 TTK_EC_UX_COUPON_BUTTON_STATE_BORDER_COLOR_FILLED;
    public static final EnumC19368610q4 TTK_EC_UX_COUPON_BUTTON_STATE_DISPLAY_ONLY;
    public static final EnumC19368610q4 TTK_EC_UX_COUPON_BUTTON_STATE_FULL_COLOR_FILLED;

    public static InterfaceC2044707zh<EnumC19368610q4> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19368610q4 enumC19368610q4 = new EnumC19368610q4("TTK_EC_UX_COUPON_BUTTON_STATE_FULL_COLOR_FILLED", 0);
        TTK_EC_UX_COUPON_BUTTON_STATE_FULL_COLOR_FILLED = enumC19368610q4;
        EnumC19368610q4 enumC19368610q42 = new EnumC19368610q4("TTK_EC_UX_COUPON_BUTTON_STATE_BORDER_COLOR_FILLED", 1);
        TTK_EC_UX_COUPON_BUTTON_STATE_BORDER_COLOR_FILLED = enumC19368610q42;
        EnumC19368610q4 enumC19368610q43 = new EnumC19368610q4("TTK_EC_UX_COUPON_BUTTON_STATE_DISPLAY_ONLY", 2);
        TTK_EC_UX_COUPON_BUTTON_STATE_DISPLAY_ONLY = enumC19368610q43;
        EnumC19368610q4[] enumC19368610q4Arr = {enumC19368610q4, enumC19368610q42, enumC19368610q43};
        LL = enumC19368610q4Arr;
        LLILLJJLI = new C2254308sP(enumC19368610q4Arr);
    }

    public static EnumC19368610q4[] values() {
        return (EnumC19368610q4[]) LL.clone();
    }

    public static EnumC19368610q4 valueOf(String str) {
        return (EnumC19368610q4) C08FF.LIZ(EnumC19368610q4.class, str);
    }

    public EnumC19368610q4(String str, int i) {
    }
}
