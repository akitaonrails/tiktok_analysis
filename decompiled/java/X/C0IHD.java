package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;

/* JADX INFO: renamed from: X.0IHD, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IHD {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public Integer LIZLLL = null;
    public Integer LJ = null;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SurfaceAttachReason(roomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterRoomScene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", from=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", curPos=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", targetPos=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final C0IHD LIZ(InterfaceC466370IQp interfaceC466370IQp, String str) {
        long j;
        String str2;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.RoomsData roomsData2;
        EnterRoomConfig enterRoomConfigEq = interfaceC466370IQp.Eq();
        if (enterRoomConfigEq != null && (roomsData2 = enterRoomConfigEq.mRoomsData) != null) {
            j = roomsData2.roomId;
        } else {
            j = 0;
        }
        EnterRoomConfig enterRoomConfigEq2 = interfaceC466370IQp.Eq();
        if (enterRoomConfigEq2 == null || (roomsData = enterRoomConfigEq2.mRoomsData) == null || (str2 = roomsData.enterRoomScene) == null) {
            str2 = "";
        }
        return new C0IHD(j, str2, str);
    }

    public C0IHD(long j, String str, String str2) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
