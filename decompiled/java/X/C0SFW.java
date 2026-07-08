package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SFW, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SFW {
    public static final /* synthetic */ C0SFW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0SFW PAUSE;
    public static final C0SFW START;
    public static final C0SFW STOP;

    public static InterfaceC2044707zh<C0SFW> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0SFW c0sfw = new C0SFW("START", 0);
        START = c0sfw;
        C0SFW c0sfw2 = new C0SFW("PAUSE", 1);
        PAUSE = c0sfw2;
        C0SFW c0sfw3 = new C0SFW("STOP", 2);
        STOP = c0sfw3;
        C0SFW[] c0sfwArr = {c0sfw, c0sfw2, c0sfw3};
        LL = c0sfwArr;
        LLILLJJLI = new C2254308sP(c0sfwArr);
    }

    public static C0SFW[] values() {
        return (C0SFW[]) LL.clone();
    }

    public static C0SFW valueOf(String str) {
        return (C0SFW) C08FF.LIZ(C0SFW.class, str);
    }

    public C0SFW(String str, int i) {
    }
}
