package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0D93, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D93 {
    public static final C0D93 DIALOG;
    public static final /* synthetic */ C0D93[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0D93 TOAST;

    public static InterfaceC2044707zh<C0D93> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0D93 c0d93 = new C0D93("TOAST", 0);
        TOAST = c0d93;
        C0D93 c0d932 = new C0D93("DIALOG", 1);
        DIALOG = c0d932;
        C0D93[] c0d93Arr = {c0d93, c0d932};
        LL = c0d93Arr;
        LLILLJJLI = new C2254308sP(c0d93Arr);
    }

    public static C0D93[] values() {
        return (C0D93[]) LL.clone();
    }

    public static C0D93 valueOf(String str) {
        return (C0D93) C08FF.LIZ(C0D93.class, str);
    }

    public C0D93(String str, int i) {
    }
}
