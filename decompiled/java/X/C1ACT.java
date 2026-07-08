package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1ACT, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ACT {
    public static final C1ACT BIND;
    public static final C1ACT BIND_VIEW;
    public static final C1ACT INITIALIZING;
    public static final /* synthetic */ C1ACT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C1ACT PAUSE;
    public static final C1ACT RESUME;
    public static final C1ACT SELECTED;
    public static final C1ACT UNBIND;
    public static final C1ACT UNSELECTED;
    public final int LL;

    public static InterfaceC2044707zh<C1ACT> getEntries() {
        return LLILLL;
    }

    static {
        C1ACT c1act = new C1ACT("INITIALIZING", 0, -1);
        INITIALIZING = c1act;
        C1ACT c1act2 = new C1ACT("BIND", 1, 0);
        BIND = c1act2;
        C1ACT c1act3 = new C1ACT("BIND_VIEW", 2, 1);
        BIND_VIEW = c1act3;
        C1ACT c1act4 = new C1ACT("SELECTED", 3, 2);
        SELECTED = c1act4;
        C1ACT c1act5 = new C1ACT("RESUME", 4, 3);
        RESUME = c1act5;
        C1ACT c1act6 = new C1ACT("PAUSE", 5, 4);
        PAUSE = c1act6;
        C1ACT c1act7 = new C1ACT("UNSELECTED", 6, 5);
        UNSELECTED = c1act7;
        C1ACT c1act8 = new C1ACT("UNBIND", 7, 6);
        UNBIND = c1act8;
        C1ACT[] c1actArr = {c1act, c1act2, c1act3, c1act4, c1act5, c1act6, c1act7, c1act8};
        LLILLJJLI = c1actArr;
        LLILLL = new C2254308sP(c1actArr);
    }

    public static C1ACT[] values() {
        return (C1ACT[]) LLILLJJLI.clone();
    }

    public final int getState() {
        return this.LL;
    }

    public static C1ACT valueOf(String str) {
        return (C1ACT) C08FF.LIZ(C1ACT.class, str);
    }

    public C1ACT(String str, int i, int i2) {
        this.LL = i2;
    }
}
