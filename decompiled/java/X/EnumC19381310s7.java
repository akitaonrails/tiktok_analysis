package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10s7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19381310s7 {
    public static final C19381410s8 Companion;
    public static final /* synthetic */ EnumC19381310s7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19381310s7 TEMPLATE_RECT_WITHOUT_BUTTON;
    public static final EnumC19381310s7 TEMPLATE_TYPE_UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC19381310s7> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.10s8] */
    static {
        EnumC19381310s7 enumC19381310s7 = new EnumC19381310s7("TEMPLATE_TYPE_UNKNOWN", 0, 0);
        TEMPLATE_TYPE_UNKNOWN = enumC19381310s7;
        EnumC19381310s7 enumC19381310s72 = new EnumC19381310s7("TEMPLATE_RECT_WITHOUT_BUTTON", 1, 1);
        TEMPLATE_RECT_WITHOUT_BUTTON = enumC19381310s72;
        EnumC19381310s7[] enumC19381310s7Arr = {enumC19381310s7, enumC19381310s72};
        LLILLJJLI = enumC19381310s7Arr;
        LLILLL = new C2254308sP(enumC19381310s7Arr);
        Companion = new Object() { // from class: X.10s8
        };
    }

    public static EnumC19381310s7[] values() {
        return (EnumC19381310s7[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC19381310s7 valueOf(String str) {
        return (EnumC19381310s7) C08FF.LIZ(EnumC19381310s7.class, str);
    }

    public EnumC19381310s7(String str, int i, int i2) {
        this.LL = i2;
    }
}
