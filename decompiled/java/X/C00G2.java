package X;

/* JADX INFO: renamed from: X.00G2, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public enum C00G2 {
    VESmartCutModeSequential(1),
    VESmartCutModeSelective(2);

    public int value;

    public static C00G2 valueOf(String str) {
        return (C00G2) C08FF.LIZ(C00G2.class, str);
    }

    C00G2(int i) {
        this.value = i;
    }
}
