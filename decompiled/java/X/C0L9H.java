package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L9H, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L9H {
    public static final C0L9H DARK;
    public static final C0L9H LIGHT;
    public static final /* synthetic */ C0L9H[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0L9H> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0L9H c0l9h = new C0L9H("LIGHT", 0);
        LIGHT = c0l9h;
        C0L9H c0l9h2 = new C0L9H("DARK", 1);
        DARK = c0l9h2;
        C0L9H[] c0l9hArr = {c0l9h, c0l9h2};
        LL = c0l9hArr;
        LLILLJJLI = new C2254308sP(c0l9hArr);
    }

    public static C0L9H[] values() {
        return (C0L9H[]) LL.clone();
    }

    public static C0L9H valueOf(String str) {
        return (C0L9H) C08FF.LIZ(C0L9H.class, str);
    }

    public C0L9H(String str, int i) {
    }
}
