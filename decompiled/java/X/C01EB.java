package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01EB, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01EB {
    public static final C01EB FINISH;
    public static final C01EB IDLE;
    public static final /* synthetic */ C01EB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C01EB ONGOING;

    public static InterfaceC2044707zh<C01EB> getEntries() {
        return LLILLJJLI;
    }

    static {
        C01EB c01eb = new C01EB("IDLE", 0);
        IDLE = c01eb;
        C01EB c01eb2 = new C01EB("ONGOING", 1);
        ONGOING = c01eb2;
        C01EB c01eb3 = new C01EB("FINISH", 2);
        FINISH = c01eb3;
        C01EB[] c01ebArr = {c01eb, c01eb2, c01eb3};
        LL = c01ebArr;
        LLILLJJLI = new C2254308sP(c01ebArr);
    }

    public static C01EB[] values() {
        return (C01EB[]) LL.clone();
    }

    public static C01EB valueOf(String str) {
        return (C01EB) C08FF.LIZ(C01EB.class, str);
    }

    public C01EB(String str, int i) {
    }
}
