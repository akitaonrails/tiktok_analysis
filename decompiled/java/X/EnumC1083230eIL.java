package X;

/* JADX INFO: renamed from: X.0eIL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public enum EnumC1083230eIL {
    DISABLE(-1),
    DEFAULT(0),
    LOW(1),
    HIGH(2);

    public final int value;

    public static EnumC1083230eIL valueOf(String str) {
        return (EnumC1083230eIL) C08FF.LIZ(EnumC1083230eIL.class, str);
    }

    EnumC1083230eIL(int i) {
        this.value = i;
    }
}
