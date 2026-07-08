package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0W7g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC818060W7g {
    public static final EnumC818060W7g ACCOUNT_SWITCHED;
    public static final EnumC818060W7g CACHE_EXPIRED;
    public static final EnumC818060W7g COLD_START;
    public static final EnumC818060W7g COUNTRY_UPDATED;
    public static final EnumC818060W7g FOREGROUND;
    public static final EnumC818060W7g GP_REGION_CHANGED;
    public static final EnumC818060W7g IP_DIFF_PUSH;
    public static final /* synthetic */ EnumC818060W7g[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC818060W7g LOG_IN;
    public static final EnumC818060W7g LOG_OUT;
    public static final EnumC818060W7g UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC818060W7g> getEntries() {
        return LLILLL;
    }

    static {
        EnumC818060W7g enumC818060W7g = new EnumC818060W7g("UNKNOWN", 0, 0);
        UNKNOWN = enumC818060W7g;
        EnumC818060W7g enumC818060W7g2 = new EnumC818060W7g("COLD_START", 1, 1);
        COLD_START = enumC818060W7g2;
        EnumC818060W7g enumC818060W7g3 = new EnumC818060W7g("FOREGROUND", 2, 2);
        FOREGROUND = enumC818060W7g3;
        EnumC818060W7g enumC818060W7g4 = new EnumC818060W7g("CACHE_EXPIRED", 3, 3);
        CACHE_EXPIRED = enumC818060W7g4;
        EnumC818060W7g enumC818060W7g5 = new EnumC818060W7g("COUNTRY_UPDATED", 4, 4);
        COUNTRY_UPDATED = enumC818060W7g5;
        EnumC818060W7g enumC818060W7g6 = new EnumC818060W7g("GP_REGION_CHANGED", 5, 5);
        GP_REGION_CHANGED = enumC818060W7g6;
        EnumC818060W7g enumC818060W7g7 = new EnumC818060W7g("ACCOUNT_SWITCHED", 6, 6);
        ACCOUNT_SWITCHED = enumC818060W7g7;
        EnumC818060W7g enumC818060W7g8 = new EnumC818060W7g("LOG_IN", 7, 7);
        LOG_IN = enumC818060W7g8;
        EnumC818060W7g enumC818060W7g9 = new EnumC818060W7g("LOG_OUT", 8, 8);
        LOG_OUT = enumC818060W7g9;
        EnumC818060W7g enumC818060W7g10 = new EnumC818060W7g("IP_DIFF_PUSH", 9, 100);
        IP_DIFF_PUSH = enumC818060W7g10;
        EnumC818060W7g[] enumC818060W7gArr = {enumC818060W7g, enumC818060W7g2, enumC818060W7g3, enumC818060W7g4, enumC818060W7g5, enumC818060W7g6, enumC818060W7g7, enumC818060W7g8, enumC818060W7g9, enumC818060W7g10};
        LLILLJJLI = enumC818060W7gArr;
        LLILLL = new C2254308sP(enumC818060W7gArr);
    }

    public static EnumC818060W7g[] values() {
        return (EnumC818060W7g[]) LLILLJJLI.clone();
    }

    public final boolean isValid() {
        return this != UNKNOWN;
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC818060W7g valueOf(String str) {
        return (EnumC818060W7g) C08FF.LIZ(EnumC818060W7g.class, str);
    }

    public EnumC818060W7g(String str, int i, int i2) {
        this.LL = i2;
    }
}
