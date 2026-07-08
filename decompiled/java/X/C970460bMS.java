package X;

/* JADX INFO: renamed from: X.0bMS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C970460bMS {
    public static final String LIZ(int i) {
        if (i == 0) {
            return "room_enter";
        }
        if (i == 1) {
            return "room_enter_battleinfo";
        }
        if (i == 2) {
            return "room_enter_expired";
        }
        if (i == 3) {
            return "cohost_start_battleinfo";
        }
        if (i == 10) {
            return "open_message";
        }
        if (i == EnumC970440bMQ.BATTLE_INFO_SCENE_SEI_FALLBACK.getType()) {
            return "open_message_sei_fallback";
        }
        if (i == EnumC970440bMQ.BATTLE_INFO_SCENE_ARMIES_FALLBACK.getType()) {
            return "armies_fall_back";
        }
        return "other";
    }
}
