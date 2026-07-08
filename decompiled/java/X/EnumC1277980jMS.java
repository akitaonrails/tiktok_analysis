package X;

/* JADX INFO: renamed from: X.0jMS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1277980jMS {
    GENERAL_ERROR(1),
    RENDER_VIEW_EMPTY(2),
    VIDEO_PIXEL_FORMAT_INVALID(3);

    public final int LL;

    public static EnumC1277980jMS valueOf(String str) {
        return (EnumC1277980jMS) C08FF.LIZ(EnumC1277980jMS.class, str);
    }

    public final int getCode() {
        return this.LL;
    }

    public final int value() {
        return this.LL;
    }

    EnumC1277980jMS(int i) {
        this.LL = i;
    }
}
