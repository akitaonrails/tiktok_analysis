package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OzB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC637310OzB {
    public static final EnumC637310OzB BOTTOM_SHOW;
    public static final EnumC637310OzB DISMISS;
    public static final EnumC637310OzB INIT;
    public static final /* synthetic */ EnumC637310OzB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC637310OzB TOP_SHOW;

    public static InterfaceC2044707zh<EnumC637310OzB> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC637310OzB enumC637310OzB = new EnumC637310OzB("INIT", 0);
        INIT = enumC637310OzB;
        EnumC637310OzB enumC637310OzB2 = new EnumC637310OzB("TOP_SHOW", 1);
        TOP_SHOW = enumC637310OzB2;
        EnumC637310OzB enumC637310OzB3 = new EnumC637310OzB("BOTTOM_SHOW", 2);
        BOTTOM_SHOW = enumC637310OzB3;
        EnumC637310OzB enumC637310OzB4 = new EnumC637310OzB("DISMISS", 3);
        DISMISS = enumC637310OzB4;
        EnumC637310OzB[] enumC637310OzBArr = {enumC637310OzB, enumC637310OzB2, enumC637310OzB3, enumC637310OzB4};
        LL = enumC637310OzBArr;
        LLILLJJLI = new C2254308sP(enumC637310OzBArr);
    }

    public static EnumC637310OzB[] values() {
        return (EnumC637310OzB[]) LL.clone();
    }

    public static EnumC637310OzB valueOf(String str) {
        return (EnumC637310OzB) C08FF.LIZ(EnumC637310OzB.class, str);
    }

    public EnumC637310OzB(String str, int i) {
    }
}
