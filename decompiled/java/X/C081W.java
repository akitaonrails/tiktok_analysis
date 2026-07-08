package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.081W, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C081W {
    public static final C081W FALSE;
    public static final /* synthetic */ C081W[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C081W TRUE;
    public final String LL;

    public static InterfaceC2044707zh<C081W> getEntries() {
        return LLILLL;
    }

    static {
        C081W c081w = new C081W("FALSE", 0, "false");
        FALSE = c081w;
        C081W c081w2 = new C081W("TRUE", 1, "true");
        TRUE = c081w2;
        C081W[] c081wArr = {c081w, c081w2};
        LLILLJJLI = c081wArr;
        LLILLL = new C2254308sP(c081wArr);
    }

    public static C081W[] values() {
        return (C081W[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C081W valueOf(String str) {
        return (C081W) C08FF.LIZ(C081W.class, str);
    }

    public C081W(String str, int i, String str2) {
        this.LL = str2;
    }
}
