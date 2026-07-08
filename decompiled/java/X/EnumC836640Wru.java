package X;

/* JADX INFO: renamed from: X.0Wru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public enum EnumC836640Wru {
    NO_STABLE_HARDWARE_ID,
    NO_ACTIVE_WALLET_FOUND,
    TAP_AND_PAY_UNAVAILABLE,
    EPHEMERAL_KEY_ERROR,
    PUSH_PROVISIONING_ENCRYPTED_PAYLOAD_ERROR,
    CARD_CANCELED,
    CARD_TESTMODE,
    USER_CANCELED,
    UNKNOWN_ERROR;

    public static EnumC836640Wru valueOf(String str) {
        return (EnumC836640Wru) C08FF.LIZ(EnumC836640Wru.class, str);
    }
}
