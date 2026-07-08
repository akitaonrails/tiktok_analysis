package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ITC, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0ITC {
    public static final C0ITC APP_RETURN_FOREGROUND;
    public static final C0ITC FEED_TIMEOUT;
    public static final /* synthetic */ C0ITC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0ITC NEGATIVE_SIGNAL;

    public static InterfaceC2044707zh<C0ITC> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0ITC c0itc = new C0ITC("NEGATIVE_SIGNAL", 0);
        NEGATIVE_SIGNAL = c0itc;
        C0ITC c0itc2 = new C0ITC("FEED_TIMEOUT", 1);
        FEED_TIMEOUT = c0itc2;
        C0ITC c0itc3 = new C0ITC("APP_RETURN_FOREGROUND", 2);
        APP_RETURN_FOREGROUND = c0itc3;
        C0ITC[] c0itcArr = {c0itc, c0itc2, c0itc3};
        LL = c0itcArr;
        LLILLJJLI = new C2254308sP(c0itcArr);
    }

    public static C0ITC[] values() {
        return (C0ITC[]) LL.clone();
    }

    public static C0ITC valueOf(String str) {
        return (C0ITC) C08FF.LIZ(C0ITC.class, str);
    }

    public C0ITC(String str, int i) {
    }
}
