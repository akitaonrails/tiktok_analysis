package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ieR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1250690ieR {
    public static final EnumC1250690ieR FAILED;
    public static final /* synthetic */ EnumC1250690ieR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1250690ieR START_REQUEST;
    public static final EnumC1250690ieR SUCCESS;
    public static final EnumC1250690ieR UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1250690ieR> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1250690ieR enumC1250690ieR = new EnumC1250690ieR("UNKNOWN", 0, "unknown");
        UNKNOWN = enumC1250690ieR;
        EnumC1250690ieR enumC1250690ieR2 = new EnumC1250690ieR("START_REQUEST", 1, "start_request");
        START_REQUEST = enumC1250690ieR2;
        EnumC1250690ieR enumC1250690ieR3 = new EnumC1250690ieR("SUCCESS", 2, "success");
        SUCCESS = enumC1250690ieR3;
        EnumC1250690ieR enumC1250690ieR4 = new EnumC1250690ieR("FAILED", 3, "failed");
        FAILED = enumC1250690ieR4;
        EnumC1250690ieR[] enumC1250690ieRArr = {enumC1250690ieR, enumC1250690ieR2, enumC1250690ieR3, enumC1250690ieR4};
        LLILLJJLI = enumC1250690ieRArr;
        LLILLL = new C2254308sP(enumC1250690ieRArr);
    }

    public static EnumC1250690ieR[] values() {
        return (EnumC1250690ieR[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1250690ieR valueOf(String str) {
        return (EnumC1250690ieR) C08FF.LIZ(EnumC1250690ieR.class, str);
    }

    public EnumC1250690ieR(String str, int i, String str2) {
        this.LL = str2;
    }
}
