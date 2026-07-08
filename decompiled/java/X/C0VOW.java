package X;

/* JADX INFO: renamed from: X.0VOW, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public enum C0VOW {
    NONE(0),
    MDL_VERSION_1(1);

    public int version;

    public static C0VOW valueOf(String str) {
        return (C0VOW) C08FF.LIZ(C0VOW.class, str);
    }

    C0VOW(int i) {
        this.version = i;
    }
}
