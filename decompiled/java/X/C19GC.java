package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.19GC, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19GC {
    public static final C19GC INVALID_REGION_ERROR;
    public static final /* synthetic */ C19GC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C19GC LOGIN_APPROVE;
    public static final C19GC LOGIN_CONFIRM_ERROR;
    public static final C19GC LOGIN_REFUSE;
    public static final C19GC SCAN_ERROR;
    public static final C19GC SCAN_LOADED;

    public static InterfaceC2044707zh<C19GC> getEntries() {
        return LLILLJJLI;
    }

    static {
        C19GC c19gc = new C19GC("SCAN_LOADED", 0);
        SCAN_LOADED = c19gc;
        C19GC c19gc2 = new C19GC("SCAN_ERROR", 1);
        SCAN_ERROR = c19gc2;
        C19GC c19gc3 = new C19GC("INVALID_REGION_ERROR", 2);
        INVALID_REGION_ERROR = c19gc3;
        C19GC c19gc4 = new C19GC("LOGIN_APPROVE", 3);
        LOGIN_APPROVE = c19gc4;
        C19GC c19gc5 = new C19GC("LOGIN_REFUSE", 4);
        LOGIN_REFUSE = c19gc5;
        C19GC c19gc6 = new C19GC("LOGIN_CONFIRM_ERROR", 5);
        LOGIN_CONFIRM_ERROR = c19gc6;
        C19GC[] c19gcArr = {c19gc, c19gc2, c19gc3, c19gc4, c19gc5, c19gc6};
        LL = c19gcArr;
        LLILLJJLI = new C2254308sP(c19gcArr);
    }

    public static C19GC[] values() {
        return (C19GC[]) LL.clone();
    }

    public static C19GC valueOf(String str) {
        return (C19GC) C08FF.LIZ(C19GC.class, str);
    }

    public C19GC(String str, int i) {
    }
}
