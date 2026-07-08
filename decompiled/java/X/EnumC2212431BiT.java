package X;

/* JADX INFO: renamed from: X.1BiT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2212431BiT {
    ENABLE_VALID_TIME_DISABLED(0),
    CLIENT_TIME_USED(1),
    REMOTE_TIME_USED(2),
    NO_PRE_LAUNCH_TIME_FIRST_INSTALL(3),
    NO_PRE_LAUNCH_TIME_RESTART(4),
    CALCULATED_TIME(5);

    public final int LL;

    public int getCode() {
        return this.LL;
    }

    public static EnumC2212431BiT valueOf(String str) {
        return (EnumC2212431BiT) C08FF.LIZ(EnumC2212431BiT.class, str);
    }

    EnumC2212431BiT(int i) {
        this.LL = i;
    }
}
