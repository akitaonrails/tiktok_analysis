package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0GwL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC431710GwL {
    public static final EnumC431710GwL CUSTOM;
    public static final C0H7V Companion;
    public static final EnumC431710GwL ELLIPSIS;
    public static final /* synthetic */ EnumC431710GwL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC431710GwL SEE_MORE;
    public static final EnumC431710GwL VIEW_ALL;

    public static InterfaceC2044707zh<EnumC431710GwL> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC431710GwL enumC431710GwL = new EnumC431710GwL("SEE_MORE", 0);
        SEE_MORE = enumC431710GwL;
        EnumC431710GwL enumC431710GwL2 = new EnumC431710GwL("VIEW_ALL", 1);
        VIEW_ALL = enumC431710GwL2;
        EnumC431710GwL enumC431710GwL3 = new EnumC431710GwL("CUSTOM", 2);
        CUSTOM = enumC431710GwL3;
        EnumC431710GwL enumC431710GwL4 = new EnumC431710GwL("ELLIPSIS", 3);
        ELLIPSIS = enumC431710GwL4;
        EnumC431710GwL[] enumC431710GwLArr = {enumC431710GwL, enumC431710GwL2, enumC431710GwL3, enumC431710GwL4};
        LL = enumC431710GwLArr;
        LLILLJJLI = new C2254308sP(enumC431710GwLArr);
        Companion = new C0H7V();
    }

    public static EnumC431710GwL[] values() {
        return (EnumC431710GwL[]) LL.clone();
    }

    public static EnumC431710GwL valueOf(String str) {
        return (EnumC431710GwL) C08FF.LIZ(EnumC431710GwL.class, str);
    }

    public EnumC431710GwL(String str, int i) {
    }
}
