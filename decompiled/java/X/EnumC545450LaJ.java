package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LaJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC545450LaJ {
    public static final EnumC545450LaJ BLANK_SERVER_TASK_ID;
    public static final EnumC545450LaJ EMPTY_RESULTS;
    public static final /* synthetic */ EnumC545450LaJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC545450LaJ NO_VALID_URLS;
    public static final EnumC545450LaJ URL_EXPIRED;

    public static InterfaceC2044707zh<EnumC545450LaJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC545450LaJ enumC545450LaJ = new EnumC545450LaJ("BLANK_SERVER_TASK_ID", 0);
        BLANK_SERVER_TASK_ID = enumC545450LaJ;
        EnumC545450LaJ enumC545450LaJ2 = new EnumC545450LaJ("EMPTY_RESULTS", 1);
        EMPTY_RESULTS = enumC545450LaJ2;
        EnumC545450LaJ enumC545450LaJ3 = new EnumC545450LaJ("URL_EXPIRED", 2);
        URL_EXPIRED = enumC545450LaJ3;
        EnumC545450LaJ enumC545450LaJ4 = new EnumC545450LaJ("NO_VALID_URLS", 3);
        NO_VALID_URLS = enumC545450LaJ4;
        EnumC545450LaJ[] enumC545450LaJArr = {enumC545450LaJ, enumC545450LaJ2, enumC545450LaJ3, enumC545450LaJ4};
        LL = enumC545450LaJArr;
        LLILLJJLI = new C2254308sP(enumC545450LaJArr);
    }

    public static EnumC545450LaJ[] values() {
        return (EnumC545450LaJ[]) LL.clone();
    }

    public static EnumC545450LaJ valueOf(String str) {
        return (EnumC545450LaJ) C08FF.LIZ(EnumC545450LaJ.class, str);
    }

    public EnumC545450LaJ(String str, int i) {
    }
}
