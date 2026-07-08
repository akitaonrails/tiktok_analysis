package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0grH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1181770grH {
    public static final /* synthetic */ EnumC1181770grH[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1181770grH LOAD_COMPONENT_TIME_OUT;
    public static final EnumC1181770grH LOAD_FAILURE;
    public static final EnumC1181770grH LOAD_SERIAL_LOAD_TIME_OUT;
    public static final EnumC1181770grH LOAD_SUCCESS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1181770grH> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1181770grH enumC1181770grH = new EnumC1181770grH("LOAD_SUCCESS", 0, "load_success");
        LOAD_SUCCESS = enumC1181770grH;
        EnumC1181770grH enumC1181770grH2 = new EnumC1181770grH("LOAD_FAILURE", 1, "load_failure");
        LOAD_FAILURE = enumC1181770grH2;
        EnumC1181770grH enumC1181770grH3 = new EnumC1181770grH("LOAD_COMPONENT_TIME_OUT", 2, "load_component_time_out");
        LOAD_COMPONENT_TIME_OUT = enumC1181770grH3;
        EnumC1181770grH enumC1181770grH4 = new EnumC1181770grH("LOAD_SERIAL_LOAD_TIME_OUT", 3, "load_serial_load_time_out");
        LOAD_SERIAL_LOAD_TIME_OUT = enumC1181770grH4;
        EnumC1181770grH[] enumC1181770grHArr = {enumC1181770grH, enumC1181770grH2, enumC1181770grH3, enumC1181770grH4};
        LLILLJJLI = enumC1181770grHArr;
        LLILLL = new C2254308sP(enumC1181770grHArr);
    }

    public static EnumC1181770grH[] values() {
        return (EnumC1181770grH[]) LLILLJJLI.clone();
    }

    public final String getReason() {
        return this.LL;
    }

    public static EnumC1181770grH valueOf(String str) {
        return (EnumC1181770grH) C08FF.LIZ(EnumC1181770grH.class, str);
    }

    public EnumC1181770grH(String str, int i, String str2) {
        this.LL = str2;
    }
}
