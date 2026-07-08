package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992030bvF {
    public static final C992020bvE Companion;
    public static final EnumC992030bvF FAILED;
    public static final EnumC992030bvF INIT;
    public static final EnumC992030bvF LANGUAGE_NOT_SUPPORTED;
    public static final /* synthetic */ EnumC992030bvF[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC992030bvF NO_VOICE;
    public static final EnumC992030bvF SINGING_NO_TEXT;
    public static final EnumC992030bvF SINGING_WITH_TEXT;
    public static final EnumC992030bvF SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC992030bvF> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0bvE] */
    static {
        EnumC992030bvF enumC992030bvF = new EnumC992030bvF("INIT", 0, 0);
        INIT = enumC992030bvF;
        EnumC992030bvF enumC992030bvF2 = new EnumC992030bvF("SUCCESS", 1, 1);
        SUCCESS = enumC992030bvF2;
        EnumC992030bvF enumC992030bvF3 = new EnumC992030bvF("FAILED", 2, 2);
        FAILED = enumC992030bvF3;
        EnumC992030bvF enumC992030bvF4 = new EnumC992030bvF("NO_VOICE", 3, 3);
        NO_VOICE = enumC992030bvF4;
        EnumC992030bvF enumC992030bvF5 = new EnumC992030bvF("LANGUAGE_NOT_SUPPORTED", 4, 4);
        LANGUAGE_NOT_SUPPORTED = enumC992030bvF5;
        EnumC992030bvF enumC992030bvF6 = new EnumC992030bvF("SINGING_WITH_TEXT", 5, 5);
        SINGING_WITH_TEXT = enumC992030bvF6;
        EnumC992030bvF enumC992030bvF7 = new EnumC992030bvF("SINGING_NO_TEXT", 6, 6);
        SINGING_NO_TEXT = enumC992030bvF7;
        EnumC992030bvF[] enumC992030bvFArr = {enumC992030bvF, enumC992030bvF2, enumC992030bvF3, enumC992030bvF4, enumC992030bvF5, enumC992030bvF6, enumC992030bvF7};
        LLILLJJLI = enumC992030bvFArr;
        LLILLL = new C2254308sP(enumC992030bvFArr);
        Companion = new Object() { // from class: X.0bvE
        };
    }

    public static EnumC992030bvF[] values() {
        return (EnumC992030bvF[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static EnumC992030bvF valueOf(String str) {
        return (EnumC992030bvF) C08FF.LIZ(EnumC992030bvF.class, str);
    }

    public EnumC992030bvF(String str, int i, int i2) {
        this.LL = i2;
    }
}
