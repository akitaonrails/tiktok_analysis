package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Cl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC804903Cl {
    public static final EnumC804903Cl DEFAULT_TYPE;
    public static final EnumC804903Cl ICON_PREPOSITION_TYPE;
    public static final /* synthetic */ EnumC804903Cl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC804903Cl> getEntries() {
        return LLILLL;
    }

    static {
        EnumC804903Cl enumC804903Cl = new EnumC804903Cl("DEFAULT_TYPE", 0, 1);
        DEFAULT_TYPE = enumC804903Cl;
        EnumC804903Cl enumC804903Cl2 = new EnumC804903Cl("ICON_PREPOSITION_TYPE", 1, 2);
        ICON_PREPOSITION_TYPE = enumC804903Cl2;
        EnumC804903Cl[] enumC804903ClArr = {enumC804903Cl, enumC804903Cl2};
        LLILLJJLI = enumC804903ClArr;
        LLILLL = new C2254308sP(enumC804903ClArr);
    }

    public static EnumC804903Cl[] values() {
        return (EnumC804903Cl[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC804903Cl valueOf(String str) {
        return (EnumC804903Cl) C08FF.LIZ(EnumC804903Cl.class, str);
    }

    public EnumC804903Cl(String str, int i, int i2) {
        this.LL = i2;
    }
}
