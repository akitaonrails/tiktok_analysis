package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Do, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC043400Do {
    public static final EnumC043400Do COARSE;
    public static final /* synthetic */ EnumC043400Do[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC043400Do NOT_GRANTED;
    public static final EnumC043400Do PRECISE;

    public static InterfaceC2044707zh<EnumC043400Do> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC043400Do enumC043400Do = new EnumC043400Do("NOT_GRANTED", 0);
        NOT_GRANTED = enumC043400Do;
        EnumC043400Do enumC043400Do2 = new EnumC043400Do("COARSE", 1);
        COARSE = enumC043400Do2;
        EnumC043400Do enumC043400Do3 = new EnumC043400Do("PRECISE", 2);
        PRECISE = enumC043400Do3;
        EnumC043400Do[] enumC043400DoArr = {enumC043400Do, enumC043400Do2, enumC043400Do3};
        LL = enumC043400DoArr;
        LLILLJJLI = new C2254308sP(enumC043400DoArr);
    }

    public static EnumC043400Do[] values() {
        return (EnumC043400Do[]) LL.clone();
    }

    public static EnumC043400Do valueOf(String str) {
        return (EnumC043400Do) C08FF.LIZ(EnumC043400Do.class, str);
    }

    public EnumC043400Do(String str, int i) {
    }
}
