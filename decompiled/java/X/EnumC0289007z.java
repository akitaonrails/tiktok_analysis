package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.007z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0289007z {
    public static final EnumC0289007z HOT_SELL;
    public static final /* synthetic */ EnumC0289007z[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC0289007z MARKETING;
    public final int LL;

    public static InterfaceC2044707zh<EnumC0289007z> getEntries() {
        return LLILLL;
    }

    static {
        EnumC0289007z enumC0289007z = new EnumC0289007z("MARKETING", 0, 1);
        MARKETING = enumC0289007z;
        EnumC0289007z enumC0289007z2 = new EnumC0289007z("HOT_SELL", 1, 2);
        HOT_SELL = enumC0289007z2;
        EnumC0289007z[] enumC0289007zArr = {enumC0289007z, enumC0289007z2};
        LLILLJJLI = enumC0289007zArr;
        LLILLL = new C2254308sP(enumC0289007zArr);
    }

    public static EnumC0289007z[] values() {
        return (EnumC0289007z[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC0289007z valueOf(String str) {
        return (EnumC0289007z) C08FF.LIZ(EnumC0289007z.class, str);
    }

    public EnumC0289007z(String str, int i, int i2) {
        this.LL = i2;
    }
}
