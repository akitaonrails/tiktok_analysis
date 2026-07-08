package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EA0, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EA0 {
    public static final C0EA0 APPLY;
    public static final C0EA0 CANCEL;
    public static final /* synthetic */ C0EA0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0EA0> getEntries() {
        return LLILLL;
    }

    static {
        C0EA0 c0ea0 = new C0EA0("CANCEL", 0, "cancel");
        CANCEL = c0ea0;
        C0EA0 c0ea02 = new C0EA0("APPLY", 1, "apply");
        APPLY = c0ea02;
        C0EA0[] c0ea0Arr = {c0ea0, c0ea02};
        LLILLJJLI = c0ea0Arr;
        LLILLL = new C2254308sP(c0ea0Arr);
    }

    public static C0EA0[] values() {
        return (C0EA0[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0EA0 valueOf(String str) {
        return (C0EA0) C08FF.LIZ(C0EA0.class, str);
    }

    public C0EA0(String str, int i, String str2) {
        this.LL = str2;
    }
}
