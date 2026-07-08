package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wPr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779810wPr {
    public static final EnumC1779810wPr EXPIRED;
    public static final /* synthetic */ EnumC1779810wPr[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1779810wPr NOT_EXIST;
    public static final EnumC1779810wPr PENDING;
    public static final EnumC1779810wPr SUCCEEDED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1779810wPr> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1779810wPr enumC1779810wPr = new EnumC1779810wPr("SUCCEEDED", 0, 1);
        SUCCEEDED = enumC1779810wPr;
        EnumC1779810wPr enumC1779810wPr2 = new EnumC1779810wPr("PENDING", 1, 2);
        PENDING = enumC1779810wPr2;
        EnumC1779810wPr enumC1779810wPr3 = new EnumC1779810wPr("EXPIRED", 2, 3);
        EXPIRED = enumC1779810wPr3;
        EnumC1779810wPr enumC1779810wPr4 = new EnumC1779810wPr("NOT_EXIST", 3, 4);
        NOT_EXIST = enumC1779810wPr4;
        EnumC1779810wPr[] enumC1779810wPrArr = {enumC1779810wPr, enumC1779810wPr2, enumC1779810wPr3, enumC1779810wPr4};
        LLILLJJLI = enumC1779810wPrArr;
        LLILLL = new C2254308sP(enumC1779810wPrArr);
    }

    public static EnumC1779810wPr[] values() {
        return (EnumC1779810wPr[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1779810wPr valueOf(String str) {
        return (EnumC1779810wPr) C08FF.LIZ(EnumC1779810wPr.class, str);
    }

    public EnumC1779810wPr(String str, int i, int i2) {
        this.LL = i2;
    }
}
