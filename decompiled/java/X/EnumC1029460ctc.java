package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ctc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1029460ctc {
    public static final /* synthetic */ EnumC1029460ctc[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1029460ctc VERSION_1_0;
    public static final EnumC1029460ctc VERSION_2_0;
    public static final EnumC1029460ctc VERSION_3_0;
    public static final EnumC1029460ctc VERSION_4_0;
    public static final EnumC1029460ctc VERSION_5_0;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1029460ctc> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1029460ctc enumC1029460ctc = new EnumC1029460ctc("VERSION_1_0", 0, "1.0");
        VERSION_1_0 = enumC1029460ctc;
        EnumC1029460ctc enumC1029460ctc2 = new EnumC1029460ctc("VERSION_2_0", 1, "2.0");
        VERSION_2_0 = enumC1029460ctc2;
        EnumC1029460ctc enumC1029460ctc3 = new EnumC1029460ctc("VERSION_3_0", 2, "3.0");
        VERSION_3_0 = enumC1029460ctc3;
        EnumC1029460ctc enumC1029460ctc4 = new EnumC1029460ctc("VERSION_4_0", 3, "4.0");
        VERSION_4_0 = enumC1029460ctc4;
        EnumC1029460ctc enumC1029460ctc5 = new EnumC1029460ctc("VERSION_5_0", 4, "5.0");
        VERSION_5_0 = enumC1029460ctc5;
        EnumC1029460ctc[] enumC1029460ctcArr = {enumC1029460ctc, enumC1029460ctc2, enumC1029460ctc3, enumC1029460ctc4, enumC1029460ctc5};
        LLILLJJLI = enumC1029460ctcArr;
        LLILLL = new C2254308sP(enumC1029460ctcArr);
    }

    public static EnumC1029460ctc[] values() {
        return (EnumC1029460ctc[]) LLILLJJLI.clone();
    }

    public final String getDescription() {
        return this.LL;
    }

    public static EnumC1029460ctc valueOf(String str) {
        return (EnumC1029460ctc) C08FF.LIZ(EnumC1029460ctc.class, str);
    }

    public EnumC1029460ctc(String str, int i, String str2) {
        this.LL = str2;
    }
}
