package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0s8v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1615550s8v {
    public static final /* synthetic */ EnumC1615550s8v[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1615550s8v PGC_OPTION_TYPE_ONE_TIME;
    public static final EnumC1615550s8v PGC_OPTION_TYPE_SUBSCRIPTION;
    public static final EnumC1615550s8v PGC_OPTION_TYPE_UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1615550s8v> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1615550s8v enumC1615550s8v = new EnumC1615550s8v("PGC_OPTION_TYPE_UNKNOWN", 0, 0);
        PGC_OPTION_TYPE_UNKNOWN = enumC1615550s8v;
        EnumC1615550s8v enumC1615550s8v2 = new EnumC1615550s8v("PGC_OPTION_TYPE_ONE_TIME", 1, 1);
        PGC_OPTION_TYPE_ONE_TIME = enumC1615550s8v2;
        EnumC1615550s8v enumC1615550s8v3 = new EnumC1615550s8v("PGC_OPTION_TYPE_SUBSCRIPTION", 2, 2);
        PGC_OPTION_TYPE_SUBSCRIPTION = enumC1615550s8v3;
        EnumC1615550s8v[] enumC1615550s8vArr = {enumC1615550s8v, enumC1615550s8v2, enumC1615550s8v3};
        LLILLJJLI = enumC1615550s8vArr;
        LLILLL = new C2254308sP(enumC1615550s8vArr);
    }

    public static EnumC1615550s8v[] values() {
        return (EnumC1615550s8v[]) LLILLJJLI.clone();
    }

    public final int getProtoValue() {
        return this.LL;
    }

    public static EnumC1615550s8v valueOf(String str) {
        return (EnumC1615550s8v) C08FF.LIZ(EnumC1615550s8v.class, str);
    }

    public EnumC1615550s8v(String str, int i, int i2) {
        this.LL = i2;
    }
}
