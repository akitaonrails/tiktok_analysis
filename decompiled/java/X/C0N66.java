package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N66, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N66 {
    public static final /* synthetic */ C0N66[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0N66 Restart;
    public static final C0N66 Reverse;

    public static InterfaceC2044707zh<C0N66> getEntries() {
        return LLILLJJLI;
    }

    public static C0N66 valueOf(String str) {
        return (C0N66) C08FF.LIZ(C0N66.class, str);
    }

    public static C0N66[] values() {
        return (C0N66[]) LL.clone();
    }

    static {
        C0N66 c0n66 = new C0N66("Restart", 0);
        Restart = c0n66;
        C0N66 c0n662 = new C0N66("Reverse", 1);
        Reverse = c0n662;
        C0N66[] c0n66Arr = {c0n66, c0n662};
        LL = c0n66Arr;
        LLILLJJLI = new C2254308sP(c0n66Arr);
    }

    public C0N66(String str, int i) {
    }
}
