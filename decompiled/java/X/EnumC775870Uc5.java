package X;

/* JADX INFO: renamed from: X.0Uc5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public enum EnumC775870Uc5 {
    NOMINAL(0),
    FAIR(1),
    MODERATE(2),
    SERIOUS(3);

    public final int LL;

    public static EnumC775870Uc5 valueOf(String str) {
        return (EnumC775870Uc5) C08FF.LIZ(EnumC775870Uc5.class, str);
    }

    public final int getValue() {
        return this.LL;
    }

    EnumC775870Uc5(int i) {
        this.LL = i;
    }
}
