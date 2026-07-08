package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.share.LiveShareDialog;
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

/* JADX INFO: renamed from: X.0KFi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C514400KFi extends C0KJV {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC634840OvC interfaceC634840OvC;
        Activity activityLIZLLL;
        boolean z;
        Activity activityLIZLLL2;
        C19EG c19eg;
        boolean z2;
        InterfaceC514410KFj interfaceC514410KFj = (InterfaceC514410KFj) xBaseParamModel;
        Context context = null;
        final C0KFU c0kfu = (C0KFU) C1909107dp.LIZJ(C0KFU.class, null);
        final Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        Map<String, String> mapLJIIZILJ = C0IJT.LIZ("").LJIIZILJ();
        if (room != null && (interfaceC634840OvC = this.IBridgeSdkContext) != null && (activityLIZLLL = interfaceC634840OvC.LIZLLL()) != 0) {
            if (activityLIZLLL.getResources().getConfiguration().orientation == 1) {
                z = true;
            } else {
                z = false;
            }
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                activityLIZLLL2 = interfaceC634840OvC2.LIZLLL();
            } else {
                activityLIZLLL2 = null;
            }
            if ((activityLIZLLL2 instanceof C19EG) && (c19eg = (C19EG) activityLIZLLL2) != null) {
                if ((C504210Jpz.LIZ || C464660IKa.LIZ()) && (!C294780Bgy.LIZ() ? !(!(activityLIZLLL instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activityLIZLLL).getEnableSAF()) : (activityLIZLLL instanceof InterfaceC214897198d))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                if (interfaceC634840OvC3 != null) {
                    context = interfaceC634840OvC3.getContext();
                }
                FragmentManager fragmentManagerLJIL = C520010KaN.LJIL(context, false);
                if (fragmentManagerLJIL == null) {
                    fragmentManagerLJIL = c19eg.getSupportFragmentManager();
                }
                InterfaceC481210Itz interfaceC481210ItzMh = ((IShareService) C1161920gLG.LIZJ(IShareService.class)).mh();
                C1106200etO c1106200etO = new C1106200etO(room);
                c1106200etO.LJIL = mapLJIIZILJ;
                c1106200etO.LJJIL = ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).hL0();
                c1106200etO.LJJLIIIJJI = 1;
                c1106200etO.LJIIJ = interfaceC514410KFj.getTitle();
                c1106200etO.LJIIJJI = interfaceC514410KFj.getContent();
                c1106200etO.LJJJI = z;
                c1106200etO.LJJJIL = true;
                c1106200etO.LJJLIIIJL = z2;
                C1106210etP c1106210etP = new C1106210etP(c1106200etO);
                InterfaceC1372610lp5 interfaceC1372610lp5 = new InterfaceC1372610lp5() { // from class: X.0Ihe
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
                        C20441214yg.LJI("ShareGameLiveMethod", th);
                        c0kfu.setSuccess(Boolean.FALSE);
                        c0kfu.setPlatform("");
                        completionBlock.onSuccess(c0kfu, "");
                    }

                    @Override // X.InterfaceC1372610lp5
                    public final void LIZJ(String str, String str2, Bundle bundle) {
                        long ownerUserId;
                        long currentUserId;
                        String string = "";
                        if (bundle != null) {
                            string = bundle.getString("shareIdList", "");
                        }
                        C514400KFi c514400KFi = this.LIZ;
                        long id = room.getId();
                        String labels = room.getLabels();
                        c514400KFi.getClass();
                        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                        ((IShareService) C1161920gLG.LIZJ(IShareService.class)).ky(labels, id, string, (String) dataChannelGlobal.gg0(C1148270fzF.class)).LJJLL(new C09JN() { // from class: X.0Ihc
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                ShareReportResult shareReportResult;
                                C1C7U.LIZ("ShareGameLiveMethod@7744.reportShare$1");
                                BaseResponse baseResponse = (BaseResponse) obj;
                                if (baseResponse != null && (shareReportResult = (ShareReportResult) baseResponse.data) != null && shareReportResult.getDeltaIntimacy() > 0) {
                                    C784440Upu.LIZ().LIZIZ(new C473550Ihd((ShareReportResult) baseResponse.data));
                                }
                                C1C7U.LIZIZ("ShareGameLiveMethod@7744.reportShare$1");
                            }
                        }, C0J1R.LIZ);
                        c514400KFi.getClass();
                        C514400KFi c514400KFi2 = this.LIZ;
                        Room room2 = room;
                        c514400KFi2.getClass();
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
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("share");
                        c474500IjALIZ.LJJIIZI(map);
                        c474500IjALIZ.LJ("click");
                        c474500IjALIZ.LJIL();
                        c474500IjALIZ.LIZ();
                        c0kfu.setSuccess(Boolean.TRUE);
                        c0kfu.setPlatform(str);
                        completionBlock.onSuccess(c0kfu, "");
                    }
                };
                interfaceC481210ItzMh.getClass();
                if (z) {
                    LiveShareDialog.NR(c19eg, c1106210etP, interfaceC1372610lp5);
                    return;
                }
                LiveShareDialog liveShareDialogMR = LiveShareDialog.MR(c1106210etP, interfaceC1372610lp5);
                if (fragmentManagerLJIL == null) {
                    return;
                }
                liveShareDialogMR.show(fragmentManagerLJIL, "LiveShareDialog");
                return;
            }
            C20441214yg.LJ("ShareGameLiveMethod", "fragmentActivity is null");
        }
    }
}
