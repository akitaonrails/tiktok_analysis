package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rYv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1593230rYv {
    public static final EnumC1593230rYv CACHE_DATA;
    public static final EnumC1593230rYv CACHE_DATA_NEXT_FRAME;
    public static final EnumC1593230rYv FIRST_FRAME;
    public static final EnumC1593230rYv FRAMEWORK;
    public static final EnumC1593230rYv FULL_DATA;
    public static final EnumC1593230rYv FULL_DATA_NEXT_FRAME;
    public static final /* synthetic */ EnumC1593230rYv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1593230rYv ON_ATTACH;
    public static final EnumC1593230rYv ON_CREATE;
    public static final EnumC1593230rYv ON_RESUME;
    public static final EnumC1593230rYv ON_VIEW_CREATED;
    public static final EnumC1593230rYv PRELOAD;
    public static final EnumC1593230rYv START;

    public static InterfaceC2044707zh<EnumC1593230rYv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1593230rYv enumC1593230rYv = new EnumC1593230rYv("START", 0);
        START = enumC1593230rYv;
        EnumC1593230rYv enumC1593230rYv2 = new EnumC1593230rYv("PRELOAD", 1);
        PRELOAD = enumC1593230rYv2;
        EnumC1593230rYv enumC1593230rYv3 = new EnumC1593230rYv("FRAMEWORK", 2);
        FRAMEWORK = enumC1593230rYv3;
        EnumC1593230rYv enumC1593230rYv4 = new EnumC1593230rYv("ON_ATTACH", 3);
        ON_ATTACH = enumC1593230rYv4;
        EnumC1593230rYv enumC1593230rYv5 = new EnumC1593230rYv("ON_CREATE", 4);
        ON_CREATE = enumC1593230rYv5;
        EnumC1593230rYv enumC1593230rYv6 = new EnumC1593230rYv("ON_VIEW_CREATED", 5);
        ON_VIEW_CREATED = enumC1593230rYv6;
        EnumC1593230rYv enumC1593230rYv7 = new EnumC1593230rYv("ON_RESUME", 6);
        ON_RESUME = enumC1593230rYv7;
        EnumC1593230rYv enumC1593230rYv8 = new EnumC1593230rYv("FIRST_FRAME", 7);
        FIRST_FRAME = enumC1593230rYv8;
        EnumC1593230rYv enumC1593230rYv9 = new EnumC1593230rYv("CACHE_DATA", 8);
        CACHE_DATA = enumC1593230rYv9;
        EnumC1593230rYv enumC1593230rYv10 = new EnumC1593230rYv("CACHE_DATA_NEXT_FRAME", 9);
        CACHE_DATA_NEXT_FRAME = enumC1593230rYv10;
        EnumC1593230rYv enumC1593230rYv11 = new EnumC1593230rYv("FULL_DATA", 10);
        FULL_DATA = enumC1593230rYv11;
        EnumC1593230rYv enumC1593230rYv12 = new EnumC1593230rYv("FULL_DATA_NEXT_FRAME", 11);
        FULL_DATA_NEXT_FRAME = enumC1593230rYv12;
        EnumC1593230rYv[] enumC1593230rYvArr = {enumC1593230rYv, enumC1593230rYv2, enumC1593230rYv3, enumC1593230rYv4, enumC1593230rYv5, enumC1593230rYv6, enumC1593230rYv7, enumC1593230rYv8, enumC1593230rYv9, enumC1593230rYv10, enumC1593230rYv11, enumC1593230rYv12};
        LL = enumC1593230rYvArr;
        LLILLJJLI = new C2254308sP(enumC1593230rYvArr);
    }

    public static EnumC1593230rYv[] values() {
        return (EnumC1593230rYv[]) LL.clone();
    }

    public static EnumC1593230rYv valueOf(String str) {
        return (EnumC1593230rYv) C08FF.LIZ(EnumC1593230rYv.class, str);
    }

    public EnumC1593230rYv(String str, int i) {
    }
}
