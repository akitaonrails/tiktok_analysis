package X;

/* JADX INFO: renamed from: X.0XaI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public enum EnumC851200XaI {
    SUCCESS,
    CANCEL,
    NETWORK_ERROR,
    SERVER_ERROR,
    AUTHENTICATION_AGENT_ERROR,
    INTERNAL_ERROR;

    public static EnumC851200XaI valueOf(String str) {
        return (EnumC851200XaI) C08FF.LIZ(EnumC851200XaI.class, str);
    }
}
