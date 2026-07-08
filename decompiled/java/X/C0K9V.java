package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0K9V, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K9V {
    public static final C0K9V ACTIVE;
    public static final C0K9V AUTO;
    public static final C0K9V CLICK_AVATAR;
    public static final C0K9V CLICK_FOLLOW;
    public static final C0K9V CONFLICT_CONTROLLED;
    public static final C0K9V FREQUENCY_CONTROLLED;
    public static final /* synthetic */ C0K9V[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0K9V NETWORK;
    public static final C0K9V OTHERS;
    public static final C0K9V SEE_MORE;

    public static InterfaceC2044707zh<C0K9V> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0K9V c0k9v = new C0K9V("ACTIVE", 0);
        ACTIVE = c0k9v;
        C0K9V c0k9v2 = new C0K9V("CONFLICT_CONTROLLED", 1);
        CONFLICT_CONTROLLED = c0k9v2;
        C0K9V c0k9v3 = new C0K9V("FREQUENCY_CONTROLLED", 2);
        FREQUENCY_CONTROLLED = c0k9v3;
        C0K9V c0k9v4 = new C0K9V("AUTO", 3);
        AUTO = c0k9v4;
        C0K9V c0k9v5 = new C0K9V("NETWORK", 4);
        NETWORK = c0k9v5;
        C0K9V c0k9v6 = new C0K9V("SEE_MORE", 5);
        SEE_MORE = c0k9v6;
        C0K9V c0k9v7 = new C0K9V("OTHERS", 6);
        OTHERS = c0k9v7;
        C0K9V c0k9v8 = new C0K9V("CLICK_FOLLOW", 7);
        CLICK_FOLLOW = c0k9v8;
        C0K9V c0k9v9 = new C0K9V("CLICK_AVATAR", 8);
        CLICK_AVATAR = c0k9v9;
        C0K9V[] c0k9vArr = {c0k9v, c0k9v2, c0k9v3, c0k9v4, c0k9v5, c0k9v6, c0k9v7, c0k9v8, c0k9v9};
        LL = c0k9vArr;
        LLILLJJLI = new C2254308sP(c0k9vArr);
    }

    public static C0K9V[] values() {
        return (C0K9V[]) LL.clone();
    }

    public static C0K9V valueOf(String str) {
        return (C0K9V) C08FF.LIZ(C0K9V.class, str);
    }

    public C0K9V(String str, int i) {
    }
}
