package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JTc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC492500JTc {
    public static final /* synthetic */ EnumC492500JTc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC492500JTc MANAGEMENT_PAGE;
    public static final EnumC492500JTc PRIVILEGE_PAGE;

    public static InterfaceC2044707zh<EnumC492500JTc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC492500JTc enumC492500JTc = new EnumC492500JTc("PRIVILEGE_PAGE", 0);
        PRIVILEGE_PAGE = enumC492500JTc;
        EnumC492500JTc enumC492500JTc2 = new EnumC492500JTc("MANAGEMENT_PAGE", 1);
        MANAGEMENT_PAGE = enumC492500JTc2;
        EnumC492500JTc[] enumC492500JTcArr = {enumC492500JTc, enumC492500JTc2};
        LL = enumC492500JTcArr;
        LLILLJJLI = new C2254308sP(enumC492500JTcArr);
    }

    public static EnumC492500JTc[] values() {
        return (EnumC492500JTc[]) LL.clone();
    }

    public static EnumC492500JTc valueOf(String str) {
        return (EnumC492500JTc) C08FF.LIZ(EnumC492500JTc.class, str);
    }

    public EnumC492500JTc(String str, int i) {
    }
}
