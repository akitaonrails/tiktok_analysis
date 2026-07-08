package X;

/* JADX INFO: renamed from: X.0ywG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public enum EnumC1876780ywG {
    CONSENT_NOT_PRESENT_IN_CACHE(-1),
    UNSUPPORTED(0),
    APPROVE(1),
    REJECT(2),
    NOTDETERMINED(3);

    public static final C1876770ywF Companion = new C1876770ywF();
    public final int LL;

    public static EnumC1876780ywG valueOf(String str) {
        return (EnumC1876780ywG) C08FF.LIZ(EnumC1876780ywG.class, str);
    }

    public final int getI() {
        return this.LL;
    }

    EnumC1876780ywG(int i) {
        this.LL = i;
    }
}
