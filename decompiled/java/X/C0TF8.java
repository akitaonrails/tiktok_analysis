package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TF8, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TF8 {
    public static final C0TF8 CHECKED;
    public static final /* synthetic */ C0TF8[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0TF8 NONE;
    public static final C0TF8 UNCHECKED;
    public final int LL;

    public static InterfaceC2044707zh<C0TF8> getEntries() {
        return LLILLL;
    }

    static {
        C0TF8 c0tf8 = new C0TF8("NONE", 0, 0);
        NONE = c0tf8;
        C0TF8 c0tf82 = new C0TF8("CHECKED", 1, 1);
        CHECKED = c0tf82;
        C0TF8 c0tf83 = new C0TF8("UNCHECKED", 2, 2);
        UNCHECKED = c0tf83;
        C0TF8[] c0tf8Arr = {c0tf8, c0tf82, c0tf83};
        LLILLJJLI = c0tf8Arr;
        LLILLL = new C2254308sP(c0tf8Arr);
    }

    public static C0TF8[] values() {
        return (C0TF8[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0TF8 valueOf(String str) {
        return (C0TF8) C08FF.LIZ(C0TF8.class, str);
    }

    public C0TF8(String str, int i, int i2) {
        this.LL = i2;
    }
}
