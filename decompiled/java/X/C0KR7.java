package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: renamed from: X.0KR7, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KR7 extends C0KR9 {
    public C11JF LLILLL;

    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final void release() {
        super.release();
        C11JF c11jf = this.LLILLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
    }

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
        Context context;
        final Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        Map<String, String> mapLJIIZILJ = C0IJT.LIZ("").LJIIZILJ();
        if (room == null) {
            C2382909Vj.LIZ(completionBlock, 0, null, null, 6);
            return;
        }
        InterfaceC481210Itz interfaceC481210ItzMh = ((IShareService) C1161920gLG.LIZJ(IShareService.class)).mh();
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        C19EG c19egLJ = C500260Jjc.LJ(context);
        C1106200etO c1106200etO = new C1106200etO(room);
        c1106200etO.LJIL = mapLJIIZILJ;
        c1106200etO.LJJIL = ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).hL0();
        C1106210etP c1106210etP = new C1106210etP(c1106200etO);
        InterfaceC1372610lp5 interfaceC1372610lp5 = new InterfaceC1372610lp5() { // from class: X.0IhY
            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LIZIZ(HashMap map) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LIZLLL(HashMap map) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJ(HashMap map) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJFF(Dialog dialog) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJI(Dialog dialog) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJII() {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void onDismiss() {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void onShow(int i) {
            }

            @Override // X.InterfaceC1372610lp5
            public final void LIZ(Throwable th) {
                C20441214yg.LJI("SharePanelMethod", th);
            }

            @Override // X.InterfaceC1372610lp5
            public final void LIZJ(String str, String str2, Bundle bundle) {
                long ownerUserId;
                long currentUserId;
                String string = "";
                if (bundle != null) {
                    string = bundle.getString("shareIdList", "");
                }
                C0KR7 c0kr7 = this.LIZ;
                long id = room.getId();
                String labels = room.getLabels();
                c0kr7.getClass();
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                c0kr7.LLILLL = (C11JF) ((IShareService) C1161920gLG.LIZJ(IShareService.class)).ky(labels, id, string, (String) dataChannelGlobal.gg0(C1148270fzF.class)).LJJLL(new C09JN() { // from class: X.0Ihb
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        ShareReportResult shareReportResult;
                        C1C7U.LIZ("SharePanelMethod@7d9c.reportShare$1");
                        BaseResponse baseResponse = (BaseResponse) obj;
                        if (baseResponse != null && baseResponse.data != null && (shareReportResult = (ShareReportResult) baseResponse.data) != null && shareReportResult.getDeltaIntimacy() > 0) {
                            C784440Upu.LIZ().LIZIZ(new C473550Ihd((ShareReportResult) baseResponse.data));
                        }
                        C1C7U.LIZIZ("SharePanelMethod@7d9c.reportShare$1");
                    }
                }, C0J1R.LIZ);
                C0KR7 c0kr72 = this.LIZ;
                Room room2 = room;
                c0kr72.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("share_success");
                sbLIZ.append(System.currentTimeMillis());
                String mD5String = MD5Utils.getMD5String(C2188811AlT.LIZIZ(sbLIZ));
                C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("share_info", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
                c474500IjALIZIZ.LJJII(mD5String, "bind_id");
                c474500IjALIZIZ.LJJII(string, "to_user_id");
                c474500IjALIZIZ.LIZ();
                HashMap map = new HashMap();
                map.put("share_platform", str);
                map.put("share_type", str2);
                map.put("bind_id", mD5String);
                if (room2 != null && room2.getLog_pb() != null) {
                    map.put("log_pb", room2.getLog_pb());
                }
                w.LIZ.getClass();
                String strLJIILJJIL = w.LJIILJJIL();
                Room room3 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                if (room3 != null) {
                    ownerUserId = room3.getOwnerUserId();
                } else {
                    ownerUserId = -1;
                }
                if (interfaceC500940JkiUser != null) {
                    currentUserId = interfaceC500940JkiUser.getCurrentUserId();
                } else {
                    currentUserId = -2;
                }
                if (ownerUserId != currentUserId && ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).vp0()) {
                    map.put("connection_type", "manual_pk");
                    map.put("pk_id", String.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getBattleId()));
                }
                if (!TextUtils.isEmpty(strLJIILJJIL) && Intrinsics.LJFF("click_push_live_cd_user", strLJIILJJIL)) {
                    map.put("is_subscribe", "1");
                } else {
                    map.put("is_subscribe", CardStruct.IStatusCode.DEFAULT);
                }
                if (C497740JfY.LJIL()) {
                    map.put("room_orientation", "portrait");
                } else {
                    map.put("room_orientation", "landscape");
                }
                ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class);
                map.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
                map.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
                iLiveHostCrossRoomEventHelper.addPkTransfer(map, room2, "SharePanelMethod_logLiveShare");
                map.put("multi_tool", ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).No2());
                C474500IjA c474500IjALIZ = C0IJT.LIZ("share");
                c474500IjALIZ.LJJIIZI(map);
                c474500IjALIZ.LJ("click");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LIZ();
            }
        };
        C481220Iu0 c481220Iu0 = (C481220Iu0) interfaceC481210ItzMh;
        c481220Iu0.getClass();
        c1106210etP.LIZIZ();
        c481220Iu0.LIZ(c19egLJ, c1106210etP, interfaceC1372610lp5);
        C0KR8 c0kr8 = (C0KR8) C1909107dp.LIZJ(C0KR8.class, null);
        c0kr8.setCode(1);
        completionBlock.onSuccess(c0kr8, "");
    }
}
