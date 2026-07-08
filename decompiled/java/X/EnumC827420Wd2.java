package X;

/* JADX INFO: renamed from: X.0Wd2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public enum EnumC827420Wd2 {
    NONE(0),
    EC_SECP256K1(1),
    EC_SECP256R1(2);

    public final int value;

    public static EnumC827420Wd2 valueOf(String str) {
        return (EnumC827420Wd2) C08FF.LIZ(EnumC827420Wd2.class, str);
    }

    EnumC827420Wd2(int i) {
        this.value = i;
    }
}
