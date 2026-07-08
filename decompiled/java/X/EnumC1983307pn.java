package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07pn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1983307pn {
    public static final /* synthetic */ EnumC1983307pn[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1983307pn NONE;
    public static final EnumC1983307pn PLUS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1983307pn> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1983307pn enumC1983307pn = new EnumC1983307pn("NONE", 0, 0);
        NONE = enumC1983307pn;
        EnumC1983307pn enumC1983307pn2 = new EnumC1983307pn("PLUS", 1, 1);
        PLUS = enumC1983307pn2;
        EnumC1983307pn[] enumC1983307pnArr = {enumC1983307pn, enumC1983307pn2};
        LLILLJJLI = enumC1983307pnArr;
        LLILLL = new C2254308sP(enumC1983307pnArr);
    }

    public static EnumC1983307pn[] values() {
        return (EnumC1983307pn[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1983307pn valueOf(String str) {
        return (EnumC1983307pn) C08FF.LIZ(EnumC1983307pn.class, str);
    }

    public EnumC1983307pn(String str, int i, int i2) {
        this.LL = i2;
    }
}
