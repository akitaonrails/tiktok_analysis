package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UUh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC773090UUh {
    public static final EnumC773090UUh LINKMIC;
    public static final /* synthetic */ EnumC773090UUh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC773090UUh PREVIEW;
    public final int LL;

    public static InterfaceC2044707zh<EnumC773090UUh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC773090UUh enumC773090UUh = new EnumC773090UUh("LINKMIC", 0, 0);
        LINKMIC = enumC773090UUh;
        EnumC773090UUh enumC773090UUh2 = new EnumC773090UUh("PREVIEW", 1, 1);
        PREVIEW = enumC773090UUh2;
        EnumC773090UUh[] enumC773090UUhArr = {enumC773090UUh, enumC773090UUh2};
        LLILLJJLI = enumC773090UUhArr;
        LLILLL = new C2254308sP(enumC773090UUhArr);
    }

    public static EnumC773090UUh[] values() {
        return (EnumC773090UUh[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC773090UUh valueOf(String str) {
        return (EnumC773090UUh) C08FF.LIZ(EnumC773090UUh.class, str);
    }

    public EnumC773090UUh(String str, int i, int i2) {
        this.LL = i2;
    }
}
