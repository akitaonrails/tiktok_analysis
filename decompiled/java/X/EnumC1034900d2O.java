package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0d2O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1034900d2O {
    public static final EnumC1034900d2O LL;
    public static final EnumC1034900d2O LLILLJJLI;
    public static final EnumC1034900d2O LLILLL;
    public static final EnumC1034900d2O LLILZ;
    public static final EnumC1034900d2O LLILZIL;
    public static final /* synthetic */ EnumC1034900d2O[] LLILZLL;

    static {
        EnumC1034900d2O enumC1034900d2O = new EnumC1034900d2O("INITIALIZATION", 0);
        LL = enumC1034900d2O;
        EnumC1034900d2O enumC1034900d2O2 = new EnumC1034900d2O("SCROLL_FROM_FEED_TO_PROFILE_PAGE", 1);
        LLILLJJLI = enumC1034900d2O2;
        EnumC1034900d2O enumC1034900d2O3 = new EnumC1034900d2O("ON_PROFILE_PAGE_SELECTED", 2);
        LLILLL = enumC1034900d2O3;
        EnumC1034900d2O enumC1034900d2O4 = new EnumC1034900d2O("SCROLL_FROM_PROFILE_TO_FEED_PAGE", 3);
        LLILZ = enumC1034900d2O4;
        EnumC1034900d2O enumC1034900d2O5 = new EnumC1034900d2O("ON_FEED_PAGE_SELECTED", 4);
        LLILZIL = enumC1034900d2O5;
        EnumC1034900d2O[] enumC1034900d2OArr = {enumC1034900d2O, enumC1034900d2O2, enumC1034900d2O3, enumC1034900d2O4, enumC1034900d2O5};
        LLILZLL = enumC1034900d2OArr;
        new C2254308sP(enumC1034900d2OArr);
    }

    public static EnumC1034900d2O[] values() {
        return (EnumC1034900d2O[]) LLILZLL.clone();
    }

    public static EnumC1034900d2O valueOf(String str) {
        return (EnumC1034900d2O) C08FF.LIZ(EnumC1034900d2O.class, str);
    }

    public EnumC1034900d2O(String str, int i) {
    }
}
