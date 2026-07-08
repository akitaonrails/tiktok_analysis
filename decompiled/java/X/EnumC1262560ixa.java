package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ixa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1262560ixa {
    public static final /* synthetic */ EnumC1262560ixa[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1262560ixa PLATFORMS_ONLY;
    public static final EnumC1262560ixa RECOMMEND_MORE;
    public static final EnumC1262560ixa TRIAD_REC_MORE;
    public static final EnumC1262560ixa UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1262560ixa> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1262560ixa enumC1262560ixa = new EnumC1262560ixa("UNKNOWN", 0, 0);
        UNKNOWN = enumC1262560ixa;
        EnumC1262560ixa enumC1262560ixa2 = new EnumC1262560ixa("RECOMMEND_MORE", 1, 1);
        RECOMMEND_MORE = enumC1262560ixa2;
        EnumC1262560ixa enumC1262560ixa3 = new EnumC1262560ixa("PLATFORMS_ONLY", 2, 2);
        PLATFORMS_ONLY = enumC1262560ixa3;
        EnumC1262560ixa enumC1262560ixa4 = new EnumC1262560ixa("TRIAD_REC_MORE", 3, 3);
        TRIAD_REC_MORE = enumC1262560ixa4;
        EnumC1262560ixa[] enumC1262560ixaArr = {enumC1262560ixa, enumC1262560ixa2, enumC1262560ixa3, enumC1262560ixa4};
        LLILLJJLI = enumC1262560ixaArr;
        LLILLL = new C2254308sP(enumC1262560ixaArr);
    }

    public static EnumC1262560ixa[] values() {
        return (EnumC1262560ixa[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1262560ixa valueOf(String str) {
        return (EnumC1262560ixa) C08FF.LIZ(EnumC1262560ixa.class, str);
    }

    public EnumC1262560ixa(String str, int i, int i2) {
        this.LL = i2;
    }
}
