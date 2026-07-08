package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OUh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC620210OUh {
    public static final EnumC620210OUh INITIAL_TYPE;
    public static final /* synthetic */ EnumC620210OUh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC620210OUh RECORDING_TYPE;
    public static final EnumC620210OUh RECORD_FINISH_TYPE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC620210OUh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC620210OUh enumC620210OUh = new EnumC620210OUh("INITIAL_TYPE", 0, 0);
        INITIAL_TYPE = enumC620210OUh;
        EnumC620210OUh enumC620210OUh2 = new EnumC620210OUh("RECORDING_TYPE", 1, 1);
        RECORDING_TYPE = enumC620210OUh2;
        EnumC620210OUh enumC620210OUh3 = new EnumC620210OUh("RECORD_FINISH_TYPE", 2, 2);
        RECORD_FINISH_TYPE = enumC620210OUh3;
        EnumC620210OUh[] enumC620210OUhArr = {enumC620210OUh, enumC620210OUh2, enumC620210OUh3};
        LLILLJJLI = enumC620210OUhArr;
        LLILLL = new C2254308sP(enumC620210OUhArr);
    }

    public static EnumC620210OUh[] values() {
        return (EnumC620210OUh[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC620210OUh valueOf(String str) {
        return (EnumC620210OUh) C08FF.LIZ(EnumC620210OUh.class, str);
    }

    public EnumC620210OUh(String str, int i, int i2) {
        this.LL = i2;
    }
}
