package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1801380wye {
    public static final EnumC1801380wye CANCEL;
    public static final EnumC1801380wye INTERRUPT;
    public static final /* synthetic */ EnumC1801380wye[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1801380wye NETWORK_ERROR;
    public static final EnumC1801380wye NORMAL;
    public static final EnumC1801380wye PAUSE;
    public static final EnumC1801380wye TOO_SHORT;
    public static final EnumC1801380wye UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1801380wye> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1801380wye enumC1801380wye = new EnumC1801380wye("NORMAL", 0, "normal");
        NORMAL = enumC1801380wye;
        EnumC1801380wye enumC1801380wye2 = new EnumC1801380wye("UNKNOWN", 1, "unknown");
        UNKNOWN = enumC1801380wye2;
        EnumC1801380wye enumC1801380wye3 = new EnumC1801380wye("CANCEL", 2, "cancel");
        CANCEL = enumC1801380wye3;
        EnumC1801380wye enumC1801380wye4 = new EnumC1801380wye("TOO_SHORT", 3, "too_short");
        TOO_SHORT = enumC1801380wye4;
        EnumC1801380wye enumC1801380wye5 = new EnumC1801380wye("PAUSE", 4, "pause");
        PAUSE = enumC1801380wye5;
        EnumC1801380wye enumC1801380wye6 = new EnumC1801380wye("INTERRUPT", 5, "interrupt");
        INTERRUPT = enumC1801380wye6;
        EnumC1801380wye enumC1801380wye7 = new EnumC1801380wye("NETWORK_ERROR", 6, "network_error");
        NETWORK_ERROR = enumC1801380wye7;
        EnumC1801380wye[] enumC1801380wyeArr = {enumC1801380wye, enumC1801380wye2, enumC1801380wye3, enumC1801380wye4, enumC1801380wye5, enumC1801380wye6, enumC1801380wye7};
        LLILLJJLI = enumC1801380wyeArr;
        LLILLL = new C2254308sP(enumC1801380wyeArr);
    }

    public static EnumC1801380wye[] values() {
        return (EnumC1801380wye[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1801380wye valueOf(String str) {
        return (EnumC1801380wye) C08FF.LIZ(EnumC1801380wye.class, str);
    }

    public EnumC1801380wye(String str, int i, String str2) {
        this.LL = str2;
    }
}
