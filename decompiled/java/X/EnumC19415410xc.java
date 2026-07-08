package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10xc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19415410xc {
    public static final EnumC19415410xc FE;
    public static final /* synthetic */ EnumC19415410xc[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19415410xc MOBILE;
    public static final EnumC19415410xc SERVER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC19415410xc> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19415410xc enumC19415410xc = new EnumC19415410xc("MOBILE", 0, "1");
        MOBILE = enumC19415410xc;
        EnumC19415410xc enumC19415410xc2 = new EnumC19415410xc("FE", 1, "2");
        FE = enumC19415410xc2;
        EnumC19415410xc enumC19415410xc3 = new EnumC19415410xc("SERVER", 2, "3");
        SERVER = enumC19415410xc3;
        EnumC19415410xc[] enumC19415410xcArr = {enumC19415410xc, enumC19415410xc2, enumC19415410xc3};
        LLILLJJLI = enumC19415410xcArr;
        LLILLL = new C2254308sP(enumC19415410xcArr);
    }

    public static EnumC19415410xc[] values() {
        return (EnumC19415410xc[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC19415410xc valueOf(String str) {
        return (EnumC19415410xc) C08FF.LIZ(EnumC19415410xc.class, str);
    }

    public EnumC19415410xc(String str, int i, String str2) {
        this.LL = str2;
    }
}
