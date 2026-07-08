package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lPr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1356970lPr {
    public static final EnumC1356970lPr BULLET;
    public static final /* synthetic */ EnumC1356970lPr[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1356970lPr NORMAL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1356970lPr> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1356970lPr enumC1356970lPr = new EnumC1356970lPr("NORMAL", 0, 0);
        NORMAL = enumC1356970lPr;
        EnumC1356970lPr enumC1356970lPr2 = new EnumC1356970lPr("BULLET", 1, 1);
        BULLET = enumC1356970lPr2;
        EnumC1356970lPr[] enumC1356970lPrArr = {enumC1356970lPr, enumC1356970lPr2};
        LLILLJJLI = enumC1356970lPrArr;
        LLILLL = new C2254308sP(enumC1356970lPrArr);
    }

    public static EnumC1356970lPr[] values() {
        return (EnumC1356970lPr[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1356970lPr valueOf(String str) {
        return (EnumC1356970lPr) C08FF.LIZ(EnumC1356970lPr.class, str);
    }

    public EnumC1356970lPr(String str, int i, int i2) {
        this.LL = i2;
    }
}
