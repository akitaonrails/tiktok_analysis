package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1AQM, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AQM extends C1AQO {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.0Jbv] */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        IHostSubscription iHostSubscription;
        Context context;
        int iIntValue;
        boolean zBooleanValue;
        int iIntValue2;
        boolean zBooleanValue2;
        C1AQN c1aqn = (C1AQN) xBaseParamModel;
        String videoUrl = c1aqn.getVideoUrl();
        boolean zBooleanValue3 = false;
        if (videoUrl != null && videoUrl.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C2382909Vj.LIZ(completionBlock, 0, "url is empty", null, 4);
            return;
        }
        try {
            iHostSubscription = (IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class);
        } catch (Exception e) {
            e = e;
        }
        if (iHostSubscription == 0) {
            C2382909Vj.LIZ(completionBlock, 0, "", null, 4);
            return;
        }
        try {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                context = interfaceC634840OvC.getContext();
            } else {
                context = null;
            }
            String videoUrl2 = c1aqn.getVideoUrl();
            Number videoLen = c1aqn.getVideoLen();
            if (videoLen != null) {
                iIntValue = videoLen.intValue();
            } else {
                iIntValue = 0;
            }
            Boolean boolIsAutoPlay = c1aqn.isAutoPlay();
            if (boolIsAutoPlay != null) {
                zBooleanValue = boolIsAutoPlay.booleanValue();
            } else {
                zBooleanValue = false;
            }
            Number currentPosition = c1aqn.getCurrentPosition();
            if (currentPosition != null) {
                iIntValue2 = currentPosition.intValue();
            } else {
                iIntValue2 = 0;
            }
            Boolean boolIsMute = c1aqn.isMute();
            if (boolIsMute != null) {
                zBooleanValue2 = boolIsMute.booleanValue();
            } else {
                zBooleanValue2 = false;
            }
            Boolean boolIsPause = c1aqn.isPause();
            if (boolIsPause != null) {
                zBooleanValue3 = boolIsPause.booleanValue();
            }
            iHostSubscription.Is0(context, videoUrl2, iIntValue, zBooleanValue, iIntValue2, zBooleanValue2, zBooleanValue3, new InterfaceC1835090xr1() { // from class: X.0Jbv
                @Override // X.InterfaceC1835090xr1
                public final void LIZ() {
                }

                @Override // X.InterfaceC1835090xr1
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC1835090xr1
                public final void LIZJ() {
                }
            });
        } catch (Exception e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("openVideoFullScreenMethod", e);
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C1AQP.class, null), "");
        TryCatchGuardChecker.doCheck(e);
        C20441214yg.LJI("openVideoFullScreenMethod", e);
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C1AQP.class, null), "");
    }
}
