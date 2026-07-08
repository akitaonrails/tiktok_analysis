package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.18Km, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21267018Km {
    public static final EnumC21267018Km AUTOMOTIVE;
    public static final EnumC21267018Km COURSE_AND_TEACHING;
    public static final EnumC21267018Km CUSTOM_GOOD_WHOLESALE;
    public static final EnumC21267018Km ECOMMERCE;
    public static final EnumC21267018Km ENTERTAINMENT;
    public static final /* synthetic */ EnumC21267018Km[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC21267018Km LOCAL_SERVICE;
    public static final EnumC21267018Km OTHER;
    public static final EnumC21267018Km PROFESSIONAL_CONSULTATION;
    public static final EnumC21267018Km REAL_ESTATE;
    public static final EnumC21267018Km UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC21267018Km> getEntries() {
        return LLILLL;
    }

    static {
        EnumC21267018Km enumC21267018Km = new EnumC21267018Km("UNKNOWN", 0, 0);
        UNKNOWN = enumC21267018Km;
        EnumC21267018Km enumC21267018Km2 = new EnumC21267018Km("PROFESSIONAL_CONSULTATION", 1, 1);
        PROFESSIONAL_CONSULTATION = enumC21267018Km2;
        EnumC21267018Km enumC21267018Km3 = new EnumC21267018Km("COURSE_AND_TEACHING", 2, 2);
        COURSE_AND_TEACHING = enumC21267018Km3;
        EnumC21267018Km enumC21267018Km4 = new EnumC21267018Km("AUTOMOTIVE", 3, 3);
        AUTOMOTIVE = enumC21267018Km4;
        EnumC21267018Km enumC21267018Km5 = new EnumC21267018Km("REAL_ESTATE", 4, 4);
        REAL_ESTATE = enumC21267018Km5;
        EnumC21267018Km enumC21267018Km6 = new EnumC21267018Km("LOCAL_SERVICE", 5, 5);
        LOCAL_SERVICE = enumC21267018Km6;
        EnumC21267018Km enumC21267018Km7 = new EnumC21267018Km("CUSTOM_GOOD_WHOLESALE", 6, 6);
        CUSTOM_GOOD_WHOLESALE = enumC21267018Km7;
        EnumC21267018Km enumC21267018Km8 = new EnumC21267018Km("ECOMMERCE", 7, 7);
        ECOMMERCE = enumC21267018Km8;
        EnumC21267018Km enumC21267018Km9 = new EnumC21267018Km("ENTERTAINMENT", 8, 8);
        ENTERTAINMENT = enumC21267018Km9;
        EnumC21267018Km enumC21267018Km10 = new EnumC21267018Km("OTHER", 9, 9);
        OTHER = enumC21267018Km10;
        EnumC21267018Km[] enumC21267018KmArr = {enumC21267018Km, enumC21267018Km2, enumC21267018Km3, enumC21267018Km4, enumC21267018Km5, enumC21267018Km6, enumC21267018Km7, enumC21267018Km8, enumC21267018Km9, enumC21267018Km10};
        LLILLJJLI = enumC21267018KmArr;
        LLILLL = new C2254308sP(enumC21267018KmArr);
    }

    public static EnumC21267018Km[] values() {
        return (EnumC21267018Km[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC21267018Km valueOf(String str) {
        return (EnumC21267018Km) C08FF.LIZ(EnumC21267018Km.class, str);
    }

    public EnumC21267018Km(String str, int i, int i2) {
        this.LL = i2;
    }
}
