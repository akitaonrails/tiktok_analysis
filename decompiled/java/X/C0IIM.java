package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IIM, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IIM {
    public static final C0IIM BACK_APP;
    public static final C0IIM BLOCK_USER;
    public static final C0IIM CLOSE_MINI_WINDOW;
    public static final C0IIM LIVE_END;
    public static final /* synthetic */ C0IIM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0IIM> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0IIM c0iim = new C0IIM("LIVE_END", 0);
        LIVE_END = c0iim;
        C0IIM c0iim2 = new C0IIM("BACK_APP", 1);
        BACK_APP = c0iim2;
        C0IIM c0iim3 = new C0IIM("BLOCK_USER", 2);
        BLOCK_USER = c0iim3;
        C0IIM c0iim4 = new C0IIM("CLOSE_MINI_WINDOW", 3);
        CLOSE_MINI_WINDOW = c0iim4;
        C0IIM[] c0iimArr = {c0iim, c0iim2, c0iim3, c0iim4};
        LL = c0iimArr;
        LLILLJJLI = new C2254308sP(c0iimArr);
    }

    public static C0IIM[] values() {
        return (C0IIM[]) LL.clone();
    }

    public static C0IIM valueOf(String str) {
        return (C0IIM) C08FF.LIZ(C0IIM.class, str);
    }

    public C0IIM(String str, int i) {
    }
}
