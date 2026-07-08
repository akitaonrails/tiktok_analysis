package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Z71, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z71 {
    public static final C0Z71 COMPLETE;
    public static final C0Z71 FAILED;
    public static final C0Z71 INIT;
    public static final /* synthetic */ C0Z71[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0Z71 LOADING;

    public static InterfaceC2044707zh<C0Z71> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0Z71 c0z71 = new C0Z71("INIT", 0);
        INIT = c0z71;
        C0Z71 c0z712 = new C0Z71("LOADING", 1);
        LOADING = c0z712;
        C0Z71 c0z713 = new C0Z71("COMPLETE", 2);
        COMPLETE = c0z713;
        C0Z71 c0z714 = new C0Z71("FAILED", 3);
        FAILED = c0z714;
        C0Z71[] c0z71Arr = {c0z71, c0z712, c0z713, c0z714};
        LL = c0z71Arr;
        LLILLJJLI = new C2254308sP(c0z71Arr);
    }

    public static C0Z71[] values() {
        return (C0Z71[]) LL.clone();
    }

    public static C0Z71 valueOf(String str) {
        return (C0Z71) C08FF.LIZ(C0Z71.class, str);
    }

    public C0Z71(String str, int i) {
    }
}
