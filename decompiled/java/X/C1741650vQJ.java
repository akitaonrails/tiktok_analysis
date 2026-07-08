package X;

import android.os.Bundle;
import com.bytedance.android.live.slot.IIconSlot;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.region.IEcommerceRegionService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0vQJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1741650vQJ implements InterfaceC21213517zx {
    public C21208517z9 LL;

    @Override // X.InterfaceC21213517zx
    public final void onDispose() {
    }

    @Override // X.InterfaceC21213517zx
    public final void onExposure(String str) {
    }

    @Override // X.InterfaceC21213517zx
    public final void onPause() {
    }

    @Override // X.InterfaceC21213517zx
    public final void onProductNumChange(int i) {
    }

    @Override // X.InterfaceC21213517zx
    public final void onResume() {
    }

    @Override // X.InterfaceC21213517zx
    public final void onSlotCreated(IIconSlot.SlotViewModel slotViewModel, InterfaceC21213717zz interfaceC21213717zz) {
    }

    @Override // X.InterfaceC21213517zx
    public final void onStart() {
    }

    @Override // X.InterfaceC21213517zx
    public final void onStop() {
    }

    @Override // X.InterfaceC21213517zx
    public final void onDestroy() {
        C21208517z9 c21208517z9 = this.LL;
        if (c21208517z9 != null) {
            c21208517z9.onDestroy();
        }
    }

    @Override // X.InterfaceC21213517zx
    public final void onShopBagIconDrawableLoaded() {
        C21208517z9 c21208517z9 = this.LL;
        if (c21208517z9 != null) {
            c21208517z9.onShopBagIconDrawableLoaded();
        }
    }

    @Override // X.InterfaceC21213517zx
    public final void onAudiencePermissionChanged(boolean z) {
        C21208517z9 c21208517z9 = this.LL;
        if (c21208517z9 != null) {
            c21208517z9.LLJLIL = z;
        }
    }

    @Override // X.InterfaceC21213517zx
    public final void onCreate(Bundle bundle) {
        C21208517z9 c21208517z9 = this.LL;
        if (c21208517z9 != null) {
            c21208517z9.onCreate(bundle);
        }
    }

    @Override // X.InterfaceC21213517zx
    public final void prepareToShow(Map<String, ? extends Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        C21208517z9 c21208517z9 = this.LL;
        if (c21208517z9 != null) {
            c21208517z9.prepareToShow(map, interfaceC756140TlM);
        }
    }

    public C1741650vQJ(long j, C1743900vTw c1743900vTw, WeakReference<C21212117zj> weakReference) {
        IEcommerceRegionService iEcommerceRegionService = (IEcommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IEcommerceRegionService.class, false, false, false, 14, null);
        if (iEcommerceRegionService != null && iEcommerceRegionService.isUS()) {
            this.LL = new C21191217wM(j, c1743900vTw, weakReference);
            return;
        }
        IEcommerceRegionService iEcommerceRegionService2 = (IEcommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IEcommerceRegionService.class, false, false, false, 14, null);
        if (iEcommerceRegionService2 != null && iEcommerceRegionService2.LIZIZ(Boolean.TRUE)) {
            this.LL = new C1735600vGY(j, c1743900vTw, weakReference);
        } else {
            this.LL = new C21208517z9(c1743900vTw, weakReference);
        }
    }

    @Override // X.InterfaceC21213517zx
    public final void onClick(long j, String str, Map<String, ? extends Object> map, String str2) throws JSONException {
        C21208517z9 c21208517z9 = this.LL;
        if (c21208517z9 != null) {
            c21208517z9.onClick(j, str, map, str2);
        }
    }
}
