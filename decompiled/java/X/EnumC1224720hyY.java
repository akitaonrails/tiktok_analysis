package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hyY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1224720hyY {
    public static final /* synthetic */ EnumC1224720hyY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1224720hyY ONE_BUTTON;
    public static final EnumC1224720hyY POLICY;
    public static final EnumC1224720hyY TWO_BUTTON_A;
    public static final EnumC1224720hyY TWO_BUTTON_B;

    public static InterfaceC2044707zh<EnumC1224720hyY> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1224720hyY enumC1224720hyY = new EnumC1224720hyY("ONE_BUTTON", 0);
        ONE_BUTTON = enumC1224720hyY;
        EnumC1224720hyY enumC1224720hyY2 = new EnumC1224720hyY("TWO_BUTTON_A", 1);
        TWO_BUTTON_A = enumC1224720hyY2;
        EnumC1224720hyY enumC1224720hyY3 = new EnumC1224720hyY("TWO_BUTTON_B", 2);
        TWO_BUTTON_B = enumC1224720hyY3;
        EnumC1224720hyY enumC1224720hyY4 = new EnumC1224720hyY("POLICY", 3);
        POLICY = enumC1224720hyY4;
        EnumC1224720hyY[] enumC1224720hyYArr = {enumC1224720hyY, enumC1224720hyY2, enumC1224720hyY3, enumC1224720hyY4};
        LL = enumC1224720hyYArr;
        LLILLJJLI = new C2254308sP(enumC1224720hyYArr);
    }

    public static EnumC1224720hyY[] values() {
        return (EnumC1224720hyY[]) LL.clone();
    }

    public static EnumC1224720hyY valueOf(String str) {
        return (EnumC1224720hyY) C08FF.LIZ(EnumC1224720hyY.class, str);
    }

    public EnumC1224720hyY(String str, int i) {
    }
}
