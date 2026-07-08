package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1BwZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2221171BwZ {
    public static final EnumC2221171BwZ LL;
    public static final EnumC2221171BwZ LLILLJJLI;
    public static final EnumC2221171BwZ LLILLL;
    public static final /* synthetic */ EnumC2221171BwZ[] LLILZ;

    static {
        EnumC2221171BwZ enumC2221171BwZ = new EnumC2221171BwZ("READ", 0);
        LL = enumC2221171BwZ;
        EnumC2221171BwZ enumC2221171BwZ2 = new EnumC2221171BwZ("WRITE", 1);
        LLILLJJLI = enumC2221171BwZ2;
        EnumC2221171BwZ enumC2221171BwZ3 = new EnumC2221171BwZ("SAVE_SRC", 2);
        LLILLL = enumC2221171BwZ3;
        EnumC2221171BwZ[] enumC2221171BwZArr = {enumC2221171BwZ, enumC2221171BwZ2, enumC2221171BwZ3};
        LLILZ = enumC2221171BwZArr;
        new C2254308sP(enumC2221171BwZArr);
    }

    public static EnumC2221171BwZ[] values() {
        return (EnumC2221171BwZ[]) LLILZ.clone();
    }

    public static EnumC2221171BwZ valueOf(String str) {
        return (EnumC2221171BwZ) C08FF.LIZ(EnumC2221171BwZ.class, str);
    }

    public EnumC2221171BwZ(String str, int i) {
    }
}
