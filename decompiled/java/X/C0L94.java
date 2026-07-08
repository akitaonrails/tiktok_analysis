package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L94, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L94 {
    public static final C0L94 CANCELED;
    public static final C0L94 EXECUTING;
    public static final C0L94 FAILED;
    public static final /* synthetic */ C0L94[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0L94 NONE;
    public static final C0L94 SUCCESS;

    public static InterfaceC2044707zh<C0L94> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0L94 c0l94 = new C0L94("NONE", 0);
        NONE = c0l94;
        C0L94 c0l942 = new C0L94("EXECUTING", 1);
        EXECUTING = c0l942;
        C0L94 c0l943 = new C0L94("SUCCESS", 2);
        SUCCESS = c0l943;
        C0L94 c0l944 = new C0L94("FAILED", 3);
        FAILED = c0l944;
        C0L94 c0l945 = new C0L94("CANCELED", 4);
        CANCELED = c0l945;
        C0L94[] c0l94Arr = {c0l94, c0l942, c0l943, c0l944, c0l945};
        LL = c0l94Arr;
        LLILLJJLI = new C2254308sP(c0l94Arr);
    }

    public static C0L94[] values() {
        return (C0L94[]) LL.clone();
    }

    public static C0L94 valueOf(String str) {
        return (C0L94) C08FF.LIZ(C0L94.class, str);
    }

    public C0L94(String str, int i) {
    }
}
