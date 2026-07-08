package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992740bwO {
    public static final /* synthetic */ EnumC992740bwO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992740bwO NONE;
    public static final EnumC992740bwO SHOW_PROMOTE;
    public static final EnumC992740bwO USER_CLICK;

    public static InterfaceC2044707zh<EnumC992740bwO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992740bwO enumC992740bwO = new EnumC992740bwO("NONE", 0);
        NONE = enumC992740bwO;
        EnumC992740bwO enumC992740bwO2 = new EnumC992740bwO("USER_CLICK", 1);
        USER_CLICK = enumC992740bwO2;
        EnumC992740bwO enumC992740bwO3 = new EnumC992740bwO("SHOW_PROMOTE", 2);
        SHOW_PROMOTE = enumC992740bwO3;
        EnumC992740bwO[] enumC992740bwOArr = {enumC992740bwO, enumC992740bwO2, enumC992740bwO3};
        LL = enumC992740bwOArr;
        LLILLJJLI = new C2254308sP(enumC992740bwOArr);
    }

    public static EnumC992740bwO[] values() {
        return (EnumC992740bwO[]) LL.clone();
    }

    public static EnumC992740bwO valueOf(String str) {
        return (EnumC992740bwO) C08FF.LIZ(EnumC992740bwO.class, str);
    }

    public EnumC992740bwO(String str, int i) {
    }
}
