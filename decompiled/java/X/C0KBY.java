package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KBY, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KBY {
    public static final /* synthetic */ C0KBY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0KBY LOADING;
    public static final C0KBY LOAD_FAILED;
    public static final C0KBY LOAD_SUCCESS;
    public static final C0KBY RELEASED;
    public static final C0KBY UNINITIALIZED;
    public static final C0KBY WAIT_UPDATE;

    public static InterfaceC2044707zh<C0KBY> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0KBY c0kby = new C0KBY("UNINITIALIZED", 0);
        UNINITIALIZED = c0kby;
        C0KBY c0kby2 = new C0KBY("LOADING", 1);
        LOADING = c0kby2;
        C0KBY c0kby3 = new C0KBY("LOAD_SUCCESS", 2);
        LOAD_SUCCESS = c0kby3;
        C0KBY c0kby4 = new C0KBY("LOAD_FAILED", 3);
        LOAD_FAILED = c0kby4;
        C0KBY c0kby5 = new C0KBY("WAIT_UPDATE", 4);
        WAIT_UPDATE = c0kby5;
        C0KBY c0kby6 = new C0KBY("RELEASED", 5);
        RELEASED = c0kby6;
        C0KBY[] c0kbyArr = {c0kby, c0kby2, c0kby3, c0kby4, c0kby5, c0kby6};
        LL = c0kbyArr;
        LLILLJJLI = new C2254308sP(c0kbyArr);
    }

    public static C0KBY[] values() {
        return (C0KBY[]) LL.clone();
    }

    public static C0KBY valueOf(String str) {
        return (C0KBY) C08FF.LIZ(C0KBY.class, str);
    }

    public C0KBY(String str, int i) {
    }
}
