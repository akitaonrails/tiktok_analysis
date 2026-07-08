package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vC7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1732850vC7 {
    public static final EnumC1732850vC7 ACTION;
    public static final /* synthetic */ EnumC1732850vC7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1732850vC7 MSG;
    public static final EnumC1732850vC7 SERVER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1732850vC7> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1732850vC7 enumC1732850vC7 = new EnumC1732850vC7("SERVER", 0, 1);
        SERVER = enumC1732850vC7;
        EnumC1732850vC7 enumC1732850vC72 = new EnumC1732850vC7("MSG", 1, 2);
        MSG = enumC1732850vC72;
        EnumC1732850vC7 enumC1732850vC73 = new EnumC1732850vC7("ACTION", 2, 3);
        ACTION = enumC1732850vC73;
        EnumC1732850vC7[] enumC1732850vC7Arr = {enumC1732850vC7, enumC1732850vC72, enumC1732850vC73};
        LLILLJJLI = enumC1732850vC7Arr;
        LLILLL = new C2254308sP(enumC1732850vC7Arr);
    }

    public static EnumC1732850vC7[] values() {
        return (EnumC1732850vC7[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1732850vC7 valueOf(String str) {
        return (EnumC1732850vC7) C08FF.LIZ(EnumC1732850vC7.class, str);
    }

    public EnumC1732850vC7(String str, int i, int i2) {
        this.LL = i2;
    }
}
