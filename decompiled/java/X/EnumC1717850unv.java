package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0unv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1717850unv {
    public static final EnumC1717850unv API_ERROR;
    public static final /* synthetic */ EnumC1717850unv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1717850unv LOADING;
    public static final EnumC1717850unv NOT_START;
    public static final EnumC1717850unv SUCCESS;

    public static InterfaceC2044707zh<EnumC1717850unv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1717850unv enumC1717850unv = new EnumC1717850unv("NOT_START", 0);
        NOT_START = enumC1717850unv;
        EnumC1717850unv enumC1717850unv2 = new EnumC1717850unv("LOADING", 1);
        LOADING = enumC1717850unv2;
        EnumC1717850unv enumC1717850unv3 = new EnumC1717850unv("SUCCESS", 2);
        SUCCESS = enumC1717850unv3;
        EnumC1717850unv enumC1717850unv4 = new EnumC1717850unv("API_ERROR", 3);
        API_ERROR = enumC1717850unv4;
        EnumC1717850unv[] enumC1717850unvArr = {enumC1717850unv, enumC1717850unv2, enumC1717850unv3, enumC1717850unv4};
        LL = enumC1717850unvArr;
        LLILLJJLI = new C2254308sP(enumC1717850unvArr);
    }

    public static EnumC1717850unv[] values() {
        return (EnumC1717850unv[]) LL.clone();
    }

    public static EnumC1717850unv valueOf(String str) {
        return (EnumC1717850unv) C08FF.LIZ(EnumC1717850unv.class, str);
    }

    public EnumC1717850unv(String str, int i) {
    }
}
