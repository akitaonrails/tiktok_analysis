package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.011V, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C011V {
    public static final C011V AUDIENCE;
    public static final C011V BROADCAST;
    public static final /* synthetic */ C011V[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C011V PREVIEW_CARD;

    public static InterfaceC2044707zh<C011V> getEntries() {
        return LLILLJJLI;
    }

    static {
        C011V c011v = new C011V("PREVIEW_CARD", 0);
        PREVIEW_CARD = c011v;
        C011V c011v2 = new C011V("AUDIENCE", 1);
        AUDIENCE = c011v2;
        C011V c011v3 = new C011V("BROADCAST", 2);
        BROADCAST = c011v3;
        C011V[] c011vArr = {c011v, c011v2, c011v3};
        LL = c011vArr;
        LLILLJJLI = new C2254308sP(c011vArr);
    }

    public static C011V[] values() {
        return (C011V[]) LL.clone();
    }

    public static C011V valueOf(String str) {
        return (C011V) C08FF.LIZ(C011V.class, str);
    }

    public C011V(String str, int i) {
    }
}
