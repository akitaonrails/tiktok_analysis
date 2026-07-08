package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZWs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC901120ZWs {
    public static final EnumC901120ZWs ACCEPT;
    public static final /* synthetic */ EnumC901120ZWs[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC901120ZWs SETTINGS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC901120ZWs> getEntries() {
        return LLILLL;
    }

    static {
        EnumC901120ZWs enumC901120ZWs = new EnumC901120ZWs("ACCEPT", 0, "accept");
        ACCEPT = enumC901120ZWs;
        EnumC901120ZWs enumC901120ZWs2 = new EnumC901120ZWs("SETTINGS", 1, "more_settings");
        SETTINGS = enumC901120ZWs2;
        EnumC901120ZWs[] enumC901120ZWsArr = {enumC901120ZWs, enumC901120ZWs2};
        LLILLJJLI = enumC901120ZWsArr;
        LLILLL = new C2254308sP(enumC901120ZWsArr);
    }

    public static EnumC901120ZWs[] values() {
        return (EnumC901120ZWs[]) LLILLJJLI.clone();
    }

    public final String getReportName() {
        return this.LL;
    }

    public static EnumC901120ZWs valueOf(String str) {
        return (EnumC901120ZWs) C08FF.LIZ(EnumC901120ZWs.class, str);
    }

    public EnumC901120ZWs(String str, int i, String str2) {
        this.LL = str2;
    }
}
