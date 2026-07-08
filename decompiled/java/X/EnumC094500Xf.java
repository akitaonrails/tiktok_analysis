package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Xf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC094500Xf {
    public static final EnumC094500Xf DESTRUCTIVE;
    public static final /* synthetic */ EnumC094500Xf[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC094500Xf PRIMARY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC094500Xf> getEntries() {
        return LLILLL;
    }

    static {
        EnumC094500Xf enumC094500Xf = new EnumC094500Xf("PRIMARY", 0, 0);
        PRIMARY = enumC094500Xf;
        EnumC094500Xf enumC094500Xf2 = new EnumC094500Xf("DESTRUCTIVE", 1, 1);
        DESTRUCTIVE = enumC094500Xf2;
        EnumC094500Xf[] enumC094500XfArr = {enumC094500Xf, enumC094500Xf2};
        LLILLJJLI = enumC094500XfArr;
        LLILLL = new C2254308sP(enumC094500XfArr);
    }

    public static EnumC094500Xf[] values() {
        return (EnumC094500Xf[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC094500Xf valueOf(String str) {
        return (EnumC094500Xf) C08FF.LIZ(EnumC094500Xf.class, str);
    }

    public EnumC094500Xf(String str, int i, int i2) {
        this.LL = i2;
    }
}
