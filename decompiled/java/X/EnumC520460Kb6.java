package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Kb6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC520460Kb6 {
    public static final EnumC520460Kb6 CANCEL;
    public static final EnumC520460Kb6 INTERRUPT;
    public static final /* synthetic */ EnumC520460Kb6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC520460Kb6 NETWORK_ERROR;
    public static final EnumC520460Kb6 NORMAL;
    public static final EnumC520460Kb6 PAUSE;
    public static final EnumC520460Kb6 TOO_SHORT;
    public static final EnumC520460Kb6 UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC520460Kb6> getEntries() {
        return LLILLL;
    }

    static {
        EnumC520460Kb6 enumC520460Kb6 = new EnumC520460Kb6("NORMAL", 0, "normal");
        NORMAL = enumC520460Kb6;
        EnumC520460Kb6 enumC520460Kb62 = new EnumC520460Kb6("UNKNOWN", 1, "unknown");
        UNKNOWN = enumC520460Kb62;
        EnumC520460Kb6 enumC520460Kb63 = new EnumC520460Kb6("CANCEL", 2, "cancel");
        CANCEL = enumC520460Kb63;
        EnumC520460Kb6 enumC520460Kb64 = new EnumC520460Kb6("TOO_SHORT", 3, "too_short");
        TOO_SHORT = enumC520460Kb64;
        EnumC520460Kb6 enumC520460Kb65 = new EnumC520460Kb6("PAUSE", 4, "pause");
        PAUSE = enumC520460Kb65;
        EnumC520460Kb6 enumC520460Kb66 = new EnumC520460Kb6("INTERRUPT", 5, "interrupt");
        INTERRUPT = enumC520460Kb66;
        EnumC520460Kb6 enumC520460Kb67 = new EnumC520460Kb6("NETWORK_ERROR", 6, "network_error");
        NETWORK_ERROR = enumC520460Kb67;
        EnumC520460Kb6[] enumC520460Kb6Arr = {enumC520460Kb6, enumC520460Kb62, enumC520460Kb63, enumC520460Kb64, enumC520460Kb65, enumC520460Kb66, enumC520460Kb67};
        LLILLJJLI = enumC520460Kb6Arr;
        LLILLL = new C2254308sP(enumC520460Kb6Arr);
    }

    public static EnumC520460Kb6[] values() {
        return (EnumC520460Kb6[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC520460Kb6 valueOf(String str) {
        return (EnumC520460Kb6) C08FF.LIZ(EnumC520460Kb6.class, str);
    }

    public EnumC520460Kb6(String str, int i, String str2) {
        this.LL = str2;
    }
}
