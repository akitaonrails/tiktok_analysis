package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uYH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1708150uYH {
    public static final EnumC1708150uYH BIND_PI;
    public static final /* synthetic */ EnumC1708150uYH[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1708150uYH OPEN_WEB;
    public static final EnumC1708150uYH PRE_RISK;
    public static final EnumC1708150uYH QUERY_RESULT;
    public static final EnumC1708150uYH STAGE_PRE_CHECK;
    public static final EnumC1708150uYH VERIFY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1708150uYH> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1708150uYH enumC1708150uYH = new EnumC1708150uYH("PRE_RISK", 0, "pre_risk");
        PRE_RISK = enumC1708150uYH;
        EnumC1708150uYH enumC1708150uYH2 = new EnumC1708150uYH("VERIFY", 1, "verify");
        VERIFY = enumC1708150uYH2;
        EnumC1708150uYH enumC1708150uYH3 = new EnumC1708150uYH("STAGE_PRE_CHECK", 2, "pre_check");
        STAGE_PRE_CHECK = enumC1708150uYH3;
        EnumC1708150uYH enumC1708150uYH4 = new EnumC1708150uYH("BIND_PI", 3, "bind_pi");
        BIND_PI = enumC1708150uYH4;
        EnumC1708150uYH enumC1708150uYH5 = new EnumC1708150uYH("QUERY_RESULT", 4, "query_result");
        QUERY_RESULT = enumC1708150uYH5;
        EnumC1708150uYH enumC1708150uYH6 = new EnumC1708150uYH("OPEN_WEB", 5, "open_web");
        OPEN_WEB = enumC1708150uYH6;
        EnumC1708150uYH[] enumC1708150uYHArr = {enumC1708150uYH, enumC1708150uYH2, enumC1708150uYH3, enumC1708150uYH4, enumC1708150uYH5, enumC1708150uYH6};
        LLILLJJLI = enumC1708150uYHArr;
        LLILLL = new C2254308sP(enumC1708150uYHArr);
    }

    public static EnumC1708150uYH[] values() {
        return (EnumC1708150uYH[]) LLILLJJLI.clone();
    }

    public final String getStepName() {
        return this.LL;
    }

    public static EnumC1708150uYH valueOf(String str) {
        return (EnumC1708150uYH) C08FF.LIZ(EnumC1708150uYH.class, str);
    }

    public EnumC1708150uYH(String str, int i, String str2) {
        this.LL = str2;
    }
}
