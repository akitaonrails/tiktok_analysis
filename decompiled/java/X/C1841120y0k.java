package X;

import android.app.Activity;
import com.bytedance.android.live.settings.LiveHostReplayUISettings;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0y0k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1841120y0k extends AbstractC1841140y0m {
    public static List LIZJ(List list) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        int iIntValue6;
        if (list != null) {
            ArrayList<InterfaceC1841150y0n> arrayList = new ArrayList();
            for (Object obj : list) {
                InterfaceC1841150y0n interfaceC1841150y0n = (InterfaceC1841150y0n) obj;
                if (interfaceC1841150y0n.getUrl() != null && interfaceC1841150y0n.getSpriteNum() != null && interfaceC1841150y0n.getImageXNum() != null && interfaceC1841150y0n.getImageYNum() != null && interfaceC1841150y0n.getImageHeight() != null && interfaceC1841150y0n.getImageWidth() != null && interfaceC1841150y0n.getFps() != null) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            for (InterfaceC1841150y0n interfaceC1841150y0n2 : arrayList) {
                String url = interfaceC1841150y0n2.getUrl();
                if (url == null) {
                    url = "";
                }
                Number spriteNum = interfaceC1841150y0n2.getSpriteNum();
                if (spriteNum != null) {
                    iIntValue = spriteNum.intValue();
                } else {
                    iIntValue = 0;
                }
                Number imageXNum = interfaceC1841150y0n2.getImageXNum();
                if (imageXNum != null) {
                    iIntValue2 = imageXNum.intValue();
                } else {
                    iIntValue2 = 0;
                }
                Number imageYNum = interfaceC1841150y0n2.getImageYNum();
                if (imageYNum != null) {
                    iIntValue3 = imageYNum.intValue();
                } else {
                    iIntValue3 = 0;
                }
                Number imageHeight = interfaceC1841150y0n2.getImageHeight();
                if (imageHeight != null) {
                    iIntValue4 = imageHeight.intValue();
                } else {
                    iIntValue4 = 0;
                }
                Number imageWidth = interfaceC1841150y0n2.getImageWidth();
                if (imageWidth != null) {
                    iIntValue5 = imageWidth.intValue();
                } else {
                    iIntValue5 = 0;
                }
                Number fps = interfaceC1841150y0n2.getFps();
                if (fps != null) {
                    iIntValue6 = fps.intValue();
                } else {
                    iIntValue6 = 0;
                }
                arrayList2.add(new IHostSubscription.SpriteImage(url, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6));
            }
            return arrayList2;
        }
        return null;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        IHostSubscription iHostSubscription;
        int iIntValue;
        long jLongValue;
        long jLongValue2;
        int iIntValue2;
        ArrayList<IHostSubscription.SpriteImage> arrayList;
        String string;
        InterfaceC1841130y0l interfaceC1841130y0l = (InterfaceC1841130y0l) xBaseParamModel;
        Activity activityLIZLLL = null;
        try {
            iHostSubscription = (IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("OpenVideoClipPageMethod", e);
        }
        if (iHostSubscription == null) {
            completionBlock.onFailure(0, "hostSubscription == null)", null);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lastPage: ");
        sbLIZ.append(interfaceC1841130y0l.getLastPage());
        C20441214yg.LIZIZ("OpenVideoClipPageMethod", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            activityLIZLLL = interfaceC634840OvC.LIZLLL();
        }
        String roomId = interfaceC1841130y0l.getRoomId();
        String playUrl = interfaceC1841130y0l.getPlayUrl();
        String enterFromPage = interfaceC1841130y0l.getEnterFromPage();
        String enterFrom = interfaceC1841130y0l.getEnterFrom();
        Number duration = interfaceC1841130y0l.getDuration();
        if (duration != null) {
            iIntValue = duration.intValue();
        } else {
            iIntValue = 0;
        }
        String lastPage = interfaceC1841130y0l.getLastPage();
        Number initialTimeS = interfaceC1841130y0l.getInitialTimeS();
        if (initialTimeS != null) {
            jLongValue = initialTimeS.longValue();
        } else {
            jLongValue = 0;
        }
        long j = jLongValue * 1000;
        Number initialDurationS = interfaceC1841130y0l.getInitialDurationS();
        if (initialDurationS != null) {
            jLongValue2 = initialDurationS.longValue();
        } else {
            jLongValue2 = LiveHostReplayUISettings.getValue().initialSelectedZoneWithSeconds;
        }
        long j2 = jLongValue2 * 1000;
        Number cutContentType = interfaceC1841130y0l.getCutContentType();
        if (cutContentType != null) {
            iIntValue2 = cutContentType.intValue();
        } else {
            iIntValue2 = 0;
        }
        Map<String, ? extends Object> extra = interfaceC1841130y0l.getExtra();
        if (extra == null) {
            extra = C2097608Jq.LJ();
        }
        List listLIZJ = LIZJ(interfaceC1841130y0l.getSpriteImages());
        if (listLIZJ != null) {
            arrayList = new ArrayList<>(listLIZJ);
        } else {
            arrayList = null;
        }
        Number userType = interfaceC1841130y0l.getUserType();
        if (userType != null) {
            string = userType.toString();
        } else {
            string = null;
        }
        iHostSubscription.g21(activityLIZLLL, roomId, playUrl, enterFromPage, enterFrom, iIntValue, lastPage, j, j2, iIntValue2, extra, arrayList, string, interfaceC1841130y0l.getAnchorId());
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1841160y0o.class, null), "");
    }
}
