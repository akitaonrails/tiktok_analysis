package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.region.IEcommerceRegionService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.17yv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21207117yv implements InterfaceC1123960fM2, InterfaceC1740480vOQ {
    @Override // X.InterfaceC1123960fM2
    public final String LIZ() {
        return "ecommerce_live";
    }

    @Override // X.InterfaceC1123960fM2
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC1123960fM2
    public final InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> LJ(Context context, EnumC756810TmR enumC756810TmR) {
        return null;
    }

    @Override // X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
    }

    @Override // X.InterfaceC1748820vbs
    public final String getPageName() {
        return "live";
    }

    @Override // X.InterfaceC1748820vbs
    public final void sh() {
    }

    @Override // X.InterfaceC1123960fM2
    public final List<EnumC756810TmR> LIZIZ() {
        return new ArrayList();
    }

    @Override // X.InterfaceC1123960fM2
    public final List<EnumC1124020fM8> LIZJ() {
        return new ArrayList(((Map) C1741660vQK.LIZ.getValue()).keySet());
    }

    @Override // X.InterfaceC1748810vbr
    public final InterfaceC1748810vbr d8() {
        return C960603pE.LIZJ(this);
    }

    @Override // X.InterfaceC1748820vbs
    public final Map<String, String> Aa() {
        return C988803tm.LIZIZ;
    }

    @Override // X.InterfaceC1748810vbr
    public final List<String> getRegisteredLane() {
        return C988803tm.LIZ;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.InterfaceC1123960fM2
    public final InterfaceC1124060fMC<IFrameSlot, IFrameSlot.SlotViewModel, EnumC1124020fM8> LJFF(Context context, EnumC1124020fM8 enumC1124020fM8) {
        AbstractC21206917yt abstractC21206917ytLIZ;
        IEcommerceRegionService iEcommerceRegionService;
        AbstractC21206917yt abstractC21206917ytLIZ2;
        IEcommerceRegionService iEcommerceRegionService2;
        IEcommerceRegionService iEcommerceRegionService3;
        IEcommerceRegionService iEcommerceRegionService4;
        IEcommerceRegionService iEcommerceRegionService5;
        IEcommerceRegionService iEcommerceRegionService6;
        IEcommerceRegionService iEcommerceRegionService7;
        IEcommerceRegionService iEcommerceRegionService8;
        switch (C1124040fMA.LIZ[enumC1124020fM8.ordinal()]) {
            case 1:
                if ((!C0AA2.LIZ() || ((iEcommerceRegionService = (IEcommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IEcommerceRegionService.class, false, false, false, 14, null)) != null && iEcommerceRegionService.isUS())) && (abstractC21206917ytLIZ = C1741660vQK.LIZ(context, enumC1124020fM8)) != null) {
                    if (abstractC21206917ytLIZ instanceof AbstractC21203317yJ) {
                        ((AbstractC21203317yJ) abstractC21206917ytLIZ).LLILZIL = this;
                        return abstractC21206917ytLIZ;
                    }
                    if (!(abstractC21206917ytLIZ instanceof AbstractC21207617z0)) {
                        return abstractC21206917ytLIZ;
                    }
                    Iterator it2 = ((ArrayList) ((AbstractC21207617z0) abstractC21206917ytLIZ).LLILLL).iterator();
                    while (it2.hasNext()) {
                        ((AbstractC21203317yJ) it2.next()).LLILZIL = this;
                    }
                    return abstractC21206917ytLIZ;
                }
                return null;
            case 2:
                if ((!C0AA2.LIZ() || ((iEcommerceRegionService2 = (IEcommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IEcommerceRegionService.class, false, false, false, 14, null)) != null && iEcommerceRegionService2.isUS())) && (abstractC21206917ytLIZ2 = C1741660vQK.LIZ(context, enumC1124020fM8)) != null) {
                    if (!(abstractC21206917ytLIZ2 instanceof AbstractC21203317yJ)) {
                        return abstractC21206917ytLIZ2;
                    }
                    ((AbstractC21203317yJ) abstractC21206917ytLIZ2).LLILZIL = this;
                    return abstractC21206917ytLIZ2;
                }
                return null;
            case 3:
                if (!C0AA2.LIZ() || (((iEcommerceRegionService3 = (IEcommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IEcommerceRegionService.class, false, false, false, 14, null)) != null && iEcommerceRegionService3.isUS()) || ((iEcommerceRegionService4 = (IEcommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IEcommerceRegionService.class, false, false, false, 14, null)) != null && iEcommerceRegionService4.LIZIZ(Boolean.FALSE)))) {
                    return C1741660vQK.LIZ(context, enumC1124020fM8);
                }
                return null;
            case 4:
                if (!C0AA2.LIZ() || (((iEcommerceRegionService5 = (IEcommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IEcommerceRegionService.class, false, false, false, 14, null)) != null && iEcommerceRegionService5.isUS()) || ((iEcommerceRegionService6 = (IEcommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IEcommerceRegionService.class, false, false, false, 14, null)) != null && iEcommerceRegionService6.LIZIZ(Boolean.FALSE)))) {
                    return C1741660vQK.LIZ(context, enumC1124020fM8);
                }
                return null;
            case 5:
                if (!C0AA2.LIZ() || ((iEcommerceRegionService7 = (IEcommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IEcommerceRegionService.class, false, false, false, 14, null)) != null && iEcommerceRegionService7.isUS())) {
                    return C1741660vQK.LIZ(context, enumC1124020fM8);
                }
                return null;
            case 6:
                if (!C0AA2.LIZ() || ((iEcommerceRegionService8 = (IEcommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IEcommerceRegionService.class, false, false, false, 14, null)) != null && iEcommerceRegionService8.isUS())) {
                    return C1741660vQK.LIZ(context, enumC1124020fM8);
                }
                return null;
            default:
                return null;
        }
    }

    @Override // X.InterfaceC1740480vOQ
    public final void mG(View view, LifecycleOwner lifecycleOwner) {
        C1756050vnX.LIZ(this, view, lifecycleOwner);
    }
}
