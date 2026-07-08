package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03np, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC951903np {
    public static final /* synthetic */ EnumC951903np[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC951903np MALL_GENTLE;
    public static final EnumC951903np MALL_STRONG;
    public static final EnumC951903np STAR_SHOP;
    public final int LL;

    public static InterfaceC2044707zh<EnumC951903np> getEntries() {
        return LLILLL;
    }

    static {
        EnumC951903np enumC951903np = new EnumC951903np("MALL_GENTLE", 0, 1);
        MALL_GENTLE = enumC951903np;
        EnumC951903np enumC951903np2 = new EnumC951903np("MALL_STRONG", 1, 2);
        MALL_STRONG = enumC951903np2;
        EnumC951903np enumC951903np3 = new EnumC951903np("STAR_SHOP", 2, 3);
        STAR_SHOP = enumC951903np3;
        EnumC951903np[] enumC951903npArr = {enumC951903np, enumC951903np2, enumC951903np3};
        LLILLJJLI = enumC951903npArr;
        LLILLL = new C2254308sP(enumC951903npArr);
    }

    public static EnumC951903np[] values() {
        return (EnumC951903np[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC951903np valueOf(String str) {
        return (EnumC951903np) C08FF.LIZ(EnumC951903np.class, str);
    }

    public EnumC951903np(String str, int i, int i2) {
        this.LL = i2;
    }
}
