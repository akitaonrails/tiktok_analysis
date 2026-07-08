package X;

/* JADX INFO: renamed from: X.0jKQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1276720jKQ {
    ALTERNATE_IMAGE_PROCESS_NONE(0),
    ALTERNATE_IMAGE_PROCESS_GAUSSIAN(1),
    ALTERNATE_IMAGE_PROCESS_CONFIG(2);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC1276720jKQ valueOf(String str) {
        return (EnumC1276720jKQ) C08FF.LIZ(EnumC1276720jKQ.class, str);
    }

    EnumC1276720jKQ(int i) {
        this.LL = i;
    }
}
