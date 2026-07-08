package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bY6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC977680bY6 {
    public static final EnumC977680bY6 ACTIVE_BATTLE_ID;
    public static final EnumC977680bY6 CHANNEL_ID_INVALID;
    public static final EnumC977680bY6 HOSTS_CHANGED;
    public static final EnumC977680bY6 INVITE_IN_FLIGHT;
    public static final /* synthetic */ EnumC977680bY6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC977680bY6 TEAM_EMPTY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC977680bY6> getEntries() {
        return LLILLL;
    }

    static {
        EnumC977680bY6 enumC977680bY6 = new EnumC977680bY6("INVITE_IN_FLIGHT", 0, "invite_in_flight");
        INVITE_IN_FLIGHT = enumC977680bY6;
        EnumC977680bY6 enumC977680bY62 = new EnumC977680bY6("ACTIVE_BATTLE_ID", 1, "active_battle_id");
        ACTIVE_BATTLE_ID = enumC977680bY62;
        EnumC977680bY6 enumC977680bY63 = new EnumC977680bY6("CHANNEL_ID_INVALID", 2, "channel_id_invalid");
        CHANNEL_ID_INVALID = enumC977680bY63;
        EnumC977680bY6 enumC977680bY64 = new EnumC977680bY6("TEAM_EMPTY", 3, "team_empty");
        TEAM_EMPTY = enumC977680bY64;
        EnumC977680bY6 enumC977680bY65 = new EnumC977680bY6("HOSTS_CHANGED", 4, "hosts_changed");
        HOSTS_CHANGED = enumC977680bY65;
        EnumC977680bY6[] enumC977680bY6Arr = {enumC977680bY6, enumC977680bY62, enumC977680bY63, enumC977680bY64, enumC977680bY65};
        LLILLJJLI = enumC977680bY6Arr;
        LLILLL = new C2254308sP(enumC977680bY6Arr);
    }

    public static EnumC977680bY6[] values() {
        return (EnumC977680bY6[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC977680bY6 valueOf(String str) {
        return (EnumC977680bY6) C08FF.LIZ(EnumC977680bY6.class, str);
    }

    public EnumC977680bY6(String str, int i, String str2) {
        this.LL = str2;
    }
}
