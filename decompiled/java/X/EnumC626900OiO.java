package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OiO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC626900OiO {
    public static final EnumC626900OiO CLICK;
    public static final EnumC626900OiO INITIAL;
    public static final /* synthetic */ EnumC626900OiO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC626900OiO SCROLL;

    public static InterfaceC2044707zh<EnumC626900OiO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC626900OiO enumC626900OiO = new EnumC626900OiO("INITIAL", 0);
        INITIAL = enumC626900OiO;
        EnumC626900OiO enumC626900OiO2 = new EnumC626900OiO("CLICK", 1);
        CLICK = enumC626900OiO2;
        EnumC626900OiO enumC626900OiO3 = new EnumC626900OiO("SCROLL", 2);
        SCROLL = enumC626900OiO3;
        EnumC626900OiO[] enumC626900OiOArr = {enumC626900OiO, enumC626900OiO2, enumC626900OiO3};
        LL = enumC626900OiOArr;
        LLILLJJLI = new C2254308sP(enumC626900OiOArr);
    }

    public static EnumC626900OiO[] values() {
        return (EnumC626900OiO[]) LL.clone();
    }

    public static EnumC626900OiO valueOf(String str) {
        return (EnumC626900OiO) C08FF.LIZ(EnumC626900OiO.class, str);
    }

    public EnumC626900OiO(String str, int i) {
    }
}
