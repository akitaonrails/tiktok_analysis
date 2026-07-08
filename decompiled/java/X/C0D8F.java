package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0D8F, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D8F {
    public static final C0D8F DONE;
    public static final C0D8F ERROR;
    public static final C0D8F IN_PROGRESS;
    public static final /* synthetic */ C0D8F[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0D8F START;
    public static final C0D8F STOP;

    public static InterfaceC2044707zh<C0D8F> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0D8F c0d8f = new C0D8F("IN_PROGRESS", 0);
        IN_PROGRESS = c0d8f;
        C0D8F c0d8f2 = new C0D8F("DONE", 1);
        DONE = c0d8f2;
        C0D8F c0d8f3 = new C0D8F("ERROR", 2);
        ERROR = c0d8f3;
        C0D8F c0d8f4 = new C0D8F("START", 3);
        START = c0d8f4;
        C0D8F c0d8f5 = new C0D8F("STOP", 4);
        STOP = c0d8f5;
        C0D8F[] c0d8fArr = {c0d8f, c0d8f2, c0d8f3, c0d8f4, c0d8f5};
        LL = c0d8fArr;
        LLILLJJLI = new C2254308sP(c0d8fArr);
    }

    public static C0D8F[] values() {
        return (C0D8F[]) LL.clone();
    }

    public static C0D8F valueOf(String str) {
        return (C0D8F) C08FF.LIZ(C0D8F.class, str);
    }

    public C0D8F(String str, int i) {
    }
}
