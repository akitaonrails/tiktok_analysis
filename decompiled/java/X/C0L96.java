package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L96, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L96 {
    public static final /* synthetic */ C0L96[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0L96 MULTI;
    public static final C0L96 SINGLE;

    public static InterfaceC2044707zh<C0L96> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0L96 c0l96 = new C0L96("SINGLE", 0);
        SINGLE = c0l96;
        C0L96 c0l962 = new C0L96("MULTI", 1);
        MULTI = c0l962;
        C0L96[] c0l96Arr = {c0l96, c0l962};
        LL = c0l96Arr;
        LLILLJJLI = new C2254308sP(c0l96Arr);
    }

    public static C0L96[] values() {
        return (C0L96[]) LL.clone();
    }

    public static C0L96 valueOf(String str) {
        return (C0L96) C08FF.LIZ(C0L96.class, str);
    }

    public C0L96(String str, int i) {
    }
}
