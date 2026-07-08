package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0W93, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W93 {
    public static final C0W93 CANCEL;
    public static final C0W93 FAIL;
    public static final /* synthetic */ C0W93[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0W93 SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<C0W93> getEntries() {
        return LLILLL;
    }

    static {
        C0W93 c0w93 = new C0W93("SUCCESS", 0, 0);
        SUCCESS = c0w93;
        C0W93 c0w932 = new C0W93("FAIL", 1, 1);
        FAIL = c0w932;
        C0W93 c0w933 = new C0W93("CANCEL", 2, 3);
        CANCEL = c0w933;
        C0W93[] c0w93Arr = {c0w93, c0w932, c0w933};
        LLILLJJLI = c0w93Arr;
        LLILLL = new C2254308sP(c0w93Arr);
    }

    public static C0W93[] values() {
        return (C0W93[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0W93 valueOf(String str) {
        return (C0W93) C08FF.LIZ(C0W93.class, str);
    }

    public C0W93(String str, int i, int i2) {
        this.LL = i2;
    }
}
