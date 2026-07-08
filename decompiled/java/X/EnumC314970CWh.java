package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CWh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC314970CWh {
    public static final EnumC314970CWh FAIL;
    public static final /* synthetic */ EnumC314970CWh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC314970CWh NLE_FINISH;
    public static final EnumC314970CWh REQUEST_FINISH;
    public static final EnumC314970CWh RESOURCE_FINISH;
    public static final EnumC314970CWh START;
    public final int LL;

    public static InterfaceC2044707zh<EnumC314970CWh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC314970CWh enumC314970CWh = new EnumC314970CWh("FAIL", 0, -1);
        FAIL = enumC314970CWh;
        EnumC314970CWh enumC314970CWh2 = new EnumC314970CWh("START", 1, 0);
        START = enumC314970CWh2;
        EnumC314970CWh enumC314970CWh3 = new EnumC314970CWh("REQUEST_FINISH", 2, 56);
        REQUEST_FINISH = enumC314970CWh3;
        EnumC314970CWh enumC314970CWh4 = new EnumC314970CWh("RESOURCE_FINISH", 3, 87);
        RESOURCE_FINISH = enumC314970CWh4;
        EnumC314970CWh enumC314970CWh5 = new EnumC314970CWh("NLE_FINISH", 4, 100);
        NLE_FINISH = enumC314970CWh5;
        EnumC314970CWh[] enumC314970CWhArr = {enumC314970CWh, enumC314970CWh2, enumC314970CWh3, enumC314970CWh4, enumC314970CWh5};
        LLILLJJLI = enumC314970CWhArr;
        LLILLL = new C2254308sP(enumC314970CWhArr);
    }

    public static EnumC314970CWh[] values() {
        return (EnumC314970CWh[]) LLILLJJLI.clone();
    }

    public final int getProgress() {
        return this.LL;
    }

    public static EnumC314970CWh valueOf(String str) {
        return (EnumC314970CWh) C08FF.LIZ(EnumC314970CWh.class, str);
    }

    public EnumC314970CWh(String str, int i, int i2) {
        this.LL = i2;
    }
}
