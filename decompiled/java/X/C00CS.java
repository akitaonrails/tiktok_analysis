package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00CS, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00CS {
    public static final C00CS DURATIONS_IS_NULL;
    public static final C00CS INDEX_OUT_OF_BOUNDS;
    public static final /* synthetic */ C00CS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C00CS> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00CS c00cs = new C00CS("DURATIONS_IS_NULL", 0);
        DURATIONS_IS_NULL = c00cs;
        C00CS c00cs2 = new C00CS("INDEX_OUT_OF_BOUNDS", 1);
        INDEX_OUT_OF_BOUNDS = c00cs2;
        C00CS[] c00csArr = {c00cs, c00cs2};
        LL = c00csArr;
        LLILLJJLI = new C2254308sP(c00csArr);
    }

    public static C00CS[] values() {
        return (C00CS[]) LL.clone();
    }

    public static C00CS valueOf(String str) {
        return (C00CS) C08FF.LIZ(C00CS.class, str);
    }

    public C00CS(String str, int i) {
    }
}
