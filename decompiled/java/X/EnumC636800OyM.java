package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OyM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC636800OyM {
    public static final EnumC636800OyM EMOJI;
    public static final /* synthetic */ EnumC636800OyM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC636800OyM SUBSCRIBE;
    public static final EnumC636800OyM UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC636800OyM> getEntries() {
        return LLILLL;
    }

    static {
        EnumC636800OyM enumC636800OyM = new EnumC636800OyM("UNKNOWN", 0, 0);
        UNKNOWN = enumC636800OyM;
        EnumC636800OyM enumC636800OyM2 = new EnumC636800OyM("SUBSCRIBE", 1, 1);
        SUBSCRIBE = enumC636800OyM2;
        EnumC636800OyM enumC636800OyM3 = new EnumC636800OyM("EMOJI", 2, 2);
        EMOJI = enumC636800OyM3;
        EnumC636800OyM[] enumC636800OyMArr = {enumC636800OyM, enumC636800OyM2, enumC636800OyM3};
        LLILLJJLI = enumC636800OyMArr;
        LLILLL = new C2254308sP(enumC636800OyMArr);
    }

    public static EnumC636800OyM[] values() {
        return (EnumC636800OyM[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC636800OyM valueOf(String str) {
        return (EnumC636800OyM) C08FF.LIZ(EnumC636800OyM.class, str);
    }

    public EnumC636800OyM(String str, int i, int i2) {
        this.LL = i2;
    }
}
