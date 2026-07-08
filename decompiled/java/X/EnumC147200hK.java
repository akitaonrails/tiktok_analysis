package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00hK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC147200hK {
    public static final EnumC147200hK ADMIN;
    public static final EnumC147200hK ANCHOR;
    public static final EnumC147200hK AUDIENCE;
    public static final /* synthetic */ EnumC147200hK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC147200hK UNKNOWN;

    public static InterfaceC2044707zh<EnumC147200hK> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC147200hK enumC147200hK = new EnumC147200hK("UNKNOWN", 0);
        UNKNOWN = enumC147200hK;
        EnumC147200hK enumC147200hK2 = new EnumC147200hK("AUDIENCE", 1);
        AUDIENCE = enumC147200hK2;
        EnumC147200hK enumC147200hK3 = new EnumC147200hK("ADMIN", 2);
        ADMIN = enumC147200hK3;
        EnumC147200hK enumC147200hK4 = new EnumC147200hK("ANCHOR", 3);
        ANCHOR = enumC147200hK4;
        EnumC147200hK[] enumC147200hKArr = {enumC147200hK, enumC147200hK2, enumC147200hK3, enumC147200hK4};
        LL = enumC147200hKArr;
        LLILLJJLI = new C2254308sP(enumC147200hKArr);
    }

    public static EnumC147200hK[] values() {
        return (EnumC147200hK[]) LL.clone();
    }

    public static EnumC147200hK valueOf(String str) {
        return (EnumC147200hK) C08FF.LIZ(EnumC147200hK.class, str);
    }

    public EnumC147200hK(String str, int i) {
    }
}
