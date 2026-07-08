package X;

/* JADX INFO: renamed from: X.0MhU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public enum EnumC575380MhU {
    PointLengthType_ABSOLUTE(0),
    PointLengthType_PERCENTAGE(1);

    public final int LL;

    public static EnumC575380MhU valueOf(String str) {
        return (EnumC575380MhU) C08FF.LIZ(EnumC575380MhU.class, str);
    }

    public final int getValue() {
        return this.LL;
    }

    EnumC575380MhU(int i) {
        this.LL = i;
    }
}
