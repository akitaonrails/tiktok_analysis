package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TeJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC751770TeJ {
    public static final EnumC751770TeJ LL;
    public static final EnumC751770TeJ LLILLJJLI;
    public static final EnumC751770TeJ LLILLL;
    public static final EnumC751770TeJ LLILZ;
    public static final EnumC751770TeJ LLILZIL;
    public static final /* synthetic */ EnumC751770TeJ[] LLILZLL;

    static {
        EnumC751770TeJ enumC751770TeJ = new EnumC751770TeJ("SUCCESS", 0);
        LL = enumC751770TeJ;
        EnumC751770TeJ enumC751770TeJ2 = new EnumC751770TeJ("PACKAGE_NAME_IS_EMPTY", 1);
        LLILLJJLI = enumC751770TeJ2;
        EnumC751770TeJ enumC751770TeJ3 = new EnumC751770TeJ("NETWORK_ERROR", 2);
        LLILLL = enumC751770TeJ3;
        EnumC751770TeJ enumC751770TeJ4 = new EnumC751770TeJ("GOOGLE_SERVICE_DISABLE", 3);
        LLILZ = enumC751770TeJ4;
        EnumC751770TeJ enumC751770TeJ5 = new EnumC751770TeJ("REFERRER_IS_EMPTY", 4);
        EnumC751770TeJ enumC751770TeJ6 = new EnumC751770TeJ("CONTEXT_ERROR", 5);
        LLILZIL = enumC751770TeJ6;
        EnumC751770TeJ[] enumC751770TeJArr = {enumC751770TeJ, enumC751770TeJ2, enumC751770TeJ3, enumC751770TeJ4, enumC751770TeJ5, enumC751770TeJ6};
        LLILZLL = enumC751770TeJArr;
        new C2254308sP(enumC751770TeJArr);
    }

    public static EnumC751770TeJ[] values() {
        return (EnumC751770TeJ[]) LLILZLL.clone();
    }

    public static EnumC751770TeJ valueOf(String str) {
        return (EnumC751770TeJ) C08FF.LIZ(EnumC751770TeJ.class, str);
    }

    public EnumC751770TeJ(String str, int i) {
    }
}
