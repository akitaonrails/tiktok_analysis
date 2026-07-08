package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bx7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993190bx7 {
    public static final EnumC993190bx7 ChangeDivider;
    public static final /* synthetic */ EnumC993190bx7[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC993190bx7 SwitchLayout;
    public static final EnumC993190bx7 UpdateWindow;

    public static InterfaceC2044707zh<EnumC993190bx7> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993190bx7 enumC993190bx7 = new EnumC993190bx7("UpdateWindow", 0);
        UpdateWindow = enumC993190bx7;
        EnumC993190bx7 enumC993190bx72 = new EnumC993190bx7("SwitchLayout", 1);
        SwitchLayout = enumC993190bx72;
        EnumC993190bx7 enumC993190bx73 = new EnumC993190bx7("ChangeDivider", 2);
        ChangeDivider = enumC993190bx73;
        EnumC993190bx7[] enumC993190bx7Arr = {enumC993190bx7, enumC993190bx72, enumC993190bx73};
        LL = enumC993190bx7Arr;
        LLILLJJLI = new C2254308sP(enumC993190bx7Arr);
    }

    public static EnumC993190bx7[] values() {
        return (EnumC993190bx7[]) LL.clone();
    }

    public static EnumC993190bx7 valueOf(String str) {
        return (EnumC993190bx7) C08FF.LIZ(EnumC993190bx7.class, str);
    }

    public EnumC993190bx7(String str, int i) {
    }
}
