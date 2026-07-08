package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0KPl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C517030KPl extends AbstractC517040KPm {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        C19EG c19eg;
        final DataChannel dataChannelProvideDataChannel;
        Activity activityLIZLLL2;
        C19EG c19eg2;
        C1106200etO c1106200etO;
        Object c098200Yq;
        Context context;
        String string;
        Object c098200Yq2;
        JSONObject jSONObject;
        DataChannel dataChannelProvideDataChannel2;
        long currentUserId;
        InterfaceC517050KPn interfaceC517050KPn = (InterfaceC517050KPn) xBaseParamModel;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        String containerID = null;
        if (room == null) {
            C2382909Vj.LIZ(completionBlock, 0, null, null, 6);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            activityLIZLLL = interfaceC634840OvC.LIZLLL();
        } else {
            activityLIZLLL = null;
        }
        if (activityLIZLLL instanceof C19EG) {
            c19eg = (C19EG) activityLIZLLL;
        } else {
            c19eg = null;
        }
        C0IP3 c0ip3LIZIZ = C475510Ikn.LIZIZ(c19eg);
        if (c0ip3LIZIZ != null) {
            dataChannelProvideDataChannel = c0ip3LIZIZ.provideDataChannel();
        } else {
            dataChannelProvideDataChannel = null;
        }
        Map<String, String> mapLJIIZILJ = C0IJT.LIZ("").LJIIZILJ();
        String strLIZIZ = C481180Itw.LIZIZ(room.getOwner());
        if (!a0.LJJJIL(strLIZIZ)) {
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            if (interfaceC500940JkiUser != null) {
                currentUserId = interfaceC500940JkiUser.getCurrentUserId();
            } else {
                currentUserId = 0;
            }
            C2089008Gi c2089008Gi = new C2089008Gi(strLIZIZ);
            c2089008Gi.LIZLLL("enter_from_merge", "share");
            c2089008Gi.LIZLLL("enter_method", "share");
            if (currentUserId > 0) {
                c2089008Gi.LIZJ(currentUserId, "share_from_user_id");
            }
            strLIZIZ = c2089008Gi.LJ();
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            activityLIZLLL2 = interfaceC634840OvC2.LIZLLL();
        } else {
            activityLIZLLL2 = null;
        }
        if (activityLIZLLL2 instanceof C19EG) {
            c19eg2 = (C19EG) activityLIZLLL2;
        } else {
            c19eg2 = null;
        }
        C0IP3 c0ip3LIZIZ2 = C475510Ikn.LIZIZ(c19eg2);
        if (c0ip3LIZIZ2 != null && (dataChannelProvideDataChannel2 = c0ip3LIZIZ2.provideDataChannel()) != null) {
            c1106200etO = C481180Itw.LJII(room, dataChannelProvideDataChannel2, strLIZIZ, "live_room_share_button", mapLJIIZILJ);
            c1106200etO.LJJIL = ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).hL0();
        } else {
            c1106200etO = new C1106200etO(room);
            c1106200etO.LJIIIZ = strLIZIZ;
            c1106200etO.LJJI = "share";
            c1106200etO.LJJIFFI = "share";
            c1106200etO.LJIL = mapLJIIZILJ;
            c1106200etO.LJJIL = ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).hL0();
        }
        c1106200etO.LIZ(Boolean.TRUE, "live_share_use_custom_link_share_content");
        if (!C504670Jqj.LIZIZ(interfaceC517050KPn.getActivityInfo().getShareTitle())) {
            c1106200etO.LIZIZ("default_edit_text_msg", interfaceC517050KPn.getActivityInfo().getShareTitle());
        }
        if (!C504670Jqj.LIZIZ(interfaceC517050KPn.getActivityInfo().getShareSchema())) {
            c1106200etO.LIZIZ("live_referral_key", interfaceC517050KPn.getActivityInfo().getShareSchema());
        }
        try {
            InterfaceC517060KPo shareCustomPanel = interfaceC517050KPn.getShareCustomPanel();
            int iIntValue = shareCustomPanel.getHeight().intValue();
            c1106200etO.LIZIZ("live_share_custom_panel_image_url", shareCustomPanel.getImageUrl());
            if (c1106200etO.LJJJJI == null) {
                c1106200etO.LJJJJI = new Bundle();
            }
            c1106200etO.LJJJJI.putInt("live_share_custom_panel_height_dp", iIntValue);
            C189200o6.m2constructorimpl(c1106200etO);
            c098200Yq = c1106200etO;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20441214yg.LJFF("LiveShareMethod", "map shareCustomPanel failed", thM5exceptionOrNullimpl);
        }
        C1106210etP c1106210etP = new C1106210etP(c1106200etO);
        Bundle bundle = c1106210etP.LJJJJIZL;
        if (bundle != null && (string = bundle.getString("live_referral_key")) != null && string.length() != 0) {
            try {
                String string2 = bundle.getString("bizTrackParams");
                if (string2 != null && string2.length() != 0) {
                    jSONObject = new JSONObject(string2);
                } else {
                    jSONObject = new JSONObject();
                }
                jSONObject.put("page_name", "live_viral_c");
                jSONObject.put("enter_method", "live_viral_page");
                jSONObject.put("entrance_info", "");
                jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
                C786410Ut5.LJJJI("bizTrackParams", C786410Ut5.J3(jSONObject), bundle);
                c098200Yq2 = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
            if (thM5exceptionOrNullimpl2 != null) {
                C20441214yg.LJFF("LiveShareMethod", "inject bizTrackParams failed", thM5exceptionOrNullimpl2);
            }
        }
        InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
        if (interfaceC634840OvC3 != null) {
            context = interfaceC634840OvC3.getContext();
        } else {
            context = null;
        }
        C19EG c19egLJ = C500260Jjc.LJ(context);
        if (c19egLJ == null) {
            C20441214yg.LJ("LiveShareMethod", "show live share failed, activity is null");
            C2382909Vj.LIZ(completionBlock, 0, null, null, 6);
            return;
        }
        IShareService iShareService = (IShareService) C1161920gLG.LIZJ(IShareService.class);
        if (iShareService == null) {
            C20441214yg.LJ("LiveShareMethod", "show live share failed, share service is null");
            C2382909Vj.LIZ(completionBlock, 0, null, null, 6);
            return;
        }
        InterfaceC481210Itz interfaceC481210ItzMh = iShareService.mh();
        InterfaceC1372610lp5 interfaceC1372610lp5 = new InterfaceC1372610lp5() { // from class: X.0Iu4
            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LIZIZ(HashMap map) {
            }

            @Override // X.InterfaceC1372610lp5
            public final void LIZJ(String str, String str2, Bundle bundle2) {
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
            public final void LIZ(Throwable th3) {
                C20441214yg.LJI("LiveShareMethod", th3);
            }

            @Override // X.InterfaceC1372610lp5
            public final void LIZLLL(HashMap<String, String> map) {
                DataChannel dataChannel = dataChannelProvideDataChannel;
                if (dataChannel != null) {
                    C481180Itw.LJI(dataChannel, map);
                }
            }

            @Override // X.InterfaceC1372610lp5
            public final void LJ(HashMap<String, String> map) {
                DataChannel dataChannel = dataChannelProvideDataChannel;
                if (dataChannel != null) {
                    C481180Itw.LJFF(dataChannel, map);
                }
            }
        };
        C481220Iu0 c481220Iu0 = (C481220Iu0) interfaceC481210ItzMh;
        c481220Iu0.getClass();
        c1106210etP.LIZIZ();
        c481220Iu0.LIZ(c19egLJ, c1106210etP, interfaceC1372610lp5);
        InterfaceC634840OvC interfaceC634840OvC4 = this.IBridgeSdkContext;
        if (interfaceC634840OvC4 != null) {
            containerID = interfaceC634840OvC4.getContainerID();
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC517080KPq.class, containerID), "");
    }
}
