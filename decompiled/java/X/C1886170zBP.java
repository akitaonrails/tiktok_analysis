package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0zBP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1886170zBP extends AbstractC1886150zBN {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        boolean zBooleanValue;
        int iIntValue;
        C843920X8s c843920X8sJe0;
        InterfaceC1886180zBQ interfaceC1886180zBQ = (InterfaceC1886180zBQ) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        String roomID = interfaceC1886180zBQ.getRoomID();
        String str = "";
        if (roomID == null) {
            roomID = "";
        }
        String taskID = interfaceC1886180zBQ.getTaskID();
        if (taskID == null) {
            taskID = "";
        }
        String audienceUID = interfaceC1886180zBQ.getAudienceUID();
        if (audienceUID == null) {
            audienceUID = "";
        }
        String anchorID = interfaceC1886180zBQ.getAnchorID();
        if (anchorID == null) {
            anchorID = "";
        }
        String appID = interfaceC1886180zBQ.getAppID();
        if (appID == null) {
            appID = "";
        }
        String packageName = interfaceC1886180zBQ.getPackageName();
        if (packageName == null) {
            packageName = "";
        }
        Boolean boolIsAnchor = interfaceC1886180zBQ.isAnchor();
        if (boolIsAnchor != null) {
            zBooleanValue = boolIsAnchor.booleanValue();
        } else {
            zBooleanValue = false;
        }
        String gameID = interfaceC1886180zBQ.getGameID();
        if (gameID == null) {
            gameID = "";
        }
        String sourceID = interfaceC1886180zBQ.getSourceID();
        if (sourceID == null) {
            sourceID = "";
        }
        String siteID = interfaceC1886180zBQ.getSiteID();
        if (siteID == null) {
            siteID = "";
        }
        String deepLink = interfaceC1886180zBQ.getDeepLink();
        if (deepLink == null) {
            deepLink = "";
        }
        Integer numLJIIJJI = C2095008Iq.LJIIJJI(interfaceC1886180zBQ.getScene());
        if (numLJIIJJI != null) {
            iIntValue = numLJIIJJI.intValue();
        } else {
            iIntValue = 99;
        }
        String sourceID2 = interfaceC1886180zBQ.getSourceID();
        if (sourceID2 == null) {
            sourceID2 = "";
        }
        String siteID2 = interfaceC1886180zBQ.getSiteID();
        if (siteID2 == null) {
            siteID2 = "";
        }
        String authorID = interfaceC1886180zBQ.getAuthorID();
        if (authorID == null) {
            authorID = "";
        }
        if (authorID.length() == 0) {
            String anchorID2 = interfaceC1886180zBQ.getAnchorID();
            if (anchorID2 != null) {
                str = anchorID2;
            }
        } else {
            str = authorID;
        }
        C843930X8t c843930X8t = new C843930X8t(taskID, anchorID, gameID, sourceID, iIntValue, deepLink, null, roomID, packageName, audienceUID, appID, zBooleanValue, sourceID2, siteID2, str, siteID, null, null, null, 0, null, 0, null, 33488960);
        IGamePartnershipService iGamePartnershipService = (IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class);
        if (iGamePartnershipService != null && (c843920X8sJe0 = iGamePartnershipService.Je0()) != null) {
            c843920X8sJe0.LJFF(context, c843930X8t, new C0T7K() { // from class: X.0zBO
                @Override // X.C0T7K
                public final void LIZ(int i, String str2, boolean z) {
                    this.LIZ.getClass();
                    completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1886190zBR.class, null), "");
                }
            });
        }
    }
}
