package X;

/* JADX INFO: renamed from: X.0jHz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1275210jHz {
    NONE("none"),
    SERVER_MIX("server"),
    CLIENT_MIX("client"),
    RTC_CLIENT_MIX("rtc_client");

    public final String LL;

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }

    public static EnumC1275210jHz valueOf(String str) {
        return (EnumC1275210jHz) C08FF.LIZ(EnumC1275210jHz.class, str);
    }

    EnumC1275210jHz(String str) {
        this.LL = str;
    }
}
