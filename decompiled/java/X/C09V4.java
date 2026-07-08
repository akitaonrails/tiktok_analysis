package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09V4, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09V4 {
    public static final /* synthetic */ C09V4[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C09V4 PRELOAD_PARTIAL_VIDEO;
    public static final C09V4 PRELOAD_TOTAL_VIDEO;

    public static InterfaceC2044707zh<C09V4> getEntries() {
        return LLILLJJLI;
    }

    static {
        C09V4 c09v4 = new C09V4("PRELOAD_TOTAL_VIDEO", 0);
        PRELOAD_TOTAL_VIDEO = c09v4;
        C09V4 c09v42 = new C09V4("PRELOAD_PARTIAL_VIDEO", 1);
        PRELOAD_PARTIAL_VIDEO = c09v42;
        C09V4[] c09v4Arr = {c09v4, c09v42};
        LL = c09v4Arr;
        LLILLJJLI = new C2254308sP(c09v4Arr);
    }

    public static C09V4[] values() {
        return (C09V4[]) LL.clone();
    }

    public static C09V4 valueOf(String str) {
        return (C09V4) C08FF.LIZ(C09V4.class, str);
    }

    public C09V4(String str, int i) {
    }
}
