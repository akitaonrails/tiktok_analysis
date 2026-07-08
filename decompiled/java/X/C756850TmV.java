package X;

import android.animation.Animator;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdkapi.host.IHostCommerce;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.slot.SlotsBottomSheetDialog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0TmV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C756850TmV implements IIconSlot {
    public SlotsBottomSheetDialog LIZ;
    public final /* synthetic */ C756830TmT LIZIZ;

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final Animator.AnimatorListener LIZ() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final void getScheme() {
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final InterfaceC752610Tff LIZJ() {
        return new InterfaceC752610Tff() { // from class: X.0TmU
            @Override // X.InterfaceC752610Tff
            public final void LIZ(View view, String str) {
                String str2;
                FragmentManager fragmentManagerLJIL;
                C756850TmV c756850TmV = this.LIZ;
                if (c756850TmV.LIZ == null) {
                    C756830TmT c756830TmT = this.LIZ.LIZIZ;
                    c756850TmV.LIZ = new SlotsBottomSheetDialog(c756830TmT.LLIZLLLIL, c756830TmT.LLJI);
                    C756850TmV c756850TmV2 = this.LIZ;
                    c756850TmV2.LIZ.LL = c756850TmV2.LIZIZ.LL;
                }
                if (!this.LIZ.LIZ.isShowing()) {
                    InterfaceC21213717zz interfaceC21213717zz = this.LIZ.LIZIZ.LLILZ;
                    if (interfaceC21213717zz != null && (fragmentManagerLJIL = C520010KaN.LJIL(interfaceC21213717zz.getContext(), false)) != null) {
                        this.LIZ.LIZ.show(fragmentManagerLJIL, "GroupIconSlot");
                        this.LIZ.LIZIZ.getClass();
                        ((IHostCommerce) C1161920gLG.LIZJ(IHostCommerce.class)).ld("open_business_panel");
                    }
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("anchor_id", ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
                    c2344009Gk.LJIIIIZZ("room_id", this.LIZ.LIZIZ.LLJI.LIZ());
                    c2344009Gk.LJIIIIZZ("live_status", this.LIZ.LIZIZ.LLJI.LIZLLL);
                    c2344009Gk.LJIIIIZZ("icon_type", "Business");
                    c2344009Gk.LJIIIIZZ("enter_from_merge", this.LIZ.LIZIZ.LLJI.LIZ);
                    c2344009Gk.LJIIIIZZ("enter_method", this.LIZ.LIZIZ.LLJI.LIZIZ);
                    C20684815ws.LJIILLIIL("livesdk_business_icon_click", c2344009Gk.LIZ);
                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                    c2344009Gk2.LJIIIIZZ("author_id", ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
                    c2344009Gk2.LJIIIIZZ("room_id", this.LIZ.LIZIZ.LLJI.LIZ());
                    c2344009Gk2.LJIIIIZZ("EVENT_ORIGIN_FEATURE", "TEMAI");
                    c2344009Gk2.LJIIIIZZ("live_status", this.LIZ.LIZIZ.LLJI.LIZLLL);
                    C756830TmT c756830TmT2 = this.LIZ.LIZIZ;
                    if (c756830TmT2.LLILZ.LJI() != null && c756830TmT2.LLILZ.LJI().hasEcLivePermission) {
                        str2 = "1";
                    } else {
                        str2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c2344009Gk2.LJIIIIZZ("has_ec_permission", str2);
                    c2344009Gk2.LJIIIIZZ("is_red_dot", this.LIZ.LIZIZ.LJI());
                    C756830TmT c756830TmT3 = this.LIZ.LIZIZ;
                    c756830TmT3.getClass();
                    c2344009Gk2.LJIIIIZZ("ec_icon_show_position", ((IHostCommerce) C1161920gLG.LIZJ(IHostCommerce.class)).Tv(c756830TmT3.LLJIJIL.size(), c756830TmT3.LLILZ.LJI()));
                    c2344009Gk2.LJIIIIZZ("previous_page", this.LIZ.LIZIZ.LLJILJIL);
                    c2344009Gk2.LIZJ(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser().getFansCount(), "fans_cnt");
                    this.LIZ.LIZIZ.LJFF(c2344009Gk2);
                    Iterator it2 = ((HashMap) this.LIZ.LIZIZ.LL.LIZJ).entrySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) ((Map.Entry) it2.next()).getValue();
                        if (EnumC756890TmZ.ECOMMERCE == slotViewModel.LLLI) {
                            if (slotViewModel.LLLFZ.booleanValue()) {
                                c2344009Gk2.LJFF("is_bubble_show", "1");
                            } else {
                                c2344009Gk2.LJFF("is_bubble_show", CardStruct.IStatusCode.DEFAULT);
                            }
                        }
                    }
                    C20684815ws.LJIILLIIL("livesdk_tiktokec_business_icon_click", c2344009Gk2.LIZ);
                    this.LIZ.LIZIZ.getClass();
                    ((IHostCommerce) C1161920gLG.LIZJ(IHostCommerce.class)).ld("business_icon_click");
                    for (InterfaceC1124060fMC interfaceC1124060fMC : this.LIZ.LIZIZ.LLJIJIL.keySet()) {
                        if (interfaceC1124060fMC instanceof AbsSlotWidget) {
                            ((AbsSlotWidget) interfaceC1124060fMC).onAggregateClick();
                        }
                    }
                }
                C756830TmT c756830TmT4 = this.LIZ.LIZIZ;
                if (c756830TmT4.LLIZ) {
                    IIconSlot.SlotViewModel slotViewModel2 = c756830TmT4.LLILLL;
                    if (slotViewModel2 != null) {
                        slotViewModel2.LLIZ.postValue(Boolean.FALSE);
                    }
                    this.LIZ.LIZIZ.LLIZ = false;
                }
            }
        };
    }

    public C756850TmV(C756830TmT c756830TmT) {
        this.LIZIZ = c756830TmT;
    }
}
