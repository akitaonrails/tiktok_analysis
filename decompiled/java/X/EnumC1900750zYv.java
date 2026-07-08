package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zYv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1900750zYv {
    public static final EnumC1900750zYv CHANGE_TAB;
    public static final EnumC1900750zYv ERROR_REFRESH;
    public static final EnumC1900750zYv FIRST_REFRESH;
    public static final /* synthetic */ EnumC1900750zYv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1900750zYv LOAD_MORE;
    public static final EnumC1900750zYv PRELOAD;
    public static final EnumC1900750zYv REFRESH;
    public static final EnumC1900750zYv UPDATE_MODEL;

    public static InterfaceC2044707zh<EnumC1900750zYv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1900750zYv enumC1900750zYv = new EnumC1900750zYv("FIRST_REFRESH", 0);
        FIRST_REFRESH = enumC1900750zYv;
        EnumC1900750zYv enumC1900750zYv2 = new EnumC1900750zYv("REFRESH", 1);
        REFRESH = enumC1900750zYv2;
        EnumC1900750zYv enumC1900750zYv3 = new EnumC1900750zYv("ERROR_REFRESH", 2);
        ERROR_REFRESH = enumC1900750zYv3;
        EnumC1900750zYv enumC1900750zYv4 = new EnumC1900750zYv("LOAD_MORE", 3);
        LOAD_MORE = enumC1900750zYv4;
        EnumC1900750zYv enumC1900750zYv5 = new EnumC1900750zYv("PRELOAD", 4);
        PRELOAD = enumC1900750zYv5;
        EnumC1900750zYv enumC1900750zYv6 = new EnumC1900750zYv("CHANGE_TAB", 5);
        CHANGE_TAB = enumC1900750zYv6;
        EnumC1900750zYv enumC1900750zYv7 = new EnumC1900750zYv("UPDATE_MODEL", 6);
        UPDATE_MODEL = enumC1900750zYv7;
        EnumC1900750zYv[] enumC1900750zYvArr = {enumC1900750zYv, enumC1900750zYv2, enumC1900750zYv3, enumC1900750zYv4, enumC1900750zYv5, enumC1900750zYv6, enumC1900750zYv7};
        LL = enumC1900750zYvArr;
        LLILLJJLI = new C2254308sP(enumC1900750zYvArr);
    }

    public static EnumC1900750zYv[] values() {
        return (EnumC1900750zYv[]) LL.clone();
    }

    public static EnumC1900750zYv valueOf(String str) {
        return (EnumC1900750zYv) C08FF.LIZ(EnumC1900750zYv.class, str);
    }

    public EnumC1900750zYv(String str, int i) {
    }
}
