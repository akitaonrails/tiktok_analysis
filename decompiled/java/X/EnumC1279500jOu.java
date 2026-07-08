package X;

/* JADX INFO: renamed from: X.0jOu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1279500jOu {
    INIT_ERROR(1),
    SUBSCRIBE_ERROR(2),
    PUSH_ERROR(3),
    DECODE_ERROR(4),
    RENDER_ERROR(5),
    GENERAL_ERROR(6);

    public final int LL;

    public static EnumC1279500jOu valueOf(String str) {
        return (EnumC1279500jOu) C08FF.LIZ(EnumC1279500jOu.class, str);
    }

    public final int getValue() {
        return this.LL;
    }

    EnumC1279500jOu(int i) {
        this.LL = i;
    }
}
