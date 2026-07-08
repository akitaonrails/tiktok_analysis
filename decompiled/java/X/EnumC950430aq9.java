package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aq9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC950430aq9 {
    public static final EnumC950430aq9 INVITATION_DENIED;
    public static final EnumC950430aq9 INVITATION_DENIED_TOAST;
    public static final EnumC950430aq9 IS_LINKING;
    public static final EnumC950430aq9 IS_LINKING_TOAST;
    public static final /* synthetic */ EnumC950430aq9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC950430aq9 LOW_CLIENT_VERSION;
    public static final EnumC950430aq9 MATURE_THEME_NOT_MATCH;
    public static final EnumC950430aq9 PERMISSION_DENIED;
    public static final EnumC950430aq9 POS_FULL;
    public static final EnumC950430aq9 ROOM_PAUSED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC950430aq9> getEntries() {
        return LLILLL;
    }

    static {
        EnumC950430aq9 enumC950430aq9 = new EnumC950430aq9("IS_LINKING", 0, C497740JfY.LJIJI(2131841275));
        IS_LINKING = enumC950430aq9;
        EnumC950430aq9 enumC950430aq92 = new EnumC950430aq9("INVITATION_DENIED", 1, C497740JfY.LJIJI(2131844624));
        INVITATION_DENIED = enumC950430aq92;
        EnumC950430aq9 enumC950430aq93 = new EnumC950430aq9("IS_LINKING_TOAST", 2, C497740JfY.LJIJI(2131840607));
        IS_LINKING_TOAST = enumC950430aq93;
        EnumC950430aq9 enumC950430aq94 = new EnumC950430aq9("INVITATION_DENIED_TOAST", 3, C497740JfY.LJIJI(2131840608));
        INVITATION_DENIED_TOAST = enumC950430aq94;
        EnumC950430aq9 enumC950430aq95 = new EnumC950430aq9("PERMISSION_DENIED", 4, C497740JfY.LJIJI(2131843668));
        PERMISSION_DENIED = enumC950430aq95;
        EnumC950430aq9 enumC950430aq96 = new EnumC950430aq9("LOW_CLIENT_VERSION", 5, C497740JfY.LJIJI(2131844624));
        LOW_CLIENT_VERSION = enumC950430aq96;
        EnumC950430aq9 enumC950430aq97 = new EnumC950430aq9("ROOM_PAUSED", 6, C497740JfY.LJIJI(2131844624));
        ROOM_PAUSED = enumC950430aq97;
        EnumC950430aq9 enumC950430aq98 = new EnumC950430aq9("POS_FULL", 7, C497740JfY.LJIJI(2131841158));
        POS_FULL = enumC950430aq98;
        EnumC950430aq9 enumC950430aq99 = new EnumC950430aq9("MATURE_THEME_NOT_MATCH", 8, C497740JfY.LJIJI(2131844624));
        MATURE_THEME_NOT_MATCH = enumC950430aq99;
        EnumC950430aq9[] enumC950430aq9Arr = {enumC950430aq9, enumC950430aq92, enumC950430aq93, enumC950430aq94, enumC950430aq95, enumC950430aq96, enumC950430aq97, enumC950430aq98, enumC950430aq99};
        LLILLJJLI = enumC950430aq9Arr;
        LLILLL = new C2254308sP(enumC950430aq9Arr);
    }

    public static EnumC950430aq9[] values() {
        return (EnumC950430aq9[]) LLILLJJLI.clone();
    }

    public final String getReason() {
        return this.LL;
    }

    public static EnumC950430aq9 valueOf(String str) {
        return (EnumC950430aq9) C08FF.LIZ(EnumC950430aq9.class, str);
    }

    public EnumC950430aq9(String str, int i, String str2) {
        this.LL = str2;
    }
}
