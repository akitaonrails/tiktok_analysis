package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03tn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC988903tn {
    public static final EnumC988903tn DO_NOT_OPEN;
    public static final EnumC988903tn FULL_PAGE;
    public static final /* synthetic */ EnumC988903tn[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC988903tn SEVEN_SPLIT_PAGE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC988903tn> getEntries() {
        return LLILLL;
    }

    static {
        EnumC988903tn enumC988903tn = new EnumC988903tn("DO_NOT_OPEN", 0, 0);
        DO_NOT_OPEN = enumC988903tn;
        EnumC988903tn enumC988903tn2 = new EnumC988903tn("FULL_PAGE", 1, 1);
        FULL_PAGE = enumC988903tn2;
        EnumC988903tn enumC988903tn3 = new EnumC988903tn("SEVEN_SPLIT_PAGE", 2, 2);
        SEVEN_SPLIT_PAGE = enumC988903tn3;
        EnumC988903tn[] enumC988903tnArr = {enumC988903tn, enumC988903tn2, enumC988903tn3};
        LLILLJJLI = enumC988903tnArr;
        LLILLL = new C2254308sP(enumC988903tnArr);
    }

    public static EnumC988903tn[] values() {
        return (EnumC988903tn[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC988903tn valueOf(String str) {
        return (EnumC988903tn) C08FF.LIZ(EnumC988903tn.class, str);
    }

    public EnumC988903tn(String str, int i, int i2) {
        this.LL = i2;
    }
}
