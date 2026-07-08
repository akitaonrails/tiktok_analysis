package X;

/* JADX INFO: renamed from: X.1DQI, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public enum C1DQI {
    IMMERSIVE(1),
    GRADUAL_CHANGE(2),
    NORMAL(3);

    public static final C1DQN Companion = new Object() { // from class: X.1DQN
    };
    public final int LL;

    public static C1DQI valueOf(String str) {
        return (C1DQI) C08FF.LIZ(C1DQI.class, str);
    }

    public final int getVALUE() {
        return this.LL;
    }

    C1DQI(int i) {
        this.LL = i;
    }
}
