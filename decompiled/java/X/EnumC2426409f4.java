package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09f4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2426409f4 {
    public static final EnumC2426409f4 ACTIVE_CLEAN_PAGE;
    public static final EnumC2426409f4 APP_BACKGROUND;
    public static final /* synthetic */ EnumC2426409f4[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC2426409f4> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2426409f4 enumC2426409f4 = new EnumC2426409f4("APP_BACKGROUND", 0);
        APP_BACKGROUND = enumC2426409f4;
        EnumC2426409f4 enumC2426409f42 = new EnumC2426409f4("ACTIVE_CLEAN_PAGE", 1);
        ACTIVE_CLEAN_PAGE = enumC2426409f42;
        EnumC2426409f4[] enumC2426409f4Arr = {enumC2426409f4, enumC2426409f42};
        LL = enumC2426409f4Arr;
        LLILLJJLI = new C2254308sP(enumC2426409f4Arr);
    }

    public static EnumC2426409f4[] values() {
        return (EnumC2426409f4[]) LL.clone();
    }

    public static EnumC2426409f4 valueOf(String str) {
        return (EnumC2426409f4) C08FF.LIZ(EnumC2426409f4.class, str);
    }

    public EnumC2426409f4(String str, int i) {
    }
}
