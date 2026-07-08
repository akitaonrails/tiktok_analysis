package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14GV, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14GV {
    public static final C14GV CAPTURE;
    public static final C14GV ENTRANCE;
    public static final C14GV HIDE;
    public static final /* synthetic */ C14GV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C14GV> getEntries() {
        return LLILLJJLI;
    }

    static {
        C14GV c14gv = new C14GV("HIDE", 0);
        HIDE = c14gv;
        C14GV c14gv2 = new C14GV("ENTRANCE", 1);
        ENTRANCE = c14gv2;
        C14GV c14gv3 = new C14GV("CAPTURE", 2);
        CAPTURE = c14gv3;
        C14GV[] c14gvArr = {c14gv, c14gv2, c14gv3};
        LL = c14gvArr;
        LLILLJJLI = new C2254308sP(c14gvArr);
    }

    public static C14GV[] values() {
        return (C14GV[]) LL.clone();
    }

    public static C14GV valueOf(String str) {
        return (C14GV) C08FF.LIZ(C14GV.class, str);
    }

    public C14GV(String str, int i) {
    }
}
