package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bEf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC965630bEf {
    public static final EnumC965630bEf DROP;
    public static final EnumC965630bEf FINISH_CHANNEL_API;
    public static final EnumC965630bEf FINISH_CHANNEL_MSG;
    public static final EnumC965630bEf LAYOUT_KEY_BLOCKED;
    public static final /* synthetic */ EnumC965630bEf[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC965630bEf RESET;
    public static final EnumC965630bEf SEI_END;
    public static final EnumC965630bEf UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC965630bEf> getEntries() {
        return LLILLL;
    }

    static {
        EnumC965630bEf enumC965630bEf = new EnumC965630bEf("UNKNOWN", 0, 0);
        UNKNOWN = enumC965630bEf;
        EnumC965630bEf enumC965630bEf2 = new EnumC965630bEf("FINISH_CHANNEL_API", 1, 0);
        FINISH_CHANNEL_API = enumC965630bEf2;
        EnumC965630bEf enumC965630bEf3 = new EnumC965630bEf("FINISH_CHANNEL_MSG", 2, 2);
        FINISH_CHANNEL_MSG = enumC965630bEf3;
        EnumC965630bEf enumC965630bEf4 = new EnumC965630bEf("RESET", 3, 3);
        RESET = enumC965630bEf4;
        EnumC965630bEf enumC965630bEf5 = new EnumC965630bEf("DROP", 4, 4);
        DROP = enumC965630bEf5;
        EnumC965630bEf enumC965630bEf6 = new EnumC965630bEf("SEI_END", 5, 5);
        SEI_END = enumC965630bEf6;
        EnumC965630bEf enumC965630bEf7 = new EnumC965630bEf("LAYOUT_KEY_BLOCKED", 6, 6);
        LAYOUT_KEY_BLOCKED = enumC965630bEf7;
        EnumC965630bEf[] enumC965630bEfArr = {enumC965630bEf, enumC965630bEf2, enumC965630bEf3, enumC965630bEf4, enumC965630bEf5, enumC965630bEf6, enumC965630bEf7};
        LLILLJJLI = enumC965630bEfArr;
        LLILLL = new C2254308sP(enumC965630bEfArr);
    }

    public static EnumC965630bEf[] values() {
        return (EnumC965630bEf[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC965630bEf valueOf(String str) {
        return (EnumC965630bEf) C08FF.LIZ(EnumC965630bEf.class, str);
    }

    public EnumC965630bEf(String str, int i, int i2) {
        this.LL = i2;
    }
}
