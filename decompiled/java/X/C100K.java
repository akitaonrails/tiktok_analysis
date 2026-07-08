package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.100K, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C100K {
    public static final C100R Companion;
    public static final C100K DID;
    public static final /* synthetic */ C100K[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C100K UID;
    public final String LL;

    public static InterfaceC2044707zh<C100K> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.100R] */
    static {
        C100K c100k = new C100K("UID", 0, "uid");
        UID = c100k;
        C100K c100k2 = new C100K("DID", 1, "did");
        DID = c100k2;
        C100K[] c100kArr = {c100k, c100k2};
        LLILLJJLI = c100kArr;
        LLILLL = new C2254308sP(c100kArr);
        Companion = new Object() { // from class: X.100R
        };
    }

    public static C100K[] values() {
        return (C100K[]) LLILLJJLI.clone();
    }

    public final String getRaw() {
        return this.LL;
    }

    public static C100K valueOf(String str) {
        return (C100K) C08FF.LIZ(C100K.class, str);
    }

    public C100K(String str, int i, String str2) {
        this.LL = str2;
    }
}
