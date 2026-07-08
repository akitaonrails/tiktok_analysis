package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0IJ7, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IJ7 {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(EnterRoomConfig enterRoomConfig) {
        EnterRoomConfig.SearchWrapData searchWrapData;
        if (enterRoomConfig != null && (searchWrapData = enterRoomConfig.mSearchData) != null) {
            return searchWrapData.isFromSearch;
        }
        return false;
    }

    public static final boolean LIZIZ(Context context) {
        C19EG c19egLJ;
        if (C464660IKa.LIZ()) {
            return ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isLivePlayActivity(context);
        }
        if (context != null && (c19egLJ = C500260Jjc.LJ(context)) != null && !TextUtils.isEmpty(c19egLJ.toString()) && !a0.LJJIIZI(c19egLJ.toString(), ".LivePlayActivity", false)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(EnterRoomConfig enterRoomConfig) {
        EnterRoomConfig.RoomsData roomsData;
        if (enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
            return roomsData.isMixLive;
        }
        return false;
    }

    public static final boolean LIZLLL(Context context) {
        if (context != null) {
            return !LIZIZ(context);
        }
        return false;
    }
}
