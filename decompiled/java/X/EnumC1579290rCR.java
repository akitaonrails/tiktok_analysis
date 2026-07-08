package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rCR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1579290rCR {
    public static final EnumC1579290rCR ERROR;
    public static final /* synthetic */ EnumC1579290rCR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1579290rCR NO_CONTENT;
    public static final EnumC1579290rCR NO_MORE_POST;
    public static final EnumC1579290rCR NO_NETWORK;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1579290rCR> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1579290rCR enumC1579290rCR = new EnumC1579290rCR("NO_CONTENT", 0, "no_content");
        NO_CONTENT = enumC1579290rCR;
        EnumC1579290rCR enumC1579290rCR2 = new EnumC1579290rCR("NO_MORE_POST", 1, "no_more_post");
        NO_MORE_POST = enumC1579290rCR2;
        EnumC1579290rCR enumC1579290rCR3 = new EnumC1579290rCR("ERROR", 2, "error");
        ERROR = enumC1579290rCR3;
        EnumC1579290rCR enumC1579290rCR4 = new EnumC1579290rCR("NO_NETWORK", 3, "no_network");
        NO_NETWORK = enumC1579290rCR4;
        EnumC1579290rCR[] enumC1579290rCRArr = {enumC1579290rCR, enumC1579290rCR2, enumC1579290rCR3, enumC1579290rCR4};
        LLILLJJLI = enumC1579290rCRArr;
        LLILLL = new C2254308sP(enumC1579290rCRArr);
    }

    public static EnumC1579290rCR[] values() {
        return (EnumC1579290rCR[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1579290rCR valueOf(String str) {
        return (EnumC1579290rCR) C08FF.LIZ(EnumC1579290rCR.class, str);
    }

    public EnumC1579290rCR(String str, int i, String str2) {
        this.LL = str2;
    }
}
