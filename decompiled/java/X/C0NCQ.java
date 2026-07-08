package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NCQ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NCQ {
    public static final C0NCQ API_SUCCESS;
    public static final /* synthetic */ C0NCQ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0NCQ VIEW_VISIBLE;
    public final String LL;

    public static InterfaceC2044707zh<C0NCQ> getEntries() {
        return LLILLL;
    }

    static {
        C0NCQ c0ncq = new C0NCQ("API_SUCCESS", 0, "api_success");
        API_SUCCESS = c0ncq;
        C0NCQ c0ncq2 = new C0NCQ("VIEW_VISIBLE", 1, "view_visible");
        VIEW_VISIBLE = c0ncq2;
        C0NCQ[] c0ncqArr = {c0ncq, c0ncq2};
        LLILLJJLI = c0ncqArr;
        LLILLL = new C2254308sP(c0ncqArr);
    }

    public static C0NCQ[] values() {
        return (C0NCQ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0NCQ valueOf(String str) {
        return (C0NCQ) C08FF.LIZ(C0NCQ.class, str);
    }

    public C0NCQ(String str, int i, String str2) {
        this.LL = str2;
    }
}
