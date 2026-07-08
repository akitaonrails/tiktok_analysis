package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0X5I, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X5I {
    public static final /* synthetic */ C0X5I[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0X5I ON_DESTROY;
    public static final C0X5I ON_LOAD_URL;
    public static final C0X5I ON_PAGE_FINISHED;
    public static final C0X5I ON_PAGE_START;
    public static final C0X5I ON_PAUSE;
    public static final C0X5I ON_STOP_LOADING;
    public final int LL;

    public static InterfaceC2044707zh<C0X5I> getEntries() {
        return LLILLL;
    }

    static {
        C0X5I c0x5i = new C0X5I("ON_LOAD_URL", 0, 1);
        ON_LOAD_URL = c0x5i;
        C0X5I c0x5i2 = new C0X5I("ON_PAGE_START", 1, 2);
        ON_PAGE_START = c0x5i2;
        C0X5I c0x5i3 = new C0X5I("ON_PAGE_FINISHED", 2, 3);
        ON_PAGE_FINISHED = c0x5i3;
        C0X5I c0x5i4 = new C0X5I("ON_PAUSE", 3, 4);
        ON_PAUSE = c0x5i4;
        C0X5I c0x5i5 = new C0X5I("ON_STOP_LOADING", 4, 5);
        ON_STOP_LOADING = c0x5i5;
        C0X5I c0x5i6 = new C0X5I("ON_DESTROY", 5, 6);
        ON_DESTROY = c0x5i6;
        C0X5I[] c0x5iArr = {c0x5i, c0x5i2, c0x5i3, c0x5i4, c0x5i5, c0x5i6};
        LLILLJJLI = c0x5iArr;
        LLILLL = new C2254308sP(c0x5iArr);
    }

    public static C0X5I[] values() {
        return (C0X5I[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0X5I valueOf(String str) {
        return (C0X5I) C08FF.LIZ(C0X5I.class, str);
    }

    public C0X5I(String str, int i, int i2) {
        this.LL = i2;
    }
}
