package X;

/* JADX INFO: renamed from: X.1BkH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2213551BkH {
    CONTENT_BYTE(1),
    CONTENT_STRING(3);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC2213551BkH valueOf(String str) {
        return (EnumC2213551BkH) C08FF.LIZ(EnumC2213551BkH.class, str);
    }

    EnumC2213551BkH(int i) {
        this.LL = i;
    }
}
