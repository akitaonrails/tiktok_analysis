package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bxC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993240bxC {
    public static final C993250bxD Companion;
    public static final /* synthetic */ EnumC993240bxC[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC993240bxC NONE;
    public static final EnumC993240bxC NON_REAL_TIME_TRACKING_TYPE_FUSION;
    public static final EnumC993240bxC REAL_TIME_TRACKING_TYPE_FUSION;
    public final String LL;

    public static InterfaceC2044707zh<EnumC993240bxC> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0bxD] */
    static {
        EnumC993240bxC enumC993240bxC = new EnumC993240bxC("NONE", 0, "");
        NONE = enumC993240bxC;
        EnumC993240bxC enumC993240bxC2 = new EnumC993240bxC("REAL_TIME_TRACKING_TYPE_FUSION", 1, "real_time");
        REAL_TIME_TRACKING_TYPE_FUSION = enumC993240bxC2;
        EnumC993240bxC enumC993240bxC3 = new EnumC993240bxC("NON_REAL_TIME_TRACKING_TYPE_FUSION", 2, "non_real_time");
        NON_REAL_TIME_TRACKING_TYPE_FUSION = enumC993240bxC3;
        EnumC993240bxC[] enumC993240bxCArr = {enumC993240bxC, enumC993240bxC2, enumC993240bxC3};
        LLILLJJLI = enumC993240bxCArr;
        LLILLL = new C2254308sP(enumC993240bxCArr);
        Companion = new Object() { // from class: X.0bxD
        };
    }

    public static EnumC993240bxC[] values() {
        return (EnumC993240bxC[]) LLILLJJLI.clone();
    }

    public final String getTypeName() {
        return this.LL;
    }

    public static EnumC993240bxC valueOf(String str) {
        return (EnumC993240bxC) C08FF.LIZ(EnumC993240bxC.class, str);
    }

    public EnumC993240bxC(String str, int i, String str2) {
        this.LL = str2;
    }
}
