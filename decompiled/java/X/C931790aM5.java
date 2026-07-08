package X;

import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.k;
import com.google.gson.n;
import webcast.data.RoomMultiGuestLinkmicInfo;

/* JADX INFO: renamed from: X.0aM5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C931790aM5 {
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c7, code lost:
    
        if (X.C918060Zzw.LIZ(r0) != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ() {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C931790aM5.LIZIZ():boolean");
    }

    public static Boolean LIZ(Room room) {
        String str;
        boolean zLJ;
        n nVar;
        k kVarLJJIIZ;
        k kVarLJJIIZ2;
        k kVarLJJIIZ3;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        RoomMultiGuestLinkmicInfo roomMultiGuestLinkmicInfo;
        MultiLiveUserSettings multiLiveUserSettings = room.multiLiveUserSettings;
        if (multiLiveUserSettings != null && (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) != null && (roomMultiGuestLinkmicInfo = multiLiveUserApplySettings.roomMultiGuestLinkmicInfo) != null) {
            str = roomMultiGuestLinkmicInfo.linkmicRoomCreateAbParam;
        } else {
            str = null;
        }
        n nVarLJFF = C2348809Ig.LJFF(str);
        if (nVarLJFF != null && (kVarLJJIIZ3 = nVarLJFF.LJJIIZ("linkmic_sdk_layout_refactor")) != null) {
            zLJ = kVarLJJIIZ3.LJ();
        } else {
            String str2 = room.roomCreateAbParam;
            if (str2 != null && (nVar = (n) GsonProtectorUtils.fromJson(C19748512Ol.LIZJ, str2, n.class)) != null && (kVarLJJIIZ = nVar.LJJIIZ("linkmic_ab_params")) != null && (kVarLJJIIZ2 = kVarLJJIIZ.LJIILIIL().LJJIIZ("linkmic_sdk_layout_refactor")) != null) {
                zLJ = kVarLJJIIZ2.LJ();
            } else {
                zLJ = false;
            }
        }
        return Boolean.valueOf(zLJ);
    }
}
