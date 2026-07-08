package X;

import android.app.Activity;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.18lz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21381718lz extends AbstractC21381218lu {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.0Jbu] */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        IHostSubscription iHostSubscription;
        Activity activityLIZLLL;
        int iIntValue;
        InterfaceC21381618ly interfaceC21381618ly = (InterfaceC21381618ly) xBaseParamModel;
        try {
            iHostSubscription = (IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("openVideoFullScreenMethod", e);
        }
        if (iHostSubscription == 0) {
            completionBlock.onFailure(0, "hostSubscription == null)", null);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            activityLIZLLL = interfaceC634840OvC.LIZLLL();
        } else {
            activityLIZLLL = null;
        }
        String roomId = interfaceC21381618ly.getRoomId();
        String m3u8Url = interfaceC21381618ly.getM3u8Url();
        String downloadUrl = interfaceC21381618ly.getDownloadUrl();
        Integer numValueOf = Integer.valueOf(interfaceC21381618ly.getStatus().intValue());
        String enterFromPage = interfaceC21381618ly.getEnterFromPage();
        String enterFrom = interfaceC21381618ly.getEnterFrom();
        Number videoLength = interfaceC21381618ly.getVideoLength();
        if (videoLength != null) {
            iIntValue = videoLength.intValue();
        } else {
            iIntValue = 0;
        }
        iHostSubscription.Fy(activityLIZLLL, roomId, m3u8Url, downloadUrl, numValueOf, enterFromPage, enterFrom, iIntValue, new InterfaceC1835090xr1() { // from class: X.0Jbu
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
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC21381318lv.class, null), "");
    }
}
