package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0E6E, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E6E {
    public static final C0E6E CLIP;
    public static final C0E6E LINE;
    public static final /* synthetic */ C0E6E[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0E6E NONE;

    public static InterfaceC2044707zh<C0E6E> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0E6E c0e6e = new C0E6E("NONE", 0);
        NONE = c0e6e;
        C0E6E c0e6e2 = new C0E6E("CLIP", 1);
        CLIP = c0e6e2;
        C0E6E c0e6e3 = new C0E6E("LINE", 2);
        LINE = c0e6e3;
        C0E6E[] c0e6eArr = {c0e6e, c0e6e2, c0e6e3};
        LL = c0e6eArr;
        LLILLJJLI = new C2254308sP(c0e6eArr);
    }

    public static C0E6E[] values() {
        return (C0E6E[]) LL.clone();
    }

    public static C0E6E valueOf(String str) {
        return (C0E6E) C08FF.LIZ(C0E6E.class, str);
    }

    public C0E6E(String str, int i) {
    }
}
