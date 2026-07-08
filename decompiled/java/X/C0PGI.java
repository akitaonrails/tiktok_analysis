package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PGI, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PGI {
    public static final C0PGI BEFORE_REQUEST_WORDS;
    public static final C0PGI CHUNK_HAS_ECOM_INTENT;
    public static final C0PGI FETCH;
    public static final /* synthetic */ C0PGI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0PGI> getEntries() {
        return LLILLL;
    }

    static {
        C0PGI c0pgi = new C0PGI("FETCH", 0, "fetch");
        FETCH = c0pgi;
        C0PGI c0pgi2 = new C0PGI("BEFORE_REQUEST_WORDS", 1, "before_request_in_ecom_words");
        BEFORE_REQUEST_WORDS = c0pgi2;
        C0PGI c0pgi3 = new C0PGI("CHUNK_HAS_ECOM_INTENT", 2, "first_chunk_has_ecom_intent");
        CHUNK_HAS_ECOM_INTENT = c0pgi3;
        C0PGI[] c0pgiArr = {c0pgi, c0pgi2, c0pgi3};
        LLILLJJLI = c0pgiArr;
        LLILLL = new C2254308sP(c0pgiArr);
    }

    public static C0PGI[] values() {
        return (C0PGI[]) LLILLJJLI.clone();
    }

    public final String getSceneName() {
        return this.LL;
    }

    public static C0PGI valueOf(String str) {
        return (C0PGI) C08FF.LIZ(C0PGI.class, str);
    }

    public C0PGI(String str, int i, String str2) {
        this.LL = str2;
    }
}
