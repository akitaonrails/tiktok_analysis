package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rFH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1581050rFH {
    public static final /* synthetic */ EnumC1581050rFH[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1581050rFH LOAD_MORE;
    public static final EnumC1581050rFH REFRESH;
    public static final EnumC1581050rFH UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1581050rFH> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1581050rFH enumC1581050rFH = new EnumC1581050rFH("UNKNOWN", 0, 0);
        UNKNOWN = enumC1581050rFH;
        EnumC1581050rFH enumC1581050rFH2 = new EnumC1581050rFH("REFRESH", 1, 2);
        REFRESH = enumC1581050rFH2;
        EnumC1581050rFH enumC1581050rFH3 = new EnumC1581050rFH("LOAD_MORE", 2, 4);
        LOAD_MORE = enumC1581050rFH3;
        EnumC1581050rFH[] enumC1581050rFHArr = {enumC1581050rFH, enumC1581050rFH2, enumC1581050rFH3};
        LLILLJJLI = enumC1581050rFHArr;
        LLILLL = new C2254308sP(enumC1581050rFHArr);
    }

    public static EnumC1581050rFH[] values() {
        return (EnumC1581050rFH[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1581050rFH valueOf(String str) {
        return (EnumC1581050rFH) C08FF.LIZ(EnumC1581050rFH.class, str);
    }

    public EnumC1581050rFH(String str, int i, int i2) {
        this.LL = i2;
    }
}
