package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cv4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1030360cv4 {
    public static final EnumC1030360cv4 CLICK_BACK;
    public static final /* synthetic */ EnumC1030360cv4[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1030360cv4 SYSTEM_BACK;

    public static InterfaceC2044707zh<EnumC1030360cv4> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1030360cv4 enumC1030360cv4 = new EnumC1030360cv4("CLICK_BACK", 0);
        CLICK_BACK = enumC1030360cv4;
        EnumC1030360cv4 enumC1030360cv42 = new EnumC1030360cv4("SYSTEM_BACK", 1);
        SYSTEM_BACK = enumC1030360cv42;
        EnumC1030360cv4[] enumC1030360cv4Arr = {enumC1030360cv4, enumC1030360cv42};
        LL = enumC1030360cv4Arr;
        LLILLJJLI = new C2254308sP(enumC1030360cv4Arr);
    }

    public static EnumC1030360cv4[] values() {
        return (EnumC1030360cv4[]) LL.clone();
    }

    public static EnumC1030360cv4 valueOf(String str) {
        return (EnumC1030360cv4) C08FF.LIZ(EnumC1030360cv4.class, str);
    }

    public EnumC1030360cv4(String str, int i) {
    }
}
