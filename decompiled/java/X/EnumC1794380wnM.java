package X;

/* JADX INFO: renamed from: X.0wnM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public enum EnumC1794380wnM {
    SUCCESS(0),
    PENDING(1),
    FAILED(2),
    CANCELLED(3),
    UNDEFINED(4);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC1794380wnM valueOf(String str) {
        return (EnumC1794380wnM) C08FF.LIZ(EnumC1794380wnM.class, str);
    }

    EnumC1794380wnM(int i) {
        this.LL = i;
    }
}
