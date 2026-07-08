package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cVA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1014300cVA {
    public static final EnumC1014300cVA AUTO_LOAD_IAB;
    public static final EnumC1014300cVA AUTO_REPORT_CLICK;
    public static final EnumC1014300cVA DEALLOC_IAB;
    public static final /* synthetic */ EnumC1014300cVA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1014300cVA PAUSE_VIDEO;
    public static final EnumC1014300cVA REGISTER_SHAKE;
    public static final EnumC1014300cVA RESUME_VIDEO;
    public static final EnumC1014300cVA UNREGISTER_SHAKE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1014300cVA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1014300cVA enumC1014300cVA = new EnumC1014300cVA("REGISTER_SHAKE", 0, "registerShake");
        REGISTER_SHAKE = enumC1014300cVA;
        EnumC1014300cVA enumC1014300cVA2 = new EnumC1014300cVA("UNREGISTER_SHAKE", 1, "unregisterShake");
        UNREGISTER_SHAKE = enumC1014300cVA2;
        EnumC1014300cVA enumC1014300cVA3 = new EnumC1014300cVA("PAUSE_VIDEO", 2, "pauseVideo");
        PAUSE_VIDEO = enumC1014300cVA3;
        EnumC1014300cVA enumC1014300cVA4 = new EnumC1014300cVA("RESUME_VIDEO", 3, "resumeVideo");
        RESUME_VIDEO = enumC1014300cVA4;
        EnumC1014300cVA enumC1014300cVA5 = new EnumC1014300cVA("AUTO_REPORT_CLICK", 4, "autoReportClick");
        AUTO_REPORT_CLICK = enumC1014300cVA5;
        EnumC1014300cVA enumC1014300cVA6 = new EnumC1014300cVA("AUTO_LOAD_IAB", 5, "autoLoadIAB");
        AUTO_LOAD_IAB = enumC1014300cVA6;
        EnumC1014300cVA enumC1014300cVA7 = new EnumC1014300cVA("DEALLOC_IAB", 6, "deallocIAB");
        DEALLOC_IAB = enumC1014300cVA7;
        EnumC1014300cVA[] enumC1014300cVAArr = {enumC1014300cVA, enumC1014300cVA2, enumC1014300cVA3, enumC1014300cVA4, enumC1014300cVA5, enumC1014300cVA6, enumC1014300cVA7};
        LLILLJJLI = enumC1014300cVAArr;
        LLILLL = new C2254308sP(enumC1014300cVAArr);
    }

    public static EnumC1014300cVA[] values() {
        return (EnumC1014300cVA[]) LLILLJJLI.clone();
    }

    public final String getTypeName() {
        return this.LL;
    }

    public static EnumC1014300cVA valueOf(String str) {
        return (EnumC1014300cVA) C08FF.LIZ(EnumC1014300cVA.class, str);
    }

    public EnumC1014300cVA(String str, int i, String str2) {
        this.LL = str2;
    }
}
