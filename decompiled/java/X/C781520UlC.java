package X;

import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: renamed from: X.0UlC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C781520UlC {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(LiveMode liveMode) {
        if (liveMode != LiveMode.SCREEN_RECORD && liveMode != LiveMode.LIVE_STUDIO && liveMode != LiveMode.THIRD_PARTY) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(Room room) {
        LiveMode streamType;
        if (room != null) {
            streamType = room.getStreamType();
        } else {
            streamType = null;
        }
        return LIZ(streamType);
    }

    public static boolean LIZJ(LiveMode liveMode) {
        if (liveMode == LiveMode.LIVE_STUDIO) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(Room room) {
        LiveMode streamType;
        if (room != null) {
            streamType = room.getStreamType();
        } else {
            streamType = null;
        }
        return LIZJ(streamType);
    }

    public static boolean LJ(LiveMode liveMode) {
        if (liveMode == LiveMode.LIVE_VOICE) {
            return true;
        }
        return false;
    }

    public static boolean LJFF(Room room) {
        LiveMode streamType;
        if (room != null) {
            streamType = room.getStreamType();
        } else {
            streamType = null;
        }
        return LJ(streamType);
    }

    public static boolean LJI(LiveMode liveMode) {
        if (liveMode == LiveMode.SCREEN_RECORD) {
            return true;
        }
        return false;
    }

    public static boolean LJII(Room room) {
        LiveMode streamType;
        if (room != null) {
            streamType = room.getStreamType();
        } else {
            streamType = null;
        }
        return LJI(streamType);
    }

    public static boolean LJIIIIZZ(Room room) {
        CommerceStruct commerceStruct;
        if (room == null || (commerceStruct = room.getCommerceStruct()) == null || !commerceStruct.isEcomShoppingMode()) {
            return false;
        }
        return true;
    }

    public static boolean LJIIIZ(LiveMode liveMode) {
        if (liveMode == LiveMode.THIRD_PARTY) {
            return true;
        }
        return false;
    }

    public static boolean LJIIJ(Room room) {
        LiveMode streamType;
        if (room != null) {
            streamType = room.getStreamType();
        } else {
            streamType = null;
        }
        return LJIIIZ(streamType);
    }

    public static boolean LJIIJJI(LiveMode liveMode) {
        if (liveMode == LiveMode.VIDEO) {
            return true;
        }
        return false;
    }

    public static boolean LJIIL(Room room) {
        LiveMode streamType;
        if (room != null) {
            streamType = room.getStreamType();
        } else {
            streamType = null;
        }
        return LJIIJJI(streamType);
    }
}
