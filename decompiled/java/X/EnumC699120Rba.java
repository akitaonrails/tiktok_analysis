package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Rba, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC699120Rba {
    public static final EnumC699120Rba ANCHOR;
    public static final EnumC699120Rba ANNOTATION_CONTAINER;
    public static final EnumC699120Rba BOTTOM_BANNER;
    public static final EnumC699120Rba BOTTOM_BUTTON;
    public static final EnumC699120Rba GLOBAL;
    public static final EnumC699120Rba HIGH_TAG;
    public static final EnumC699120Rba INFO_BAR;
    public static final /* synthetic */ EnumC699120Rba[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC699120Rba META_TAG;

    public static InterfaceC2044707zh<EnumC699120Rba> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC699120Rba enumC699120Rba = new EnumC699120Rba("BOTTOM_BANNER", 0);
        BOTTOM_BANNER = enumC699120Rba;
        EnumC699120Rba enumC699120Rba2 = new EnumC699120Rba("BOTTOM_BUTTON", 1);
        BOTTOM_BUTTON = enumC699120Rba2;
        EnumC699120Rba enumC699120Rba3 = new EnumC699120Rba("INFO_BAR", 2);
        INFO_BAR = enumC699120Rba3;
        EnumC699120Rba enumC699120Rba4 = new EnumC699120Rba("ANNOTATION_CONTAINER", 3);
        ANNOTATION_CONTAINER = enumC699120Rba4;
        EnumC699120Rba enumC699120Rba5 = new EnumC699120Rba("ANCHOR", 4);
        ANCHOR = enumC699120Rba5;
        EnumC699120Rba enumC699120Rba6 = new EnumC699120Rba("HIGH_TAG", 5);
        HIGH_TAG = enumC699120Rba6;
        EnumC699120Rba enumC699120Rba7 = new EnumC699120Rba("META_TAG", 6);
        META_TAG = enumC699120Rba7;
        EnumC699120Rba enumC699120Rba8 = new EnumC699120Rba("GLOBAL", 7);
        GLOBAL = enumC699120Rba8;
        EnumC699120Rba[] enumC699120RbaArr = {enumC699120Rba, enumC699120Rba2, enumC699120Rba3, enumC699120Rba4, enumC699120Rba5, enumC699120Rba6, enumC699120Rba7, enumC699120Rba8};
        LL = enumC699120RbaArr;
        LLILLJJLI = new C2254308sP(enumC699120RbaArr);
    }

    public static EnumC699120Rba[] values() {
        return (EnumC699120Rba[]) LL.clone();
    }

    public static EnumC699120Rba valueOf(String str) {
        return (EnumC699120Rba) C08FF.LIZ(EnumC699120Rba.class, str);
    }

    public EnumC699120Rba(String str, int i) {
    }
}
