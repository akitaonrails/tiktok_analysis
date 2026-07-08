package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.13Xw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20027813Xw {
    public static final /* synthetic */ EnumC20027813Xw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20027813Xw PROACTIVE_LOGIN_AFTER_DOWNLOAD;
    public static final EnumC20027813Xw PROACTIVE_LOGIN_AFTER_SHARE;
    public static final EnumC20027813Xw PROACTIVE_LOGIN_ON_FORECAST;
    public static final EnumC20027813Xw PROACTIVE_LOGIN_ON_PROFILE_PAGE;
    public static final EnumC20027813Xw PROACTIVE_LOGIN_ON_SEARCH_PAGE;
    public static final EnumC20027813Xw PROACTIVE_TRIGGER_LOGIN_BY_VV;

    public static InterfaceC2044707zh<EnumC20027813Xw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20027813Xw enumC20027813Xw = new EnumC20027813Xw("PROACTIVE_TRIGGER_LOGIN_BY_VV", 0);
        PROACTIVE_TRIGGER_LOGIN_BY_VV = enumC20027813Xw;
        EnumC20027813Xw enumC20027813Xw2 = new EnumC20027813Xw("PROACTIVE_LOGIN_AFTER_SHARE", 1);
        PROACTIVE_LOGIN_AFTER_SHARE = enumC20027813Xw2;
        EnumC20027813Xw enumC20027813Xw3 = new EnumC20027813Xw("PROACTIVE_LOGIN_AFTER_DOWNLOAD", 2);
        PROACTIVE_LOGIN_AFTER_DOWNLOAD = enumC20027813Xw3;
        EnumC20027813Xw enumC20027813Xw4 = new EnumC20027813Xw("PROACTIVE_LOGIN_ON_PROFILE_PAGE", 3);
        PROACTIVE_LOGIN_ON_PROFILE_PAGE = enumC20027813Xw4;
        EnumC20027813Xw enumC20027813Xw5 = new EnumC20027813Xw("PROACTIVE_LOGIN_ON_SEARCH_PAGE", 4);
        PROACTIVE_LOGIN_ON_SEARCH_PAGE = enumC20027813Xw5;
        EnumC20027813Xw enumC20027813Xw6 = new EnumC20027813Xw("PROACTIVE_LOGIN_ON_FORECAST", 5);
        PROACTIVE_LOGIN_ON_FORECAST = enumC20027813Xw6;
        EnumC20027813Xw[] enumC20027813XwArr = {enumC20027813Xw, enumC20027813Xw2, enumC20027813Xw3, enumC20027813Xw4, enumC20027813Xw5, enumC20027813Xw6};
        LL = enumC20027813XwArr;
        LLILLJJLI = new C2254308sP(enumC20027813XwArr);
    }

    public static EnumC20027813Xw[] values() {
        return (EnumC20027813Xw[]) LL.clone();
    }

    public static EnumC20027813Xw valueOf(String str) {
        return (EnumC20027813Xw) C08FF.LIZ(EnumC20027813Xw.class, str);
    }

    public EnumC20027813Xw(String str, int i) {
    }
}
