package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0au2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC952840au2 {
    public static final EnumC952840au2 DIALOG_SAVE;
    public static final /* synthetic */ EnumC952840au2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC952840au2 MASK;

    public static InterfaceC2044707zh<EnumC952840au2> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC952840au2 enumC952840au2 = new EnumC952840au2("MASK", 0);
        MASK = enumC952840au2;
        EnumC952840au2 enumC952840au22 = new EnumC952840au2("DIALOG_SAVE", 1);
        DIALOG_SAVE = enumC952840au22;
        EnumC952840au2[] enumC952840au2Arr = {enumC952840au2, enumC952840au22};
        LL = enumC952840au2Arr;
        LLILLJJLI = new C2254308sP(enumC952840au2Arr);
    }

    public static EnumC952840au2[] values() {
        return (EnumC952840au2[]) LL.clone();
    }

    public static EnumC952840au2 valueOf(String str) {
        return (EnumC952840au2) C08FF.LIZ(EnumC952840au2.class, str);
    }

    public EnumC952840au2(String str, int i) {
    }
}
