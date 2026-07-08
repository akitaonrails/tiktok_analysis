package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Jai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC494740Jai {
    public static final EnumC494740Jai FRAGMENT;
    public static final /* synthetic */ EnumC494740Jai[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC494740Jai ROOT_CONTAINER;
    public static final EnumC494740Jai WIDGET;

    public static InterfaceC2044707zh<EnumC494740Jai> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC494740Jai enumC494740Jai = new EnumC494740Jai("ROOT_CONTAINER", 0);
        ROOT_CONTAINER = enumC494740Jai;
        EnumC494740Jai enumC494740Jai2 = new EnumC494740Jai("FRAGMENT", 1);
        FRAGMENT = enumC494740Jai2;
        EnumC494740Jai enumC494740Jai3 = new EnumC494740Jai("WIDGET", 2);
        WIDGET = enumC494740Jai3;
        EnumC494740Jai[] enumC494740JaiArr = {enumC494740Jai, enumC494740Jai2, enumC494740Jai3};
        LL = enumC494740JaiArr;
        LLILLJJLI = new C2254308sP(enumC494740JaiArr);
    }

    public static EnumC494740Jai[] values() {
        return (EnumC494740Jai[]) LL.clone();
    }

    public static EnumC494740Jai valueOf(String str) {
        return (EnumC494740Jai) C08FF.LIZ(EnumC494740Jai.class, str);
    }

    public EnumC494740Jai(String str, int i) {
    }
}
