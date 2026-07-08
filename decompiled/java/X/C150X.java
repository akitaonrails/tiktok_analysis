package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.150X, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C150X {
    public static final C150X LIVE;
    public static final /* synthetic */ C150X[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C150X STORY;
    public static final C150X TEST;
    public final String LL;

    public static InterfaceC2044707zh<C150X> getEntries() {
        return LLILLL;
    }

    static {
        C150X c150x = new C150X("LIVE", 0, "LivePreviewTabScene");
        LIVE = c150x;
        C150X c150x2 = new C150X("STORY", 1, "SocialStoryTabScene");
        STORY = c150x2;
        C150X c150x3 = new C150X("TEST", 2, "test....");
        TEST = c150x3;
        C150X[] c150xArr = {c150x, c150x2, c150x3};
        LLILLJJLI = c150xArr;
        LLILLL = new C2254308sP(c150xArr);
    }

    public static C150X[] values() {
        return (C150X[]) LLILLJJLI.clone();
    }

    public final String getTag() {
        return this.LL;
    }

    public static C150X valueOf(String str) {
        return (C150X) C08FF.LIZ(C150X.class, str);
    }

    public C150X(String str, int i, String str2) {
        this.LL = str2;
    }
}
