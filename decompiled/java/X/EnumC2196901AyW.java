package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1AyW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2196901AyW {
    public static final EnumC2196901AyW AUTH_CANCELED;
    public static final EnumC2196901AyW BACKGROUND;
    public static final EnumC2196901AyW BACKPRESS;
    public static final EnumC2196901AyW CAPSULE;
    public static final EnumC2196901AyW LINK2POST;
    public static final /* synthetic */ EnumC2196901AyW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2196901AyW RESTART;
    public static final EnumC2196901AyW STARTENTRANCEMISSION;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2196901AyW> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2196901AyW enumC2196901AyW = new EnumC2196901AyW("CAPSULE", 0, "capsule");
        CAPSULE = enumC2196901AyW;
        EnumC2196901AyW enumC2196901AyW2 = new EnumC2196901AyW("RESTART", 1, "restart");
        RESTART = enumC2196901AyW2;
        EnumC2196901AyW enumC2196901AyW3 = new EnumC2196901AyW("LINK2POST", 2, "link2post");
        LINK2POST = enumC2196901AyW3;
        EnumC2196901AyW enumC2196901AyW4 = new EnumC2196901AyW("BACKPRESS", 3, "back");
        BACKPRESS = enumC2196901AyW4;
        EnumC2196901AyW enumC2196901AyW5 = new EnumC2196901AyW("AUTH_CANCELED", 4, "auth_canceled");
        AUTH_CANCELED = enumC2196901AyW5;
        EnumC2196901AyW enumC2196901AyW6 = new EnumC2196901AyW("BACKGROUND", 5, "background");
        BACKGROUND = enumC2196901AyW6;
        EnumC2196901AyW enumC2196901AyW7 = new EnumC2196901AyW("STARTENTRANCEMISSION", 6, "startEntranceMission");
        STARTENTRANCEMISSION = enumC2196901AyW7;
        EnumC2196901AyW[] enumC2196901AyWArr = {enumC2196901AyW, enumC2196901AyW2, enumC2196901AyW3, enumC2196901AyW4, enumC2196901AyW5, enumC2196901AyW6, enumC2196901AyW7};
        LLILLJJLI = enumC2196901AyWArr;
        LLILLL = new C2254308sP(enumC2196901AyWArr);
    }

    public static EnumC2196901AyW[] values() {
        return (EnumC2196901AyW[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC2196901AyW valueOf(String str) {
        return (EnumC2196901AyW) C08FF.LIZ(EnumC2196901AyW.class, str);
    }

    public EnumC2196901AyW(String str, int i, String str2) {
        this.LL = str2;
    }
}
