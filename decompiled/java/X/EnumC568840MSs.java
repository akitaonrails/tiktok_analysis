package X;

/* JADX INFO: renamed from: X.0MSs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public enum EnumC568840MSs {
    ImportItemType_UNDEFINED(-1),
    ImportItemType_VIDEO(0),
    ImportItemType_IMAGE(1);

    public final int LL;

    public static EnumC568840MSs valueOf(String str) {
        return (EnumC568840MSs) C08FF.LIZ(EnumC568840MSs.class, str);
    }

    public final int getValue() {
        return this.LL;
    }

    EnumC568840MSs(int i) {
        this.LL = i;
    }
}
