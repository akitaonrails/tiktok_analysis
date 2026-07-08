package X;

import Y.ALAdapterS0S0000000_12;
import Y.ARunnableS112S0100000_12;
import Y.AfS56S0110000_12;
import android.animation.Animator;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.live.business.links.api.BusinessLinksLiveApi;
import com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksLiveLinkPin;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TlV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C756230TlV extends AbsSlotWidget<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> implements C01SH {
    public InterfaceC21213717zz LLILZ;
    public IIconSlot.SlotViewModel LLILZIL;
    public AbstractC756290Tlb LLILZLL;
    public String LLJ;
    public String LLJI;
    public C2344009Gk LLJIJIL;
    public final Keva LLILLL = Keva.getRepo("commercialize_live_business_links_keva_name");
    public final C11NJ LLIZ = new C11NJ();
    public final BPEAHandler LLIZLLLIL = new BPEAHandler(Looper.getMainLooper());

    @Override // X.InterfaceC1124060fMC
    public final String LIZ() {
        return "business_links";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0TlW] */
    @Override // X.InterfaceC1124060fMC
    public final Object LLILZLL() {
        final ?? r0 = new InterfaceC752610Tff() { // from class: X.0TlW
            @Override // X.InterfaceC752610Tff
            public final void LIZ(View view, String str) {
                MutableLiveData<Boolean> mutableLiveData;
                C756230TlV c756230TlV = this.LIZ;
                if (c756230TlV.LLILZLL == null) {
                    c756230TlV.LLILZLL = C756330Tlf.LIZ(EnumC756320Tle.BeforeLive, new AwS591S0100000_12(c756230TlV, 1244));
                }
                C756230TlV c756230TlV2 = this.LIZ;
                InterfaceC21213717zz interfaceC21213717zz = c756230TlV2.LLILZ;
                if (interfaceC21213717zz != null) {
                    AbstractC756290Tlb abstractC756290Tlb = c756230TlV2.LLILZLL;
                    if (abstractC756290Tlb != null) {
                        abstractC756290Tlb.LIZIZ(interfaceC21213717zz.getContext());
                    }
                    Map<String, String> map = null;
                    if (Intrinsics.LJFF(str, "before_live")) {
                        C2344009Gk c2344009Gk = c756230TlV2.LLJIJIL;
                        if (c2344009Gk != null) {
                            c2344009Gk.LJIIIIZZ("type", "toolbar");
                            map = c2344009Gk.LIZ;
                        }
                        C20684815ws.LJIILLIIL("livesdk_add_links_click", map);
                    } else if (Intrinsics.LJFF(str, "before_live_dialog_item")) {
                        C2344009Gk c2344009Gk2 = c756230TlV2.LLJIJIL;
                        if (c2344009Gk2 != null) {
                            c2344009Gk2.LJIIIIZZ("type", "subpage");
                            map = c2344009Gk2.LIZ;
                        }
                        C20684815ws.LJIILLIIL("livesdk_add_links_click", map);
                    }
                    int i = c756230TlV2.LLILLL.getInt("business_links_before_live_red_click_times", 0);
                    if (i == 0) {
                        c756230TlV2.LLILLL.storeInt("business_links_before_live_icon_display_times", 6);
                        IIconSlot.SlotViewModel slotViewModel = c756230TlV2.LLILZIL;
                        if (slotViewModel != null && (mutableLiveData = slotViewModel.LLIZ) != null) {
                            mutableLiveData.setValue(Boolean.FALSE);
                        }
                    }
                    c756230TlV2.LLILLL.storeInt("business_links_before_live_red_click_times", i + 1);
                }
            }
        };
        return new IIconSlot(r0) { // from class: X.0TlX
            public final InterfaceC752610Tff LIZ;

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final void getScheme() {
            }

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final Animator.AnimatorListener LIZ() {
                return new ALAdapterS0S0000000_12(9);
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
        InterfaceC21213717zz interfaceC21213717zz = this.LLILZ;
        if (interfaceC21213717zz != null && (abstractC756290Tlb = this.LLILZLL) != null) {
            abstractC756290Tlb.LIZ(interfaceC21213717zz.getContext());
        }
        this.LLIZ.dispose();
        C622680Oba.LIZLLL(this);
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC756810TmR.SLOT_BROADCAST_PREVIEW_TOOLBAR;
    }

    public final void LJJ(boolean z) {
        C0TPP.LIZ.getClass();
        this.LLIZ.LIZ(((BusinessLinksLiveApi) C0TPP.LIZ(BusinessLinksLiveApi.class)).getActiveLinksCount().LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS56S0110000_12(this, z, 3), new C09JN() { // from class: X.0TIg
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("BusinessLinksBeforeLiveWidget@9196.updateIconAlertNum$2");
                C1C7U.LIZIZ("BusinessLinksBeforeLiveWidget@9196.updateIconAlertNum$2");
            }
        }));
    }

    @C14EU
    public final void listenToLinksLiveEvent(C756350Tlh c756350Tlh) {
        IIconSlot.SlotViewModel slotViewModel;
        MutableLiveData<String> mutableLiveData;
        String str;
        AbstractC756290Tlb abstractC756290Tlb;
        BusinessLinksLiveLinkPin businessLinksLiveLinkPin = c756350Tlh.LIZ;
        if (businessLinksLiveLinkPin != null && Intrinsics.LJFF(businessLinksLiveLinkPin.liveStatus, EnumC612330Nzz.BEFORE_LIVE.getValue())) {
            String str2 = businessLinksLiveLinkPin.actionType;
            if (Intrinsics.LJFF(str2, EnumC757250Tn9.CLOSE.getValue())) {
                InterfaceC21213717zz interfaceC21213717zz = this.LLILZ;
                if (interfaceC21213717zz != null && (abstractC756290Tlb = this.LLILZLL) != null) {
                    abstractC756290Tlb.LIZ(interfaceC21213717zz.getContext());
                    return;
                }
                return;
            }
            if (!Intrinsics.LJFF(str2, EnumC757250Tn9.COUNT.getValue()) || (slotViewModel = this.LLILZIL) == null || (mutableLiveData = slotViewModel.LLILZLL) == null) {
                return;
            }
            int i = businessLinksLiveLinkPin.count;
            if (i >= 1) {
                str = String.valueOf(i);
            } else {
                str = new String();
            }
            mutableLiveData.setValue(str);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onCreate(Bundle bundle) {
        C622680Oba.LIZJ(this);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onExposure(String str) {
        String currentUserID;
        C2344009Gk c2344009Gk = new C2344009Gk();
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService == null || (currentUserID = iUserService.getCurrentUserID()) == null) {
            currentUserID = "";
        }
        c2344009Gk.LJIIIIZZ("anchor_id", currentUserID);
        c2344009Gk.LJIIIIZZ("room_id", "");
        c2344009Gk.LJIIIIZZ("live_status", "before_live");
        c2344009Gk.LJIIIIZZ("enter_from_merge", this.LLJ);
        c2344009Gk.LJIIIIZZ("enter_method", this.LLJI);
        this.LLJIJIL = c2344009Gk;
        Map<String, String> map = null;
        if (Intrinsics.LJFF(str, "before_live")) {
            C2344009Gk c2344009Gk2 = this.LLJIJIL;
            if (c2344009Gk2 != null) {
                c2344009Gk2.LJIIIIZZ("type", "toolbar");
                map = c2344009Gk2.LIZ;
            }
            C20684815ws.LJIILLIIL("livesdk_add_links_show", map);
            return;
        }
        if (!Intrinsics.LJFF(str, "before_live_dialog_item")) {
            return;
        }
        C2344009Gk c2344009Gk3 = this.LLJIJIL;
        if (c2344009Gk3 != null) {
            c2344009Gk3.LJIIIIZZ("type", "subpage");
            map = c2344009Gk3.LIZ;
        }
        C20684815ws.LJIILLIIL("livesdk_add_links_show", map);
    }

    @Override // X.C01SH
    public final Object LJIILLIIL(String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        try {
            C0TPP.LIZ.getClass();
            if (((BusinessLinksLiveApi) C0TPP.LIZ(BusinessLinksLiveApi.class)).clearBusinessLinksCards().LJ().status_code == 0) {
                C786410Ut5.LJJZZIII(this.LLIZLLLIL, new ARunnableS112S0100000_12(this, 502));
                return true;
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return false;
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) {
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) viewModel;
        this.LL = slotViewModel;
        this.LLILLJJLI = interfaceC21213717zz;
        this.LLILZ = interfaceC21213717zz;
        this.LLILZIL = slotViewModel;
        slotViewModel.LLILZ.setValue(Boolean.TRUE);
        slotViewModel.LLJ.setValue(C800330VaR.LIZIZ(interfaceC21213717zz.getContext(), R.drawable.bww));
        slotViewModel.LLJILJILJ.setValue(interfaceC21213717zz.getContext().getString(2131821822));
        slotViewModel.LLJIJIL.setValue(C800330VaR.LIZIZ(interfaceC21213717zz.getContext(), R.drawable.bwt));
        slotViewModel.LLJILLL.setValue(interfaceC21213717zz.getContext().getString(2131821326));
        int i = this.LLILLL.getInt("business_links_before_live_icon_display_times", 0);
        if (i > 5) {
            LJJ(true);
        } else {
            LJJ(false);
        }
        this.LLILLL.storeInt("business_links_before_live_icon_display_times", i + 1);
    }

    @Override // X.InterfaceC1124060fMC
    public final void prepareToShow(Map<String, Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        String str;
        Object obj = map.get("param_live_ba_link");
        String str2 = null;
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Object obj2 = map.get("param_live_enter_from_merge");
        if (obj2 instanceof String) {
            str = (String) obj2;
        } else {
            str = null;
        }
        this.LLJ = str;
        Object obj3 = map.get("param_live_enter_method_merge");
        if (obj3 instanceof String) {
            str2 = (String) obj3;
        }
        this.LLJI = str2;
        interfaceC756140TlM.LIZ(Intrinsics.LJFF(obj, Boolean.TRUE));
    }
}
