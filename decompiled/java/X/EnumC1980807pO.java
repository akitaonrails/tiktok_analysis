package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07pO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1980807pO {
    public static final /* synthetic */ EnumC1980807pO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1980807pO TYPE_ACTION;
    public static final EnumC1980807pO TYPE_COMMAND;
    public static final EnumC1980807pO TYPE_HIGH_LEVEL;
    public static final EnumC1980807pO TYPE_NONE;

    public static InterfaceC2044707zh<EnumC1980807pO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1980807pO enumC1980807pO = new EnumC1980807pO("TYPE_NONE", 0);
        TYPE_NONE = enumC1980807pO;
        EnumC1980807pO enumC1980807pO2 = new EnumC1980807pO("TYPE_ACTION", 1);
        TYPE_ACTION = enumC1980807pO2;
        EnumC1980807pO enumC1980807pO3 = new EnumC1980807pO("TYPE_COMMAND", 2);
        TYPE_COMMAND = enumC1980807pO3;
        EnumC1980807pO enumC1980807pO4 = new EnumC1980807pO("TYPE_HIGH_LEVEL", 3);
        TYPE_HIGH_LEVEL = enumC1980807pO4;
        EnumC1980807pO[] enumC1980807pOArr = {enumC1980807pO, enumC1980807pO2, enumC1980807pO3, enumC1980807pO4};
        LL = enumC1980807pOArr;
        LLILLJJLI = new C2254308sP(enumC1980807pOArr);
    }

    public static EnumC1980807pO[] values() {
        return (EnumC1980807pO[]) LL.clone();
    }

    public static EnumC1980807pO valueOf(String str) {
        return (EnumC1980807pO) C08FF.LIZ(EnumC1980807pO.class, str);
    }

    public EnumC1980807pO(String str, int i) {
    }
}
