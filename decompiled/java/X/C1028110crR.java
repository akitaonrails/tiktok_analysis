package X;

import android.os.Bundle;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: renamed from: X.0crR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1028110crR extends AbstractC1028120crS {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        String containerID2;
        InterfaceC1028200cra interfaceC1028200cra;
        Bundle bundle;
        String str;
        String string;
        String nativeSiteCustomData;
        String containerID3;
        C1026310coX c1026310coX;
        C1028100crQ popUpCustomConfig;
        C1027660cqi c1027660cqi;
        C1041880dDe c1041880dDe;
        C1051660dTQ c1051660dTQ;
        AwemeRawAd awemeRawAd;
        String containerID4;
        String nativeSiteCustomData2;
        String str2 = "";
        try {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            } else {
                containerID = null;
            }
            SparkContext.Companion.getClass();
            C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
            if (enumC1063300dmC == EnumC1063300dmC.WEB) {
                if (c1537480q70LIZIZ == null) {
                    awemeRawAd = null;
                } else {
                    C1035880d3y c1035880d3y = (C1035880d3y) c1537480q70LIZIZ.LJFF(C1035880d3y.class);
                    if (c1035880d3y == null || (awemeRawAd = c1035880d3y.getAwemeRawAd()) == null) {
                        awemeRawAd = (AwemeRawAd) c1537480q70LIZIZ.LJFF(AwemeRawAd.class);
                    }
                }
                InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                if (interfaceC634840OvC2 != null) {
                    containerID4 = interfaceC634840OvC2.getContainerID();
                } else {
                    containerID4 = null;
                }
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1028130crT.class, containerID4);
                InterfaceC1028130crT interfaceC1028130crT = (InterfaceC1028130crT) xBaseModelLIZJ;
                if (awemeRawAd == null || (nativeSiteCustomData2 = awemeRawAd.getNativeSiteCustomData()) == null) {
                    nativeSiteCustomData2 = "";
                }
                interfaceC1028130crT.setCustomData(nativeSiteCustomData2);
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                return;
            }
            InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
            if (interfaceC634840OvC3 != null) {
                containerID2 = interfaceC634840OvC3.getContainerID();
            } else {
                containerID2 = null;
            }
            C1537480q70 c1537480q70LIZIZ2 = C1529880puk.LIZIZ(containerID2);
            if (c1537480q70LIZIZ2 != null && (c1051660dTQ = (C1051660dTQ) c1537480q70LIZIZ2.LJFF(C1051660dTQ.class)) != null) {
                interfaceC1028200cra = (InterfaceC1028200cra) c1051660dTQ.LIZIZ(InterfaceC1028200cra.class);
            } else {
                interfaceC1028200cra = null;
            }
            if (c1537480q70LIZIZ != null) {
                bundle = (Bundle) c1537480q70LIZIZ.LJFF(Bundle.class);
            } else {
                bundle = null;
            }
            if (interfaceC1028200cra == null || (c1027660cqi = (C1027660cqi) interfaceC1028200cra.LIZIZ(C1027660cqi.class)) == null || (c1041880dDe = c1027660cqi.LJJLL) == null || (str = (String) c1041880dDe.LIZJ()) == null) {
                str = "";
            }
            if (bundle == null || (string = bundle.getString("bundle_native_site_custom_data")) == null) {
                string = "";
            }
            if (c1537480q70LIZIZ == null || (c1026310coX = (C1026310coX) c1537480q70LIZIZ.LJFF(C1026310coX.class)) == null || (popUpCustomConfig = c1026310coX.getPopUpCustomConfig()) == null || (nativeSiteCustomData = popUpCustomConfig.getNativeSiteCustomData()) == null) {
                nativeSiteCustomData = "";
            }
            if (str.length() <= 0) {
                if (string.length() > 0) {
                    str = string;
                } else {
                    str = nativeSiteCustomData;
                }
            }
            InterfaceC634840OvC interfaceC634840OvC4 = this.IBridgeSdkContext;
            if (interfaceC634840OvC4 != null) {
                containerID3 = interfaceC634840OvC4.getContainerID();
            } else {
                containerID3 = null;
            }
            XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC1028130crT.class, containerID3);
            ((InterfaceC1028130crT) xBaseModelLIZJ2).setCustomData(str);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ2, "");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String message = th.getMessage();
            if (message != null) {
                str2 = message;
            }
            C2382909Vj.LIZ(completionBlock, 0, str2, null, 4);
            C1AF0.LJ(th);
        }
    }
}
