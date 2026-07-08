package X;

/* JADX INFO: renamed from: X.0ox9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1492930ox9 {
    WIFI(0),
    CELL(1);

    public final int networkType;

    public static EnumC1492930ox9 valueOf(String str) {
        return (EnumC1492930ox9) C08FF.LIZ(EnumC1492930ox9.class, str);
    }

    EnumC1492930ox9(int i) {
        this.networkType = i;
    }
}
