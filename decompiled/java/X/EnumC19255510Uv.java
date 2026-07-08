package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10Uv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC19255510Uv {
    public static final EnumC19255510Uv EQUAL;
    public static final EnumC19255510Uv GREATER_THAN;
    public static final EnumC19255510Uv GREATER_THAN_OR_EQUAL;
    public static final EnumC19255510Uv IN;
    public static final EnumC19255510Uv LESS_THAN;
    public static final EnumC19255510Uv LESS_THAN_OR_EQUAL;
    public static final /* synthetic */ EnumC19255510Uv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19255510Uv NOT_EQUAL;
    public static final EnumC19255510Uv NOT_IN;
    public static final EnumC19255510Uv UNKNOWN;

    public static InterfaceC2044707zh<EnumC19255510Uv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19255510Uv enumC19255510Uv = new EnumC19255510Uv("GREATER_THAN", 0);
        GREATER_THAN = enumC19255510Uv;
        EnumC19255510Uv enumC19255510Uv2 = new EnumC19255510Uv("GREATER_THAN_OR_EQUAL", 1);
        GREATER_THAN_OR_EQUAL = enumC19255510Uv2;
        EnumC19255510Uv enumC19255510Uv3 = new EnumC19255510Uv("LESS_THAN", 2);
        LESS_THAN = enumC19255510Uv3;
        EnumC19255510Uv enumC19255510Uv4 = new EnumC19255510Uv("LESS_THAN_OR_EQUAL", 3);
        LESS_THAN_OR_EQUAL = enumC19255510Uv4;
        EnumC19255510Uv enumC19255510Uv5 = new EnumC19255510Uv("EQUAL", 4);
        EQUAL = enumC19255510Uv5;
        EnumC19255510Uv enumC19255510Uv6 = new EnumC19255510Uv("NOT_EQUAL", 5);
        NOT_EQUAL = enumC19255510Uv6;
        EnumC19255510Uv enumC19255510Uv7 = new EnumC19255510Uv("IN", 6);
        IN = enumC19255510Uv7;
        EnumC19255510Uv enumC19255510Uv8 = new EnumC19255510Uv("NOT_IN", 7);
        NOT_IN = enumC19255510Uv8;
        EnumC19255510Uv enumC19255510Uv9 = new EnumC19255510Uv("UNKNOWN", 8);
        UNKNOWN = enumC19255510Uv9;
        EnumC19255510Uv[] enumC19255510UvArr = {enumC19255510Uv, enumC19255510Uv2, enumC19255510Uv3, enumC19255510Uv4, enumC19255510Uv5, enumC19255510Uv6, enumC19255510Uv7, enumC19255510Uv8, enumC19255510Uv9};
        LL = enumC19255510UvArr;
        LLILLJJLI = new C2254308sP(enumC19255510UvArr);
    }

    public static EnumC19255510Uv[] values() {
        return (EnumC19255510Uv[]) LL.clone();
    }

    public static EnumC19255510Uv valueOf(String str) {
        return (EnumC19255510Uv) C08FF.LIZ(EnumC19255510Uv.class, str);
    }

    public EnumC19255510Uv(String str, int i) {
    }
}
