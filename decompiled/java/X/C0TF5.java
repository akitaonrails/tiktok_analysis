package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TF5, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TF5 {
    public static final C0TF5 ALWAYS;
    public static final C0TF5 LANDSCAPE_ONLY;
    public static final /* synthetic */ C0TF5[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0TF5 NONE;
    public final int LL;

    public static InterfaceC2044707zh<C0TF5> getEntries() {
        return LLILLL;
    }

    static {
        C0TF5 c0tf5 = new C0TF5("NONE", 0, 0);
        NONE = c0tf5;
        C0TF5 c0tf52 = new C0TF5("LANDSCAPE_ONLY", 1, 1);
        LANDSCAPE_ONLY = c0tf52;
        C0TF5 c0tf53 = new C0TF5("ALWAYS", 2, 2);
        ALWAYS = c0tf53;
        C0TF5[] c0tf5Arr = {c0tf5, c0tf52, c0tf53};
        LLILLJJLI = c0tf5Arr;
        LLILLL = new C2254308sP(c0tf5Arr);
    }

    public static C0TF5[] values() {
        return (C0TF5[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0TF5 valueOf(String str) {
        return (C0TF5) C08FF.LIZ(C0TF5.class, str);
    }

    public C0TF5(String str, int i, int i2) {
        this.LL = i2;
    }
}
