package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0nG7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1427810nG7 {
    public static final EnumC1427810nG7 Auto;
    public static final EnumC1427810nG7 Dark;
    public static final /* synthetic */ EnumC1427810nG7[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1427810nG7 Light;

    public static InterfaceC2044707zh<EnumC1427810nG7> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1427810nG7 enumC1427810nG7 = new EnumC1427810nG7("Auto", 0);
        Auto = enumC1427810nG7;
        EnumC1427810nG7 enumC1427810nG72 = new EnumC1427810nG7("Light", 1);
        Light = enumC1427810nG72;
        EnumC1427810nG7 enumC1427810nG73 = new EnumC1427810nG7("Dark", 2);
        Dark = enumC1427810nG73;
        EnumC1427810nG7[] enumC1427810nG7Arr = {enumC1427810nG7, enumC1427810nG72, enumC1427810nG73};
        LL = enumC1427810nG7Arr;
        LLILLJJLI = new C2254308sP(enumC1427810nG7Arr);
    }

    public static EnumC1427810nG7[] values() {
        return (EnumC1427810nG7[]) LL.clone();
    }

    public static EnumC1427810nG7 valueOf(String str) {
        return (EnumC1427810nG7) C08FF.LIZ(EnumC1427810nG7.class, str);
    }

    public EnumC1427810nG7(String str, int i) {
    }
}
