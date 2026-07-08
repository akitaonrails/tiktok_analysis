package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aqV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC950650aqV {
    public static final /* synthetic */ EnumC950650aqV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC950650aqV NORMAL;
    public static final EnumC950650aqV OVER_TIME;
    public final String LL;

    public static InterfaceC2044707zh<EnumC950650aqV> getEntries() {
        return LLILLL;
    }

    static {
        EnumC950650aqV enumC950650aqV = new EnumC950650aqV("OVER_TIME", 0, "over_time");
        OVER_TIME = enumC950650aqV;
        EnumC950650aqV enumC950650aqV2 = new EnumC950650aqV("NORMAL", 1, "normal");
        NORMAL = enumC950650aqV2;
        EnumC950650aqV[] enumC950650aqVArr = {enumC950650aqV, enumC950650aqV2};
        LLILLJJLI = enumC950650aqVArr;
        LLILLL = new C2254308sP(enumC950650aqVArr);
    }

    public static EnumC950650aqV[] values() {
        return (EnumC950650aqV[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC950650aqV valueOf(String str) {
        return (EnumC950650aqV) C08FF.LIZ(EnumC950650aqV.class, str);
    }

    public EnumC950650aqV(String str, int i, String str2) {
        this.LL = str2;
    }
}
