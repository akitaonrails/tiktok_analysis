package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SKK, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SKK {
    public static final C0SKK INITIALIZED;
    public static final /* synthetic */ C0SKK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0SKK ORIGINAL;
    public static final C0SKK TRANSLATED;
    public static final C0SKK TRANSLATING;
    public final String LL;

    public static InterfaceC2044707zh<C0SKK> getEntries() {
        return LLILLL;
    }

    static {
        C0SKK c0skk = new C0SKK("INITIALIZED", 0, "Initialized");
        INITIALIZED = c0skk;
        C0SKK c0skk2 = new C0SKK("ORIGINAL", 1, "Original");
        ORIGINAL = c0skk2;
        C0SKK c0skk3 = new C0SKK("TRANSLATING", 2, "Translating");
        TRANSLATING = c0skk3;
        C0SKK c0skk4 = new C0SKK("TRANSLATED", 3, "Translated");
        TRANSLATED = c0skk4;
        C0SKK[] c0skkArr = {c0skk, c0skk2, c0skk3, c0skk4};
        LLILLJJLI = c0skkArr;
        LLILLL = new C2254308sP(c0skkArr);
    }

    public static C0SKK[] values() {
        return (C0SKK[]) LLILLJJLI.clone();
    }

    public final String getId() {
        return this.LL;
    }

    public static C0SKK valueOf(String str) {
        return (C0SKK) C08FF.LIZ(C0SKK.class, str);
    }

    public C0SKK(String str, int i, String str2) {
        this.LL = str2;
    }
}
