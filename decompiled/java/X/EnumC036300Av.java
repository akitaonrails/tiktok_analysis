package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Av, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC036300Av {
    public static final EnumC036300Av CARD_TIP_TYPE_REDDOT;
    public static final EnumC036300Av CARD_TIP_TYPE_UNKNOWN;
    public static final /* synthetic */ EnumC036300Av[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC036300Av> getEntries() {
        return LLILLL;
    }

    static {
        EnumC036300Av enumC036300Av = new EnumC036300Av("CARD_TIP_TYPE_UNKNOWN", 0, 0);
        CARD_TIP_TYPE_UNKNOWN = enumC036300Av;
        EnumC036300Av enumC036300Av2 = new EnumC036300Av("CARD_TIP_TYPE_REDDOT", 1, 1);
        CARD_TIP_TYPE_REDDOT = enumC036300Av2;
        EnumC036300Av[] enumC036300AvArr = {enumC036300Av, enumC036300Av2};
        LLILLJJLI = enumC036300AvArr;
        LLILLL = new C2254308sP(enumC036300AvArr);
    }

    public static EnumC036300Av[] values() {
        return (EnumC036300Av[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC036300Av valueOf(String str) {
        return (EnumC036300Av) C08FF.LIZ(EnumC036300Av.class, str);
    }

    public EnumC036300Av(String str, int i, int i2) {
        this.LL = i2;
    }
}
