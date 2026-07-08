package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JvA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC507420JvA {
    public static final /* synthetic */ EnumC507420JvA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC507420JvA MOST_LIKE;
    public static final EnumC507420JvA RECENT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC507420JvA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC507420JvA enumC507420JvA = new EnumC507420JvA("MOST_LIKE", 0, 1);
        MOST_LIKE = enumC507420JvA;
        EnumC507420JvA enumC507420JvA2 = new EnumC507420JvA("RECENT", 1, 2);
        RECENT = enumC507420JvA2;
        EnumC507420JvA[] enumC507420JvAArr = {enumC507420JvA, enumC507420JvA2};
        LLILLJJLI = enumC507420JvAArr;
        LLILLL = new C2254308sP(enumC507420JvAArr);
    }

    public static EnumC507420JvA[] values() {
        return (EnumC507420JvA[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC507420JvA valueOf(String str) {
        return (EnumC507420JvA) C08FF.LIZ(EnumC507420JvA.class, str);
    }

    public EnumC507420JvA(String str, int i, int i2) {
        this.LL = i2;
    }
}
