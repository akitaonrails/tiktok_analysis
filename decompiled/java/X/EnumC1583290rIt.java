package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rIt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1583290rIt {
    public static final EnumC1583290rIt CLICK_BOTTOM;
    public static final EnumC1583290rIt CLICK_TOP;
    public static final /* synthetic */ EnumC1583290rIt[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1583290rIt NUMBER_DOT;
    public static final EnumC1583290rIt PILLS_AUTO_REFRESH;
    public static final EnumC1583290rIt PILLS_CLICK;
    public static final EnumC1583290rIt PULL_DOWN_REFRESH;
    public static final EnumC1583290rIt RED_DOT;
    public static final EnumC1583290rIt TAB_AVATAR;
    public static final EnumC1583290rIt UNKNOWN;

    public static InterfaceC2044707zh<EnumC1583290rIt> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1583290rIt enumC1583290rIt = new EnumC1583290rIt("UNKNOWN", 0);
        UNKNOWN = enumC1583290rIt;
        EnumC1583290rIt enumC1583290rIt2 = new EnumC1583290rIt("CLICK_BOTTOM", 1);
        CLICK_BOTTOM = enumC1583290rIt2;
        EnumC1583290rIt enumC1583290rIt3 = new EnumC1583290rIt("CLICK_TOP", 2);
        CLICK_TOP = enumC1583290rIt3;
        EnumC1583290rIt enumC1583290rIt4 = new EnumC1583290rIt("NUMBER_DOT", 3);
        NUMBER_DOT = enumC1583290rIt4;
        EnumC1583290rIt enumC1583290rIt5 = new EnumC1583290rIt("TAB_AVATAR", 4);
        TAB_AVATAR = enumC1583290rIt5;
        EnumC1583290rIt enumC1583290rIt6 = new EnumC1583290rIt("PILLS_CLICK", 5);
        PILLS_CLICK = enumC1583290rIt6;
        EnumC1583290rIt enumC1583290rIt7 = new EnumC1583290rIt("PILLS_AUTO_REFRESH", 6);
        PILLS_AUTO_REFRESH = enumC1583290rIt7;
        EnumC1583290rIt enumC1583290rIt8 = new EnumC1583290rIt("PULL_DOWN_REFRESH", 7);
        PULL_DOWN_REFRESH = enumC1583290rIt8;
        EnumC1583290rIt enumC1583290rIt9 = new EnumC1583290rIt("RED_DOT", 8);
        RED_DOT = enumC1583290rIt9;
        EnumC1583290rIt[] enumC1583290rItArr = {enumC1583290rIt, enumC1583290rIt2, enumC1583290rIt3, enumC1583290rIt4, enumC1583290rIt5, enumC1583290rIt6, enumC1583290rIt7, enumC1583290rIt8, enumC1583290rIt9};
        LL = enumC1583290rItArr;
        LLILLJJLI = new C2254308sP(enumC1583290rItArr);
    }

    public static EnumC1583290rIt[] values() {
        return (EnumC1583290rIt[]) LL.clone();
    }

    public static EnumC1583290rIt valueOf(String str) {
        return (EnumC1583290rIt) C08FF.LIZ(EnumC1583290rIt.class, str);
    }

    public EnumC1583290rIt(String str, int i) {
    }
}
