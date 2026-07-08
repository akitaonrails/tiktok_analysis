package X;

import android.app.Activity;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.1AQA, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AQA extends C1AQD {
    public boolean LLILLL;

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
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            activityLIZLLL = interfaceC634840OvC.LIZLLL();
        } else {
            activityLIZLLL = null;
        }
        iHostAction.openRegionListPage(activityLIZLLL, new C10JS() { // from class: X.1AQB
            @Override // X.C10JS
            public final void onExit() {
                if (this.LIZ.LLILLL) {
                    return;
                }
                C2382909Vj.LIZ(completionBlock, 0, null, null, 6);
            }

            @Override // X.C10JS
            public final void onChanged(String str, String str2) {
                this.LIZ.LLILLL = true;
                C1AQC c1aqc = (C1AQC) C1909107dp.LIZJ(C1AQC.class, null);
                c1aqc.setPhoneCode(str);
                c1aqc.setShortCountryName(str2);
                completionBlock.onSuccess(c1aqc, "");
            }
        });
    }
}
