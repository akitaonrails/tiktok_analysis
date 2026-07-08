package X;

/* JADX INFO: renamed from: X.0jKR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1276730jKR {
    ALTERNATE_IMAGE_HIDDEN_MODE(0),
    ALTERNATE_IMAGE_FILL_MODE(1);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC1276730jKR valueOf(String str) {
        return (EnumC1276730jKR) C08FF.LIZ(EnumC1276730jKR.class, str);
    }

    EnumC1276730jKR(int i) {
        this.LL = i;
    }
}
