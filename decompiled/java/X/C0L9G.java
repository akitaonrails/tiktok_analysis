package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L9G, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L9G {
    public static final C0L9G DARK;
    public static final /* synthetic */ C0L9G[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0L9G SYSTEM;

    public static InterfaceC2044707zh<C0L9G> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0L9G c0l9g = new C0L9G("SYSTEM", 0);
        SYSTEM = c0l9g;
        C0L9G c0l9g2 = new C0L9G("DARK", 1);
        DARK = c0l9g2;
        C0L9G[] c0l9gArr = {c0l9g, c0l9g2};
        LL = c0l9gArr;
        LLILLJJLI = new C2254308sP(c0l9gArr);
    }

    public static C0L9G[] values() {
        return (C0L9G[]) LL.clone();
    }

    public static C0L9G valueOf(String str) {
        return (C0L9G) C08FF.LIZ(C0L9G.class, str);
    }

    public C0L9G(String str, int i) {
    }
}
