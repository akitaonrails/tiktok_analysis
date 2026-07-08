package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zuU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1914120zuU {
    public static final EnumC1914120zuU LINK_TYPE_EXTERNAL;
    public static final EnumC1914120zuU LINK_TYPE_INTERNAL;
    public static final EnumC1914120zuU LINK_TYPE_POP;
    public static final EnumC1914120zuU LINK_TYPE_UPGRADE;
    public static final /* synthetic */ EnumC1914120zuU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1914120zuU> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1914120zuU enumC1914120zuU = new EnumC1914120zuU("LINK_TYPE_EXTERNAL", 0, "external");
        LINK_TYPE_EXTERNAL = enumC1914120zuU;
        EnumC1914120zuU enumC1914120zuU2 = new EnumC1914120zuU("LINK_TYPE_INTERNAL", 1, "internal");
        LINK_TYPE_INTERNAL = enumC1914120zuU2;
        EnumC1914120zuU enumC1914120zuU3 = new EnumC1914120zuU("LINK_TYPE_POP", 2, "sub_popup");
        LINK_TYPE_POP = enumC1914120zuU3;
        EnumC1914120zuU enumC1914120zuU4 = new EnumC1914120zuU("LINK_TYPE_UPGRADE", 3, "upgrade");
        LINK_TYPE_UPGRADE = enumC1914120zuU4;
        EnumC1914120zuU[] enumC1914120zuUArr = {enumC1914120zuU, enumC1914120zuU2, enumC1914120zuU3, enumC1914120zuU4};
        LLILLJJLI = enumC1914120zuUArr;
        LLILLL = new C2254308sP(enumC1914120zuUArr);
    }

    public static EnumC1914120zuU[] values() {
        return (EnumC1914120zuU[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1914120zuU valueOf(String str) {
        return (EnumC1914120zuU) C08FF.LIZ(EnumC1914120zuU.class, str);
    }

    public EnumC1914120zuU(String str, int i, String str2) {
        this.LL = str2;
    }
}
