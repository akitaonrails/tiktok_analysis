package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bx8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993200bx8 {
    public static final EnumC993200bx8 GREEN_POI_ANCHOR;
    public static final /* synthetic */ EnumC993200bx8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC993200bx8 PRODUCT_ANCHOR;

    public static InterfaceC2044707zh<EnumC993200bx8> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993200bx8 enumC993200bx8 = new EnumC993200bx8("GREEN_POI_ANCHOR", 0);
        GREEN_POI_ANCHOR = enumC993200bx8;
        EnumC993200bx8 enumC993200bx82 = new EnumC993200bx8("PRODUCT_ANCHOR", 1);
        PRODUCT_ANCHOR = enumC993200bx82;
        EnumC993200bx8[] enumC993200bx8Arr = {enumC993200bx8, enumC993200bx82};
        LL = enumC993200bx8Arr;
        LLILLJJLI = new C2254308sP(enumC993200bx8Arr);
    }

    public static EnumC993200bx8[] values() {
        return (EnumC993200bx8[]) LL.clone();
    }

    public static EnumC993200bx8 valueOf(String str) {
        return (EnumC993200bx8) C08FF.LIZ(EnumC993200bx8.class, str);
    }

    public EnumC993200bx8(String str, int i) {
    }
}
