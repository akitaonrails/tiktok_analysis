package X;

import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ubv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1710410ubv {
    public static final EnumC1710410ubv CARD_INVALID;
    public static final EnumC1710410ubv CARD_UNSUPPORTED;
    public static final EnumC1710410ubv DATE_HAS_BEEN_EXPIRED;
    public static final EnumC1710410ubv LEN_LIST;
    public static final /* synthetic */ EnumC1710410ubv[] LLILZIL;
    public static final /* synthetic */ C2254308sP LLILZLL;
    public static final EnumC1710410ubv MAX_LEN;
    public static final EnumC1710410ubv MAX_YEAR_LEN;
    public static final EnumC1710410ubv REGEX;
    public static final EnumC1710410ubv REQUIRED;
    public static final EnumC1710410ubv UNSUPPORTED;
    public final boolean LL;
    public final List<EnumC1710440uby> LLILLJJLI;
    public final boolean LLILLL;
    public final String LLILZ;

    public static InterfaceC2044707zh<EnumC1710410ubv> getEntries() {
        return LLILZLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z = true;
        int i = 6;
        EnumC1710410ubv enumC1710410ubv = new EnumC1710410ubv("REQUIRED", 0, "required", z, (boolean) (0 == true ? 1 : 0), i);
        REQUIRED = enumC1710410ubv;
        boolean z2 = true;
        EnumC1710410ubv enumC1710410ubv2 = new EnumC1710410ubv(1, "CARD_UNSUPPORTED", "card_unsupported", (List) C1710430ubx.LIZIZ, true, true);
        CARD_UNSUPPORTED = enumC1710410ubv2;
        EnumC1710410ubv enumC1710410ubv3 = new EnumC1710410ubv("LEN_LIST", 2, "len_list", z, (boolean) (0 == true ? 1 : 0), i);
        LEN_LIST = enumC1710410ubv3;
        EnumC1710410ubv enumC1710410ubv4 = new EnumC1710410ubv("MAX_YEAR_LEN", 3, "max_year_len", z, false, i);
        MAX_YEAR_LEN = enumC1710410ubv4;
        EnumC1710410ubv enumC1710410ubv5 = new EnumC1710410ubv("DATE_HAS_BEEN_EXPIRED", 4, "date_has_been_expired", z2, z2, 2);
        DATE_HAS_BEEN_EXPIRED = enumC1710410ubv5;
        boolean z3 = false;
        int i2 = 6;
        EnumC1710410ubv enumC1710410ubv6 = new EnumC1710410ubv("REGEX", 5, "regex", z2, false, i);
        REGEX = enumC1710410ubv6;
        EnumC1710410ubv enumC1710410ubv7 = new EnumC1710410ubv("CARD_INVALID", i2, "luhn", z2, z2, 2);
        CARD_INVALID = enumC1710410ubv7;
        EnumC1710410ubv enumC1710410ubv8 = new EnumC1710410ubv("MAX_LEN", 7, "max_len", z3, z3, i2);
        MAX_LEN = enumC1710410ubv8;
        EnumC1710410ubv enumC1710410ubv9 = new EnumC1710410ubv("UNSUPPORTED", 8, "unsupported", z3, z3, i2);
        UNSUPPORTED = enumC1710410ubv9;
        EnumC1710410ubv[] enumC1710410ubvArr = {enumC1710410ubv, enumC1710410ubv2, enumC1710410ubv3, enumC1710410ubv4, enumC1710410ubv5, enumC1710410ubv6, enumC1710410ubv7, enumC1710410ubv8, enumC1710410ubv9};
        LLILZIL = enumC1710410ubvArr;
        LLILZLL = new C2254308sP(enumC1710410ubvArr);
    }

    public static EnumC1710410ubv[] values() {
        return (EnumC1710410ubv[]) LLILZIL.clone();
    }

    public final String getDesc() {
        return this.LLILZ;
    }

    public final boolean getLocal() {
        return this.LLILLL;
    }

    public final boolean getSupportContent() {
        return this.LL;
    }

    public final List<EnumC1710440uby> getSupportedScenes() {
        return this.LLILLJJLI;
    }

    public static EnumC1710410ubv valueOf(String str) {
        return (EnumC1710410ubv) C08FF.LIZ(EnumC1710410ubv.class, str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EnumC1710410ubv(String str, int i, String str2, boolean z, boolean z2, int i2) {
        List<EnumC1710440uby> list;
        String str3 = str2;
        boolean z3 = z2;
        if ((i2 & 2) != 0) {
            list = C1710430ubx.LIZ;
        } else {
            list = null;
        }
        this(i, str, (i2 & 8) != 0 ? "" : str3, list, z, (i2 & 4) != 0 ? false : z3);
    }

    public EnumC1710410ubv(int i, String str, String str2, List list, boolean z, boolean z2) {
        this.LL = z;
        this.LLILLJJLI = list;
        this.LLILLL = z2;
        this.LLILZ = str2;
    }
}
