package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0I5G, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I5G {
    public static final C0I5G EYE_SLASH;
    public static final /* synthetic */ C0I5G[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0I5G NONE;
    public static final C0I5G PLAY;

    public static InterfaceC2044707zh<C0I5G> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0I5G c0i5g = new C0I5G("NONE", 0);
        NONE = c0i5g;
        C0I5G c0i5g2 = new C0I5G("PLAY", 1);
        PLAY = c0i5g2;
        C0I5G c0i5g3 = new C0I5G("EYE_SLASH", 2);
        EYE_SLASH = c0i5g3;
        C0I5G[] c0i5gArr = {c0i5g, c0i5g2, c0i5g3};
        LL = c0i5gArr;
        LLILLJJLI = new C2254308sP(c0i5gArr);
    }

    public static C0I5G[] values() {
        return (C0I5G[]) LL.clone();
    }

    public static C0I5G valueOf(String str) {
        return (C0I5G) C08FF.LIZ(C0I5G.class, str);
    }

    public C0I5G(String str, int i) {
    }
}
