package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0y6L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1844590y6L extends AbstractC1844570y6J {
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
        Integer numValueOf;
        InterfaceC1844580y6K interfaceC1844580y6K = (InterfaceC1844580y6K) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            String downloadUrl = interfaceC1844580y6K.getDownloadUrl();
            String shootWay = interfaceC1844580y6K.getShootWay();
            if (shootWay == null) {
                shootWay = "livesdk_anchor_highlight_post_click";
            }
            String suffix = interfaceC1844580y6K.getSuffix();
            if (suffix == null) {
                suffix = ".mp4";
            }
            String fragmentIdStr = interfaceC1844580y6K.getFragmentIdStr();
            if (fragmentIdStr == null) {
                fragmentIdStr = String.valueOf(System.currentTimeMillis());
            }
            Number videoType = interfaceC1844580y6K.getVideoType();
            if (videoType == null) {
                videoType = 0;
            }
            int iIntValue = videoType.intValue();
            String businessExtra = interfaceC1844580y6K.getBusinessExtra();
            if (businessExtra == null) {
                businessExtra = "";
            }
            String giftHighlight = interfaceC1844580y6K.getGiftHighlight();
            if (giftHighlight == null) {
                giftHighlight = "";
            }
            String fragmentType = interfaceC1844580y6K.getFragmentType();
            if (fragmentType == null) {
                fragmentType = CardStruct.IStatusCode.DEFAULT;
            }
            String enterFromPage = interfaceC1844580y6K.getEnterFromPage();
            if (enterFromPage == null) {
                enterFromPage = "";
            }
            IGameService iGameService = (IGameService) C1161920gLG.LIZJ(IGameService.class);
            String anchorId = interfaceC1844580y6K.getAnchorId();
            if (anchorId == null) {
                anchorId = "";
            }
            String scene = interfaceC1844580y6K.getScene();
            if (scene == null) {
                scene = "";
            }
            String enterFrom = interfaceC1844580y6K.getEnterFrom();
            if (enterFrom == null) {
                enterFrom = "";
            }
            Number gifterRanking = interfaceC1844580y6K.getGifterRanking();
            if (gifterRanking != null) {
                numValueOf = Integer.valueOf(gifterRanking.intValue());
            } else {
                numValueOf = null;
            }
            iGameService.Ut(context, downloadUrl, shootWay, suffix, fragmentIdStr, iIntValue, "", "", businessExtra, giftHighlight, fragmentType, anchorId, scene, enterFrom, numValueOf, "", enterFromPage, C2097608Jq.LJ(), null);
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1844600y6M.class, null), "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, -1, "Context is null", null, 4);
    }
}
