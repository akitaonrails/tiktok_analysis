package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZUL, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZUL {
    public static final C0ZUL GROUP_HELPER;
    public static final C0ZUL IM_PROXY;
    public static final /* synthetic */ C0ZUL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0ZUL SMART_ROUTER;
    public final int LL;

    public static InterfaceC2044707zh<C0ZUL> getEntries() {
        return LLILLL;
    }

    static {
        C0ZUL c0zul = new C0ZUL("IM_PROXY", 0, 1);
        IM_PROXY = c0zul;
        C0ZUL c0zul2 = new C0ZUL("GROUP_HELPER", 1, 2);
        GROUP_HELPER = c0zul2;
        C0ZUL c0zul3 = new C0ZUL("SMART_ROUTER", 2, 4);
        SMART_ROUTER = c0zul3;
        C0ZUL[] c0zulArr = {c0zul, c0zul2, c0zul3};
        LLILLJJLI = c0zulArr;
        LLILLL = new C2254308sP(c0zulArr);
    }

    public static C0ZUL[] values() {
        return (C0ZUL[]) LLILLJJLI.clone();
    }

    public final int getMask() {
        return this.LL;
    }

    public static C0ZUL valueOf(String str) {
        return (C0ZUL) C08FF.LIZ(C0ZUL.class, str);
    }

    public C0ZUL(String str, int i, int i2) {
        this.LL = i2;
    }
}
