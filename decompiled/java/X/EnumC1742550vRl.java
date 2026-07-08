package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vRl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1742550vRl {
    public static final /* synthetic */ EnumC1742550vRl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1742550vRl MALL;
    public static final EnumC1742550vRl VIDEO;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1742550vRl> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1742550vRl enumC1742550vRl = new EnumC1742550vRl("VIDEO", 0, "1");
        VIDEO = enumC1742550vRl;
        EnumC1742550vRl enumC1742550vRl2 = new EnumC1742550vRl("MALL", 1, "2");
        MALL = enumC1742550vRl2;
        EnumC1742550vRl[] enumC1742550vRlArr = {enumC1742550vRl, enumC1742550vRl2};
        LLILLJJLI = enumC1742550vRlArr;
        LLILLL = new C2254308sP(enumC1742550vRlArr);
    }

    public static EnumC1742550vRl[] values() {
        return (EnumC1742550vRl[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1742550vRl valueOf(String str) {
        return (EnumC1742550vRl) C08FF.LIZ(EnumC1742550vRl.class, str);
    }

    public EnumC1742550vRl(String str, int i, String str2) {
        this.LL = str2;
    }
}
