package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ilA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1254860ilA {
    public static final EnumC1254860ilA EDIT_PROFILE;
    public static final EnumC1254860ilA ENLARGE_AVATAR;
    public static final /* synthetic */ EnumC1254860ilA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1254860ilA PROFILE;
    public static final EnumC1254860ilA PROMPT;
    public static final EnumC1254860ilA SIGNUP;
    public static final EnumC1254860ilA TWO_HEADER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1254860ilA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1254860ilA enumC1254860ilA = new EnumC1254860ilA("PROFILE", 0, 1);
        PROFILE = enumC1254860ilA;
        EnumC1254860ilA enumC1254860ilA2 = new EnumC1254860ilA("SIGNUP", 1, 2);
        SIGNUP = enumC1254860ilA2;
        EnumC1254860ilA enumC1254860ilA3 = new EnumC1254860ilA("PROMPT", 2, 3);
        PROMPT = enumC1254860ilA3;
        EnumC1254860ilA enumC1254860ilA4 = new EnumC1254860ilA("TWO_HEADER", 3, 6);
        TWO_HEADER = enumC1254860ilA4;
        EnumC1254860ilA enumC1254860ilA5 = new EnumC1254860ilA("EDIT_PROFILE", 4, 7);
        EDIT_PROFILE = enumC1254860ilA5;
        EnumC1254860ilA enumC1254860ilA6 = new EnumC1254860ilA("ENLARGE_AVATAR", 5, 8);
        ENLARGE_AVATAR = enumC1254860ilA6;
        EnumC1254860ilA[] enumC1254860ilAArr = {enumC1254860ilA, enumC1254860ilA2, enumC1254860ilA3, enumC1254860ilA4, enumC1254860ilA5, enumC1254860ilA6};
        LLILLJJLI = enumC1254860ilAArr;
        LLILLL = new C2254308sP(enumC1254860ilAArr);
    }

    public static EnumC1254860ilA[] values() {
        return (EnumC1254860ilA[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1254860ilA valueOf(String str) {
        return (EnumC1254860ilA) C08FF.LIZ(EnumC1254860ilA.class, str);
    }

    public EnumC1254860ilA(String str, int i, int i2) {
        this.LL = i2;
    }
}
