package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0D2x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC332810D2x implements Serializable {
    public static final EnumC332810D2x CATALOG_ENRICHED;
    public static final EnumC332810D2x ENTRY_ENRICHED;
    public static final EnumC332810D2x ENTRY_FALLBACK;
    public static final /* synthetic */ EnumC332810D2x[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC332810D2x PLACEHOLDER_BAG;
    public static final EnumC332810D2x STOREFRONT;

    public static InterfaceC2044707zh<EnumC332810D2x> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC332810D2x enumC332810D2x = new EnumC332810D2x("STOREFRONT", 0);
        STOREFRONT = enumC332810D2x;
        EnumC332810D2x enumC332810D2x2 = new EnumC332810D2x("CATALOG_ENRICHED", 1);
        CATALOG_ENRICHED = enumC332810D2x2;
        EnumC332810D2x enumC332810D2x3 = new EnumC332810D2x("ENTRY_ENRICHED", 2);
        ENTRY_ENRICHED = enumC332810D2x3;
        EnumC332810D2x enumC332810D2x4 = new EnumC332810D2x("ENTRY_FALLBACK", 3);
        ENTRY_FALLBACK = enumC332810D2x4;
        EnumC332810D2x enumC332810D2x5 = new EnumC332810D2x("PLACEHOLDER_BAG", 4);
        PLACEHOLDER_BAG = enumC332810D2x5;
        EnumC332810D2x[] enumC332810D2xArr = {enumC332810D2x, enumC332810D2x2, enumC332810D2x3, enumC332810D2x4, enumC332810D2x5};
        LL = enumC332810D2xArr;
        LLILLJJLI = new C2254308sP(enumC332810D2xArr);
    }

    public static EnumC332810D2x[] values() {
        return (EnumC332810D2x[]) LL.clone();
    }

    public static EnumC332810D2x valueOf(String str) {
        return (EnumC332810D2x) C08FF.LIZ(EnumC332810D2x.class, str);
    }

    public EnumC332810D2x(String str, int i) {
    }
}
