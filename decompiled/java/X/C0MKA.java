package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MKA, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MKA {
    public static final C0MKA CANCEL;
    public static final C0MKC Companion;
    public static final C0MKA FAILED;
    public static final /* synthetic */ C0MKA[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C0MKA START;
    public static final C0MKA SUCCESS;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<C0MKA> getEntries() {
        return LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0MKC] */
    static {
        C0MKA c0mka = new C0MKA("START", 0, 0, "Process started");
        START = c0mka;
        C0MKA c0mka2 = new C0MKA("SUCCESS", 1, 1, "Process completed successfully");
        SUCCESS = c0mka2;
        C0MKA c0mka3 = new C0MKA("FAILED", 2, -1, "Process failed");
        FAILED = c0mka3;
        C0MKA c0mka4 = new C0MKA("CANCEL", 3, 2, "Process cancelled by user");
        CANCEL = c0mka4;
        C0MKA[] c0mkaArr = {c0mka, c0mka2, c0mka3, c0mka4};
        LLILLL = c0mkaArr;
        LLILZ = new C2254308sP(c0mkaArr);
        Companion = new Object() { // from class: X.0MKC
        };
    }

    public static C0MKA[] values() {
        return (C0MKA[]) LLILLL.clone();
    }

    public final String getDescription() {
        return this.LLILLJJLI;
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0MKA valueOf(String str) {
        return (C0MKA) C08FF.LIZ(C0MKA.class, str);
    }

    public C0MKA(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
