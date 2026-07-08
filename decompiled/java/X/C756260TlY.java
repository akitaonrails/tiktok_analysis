package X;

import Y.ALAdapterS0S0000000_12;
import Y.AfS148S0200000_12;
import android.animation.Animator;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.commercialize.live.business.links.model.ActiveCard;
import com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksCardList;
import com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksLiveLinkPin;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TlY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C756260TlY extends AbsSlotWidget<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> {
    public Room LLILZ;
    public BusinessLinksCardList LLILZIL;
    public AbstractC756290Tlb LLILZLL;
    public InterfaceC21213717zz LLIZ;
    public IIconSlot.SlotViewModel LLIZLLLIL;
    public boolean LLJI;
    public boolean LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public C2344009Gk LLJILLL;
    public final Keva LLILLL = Keva.getRepo("commercialize_live_business_links_keva_name");
    public final C11NJ LLJ = new C11NJ();

    @Override // X.InterfaceC1124060fMC
    public final String LIZ() {
        return "business_links";
    }

    public final void LJJ() {
        this.LLJIJIL = true;
        IIconSlot.SlotViewModel slotViewModel = this.LLIZLLLIL;
        if (slotViewModel != null) {
            this.LLJ.LIZ(C11NZ.LJLJJLL(1000L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS148S0200000_12(slotViewModel, this, 13), new C09JN() { // from class: X.00NZ
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("BusinessLinksDuringLiveWidget@8475.showToolTip$1$2");
                    C1C7U.LIZIZ("BusinessLinksDuringLiveWidget@8475.showToolTip$1$2");
                }
            }));
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final List<Integer> getMessageType() {
        return C1697810uHb.LJIILJJIL(20000);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onMessage(IMessage iMessage) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0TlZ] */
    @Override // X.InterfaceC1124060fMC
    public final Object LLILZLL() {
        final ?? r0 = new InterfaceC752610Tff() { // from class: X.0TlZ
            @Override // X.InterfaceC752610Tff
            public final void LIZ(View view, String str) {
                C756260TlY c756260TlY = this.LIZ;
                if (c756260TlY.LLILZLL == null) {
                    c756260TlY.LLILZLL = C756330Tlf.LIZ(EnumC756320Tle.DuringLive, new AwS591S0100000_12(c756260TlY, 39));
                }
                C756260TlY c756260TlY2 = this.LIZ;
                InterfaceC21213717zz interfaceC21213717zz = c756260TlY2.LLIZ;
                if (interfaceC21213717zz != null) {
                    AbstractC756290Tlb abstractC756290Tlb = c756260TlY2.LLILZLL;
                    if (abstractC756290Tlb != null) {
                        abstractC756290Tlb.LIZIZ(interfaceC21213717zz.getContext());
                    }
                    Map<String, String> map = null;
                    if (Intrinsics.LJFF(str, "during_live")) {
                        C2344009Gk c2344009Gk = c756260TlY2.LLJILLL;
                        if (c2344009Gk != null) {
                            c2344009Gk.LJIIIIZZ("type", "toolbar");
                            map = c2344009Gk.LIZ;
                        }
                        C20684815ws.LJIILLIIL("livesdk_add_links_click", map);
                        return;
                    }
                    if (!Intrinsics.LJFF(str, "during_live_dialog_item")) {
                        return;
                    }
                    C2344009Gk c2344009Gk2 = c756260TlY2.LLJILLL;
                    if (c2344009Gk2 != null) {
                        c2344009Gk2.LJIIIIZZ("type", "subpage");
                        map = c2344009Gk2.LIZ;
                    }
                    C20684815ws.LJIILLIIL("livesdk_add_links_click", map);
                }
            }
        };
        return new IIconSlot(r0) { // from class: X.0Tla
            public final InterfaceC752610Tff LIZ;

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final void getScheme() {
            }

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final Animator.AnimatorListener LIZ() {
                return new ALAdapterS0S0000000_12(1);
            }

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final InterfaceC752610Tff LIZJ() {
                return this.LIZ;
            }

            {
                this.LIZ = r0;
            }
        };
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDestroy() {
        AbstractC756290Tlb abstractC756290Tlb;
        InterfaceC21213717zz interfaceC21213717zz = this.LLIZ;
        if (interfaceC21213717zz != null && (abstractC756290Tlb = this.LLILZLL) != null) {
            abstractC756290Tlb.LIZ(interfaceC21213717zz.getContext());
        }
        this.LLJ.dispose();
        C622680Oba.LIZLLL(this);
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC756810TmR.SLOT_LIVE_ANCHOR_TOOLBAR;
    }

    @C14EU
    public final void listenToLinksLiveEvent(C756350Tlh c756350Tlh) {
        BusinessLinksLiveLinkPin businessLinksLiveLinkPin = c756350Tlh.LIZ;
        if (businessLinksLiveLinkPin != null && Intrinsics.LJFF(businessLinksLiveLinkPin.liveStatus, EnumC612330Nzz.DURING_LIVE.getValue())) {
            String str = businessLinksLiveLinkPin.actionType;
            if (Intrinsics.LJFF(str, EnumC757250Tn9.CLOSE.getValue())) {
                InterfaceC21213717zz interfaceC21213717zz = this.LLIZ;
                if (interfaceC21213717zz != null) {
                    AbstractC756290Tlb abstractC756290Tlb = this.LLILZLL;
                    if (abstractC756290Tlb != null) {
                        abstractC756290Tlb.LIZ(interfaceC21213717zz.getContext());
                    }
                    if (this.LLJI) {
                        LJJ();
                        return;
                    }
                    return;
                }
                return;
            }
            boolean z = true;
            if (Intrinsics.LJFF(str, EnumC757250Tn9.COUNT.getValue())) {
                boolean z2 = this.LLILLL.getBoolean("business_links_during_live_tips_has_displayed", false);
                if (businessLinksLiveLinkPin.count <= 0 || z2 || this.LLJIJIL) {
                    z = false;
                }
                this.LLJI = z;
                return;
            }
            if (!Intrinsics.LJFF(str, EnumC757250Tn9.PIN.getValue())) {
                return;
            }
            this.LLILLL.storeBoolean("business_links_during_live_tips_has_displayed", true);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onCreate(Bundle bundle) {
        C622680Oba.LIZJ(this);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onExposure(String str) {
        Long lValueOf;
        String string;
        C2344009Gk c2344009Gk = new C2344009Gk();
        Room room = this.LLILZ;
        Map<String, String> map = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        c2344009Gk.LJIIIIZZ("anchor_id", String.valueOf(lValueOf));
        Room room2 = this.LLILZ;
        if (room2 != null) {
            string = Long.valueOf(room2.getId()).toString();
        } else {
            string = null;
        }
        c2344009Gk.LJIIIIZZ("room_id", string);
        c2344009Gk.LJIIIIZZ("live_status", "during_live");
        c2344009Gk.LJIIIIZZ("enter_from_merge", this.LLJILJIL);
        c2344009Gk.LJIIIIZZ("enter_method", this.LLJILJILJ);
        this.LLJILLL = c2344009Gk;
        if (Intrinsics.LJFF(str, "during_live")) {
            C2344009Gk c2344009Gk2 = this.LLJILLL;
            if (c2344009Gk2 != null) {
                c2344009Gk2.LJIIIIZZ("type", "toolbar");
                map = c2344009Gk2.LIZ;
            }
            C20684815ws.LJIILLIIL("livesdk_add_links_show", map);
            return;
        }
        if (!Intrinsics.LJFF(str, "during_live_dialog_item")) {
            return;
        }
        C2344009Gk c2344009Gk3 = this.LLJILLL;
        if (c2344009Gk3 != null) {
            c2344009Gk3.LJIIIIZZ("type", "subpage");
            map = c2344009Gk3.LIZ;
        }
        C20684815ws.LJIILLIIL("livesdk_add_links_show", map);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) {
        Integer numValueOf;
        List<ActiveCard> list;
        List<ActiveCard> list2;
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) viewModel;
        this.LL = slotViewModel;
        this.LLILLJJLI = interfaceC21213717zz;
        this.LLIZ = interfaceC21213717zz;
        this.LLIZLLLIL = slotViewModel;
        slotViewModel.LLILZ.setValue(Boolean.TRUE);
        slotViewModel.LLJ.setValue(C800330VaR.LIZIZ(interfaceC21213717zz.getContext(), R.drawable.bwx));
        slotViewModel.LLJI.setValue(C800330VaR.LIZIZ(interfaceC21213717zz.getContext(), R.drawable.bwy));
        slotViewModel.LLJILJILJ.setValue(interfaceC21213717zz.getContext().getString(2131821822));
        slotViewModel.LLJIJIL.setValue(C800330VaR.LIZIZ(interfaceC21213717zz.getContext(), R.drawable.bwt));
        slotViewModel.LLJILLL.setValue(interfaceC21213717zz.getContext().getString(2131821326));
        BusinessLinksCardList businessLinksCardList = this.LLILZIL;
        if (businessLinksCardList != null && (list2 = businessLinksCardList.cardList) != null) {
            numValueOf = Integer.valueOf(list2.size());
        } else {
            numValueOf = null;
        }
        slotViewModel.LLJZIJLIL = numValueOf;
        boolean z = false;
        boolean z2 = this.LLILLL.getBoolean("business_links_during_live_tips_has_displayed", false);
        BusinessLinksCardList businessLinksCardList2 = this.LLILZIL;
        if (businessLinksCardList2 != null && (list = businessLinksCardList2.cardList) != null) {
            z = !list.isEmpty();
        }
        if (!z2 && z && !this.LLJIJIL) {
            LJJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    @Override // X.InterfaceC1124060fMC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void prepareToShow(java.util.Map<java.lang.String, java.lang.Object> r5, X.InterfaceC756140TlM r6) {
        /*
            r4 = this;
            java.lang.String r0 = "param_room"
            java.lang.Object r1 = r5.get(r0)
            boolean r0 = r1 instanceof com.bytedance.android.livesdkapi.depend.model.live.Room
            r3 = 0
            if (r0 == 0) goto L3e
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r1
        Ld:
            r4.LLILZ = r1
            java.lang.String r0 = "param_live_enter_from_merge"
            java.lang.Object r1 = r5.get(r0)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L3c
            java.lang.String r1 = (java.lang.String) r1
        L1b:
            r4.LLJILJIL = r1
            java.lang.String r0 = "param_live_enter_method_merge"
            java.lang.Object r1 = r5.get(r0)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L3a
            java.lang.String r1 = (java.lang.String) r1
        L29:
            r4.LLJILJILJ = r1
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r4.LLILZ
            if (r0 == 0) goto L56
            com.bytedance.android.livesdkapi.depend.model.live.BALinkStruct r0 = r0.getBALinkStruct()
            if (r0 == 0) goto L56
            java.lang.String r2 = r0.baLinkData
            if (r2 == 0) goto L56
            goto L40
        L3a:
            r1 = r3
            goto L29
        L3c:
            r1 = r3
            goto L1b
        L3e:
            r1 = r3
            goto Ld
        L40:
            com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L4f
            r1.<init>()     // Catch: java.lang.Exception -> L4f
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksCardList> r0 = com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksCardList.class
            java.lang.Object r0 = r1.LJII(r2, r0)     // Catch: java.lang.Exception -> L4f
            com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksCardList r0 = (com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksCardList) r0     // Catch: java.lang.Exception -> L4f
            r3 = r0
            goto L56
        L4f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C1AF0.LJ(r0)
        L56:
            r4.LLILZIL = r3
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r4.LLILZ
            if (r0 == 0) goto L6b
            com.bytedance.android.livesdkapi.depend.model.live.BALinkStruct r0 = r0.getBALinkStruct()
            if (r0 == 0) goto L6b
            int r1 = r0.baLinkPermission
            r0 = 1
            if (r1 != r0) goto L6b
        L67:
            r6.LIZ(r0)
            return
        L6b:
            r0 = 0
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C756260TlY.prepareToShow(java.util.Map, X.0TlM):void");
    }
}
