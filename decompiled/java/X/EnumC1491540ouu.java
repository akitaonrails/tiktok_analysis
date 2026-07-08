package X;

/* JADX INFO: renamed from: X.0ouu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1491540ouu {
    DEFAULT(0),
    IMPORTANT(1);

    public final long LL;

    public static EnumC1491540ouu valueOf(String str) {
        return (EnumC1491540ouu) C08FF.LIZ(EnumC1491540ouu.class, str);
    }

    public final long getNativeValue() {
        return this.LL;
    }

    EnumC1491540ouu(long j) {
        this.LL = j;
    }
}
