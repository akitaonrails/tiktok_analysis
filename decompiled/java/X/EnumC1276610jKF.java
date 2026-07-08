package X;

/* JADX INFO: renamed from: X.0jKF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1276610jKF {
    VOLUME_INDICATION_CONTENT_MODE_FULL(0),
    VOLUME_INDICATION_CONTENT_MODE_VOLUME_ONLY(1);

    public final int LL;

    public int value() {
        return this.LL;
    }

    public static EnumC1276610jKF valueOf(String str) {
        return (EnumC1276610jKF) C08FF.LIZ(EnumC1276610jKF.class, str);
    }

    EnumC1276610jKF(int i) {
        this.LL = i;
    }
}
