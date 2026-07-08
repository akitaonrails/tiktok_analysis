package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Dl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC043100Dl {
    public static final EnumC043100Dl EMAIL;
    public static final /* synthetic */ EnumC043100Dl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC043100Dl MOBILE;
    public static final EnumC043100Dl USER_IDENTITY_TYPE_UNKNOWN;

    public static InterfaceC2044707zh<EnumC043100Dl> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC043100Dl enumC043100Dl = new EnumC043100Dl("USER_IDENTITY_TYPE_UNKNOWN", 0);
        USER_IDENTITY_TYPE_UNKNOWN = enumC043100Dl;
        EnumC043100Dl enumC043100Dl2 = new EnumC043100Dl("MOBILE", 1);
        MOBILE = enumC043100Dl2;
        EnumC043100Dl enumC043100Dl3 = new EnumC043100Dl("EMAIL", 2);
        EMAIL = enumC043100Dl3;
        EnumC043100Dl[] enumC043100DlArr = {enumC043100Dl, enumC043100Dl2, enumC043100Dl3};
        LL = enumC043100DlArr;
        LLILLJJLI = new C2254308sP(enumC043100DlArr);
    }

    public static EnumC043100Dl[] values() {
        return (EnumC043100Dl[]) LL.clone();
    }

    public static EnumC043100Dl valueOf(String str) {
        return (EnumC043100Dl) C08FF.LIZ(EnumC043100Dl.class, str);
    }

    public EnumC043100Dl(String str, int i) {
    }
}
