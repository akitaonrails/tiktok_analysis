package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Cf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC804303Cf {
    public static final /* synthetic */ EnumC804303Cf[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC804303Cf NORMAL;
    public static final EnumC804303Cf SEA_ONE_STEP;
    public final int LL;

    public static InterfaceC2044707zh<EnumC804303Cf> getEntries() {
        return LLILLL;
    }

    static {
        EnumC804303Cf enumC804303Cf = new EnumC804303Cf("NORMAL", 0, 0);
        NORMAL = enumC804303Cf;
        EnumC804303Cf enumC804303Cf2 = new EnumC804303Cf("SEA_ONE_STEP", 1, 1);
        SEA_ONE_STEP = enumC804303Cf2;
        EnumC804303Cf[] enumC804303CfArr = {enumC804303Cf, enumC804303Cf2};
        LLILLJJLI = enumC804303CfArr;
        LLILLL = new C2254308sP(enumC804303CfArr);
    }

    public static EnumC804303Cf[] values() {
        return (EnumC804303Cf[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC804303Cf valueOf(String str) {
        return (EnumC804303Cf) C08FF.LIZ(EnumC804303Cf.class, str);
    }

    public EnumC804303Cf(String str, int i, int i2) {
        this.LL = i2;
    }
}
