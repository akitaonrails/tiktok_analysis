package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0J3M, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J3M {
    public static final C0J3M LIVE;
    public static final C0J3M LIVE_HOST_END;
    public static final C0J3M LIVE_REPLAY_CLIP;
    public static final /* synthetic */ C0J3M[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0J3M PREVIEW;
    public static final C0J3M TRY_MODE;
    public static final C0J3M WATCH;

    public static InterfaceC2044707zh<C0J3M> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0J3M c0j3m = new C0J3M("LIVE", 0);
        LIVE = c0j3m;
        C0J3M c0j3m2 = new C0J3M("PREVIEW", 1);
        PREVIEW = c0j3m2;
        C0J3M c0j3m3 = new C0J3M("WATCH", 2);
        WATCH = c0j3m3;
        C0J3M c0j3m4 = new C0J3M("LIVE_REPLAY_CLIP", 3);
        LIVE_REPLAY_CLIP = c0j3m4;
        C0J3M c0j3m5 = new C0J3M("TRY_MODE", 4);
        TRY_MODE = c0j3m5;
        C0J3M c0j3m6 = new C0J3M("LIVE_HOST_END", 5);
        LIVE_HOST_END = c0j3m6;
        C0J3M[] c0j3mArr = {c0j3m, c0j3m2, c0j3m3, c0j3m4, c0j3m5, c0j3m6};
        LL = c0j3mArr;
        LLILLJJLI = new C2254308sP(c0j3mArr);
    }

    public static C0J3M[] values() {
        return (C0J3M[]) LL.clone();
    }

    public static C0J3M valueOf(String str) {
        return (C0J3M) C08FF.LIZ(C0J3M.class, str);
    }

    public C0J3M(String str, int i) {
    }
}
