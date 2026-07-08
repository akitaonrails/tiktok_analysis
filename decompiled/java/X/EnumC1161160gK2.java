package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gK2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1161160gK2 {
    public static final EnumC1161160gK2 COMPONENT;
    public static final EnumC1161160gK2 GROUP;
    public static final /* synthetic */ EnumC1161160gK2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1161160gK2 PAGE;
    public static final EnumC1161160gK2 SECTION;
    public static final EnumC1161160gK2 UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1161160gK2> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1161160gK2 enumC1161160gK2 = new EnumC1161160gK2("PAGE", 0, "page");
        PAGE = enumC1161160gK2;
        EnumC1161160gK2 enumC1161160gK22 = new EnumC1161160gK2("SECTION", 1, "section");
        SECTION = enumC1161160gK22;
        EnumC1161160gK2 enumC1161160gK23 = new EnumC1161160gK2("GROUP", 2, "group");
        GROUP = enumC1161160gK23;
        EnumC1161160gK2 enumC1161160gK24 = new EnumC1161160gK2("COMPONENT", 3, "component");
        COMPONENT = enumC1161160gK24;
        EnumC1161160gK2 enumC1161160gK25 = new EnumC1161160gK2("UNKNOWN", 4, "unknown");
        UNKNOWN = enumC1161160gK25;
        EnumC1161160gK2[] enumC1161160gK2Arr = {enumC1161160gK2, enumC1161160gK22, enumC1161160gK23, enumC1161160gK24, enumC1161160gK25};
        LLILLJJLI = enumC1161160gK2Arr;
        LLILLL = new C2254308sP(enumC1161160gK2Arr);
    }

    public static EnumC1161160gK2[] values() {
        return (EnumC1161160gK2[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1161160gK2 valueOf(String str) {
        return (EnumC1161160gK2) C08FF.LIZ(EnumC1161160gK2.class, str);
    }

    public EnumC1161160gK2(String str, int i, String str2) {
        this.LL = str2;
    }
}
