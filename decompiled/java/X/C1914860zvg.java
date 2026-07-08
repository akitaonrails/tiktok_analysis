package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.compliance.consent.serviceimpl.PNSDeviceConsentServiceImpl;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.consent.collector.api.CollectConsentParam;
import com.ss.android.ugc.aweme.pns.consent.collector.api.IPNSConsentCollectorService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zvg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1914860zvg extends C09AY implements Function0<IPNSConsentCollectorService> {
    public final /* synthetic */ PNSDeviceConsentServiceImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1914860zvg(PNSDeviceConsentServiceImpl pNSDeviceConsentServiceImpl) {
        super(0);
        this.LL = pNSDeviceConsentServiceImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IPNSConsentCollectorService invoke() {
        IPNSConsentCollectorService iPNSConsentCollectorService = (IPNSConsentCollectorService) PluggableExtentionKt.pluggableSpi$default(IPNSConsentCollectorService.class, false, false, false, 14, null);
        if (iPNSConsentCollectorService == null) {
            return null;
        }
        iPNSConsentCollectorService.LIZLLL(this.LL.LJI.getKey(), new AbstractC1914930zvn() { // from class: X.0zuK
            public static Boolean LJ;
            public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(452));
            public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(453));
            public static final Set<String> LJFF = C13LQ.LJLIIL(new String[]{"AT", "BE", "BG", "CH", "CY", "CZ", "DE", "DK", "EE", "EL", "ES", "FI", "FR", "GB", "GR", "HR", "HU", "IE", "IS", "IT", "LI", "LT", "LU", "LV", "MT", "NL", "NO", "PL", "PT", "RO", "SE", "SI", "SK"});

            @Override // X.AbstractC1914930zvn, X.InterfaceC1915180zwC
            public final boolean LIZIZ(EnumC1876780ywG enumC1876780ywG, CollectConsentParam collectConsentParam) {
                return true;
            }

            @Override // X.AbstractC1914930zvn, X.InterfaceC1915180zwC
            public final void LIZ() {
                PopupManager.LJIJI(new C10GR() { // from class: X.0Dew
                    @Override // X.InterfaceC20659015si
                    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                    }

                    @Override // X.AbstractC20656215sG
                    public final boolean canShow() {
                        return false;
                    }

                    @Override // X.InterfaceC20660515sx
                    public final int getPriority() {
                        return 0;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.InterfaceC20660415sw
                    public final C688120Qyw i2() {
                        Activity topActivity = ActivityStack.getTopActivity();
                        if (topActivity instanceof LifecycleOwner) {
                            return new C688120Qyw(topActivity, (LifecycleOwner) topActivity, null);
                        }
                        return null;
                    }
                }, true);
                IPNSDeviceConsentService iPNSDeviceConsentService = (IPNSDeviceConsentService) LIZLLL.getValue();
                LJ = iPNSDeviceConsentService != null ? Boolean.valueOf(iPNSDeviceConsentService.LJII(null)) : null;
            }

            @Override // X.AbstractC1914930zvn, X.InterfaceC1915180zwC
            public final void LJ() {
                if (Intrinsics.LJFF(LJ, Boolean.FALSE)) {
                    C052B.LIZ.getClass();
                    C052B.LIZ(1, "popup_consent_box_approved");
                    LJ = null;
                }
            }

            @Override // X.AbstractC1914930zvn, X.InterfaceC1915180zwC
            public final void onDismiss() {
                PopupManager.LJIIJ(C344480Dew.class, C20660315sv.LL);
                PopupManager.LIZJ(C344480Dew.class);
            }

            @Override // X.AbstractC1914930zvn
            public final InterfaceC1914160zuY LJFF(Context context, CollectConsentParam collectConsentParam) {
                String storeRegionUpperCase;
                IAccountService iAccountService = (IAccountService) LIZJ.getValue();
                if (iAccountService == null || (storeRegionUpperCase = iAccountService.getStoreRegionUpperCase()) == null) {
                    storeRegionUpperCase = "";
                }
                if (LJFF.contains(storeRegionUpperCase)) {
                    storeRegionUpperCase = "EU";
                }
                return new C1913890zu7(context, storeRegionUpperCase, collectConsentParam);
            }
        });
        return iPNSConsentCollectorService;
    }
}
