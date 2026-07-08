package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bRe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC973680bRe {
    public static final /* synthetic */ EnumC973680bRe[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC973680bRe NEGATIVE_OVER;
    public static final EnumC973680bRe POSITIVE_OVER;
    public static final EnumC973680bRe TIME_OUT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC973680bRe> getEntries() {
        return LLILLL;
    }

    static {
        EnumC973680bRe enumC973680bRe = new EnumC973680bRe("POSITIVE_OVER", 0, "positive_over");
        POSITIVE_OVER = enumC973680bRe;
        EnumC973680bRe enumC973680bRe2 = new EnumC973680bRe("NEGATIVE_OVER", 1, "negative_over");
        NEGATIVE_OVER = enumC973680bRe2;
        EnumC973680bRe enumC973680bRe3 = new EnumC973680bRe("TIME_OUT", 2, "time_out");
        TIME_OUT = enumC973680bRe3;
        EnumC973680bRe[] enumC973680bReArr = {enumC973680bRe, enumC973680bRe2, enumC973680bRe3};
        LLILLJJLI = enumC973680bReArr;
        LLILLL = new C2254308sP(enumC973680bReArr);
    }

    public static EnumC973680bRe[] values() {
        return (EnumC973680bRe[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC973680bRe valueOf(String str) {
        return (EnumC973680bRe) C08FF.LIZ(EnumC973680bRe.class, str);
    }

    public EnumC973680bRe(String str, int i, String str2) {
        this.LL = str2;
    }
}
