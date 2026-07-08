package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06J1, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06J1 {
    public static final C06J1 FAIL;
    public static final C06J1 IDLE;
    public static final /* synthetic */ C06J1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C06J1 LOADING;
    public static final C06J1 SUCCESS;

    public static InterfaceC2044707zh<C06J1> getEntries() {
        return LLILLJJLI;
    }

    static {
        C06J1 c06j1 = new C06J1("IDLE", 0);
        IDLE = c06j1;
        C06J1 c06j12 = new C06J1("LOADING", 1);
        LOADING = c06j12;
        C06J1 c06j13 = new C06J1("SUCCESS", 2);
        SUCCESS = c06j13;
        C06J1 c06j14 = new C06J1("FAIL", 3);
        FAIL = c06j14;
        C06J1[] c06j1Arr = {c06j1, c06j12, c06j13, c06j14};
        LL = c06j1Arr;
        LLILLJJLI = new C2254308sP(c06j1Arr);
    }

    public static C06J1[] values() {
        return (C06J1[]) LL.clone();
    }

    public static C06J1 valueOf(String str) {
        return (C06J1) C08FF.LIZ(C06J1.class, str);
    }

    public C06J1(String str, int i) {
    }
}
