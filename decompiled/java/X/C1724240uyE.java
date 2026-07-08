package X;

import Y.ARunnableS59S0300000_26;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.ecommerce.dependency.location.LocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uyE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1724240uyE extends AbstractC1724250uyF {
    @Override // X.AbstractC1549150qPp
    public final boolean getUseOriginalResult() {
        return true;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin;
        String str;
        String name;
        final InterfaceC1724300uyK interfaceC1724300uyK = (InterfaceC1724300uyK) xBaseParamModel;
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("ocr: GetInfoByOCRMethod enter");
        C2341109Fh.LJ("ocr: GetInfoByOCRMethod  init false");
        JSONObject json = interfaceC1724300uyK.toJSON();
        InterfaceC1724220uyC interfaceC1724220uyC = new InterfaceC1724220uyC() { // from class: X.0uyI
            @Override // X.InterfaceC1724220uyC
            public final void LIZ() {
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS59S0300000_26(this.LIZ, interfaceC1724300uyK, completionBlock, 12));
            }
        };
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = ILocationDependencyService.class.getName();
            if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
        }
        if (!((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin).isInTikTokRegion()) {
            str = "https://f-p-va.isnssdk.com";
        } else {
            str = "https://f-p.sgsnssdk.com";
        }
        C1724180uy8 c1724180uy8 = new C1724180uy8(C7879035x.LIZ());
        c1724180uy8.LJIJJ = json.optString("merchant_user_id");
        c1724180uy8.LJIILLIIL = json.optString("nonce");
        c1724180uy8.LIZIZ = str;
        c1724180uy8.LJIJJLI = interfaceC1724220uyC;
        C1724230uyD.LIZLLL(C1724230uyD.LIZ, c1724180uy8);
    }
}
