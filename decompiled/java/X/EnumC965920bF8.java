package X;

/* JADX INFO: renamed from: X.0bF8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public enum EnumC965920bF8 {
    OutsideRoomInviteSourceUnknown,
    OutsideRoomInviteSourcePanel,
    OutsideRoomInviteSourceCapsule,
    OutsideRoomInviteSourceEmptyPosition;

    public static final C968300bIy Companion = new Object() { // from class: X.0bIy
    };

    public static EnumC965920bF8 valueOf(String str) {
        return (EnumC965920bF8) C08FF.LIZ(EnumC965920bF8.class, str);
    }

    public final EnumC2231881CXa into() {
        int i = C965910bF7.LIZ[ordinal()];
        if (i == 1) {
            return EnumC2231881CXa.VAR_MULTI_GUEST_OUTSIDE_ROOM_INVITE_SOURCE_OUTSIDE_ROOM_INVITE_SOURCE_UNKNOWN;
        }
        if (i == 2) {
            return EnumC2231881CXa.VAR_MULTI_GUEST_OUTSIDE_ROOM_INVITE_SOURCE_OUTSIDE_ROOM_INVITE_SOURCE_PANEL;
        }
        if (i == 3) {
            return EnumC2231881CXa.VAR_MULTI_GUEST_OUTSIDE_ROOM_INVITE_SOURCE_OUTSIDE_ROOM_INVITE_SOURCE_CAPSULE;
        }
        if (i == 4) {
            return EnumC2231881CXa.VAR_MULTI_GUEST_OUTSIDE_ROOM_INVITE_SOURCE_OUTSIDE_ROOM_INVITE_SOURCE_EMPTY_POSITION;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C965910bF7.LIZ[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            throw new C1954807lC();
        }
        return 3;
    }
}
