package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fOM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1125400fOM {
    public static final EnumC1125400fOM ANCHOR;
    public static final EnumC1125400fOM ANCHOR_IN_ALL;
    public static final EnumC1125400fOM GUEST;
    public static final EnumC1125400fOM GUEST_IN_ALL;
    public static final /* synthetic */ EnumC1125400fOM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1125400fOM OFFICIAL_GUEST;
    public static final EnumC1125400fOM UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1125400fOM> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1125400fOM enumC1125400fOM = new EnumC1125400fOM("ANCHOR", 0, "anchor");
        ANCHOR = enumC1125400fOM;
        EnumC1125400fOM enumC1125400fOM2 = new EnumC1125400fOM("GUEST", 1, "guest");
        GUEST = enumC1125400fOM2;
        EnumC1125400fOM enumC1125400fOM3 = new EnumC1125400fOM("OFFICIAL_GUEST", 2, "official_guest");
        OFFICIAL_GUEST = enumC1125400fOM3;
        EnumC1125400fOM enumC1125400fOM4 = new EnumC1125400fOM("ANCHOR_IN_ALL", 3, "anchor_in_all");
        ANCHOR_IN_ALL = enumC1125400fOM4;
        EnumC1125400fOM enumC1125400fOM5 = new EnumC1125400fOM("GUEST_IN_ALL", 4, "guest_in_all");
        GUEST_IN_ALL = enumC1125400fOM5;
        EnumC1125400fOM enumC1125400fOM6 = new EnumC1125400fOM("UNKNOWN", 5, "unknown");
        UNKNOWN = enumC1125400fOM6;
        EnumC1125400fOM[] enumC1125400fOMArr = {enumC1125400fOM, enumC1125400fOM2, enumC1125400fOM3, enumC1125400fOM4, enumC1125400fOM5, enumC1125400fOM6};
        LLILLJJLI = enumC1125400fOMArr;
        LLILLL = new C2254308sP(enumC1125400fOMArr);
    }

    public static EnumC1125400fOM[] values() {
        return (EnumC1125400fOM[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1125400fOM valueOf(String str) {
        return (EnumC1125400fOM) C08FF.LIZ(EnumC1125400fOM.class, str);
    }

    public EnumC1125400fOM(String str, int i, String str2) {
        this.LL = str2;
    }
}
