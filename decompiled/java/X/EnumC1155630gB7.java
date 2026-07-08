package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gB7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1155630gB7 {
    public static final /* synthetic */ EnumC1155630gB7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1155630gB7 MIDDLE_PM_WILL_JUMP_SUB;
    public static final EnumC1155630gB7 SUB_PM;
    public final boolean LL;

    public static InterfaceC2044707zh<EnumC1155630gB7> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1155630gB7 enumC1155630gB7 = new EnumC1155630gB7("SUB_PM", 0, true);
        SUB_PM = enumC1155630gB7;
        EnumC1155630gB7 enumC1155630gB72 = new EnumC1155630gB7("MIDDLE_PM_WILL_JUMP_SUB", 1, false);
        MIDDLE_PM_WILL_JUMP_SUB = enumC1155630gB72;
        EnumC1155630gB7[] enumC1155630gB7Arr = {enumC1155630gB7, enumC1155630gB72};
        LLILLJJLI = enumC1155630gB7Arr;
        LLILLL = new C2254308sP(enumC1155630gB7Arr);
    }

    public static EnumC1155630gB7[] values() {
        return (EnumC1155630gB7[]) LLILLJJLI.clone();
    }

    public final boolean getShowSearchBar() {
        return this.LL;
    }

    public static EnumC1155630gB7 valueOf(String str) {
        return (EnumC1155630gB7) C08FF.LIZ(EnumC1155630gB7.class, str);
    }

    public EnumC1155630gB7(String str, int i, boolean z) {
        this.LL = z;
    }
}
