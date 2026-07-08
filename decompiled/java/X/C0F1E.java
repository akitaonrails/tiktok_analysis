package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0F1E, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F1E {
    public static final C0F1E DISABLED;
    public static final C0F1E ENABLED;
    public static final /* synthetic */ C0F1E[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0F1E LOADING;
    public static final C0F1E NOQUOTA;

    public static InterfaceC2044707zh<C0F1E> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0F1E c0f1e = new C0F1E("ENABLED", 0);
        ENABLED = c0f1e;
        C0F1E c0f1e2 = new C0F1E("DISABLED", 1);
        DISABLED = c0f1e2;
        C0F1E c0f1e3 = new C0F1E("LOADING", 2);
        LOADING = c0f1e3;
        C0F1E c0f1e4 = new C0F1E("NOQUOTA", 3);
        NOQUOTA = c0f1e4;
        C0F1E[] c0f1eArr = {c0f1e, c0f1e2, c0f1e3, c0f1e4};
        LL = c0f1eArr;
        LLILLJJLI = new C2254308sP(c0f1eArr);
    }

    public static C0F1E[] values() {
        return (C0F1E[]) LL.clone();
    }

    public static C0F1E valueOf(String str) {
        return (C0F1E) C08FF.LIZ(C0F1E.class, str);
    }

    public C0F1E(String str, int i) {
    }
}
