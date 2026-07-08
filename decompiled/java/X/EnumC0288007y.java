package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.007y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0288007y {
    public static final /* synthetic */ EnumC0288007y[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC0288007y NOTICE;
    public static final EnumC0288007y UNKNOWN;
    public static final EnumC0288007y USE_CARD;

    public static InterfaceC2044707zh<EnumC0288007y> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC0288007y enumC0288007y = new EnumC0288007y("USE_CARD", 0);
        USE_CARD = enumC0288007y;
        EnumC0288007y enumC0288007y2 = new EnumC0288007y("NOTICE", 1);
        NOTICE = enumC0288007y2;
        EnumC0288007y enumC0288007y3 = new EnumC0288007y("UNKNOWN", 2);
        UNKNOWN = enumC0288007y3;
        EnumC0288007y[] enumC0288007yArr = {enumC0288007y, enumC0288007y2, enumC0288007y3};
        LL = enumC0288007yArr;
        LLILLJJLI = new C2254308sP(enumC0288007yArr);
    }

    public static EnumC0288007y[] values() {
        return (EnumC0288007y[]) LL.clone();
    }

    public static EnumC0288007y valueOf(String str) {
        return (EnumC0288007y) C08FF.LIZ(EnumC0288007y.class, str);
    }

    public EnumC0288007y(String str, int i) {
    }
}
