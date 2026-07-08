package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00AO, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00AO {
    public static final /* synthetic */ C00AO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00AO NORMAL_PRELOAD;
    public static final C00AO SHOW_PRELOAD;

    public static InterfaceC2044707zh<C00AO> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00AO c00ao = new C00AO("NORMAL_PRELOAD", 0);
        NORMAL_PRELOAD = c00ao;
        C00AO c00ao2 = new C00AO("SHOW_PRELOAD", 1);
        SHOW_PRELOAD = c00ao2;
        C00AO[] c00aoArr = {c00ao, c00ao2};
        LL = c00aoArr;
        LLILLJJLI = new C2254308sP(c00aoArr);
    }

    public static C00AO[] values() {
        return (C00AO[]) LL.clone();
    }

    public static C00AO valueOf(String str) {
        return (C00AO) C08FF.LIZ(C00AO.class, str);
    }

    public C00AO(String str, int i) {
    }
}
