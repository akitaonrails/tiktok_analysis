package X;

/* JADX INFO: renamed from: X.0ozU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1494380ozU {
    POPCAPTCHA_V2(0),
    POPCAPTCHA(1),
    TTNET_INTERCEPTOR(2);

    public final int LL;

    public static EnumC1494380ozU valueOf(String str) {
        return (EnumC1494380ozU) C08FF.LIZ(EnumC1494380ozU.class, str);
    }

    public final int getValue() {
        return this.LL;
    }

    EnumC1494380ozU(int i) {
        this.LL = i;
    }
}
