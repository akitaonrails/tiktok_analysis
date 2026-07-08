package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0X5G, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X5G {
    public static final /* synthetic */ C0X5G[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0X5G ON_DESTROY;
    public static final C0X5G ON_LOAD_URL;
    public static final C0X5G ON_PAGE_FINISHED;
    public static final C0X5G ON_PAGE_START;
    public static final C0X5G ON_PAUSE;
    public static final C0X5G ON_STOP_LOADING;
    public final int LL;

    public static InterfaceC2044707zh<C0X5G> getEntries() {
        return LLILLL;
    }

    static {
        C0X5G c0x5g = new C0X5G("ON_LOAD_URL", 0, 1);
        ON_LOAD_URL = c0x5g;
        C0X5G c0x5g2 = new C0X5G("ON_PAGE_START", 1, 2);
        ON_PAGE_START = c0x5g2;
        C0X5G c0x5g3 = new C0X5G("ON_PAGE_FINISHED", 2, 3);
        ON_PAGE_FINISHED = c0x5g3;
        C0X5G c0x5g4 = new C0X5G("ON_PAUSE", 3, 4);
        ON_PAUSE = c0x5g4;
        C0X5G c0x5g5 = new C0X5G("ON_STOP_LOADING", 4, 5);
        ON_STOP_LOADING = c0x5g5;
        C0X5G c0x5g6 = new C0X5G("ON_DESTROY", 5, 6);
        ON_DESTROY = c0x5g6;
        C0X5G[] c0x5gArr = {c0x5g, c0x5g2, c0x5g3, c0x5g4, c0x5g5, c0x5g6};
        LLILLJJLI = c0x5gArr;
        LLILLL = new C2254308sP(c0x5gArr);
    }

    public static C0X5G[] values() {
        return (C0X5G[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0X5G valueOf(String str) {
        return (C0X5G) C08FF.LIZ(C0X5G.class, str);
    }

    public C0X5G(String str, int i, int i2) {
        this.LL = i2;
    }
}
