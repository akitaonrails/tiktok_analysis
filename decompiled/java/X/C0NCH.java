package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NCH, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NCH {
    public static final C0NCH LL;
    public static final C0NCH LLILLJJLI;
    public static final C0NCH LLILLL;
    public static final /* synthetic */ C0NCH[] LLILZ;

    static {
        C0NCH c0nch = new C0NCH("UP", 0);
        LL = c0nch;
        C0NCH c0nch2 = new C0NCH("DOWN", 1);
        LLILLJJLI = c0nch2;
        C0NCH c0nch3 = new C0NCH("NONE", 2);
        LLILLL = c0nch3;
        C0NCH[] c0nchArr = {c0nch, c0nch2, c0nch3};
        LLILZ = c0nchArr;
        new C2254308sP(c0nchArr);
    }

    public static C0NCH[] values() {
        return (C0NCH[]) LLILZ.clone();
    }

    public static C0NCH valueOf(String str) {
        return (C0NCH) C08FF.LIZ(C0NCH.class, str);
    }

    public C0NCH(String str, int i) {
    }
}
