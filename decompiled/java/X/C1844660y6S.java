package X;

import android.app.Activity;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0y6S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1844660y6S extends AbstractC1844630y6P {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        IHostSubscription iHostSubscription;
        Activity activityLIZLLL;
        int iIntValue;
        InterfaceC1844670y6T interfaceC1844670y6T = (InterfaceC1844670y6T) xBaseParamModel;
        try {
            iHostSubscription = (IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class);
        } catch (Exception e) {
            e = e;
        }
        try {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                activityLIZLLL = interfaceC634840OvC.LIZLLL();
            } else {
                activityLIZLLL = null;
            }
            iIntValue = 0;
        } catch (Exception e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("OpenVideoClipPageMethod", e);
        }
        if (iHostSubscription != null && activityLIZLLL != null) {
            String roomid = interfaceC1844670y6T.getRoomid();
            String clipId = interfaceC1844670y6T.getClipId();
            if (clipId == null || clipId.length() == 0) {
                clipId = interfaceC1844670y6T.getUrl();
            }
            if ((roomid == null || roomid.length() == 0) && (roomid = interfaceC1844670y6T.getUrl()) == null) {
                roomid = "";
            }
            if (clipId == null) {
                clipId = "";
            }
            String url = interfaceC1844670y6T.getUrl();
            if (url == null) {
                url = "";
            }
            String suffix = interfaceC1844670y6T.getSuffix();
            Number redirect = interfaceC1844670y6T.getRedirect();
            if (redirect != null) {
                iIntValue = redirect.intValue();
            }
            String shootWay = interfaceC1844670y6T.getShootWay();
            String enterFrom = interfaceC1844670y6T.getEnterFrom();
            String enterFromPage = interfaceC1844670y6T.getEnterFromPage();
            String giftHighlight = interfaceC1844670y6T.getGiftHighlight();
            String anchorId = interfaceC1844670y6T.getAnchorId();
            String fragmentType = interfaceC1844670y6T.getFragmentType();
            if (fragmentType == null) {
                fragmentType = "1";
            }
            iHostSubscription.NR0(activityLIZLLL, roomid, clipId, url, suffix, iIntValue, shootWay, enterFrom, enterFromPage, giftHighlight, anchorId, fragmentType);
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1844640y6Q.class, null), "");
            return;
        }
        completionBlock.onFailure(0, "hostSubscription == null)", null);
    }
}
