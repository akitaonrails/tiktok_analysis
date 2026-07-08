package X;

import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0KVP, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KVP extends C0KVR {
    @Override // X.AbstractC1549150qPp
    public final boolean shouldUseOriginalData(InterfaceC634840OvC interfaceC634840OvC) {
        EnumC1063300dmC enumC1063300dmC;
        C1543410qGZ c1543410qGZLIZJ;
        C1543190qGD c1543190qGD;
        if (interfaceC634840OvC != null && (c1543410qGZLIZJ = interfaceC634840OvC.LIZJ()) != null && (c1543190qGD = c1543410qGZLIZJ.LIZ.LIZ) != null) {
            enumC1063300dmC = c1543190qGD.LJIILJJIL;
        } else {
            enumC1063300dmC = null;
        }
        if (enumC1063300dmC == EnumC1063300dmC.WEB) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Integer numValueOf;
        String enterFromMerge;
        String enterMethod = null;
        C0KVQ c0kvq = (C0KVQ) C1909107dp.LIZJ(C0KVQ.class, null);
        IMicRoomService iMicRoomService = (IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class);
        if (iMicRoomService != null) {
            boolValueOf = Boolean.valueOf(iMicRoomService.tp1());
        } else {
            boolValueOf = Boolean.FALSE;
        }
        c0kvq.setLiveHouseAudience(boolValueOf);
        IMicRoomService iMicRoomService2 = (IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class);
        if (iMicRoomService2 != null) {
            boolValueOf2 = Boolean.valueOf(iMicRoomService2.On1());
        } else {
            boolValueOf2 = Boolean.FALSE;
        }
        c0kvq.setInLiveHouseRoom(boolValueOf2);
        int iEO0 = 0;
        if (C0IUA.LJIILJJIL) {
            IMicRoomService iMicRoomService3 = (IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class);
            if (iMicRoomService3 != null && iMicRoomService3.t42()) {
                iEO0 = C0IUA.LIZIZ ? 2 : 1;
            }
            numValueOf = Integer.valueOf(iEO0);
        } else {
            IMicRoomService iMicRoomService4 = (IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class);
            if (iMicRoomService4 != null) {
                iEO0 = iMicRoomService4.eO0();
            }
            numValueOf = Integer.valueOf(iEO0);
        }
        c0kvq.setAnchorType(numValueOf);
        IMicRoomService iMicRoomService5 = (IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class);
        if (iMicRoomService5 != null) {
            enterFromMerge = iMicRoomService5.getEnterFromMerge();
        } else {
            enterFromMerge = null;
        }
        c0kvq.setEnterFromMerge(enterFromMerge);
        IMicRoomService iMicRoomService6 = (IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class);
        if (iMicRoomService6 != null) {
            enterMethod = iMicRoomService6.getEnterMethod();
        }
        c0kvq.setEnterMethod(enterMethod);
        Map<String, String> roomInfo = ((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).getRoomInfo();
        c0kvq.setLineupRoomId(roomInfo.get("room_id"));
        c0kvq.setLineupAuthorId(roomInfo.get("anchor_id"));
        c0kvq.setRoomId(roomInfo.get("actual_room_id"));
        c0kvq.setAuthorId(roomInfo.get("anchor_id"));
        c0kvq.setLiveLineupType(roomInfo.get("live_lineup_type"));
        c0kvq.setLiveLineupUserType(roomInfo.get("live_lineup_user_type"));
        c0kvq.setLiveLineupChangeType(roomInfo.get("live_lineup_change_type"));
        completionBlock.onSuccess(c0kvq, "");
    }
}
