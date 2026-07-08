package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0I5E, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I5E {
    public static final C0I5E EYE_SLASH;
    public static final /* synthetic */ C0I5E[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0I5E NONE;
    public static final C0I5E PLAY;

    public static InterfaceC2044707zh<C0I5E> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0I5E c0i5e = new C0I5E("NONE", 0);
        NONE = c0i5e;
        C0I5E c0i5e2 = new C0I5E("PLAY", 1);
        PLAY = c0i5e2;
        C0I5E c0i5e3 = new C0I5E("EYE_SLASH", 2);
        EYE_SLASH = c0i5e3;
        C0I5E[] c0i5eArr = {c0i5e, c0i5e2, c0i5e3};
        LL = c0i5eArr;
        LLILLJJLI = new C2254308sP(c0i5eArr);
    }

    public static C0I5E[] values() {
        return (C0I5E[]) LL.clone();
    }

    public static C0I5E valueOf(String str) {
        return (C0I5E) C08FF.LIZ(C0I5E.class, str);
    }

    public C0I5E(String str, int i) {
    }
}
