package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01C0, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01C0 {
    public static final /* synthetic */ C01C0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C01C0 START;
    public static final C01C0 UPDATE;
    public final String LL;

    public static InterfaceC2044707zh<C01C0> getEntries() {
        return LLILLL;
    }

    static {
        C01C0 c01c0 = new C01C0("START", 0, "start");
        START = c01c0;
        C01C0 c01c02 = new C01C0("UPDATE", 1, "update");
        UPDATE = c01c02;
        C01C0[] c01c0Arr = {c01c0, c01c02};
        LLILLJJLI = c01c0Arr;
        LLILLL = new C2254308sP(c01c0Arr);
    }

    public static C01C0[] values() {
        return (C01C0[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C01C0 valueOf(String str) {
        return (C01C0) C08FF.LIZ(C01C0.class, str);
    }

    public C01C0(String str, int i, String str2) {
        this.LL = str2;
    }
}
