package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Dn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC043300Dn {
    public static final EnumC043300Dn DOT_STYLE;
    public static final /* synthetic */ EnumC043300Dn[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC043300Dn NUMBER_STYLE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC043300Dn> getEntries() {
        return LLILLL;
    }

    static {
        EnumC043300Dn enumC043300Dn = new EnumC043300Dn("DOT_STYLE", 0, 0);
        DOT_STYLE = enumC043300Dn;
        EnumC043300Dn enumC043300Dn2 = new EnumC043300Dn("NUMBER_STYLE", 1, 1);
        NUMBER_STYLE = enumC043300Dn2;
        EnumC043300Dn[] enumC043300DnArr = {enumC043300Dn, enumC043300Dn2};
        LLILLJJLI = enumC043300DnArr;
        LLILLL = new C2254308sP(enumC043300DnArr);
    }

    public static EnumC043300Dn[] values() {
        return (EnumC043300Dn[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC043300Dn valueOf(String str) {
        return (EnumC043300Dn) C08FF.LIZ(EnumC043300Dn.class, str);
    }

    public EnumC043300Dn(String str, int i, int i2) {
        this.LL = i2;
    }
}
