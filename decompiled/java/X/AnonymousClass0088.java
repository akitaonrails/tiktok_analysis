package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0088, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0088 {
    public static final AnonymousClass0088 LEADS_OPT_IN;
    public static final /* synthetic */ AnonymousClass0088[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final AnonymousClass0088 SERVICEPLUS_JOIN;
    public static final AnonymousClass0088 SERVICEPLUS_SUBMIT;
    public static final AnonymousClass0088 SUBSCRIPTION_JOIN;
    public static final AnonymousClass0088 SUBSCRIPTION_SUBSCRIBE;

    public static InterfaceC2044707zh<AnonymousClass0088> getEntries() {
        return LLILLJJLI;
    }

    static {
        AnonymousClass0088 anonymousClass0088 = new AnonymousClass0088("LEADS_OPT_IN", 0);
        LEADS_OPT_IN = anonymousClass0088;
        AnonymousClass0088 anonymousClass00882 = new AnonymousClass0088("SUBSCRIPTION_JOIN", 1);
        SUBSCRIPTION_JOIN = anonymousClass00882;
        AnonymousClass0088 anonymousClass00883 = new AnonymousClass0088("SUBSCRIPTION_SUBSCRIBE", 2);
        SUBSCRIPTION_SUBSCRIBE = anonymousClass00883;
        AnonymousClass0088 anonymousClass00884 = new AnonymousClass0088("SERVICEPLUS_JOIN", 3);
        SERVICEPLUS_JOIN = anonymousClass00884;
        AnonymousClass0088 anonymousClass00885 = new AnonymousClass0088("SERVICEPLUS_SUBMIT", 4);
        SERVICEPLUS_SUBMIT = anonymousClass00885;
        AnonymousClass0088[] anonymousClass0088Arr = {anonymousClass0088, anonymousClass00882, anonymousClass00883, anonymousClass00884, anonymousClass00885};
        LL = anonymousClass0088Arr;
        LLILLJJLI = new C2254308sP(anonymousClass0088Arr);
    }

    public static AnonymousClass0088[] values() {
        return (AnonymousClass0088[]) LL.clone();
    }

    public static AnonymousClass0088 valueOf(String str) {
        return (AnonymousClass0088) C08FF.LIZ(AnonymousClass0088.class, str);
    }

    public AnonymousClass0088(String str, int i) {
    }
}
