package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00GM, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00GM {
    public static final C00GM HIGH;
    public static final /* synthetic */ C00GM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00GM LOW;

    public static InterfaceC2044707zh<C00GM> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00GM c00gm = new C00GM("HIGH", 0);
        HIGH = c00gm;
        C00GM c00gm2 = new C00GM("LOW", 1);
        LOW = c00gm2;
        C00GM[] c00gmArr = {c00gm, c00gm2};
        LL = c00gmArr;
        LLILLJJLI = new C2254308sP(c00gmArr);
    }

    public static C00GM[] values() {
        return (C00GM[]) LL.clone();
    }

    public static C00GM valueOf(String str) {
        return (C00GM) C08FF.LIZ(C00GM.class, str);
    }

    public C00GM(String str, int i) {
    }
}
