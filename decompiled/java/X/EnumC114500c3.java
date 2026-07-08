package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00c3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC114500c3 {
    public static final EnumC114500c3 FILLED_BUTTON;
    public static final EnumC114500c3 ICON_BUTTON;
    public static final /* synthetic */ EnumC114500c3[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC114500c3> getEntries() {
        return LLILLL;
    }

    static {
        EnumC114500c3 enumC114500c3 = new EnumC114500c3("FILLED_BUTTON", 0, 1);
        FILLED_BUTTON = enumC114500c3;
        EnumC114500c3 enumC114500c32 = new EnumC114500c3("ICON_BUTTON", 1, 2);
        ICON_BUTTON = enumC114500c32;
        EnumC114500c3[] enumC114500c3Arr = {enumC114500c3, enumC114500c32};
        LLILLJJLI = enumC114500c3Arr;
        LLILLL = new C2254308sP(enumC114500c3Arr);
    }

    public static EnumC114500c3[] values() {
        return (EnumC114500c3[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC114500c3 valueOf(String str) {
        return (EnumC114500c3) C08FF.LIZ(EnumC114500c3.class, str);
    }

    public EnumC114500c3(String str, int i, int i2) {
        this.LL = i2;
    }
}
