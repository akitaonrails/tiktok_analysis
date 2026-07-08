package X;

/* JADX INFO: renamed from: X.0kID, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1313790kID {
    TRANSLATE_X(0),
    TRANSLATE_Y(1),
    TRANSLATE_Z(2),
    ROTATE_X(3),
    ROTATE_Y(4),
    ROTATE_Z(5),
    SCALE_X(6),
    SCALE_Y(7),
    OPACITY(8),
    BG_COLOR(9);

    public final int LL;

    public static EnumC1313790kID valueOf(String str) {
        return (EnumC1313790kID) C08FF.LIZ(EnumC1313790kID.class, str);
    }

    EnumC1313790kID(int i) {
        this.LL = i;
    }
}
