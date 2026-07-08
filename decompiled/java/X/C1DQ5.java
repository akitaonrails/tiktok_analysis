package X;

/* JADX INFO: renamed from: X.1DQ5, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public enum C1DQ5 {
    NONE("none", 0),
    REPORT("report", 1),
    SHARE("share", 2);

    public static final C1DQ6 Companion = new C1DQ6();
    public final String LL;
    public final int LLILLJJLI;

    public static C1DQ5 valueOf(String str) {
        return (C1DQ5) C08FF.LIZ(C1DQ5.class, str);
    }

    public final String getVALUE() {
        return this.LL;
    }

    public final int getVALUE_INT() {
        return this.LLILLJJLI;
    }

    C1DQ5(String str, int i) {
        this.LL = str;
        this.LLILLJJLI = i;
    }
}
