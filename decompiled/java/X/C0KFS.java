package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KFS, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KFS {
    public static final C514420KFk Companion;
    public static final C0KFS LIVE_ROOM;
    public static final /* synthetic */ C0KFS[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C0KFS MANAGEMENT_PAGE;
    public static final C0KFS PROFILE_PAGE;
    public static final C0KFS PURCHASED_CONTENT;
    public static final C0KFS SUBSCRIPTION_LIST_MANAGEMENT_PAGE;
    public final String LL;
    public final int LLILLJJLI;

    public static InterfaceC2044707zh<C0KFS> getEntries() {
        return LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0KFk] */
    static {
        C0KFS c0kfs = new C0KFS("LIVE_ROOM", 0, "live_room", 0);
        LIVE_ROOM = c0kfs;
        C0KFS c0kfs2 = new C0KFS("PROFILE_PAGE", 1, "profile_page", 1);
        PROFILE_PAGE = c0kfs2;
        C0KFS c0kfs3 = new C0KFS("MANAGEMENT_PAGE", 2, "management_page", 2);
        MANAGEMENT_PAGE = c0kfs3;
        C0KFS c0kfs4 = new C0KFS("PURCHASED_CONTENT", 3, "purchased_content", 3);
        PURCHASED_CONTENT = c0kfs4;
        C0KFS c0kfs5 = new C0KFS("SUBSCRIPTION_LIST_MANAGEMENT_PAGE", 4, "subscription_list_management_page", 4);
        SUBSCRIPTION_LIST_MANAGEMENT_PAGE = c0kfs5;
        C0KFS[] c0kfsArr = {c0kfs, c0kfs2, c0kfs3, c0kfs4, c0kfs5};
        LLILLL = c0kfsArr;
        LLILZ = new C2254308sP(c0kfsArr);
        Companion = new Object() { // from class: X.0KFk
        };
    }

    public static C0KFS[] values() {
        return (C0KFS[]) LLILLL.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public final int getValue() {
        return this.LLILLJJLI;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }

    public static C0KFS valueOf(String str) {
        return (C0KFS) C08FF.LIZ(C0KFS.class, str);
    }

    public C0KFS(String str, int i, String str2, int i2) {
        this.LL = str2;
        this.LLILLJJLI = i2;
    }
}
