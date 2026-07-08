package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TT3, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TT3 {
    public static final /* synthetic */ C0TT3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0TT3 POI_LIMITED;
    public static final C0TT3 POST_PAGE;

    public static InterfaceC2044707zh<C0TT3> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0TT3 c0tt3 = new C0TT3("POI_LIMITED", 0);
        POI_LIMITED = c0tt3;
        C0TT3 c0tt32 = new C0TT3("POST_PAGE", 1);
        POST_PAGE = c0tt32;
        C0TT3[] c0tt3Arr = {c0tt3, c0tt32};
        LL = c0tt3Arr;
        LLILLJJLI = new C2254308sP(c0tt3Arr);
    }

    public static C0TT3[] values() {
        return (C0TT3[]) LL.clone();
    }

    public static C0TT3 valueOf(String str) {
        return (C0TT3) C08FF.LIZ(C0TT3.class, str);
    }

    public C0TT3(String str, int i) {
    }
}
