package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.sharepanel.api.service.IIMShareOpenService;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS272S0300000_28;

/* JADX INFO: renamed from: X.0z0I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1879280z0I extends AbstractC1879260z0G {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.HashMap, java.util.LinkedHashMap] */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Object c098200Yq;
        String containerID;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        ?? LJ;
        String containerID2;
        InterfaceC1879270z0H interfaceC1879270z0H = (InterfaceC1879270z0H) xBaseParamModel;
        String str = "";
        try {
            int iIntValue = interfaceC1879270z0H.getShareType().intValue();
            String enterFrom = interfaceC1879270z0H.getEnterFrom();
            if (enterFrom == null) {
                enterFrom = "";
            }
            String enterMethod = interfaceC1879270z0H.getEnterMethod();
            if (enterMethod == null) {
                enterMethod = "";
            }
            Boolean boolIsHalfScreen = interfaceC1879270z0H.isHalfScreen();
            if (boolIsHalfScreen != null) {
                zBooleanValue = boolIsHalfScreen.booleanValue();
            } else {
                zBooleanValue = false;
            }
            Boolean showBottomSendViewEmoji = interfaceC1879270z0H.getShowBottomSendViewEmoji();
            if (showBottomSendViewEmoji != null) {
                zBooleanValue2 = showBottomSendViewEmoji.booleanValue();
            } else {
                zBooleanValue2 = false;
            }
            String previewCoverUrl = interfaceC1879270z0H.getPreviewCoverUrl();
            if (previewCoverUrl == null) {
                previewCoverUrl = "";
            }
            String strDecode = URLDecoder.decode(previewCoverUrl, "UTF-8");
            String defaultText = interfaceC1879270z0H.getDefaultText();
            if (defaultText == null) {
                defaultText = "";
            }
            String defaultSelectedUids = interfaceC1879270z0H.getDefaultSelectedUids();
            if (defaultSelectedUids == null) {
                defaultSelectedUids = "";
            }
            Map<String, Object> extra = interfaceC1879270z0H.getExtra();
            if (extra != null) {
                LJ = new LinkedHashMap(C2097908Jt.LIZIZ(extra.size()));
                for (Object obj : extra.entrySet()) {
                    LJ.put(((Map.Entry) obj).getKey(), ((Map.Entry) obj).toString());
                }
            } else {
                LJ = C2097608Jq.LJ();
            }
            C013C c013c = new C013C();
            boolean z = true;
            c013c.element = true;
            IIMShareOpenService iIMShareOpenService = (IIMShareOpenService) PluggableExtentionKt.pluggableSpi$default(IIMShareOpenService.class, false, false, false, 14, null);
            if (iIMShareOpenService == null || iIMShareOpenService.LIZ(iIntValue, interfaceC1879270z0H.getScene(), interfaceC1879270z0H.getContentPb(), new C1378420lyS(enterFrom, enterMethod, strDecode, defaultText, defaultSelectedUids, LJ, zBooleanValue, zBooleanValue2), null, new AwS272S0300000_28(c013c, (C013C) completionBlock, (CompletionBlock<InterfaceC1879240z0E>) this, (C1879280z0I) 27)) == null) {
                z = false;
            }
            c013c.element = z;
            if (!z) {
                InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                if (interfaceC634840OvC != null) {
                    containerID2 = interfaceC634840OvC.getContainerID();
                } else {
                    containerID2 = null;
                }
                AFwS271S0000000_28 aFwS271S0000000_28 = AFwS271S0000000_28.get$arr$(443);
                XBaseResultModel xBaseResultModel = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC1879240z0E.class, containerID2);
                aFwS271S0000000_28.invoke(xBaseResultModel);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("error - ");
                sbLIZ.append("open panel in fail");
                C2188811AlT.LIZIZ(sbLIZ);
                completionBlock.onFailure(0, "open panel in fail", xBaseResultModel);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            } else {
                containerID = null;
            }
            String message = thM5exceptionOrNullimpl.getMessage();
            AFwS271S0000000_28 aFwS271S0000000_282 = AFwS271S0000000_28.get$arr$(444);
            XBaseResultModel xBaseResultModel2 = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC1879240z0E.class, containerID);
            aFwS271S0000000_282.invoke(xBaseResultModel2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("error - ");
            sbLIZ2.append(message);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (message != null) {
                str = message;
            }
            completionBlock.onFailure(0, str, xBaseResultModel2);
        }
    }
}
