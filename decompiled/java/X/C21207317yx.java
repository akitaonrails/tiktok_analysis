package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.model.GoLiveECIconInfo;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.region.IEcommerceRegionService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.17yx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21207317yx implements InterfaceC1123960fM2, InterfaceC1740480vOQ {
    @Override // X.InterfaceC1123960fM2
    public final String LIZ() {
        return "ecommerce_shop_influencer";
    }

    @Override // X.InterfaceC1123960fM2
    public final List<EnumC756810TmR> LIZIZ() {
        return C1697810uHb.LJIILJJIL(EnumC756810TmR.SLOT_BROADCAST_PREVIEW_TOOLBAR, EnumC756810TmR.SLOT_LIVE_ANCHOR_TOOLBAR, EnumC756810TmR.SLOT_BROADCAST_PREVIEW_EC_INDEPENDENT);
    }

    @Override // X.InterfaceC1123960fM2
    public final List<EnumC1124020fM8> LIZJ() {
        return C1697810uHb.LJIILJJIL(EnumC1124020fM8.SLOT_LIVE_FREE_FRAME, EnumC1124020fM8.SLOT_LIVE_BOTTOM_POP_L2_ANCHOR, EnumC1124020fM8.SLOT_LIVE_BROADCAST_SCRIPT, EnumC1124020fM8.SLOT_LIVE_EC_BILLBOARD_PREVIEW, EnumC1124020fM8.SLOT_LIVE_EC_BILLBOARD_BROADCAST);
    }

    @Override // X.InterfaceC1123960fM2
    public final void LIZLLL() {
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

    @Override // X.InterfaceC1123960fM2
    public final InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> LJ(final Context context, EnumC756810TmR enumC756810TmR) {
        int i = C1124050fMB.LIZIZ[enumC756810TmR.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return new C180M(context);
            }
            return new C180N(context) { // from class: X.180V
                public final Context LLJJJ;
                public final C212141180d LLJJJIL;

                @Override // X.C180N, X.InterfaceC1124060fMC
                public final String LIZ() {
                    return "ec_shop";
                }

                @Override // X.C180N
                public final String LJJI() {
                    return "ECProductBeforeLiveIndependentWidget";
                }

                @Override // X.C180N
                public final boolean LJJIIZ() {
                    GoLiveECIconInfo goLiveECIconInfo = this.LLJ;
                    return goLiveECIconInfo != null && goLiveECIconInfo.displayEcIcon && goLiveECIconInfo.independentDisplayEcIcon;
                }

                @Override // X.C180N
                public final Context LJJIFFI() {
                    return this.LLJJJ;
                }

                @Override // X.C180N
                public final /* bridge */ /* synthetic */ C212142180e LJJIII() {
                    return this.LLJJJIL;
                }

                @Override // X.C180N
                /* JADX INFO: renamed from: LJJIIJ */
                public final EnumC756810TmR LLJ() {
                    return EnumC756810TmR.SLOT_BROADCAST_PREVIEW_EC_INDEPENDENT;
                }

                @Override // X.C180N, X.InterfaceC1124060fMC
                public final Enum LLJ() {
                    return EnumC756810TmR.SLOT_BROADCAST_PREVIEW_EC_INDEPENDENT;
                }

                /* JADX WARN: Type inference failed for: r1v0, types: [X.180d] */
                {
                    super(context);
                    this.LLJJJ = context;
                    final C180Q c180q = this.LLJJI;
                    this.LLJJJIL = new C212142180e(c180q) { // from class: X.180d
                    };
                }
            };
        }
        return new C180N(context);
    }

    @Override // X.InterfaceC1123960fM2
    public final InterfaceC1124060fMC<IFrameSlot, IFrameSlot.SlotViewModel, EnumC1124020fM8> LJFF(Context context, EnumC1124020fM8 enumC1124020fM8) {
        int i = C1124050fMB.LIZ[enumC1124020fM8.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            IEcommerceRegionService iEcommerceRegionService = (IEcommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IEcommerceRegionService.class, false, false, false, 14, null);
                            if (iEcommerceRegionService != null && iEcommerceRegionService.isUS()) {
                                return new C1732200vB4(context);
                            }
                            return new C1732340vBI(context);
                        }
                        return null;
                    }
                    IEcommerceRegionService iEcommerceRegionService2 = (IEcommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IEcommerceRegionService.class, false, false, false, 14, null);
                    if (iEcommerceRegionService2 != null && iEcommerceRegionService2.isUS()) {
                        return new C1732230vB7(context);
                    }
                    return new C1732410vBP(context);
                }
                return new AnonymousClass1811();
            }
            if (!((IEcommerceRegionService) ServiceManager.get().getService(IEcommerceRegionService.class)).LIZ() || !((IEcommerceRegionService) ServiceManager.get().getService(IEcommerceRegionService.class)).isUS()) {
                C21199317xf c21199317xf = new C21199317xf(context);
                c21199317xf.LLILZIL = this;
                return c21199317xf;
            }
            return null;
        }
        return new C14GY(context);
    }

    @Override // X.InterfaceC1740480vOQ
    public final void mG(View view, LifecycleOwner lifecycleOwner) {
        C1756050vnX.LIZ(this, view, lifecycleOwner);
    }
}
