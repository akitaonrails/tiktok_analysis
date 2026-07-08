package X;

/* JADX INFO: renamed from: X.0IIZ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public enum C0IIZ {
    VeLivePlayerRotation0(0),
    VeLivePlayerRotation90(90),
    VeLivePlayerRotation180(180),
    VeLivePlayerRotation270(270);

    public final int degree;

    public static C0IIZ valueOf(String str) {
        return (C0IIZ) C08FF.LIZ(C0IIZ.class, str);
    }

    C0IIZ(int i) {
        this.degree = i;
    }
}
