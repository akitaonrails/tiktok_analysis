package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10QV, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10QV {
    public static final C10QV CONFIG;
    public static final C10QV CUSTOM;
    public static final C10QV DEEP;
    public static final C10QV FLOW;
    public static final /* synthetic */ C10QV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C10QV TASKS;

    public static InterfaceC2044707zh<C10QV> getEntries() {
        return LLILLJJLI;
    }

    static {
        C10QV c10qv = new C10QV("FLOW", 0);
        FLOW = c10qv;
        C10QV c10qv2 = new C10QV("CONFIG", 1);
        CONFIG = c10qv2;
        C10QV c10qv3 = new C10QV("CUSTOM", 2);
        CUSTOM = c10qv3;
        C10QV c10qv4 = new C10QV("TASKS", 3);
        TASKS = c10qv4;
        C10QV c10qv5 = new C10QV("DEEP", 4);
        DEEP = c10qv5;
        C10QV[] c10qvArr = {c10qv, c10qv2, c10qv3, c10qv4, c10qv5};
        LL = c10qvArr;
        LLILLJJLI = new C2254308sP(c10qvArr);
    }

    public static C10QV[] values() {
        return (C10QV[]) LL.clone();
    }

    public static C10QV valueOf(String str) {
        return (C10QV) C08FF.LIZ(C10QV.class, str);
    }

    public C10QV(String str, int i) {
    }
}
