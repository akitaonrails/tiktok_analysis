package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameMultiStreamWatch;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: renamed from: X.0IER, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IER {
    public static boolean LIZJ(Context context) {
        Resources resources;
        Configuration configuration;
        if (context != null && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null && configuration.orientation == 2) {
            return true;
        }
        return false;
    }

    public static void LIZLLL(String str) {
        C20441214yg.LJIIIZ("LandscapePlayHelper", str);
    }

    public static String LIZ(boolean z, Room room) {
        if (room.multiStreamScene == 1 && LiveGameMultiStreamWatch.INSTANCE.isExperimentGroup()) {
            if ((room.isMainStreamHorizontal() && z) || (!room.isMainStreamHorizontal() && !z)) {
                return room.getMultiStreamDefaultQualitySdkKey();
            }
            return room.getExtraStreamDefaultQualitySdkKey();
        }
        return room.getMultiStreamDefaultQualitySdkKey();
    }

    public static String LIZIZ(boolean z, Room room) {
        if (room.multiStreamScene == 1 && LiveGameMultiStreamWatch.INSTANCE.isExperimentGroup()) {
            if ((room.isMainStreamHorizontal() && z) || (!room.isMainStreamHorizontal() && !z)) {
                return room.getMultiStreamData();
            }
            return room.getExtraStreamData();
        }
        return room.getMultiStreamData();
    }
}
