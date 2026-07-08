package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QoF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC681490QoF {
    public static final EnumC681490QoF DISCOVER_PAGE;
    public static final /* synthetic */ EnumC681490QoF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC681490QoF NONE;
    public static final EnumC681490QoF SEARCH_RES_PAGE;
    public static final EnumC681490QoF SEARCH_SUG_PAGE;

    public static InterfaceC2044707zh<EnumC681490QoF> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC681490QoF enumC681490QoF = new EnumC681490QoF("NONE", 0);
        NONE = enumC681490QoF;
        EnumC681490QoF enumC681490QoF2 = new EnumC681490QoF("DISCOVER_PAGE", 1);
        DISCOVER_PAGE = enumC681490QoF2;
        EnumC681490QoF enumC681490QoF3 = new EnumC681490QoF("SEARCH_SUG_PAGE", 2);
        SEARCH_SUG_PAGE = enumC681490QoF3;
        EnumC681490QoF enumC681490QoF4 = new EnumC681490QoF("SEARCH_RES_PAGE", 3);
        SEARCH_RES_PAGE = enumC681490QoF4;
        EnumC681490QoF[] enumC681490QoFArr = {enumC681490QoF, enumC681490QoF2, enumC681490QoF3, enumC681490QoF4};
        LL = enumC681490QoFArr;
        LLILLJJLI = new C2254308sP(enumC681490QoFArr);
    }

    public static EnumC681490QoF[] values() {
        return (EnumC681490QoF[]) LL.clone();
    }

    public static EnumC681490QoF valueOf(String str) {
        return (EnumC681490QoF) C08FF.LIZ(EnumC681490QoF.class, str);
    }

    public EnumC681490QoF(String str, int i) {
    }
}
