package X;

/* JADX INFO: renamed from: X.0jzX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1302210jzX {
    NEW,
    DIALING,
    RINGING,
    ACTIVE,
    INACTIVE,
    DISCONNECTED,
    GLOBAL_MUTED,
    GLOBAL_UNMUTE;

    public static EnumC1302210jzX valueOf(String str) {
        return (EnumC1302210jzX) C08FF.LIZ(EnumC1302210jzX.class, str);
    }

    public final boolean isFocusState() {
        return this == NEW || this == DIALING || this == RINGING || this == ACTIVE;
    }

    public final boolean isGlobalMuteState() {
        return this == GLOBAL_UNMUTE || this == GLOBAL_MUTED;
    }

    public final boolean isInactiveState() {
        return this == INACTIVE || this == DISCONNECTED;
    }

    public final boolean isMuted() {
        return this == GLOBAL_MUTED;
    }

    public final boolean isCallControlState() {
        return isFocusState() || isInactiveState();
    }
}
