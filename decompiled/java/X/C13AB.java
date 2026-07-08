package X;

/* JADX INFO: renamed from: X.13AB, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C13AB {
    DEBUG(0),
    INFO(1),
    WARN(2),
    ERROR(3);

    public final int LL;

    public static C13AB valueOf(String str) {
        return (C13AB) C08FF.LIZ(C13AB.class, str);
    }

    C13AB(int i) {
        this.LL = i;
    }
}
