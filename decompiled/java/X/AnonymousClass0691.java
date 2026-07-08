package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0691, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0691 {
    public static final /* synthetic */ AnonymousClass0691[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final AnonymousClass0691 NOT_CHAT_REQUEST;
    public static final AnonymousClass0691 REQUEST_SENT;
    public static final AnonymousClass0691 START_REQUEST;
    public final String LL;

    public static InterfaceC2044707zh<AnonymousClass0691> getEntries() {
        return LLILLL;
    }

    static {
        AnonymousClass0691 anonymousClass0691 = new AnonymousClass0691("START_REQUEST", 0, "chat_request_start");
        START_REQUEST = anonymousClass0691;
        AnonymousClass0691 anonymousClass06912 = new AnonymousClass0691("REQUEST_SENT", 1, "chat_request_sent");
        REQUEST_SENT = anonymousClass06912;
        AnonymousClass0691 anonymousClass06913 = new AnonymousClass0691("NOT_CHAT_REQUEST", 2, "");
        NOT_CHAT_REQUEST = anonymousClass06913;
        AnonymousClass0691[] anonymousClass0691Arr = {anonymousClass0691, anonymousClass06912, anonymousClass06913};
        LLILLJJLI = anonymousClass0691Arr;
        LLILLL = new C2254308sP(anonymousClass0691Arr);
    }

    public static AnonymousClass0691[] values() {
        return (AnonymousClass0691[]) LLILLJJLI.clone();
    }

    public final String getRepositoryValue() {
        return this.LL;
    }

    public static AnonymousClass0691 valueOf(String str) {
        return (AnonymousClass0691) C08FF.LIZ(AnonymousClass0691.class, str);
    }

    public AnonymousClass0691(String str, int i, String str2) {
        this.LL = str2;
    }
}
