package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0h8r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1192670h8r {
    public static final EnumC1192670h8r CANCEL;
    public static final EnumC1192670h8r COMPLETE;
    public static final EnumC1192670h8r FAIL;
    public static final /* synthetic */ EnumC1192670h8r[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1192670h8r PAYMENT_CODE;
    public static final EnumC1192670h8r SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1192670h8r> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1192670h8r enumC1192670h8r = new EnumC1192670h8r("SUCCESS", 0, 0);
        SUCCESS = enumC1192670h8r;
        EnumC1192670h8r enumC1192670h8r2 = new EnumC1192670h8r("FAIL", 1, 1);
        FAIL = enumC1192670h8r2;
        EnumC1192670h8r enumC1192670h8r3 = new EnumC1192670h8r("CANCEL", 2, 2);
        CANCEL = enumC1192670h8r3;
        EnumC1192670h8r enumC1192670h8r4 = new EnumC1192670h8r("COMPLETE", 3, 3);
        COMPLETE = enumC1192670h8r4;
        EnumC1192670h8r enumC1192670h8r5 = new EnumC1192670h8r("PAYMENT_CODE", 4, 4);
        PAYMENT_CODE = enumC1192670h8r5;
        EnumC1192670h8r[] enumC1192670h8rArr = {enumC1192670h8r, enumC1192670h8r2, enumC1192670h8r3, enumC1192670h8r4, enumC1192670h8r5};
        LLILLJJLI = enumC1192670h8rArr;
        LLILLL = new C2254308sP(enumC1192670h8rArr);
    }

    public static EnumC1192670h8r[] values() {
        return (EnumC1192670h8r[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1192670h8r valueOf(String str) {
        return (EnumC1192670h8r) C08FF.LIZ(EnumC1192670h8r.class, str);
    }

    public EnumC1192670h8r(String str, int i, int i2) {
        this.LL = i2;
    }
}
