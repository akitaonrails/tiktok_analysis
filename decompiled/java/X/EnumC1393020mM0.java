package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mM0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1393020mM0 {
    public static final EnumC1393020mM0 FRIENDS_LIST;
    public static final /* synthetic */ EnumC1393020mM0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1393020mM0 LONG_PRESS;
    public static final EnumC1393020mM0 PROFILE;
    public static final EnumC1393020mM0 SETTINGS;
    public static final EnumC1393020mM0 SHARE;
    public static final EnumC1393020mM0 SKYLIGHT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1393020mM0> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1393020mM0 enumC1393020mM0 = new EnumC1393020mM0("SHARE", 0, "share");
        SHARE = enumC1393020mM0;
        EnumC1393020mM0 enumC1393020mM02 = new EnumC1393020mM0("LONG_PRESS", 1, "longPress");
        LONG_PRESS = enumC1393020mM02;
        EnumC1393020mM0 enumC1393020mM03 = new EnumC1393020mM0("PROFILE", 2, "profile");
        PROFILE = enumC1393020mM03;
        EnumC1393020mM0 enumC1393020mM04 = new EnumC1393020mM0("FRIENDS_LIST", 3, "friendsList");
        FRIENDS_LIST = enumC1393020mM04;
        EnumC1393020mM0 enumC1393020mM05 = new EnumC1393020mM0("SKYLIGHT", 4, "skylight");
        SKYLIGHT = enumC1393020mM05;
        EnumC1393020mM0 enumC1393020mM06 = new EnumC1393020mM0("SETTINGS", 5, "settings");
        SETTINGS = enumC1393020mM06;
        EnumC1393020mM0[] enumC1393020mM0Arr = {enumC1393020mM0, enumC1393020mM02, enumC1393020mM03, enumC1393020mM04, enumC1393020mM05, enumC1393020mM06};
        LLILLJJLI = enumC1393020mM0Arr;
        LLILLL = new C2254308sP(enumC1393020mM0Arr);
    }

    public static EnumC1393020mM0[] values() {
        return (EnumC1393020mM0[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1393020mM0 valueOf(String str) {
        return (EnumC1393020mM0) C08FF.LIZ(EnumC1393020mM0.class, str);
    }

    public EnumC1393020mM0(String str, int i, String str2) {
        this.LL = str2;
    }
}
