package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iwN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1261810iwN {
    public static final EnumC1261810iwN DM;
    public static final EnumC1261810iwN FOLLOW;
    public static final EnumC1261810iwN FOLLOW_BACK;
    public static final /* synthetic */ EnumC1261810iwN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1261810iwN PROFILE_VIEWER_LIST;

    public static InterfaceC2044707zh<EnumC1261810iwN> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1261810iwN enumC1261810iwN = new EnumC1261810iwN("PROFILE_VIEWER_LIST", 0);
        PROFILE_VIEWER_LIST = enumC1261810iwN;
        EnumC1261810iwN enumC1261810iwN2 = new EnumC1261810iwN("FOLLOW_BACK", 1);
        FOLLOW_BACK = enumC1261810iwN2;
        EnumC1261810iwN enumC1261810iwN3 = new EnumC1261810iwN("FOLLOW", 2);
        FOLLOW = enumC1261810iwN3;
        EnumC1261810iwN enumC1261810iwN4 = new EnumC1261810iwN("DM", 3);
        DM = enumC1261810iwN4;
        EnumC1261810iwN[] enumC1261810iwNArr = {enumC1261810iwN, enumC1261810iwN2, enumC1261810iwN3, enumC1261810iwN4};
        LL = enumC1261810iwNArr;
        LLILLJJLI = new C2254308sP(enumC1261810iwNArr);
    }

    public static EnumC1261810iwN[] values() {
        return (EnumC1261810iwN[]) LL.clone();
    }

    public static EnumC1261810iwN valueOf(String str) {
        return (EnumC1261810iwN) C08FF.LIZ(EnumC1261810iwN.class, str);
    }

    public EnumC1261810iwN(String str, int i) {
    }
}
