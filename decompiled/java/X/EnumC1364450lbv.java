package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lbv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1364450lbv {
    public static final /* synthetic */ EnumC1364450lbv[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1364450lbv SOURCE_ACTION_COLD_BOOT;
    public static final EnumC1364450lbv SOURCE_ACTION_CREATE_CHAT;
    public static final EnumC1364450lbv SOURCE_ACTION_JSB;
    public static final EnumC1364450lbv SOURCE_ACTION_MINIS_PANEL;
    public static final EnumC1364450lbv SOURCE_ACTION_OPEN_PANEL;
    public static final EnumC1364450lbv SOURCE_ACTION_SHARE;
    public static final EnumC1364450lbv SOURCE_ACTION_SIGNAL;
    public static final EnumC1364450lbv SOURCE_ACTION_UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1364450lbv> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1364450lbv enumC1364450lbv = new EnumC1364450lbv("SOURCE_ACTION_UNKNOWN", 0, 0);
        SOURCE_ACTION_UNKNOWN = enumC1364450lbv;
        EnumC1364450lbv enumC1364450lbv2 = new EnumC1364450lbv("SOURCE_ACTION_COLD_BOOT", 1, 1);
        SOURCE_ACTION_COLD_BOOT = enumC1364450lbv2;
        EnumC1364450lbv enumC1364450lbv3 = new EnumC1364450lbv("SOURCE_ACTION_OPEN_PANEL", 2, 2);
        SOURCE_ACTION_OPEN_PANEL = enumC1364450lbv3;
        EnumC1364450lbv enumC1364450lbv4 = new EnumC1364450lbv("SOURCE_ACTION_SHARE", 3, 3);
        SOURCE_ACTION_SHARE = enumC1364450lbv4;
        EnumC1364450lbv enumC1364450lbv5 = new EnumC1364450lbv("SOURCE_ACTION_CREATE_CHAT", 4, 4);
        SOURCE_ACTION_CREATE_CHAT = enumC1364450lbv5;
        EnumC1364450lbv enumC1364450lbv6 = new EnumC1364450lbv("SOURCE_ACTION_MINIS_PANEL", 5, 5);
        SOURCE_ACTION_MINIS_PANEL = enumC1364450lbv6;
        EnumC1364450lbv enumC1364450lbv7 = new EnumC1364450lbv("SOURCE_ACTION_JSB", 6, 6);
        SOURCE_ACTION_JSB = enumC1364450lbv7;
        EnumC1364450lbv enumC1364450lbv8 = new EnumC1364450lbv("SOURCE_ACTION_SIGNAL", 7, 100);
        SOURCE_ACTION_SIGNAL = enumC1364450lbv8;
        EnumC1364450lbv[] enumC1364450lbvArr = {enumC1364450lbv, enumC1364450lbv2, enumC1364450lbv3, enumC1364450lbv4, enumC1364450lbv5, enumC1364450lbv6, enumC1364450lbv7, enumC1364450lbv8};
        LLILLJJLI = enumC1364450lbvArr;
        LLILLL = new C2254308sP(enumC1364450lbvArr);
    }

    public static EnumC1364450lbv[] values() {
        return (EnumC1364450lbv[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1364450lbv valueOf(String str) {
        return (EnumC1364450lbv) C08FF.LIZ(EnumC1364450lbv.class, str);
    }

    public EnumC1364450lbv(String str, int i, int i2) {
        this.LL = i2;
    }
}
