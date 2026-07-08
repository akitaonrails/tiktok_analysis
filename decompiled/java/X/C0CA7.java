package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CA7, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CA7 {
    public static final C0CA7 IDX_TEXT_CONTENT;
    public static final /* synthetic */ C0CA7[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final String LL = "idx_text_content";
    public final String LLILLJJLI = "text";

    public static InterfaceC2044707zh<C0CA7> getEntries() {
        return LLILZ;
    }

    static {
        C0CA7 c0ca7 = new C0CA7();
        IDX_TEXT_CONTENT = c0ca7;
        C0CA7[] c0ca7Arr = {c0ca7};
        LLILLL = c0ca7Arr;
        LLILZ = new C2254308sP(c0ca7Arr);
    }

    public static C0CA7[] values() {
        return (C0CA7[]) LLILLL.clone();
    }

    public final String getColumns() {
        return this.LLILLJJLI;
    }

    public final String getIndexName() {
        return this.LL;
    }

    public static C0CA7 valueOf(String str) {
        return (C0CA7) C08FF.LIZ(C0CA7.class, str);
    }
}
