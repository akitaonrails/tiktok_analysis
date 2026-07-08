package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LgO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC549220LgO {
    public static final EnumC549220LgO EDIT;
    public static final /* synthetic */ EnumC549220LgO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC549220LgO RETAKE;

    public static InterfaceC2044707zh<EnumC549220LgO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC549220LgO enumC549220LgO = new EnumC549220LgO("RETAKE", 0);
        RETAKE = enumC549220LgO;
        EnumC549220LgO enumC549220LgO2 = new EnumC549220LgO("EDIT", 1);
        EDIT = enumC549220LgO2;
        EnumC549220LgO[] enumC549220LgOArr = {enumC549220LgO, enumC549220LgO2};
        LL = enumC549220LgOArr;
        LLILLJJLI = new C2254308sP(enumC549220LgOArr);
    }

    public static EnumC549220LgO[] values() {
        return (EnumC549220LgO[]) LL.clone();
    }

    public static EnumC549220LgO valueOf(String str) {
        return (EnumC549220LgO) C08FF.LIZ(EnumC549220LgO.class, str);
    }

    public EnumC549220LgO(String str, int i) {
    }
}
