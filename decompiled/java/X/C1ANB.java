package X;

/* JADX INFO: renamed from: X.1ANB, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public enum C1ANB {
    DEFAULT("default"),
    SHORT("short"),
    LIGHT("light");

    public final String LL;

    public static C1ANB valueOf(String str) {
        return (C1ANB) C08FF.LIZ(C1ANB.class, str);
    }

    public final String getDesc() {
        return this.LL;
    }

    C1ANB(String str) {
        this.LL = str;
    }
}
