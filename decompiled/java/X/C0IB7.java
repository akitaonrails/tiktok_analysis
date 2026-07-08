package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IB7, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0IB7 {
    public static final C0IB7 FAVOURITE;
    public static final C0IB7 LIKE;
    public static final /* synthetic */ C0IB7[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0IB7 NONE;
    public static final C0IB7 REPOST;

    public static InterfaceC2044707zh<C0IB7> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0IB7 c0ib7 = new C0IB7("NONE", 0);
        NONE = c0ib7;
        C0IB7 c0ib72 = new C0IB7("LIKE", 1);
        LIKE = c0ib72;
        C0IB7 c0ib73 = new C0IB7("FAVOURITE", 2);
        FAVOURITE = c0ib73;
        C0IB7 c0ib74 = new C0IB7("REPOST", 3);
        REPOST = c0ib74;
        C0IB7[] c0ib7Arr = {c0ib7, c0ib72, c0ib73, c0ib74};
        LL = c0ib7Arr;
        LLILLJJLI = new C2254308sP(c0ib7Arr);
    }

    public static C0IB7[] values() {
        return (C0IB7[]) LL.clone();
    }

    public static C0IB7 valueOf(String str) {
        return (C0IB7) C08FF.LIZ(C0IB7.class, str);
    }

    public C0IB7(String str, int i) {
    }
}
