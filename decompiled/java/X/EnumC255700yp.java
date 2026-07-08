package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00yp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC255700yp {
    public static final EnumC255700yp IS_FAKE_LANDSCAPE;
    public static final EnumC255700yp IS_LANDSCAPE;
    public static final EnumC255700yp IS_NOT_LANDSCAPE;
    public static final /* synthetic */ EnumC255700yp[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC255700yp> getEntries() {
        return LLILLL;
    }

    static {
        EnumC255700yp enumC255700yp = new EnumC255700yp("IS_NOT_LANDSCAPE", 0, 0);
        IS_NOT_LANDSCAPE = enumC255700yp;
        EnumC255700yp enumC255700yp2 = new EnumC255700yp("IS_LANDSCAPE", 1, 1);
        IS_LANDSCAPE = enumC255700yp2;
        EnumC255700yp enumC255700yp3 = new EnumC255700yp("IS_FAKE_LANDSCAPE", 2, 2);
        IS_FAKE_LANDSCAPE = enumC255700yp3;
        EnumC255700yp[] enumC255700ypArr = {enumC255700yp, enumC255700yp2, enumC255700yp3};
        LLILLJJLI = enumC255700ypArr;
        LLILLL = new C2254308sP(enumC255700ypArr);
    }

    public static EnumC255700yp[] values() {
        return (EnumC255700yp[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC255700yp valueOf(String str) {
        return (EnumC255700yp) C08FF.LIZ(EnumC255700yp.class, str);
    }

    public EnumC255700yp(String str, int i, int i2) {
        this.LL = i2;
    }
}
