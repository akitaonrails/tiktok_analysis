package X;

/* JADX INFO: renamed from: X.0jY6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1285200jY6 {
    SCALE_TO_FILL(0),
    SCALE_TO_CENTER(1),
    SCALE_TO_FILL_AND_CROP(2),
    SCALE_TO_FILL_WITH_SOURCE_CROP(3);

    public final int value;

    public static EnumC1285200jY6 valueOf(String str) {
        return (EnumC1285200jY6) C08FF.LIZ(EnumC1285200jY6.class, str);
    }

    EnumC1285200jY6(int i) {
        this.value = i;
    }
}
