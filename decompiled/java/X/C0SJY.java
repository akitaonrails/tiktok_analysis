package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SJY, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SJY {
    public static final C0SJY DESC;
    public static final /* synthetic */ C0SJY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0SJY MARKUP_TEXT;
    public static final C0SJY RETURN_CAPTION;
    public final String LL;

    public static InterfaceC2044707zh<C0SJY> getEntries() {
        return LLILLL;
    }

    static {
        C0SJY c0sjy = new C0SJY("MARKUP_TEXT", 0, "MarkupText");
        MARKUP_TEXT = c0sjy;
        C0SJY c0sjy2 = new C0SJY("RETURN_CAPTION", 1, "ReturnCaption");
        RETURN_CAPTION = c0sjy2;
        C0SJY c0sjy3 = new C0SJY("DESC", 2, "Desc");
        DESC = c0sjy3;
        C0SJY[] c0sjyArr = {c0sjy, c0sjy2, c0sjy3};
        LLILLJJLI = c0sjyArr;
        LLILLL = new C2254308sP(c0sjyArr);
    }

    public static C0SJY[] values() {
        return (C0SJY[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0SJY valueOf(String str) {
        return (C0SJY) C08FF.LIZ(C0SJY.class, str);
    }

    public C0SJY(String str, int i, String str2) {
        this.LL = str2;
    }
}
