package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07rr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1996107rr {
    public static final /* synthetic */ EnumC1996107rr[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1996107rr UNKNOWN;
    public static final EnumC1996107rr VOUCHER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1996107rr> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1996107rr enumC1996107rr = new EnumC1996107rr("UNKNOWN", 0, 0);
        UNKNOWN = enumC1996107rr;
        EnumC1996107rr enumC1996107rr2 = new EnumC1996107rr("VOUCHER", 1, 1);
        VOUCHER = enumC1996107rr2;
        EnumC1996107rr[] enumC1996107rrArr = {enumC1996107rr, enumC1996107rr2};
        LLILLJJLI = enumC1996107rrArr;
        LLILLL = new C2254308sP(enumC1996107rrArr);
    }

    public static EnumC1996107rr[] values() {
        return (EnumC1996107rr[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1996107rr valueOf(String str) {
        return (EnumC1996107rr) C08FF.LIZ(EnumC1996107rr.class, str);
    }

    public EnumC1996107rr(String str, int i, int i2) {
        this.LL = i2;
    }
}
