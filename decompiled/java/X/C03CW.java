package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03CW, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03CW {
    public static final /* synthetic */ C03CW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C03CW SUMMARY;
    public static final C03CW TERMS_AND_CONDITIONS;
    public final String LL;

    public static InterfaceC2044707zh<C03CW> getEntries() {
        return LLILLL;
    }

    static {
        C03CW c03cw = new C03CW("TERMS_AND_CONDITIONS", 0, "T&C");
        TERMS_AND_CONDITIONS = c03cw;
        C03CW c03cw2 = new C03CW("SUMMARY", 1, "Summary");
        SUMMARY = c03cw2;
        C03CW[] c03cwArr = {c03cw, c03cw2};
        LLILLJJLI = c03cwArr;
        LLILLL = new C2254308sP(c03cwArr);
    }

    public static C03CW[] values() {
        return (C03CW[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C03CW valueOf(String str) {
        return (C03CW) C08FF.LIZ(C03CW.class, str);
    }

    public C03CW(String str, int i, String str2) {
        this.LL = str2;
    }
}
