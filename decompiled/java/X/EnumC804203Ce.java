package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Ce, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC804203Ce {
    public static final EnumC804203Ce DOUBLE_LINE;
    public static final /* synthetic */ EnumC804203Ce[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC804203Ce SINGLE_LINE;

    public static InterfaceC2044707zh<EnumC804203Ce> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC804203Ce enumC804203Ce = new EnumC804203Ce("SINGLE_LINE", 0);
        SINGLE_LINE = enumC804203Ce;
        EnumC804203Ce enumC804203Ce2 = new EnumC804203Ce("DOUBLE_LINE", 1);
        DOUBLE_LINE = enumC804203Ce2;
        EnumC804203Ce[] enumC804203CeArr = {enumC804203Ce, enumC804203Ce2};
        LL = enumC804203CeArr;
        LLILLJJLI = new C2254308sP(enumC804203CeArr);
    }

    public static EnumC804203Ce[] values() {
        return (EnumC804203Ce[]) LL.clone();
    }

    public static EnumC804203Ce valueOf(String str) {
        return (EnumC804203Ce) C08FF.LIZ(EnumC804203Ce.class, str);
    }

    public EnumC804203Ce(String str, int i) {
    }
}
