package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dPv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1049490dPv {
    public static final EnumC1049490dPv ALPHA_BUTTON;
    public static final EnumC1049490dPv AVATAR;
    public static final EnumC1049490dPv BUTTON;
    public static final EnumC1049490dPv CELL;
    public static final /* synthetic */ EnumC1049490dPv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1049490dPv NULL;
    public static final EnumC1049490dPv USERNAME;

    public static InterfaceC2044707zh<EnumC1049490dPv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1049490dPv enumC1049490dPv = new EnumC1049490dPv("CELL", 0);
        CELL = enumC1049490dPv;
        EnumC1049490dPv enumC1049490dPv2 = new EnumC1049490dPv("AVATAR", 1);
        AVATAR = enumC1049490dPv2;
        EnumC1049490dPv enumC1049490dPv3 = new EnumC1049490dPv("USERNAME", 2);
        USERNAME = enumC1049490dPv3;
        EnumC1049490dPv enumC1049490dPv4 = new EnumC1049490dPv("BUTTON", 3);
        BUTTON = enumC1049490dPv4;
        EnumC1049490dPv enumC1049490dPv5 = new EnumC1049490dPv("ALPHA_BUTTON", 4);
        ALPHA_BUTTON = enumC1049490dPv5;
        EnumC1049490dPv enumC1049490dPv6 = new EnumC1049490dPv("NULL", 5);
        NULL = enumC1049490dPv6;
        EnumC1049490dPv[] enumC1049490dPvArr = {enumC1049490dPv, enumC1049490dPv2, enumC1049490dPv3, enumC1049490dPv4, enumC1049490dPv5, enumC1049490dPv6};
        LL = enumC1049490dPvArr;
        LLILLJJLI = new C2254308sP(enumC1049490dPvArr);
    }

    public static EnumC1049490dPv[] values() {
        return (EnumC1049490dPv[]) LL.clone();
    }

    public static EnumC1049490dPv valueOf(String str) {
        return (EnumC1049490dPv) C08FF.LIZ(EnumC1049490dPv.class, str);
    }

    public EnumC1049490dPv(String str, int i) {
    }
}
