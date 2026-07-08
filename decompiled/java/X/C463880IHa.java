package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveWatchPreloadSettings;
import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.LiveTrimStreamDataExp;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0IHa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C463880IHa {
    public static final C463880IHa LIZ = new C463880IHa();
    public static C464960ILe LIZIZ;

    public static final void LIZ() {
        C464960ILe c464960ILe = LIZIZ;
        if (c464960ILe != null) {
            c464960ILe.LIZJ();
        }
        C464960ILe c464960ILe2 = LIZIZ;
        if (c464960ILe2 != null) {
            C464950ILd.LJI.LIZ(c464960ILe2.LLJ, c464960ILe2.LLJI);
        }
        LIZIZ = null;
    }

    public static final void LIZJ(EnterRoomConfig enterRoomConfig, Context context) {
        String strLIZIZ;
        boolean z;
        if (enterRoomConfig == null || context == null) {
            return;
        }
        if (!TextUtils.isEmpty(enterRoomConfig.mRoomsData.enterFromMergeRecommend)) {
            strLIZIZ = enterRoomConfig.mRoomsData.enterFromMergeRecommend;
        } else if (TextUtils.isEmpty(enterRoomConfig.mRoomsData.enterFromMerge)) {
            strLIZIZ = "";
        } else if (TextUtils.isEmpty(enterRoomConfig.mRoomsData.enterMethod)) {
            strLIZIZ = enterRoomConfig.mRoomsData.enterFromMerge;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(enterRoomConfig.mRoomsData.enterFromMerge);
            sbLIZ.append('-');
            sbLIZ.append(enterRoomConfig.mRoomsData.enterMethod);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        HashMap<String, String> mapLJI = C0IXW.LJI(C0IXW.LJIIIIZZ(enterRoomConfig));
        C01GW<C468070IXd> c01gw = C468070IXd.LJIIIIZZ;
        if (C468070IXd.LIZ(C0IFC.LIZ(), Long.valueOf(enterRoomConfig.mRoomsData.roomId), false, 2) != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("commerce_flow_banner-");
            sbLIZ2.append(C468070IXd.LIZ(C0IFC.LIZ(), Long.valueOf(enterRoomConfig.mRoomsData.roomId), false, 2));
            mapLJI.put("enter_method", C2188811AlT.LIZIZ(sbLIZ2));
        }
        HashMap map = new HashMap();
        map.put("ecommerce_use_async_load", String.valueOf(enterRoomConfig.mECData.isPrefetchPinEnabled));
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        String str = roomsData.shareFromUserId;
        if (roomsData.fromShareDeepLink && ((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).Lc1()) {
            str = enterRoomConfig.mLogData.shareFromUserId;
            z = true;
        } else {
            z = false;
        }
        C464960ILe c464960ILe = LIZIZ;
        if (c464960ILe != null) {
            c464960ILe.LIZJ();
        }
        InterfaceC463940IHg interfaceC463940IHg = new InterfaceC463940IHg() { // from class: X.0IHb
            @Override // X.InterfaceC463940IHg
            public final void LIZ(C463950IHh c463950IHh) {
            }

            @Override // X.InterfaceC463940IHg
            public final void LIZIZ(C463950IHh c463950IHh) {
            }

            @Override // X.InterfaceC463940IHg
            public final void LIZJ(C463950IHh c463950IHh) {
            }

            @Override // X.InterfaceC463940IHg
            public final void LIZLLL(int i, String str2, String str3, String str4) {
            }
        };
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        long j = roomsData2.roomId;
        EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
        String str2 = logData.requestId;
        String str3 = roomsData2.enterType;
        String str4 = roomsData2.roomLabels;
        String str5 = logData.liveReason;
        String str6 = roomsData2.enterFromMerge;
        String str7 = roomsData2.enterMethod;
        String strLJIIIIZZ = C0IVR.LJIIIIZZ(enterRoomConfig);
        EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
        String str8 = strLIZIZ;
        C464960ILe c464960ILe2 = new C464960ILe(interfaceC463940IHg, j, str2, str3, str4, str8, str5, str, mapLJI, str6, str7, map, strLJIIIIZZ, roomsData3.isFresh, roomsData3.actionType, roomsData3.wbcTag, roomsData3.streamType, z, roomsData3.enterTag, roomsData3.mentionMsgId, roomsData3.mgEnterType, roomsData3.mgFromSourceUserId);
        LIZIZ = c464960ILe2;
        long j2 = enterRoomConfig.mLogData.fromPortalId;
        if (j2 > 0) {
            c464960ILe2.LLJJIJIIJIL = j2;
        }
        boolean zIsEnableTrim = LiveTrimStreamDataExp.isEnableTrim(enterRoomConfig);
        C464960ILe c464960ILe3 = LIZIZ;
        if (c464960ILe3 != null) {
            c464960ILe3.LIZIZ("", null, zIsEnableTrim, true);
        }
        LiveWatchPreloadSettings.INSTANCE.messageManagerDisable();
    }

    public static final void LIZIZ(long j, long j2, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j);
        sbLIZ.append('-');
        sbLIZ.append(str);
        C1176404iw.LIZ(j2, C2188811AlT.LIZIZ(sbLIZ));
    }
}
