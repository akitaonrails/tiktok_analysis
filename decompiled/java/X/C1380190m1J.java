package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.interact.MultiGuestLiveEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multilive.model.GetLiveEventUserResponse;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;

/* JADX INFO: renamed from: X.0m1J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1380190m1J extends AbstractC1380210m1L {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C19EG c19egLIZ;
        GetLiveEventUserResponse getLiveEventUserResponse;
        InterfaceC1380200m1K interfaceC1380200m1K = (InterfaceC1380200m1K) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC == null) {
            C2382909Vj.LIZ(completionBlock, 0, "bridgeContext is null", null, 4);
            return;
        }
        Context context = interfaceC634840OvC.getContext();
        if (context != null && (c19egLIZ = C1124140fMK.LIZ(context)) != null) {
            Context context2 = interfaceC634840OvC.getContext();
            XBaseResultModel xBaseResultModel = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC1380220m1M.class, null);
            MultiGuestLiveEvent multiGuestLiveEvent = new MultiGuestLiveEvent();
            Gson gson = C19748512Ol.LIZIZ;
            multiGuestLiveEvent.setEventID(interfaceC1380200m1K.getId());
            multiGuestLiveEvent.setOrganizer(GsonProtectorUtils.toJson(gson, interfaceC1380200m1K.getOrganizer()));
            multiGuestLiveEvent.setTitle(interfaceC1380200m1K.getTitle());
            multiGuestLiveEvent.setStartTime(interfaceC1380200m1K.getStartTime());
            multiGuestLiveEvent.setInternalURL(interfaceC1380200m1K.getInternalURL());
            multiGuestLiveEvent.setTrackInfo(GsonProtectorUtils.toJson(gson, interfaceC1380200m1K.getTrackInfo()));
            multiGuestLiveEvent.setShareURL(interfaceC1380200m1K.getShareURL());
            if (!TextUtils.isEmpty(multiGuestLiveEvent.getEventID()) && context2 != null) {
                try {
                    getLiveEventUserResponse = (GetLiveEventUserResponse) gson.LJII(GsonProtectorUtils.toJson(gson, interfaceC1380200m1K.getLiveEventUserResponse()), GetLiveEventUserResponse.class);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    getLiveEventUserResponse = null;
                }
                ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).openLiveEventInviteGuestPanel(c19egLIZ, interfaceC1380200m1K.getId(), interfaceC1380200m1K.getUnreadRegisteredGuestCount().longValue(), getLiveEventUserResponse, multiGuestLiveEvent);
                completionBlock.onSuccess(xBaseResultModel, "");
                return;
            }
            C2382909Vj.LIZ(completionBlock, 0, "id or context is null", null, 4);
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "activity is null", null, 4);
    }
}
