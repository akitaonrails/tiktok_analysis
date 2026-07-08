package X;

/* JADX INFO: renamed from: X.0Wd3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public enum EnumC827430Wd3 {
    NONE(0),
    ZLIB(1),
    ZSTD(2);

    public final int value;

    public static EnumC827430Wd3 valueOf(String str) {
        return (EnumC827430Wd3) C08FF.LIZ(EnumC827430Wd3.class, str);
    }

    EnumC827430Wd3(int i) {
        this.value = i;
    }
}
