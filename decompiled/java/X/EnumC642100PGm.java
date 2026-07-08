package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PGm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC642100PGm {
    public static final /* synthetic */ EnumC642100PGm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC642100PGm LOADMORE_NO_NETWORK_LOADING;
    public static final EnumC642100PGm NETWORK_STATUS_SHOWING;
    public static final EnumC642100PGm NORMAL;
    public static final EnumC642100PGm REFRESH_NO_NETWORK_LOADING;

    public static InterfaceC2044707zh<EnumC642100PGm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC642100PGm enumC642100PGm = new EnumC642100PGm("NORMAL", 0);
        NORMAL = enumC642100PGm;
        EnumC642100PGm enumC642100PGm2 = new EnumC642100PGm("REFRESH_NO_NETWORK_LOADING", 1);
        REFRESH_NO_NETWORK_LOADING = enumC642100PGm2;
        EnumC642100PGm enumC642100PGm3 = new EnumC642100PGm("NETWORK_STATUS_SHOWING", 2);
        NETWORK_STATUS_SHOWING = enumC642100PGm3;
        EnumC642100PGm enumC642100PGm4 = new EnumC642100PGm("LOADMORE_NO_NETWORK_LOADING", 3);
        LOADMORE_NO_NETWORK_LOADING = enumC642100PGm4;
        EnumC642100PGm[] enumC642100PGmArr = {enumC642100PGm, enumC642100PGm2, enumC642100PGm3, enumC642100PGm4};
        LL = enumC642100PGmArr;
        LLILLJJLI = new C2254308sP(enumC642100PGmArr);
    }

    public static EnumC642100PGm[] values() {
        return (EnumC642100PGm[]) LL.clone();
    }

    public static EnumC642100PGm valueOf(String str) {
        return (EnumC642100PGm) C08FF.LIZ(EnumC642100PGm.class, str);
    }

    public EnumC642100PGm(String str, int i) {
    }
}
