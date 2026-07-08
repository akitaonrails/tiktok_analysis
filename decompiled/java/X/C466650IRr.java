package X;

import android.text.TextUtils;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;

/* JADX INFO: renamed from: X.0IRr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C466650IRr {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final EnterRoomConfig.LogData LJI;
    public final EnterRoomConfig.TimeStamp LJII;
    public final int LJIIIIZZ;

    public C466650IRr(int i, EnterRoomConfig enterRoomConfig) {
        this.LJFF = -1;
        if (enterRoomConfig == null) {
            return;
        }
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        this.LIZIZ = roomsData.enterFromMerge;
        this.LIZ = roomsData.enterMethod;
        this.LIZJ = enterRoomConfig.mLogData.guestRequestId;
        this.LIZLLL = roomsData.fromDrawerStyle;
        this.LJ = TextUtils.equals(roomsData.windowMode, "small_picture");
        EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
        this.LJFF = logData.positionOutsideLiveRoom;
        this.LJI = logData;
        this.LJII = enterRoomConfig.mRoomsData.timeStamps;
        this.LJIIIIZZ = i;
    }
}
