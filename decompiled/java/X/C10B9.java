package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10B9, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10B9 {
    public static final /* synthetic */ C10B9[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C10B9 STAY_PRIVATE;
    public static final C10B9 STAY_PUBLIC;
    public static final C10B9 SWITCH_PRIVATE;
    public static final C10B9 SWITCH_PUBLIC;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<C10B9> getEntries() {
        return LLILZ;
    }

    static {
        C10B9 c10b9 = new C10B9("STAY_PUBLIC", 0, 2131845214, "stay_public");
        STAY_PUBLIC = c10b9;
        C10B9 c10b92 = new C10B9("STAY_PRIVATE", 1, 2131845213, "stay_private");
        STAY_PRIVATE = c10b92;
        C10B9 c10b93 = new C10B9("SWITCH_PUBLIC", 2, 2131845216, "switch_public");
        SWITCH_PUBLIC = c10b93;
        C10B9 c10b94 = new C10B9("SWITCH_PRIVATE", 3, 2131845215, "switch_private");
        SWITCH_PRIVATE = c10b94;
        C10B9[] c10b9Arr = {c10b9, c10b92, c10b93, c10b94};
        LLILLL = c10b9Arr;
        LLILZ = new C2254308sP(c10b9Arr);
    }

    public static C10B9[] values() {
        return (C10B9[]) LLILLL.clone();
    }

    public final String getEtText() {
        return this.LLILLJJLI;
    }

    public final int getHintText() {
        return this.LL;
    }

    public static C10B9 valueOf(String str) {
        return (C10B9) C08FF.LIZ(C10B9.class, str);
    }

    public C10B9(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
