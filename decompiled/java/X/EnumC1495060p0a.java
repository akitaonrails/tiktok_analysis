package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0p0a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1495060p0a {
    public static final EnumC1495060p0a ApmNetMonitorOptABIsEnable;
    public static final EnumC1495060p0a ColdBootTasksDegradeExperimentIsZSTDDictUpdateEnable;
    public static final EnumC1495060p0a CronetFallbackBootExperimentIsEnable;
    public static final EnumC1495060p0a InterceptorRefactorExperimentIsUseNewFormat;
    public static final /* synthetic */ EnumC1495060p0a[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1495060p0a NetDispatchExperimentIsEnable;
    public static final EnumC1495060p0a NoNetworkOptExperimentIsOpen;
    public static final EnumC1495060p0a ResponseZeroCopyOptIsEnable;
    public final boolean LL;

    public static InterfaceC2044707zh<EnumC1495060p0a> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1495060p0a enumC1495060p0a = new EnumC1495060p0a("NetDispatchExperimentIsEnable", 0, false);
        NetDispatchExperimentIsEnable = enumC1495060p0a;
        EnumC1495060p0a enumC1495060p0a2 = new EnumC1495060p0a("ResponseZeroCopyOptIsEnable", 1, false);
        ResponseZeroCopyOptIsEnable = enumC1495060p0a2;
        EnumC1495060p0a enumC1495060p0a3 = new EnumC1495060p0a("NoNetworkOptExperimentIsOpen", 2, false);
        NoNetworkOptExperimentIsOpen = enumC1495060p0a3;
        EnumC1495060p0a enumC1495060p0a4 = new EnumC1495060p0a("CronetFallbackBootExperimentIsEnable", 3, false);
        CronetFallbackBootExperimentIsEnable = enumC1495060p0a4;
        EnumC1495060p0a enumC1495060p0a5 = new EnumC1495060p0a("ApmNetMonitorOptABIsEnable", 4, false);
        ApmNetMonitorOptABIsEnable = enumC1495060p0a5;
        EnumC1495060p0a enumC1495060p0a6 = new EnumC1495060p0a("InterceptorRefactorExperimentIsUseNewFormat", 5, true);
        InterceptorRefactorExperimentIsUseNewFormat = enumC1495060p0a6;
        EnumC1495060p0a enumC1495060p0a7 = new EnumC1495060p0a("ColdBootTasksDegradeExperimentIsZSTDDictUpdateEnable", 6, false);
        ColdBootTasksDegradeExperimentIsZSTDDictUpdateEnable = enumC1495060p0a7;
        EnumC1495060p0a[] enumC1495060p0aArr = {enumC1495060p0a, enumC1495060p0a2, enumC1495060p0a3, enumC1495060p0a4, enumC1495060p0a5, enumC1495060p0a6, enumC1495060p0a7};
        LLILLJJLI = enumC1495060p0aArr;
        LLILLL = new C2254308sP(enumC1495060p0aArr);
    }

    public static EnumC1495060p0a[] values() {
        return (EnumC1495060p0a[]) LLILLJJLI.clone();
    }

    public final boolean getDefaultVal() {
        return this.LL;
    }

    public static EnumC1495060p0a valueOf(String str) {
        return (EnumC1495060p0a) C08FF.LIZ(EnumC1495060p0a.class, str);
    }

    public EnumC1495060p0a(String str, int i, boolean z) {
        this.LL = z;
    }
}
