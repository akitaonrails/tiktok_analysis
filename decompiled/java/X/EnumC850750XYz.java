package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XYz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC850750XYz {
    public static final EnumC850750XYz CODE;
    public static final EnumC850750XYz LINK_LONG_EXPIRATION;
    public static final /* synthetic */ EnumC850750XYz[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC850750XYz> getEntries() {
        return LLILZ;
    }

    static {
        EnumC850750XYz enumC850750XYz = new EnumC850750XYz("CODE", 0, 0, "code");
        CODE = enumC850750XYz;
        EnumC850750XYz enumC850750XYz2 = new EnumC850750XYz("LINK_LONG_EXPIRATION", 1, 4, "link");
        LINK_LONG_EXPIRATION = enumC850750XYz2;
        EnumC850750XYz[] enumC850750XYzArr = {enumC850750XYz, enumC850750XYz2};
        LLILLL = enumC850750XYzArr;
        LLILZ = new C2254308sP(enumC850750XYzArr);
    }

    public static EnumC850750XYz[] values() {
        return (EnumC850750XYz[]) LLILLL.clone();
    }

    public final String getThemeName() {
        return this.LLILLJJLI;
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC850750XYz valueOf(String str) {
        return (EnumC850750XYz) C08FF.LIZ(EnumC850750XYz.class, str);
    }

    public EnumC850750XYz(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
