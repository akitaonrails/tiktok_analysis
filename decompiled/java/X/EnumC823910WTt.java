package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0WTt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC823910WTt {
    public static final EnumC823910WTt APPLOG;
    public static final EnumC823910WTt COMMON;
    public static final EnumC823910WTt EVENT;
    public static final EnumC823910WTt JSB;
    public static final /* synthetic */ EnumC823910WTt[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC823910WTt MESSAGE;
    public static final EnumC823910WTt MONITOR;
    public static final EnumC823910WTt NETWORK;
    public static final EnumC823910WTt SCHEMA;
    public final String LL;

    public static InterfaceC2044707zh<EnumC823910WTt> getEntries() {
        return LLILLL;
    }

    static {
        EnumC823910WTt enumC823910WTt = new EnumC823910WTt("COMMON", 0, "Common");
        COMMON = enumC823910WTt;
        EnumC823910WTt enumC823910WTt2 = new EnumC823910WTt("JSB", 1, "JSB");
        JSB = enumC823910WTt2;
        EnumC823910WTt enumC823910WTt3 = new EnumC823910WTt("MESSAGE", 2, "LiveMessage");
        MESSAGE = enumC823910WTt3;
        EnumC823910WTt enumC823910WTt4 = new EnumC823910WTt("NETWORK", 3, "Network");
        NETWORK = enumC823910WTt4;
        EnumC823910WTt enumC823910WTt5 = new EnumC823910WTt("SCHEMA", 4, "Schema");
        SCHEMA = enumC823910WTt5;
        EnumC823910WTt enumC823910WTt6 = new EnumC823910WTt("EVENT", 5, "event");
        EVENT = enumC823910WTt6;
        EnumC823910WTt enumC823910WTt7 = new EnumC823910WTt("APPLOG", 6, "applog");
        APPLOG = enumC823910WTt7;
        EnumC823910WTt enumC823910WTt8 = new EnumC823910WTt("MONITOR", 7, "monitor");
        MONITOR = enumC823910WTt8;
        EnumC823910WTt[] enumC823910WTtArr = {enumC823910WTt, enumC823910WTt2, enumC823910WTt3, enumC823910WTt4, enumC823910WTt5, enumC823910WTt6, enumC823910WTt7, enumC823910WTt8};
        LLILLJJLI = enumC823910WTtArr;
        LLILLL = new C2254308sP(enumC823910WTtArr);
    }

    public static EnumC823910WTt[] values() {
        return (EnumC823910WTt[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC823910WTt valueOf(String str) {
        return (EnumC823910WTt) C08FF.LIZ(EnumC823910WTt.class, str);
    }

    public EnumC823910WTt(String str, int i, String str2) {
        this.LL = str2;
    }
}
