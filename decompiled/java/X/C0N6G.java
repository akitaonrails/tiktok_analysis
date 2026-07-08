package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N6G, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N6G {
    public static final C0N6G LIVE;
    public static final /* synthetic */ C0N6G[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0N6G PHOTO;
    public static final C0N6G VIDEO;

    public static InterfaceC2044707zh<C0N6G> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0N6G c0n6g = new C0N6G("VIDEO", 0);
        VIDEO = c0n6g;
        C0N6G c0n6g2 = new C0N6G("LIVE", 1);
        LIVE = c0n6g2;
        C0N6G c0n6g3 = new C0N6G("PHOTO", 2);
        PHOTO = c0n6g3;
        C0N6G[] c0n6gArr = {c0n6g, c0n6g2, c0n6g3};
        LL = c0n6gArr;
        LLILLJJLI = new C2254308sP(c0n6gArr);
    }

    public static C0N6G[] values() {
        return (C0N6G[]) LL.clone();
    }

    public static C0N6G valueOf(String str) {
        return (C0N6G) C08FF.LIZ(C0N6G.class, str);
    }

    public C0N6G(String str, int i) {
    }
}
