package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HUQ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HUQ {
    public static final C0HUQ END;
    public static final /* synthetic */ C0HUQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0HUQ PROGRESS;
    public static final C0HUQ START;

    public static InterfaceC2044707zh<C0HUQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0HUQ c0huq = new C0HUQ("START", 0);
        START = c0huq;
        C0HUQ c0huq2 = new C0HUQ("PROGRESS", 1);
        PROGRESS = c0huq2;
        C0HUQ c0huq3 = new C0HUQ("END", 2);
        END = c0huq3;
        C0HUQ[] c0huqArr = {c0huq, c0huq2, c0huq3};
        LL = c0huqArr;
        LLILLJJLI = new C2254308sP(c0huqArr);
    }

    public static C0HUQ[] values() {
        return (C0HUQ[]) LL.clone();
    }

    public static C0HUQ valueOf(String str) {
        return (C0HUQ) C08FF.LIZ(C0HUQ.class, str);
    }

    public C0HUQ(String str, int i) {
    }
}
