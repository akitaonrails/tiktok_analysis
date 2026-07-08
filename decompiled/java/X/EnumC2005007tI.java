package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07tI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2005007tI {
    public static final EnumC2005007tI JOIN_GROUP_DIRECT_MSG;
    public static final EnumC2005007tI LINK_MSG;
    public static final /* synthetic */ EnumC2005007tI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2005007tI UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2005007tI> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2005007tI enumC2005007tI = new EnumC2005007tI("UNKNOWN", 0, "unknown");
        UNKNOWN = enumC2005007tI;
        EnumC2005007tI enumC2005007tI2 = new EnumC2005007tI("LINK_MSG", 1, "link_msg");
        LINK_MSG = enumC2005007tI2;
        EnumC2005007tI enumC2005007tI3 = new EnumC2005007tI("JOIN_GROUP_DIRECT_MSG", 2, "join_group_direct_msg");
        JOIN_GROUP_DIRECT_MSG = enumC2005007tI3;
        EnumC2005007tI[] enumC2005007tIArr = {enumC2005007tI, enumC2005007tI2, enumC2005007tI3};
        LLILLJJLI = enumC2005007tIArr;
        LLILLL = new C2254308sP(enumC2005007tIArr);
    }

    public static EnumC2005007tI[] values() {
        return (EnumC2005007tI[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC2005007tI valueOf(String str) {
        return (EnumC2005007tI) C08FF.LIZ(EnumC2005007tI.class, str);
    }

    public EnumC2005007tI(String str, int i, String str2) {
        this.LL = str2;
    }
}
