package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OKA, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OKA {
    public static final C0OKA CHANGE_COMMENT_STATUS;
    public static final C0OKA DELETED;
    public static final C0OKA FE_DELETE;
    public static final C0OKA FE_SINGLE_UPDATE;
    public static final C0OKA GENERATED;
    public static final /* synthetic */ C0OKA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0OKA LOAD_MORE;
    public static final C0OKA MERGE_REFRESH;
    public static final C0OKA PUBLISH_FAIL;
    public static final C0OKA PUBLISH_SUCCESS;
    public static final C0OKA REFRESH;
    public static final C0OKA RESENT;
    public static final C0OKA RESENT_SUCCESS;
    public static final C0OKA REVOKE;
    public static final C0OKA UPDATE;

    public static InterfaceC2044707zh<C0OKA> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0OKA c0oka = new C0OKA("REFRESH", 0);
        REFRESH = c0oka;
        C0OKA c0oka2 = new C0OKA("LOAD_MORE", 1);
        LOAD_MORE = c0oka2;
        C0OKA c0oka3 = new C0OKA("MERGE_REFRESH", 2);
        MERGE_REFRESH = c0oka3;
        C0OKA c0oka4 = new C0OKA("GENERATED", 3);
        GENERATED = c0oka4;
        C0OKA c0oka5 = new C0OKA("PUBLISH_SUCCESS", 4);
        PUBLISH_SUCCESS = c0oka5;
        C0OKA c0oka6 = new C0OKA("PUBLISH_FAIL", 5);
        PUBLISH_FAIL = c0oka6;
        C0OKA c0oka7 = new C0OKA("RESENT_SUCCESS", 6);
        RESENT_SUCCESS = c0oka7;
        C0OKA c0oka8 = new C0OKA("RESENT", 7);
        RESENT = c0oka8;
        C0OKA c0oka9 = new C0OKA("UPDATE", 8);
        UPDATE = c0oka9;
        C0OKA c0oka10 = new C0OKA("REVOKE", 9);
        REVOKE = c0oka10;
        C0OKA c0oka11 = new C0OKA("DELETED", 10);
        DELETED = c0oka11;
        C0OKA c0oka12 = new C0OKA("FE_SINGLE_UPDATE", 11);
        FE_SINGLE_UPDATE = c0oka12;
        C0OKA c0oka13 = new C0OKA("FE_DELETE", 12);
        FE_DELETE = c0oka13;
        C0OKA c0oka14 = new C0OKA("CHANGE_COMMENT_STATUS", 13);
        CHANGE_COMMENT_STATUS = c0oka14;
        C0OKA[] c0okaArr = {c0oka, c0oka2, c0oka3, c0oka4, c0oka5, c0oka6, c0oka7, c0oka8, c0oka9, c0oka10, c0oka11, c0oka12, c0oka13, c0oka14};
        LL = c0okaArr;
        LLILLJJLI = new C2254308sP(c0okaArr);
    }

    public static C0OKA[] values() {
        return (C0OKA[]) LL.clone();
    }

    public static C0OKA valueOf(String str) {
        return (C0OKA) C08FF.LIZ(C0OKA.class, str);
    }

    public C0OKA(String str, int i) {
    }
}
