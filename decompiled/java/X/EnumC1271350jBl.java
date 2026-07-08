package X;

/* JADX INFO: renamed from: X.0jBl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1271350jBl {
    IDLE,
    PREPARING,
    PREPARED,
    PLAYING,
    PAUSED,
    STOPPED,
    COMPLETED,
    ERROR;

    public static EnumC1271350jBl valueOf(String str) {
        return (EnumC1271350jBl) C08FF.LIZ(EnumC1271350jBl.class, str);
    }
}
