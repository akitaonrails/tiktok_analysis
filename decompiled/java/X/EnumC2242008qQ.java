package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08qQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2242008qQ {
    public static final EnumC2242008qQ EXCHANGE_SESSION;
    public static final /* synthetic */ EnumC2242008qQ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2242008qQ PAGE_CLOSED;
    public static final EnumC2242008qQ PAGE_RENDERED;
    public static final EnumC2242008qQ RETENTION_PAGE_CLICK;
    public static final EnumC2242008qQ RETENTION_PAGE_RENDERED;
    public static final EnumC2242008qQ VERIFY_SUCCEEDED_PAGE_CLOSED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2242008qQ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2242008qQ enumC2242008qQ = new EnumC2242008qQ("PAGE_CLOSED", 0, "PAGE_CLOSED");
        PAGE_CLOSED = enumC2242008qQ;
        EnumC2242008qQ enumC2242008qQ2 = new EnumC2242008qQ("PAGE_RENDERED", 1, "PAGE_RENDERED");
        PAGE_RENDERED = enumC2242008qQ2;
        EnumC2242008qQ enumC2242008qQ3 = new EnumC2242008qQ("EXCHANGE_SESSION", 2, "EXCHANGE_SESSION");
        EXCHANGE_SESSION = enumC2242008qQ3;
        EnumC2242008qQ enumC2242008qQ4 = new EnumC2242008qQ("VERIFY_SUCCEEDED_PAGE_CLOSED", 3, "VERIFY_SUCCEEDED_PAGE_CLOSED");
        VERIFY_SUCCEEDED_PAGE_CLOSED = enumC2242008qQ4;
        EnumC2242008qQ enumC2242008qQ5 = new EnumC2242008qQ("RETENTION_PAGE_RENDERED", 4, "RETENTION_PAGE_RENDERED");
        RETENTION_PAGE_RENDERED = enumC2242008qQ5;
        EnumC2242008qQ enumC2242008qQ6 = new EnumC2242008qQ("RETENTION_PAGE_CLICK", 5, "RETENTION_PAGE_CLICK");
        RETENTION_PAGE_CLICK = enumC2242008qQ6;
        EnumC2242008qQ[] enumC2242008qQArr = {enumC2242008qQ, enumC2242008qQ2, enumC2242008qQ3, enumC2242008qQ4, enumC2242008qQ5, enumC2242008qQ6};
        LLILLJJLI = enumC2242008qQArr;
        LLILLL = new C2254308sP(enumC2242008qQArr);
    }

    public static EnumC2242008qQ[] values() {
        return (EnumC2242008qQ[]) LLILLJJLI.clone();
    }

    public final String getEventName() {
        return this.LL;
    }

    public static EnumC2242008qQ valueOf(String str) {
        return (EnumC2242008qQ) C08FF.LIZ(EnumC2242008qQ.class, str);
    }

    public EnumC2242008qQ(String str, int i, String str2) {
        this.LL = str2;
    }
}
