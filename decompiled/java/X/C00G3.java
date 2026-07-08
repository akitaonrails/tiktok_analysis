package X;

/* JADX INFO: renamed from: X.00G3, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public enum C00G3 {
    VESmartCutBeatTypeDownBeats(1),
    VESmartCutBeatTypeVeBeats(2),
    VESmartCutBeatTypeManMade(3);

    public int value;

    public static C00G3 valueOf(String str) {
        return (C00G3) C08FF.LIZ(C00G3.class, str);
    }

    C00G3(int i) {
        this.value = i;
    }
}
