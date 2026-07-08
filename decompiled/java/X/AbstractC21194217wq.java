package X;

import Y.AObserverS234S0100000_32;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.model.message.DispersionInfo;
import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.android.livesdk.model.message.ext.PopProduct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionStyleConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.ISeaLiveContextAbility;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AnchorPinCardConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.BuyButtonConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleControl;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveVoucher;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.NextActionInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PdpTopBubble;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ProductPreheatAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ShoppingBagList;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.settings.EcomRefreshPincardSettings;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.region.service.IECommerceRegionService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS9S1310000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.17wq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21194217wq extends AbstractC21206817ys implements InterfaceC1740480vOQ, C18ZN, InterfaceC1164530gPT {
    public static final /* synthetic */ int LLLLIIIILLL = 0;
    public final Context LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C21194817ww LLJI;
    public IFrameSlot.SlotViewModel LLJIJIL;
    public InterfaceC21213717zz LLJILJIL;
    public final C1743900vTw LLJILJILJ;
    public Room LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public Boolean LLJJIII;
    public Map<String, String> LLJJIJI;
    public Map<String, String> LLJJIJIIJIL;
    public String LLJJIJIL;
    public String LLJJJ;
    public String LLJJJIL;
    public final Map<String, String> LLJJJJ;
    public String LLJJJJJIL;
    public String LLJJJJLIIL;
    public String LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public long LLJL;
    public long LLJLIL;
    public long LLJLILLLLZIIL;
    public long LLJLL;
    public Map<String, String> LLJLLIL;
    public final C1519570pe7 LLJLLL;
    public Long LLJZ;
    public ISeaLiveContextAbility LLJZIJLIL;
    public final C01GW LLL;
    public final BPEAHandler LLLF;
    public final C21195017wy LLLFF;
    public String LLLFFI;
    public final C054G LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public boolean LLLIIII;
    public AnonymousClass0956 LLLIIIIL;
    public AnonymousClass0956 LLLIIIL;
    public AnonymousClass0956 LLLIIL;
    public long LLLIILIL;
    public final C598800NeA LLLIL;
    public final C21179117uP LLLILZ;
    public Pair<? extends ECommerceMessage, Long> LLLILZJ;
    public Integer LLLILZLLLI;
    public long LLLIZZ;
    public AObserverS234S0100000_32 LLLJ;
    public Observer<User> LLLJIL;
    public Boolean LLLJL;
    public final AObserverS234S0100000_32 LLLL;
    public final C21182617uy LLLLII;

    @Override // X.InterfaceC1124060fMC
    public final String LIZ() {
        return "ec_shop";
    }

    public abstract void LJJIFFI();

    public abstract boolean LJJII(int i);

    public abstract AbstractC21198617xY<?> LJJIJIIJI();

    public abstract AbstractC21196217xA LJJIJLIJ();

    public abstract boolean LJJIL();

    public abstract boolean LJJJIL();

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final boolean LLIZLLLIL() {
        return true;
    }

    @Override // X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final List<Integer> getMessageType() {
        return C21182917v1.LIZ(1);
    }

    @Override // X.InterfaceC1748820vbs
    public final String getPageName() {
        return "pop_card";
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onPause() {
        this.LLJJI = false;
        this.LLJILJILJ.LJIIJ("is_page_visible", false);
        C598800NeA c598800NeA = this.LLLIL;
        c598800NeA.getClass();
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("stop refresh");
        c598800NeA.LIZLLL = false;
    }

    @Override // X.InterfaceC1748820vbs
    public final void sh() {
    }

    public final void LJJIII() {
        AnonymousClass0956 anonymousClass0956 = this.LLLIIIIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AbstractC21198617xY<?> abstractC21198617xYLJJIJIIJI = LJJIJIIJI();
        if (abstractC21198617xYLJJIJIIJI.LL != null) {
            abstractC21198617xYLJJIJIIJI.LLILZ = true;
        }
        AbstractC21196217xA abstractC21196217xALJJIJLIJ = LJJIJLIJ();
        Room room = this.LLJILLL;
        abstractC21196217xALJJIJLIJ.LJIIJJI(room != null ? Long.valueOf(room.getId()).toString() : null, null);
        LJJIIZ("unpin");
        this.LLJI.LJIIIIZZ = "unpin";
        this.LLJLLL.LIZ();
        Room room2 = this.LLJILLL;
        C598360NdS.LIZJ(String.valueOf(room2 != null ? Long.valueOf(room2.getId()) : null), C1697810uHb.LJIIJJI(1, 3, 6));
    }

    public final boolean LJJIIZI() {
        if (Intrinsics.LJFF(this.LLJJIII, Boolean.TRUE)) {
            return true;
        }
        Map<String, String> map = this.LLJJIJI;
        return Intrinsics.LJFF(map != null ? map.get("is_pseudo_ad") : null, "1");
    }

    public final boolean LJJJ() {
        IFrameSlot.SlotViewModel slotViewModel;
        MutableLiveData<android.util.Pair<Boolean, String>> mutableLiveData;
        android.util.Pair<Boolean, String> value;
        InterfaceC21180617ue interfaceC21180617ue = this.LLILZ;
        return ((interfaceC21180617ue != null && !interfaceC21180617ue.LJIL(this)) || (slotViewModel = this.LLJIJIL) == null || (mutableLiveData = slotViewModel.LL) == null || (value = mutableLiveData.getValue()) == null || !Intrinsics.LJFF(value.first, Boolean.TRUE)) ? false : true;
    }

    @Override // X.C18ZN
    public final void onAppBackground() {
        IFrameSlot.SlotViewModel slotViewModel;
        MutableLiveData<android.util.Pair<Boolean, String>> mutableLiveData;
        android.util.Pair<Boolean, String> value;
        InterfaceC21180617ue interfaceC21180617ue = this.LLILZ;
        if ((interfaceC21180617ue != null && !interfaceC21180617ue.LJIL(this)) || (slotViewModel = this.LLJIJIL) == null || (mutableLiveData = slotViewModel.LL) == null || (value = mutableLiveData.getValue()) == null || !Intrinsics.LJFF(value.first, Boolean.TRUE)) {
            return;
        }
        C21194817ww c21194817ww = this.LLJI;
        c21194817ww.LJIIIIZZ = "close";
        if (!c21194817ww.LJ && c21194817ww.LIZJ && c21194817ww.LIZLLL) {
            c21194817ww.LIZLLL = false;
            c21194817ww.LIZ();
        }
    }

    @Override // X.C18ZN
    public final void onAppForeground() {
        IFrameSlot.SlotViewModel slotViewModel;
        MutableLiveData<android.util.Pair<Boolean, String>> mutableLiveData;
        android.util.Pair<Boolean, String> value;
        InterfaceC21180617ue interfaceC21180617ue = this.LLILZ;
        if ((interfaceC21180617ue != null && !interfaceC21180617ue.LJIL(this)) || (slotViewModel = this.LLJIJIL) == null || (mutableLiveData = slotViewModel.LL) == null || (value = mutableLiveData.getValue()) == null || !Intrinsics.LJFF(value.first, Boolean.TRUE)) {
            return;
        }
        C21194817ww c21194817ww = this.LLJI;
        if (c21194817ww.LJ || !c21194817ww.LIZJ || c21194817ww.LIZLLL) {
            return;
        }
        c21194817ww.LIZLLL = true;
        c21194817ww.LIZIZ();
    }

    @Override // X.AbstractC21206817ys, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public void onDestroy() {
        ILiveOuterService iLiveOuterService;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        IFrameSlot.SlotViewModel slotViewModel;
        MutableLiveData<android.util.Pair<Boolean, String>> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        InterfaceC21180617ue interfaceC21180617ue;
        IFrameSlot.SlotViewModel slotViewModel2;
        MutableLiveData<android.util.Pair<Boolean, String>> mutableLiveData3;
        android.util.Pair<Boolean, String> value;
        this.LLLIILIL = -1L;
        C598800NeA c598800NeA = this.LLLIL;
        c598800NeA.LJ = null;
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("destroy");
        AnonymousClass0956 anonymousClass0956 = c598800NeA.LIZIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        c598800NeA.LIZIZ = null;
        c598800NeA.LIZLLL = true;
        c598800NeA.LIZJ = 0L;
        if (!this.LLJJ && (((interfaceC21180617ue = this.LLILZ) == null || interfaceC21180617ue.LJIL(this)) && (slotViewModel2 = this.LLJIJIL) != null && (mutableLiveData3 = slotViewModel2.LL) != null && (value = mutableLiveData3.getValue()) != null && Intrinsics.LJFF(value.first, Boolean.TRUE) && (LJJIJIIJI().LLILZIL == 0 || ((LJJIJIIJI().LLILZIL instanceof AbstractC21202217y8) && !((AbstractC21202217y8) LJJIJIIJI().LLILZIL).LL)))) {
            PopupCardVO popupCardVO = LJJIJIIJI().LL;
            String strValueOf = String.valueOf(popupCardVO != null ? Long.valueOf(popupCardVO.productId) : null);
            Room room = this.LLJILLL;
            C21198417xW.LJI(this.LLLI, strValueOf, room != null ? Long.valueOf(room.getId()).toString() : null, LJJIJ(), "destroy", LJJIJIL(), this.LLLII, this.LLJJI);
        }
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_page_quit", this);
        IFrameSlot.SlotViewModel slotViewModel3 = this.LLJIJIL;
        if (slotViewModel3 != null && (mutableLiveData2 = slotViewModel3.LLILZIL) != null) {
            mutableLiveData2.removeObserver(this.LLLL);
        }
        this.LLJJ = true;
        C2296808zG.LIZJ(this.LLLFZ, null);
        AObserverS234S0100000_32 aObserverS234S0100000_32 = this.LLLJ;
        if (aObserverS234S0100000_32 != null && (slotViewModel = this.LLJIJIL) != null && (mutableLiveData = slotViewModel.LL) != null) {
            mutableLiveData.removeObserver(aObserverS234S0100000_32);
        }
        Observer<User> observer = this.LLLJIL;
        if (observer != null && (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null) {
            interfaceC20673515v3K4.dn(observer);
        }
        this.LLILZ = null;
        this.LLLF.removeCallbacksAndMessages(null);
        LJJIJIIJI().LJJIFFI("other");
        LJJIJLIJ().LIZJ();
        LJJIJIIJI().getClass();
        if (C288780BTo.LIZ()) {
            ((C21200317xp) this.LLL.getValue()).LIZLLL();
        }
        ActivityStack.removeAppBackGroundListener(this);
        this.LLJI.LIZ = null;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LLILZLL);
        if (c19egLIZIZ != null) {
            c19egLIZIZ.getSupportFragmentManager().LLIILZL(this.LLLFF);
        }
        EventBus.LIZLLL().LJIJJLI(C591940NJo.class);
        this.LLJLLL.LIZJ();
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onResume() {
        IFrameSlot.SlotViewModel slotViewModel;
        MutableLiveData<android.util.Pair<Boolean, String>> mutableLiveData;
        android.util.Pair<Boolean, String> value;
        this.LLLIL.LJ();
        LJJJLIIL(0L, "become_visible", false);
        this.LLJJI = true;
        this.LLJILJILJ.LJIIJ("is_page_visible", true);
        InterfaceC21180617ue interfaceC21180617ue = this.LLILZ;
        if ((interfaceC21180617ue == null || interfaceC21180617ue.LJIL(this)) && (slotViewModel = this.LLJIJIL) != null && (mutableLiveData = slotViewModel.LL) != null && (value = mutableLiveData.getValue()) != null && Intrinsics.LJFF(value.first, Boolean.TRUE) && (LJJIJIIJI().LLILZIL == 0 || ((LJJIJIIJI().LLILZIL instanceof AbstractC21202217y8) && !((AbstractC21202217y8) LJJIJIIJI().LLILZIL).LL))) {
            PopupCardVO popupCardVO = LJJIJIIJI().LL;
            String strValueOf = String.valueOf(popupCardVO != null ? Long.valueOf(popupCardVO.productId) : null);
            Room room = this.LLJILLL;
            String string = room != null ? Long.valueOf(room.getId()).toString() : null;
            String strLJJIJ = LJJIJ();
            boolean z = this.LLLI;
            boolean z2 = this.LLLII;
            String strLJJIJIL = LJJIJIL();
            try {
                C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("product_id", strValueOf);
                jSONObject.put("room_id", string);
                jSONObject.put("author_id", strLJJIJ);
                jSONObject.put("has_ec_perm", z ? 1 : 0);
                jSONObject.put("is_anchor", z2 ? 1 : 0);
                jSONObject.put("live_role", strLJJIJIL);
                c1507790pL7.getClass();
                C1507790pL7.LIZLLL("rd_tiktokec_live_pop_product_resume", jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        Pair<? extends ECommerceMessage, Long> pair = this.LLLILZJ;
        if (pair != null) {
            LJJJJLI(pair.getFirst(), pair.getSecond().longValue(), false);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onStart() {
        IFrameSlot.SlotViewModel slotViewModel;
        MutableLiveData<android.util.Pair<Boolean, String>> mutableLiveData;
        android.util.Pair<Boolean, String> value;
        IFrameSlot.SlotViewModel slotViewModel2;
        LifecycleOwner lifecycleOwnerLJJJI;
        MutableLiveData<String> mutableLiveData2;
        InterfaceC21180617ue interfaceC21180617ue = this.LLILZ;
        if ((interfaceC21180617ue == null || interfaceC21180617ue.LJIL(this)) && (slotViewModel = this.LLJIJIL) != null && (mutableLiveData = slotViewModel.LL) != null && (value = mutableLiveData.getValue()) != null && Intrinsics.LJFF(value.first, Boolean.TRUE)) {
            this.LLJILJILJ.LJII(System.currentTimeMillis(), "start_time");
            LJJIJIIJI().getClass();
            C21194817ww c21194817ww = this.LLJI;
            if (!c21194817ww.LJ && c21194817ww.LIZLLL && !c21194817ww.LIZJ) {
                c21194817ww.LIZJ = true;
                c21194817ww.LIZIZ();
            }
        }
        ViewModel viewModel = this.LL;
        if (!(viewModel instanceof IFrameSlot.SlotViewModel) || (slotViewModel2 = (IFrameSlot.SlotViewModel) viewModel) == null || (lifecycleOwnerLJJJI = LJJJI(this.LLILZLL)) == null) {
            return;
        }
        C110600bQ.LIZ.getClass();
        if (C110600bQ.LIZJ == null) {
            WeakReference<Observer<String>> weakReference = new WeakReference<>(new C513601zK(lifecycleOwnerLJJJI, 47));
            C110600bQ.LIZJ = weakReference;
            Observer<String> observer = weakReference.get();
            if (observer == null || (mutableLiveData2 = slotViewModel2.LLIZ) == null) {
                return;
            }
            mutableLiveData2.observe(lifecycleOwnerLJJJI, observer);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onStop() {
        IFrameSlot.SlotViewModel slotViewModel;
        MutableLiveData<android.util.Pair<Boolean, String>> mutableLiveData;
        android.util.Pair<Boolean, String> value;
        IFrameSlot.SlotViewModel slotViewModel2;
        LifecycleOwner lifecycleOwnerLJJJI;
        InterfaceC21180617ue interfaceC21180617ue = this.LLILZ;
        if ((interfaceC21180617ue == null || interfaceC21180617ue.LJIL(this)) && (slotViewModel = this.LLJIJIL) != null && (mutableLiveData = slotViewModel.LL) != null && (value = mutableLiveData.getValue()) != null && Intrinsics.LJFF(value.first, Boolean.TRUE)) {
            LJJJJZ("other");
            LJJIJIIJI().getClass();
            C21194817ww c21194817ww = this.LLJI;
            if (!c21194817ww.LJ && c21194817ww.LIZLLL && c21194817ww.LIZJ) {
                c21194817ww.LIZJ = false;
                c21194817ww.LIZ();
            }
        }
        ViewModel viewModel = this.LL;
        if (!(viewModel instanceof IFrameSlot.SlotViewModel) || (slotViewModel2 = (IFrameSlot.SlotViewModel) viewModel) == null || (lifecycleOwnerLJJJI = LJJJI(this.LLILZLL)) == null) {
            return;
        }
        C110600bQ.LIZ.getClass();
        MutableLiveData<String> mutableLiveData2 = slotViewModel2.LLIZ;
        if (mutableLiveData2 != null) {
            mutableLiveData2.removeObservers(lifecycleOwnerLJJJI);
        }
        C110600bQ.LIZJ = null;
        C110600bQ.LIZLLL = null;
    }

    public static final String LJJIJ() {
        String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
        return currentUserID == null ? "" : currentUserID;
    }

    public final String LJJIJIL() {
        return (LJJIL() ? EnumC21196517xD.ROOM_OWNER : this.LLLII ? EnumC21196517xD.ANCHOR_AS_AUDIENCE : EnumC21196517xD.AUDIENCE).getRoleStr();
    }

    @Override // X.InterfaceC1124060fMC
    public final Object LLILZLL() {
        return LJJIJIIJI();
    }

    @Override // X.InterfaceC1748820vbs
    public final Map<String, String> Aa() {
        return C988803tm.LIZIZ;
    }

    @Override // X.InterfaceC1748810vbr
    public final InterfaceC1748810vbr d8() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1748810vbr
    public final List<String> getRegisteredLane() {
        return C988803tm.LIZ;
    }

    public static boolean LJJIIJ(OecInitData oecInitData) {
        int i = oecInitData.cardType;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 99 && oecInitData.lynxCardInfo == null) {
                        return true;
                    }
                    return false;
                }
                if (oecInitData.popVoucher == null) {
                    return false;
                }
            } else if (oecInitData.shoppingBagList != null) {
                return false;
            }
        } else {
            String str = oecInitData.popProductId;
            if (str == null || a0.LJJJIL(str)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LJJIZ(Integer num) {
        if (num != null) {
            if (4 == num.intValue() || 5 == num.intValue()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static LifecycleOwner LJJJI(Context context) {
        if (!C290160BYw.LIZ() && !C07MW.LIZ()) {
            return C1388190mED.LIZIZ(context);
        }
        AbstractC1387200mCc abstractC1387200mCcLIZJ = C520150Kab.LIZJ(context);
        if (abstractC1387200mCcLIZJ != null) {
            return abstractC1387200mCcLIZJ.LJFF();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    @Override // X.AbstractC21206817ys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean LJJ(java.util.Map<java.lang.String, java.lang.Object> r29) {
        /*
            Method dump skipped, instruction units count: 1399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC21194217wq.LJJ(java.util.Map):boolean");
    }

    public final void LJJIIJZLJL(boolean z) {
        Long lValueOf = null;
        if (!this.LLLI) {
            Room room = this.LLJILLL;
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            }
            C21197617xO.LIZIZ(String.valueOf(lValueOf), LJJIJIL(), "no_ec_perm", z);
            return;
        }
        if (LJJIL()) {
            return;
        }
        int i = C21197617xO.LIZ;
        if (C21197617xO.LIZ != 0) {
            return;
        }
        Room room2 = this.LLJILLL;
        if (room2 != null) {
            lValueOf = Long.valueOf(room2.getId());
        }
        C21197617xO.LIZIZ(String.valueOf(lValueOf), LJJIJIL(), "no_product", z);
    }

    public final void LJJIIZ(String str) {
        LJJIJIIJI().getClass();
        LJJIJLIJ().LIZ(str);
    }

    public final int LJJIJL(boolean z) {
        if (Intrinsics.LJFF(this.LLLJL, Boolean.TRUE)) {
            return 2;
        }
        if (!z && this.LLLJL != null) {
            return 1;
        }
        return 0;
    }

    public final void LJJJJZ(String str) {
        this.LLJILJILJ.LJIIIIZZ("quit_type", str, false);
        this.LLJILJILJ.LJII(System.currentTimeMillis() - this.LLJILJILJ.LIZ("start_time"), "stay_time");
        LJJIJLIJ().LJIIIIZZ(str);
    }

    public final void LJJJJZI(ECommerceMessage eCommerceMessage) {
        boolean zLJFF;
        MutableLiveData<android.util.Pair<Boolean, String>> mutableLiveData;
        android.util.Pair<Boolean, String> value;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LLJILJILJ.LJII(System.currentTimeMillis(), "client_received_time");
        IFrameSlot.SlotViewModel slotViewModel = this.LLJIJIL;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LL) != null && (value = mutableLiveData.getValue()) != null) {
            zLJFF = Intrinsics.LJFF(value.first, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        LJJIIZ("repin");
        AnonymousClass0956 anonymousClass0956 = this.LLLIIIIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AbstractC21198617xY<?> abstractC21198617xYLJJIJIIJI = LJJIJIIJI();
        if (abstractC21198617xYLJJIJIIJI.LL != null) {
            abstractC21198617xYLJJIJIIJI.LLILZ = true;
        }
        this.LLJI.LJIIIIZZ = "repin";
        if (C294670Bgn.LIZ()) {
            LJJJJLI(eCommerceMessage, jCurrentTimeMillis, false);
        } else {
            LJJJJLI(eCommerceMessage, jCurrentTimeMillis, zLJFF);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onCreate(Bundle bundle) {
        FragmentManager supportFragmentManager;
        ActivityStack.addAppBackGroundListener(this);
        this.LLJI.LIZ = new WeakReference<>(this);
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LLILZLL);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            supportFragmentManager.LJZL(this.LLLFF, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:204:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:473:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r15) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC21194217wq.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.17wy] */
    public AbstractC21194217wq(Context context, boolean z) {
        super(z);
        this.LLILZLL = context;
        this.LLIZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 447));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 445));
        this.LLJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 446));
        this.LLJI = new C21194817ww();
        this.LLJILJILJ = new C1743900vTw();
        this.LLJJIII = Boolean.FALSE;
        this.LLJJIJI = new HashMap();
        this.LLJJJJ = new HashMap();
        this.LLJLLIL = new HashMap();
        this.LLJLLL = new C1519570pe7();
        this.LLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 444));
        this.LLLF = new BPEAHandler(new C21523419Lc(this, 0));
        this.LLLFF = new AbstractC813200VvC() { // from class: X.17wy
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // X.AbstractC813200VvC
            public final void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
                super.onFragmentPaused(fragmentManager, fragment);
                String tag = fragment.getTag();
                if (tag == null) {
                    return;
                }
                switch (tag.hashCode()) {
                    case 69820330:
                        if (!tag.equals("INPUT")) {
                            return;
                        }
                        break;
                    case 171425331:
                        if (!tag.equals("pdp_fragment")) {
                            return;
                        }
                        break;
                    case 298291402:
                        if (!tag.equals("BulletPopUp")) {
                            return;
                        }
                        break;
                    case 911085005:
                        if (!tag.equals("live_profile_detail_dialog")) {
                            return;
                        }
                        break;
                    default:
                        return;
                }
                C21194817ww c21194817ww = this.LL.LLJI;
                if (!c21194817ww.LIZLLL || !c21194817ww.LIZJ || !c21194817ww.LJ) {
                    return;
                }
                c21194817ww.LJ = false;
                c21194817ww.LIZIZ();
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // X.AbstractC813200VvC
            public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
                super.onFragmentResumed(fragmentManager, fragment);
                String tag = fragment.getTag();
                if (tag == null) {
                    return;
                }
                switch (tag.hashCode()) {
                    case 69820330:
                        if (!tag.equals("INPUT")) {
                            return;
                        }
                        break;
                    case 171425331:
                        if (!tag.equals("pdp_fragment")) {
                            return;
                        }
                        C21194817ww c21194817ww = this.LL.LLJI;
                        c21194817ww.LJIIIIZZ = "next";
                        if (!c21194817ww.LIZLLL || !c21194817ww.LIZJ || c21194817ww.LJ) {
                            return;
                        }
                        c21194817ww.LJ = true;
                        c21194817ww.LIZ();
                        return;
                    case 298291402:
                        if (!tag.equals("BulletPopUp")) {
                            return;
                        }
                        break;
                    case 911085005:
                        if (!tag.equals("live_profile_detail_dialog")) {
                            return;
                        }
                        break;
                    default:
                        return;
                }
                C21194817ww c21194817ww2 = this.LL.LLJI;
                c21194817ww2.LJIIIIZZ = "other";
                if (!c21194817ww2.LIZLLL || !c21194817ww2.LIZJ || c21194817ww2.LJ) {
                    return;
                }
                c21194817ww2.LJ = true;
                c21194817ww2.LIZ();
            }
        };
        this.LLLFFI = "";
        C054G c054gLIZ = C2296808zG.LIZ(C2126308Ur.LJFF);
        this.LLLFZ = c054gLIZ;
        this.LLLIILIL = -1L;
        this.LLLIL = new C598800NeA(c054gLIZ);
        this.LLLILZ = new C21179117uP(c054gLIZ);
        this.LLLL = new AObserverS234S0100000_32(this, 29);
        this.LLLLII = new C21182617uy(this);
    }

    public static boolean LJJI(int i, String str) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return true;
                    }
                    return C212343187x.LIZJ(str, true);
                }
                return C212343187x.LIZLLL(str, true);
            }
            return C212343187x.LIZIZ(str, true);
        }
        return C212343187x.LIZ(str, true);
    }

    public static final void LJJJJJL(JSONObject jSONObject, Integer num) throws JSONException {
        IEventCenter iEventCenter = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
        JSONObject jSONObject2 = new JSONObject();
        if (num != null) {
            jSONObject2.put("action_type", num.intValue());
        }
        jSONObject2.put("data", jSONObject);
        iEventCenter.LIZ("ec_audience_message_event", C786410Ut5.J3(jSONObject2));
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03ce  */
    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    /* JADX INFO: renamed from: LJJJJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LLIZ(com.bytedance.android.live.slot.IFrameSlot.SlotViewModel r106, X.InterfaceC21213717zz r107) {
        /*
            Method dump skipped, instruction units count: 1373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC21194217wq.LLIZ(com.bytedance.android.live.slot.IFrameSlot$SlotViewModel, X.17zz):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJL(long r65, X.InterfaceC1364105Vn<? super kotlin.Unit> r67) {
        /*
            Method dump skipped, instruction units count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC21194217wq.LJJJJL(long, X.05Vn):java.lang.Object");
    }

    public final void LJJJJLL(Long l, boolean z) {
        String idStr;
        int i;
        Map<String, Object> mapLJ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.LLJL;
        long j2 = jCurrentTimeMillis - j;
        long j3 = this.LLJLIL;
        long j4 = j3 - j;
        long j5 = this.LLJLILLLLZIIL;
        long j6 = j5 - j3;
        long j7 = this.LLJLL - j5;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - this.LLJLL;
        Room room = this.LLJILLL;
        if (room != null) {
            idStr = room.getIdStr();
        } else {
            idStr = null;
        }
        String str = this.LLJJJIL;
        String strLJJIJIL = LJJIJIL();
        String str2 = this.LLJJIJIL;
        Map<String, String> map = this.LLJJJJ;
        Integer num = this.LLLILZLLLI;
        try {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("room_id", idStr);
            jSONObject.put("user_action_type", str);
            jSONObject.put("total_duration", j2);
            jSONObject.put("before_enter_room_interface_duration", j4);
            jSONObject.put("enter_room_interface_duration", j6);
            jSONObject.put("live_process_data_duration", j7);
            jSONObject.put("ec_process_data_duration", jCurrentTimeMillis2);
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_prefetch", i);
            jSONObject.put("live_role", strLJJIJIL);
            jSONObject.put("enter_from_merge", str2);
            if (map != null) {
                for (Map.Entry entry : ((HashMap) map).entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
            jSONObject.put("card_type", num);
            jSONObject.put("product_id", l);
            jSONObject.put("code_region", EnumC21186317vZ.GLOBAL.getValue());
            IECommerceRegionService iECommerceRegionService = (IECommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IECommerceRegionService.class, false, false, false, 14, null);
            if (iECommerceRegionService != null && (mapLJ = iECommerceRegionService.LJ(Boolean.TRUE)) != null) {
                for (Map.Entry<String, Object> entry2 : mapLJ.entrySet()) {
                    jSONObject.put(entry2.getKey(), entry2.getValue());
                }
            }
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_tiktokec_live_pop_product_show", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJJJLZIJ(EnumC21193117wf enumC21193117wf, String str) {
        String string;
        String string2;
        boolean zIsFromMessage;
        try {
            PopupCardVO popupCardVO = LJJIJIIJI().LL;
            String strLJJIJIL = LJJIJIL();
            Room room = this.LLJILLL;
            Integer numValueOf = null;
            if (room != null) {
                string = Long.valueOf(room.getId()).toString();
            } else {
                string = null;
            }
            if (popupCardVO == null) {
                string2 = null;
            } else {
                string2 = Long.valueOf(popupCardVO.productId).toString();
            }
            boolean z = this.LLJJI;
            boolean z2 = this.LLLIIII;
            boolean z3 = this.LLLI;
            if (popupCardVO != null) {
                zIsFromMessage = popupCardVO.isFromMessage();
            } else {
                zIsFromMessage = false;
            }
            if (popupCardVO != null) {
                numValueOf = Integer.valueOf(popupCardVO.cardType);
            }
            C21192717wb.LIZ(enumC21193117wf, strLJJIJIL, string, string2, z, z2, z3, zIsFromMessage, numValueOf, null, null, str, 1536);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.InterfaceC1740480vOQ
    public final void mG(View view, LifecycleOwner lifecycleOwner) {
        C1756050vnX.LIZ(this, view, lifecycleOwner);
    }

    @Override // X.InterfaceC1164530gPT
    public void onEvent(String str, String str2) {
        if (Intrinsics.LJFF(str, "ec_page_quit")) {
            LJJJLIIL(0L, "pdp_exit", false);
        }
    }

    private final void LJJJJJ(String str, String str2, Map map) {
        String str3;
        Object obj = map.get(str2);
        if ((obj instanceof String) && (str3 = (String) obj) != null) {
            this.LLJILJILJ.LJIIIIZZ(str, str3, true);
            C1766860w4y.LIZ.getClass();
            C1766860w4y.LJIILL(null, str2, str3, true);
        }
    }

    public final void LJJJJLI(ECommerceMessage eCommerceMessage, long j, boolean z) {
        if (!this.LLJJI) {
            this.LLLILZJ = new Pair<>(eCommerceMessage, Long.valueOf(j));
        } else {
            this.LLLILZJ = null;
            this.LLJLLL.LIZIZ(ViewModelKt.getViewModelScope(this.LL), eCommerceMessage, new C503801xk(z, eCommerceMessage, j, this));
        }
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [T, com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO] */
    public final void LJJJLIIL(long j, String str, boolean z) {
        String idStr;
        if (this.LLLIILIL > 0 && LJJJ() && LJJIJIIJI().LL != null) {
            C598800NeA c598800NeA = this.LLLIL;
            AbstractC21198617xY<?> abstractC21198617xYLJJIJIIJI = LJJIJIIJI();
            Room room = this.LLJILLL;
            if (room == null || (idStr = room.getIdStr()) == null) {
                idStr = "";
            }
            String str2 = this.LLLFFI;
            int iLJJIJL = LJJIJL(false);
            long j2 = this.LLLIILIL;
            boolean z2 = this.LLLII;
            c598800NeA.getClass();
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startRefresh delay = ");
            sbLIZ.append(j);
            sbLIZ.append(", interval = ");
            sbLIZ.append(j2);
            sbLIZ.append(", force = ");
            sbLIZ.append(z);
            sbLIZ.append(", trigger = ");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LJ(strLIZIZ);
            if (!EcomRefreshPincardSettings.LIZIZ()) {
                C2341109Fh.LJII("min and max is wrong");
                return;
            }
            if (C292450BdD.LIZ() && (Intrinsics.LJFF(str, "become_visible") || Intrinsics.LJFF(str, "pdp_exit") || Intrinsics.LJFF(str, "timer"))) {
                C2341109Fh.LJII("new refresh enable");
                return;
            }
            C259800zU c259800zU = new C259800zU();
            ?? r12 = abstractC21198617xYLJJIJIIJI.LL;
            c259800zU.element = r12;
            if (r12 == 0) {
                return;
            }
            long j3 = c598800NeA.LIZJ;
            if (j3 <= 0) {
                j3 = r12.createTime;
            }
            c598800NeA.LIZJ = j3;
            if (!z && SystemClock.elapsedRealtime() - c598800NeA.LIZJ < EcomRefreshPincardSettings.LIZ().min) {
                C2341109Fh.LJII("interval is so short");
                return;
            }
            c598800NeA.LIZLLL = true;
            AnonymousClass0956 anonymousClass0956 = c598800NeA.LIZIZ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            c598800NeA.LIZIZ = C23250099c.LIZLLL(c598800NeA.LIZ, null, null, new C21193817wm(j, str, c598800NeA, j2, abstractC21198617xYLJJIJIIJI, z2, idStr, c259800zU, str2, iLJJIJL, null), 3);
        }
    }

    public static void LJJL(AbstractC21194217wq abstractC21194217wq, boolean z, ECommerceMessage eCommerceMessage, boolean z2, Integer num, int i) {
        PopProduct popProduct;
        boolean z3 = z2;
        ECommerceMessage eCommerceMessage2 = eCommerceMessage;
        String string = null;
        if ((i & 2) != 0) {
            eCommerceMessage2 = null;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        abstractC21194217wq.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (C0C01.LIZ() && eCommerceMessage2 != null && (popProduct = eCommerceMessage2.popProduct) != null) {
            string = Long.valueOf(popProduct.productId).toString();
        }
        if (abstractC21194217wq.LJJIL()) {
            try {
                if (!C0C64.LJIILLIIL().LJIIIZ(31744, "affiliate_pin_card", true, true)) {
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        abstractC21194217wq.LJJIJIIJIL(string, jCurrentTimeMillis, z, eCommerceMessage2, z3, num, false);
    }

    public final void LJJIJIIJIL(final String str, final long j, final boolean z, final ECommerceMessage eCommerceMessage, final boolean z2, final Integer num, final boolean z3) {
        Long lValueOf;
        final DispersionInfo dispersionInfoLIZIZ;
        Long lValueOf2 = null;
        if (LJJIL()) {
            dispersionInfoLIZIZ = null;
        } else {
            Room room = this.LLJILLL;
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            } else {
                lValueOf = null;
            }
            dispersionInfoLIZIZ = C598410NdX.LIZIZ(1, String.valueOf(lValueOf));
        }
        Room room2 = this.LLJILLL;
        if (room2 != null) {
            lValueOf2 = Long.valueOf(room2.getId());
        }
        C598360NdS.LJFF(String.valueOf(lValueOf2), 1, false, dispersionInfoLIZIZ, new AwS9S1310000_32(this, num, str, z2, eCommerceMessage, 0), new InterfaceC594300NSq<BaseResponse<PopProductResp>>() { // from class: X.17uR
            @Override // X.InterfaceC594300NSq
            public final void onFailure(C0X9S<BaseResponse<PopProductResp>> c0x9s, Throwable th) {
                String string;
                boolean z4;
                String str2;
                String string2;
                long jCurrentTimeMillis = System.currentTimeMillis() - j;
                String strLJJIJ = AbstractC21194217wq.LJJIJ();
                Room room3 = this.LL.LLJILLL;
                if (room3 != null) {
                    string = Long.valueOf(room3.getId()).toString();
                } else {
                    string = null;
                }
                String message = th.getMessage();
                if (eCommerceMessage != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                String strLJJIJIL = this.LL.LJJIJIL();
                if (eCommerceMessage != null) {
                    str2 = "message_request";
                } else {
                    str2 = "other";
                }
                C21198417xW.LIZLLL(strLJJIJ, string, false, jCurrentTimeMillis, -7, message, z4, strLJJIJIL, false, false, str2, z2, this.LL.LLJJJJ, num);
                Room room4 = this.LL.LLJILLL;
                if (room4 != null) {
                    string2 = Long.valueOf(room4.getId()).toString();
                } else {
                    string2 = null;
                }
                C21197617xO.LIZJ(string2, th.getMessage(), false, false);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:110:0x0228  */
            /* JADX WARN: Type inference failed for: r0v33 */
            /* JADX WARN: Type inference failed for: r0v34 */
            /* JADX WARN: Type inference failed for: r0v35, types: [X.099V, kotlin.coroutines.CoroutineContext] */
            /* JADX WARN: Type inference failed for: r0v36 */
            /* JADX WARN: Type inference failed for: r0v41 */
            /* JADX WARN: Type inference failed for: r0v42 */
            /* JADX WARN: Type inference failed for: r0v43 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v6 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r13v0 */
            /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r13v8 */
            /* JADX WARN: Type inference failed for: r21v0, types: [java.lang.Integer] */
            /* JADX WARN: Type inference failed for: r35v0, types: [X.05Vn] */
            /* JADX WARN: Type inference failed for: r5v15 */
            /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v55 */
            /* JADX WARN: Type inference failed for: r6v1 */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r6v7 */
            /* JADX WARN: Type inference failed for: r8v1 */
            /* JADX WARN: Type inference failed for: r8v11 */
            /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.String] */
            @Override // X.InterfaceC594300NSq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onResponse(X.C0X9S<com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse<com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp>> r37, X.C0X52<com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse<com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp>> r38) {
                /*
                    Method dump skipped, instruction units count: 555
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C21179317uR.onResponse(X.0X9S, X.0X52):void");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v2, types: [com.bytedance.android.livesdk.model.message.ext.PromotionView, com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack, com.ss.android.ugc.aweme.ecommercebase.model.EnhancedBrandLogo, com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo, com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AddToCartButton, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ComponentData, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.DepositPrice, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleDTO, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveBagBuyButton, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveDaInfo, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PDPAccessControl, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PinCardBuyButton, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.SellingView, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ThirdLineTopBrand, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.TopBrand, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.UserRightView, java.lang.Boolean, java.lang.Integer, java.lang.Long, java.lang.String, java.util.List, java.util.Map] */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r33v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.String] */
    public final void LJJJJI(PopProductResp popProductResp, String str, boolean z, boolean z2, ECommerceMessage eCommerceMessage, boolean z3, boolean z4) {
        String string;
        boolean z5;
        ?? r25;
        boolean z6;
        Room room;
        String idStr;
        String string2;
        String string3;
        boolean z7;
        String str2 = null;
        if (C21194717wv.LJ(popProductResp) != null) {
            long j = popProductResp.popCardId;
            if (j > 0) {
                this.LLLIZZ = j;
            }
            String strLJII = C21194717wv.LJII(popProductResp);
            String strLJI = C21194717wv.LJI(popProductResp);
            Room room2 = this.LLJILLL;
            if (room2 != null) {
                string2 = Long.valueOf(room2.getId()).toString();
            } else {
                string2 = null;
            }
            C21198417xW.LJII(strLJII, strLJI, string2, LJJIJ(), CardStruct.IStatusCode.DEFAULT, LJJIJIL(), ActivityStack.isAppBackGround(), this.LLJJI, this.LLLI, this.LLLII);
            EnumC21193117wf enumC21193117wf = EnumC21193117wf.SHOULD_SHOW;
            String strLJJIJIL = LJJIJIL();
            Room room3 = this.LLJILLL;
            if (room3 != null) {
                string3 = Long.valueOf(room3.getId()).toString();
            } else {
                string3 = null;
            }
            String strLJI2 = C21194717wv.LJI(popProductResp);
            boolean z8 = this.LLJJI;
            boolean z9 = this.LLLIIII;
            boolean z10 = this.LLLI;
            if (eCommerceMessage != null) {
                z7 = true;
            } else {
                z7 = false;
            }
            str2 = null;
            C21192717wb.LIZ(enumC21193117wf, strLJJIJIL, string3, strLJI2, z8, z9, z10, z7, Integer.valueOf(popProductResp.cardType), null, null, null, 3584);
        }
        EnumC21193117wf enumC21193117wf2 = EnumC21193117wf.ON_SLOT_CREATED_FROM_RESPONSE;
        String strLJJIJIL2 = LJJIJIL();
        Room room4 = this.LLJILLL;
        if (room4 != null) {
            string = Long.valueOf(room4.getId()).toString();
        } else {
            string = str2;
        }
        String strLJI3 = C21194717wv.LJI(popProductResp);
        boolean z11 = this.LLJJI;
        boolean z12 = this.LLLIIII;
        boolean z13 = this.LLLI;
        if (eCommerceMessage != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        ?? r18 = str2;
        C21192717wb.LIZ(enumC21193117wf2, strLJJIJIL2, string, strLJI3, z11, z12, z13, z5, Integer.valueOf(popProductResp.cardType), popProductResp.needRetry, Boolean.valueOf(z4), r18, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
        if (C21194717wv.LJ(popProductResp) != null) {
            Product product = popProductResp.product;
            if (product == null) {
                product = new Product("", "", r18, r18, "", "", 0, r18, 0, "", "", "", 0, "", "", r18, r18, r18, r18, r18, r18, r18, r18, r18, r18, r18, r18, r18, r18, 0, r18, r18, r18, r18, r18, r18, r18, r18, r18, r18, r18, r18, r18, r18, r18, r18, 0, r18, r18, r18, r18, r18, r18, r18);
            }
            C182S c182s = PopupCardVO.Companion;
            long j2 = popProductResp.LIZ;
            long j3 = popProductResp.serverTime;
            FlashSaleAtmosphereInfo flashSaleAtmosphereInfo = popProductResp.flashSaleAtmosphereInfo;
            FlashSaleControl flashSaleControl = popProductResp.flashSaleControl;
            ProductPreheatAtmosphereInfo productPreheatAtmosphereInfo = popProductResp.preheatAtmosphereInfo;
            int i = popProductResp.bagIndex;
            PromotionStyleConfig promotionStyleConfig = popProductResp.promotionStyleConfig;
            Boolean bool = popProductResp.assistantSwitch;
            int i2 = popProductResp.cardType;
            ShoppingBagList shoppingBagList = popProductResp.shoppingBagList;
            BuyButtonConfig buyButtonConfig = popProductResp.buyButtonConfig;
            if (buyButtonConfig != null) {
                r25 = buyButtonConfig.pinCardBuyButtonConfig;
            } else {
                r25 = r18;
            }
            PdpTopBubble pdpTopBubble = popProductResp.pdpTopBubble;
            NextActionInfo nextActionInfo = popProductResp.nextActionInfo;
            LiveVoucher liveVoucher = popProductResp.pinVoucher;
            AnchorPinCardConfig anchorPinCardConfig = popProductResp.anchorPinCardConfig;
            Boolean bool2 = popProductResp.needRetry;
            long j4 = popProductResp.LIZJ;
            JSONObject jSONObject = popProductResp.LJ;
            long j5 = popProductResp.popCardId;
            if (j5 <= 0) {
                j5 = this.LLLIZZ;
            }
            PopupCardVO popupCardVOLIZ = C182S.LIZ(c182s, product, j2, j3, flashSaleAtmosphereInfo, flashSaleControl, productPreheatAtmosphereInfo, i, promotionStyleConfig, bool, i2, shoppingBagList, r25, pdpTopBubble, nextActionInfo, liveVoucher, anchorPinCardConfig, bool2, Long.valueOf(j4), r18, popProductResp, jSONObject, r18, str, j5, popProductResp.bffData, popProductResp.lynxCardInfo, 26869760);
            if (eCommerceMessage != null) {
                popupCardVOLIZ.fromMessage(eCommerceMessage);
            }
            popupCardVOLIZ.setBagIndex(popProductResp.bagIndex);
            popupCardVOLIZ.setLiveBagAndPinCardType(popProductResp.liveBagAndPinCardType);
            List<AtmosphereTag> list = popProductResp.atmosphereTags;
            if (list != null) {
                for (AtmosphereTag atmosphereTag : list) {
                    if (atmosphereTag != null && ((room = this.LLJILLL) == null || (idStr = room.getIdStr()) == null || LJJI(atmosphereTag.tagType, idStr))) {
                        atmosphereTag.LJII = product.productId;
                        popupCardVOLIZ.atmosphereTags.add(atmosphereTag);
                    }
                }
            }
            C21194717wv.LJIIIZ(popProductResp, C21195917x7.LIZ(LJJIJIIJI().LLILLL));
            boolean zLJJJ = LJJJ();
            LJJIJIIJI().LJJIJL(popupCardVOLIZ, zLJJJ);
            if (z4 && zLJJJ) {
                EnumC21193117wf enumC21193117wf3 = EnumC21193117wf.REFRESH_FROM_THROTTING_RETRY;
                String strLJJIJIL3 = LJJIJIL();
                Room room5 = this.LLJILLL;
                ?? string4 = r18;
                if (room5 != null) {
                    string4 = Long.valueOf(room5.getId()).toString();
                }
                String strLJI4 = C21194717wv.LJI(popProductResp);
                boolean z14 = this.LLJJI;
                boolean z15 = this.LLLIIII;
                boolean z16 = this.LLLI;
                if (eCommerceMessage != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                C21192717wb.LIZ(enumC21193117wf3, strLJJIJIL3, string4, strLJI4, z14, z15, z16, z6, Integer.valueOf(popProductResp.cardType), null, null, null, 3584);
            }
            LJJIJLIJ().LJ(popProductResp, z, z2, z3);
            C21194817ww c21194817ww = this.LLJI;
            c21194817ww.LJI = true;
            c21194817ww.LJII = System.currentTimeMillis();
            c21194817ww.LJFF = false;
        }
    }
}
