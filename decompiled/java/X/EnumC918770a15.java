package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a15, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC918770a15 {
    public static final EnumC918770a15 ALREADY_INVITED;
    public static final EnumC918770a15 CHECKING_MAX_POSITION;
    public static final EnumC918770a15 COHOST_INTERCEPTED;
    public static final EnumC918770a15 COHOST_INVITE_IN_PROGRESS;
    public static final EnumC918770a15 COHOST_MAX_GUEST_REACHED;
    public static final EnumC918770a15 FREQ_LIMITED;
    public static final EnumC918770a15 INVALID_UID;
    public static final EnumC918770a15 INVITE_SOURCE_EMPTY;
    public static final EnumC918770a15 IN_ROOM_MODE_DISABLED;
    public static final EnumC918770a15 LAYOUT_ID_MISSING;
    public static final /* synthetic */ EnumC918770a15[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC918770a15 MAX_LINK_REACHED;
    public static final EnumC918770a15 MIX_MODE_NOT_AVAILABLE;
    public static final EnumC918770a15 NONE;
    public static final EnumC918770a15 TARGET_ALREADY_LINKED;
    public static final EnumC918770a15 TARGET_PREVIOUSLY_REJECTED;
    public static final EnumC918770a15 TARGET_WAITING;
    public static final EnumC918770a15 UNKNOWN;

    public static InterfaceC2044707zh<EnumC918770a15> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC918770a15 enumC918770a15 = new EnumC918770a15("NONE", 0);
        NONE = enumC918770a15;
        EnumC918770a15 enumC918770a152 = new EnumC918770a15("FREQ_LIMITED", 1);
        FREQ_LIMITED = enumC918770a152;
        EnumC918770a15 enumC918770a153 = new EnumC918770a15("COHOST_INTERCEPTED", 2);
        COHOST_INTERCEPTED = enumC918770a153;
        EnumC918770a15 enumC918770a154 = new EnumC918770a15("MIX_MODE_NOT_AVAILABLE", 3);
        MIX_MODE_NOT_AVAILABLE = enumC918770a154;
        EnumC918770a15 enumC918770a155 = new EnumC918770a15("INVALID_UID", 4);
        INVALID_UID = enumC918770a155;
        EnumC918770a15 enumC918770a156 = new EnumC918770a15("INVITE_SOURCE_EMPTY", 5);
        INVITE_SOURCE_EMPTY = enumC918770a156;
        EnumC918770a15 enumC918770a157 = new EnumC918770a15("LAYOUT_ID_MISSING", 6);
        LAYOUT_ID_MISSING = enumC918770a157;
        EnumC918770a15 enumC918770a158 = new EnumC918770a15("IN_ROOM_MODE_DISABLED", 7);
        IN_ROOM_MODE_DISABLED = enumC918770a158;
        EnumC918770a15 enumC918770a159 = new EnumC918770a15("ALREADY_INVITED", 8);
        ALREADY_INVITED = enumC918770a159;
        EnumC918770a15 enumC918770a1510 = new EnumC918770a15("TARGET_WAITING", 9);
        TARGET_WAITING = enumC918770a1510;
        EnumC918770a15 enumC918770a1511 = new EnumC918770a15("TARGET_ALREADY_LINKED", 10);
        TARGET_ALREADY_LINKED = enumC918770a1511;
        EnumC918770a15 enumC918770a1512 = new EnumC918770a15("MAX_LINK_REACHED", 11);
        MAX_LINK_REACHED = enumC918770a1512;
        EnumC918770a15 enumC918770a1513 = new EnumC918770a15("TARGET_PREVIOUSLY_REJECTED", 12);
        TARGET_PREVIOUSLY_REJECTED = enumC918770a1513;
        EnumC918770a15 enumC918770a1514 = new EnumC918770a15("COHOST_INVITE_IN_PROGRESS", 13);
        COHOST_INVITE_IN_PROGRESS = enumC918770a1514;
        EnumC918770a15 enumC918770a1515 = new EnumC918770a15("COHOST_MAX_GUEST_REACHED", 14);
        COHOST_MAX_GUEST_REACHED = enumC918770a1515;
        EnumC918770a15 enumC918770a1516 = new EnumC918770a15("UNKNOWN", 15);
        UNKNOWN = enumC918770a1516;
        EnumC918770a15 enumC918770a1517 = new EnumC918770a15("CHECKING_MAX_POSITION", 16);
        CHECKING_MAX_POSITION = enumC918770a1517;
        EnumC918770a15[] enumC918770a15Arr = {enumC918770a15, enumC918770a152, enumC918770a153, enumC918770a154, enumC918770a155, enumC918770a156, enumC918770a157, enumC918770a158, enumC918770a159, enumC918770a1510, enumC918770a1511, enumC918770a1512, enumC918770a1513, enumC918770a1514, enumC918770a1515, enumC918770a1516, enumC918770a1517};
        LL = enumC918770a15Arr;
        LLILLJJLI = new C2254308sP(enumC918770a15Arr);
    }

    public static EnumC918770a15[] values() {
        return (EnumC918770a15[]) LL.clone();
    }

    public static EnumC918770a15 valueOf(String str) {
        return (EnumC918770a15) C08FF.LIZ(EnumC918770a15.class, str);
    }

    public EnumC918770a15(String str, int i) {
    }
}
