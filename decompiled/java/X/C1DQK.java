package X;

/* JADX INFO: renamed from: X.1DQK, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public enum C1DQK {
    AUTO("auto", 0),
    BOTTOM("bottom", 1),
    RIGHT("right", 2);

    public static final C1DQJ Companion = new C1DQJ();
    public final String LL;
    public final int LLILLJJLI;

    public static C1DQK valueOf(String str) {
        return (C1DQK) C08FF.LIZ(C1DQK.class, str);
    }

    public final String getVALUE() {
        return this.LL;
    }

    public final int getVALUE_INT() {
        return this.LLILLJJLI;
    }

    C1DQK(String str, int i) {
        this.LL = str;
        this.LLILLJJLI = i;
    }
}
