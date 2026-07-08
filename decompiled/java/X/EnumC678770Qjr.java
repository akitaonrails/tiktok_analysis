package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Qjr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC678770Qjr {
    public static final EnumC678770Qjr LEVEL_NO;
    public static final EnumC678770Qjr LEVEL_STRONG;
    public static final EnumC678770Qjr LEVEL_WEAK;
    public static final /* synthetic */ EnumC678770Qjr[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC678770Qjr> getEntries() {
        return LLILLL;
    }

    static {
        EnumC678770Qjr enumC678770Qjr = new EnumC678770Qjr("LEVEL_NO", 0, 0);
        LEVEL_NO = enumC678770Qjr;
        EnumC678770Qjr enumC678770Qjr2 = new EnumC678770Qjr("LEVEL_WEAK", 1, 1);
        LEVEL_WEAK = enumC678770Qjr2;
        EnumC678770Qjr enumC678770Qjr3 = new EnumC678770Qjr("LEVEL_STRONG", 2, 2);
        LEVEL_STRONG = enumC678770Qjr3;
        EnumC678770Qjr[] enumC678770QjrArr = {enumC678770Qjr, enumC678770Qjr2, enumC678770Qjr3};
        LLILLJJLI = enumC678770QjrArr;
        LLILLL = new C2254308sP(enumC678770QjrArr);
    }

    public static EnumC678770Qjr[] values() {
        return (EnumC678770Qjr[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC678770Qjr valueOf(String str) {
        return (EnumC678770Qjr) C08FF.LIZ(EnumC678770Qjr.class, str);
    }

    public EnumC678770Qjr(String str, int i, int i2) {
        this.LL = i2;
    }
}
