package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PP0, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PP0 {
    public static final C0PP0 CELLULAR;
    public static final C0PP1 Companion;
    public static final /* synthetic */ C0PP0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0PP0 POOR;
    public static final C0PP0 WIFI;

    public static InterfaceC2044707zh<C0PP0> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0PP1] */
    static {
        C0PP0 c0pp0 = new C0PP0("POOR", 0);
        POOR = c0pp0;
        C0PP0 c0pp02 = new C0PP0("CELLULAR", 1);
        CELLULAR = c0pp02;
        C0PP0 c0pp03 = new C0PP0("WIFI", 2);
        WIFI = c0pp03;
        C0PP0[] c0pp0Arr = {c0pp0, c0pp02, c0pp03};
        LL = c0pp0Arr;
        LLILLJJLI = new C2254308sP(c0pp0Arr);
        Companion = new Object() { // from class: X.0PP1
        };
    }

    public static C0PP0[] values() {
        return (C0PP0[]) LL.clone();
    }

    public static C0PP0 valueOf(String str) {
        return (C0PP0) C08FF.LIZ(C0PP0.class, str);
    }

    public C0PP0(String str, int i) {
    }
}
