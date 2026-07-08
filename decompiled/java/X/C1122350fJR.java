package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Pair;
import webcast.api.sub.SMBPreviewResponse;

/* JADX INFO: renamed from: X.0fJR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122350fJR {
    public static final /* synthetic */ int LIZ = 0;

    public static SMBPreviewResponse.ResponseData LIZ(Room room, String str) {
        String secUid;
        SMBPreviewResponse.ResponseData responseData;
        SMBPreviewResponse.ResponseData responseData2;
        boolean z = false;
        if (room == null) {
            C051E.LIZ("preview.cache", new Pair("stage", str), new Pair("source", "none"), new Pair("reason", "room_null"));
            return null;
        }
        User owner = room.getOwner();
        if (owner != null) {
            secUid = owner.getSecUid();
        } else {
            secUid = null;
        }
        String strValueOf = String.valueOf(room.getId());
        C1103520ep4 c1103520ep4 = C1103520ep4.LIZ;
        C1822320xWQ c1822320xWQLIZJ = C1103520ep4.LIZJ(secUid, strValueOf);
        if (c1822320xWQLIZJ != null) {
            responseData = c1822320xWQLIZJ.LIZ;
        } else {
            responseData = null;
        }
        if (responseData != null) {
            C051E.LIZ("preview.cache", new Pair("stage", str), new Pair("source", "v2"), new Pair("room_id", strValueOf));
            return responseData;
        }
        C1784870wY1 c1784870wY1LIZIZ = C518520KVe.LIZIZ.LIZIZ(secUid, strValueOf);
        if (c1784870wY1LIZIZ != null && (responseData2 = c1784870wY1LIZIZ.LIZJ) != null) {
            C051E.LIZ("preview.cache", new Pair("stage", str), new Pair("source", "v1"), new Pair("room_id", strValueOf));
            return responseData2;
        }
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("stage", str);
        pairArr[1] = new Pair("source", "none");
        pairArr[2] = new Pair("room_id", strValueOf);
        if (secUid == null || secUid.length() == 0) {
            z = true;
        }
        pairArr[3] = new Pair("has_anchor", Boolean.valueOf(!z));
        C051E.LIZ("preview.cache", pairArr);
        return null;
    }
}
