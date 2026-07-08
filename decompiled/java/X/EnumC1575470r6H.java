package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0r6H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1575470r6H {
    public static final /* synthetic */ EnumC1575470r6H[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1575470r6H LOCKED;
    public static final EnumC1575470r6H PARTIAL_UNLOCKED;
    public static final EnumC1575470r6H UNLOCKED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1575470r6H> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1575470r6H enumC1575470r6H = new EnumC1575470r6H("LOCKED", 0, "locked");
        LOCKED = enumC1575470r6H;
        EnumC1575470r6H enumC1575470r6H2 = new EnumC1575470r6H("PARTIAL_UNLOCKED", 1, "half_unlocked");
        PARTIAL_UNLOCKED = enumC1575470r6H2;
        EnumC1575470r6H enumC1575470r6H3 = new EnumC1575470r6H("UNLOCKED", 2, "fully_unlocked");
        UNLOCKED = enumC1575470r6H3;
        EnumC1575470r6H[] enumC1575470r6HArr = {enumC1575470r6H, enumC1575470r6H2, enumC1575470r6H3};
        LLILLJJLI = enumC1575470r6HArr;
        LLILLL = new C2254308sP(enumC1575470r6HArr);
    }

    public static EnumC1575470r6H[] values() {
        return (EnumC1575470r6H[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1575470r6H valueOf(String str) {
        return (EnumC1575470r6H) C08FF.LIZ(EnumC1575470r6H.class, str);
    }

    public EnumC1575470r6H(String str, int i, String str2) {
        this.LL = str2;
    }
}
