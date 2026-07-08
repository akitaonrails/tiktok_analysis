package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008N, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C008N {
    public static final C008N LIKE;
    public static final /* synthetic */ C008N[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C008N LOOP1;
    public static final C008N PLAY_XS;
    public static final C008N PUBLISH_FINISH;

    public static InterfaceC2044707zh<C008N> getEntries() {
        return LLILLJJLI;
    }

    static {
        C008N c008n = new C008N("PUBLISH_FINISH", 0);
        PUBLISH_FINISH = c008n;
        C008N c008n2 = new C008N("LIKE", 1);
        LIKE = c008n2;
        C008N c008n3 = new C008N("LOOP1", 2);
        LOOP1 = c008n3;
        C008N c008n4 = new C008N("PLAY_XS", 3);
        PLAY_XS = c008n4;
        C008N[] c008nArr = {c008n, c008n2, c008n3, c008n4};
        LL = c008nArr;
        LLILLJJLI = new C2254308sP(c008nArr);
    }

    public static C008N[] values() {
        return (C008N[]) LL.clone();
    }

    public static C008N valueOf(String str) {
        return (C008N) C08FF.LIZ(C008N.class, str);
    }

    public C008N(String str, int i) {
    }
}
