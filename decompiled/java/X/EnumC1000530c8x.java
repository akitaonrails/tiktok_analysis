package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c8x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1000530c8x implements InterfaceC593520NPq<String> {
    public static final EnumC1000530c8x COMMENT_BLOCK;
    public static final EnumC1000530c8x DATA_LOAD_FAIL;
    public static final /* synthetic */ EnumC1000530c8x[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1000530c8x LOAD_TIME_OUT;
    public static final EnumC1000530c8x SHARE_BLOCK;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1000530c8x> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1000530c8x enumC1000530c8x = new EnumC1000530c8x("DATA_LOAD_FAIL", 0, "data_load_fail");
        DATA_LOAD_FAIL = enumC1000530c8x;
        EnumC1000530c8x enumC1000530c8x2 = new EnumC1000530c8x("LOAD_TIME_OUT", 1, "load_timeout");
        LOAD_TIME_OUT = enumC1000530c8x2;
        EnumC1000530c8x enumC1000530c8x3 = new EnumC1000530c8x("COMMENT_BLOCK", 2, "comment_block");
        COMMENT_BLOCK = enumC1000530c8x3;
        EnumC1000530c8x enumC1000530c8x4 = new EnumC1000530c8x("SHARE_BLOCK", 3, "share_block");
        SHARE_BLOCK = enumC1000530c8x4;
        EnumC1000530c8x[] enumC1000530c8xArr = {enumC1000530c8x, enumC1000530c8x2, enumC1000530c8x3, enumC1000530c8x4};
        LLILLJJLI = enumC1000530c8xArr;
        LLILLL = new C2254308sP(enumC1000530c8xArr);
    }

    public static EnumC1000530c8x[] values() {
        return (EnumC1000530c8x[]) LLILLJJLI.clone();
    }

    @Override // X.InterfaceC593520NPq
    public String getParamValue() {
        return this.LL;
    }

    public static EnumC1000530c8x valueOf(String str) {
        return (EnumC1000530c8x) C08FF.LIZ(EnumC1000530c8x.class, str);
    }

    public EnumC1000530c8x(String str, int i, String str2) {
        this.LL = str2;
    }
}
