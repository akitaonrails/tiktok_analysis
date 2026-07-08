package X;

import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendedRoom;

/* JADX INFO: renamed from: X.002L, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C002L {
    public static final String LIZ(RecommendedRoom recommendedRoom) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendedRoom(roomId=");
        sbLIZ.append(recommendedRoom.roomId);
        sbLIZ.append(", anchorId=");
        sbLIZ.append(recommendedRoom.anchorId);
        sbLIZ.append(",  roomType=");
        sbLIZ.append(recommendedRoom.roomType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
