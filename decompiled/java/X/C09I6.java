package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09I6, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09I6 {
    public static final C09I6 COMPLETE;
    public static final C09I6 ERROR;
    public static final /* synthetic */ C09I6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C09I6 START;
    public static final C09I6 UNKNOWN;

    public static InterfaceC2044707zh<C09I6> getEntries() {
        return LLILLJJLI;
    }

    static {
        C09I6 c09i6 = new C09I6("START", 0);
        START = c09i6;
        C09I6 c09i62 = new C09I6("COMPLETE", 1);
        COMPLETE = c09i62;
        C09I6 c09i63 = new C09I6("ERROR", 2);
        ERROR = c09i63;
        C09I6 c09i64 = new C09I6("UNKNOWN", 3);
        UNKNOWN = c09i64;
        C09I6[] c09i6Arr = {c09i6, c09i62, c09i63, c09i64};
        LL = c09i6Arr;
        LLILLJJLI = new C2254308sP(c09i6Arr);
    }

    public static C09I6[] values() {
        return (C09I6[]) LL.clone();
    }

    public static C09I6 valueOf(String str) {
        return (C09I6) C08FF.LIZ(C09I6.class, str);
    }

    public C09I6(String str, int i) {
    }
}
