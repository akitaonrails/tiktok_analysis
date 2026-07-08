package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Uc7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC775890Uc7 {
    public static final EnumC775890Uc7 CHANGE;
    public static final /* synthetic */ EnumC775890Uc7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC775890Uc7 NO_CHANGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC775890Uc7> getEntries() {
        return LLILLL;
    }

    static {
        EnumC775890Uc7 enumC775890Uc7 = new EnumC775890Uc7("NO_CHANGE", 0, "no_change");
        NO_CHANGE = enumC775890Uc7;
        EnumC775890Uc7 enumC775890Uc72 = new EnumC775890Uc7("CHANGE", 1, "change");
        CHANGE = enumC775890Uc72;
        EnumC775890Uc7[] enumC775890Uc7Arr = {enumC775890Uc7, enumC775890Uc72};
        LLILLJJLI = enumC775890Uc7Arr;
        LLILLL = new C2254308sP(enumC775890Uc7Arr);
    }

    public static EnumC775890Uc7[] values() {
        return (EnumC775890Uc7[]) LLILLJJLI.clone();
    }

    public final String getChangeTypeName() {
        return this.LL;
    }

    public static EnumC775890Uc7 valueOf(String str) {
        return (EnumC775890Uc7) C08FF.LIZ(EnumC775890Uc7.class, str);
    }

    public EnumC775890Uc7(String str, int i, String str2) {
        this.LL = str2;
    }
}
