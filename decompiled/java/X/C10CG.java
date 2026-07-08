package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10CG, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10CG {
    public static final /* synthetic */ C10CG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C10CG NEVER_POST;
    public static final C10CG REMOVE_DEFAULT_BANNER;
    public static final C10CG SET_DEFAULT_BODY;

    public static InterfaceC2044707zh<C10CG> getEntries() {
        return LLILLJJLI;
    }

    static {
        C10CG c10cg = new C10CG("REMOVE_DEFAULT_BANNER", 0);
        REMOVE_DEFAULT_BANNER = c10cg;
        C10CG c10cg2 = new C10CG("NEVER_POST", 1);
        NEVER_POST = c10cg2;
        C10CG c10cg3 = new C10CG("SET_DEFAULT_BODY", 2);
        SET_DEFAULT_BODY = c10cg3;
        C10CG[] c10cgArr = {c10cg, c10cg2, c10cg3};
        LL = c10cgArr;
        LLILLJJLI = new C2254308sP(c10cgArr);
    }

    public static C10CG[] values() {
        return (C10CG[]) LL.clone();
    }

    public static C10CG valueOf(String str) {
        return (C10CG) C08FF.LIZ(C10CG.class, str);
    }

    public C10CG(String str, int i) {
    }
}
