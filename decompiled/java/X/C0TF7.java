package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TF7, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TF7 {
    public static final /* synthetic */ C0TF7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0TF7 NONE;
    public static final C0TF7 TRAY_ONLY;
    public final String LL;

    public static InterfaceC2044707zh<C0TF7> getEntries() {
        return LLILLL;
    }

    static {
        C0TF7 c0tf7 = new C0TF7("NONE", 0, "");
        NONE = c0tf7;
        C0TF7 c0tf72 = new C0TF7("TRAY_ONLY", 1, "tray_only");
        TRAY_ONLY = c0tf72;
        C0TF7[] c0tf7Arr = {c0tf7, c0tf72};
        LLILLJJLI = c0tf7Arr;
        LLILLL = new C2254308sP(c0tf7Arr);
    }

    public static C0TF7[] values() {
        return (C0TF7[]) LLILLJJLI.clone();
    }

    public final String getDesc() {
        return this.LL;
    }

    public static C0TF7 valueOf(String str) {
        return (C0TF7) C08FF.LIZ(C0TF7.class, str);
    }

    public C0TF7(String str, int i, String str2) {
        this.LL = str2;
    }
}
