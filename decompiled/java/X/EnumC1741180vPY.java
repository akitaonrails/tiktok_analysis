package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vPY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1741180vPY {
    public static final EnumC1741180vPY IN_MALL_APP_NOT_ACTIVE;
    public static final EnumC1741180vPY IN_MALL_COVERED_BY_PAGE;
    public static final EnumC1741180vPY IN_MALL_HOMEPAGE;
    public static final EnumC1741180vPY IN_MALL_NOT_LOGIN;
    public static final EnumC1741180vPY IN_MALL_NOT_LOGIN_APP_NOT_ACTIVE;
    public static final EnumC1741180vPY IN_MALL_NOT_LOGIN_COVERED_BY_PAGE;
    public static final /* synthetic */ EnumC1741180vPY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1741180vPY OUT_OF_MALL;

    public static InterfaceC2044707zh<EnumC1741180vPY> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1741180vPY enumC1741180vPY = new EnumC1741180vPY("OUT_OF_MALL", 0);
        OUT_OF_MALL = enumC1741180vPY;
        EnumC1741180vPY enumC1741180vPY2 = new EnumC1741180vPY("IN_MALL_HOMEPAGE", 1);
        IN_MALL_HOMEPAGE = enumC1741180vPY2;
        EnumC1741180vPY enumC1741180vPY3 = new EnumC1741180vPY("IN_MALL_APP_NOT_ACTIVE", 2);
        IN_MALL_APP_NOT_ACTIVE = enumC1741180vPY3;
        EnumC1741180vPY enumC1741180vPY4 = new EnumC1741180vPY("IN_MALL_COVERED_BY_PAGE", 3);
        IN_MALL_COVERED_BY_PAGE = enumC1741180vPY4;
        EnumC1741180vPY enumC1741180vPY5 = new EnumC1741180vPY("IN_MALL_NOT_LOGIN", 4);
        IN_MALL_NOT_LOGIN = enumC1741180vPY5;
        EnumC1741180vPY enumC1741180vPY6 = new EnumC1741180vPY("IN_MALL_NOT_LOGIN_APP_NOT_ACTIVE", 5);
        IN_MALL_NOT_LOGIN_APP_NOT_ACTIVE = enumC1741180vPY6;
        EnumC1741180vPY enumC1741180vPY7 = new EnumC1741180vPY("IN_MALL_NOT_LOGIN_COVERED_BY_PAGE", 6);
        IN_MALL_NOT_LOGIN_COVERED_BY_PAGE = enumC1741180vPY7;
        EnumC1741180vPY[] enumC1741180vPYArr = {enumC1741180vPY, enumC1741180vPY2, enumC1741180vPY3, enumC1741180vPY4, enumC1741180vPY5, enumC1741180vPY6, enumC1741180vPY7};
        LL = enumC1741180vPYArr;
        LLILLJJLI = new C2254308sP(enumC1741180vPYArr);
    }

    public static EnumC1741180vPY[] values() {
        return (EnumC1741180vPY[]) LL.clone();
    }

    public static EnumC1741180vPY valueOf(String str) {
        return (EnumC1741180vPY) C08FF.LIZ(EnumC1741180vPY.class, str);
    }

    public EnumC1741180vPY(String str, int i) {
    }
}
