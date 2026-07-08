package X;

import Y.AObserverS234S0100000_32;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings.ShopBagIconGuidanceAnimConfigSettings;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AnimImage;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveBagIconAnimation;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.region.IEcommerceRegionService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.17yw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21207217yw implements InterfaceC1123960fM2, InterfaceC1740480vOQ {
    @Override // X.InterfaceC1123960fM2
    public final String LIZ() {
        return "ecommerce_shop";
    }

    @Override // X.InterfaceC1123960fM2
    public final List<EnumC1124020fM8> LIZJ() {
        return C1697810uHb.LJIILJJIL(EnumC1124020fM8.SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE, EnumC1124020fM8.SLOT_LIVE_HIGH_PRIORITY);
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

    @Override // X.InterfaceC1123960fM2
    public final List<EnumC756810TmR> LIZIZ() {
        int iLIZIZ = C21206517yp.LIZIZ();
        return C1697810uHb.LJIILJJIL((iLIZIZ == 2 || iLIZIZ == 3) ? EnumC756810TmR.SLOT_LIVE_WATCHER_L2_TOOLBAR : EnumC756810TmR.SLOT_LIVE_WATCHER_TOOLBAR);
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
    public final InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> LJ(Context context, EnumC756810TmR enumC756810TmR) {
        int i = C757080Tms.LIZIZ[enumC756810TmR.ordinal()];
        if (i != 1 && i != 2) {
            return null;
        }
        return new C21212117zj(context);
    }

    @Override // X.InterfaceC1123960fM2
    public final InterfaceC1124060fMC<IFrameSlot, IFrameSlot.SlotViewModel, EnumC1124020fM8> LJFF(final Context context, EnumC1124020fM8 enumC1124020fM8) {
        int i = C757080Tms.LIZ[enumC1124020fM8.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new AbsSlotWidget<IFrameSlot, IFrameSlot.SlotViewModel, EnumC1124020fM8>() { // from class: X.15Wv
                    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(9));
                    public boolean LLILZ;

                    @Override // X.InterfaceC1124060fMC
                    public final String LIZ() {
                        return "ec_multi_product_guidance";
                    }

                    public final C20534115Wp LJJ() {
                        return (C20534115Wp) this.LLILLL.getValue();
                    }

                    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
                    public final void onDestroy() {
                        if (this.LLILZ) {
                            LJJ().getClass();
                        }
                    }

                    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
                    public final void onPause() {
                        if (this.LLILZ) {
                            LJJ().getClass();
                        }
                    }

                    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
                    public final void onResume() {
                        if (this.LLILZ) {
                            LJJ().getClass();
                        }
                    }

                    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
                    public final void onStart() {
                        if (this.LLILZ) {
                            LJJ().getClass();
                        }
                    }

                    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
                    public final void onStop() {
                        if (this.LLILZ) {
                            LJJ().getClass();
                        }
                    }

                    @Override // X.InterfaceC1124060fMC
                    public final Object LLILZLL() {
                        return LJJ();
                    }

                    @Override // X.InterfaceC1124060fMC
                    public final Enum LLJ() {
                        return EnumC1124020fM8.SLOT_LIVE_HIGH_PRIORITY;
                    }

                    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
                    public final void onCreate(Bundle bundle) {
                        if (this.LLILZ) {
                            LJJ().getClass();
                        }
                    }

                    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
                    public final void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) {
                        long id;
                        int size;
                        String str;
                        Bitmap bitmap;
                        List<String> list;
                        List<AnimImage> list2;
                        IFrameSlot.SlotViewModel slotViewModel = (IFrameSlot.SlotViewModel) viewModel;
                        this.LL = slotViewModel;
                        this.LLILLJJLI = interfaceC21213717zz;
                        C20534115Wp c20534115WpLJJ = LJJ();
                        c20534115WpLJJ.LLILLJJLI = slotViewModel;
                        C20533615Wk c20533615Wk = C20533615Wk.LIZ;
                        Room room = c20534115WpLJJ.LL;
                        if (room != null) {
                            id = room.getId();
                        } else {
                            id = 0;
                        }
                        if (C20533615Wk.LIZIZ != id) {
                            c20533615Wk.getClass();
                            C20533615Wk.LJI();
                            C20533615Wk.LIZIZ = id;
                        }
                        c20533615Wk.getClass();
                        int iLIZJ = ((C563400M7u) C20533615Wk.LJ.getValue()).LIZJ();
                        LiveBagIconAnimation liveBagIconAnimation = C20533615Wk.LJII;
                        if (liveBagIconAnimation != null && (list2 = liveBagIconAnimation.animationImgList) != null) {
                            size = list2.size();
                        } else {
                            size = 0;
                        }
                        if (iLIZJ == size) {
                            if (((C557050Lt1) C20533615Wk.LIZLLL.getValue()).LIZIZ()) {
                                LiveBagIconAnimation liveBagIconAnimation2 = C20533615Wk.LJII;
                                if (liveBagIconAnimation2 == null || (list = liveBagIconAnimation2.animationTextList) == null || (str = (String) C13LP.LJJJJZI(list)) == null) {
                                    str = "";
                                }
                                ArrayList arrayList = new ArrayList();
                                Iterator it2 = C13LP.LJLLJ(C20533615Wk.LJFF().keySet()).iterator();
                                while (it2.hasNext()) {
                                    int iIntValue = ((Number) it2.next()).intValue();
                                    C20533615Wk.LIZ.getClass();
                                    C20533815Wm c20533815Wm = (C20533815Wm) C20533615Wk.LJFF().get(Integer.valueOf(iIntValue));
                                    if (c20533815Wm != null) {
                                        bitmap = c20533815Wm.LIZIZ;
                                    } else {
                                        bitmap = null;
                                    }
                                    arrayList.add(bitmap);
                                }
                                c20534115WpLJJ.LIZIZ(new C20534015Wo(str, arrayList));
                                return;
                            }
                            c20534115WpLJJ.onFail();
                            return;
                        }
                        C20533615Wk.LJFF = c20534115WpLJJ;
                        ShopBagIconGuidanceAnimConfigSettings.ECShopBagAnimConfig eCShopBagAnimConfig = ShopBagIconGuidanceAnimConfigSettings.LIZ().config;
                        if (eCShopBagAnimConfig != null && eCShopBagAnimConfig.waitRequestTime != null && eCShopBagAnimConfig.waitRequestTime.longValue() > 0) {
                            C20533615Wk.LJI = C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LJFF), null, null, new C20512615Oi(eCShopBagAnimConfig, null), 3);
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
                    @Override // X.InterfaceC1124060fMC
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void prepareToShow(java.util.Map<java.lang.String, java.lang.Object> r6, X.InterfaceC756140TlM r7) {
                        /*
                            r5 = this;
                            java.lang.String r1 = "param_room"
                            java.lang.Object r0 = r6.get(r1)
                            boolean r0 = r0 instanceof com.bytedance.android.livesdkapi.depend.model.live.Room
                            X.15Wp r4 = r5.LJJ()
                            r4.getClass()
                            java.lang.Object r1 = r6.get(r1)
                            boolean r0 = r1 instanceof com.bytedance.android.livesdkapi.depend.model.live.Room
                            if (r0 == 0) goto L4f
                            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r1
                        L19:
                            r4.LL = r1
                            r3 = 1
                            if (r1 == 0) goto L4d
                            com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct r0 = r1.getCommerceStruct()
                            if (r0 == 0) goto L4d
                            int r0 = r0.commercePermission
                            if (r0 != r3) goto L4d
                            r2 = 1
                        L29:
                            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r4.LL
                            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData r0 = X.C1733990vDx.LIZ(r0)
                            if (r0 == 0) goto L4b
                            int r1 = r0.productNum
                        L33:
                            if (r2 == 0) goto L49
                            r0 = 3
                            if (r1 < r0) goto L49
                            X.17zt r0 = X.C21213117zt.LIZ
                            r0.getClass()
                            int r0 = X.C21213117zt.LJII()
                            if (r0 != r3) goto L49
                        L43:
                            r5.LLILZ = r3
                            r7.LIZ(r3)
                            return
                        L49:
                            r3 = 0
                            goto L43
                        L4b:
                            r1 = 0
                            goto L33
                        L4d:
                            r2 = 0
                            goto L29
                        L4f:
                            r1 = 0
                            goto L19
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C20534715Wv.prepareToShow(java.util.Map, X.0TlM):void");
                    }
                };
            }
            return null;
        }
        if (!((IEcommerceRegionService) ServiceManager.get().getService(IEcommerceRegionService.class)).LIZ() || !((IEcommerceRegionService) ServiceManager.get().getService(IEcommerceRegionService.class)).isUS()) {
            AbstractC21207517yz abstractC21207517yz = new AbstractC21207517yz(context) { // from class: X.17yy
                @Override // X.InterfaceC1124060fMC
                public final String LIZ() {
                    return "ec_shop";
                }

                @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
                public final List<Integer> getMessageType() {
                    List<Integer> listLJIILJJIL = C1697810uHb.LJIILJJIL(10000);
                    Iterator<AbstractC21206817ys> it2 = this.LLILLL.iterator();
                    while (it2.hasNext()) {
                        List<Integer> messageType = it2.next().getMessageType();
                        if (messageType == null) {
                            messageType = C13BV.INSTANCE;
                        }
                        listLJIILJJIL.addAll(messageType);
                    }
                    C13LP.LJJJJI(listLJIILJJIL);
                    return listLJIILJJIL;
                }

                @Override // X.InterfaceC1124060fMC
                public final Enum LLJ() {
                    return EnumC1124020fM8.SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE;
                }

                {
                    C21199517xh c21199517xh = new C21199517xh(context);
                    c21199517xh.LLILZ = this;
                    ((ArrayList) this.LLILLL).add(c21199517xh);
                }

                @Override // X.AbstractC21207517yz
                public final boolean LJJ(boolean z) {
                    Long lLJIILIIL;
                    if (z && C180G.LIZ().showPinCardAfterShopCartIcon) {
                        C21199917xl c21199917xl = C21199917xl.LIZ;
                        String str = this.LLILZLL;
                        if (str != null) {
                            lLJIILIIL = C2095008Iq.LJIILIIL(str);
                        } else {
                            lLJIILIIL = null;
                        }
                        C21200017xm c21200017xmLIZ = c21199917xl.LIZ(lLJIILIIL);
                        if (c21200017xmLIZ != null) {
                            C21200117xn c21200117xn = new C21200117xn(3, 50);
                            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("waiting for shop bag show:");
                            sbLIZ.append(this.LLILZLL);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            c2341109Fh.getClass();
                            C2341109Fh.LJ(strLIZIZ);
                            c21200017xmLIZ.LIZIZ(c21200117xn);
                        }
                    }
                    return z;
                }

                @Override // X.AbstractC21207517yz
                /* JADX INFO: renamed from: LJJI */
                public final void LLIZ(IFrameSlot.SlotViewModel slotViewModel, InterfaceC21213717zz interfaceC21213717zz) {
                    C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onSlotCreated:");
                    sbLIZ.append(this.LLILZLL);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c2341109Fh.getClass();
                    C2341109Fh.LJ(strLIZIZ);
                    super.LLIZ(slotViewModel, interfaceC21213717zz);
                    if (C180G.LIZ().showPinCardAfterShopCartIcon) {
                        slotViewModel.LLILLJJLI.observe(interfaceC21213717zz.getLifecycleOwner(), new AObserverS234S0100000_32(this, 47));
                    }
                }

                @Override // X.AbstractC21207517yz, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
                public final /* bridge */ /* synthetic */ void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) {
                    LLIZ((IFrameSlot.SlotViewModel) viewModel, interfaceC21213717zz);
                }
            };
            Iterator it2 = ((ArrayList) abstractC21207517yz.LLILLL).iterator();
            while (it2.hasNext()) {
                ((AbstractC21206817ys) it2.next()).LLILZIL = this;
            }
            return abstractC21207517yz;
        }
        return null;
    }

    @Override // X.InterfaceC1740480vOQ
    public final void mG(View view, LifecycleOwner lifecycleOwner) {
        C1756050vnX.LIZ(this, view, lifecycleOwner);
    }
}
