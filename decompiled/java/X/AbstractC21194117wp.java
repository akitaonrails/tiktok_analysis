package X;

import Y.AObserverS234S0100000_32;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.model.message.AtmosphereTagInfo;
import com.bytedance.android.livesdk.model.message.DispersionInfo;
import com.bytedance.android.livesdk.model.message.ProductAtmosphereTag;
import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.android.livesdk.model.message.ext.PopProduct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionStyleConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.BuyButtonConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.BuyButtonProperty;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleControl;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.GetMoreActionResp;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LynxCardInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.NextActionInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PdpTopBubble;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PinCardConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopupCardBffData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ProductCardConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ShoppingBagList;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.settings.EcomRefreshPincardSettings;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.region.service.IECommerceRegionService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.17wp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21194117wp extends AbstractC21203317yJ implements InterfaceC1740480vOQ, C18ZN, InterfaceC1164530gPT {
    public final Context LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C21194917wx LLJI;
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
    public final BPEAHandler LLJZIJLIL;
    public final C21195117wz LLL;
    public String LLLF;
    public final C054G LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public AnonymousClass0956 LLLII;
    public AnonymousClass0956 LLLIIII;
    public AnonymousClass0956 LLLIIIIL;
    public long LLLIIIL;
    public final C598730Ne3 LLLIIL;
    public final C21180517ud LLLIILIL;
    public C443120HZe<? extends ECommerceMessage, Long, C1563990qnl> LLLIL;
    public final C01GW LLLILZ;
    public Integer LLLILZJ;
    public boolean LLLILZLLLI;
    public Boolean LLLIZZ;
    public final AObserverS234S0100000_32 LLLJ;
    public final C21182517ux LLLJIL;

    @Override // X.InterfaceC1124060fMC
    public final String LIZ() {
        return "ec_shop";
    }

    public abstract void LJJIFFI();

    public abstract boolean LJJII(int i);

    public abstract AbstractC21198517xX<?> LJJIJIIJI();

    public abstract AbstractC21196817xG LJJIJL();

    public abstract boolean LJJIJLIJ();

    public abstract boolean LJJJI();

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final boolean LLIZLLLIL() {
        return true;
    }

    @Override // X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
    }

    @Override // X.InterfaceC1748820vbs
    public final String getPageName() {
        return "pop_card";
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onPause() {
        this.LLJJI = false;
        this.LLJILJILJ.LJIIJ("is_page_visible", false);
        C598730Ne3 c598730Ne3 = this.LLLIIL;
        c598730Ne3.getClass();
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("stop refresh");
        c598730Ne3.LIZLLL = false;
    }

    @Override // X.InterfaceC1748820vbs
    public final void sh() {
    }

    public final void LJJIII() {
        AnonymousClass0956 anonymousClass0956 = this.LLLII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AbstractC21198517xX<?> abstractC21198517xXLJJIJIIJI = LJJIJIIJI();
        if (abstractC21198517xXLJJIJIIJI.LL != null) {
            abstractC21198517xXLJJIJIIJI.LLILZ = true;
        }
        AbstractC21196817xG abstractC21196817xGLJJIJL = LJJIJL();
        Room room = this.LLJILLL;
        abstractC21196817xGLJJIJL.LJIIJJI(room != null ? Long.valueOf(room.getId()).toString() : null, null);
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

    public final boolean LJJIZ() {
        IFrameSlot.SlotViewModel slotViewModel;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        InterfaceC21180717uf interfaceC21180717uf = this.LLILZ;
        return ((interfaceC21180717uf != null && !interfaceC21180717uf.LJIILL(this)) || (slotViewModel = this.LLJIJIL) == null || (mutableLiveData = slotViewModel.LL) == null || (value = mutableLiveData.getValue()) == null || !Intrinsics.LJFF(value.first, Boolean.TRUE)) ? false : true;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final List<Integer> getMessageType() {
        C21182717uz.LIZ.getClass();
        return C1697810uHb.LJIILJJIL(10000, 100005, Integer.valueOf(C001A.OEC_LIVE_SMART_PIN_MESSAGE.getIntType()), Integer.valueOf(C001A.OEC_LIVE_CREATOR_MESSAGE.getIntType()));
    }

    @Override // X.C18ZN
    public final void onAppBackground() {
        IFrameSlot.SlotViewModel slotViewModel;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        InterfaceC21180717uf interfaceC21180717uf = this.LLILZ;
        if ((interfaceC21180717uf != null && !interfaceC21180717uf.LJIILL(this)) || (slotViewModel = this.LLJIJIL) == null || (mutableLiveData = slotViewModel.LL) == null || (value = mutableLiveData.getValue()) == null || !Intrinsics.LJFF(value.first, Boolean.TRUE)) {
            return;
        }
        C21194917wx c21194917wx = this.LLJI;
        c21194917wx.LJIIIIZZ = "close";
        if (!c21194917wx.LJ && c21194917wx.LIZJ && c21194917wx.LIZLLL) {
            c21194917wx.LIZLLL = false;
            c21194917wx.LIZ();
        }
    }

    @Override // X.C18ZN
    public final void onAppForeground() {
        IFrameSlot.SlotViewModel slotViewModel;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        InterfaceC21180717uf interfaceC21180717uf = this.LLILZ;
        if ((interfaceC21180717uf != null && !interfaceC21180717uf.LJIILL(this)) || (slotViewModel = this.LLJIJIL) == null || (mutableLiveData = slotViewModel.LL) == null || (value = mutableLiveData.getValue()) == null || !Intrinsics.LJFF(value.first, Boolean.TRUE)) {
            return;
        }
        C21194917wx c21194917wx = this.LLJI;
        if (c21194917wx.LJ || !c21194917wx.LIZJ || c21194917wx.LIZLLL) {
            return;
        }
        c21194917wx.LIZLLL = true;
        c21194917wx.LIZIZ();
    }

    @Override // X.AbstractC21203317yJ, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public void onDestroy() {
        MutableLiveData<Boolean> mutableLiveData;
        InterfaceC21180717uf interfaceC21180717uf;
        IFrameSlot.SlotViewModel slotViewModel;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData2;
        Pair<Boolean, String> value;
        this.LLLIIIL = -1L;
        C598730Ne3 c598730Ne3 = this.LLLIIL;
        c598730Ne3.LJ = null;
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("destroy");
        AnonymousClass0956 anonymousClass0956 = c598730Ne3.LIZIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        c598730Ne3.LIZIZ = null;
        c598730Ne3.LIZLLL = true;
        c598730Ne3.LIZJ = 0L;
        if (!this.LLJJ && (((interfaceC21180717uf = this.LLILZ) == null || interfaceC21180717uf.LJIILL(this)) && (slotViewModel = this.LLJIJIL) != null && (mutableLiveData2 = slotViewModel.LL) != null && (value = mutableLiveData2.getValue()) != null && Intrinsics.LJFF(value.first, Boolean.TRUE) && (LJJIJIIJI().LLILZIL == 0 || ((LJJIJIIJI().LLILZIL instanceof AbstractC21202917yF) && !((AbstractC21202917yF) LJJIJIIJI().LLILZIL).LL)))) {
            UsPopupCardVO usPopupCardVO = LJJIJIIJI().LL;
            String strValueOf = String.valueOf(usPopupCardVO != null ? Long.valueOf(usPopupCardVO.productId) : null);
            Room room = this.LLJILLL;
            C21198317xV.LJI(this.LLLFFI, strValueOf, room != null ? Long.valueOf(room.getId()).toString() : null, LJJIJ(), "destroy", LJJIJIIJIL(), this.LLLFZ, this.LLJJI);
        }
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_page_quit", this);
        IFrameSlot.SlotViewModel slotViewModel2 = this.LLJIJIL;
        if (slotViewModel2 != null && (mutableLiveData = slotViewModel2.LLILZIL) != null) {
            mutableLiveData.removeObserver(this.LLLJ);
        }
        this.LLJJ = true;
        C2296808zG.LIZJ(this.LLLFF, null);
        this.LLILZ = null;
        C21208117z5 c21208117z5 = C21208117z5.LIZ;
        Room room2 = this.LLJILLL;
        String string = room2 != null ? Long.valueOf(room2.getId()).toString() : null;
        c21208117z5.getClass();
        C21208117z5.LIZJ(string);
        this.LLJZIJLIL.removeCallbacksAndMessages(null);
        LJJIJIIJI().LJIJJLI("other");
        LJJIJL().LIZLLL();
        LJJIJIIJI().getClass();
        ActivityStack.removeAppBackGroundListener(this);
        this.LLJI.LIZ = null;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LLILZLL);
        if (c19egLIZIZ != null) {
            c19egLIZIZ.getSupportFragmentManager().LLIILZL(this.LLL);
        }
        EventBus.LIZLLL().LJIJJLI(C591940NJo.class);
        this.LLJLLL.LIZJ();
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onResume() {
        IFrameSlot.SlotViewModel slotViewModel;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        this.LLLIIL.LJFF();
        LJJL(0L, "become_visible", false);
        this.LLJJI = true;
        this.LLJILJILJ.LJIIJ("is_page_visible", true);
        InterfaceC21180717uf interfaceC21180717uf = this.LLILZ;
        if ((interfaceC21180717uf == null || interfaceC21180717uf.LJIILL(this)) && (slotViewModel = this.LLJIJIL) != null && (mutableLiveData = slotViewModel.LL) != null && (value = mutableLiveData.getValue()) != null && Intrinsics.LJFF(value.first, Boolean.TRUE) && (LJJIJIIJI().LLILZIL == 0 || ((LJJIJIIJI().LLILZIL instanceof AbstractC21202917yF) && !((AbstractC21202917yF) LJJIJIIJI().LLILZIL).LL))) {
            UsPopupCardVO usPopupCardVO = LJJIJIIJI().LL;
            String strValueOf = String.valueOf(usPopupCardVO != null ? Long.valueOf(usPopupCardVO.productId) : null);
            Room room = this.LLJILLL;
            String string = room != null ? Long.valueOf(room.getId()).toString() : null;
            String strLJJIJ = LJJIJ();
            boolean z = this.LLLFFI;
            boolean z2 = this.LLLFZ;
            String strLJJIJIIJIL = LJJIJIIJIL();
            try {
                C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("product_id", strValueOf);
                jSONObject.put("room_id", string);
                jSONObject.put("author_id", strLJJIJ);
                jSONObject.put("has_ec_perm", z ? 1 : 0);
                jSONObject.put("is_anchor", z2 ? 1 : 0);
                jSONObject.put("live_role", strLJJIJIIJIL);
                c1507790pL7.getClass();
                C1507790pL7.LIZLLL("rd_tiktokec_live_pop_product_resume", jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C443120HZe<? extends ECommerceMessage, Long, C1563990qnl> c443120HZe = this.LLLIL;
        if (c443120HZe != null) {
            LJJJJLL(c443120HZe.getFirst(), c443120HZe.getSecond().longValue(), c443120HZe.getThird(), false);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onStart() {
        IFrameSlot.SlotViewModel slotViewModel;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        IFrameSlot.SlotViewModel slotViewModel2;
        LifecycleOwner lifecycleOwnerLJJJ;
        MutableLiveData<String> mutableLiveData2;
        InterfaceC21180717uf interfaceC21180717uf = this.LLILZ;
        if ((interfaceC21180717uf == null || interfaceC21180717uf.LJIILL(this)) && (slotViewModel = this.LLJIJIL) != null && (mutableLiveData = slotViewModel.LL) != null && (value = mutableLiveData.getValue()) != null && Intrinsics.LJFF(value.first, Boolean.TRUE)) {
            this.LLJILJILJ.LJII(System.currentTimeMillis(), "start_time");
            LJJIJIIJI().getClass();
            C21194917wx c21194917wx = this.LLJI;
            if (!c21194917wx.LJ && c21194917wx.LIZLLL && !c21194917wx.LIZJ) {
                c21194917wx.LIZJ = true;
                c21194917wx.LIZIZ();
            }
        }
        ViewModel viewModel = this.LL;
        if (!(viewModel instanceof IFrameSlot.SlotViewModel) || (slotViewModel2 = (IFrameSlot.SlotViewModel) viewModel) == null || (lifecycleOwnerLJJJ = LJJJ(this.LLILZLL)) == null) {
            return;
        }
        C319201Lq.LIZ.getClass();
        if (C319201Lq.LIZIZ == null) {
            WeakReference<Observer<String>> weakReference = new WeakReference<>(new C513601zK(lifecycleOwnerLJJJ, 56));
            C319201Lq.LIZIZ = weakReference;
            Observer<String> observer = weakReference.get();
            if (observer == null || (mutableLiveData2 = slotViewModel2.LLIZ) == null) {
                return;
            }
            mutableLiveData2.observe(lifecycleOwnerLJJJ, observer);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onStop() {
        IFrameSlot.SlotViewModel slotViewModel;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        IFrameSlot.SlotViewModel slotViewModel2;
        LifecycleOwner lifecycleOwnerLJJJ;
        InterfaceC21180717uf interfaceC21180717uf = this.LLILZ;
        if ((interfaceC21180717uf == null || interfaceC21180717uf.LJIILL(this)) && (slotViewModel = this.LLJIJIL) != null && (mutableLiveData = slotViewModel.LL) != null && (value = mutableLiveData.getValue()) != null && Intrinsics.LJFF(value.first, Boolean.TRUE)) {
            LJJJLZIJ("other");
            LJJIJIIJI().getClass();
            C21194917wx c21194917wx = this.LLJI;
            if (!c21194917wx.LJ && c21194917wx.LIZLLL && c21194917wx.LIZJ) {
                c21194917wx.LIZJ = false;
                c21194917wx.LIZ();
            }
        }
        ViewModel viewModel = this.LL;
        if (!(viewModel instanceof IFrameSlot.SlotViewModel) || (slotViewModel2 = (IFrameSlot.SlotViewModel) viewModel) == null || (lifecycleOwnerLJJJ = LJJJ(this.LLILZLL)) == null) {
            return;
        }
        C319201Lq.LIZ.getClass();
        MutableLiveData<String> mutableLiveData2 = slotViewModel2.LLIZ;
        if (mutableLiveData2 != null) {
            mutableLiveData2.removeObservers(lifecycleOwnerLJJJ);
        }
        C319201Lq.LIZIZ = null;
        C319201Lq.LIZJ = null;
    }

    public static final String LJJIJ() {
        String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
        return currentUserID == null ? "" : currentUserID;
    }

    public final String LJJIJIIJIL() {
        return (LJJIJLIJ() ? EnumC21196517xD.ROOM_OWNER : this.LLLFZ ? EnumC21196517xD.ANCHOR_AS_AUDIENCE : EnumC21196517xD.AUDIENCE).getRoleStr();
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

    public static final boolean LJJIL(Integer num) {
        if (num != null) {
            if (4 == num.intValue() || 5 == num.intValue()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static LifecycleOwner LJJJ(Context context) {
        if (!C290160BYw.LIZ() && !C07MW.LIZ()) {
            return C1388190mED.LIZIZ(context);
        }
        AbstractC1387200mCc abstractC1387200mCcLIZJ = C520150Kab.LIZJ(context);
        if (abstractC1387200mCcLIZJ != null) {
            return abstractC1387200mCcLIZJ.LJFF();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x02c0 A[Catch: s -> 0x02d7, TryCatch #0 {s -> 0x02d7, blocks: (B:130:0x029c, B:132:0x02c9, B:135:0x02d2, B:131:0x02c0), top: B:257:0x0295 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    @Override // X.AbstractC21203317yJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean LJJ(java.util.Map<java.lang.String, java.lang.Object> r27) {
        /*
            Method dump skipped, instruction units count: 1251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC21194117wp.LJJ(java.util.Map):boolean");
    }

    public final void LJJIIJ(boolean z) {
        Long lValueOf;
        Long lValueOf2;
        C1563990qnl c1563990qnl = null;
        if (!this.LLLFFI) {
            Room room = this.LLJILLL;
            if (room != null) {
                lValueOf2 = Long.valueOf(room.getId());
            } else {
                lValueOf2 = null;
            }
            C21197617xO.LIZIZ(String.valueOf(lValueOf2), LJJIJIIJIL(), "no_ec_perm", z);
            EnumC21192517wZ enumC21192517wZ = EnumC21192517wZ.CHAIN_FAILED;
            OecInitData oecInitDataLIZ = C1733990vDx.LIZ(this.LLJILLL);
            if (oecInitDataLIZ != null) {
                c1563990qnl = oecInitDataLIZ.LIZIZ;
            }
            C21192417wY.LIZIZ(enumC21192517wZ, c1563990qnl, C2097908Jt.LIZJ(new kotlin.Pair("reason", "no_ec_perm")));
            return;
        }
        if (LJJIJLIJ() || C21197617xO.LIZ != 0) {
            return;
        }
        Room room2 = this.LLJILLL;
        if (room2 != null) {
            lValueOf = Long.valueOf(room2.getId());
        } else {
            lValueOf = null;
        }
        C21197617xO.LIZIZ(String.valueOf(lValueOf), LJJIJIIJIL(), "no_product", z);
        EnumC21192517wZ enumC21192517wZ2 = EnumC21192517wZ.CHAIN_FAILED;
        OecInitData oecInitDataLIZ2 = C1733990vDx.LIZ(this.LLJILLL);
        if (oecInitDataLIZ2 != null) {
            c1563990qnl = oecInitDataLIZ2.LIZIZ;
        }
        C21192417wY.LIZIZ(enumC21192517wZ2, c1563990qnl, C2097908Jt.LIZJ(new kotlin.Pair("reason", "no_product")));
    }

    public final void LJJIIJZLJL(AtmosphereTagInfo atmosphereTagInfo) {
        AtmosphereTag atmosphereTag;
        UsPopupCardVO usPopupCardVO;
        List<AtmosphereTag> list;
        List<AtmosphereTag> list2;
        List<AtmosphereTag> list3;
        String str;
        long j;
        Long lValueOf;
        int i;
        int i2;
        Long lValueOf2;
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo;
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo2;
        Long lValueOf3;
        String str2;
        List<ProductAtmosphereTag> list4 = atmosphereTagInfo.atmosphereTags;
        ArrayList arrayList = new ArrayList();
        Iterator<ProductAtmosphereTag> it2 = list4.iterator();
        while (true) {
            Long lValueOf4 = null;
            if (!it2.hasNext()) {
                break;
            }
            ProductAtmosphereTag next = it2.next();
            ProductAtmosphereTag productAtmosphereTag = next;
            if (productAtmosphereTag != null && (str2 = productAtmosphereTag.productId) != null) {
                lValueOf3 = Long.valueOf(CastLongProtector.parseLong(str2));
            } else {
                lValueOf3 = null;
            }
            UsPopupCardVO usPopupCardVO2 = LJJIJIIJI().LL;
            if (usPopupCardVO2 != null) {
                lValueOf4 = Long.valueOf(usPopupCardVO2.productId);
            }
            if (Intrinsics.LJFF(lValueOf3, lValueOf4)) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            atmosphereTag = new AtmosphereTag();
            atmosphereTag.tagType = atmosphereTagInfo.tagType;
            ProductAtmosphereTag productAtmosphereTag2 = (ProductAtmosphereTag) C13LP.LJJJLZIJ(0, arrayList);
            if (productAtmosphereTag2 == null || (str = productAtmosphereTag2.tagDesc) == null) {
                str = "";
            }
            atmosphereTag.LJ(str);
            ProductAtmosphereTag productAtmosphereTag3 = (ProductAtmosphereTag) C13LP.LJJJLZIJ(0, arrayList);
            long j2 = 0;
            if (productAtmosphereTag3 != null) {
                j = productAtmosphereTag3.count;
            } else {
                j = 0;
            }
            atmosphereTag.count = j;
            UsPopupCardVO usPopupCardVO3 = LJJIJIIJI().LL;
            if (usPopupCardVO3 != null) {
                lValueOf = Long.valueOf(usPopupCardVO3.productId);
            } else {
                lValueOf = null;
            }
            atmosphereTag.LJII = String.valueOf(lValueOf);
            UsPopupCardVO usPopupCardVO4 = LJJIJIIJI().LL;
            if (usPopupCardVO4 != null) {
                j2 = usPopupCardVO4.showAtmosphereBeginMilliSecond;
            }
            atmosphereTag.LIZIZ = j2;
            UsPopupCardVO usPopupCardVO5 = LJJIJIIJI().LL;
            if (usPopupCardVO5 != null) {
                i = usPopupCardVO5.weakenLiveFlashSaleAtmosphere;
            } else {
                i = 0;
            }
            atmosphereTag.LJI = i;
            UsPopupCardVO usPopupCardVO6 = LJJIJIIJI().LL;
            if (usPopupCardVO6 != null && (flashSaleAtmosphereInfo2 = usPopupCardVO6.flashSaleAtmosphereInfo) != null) {
                i2 = flashSaleAtmosphereInfo2.creatorLimitType;
            } else {
                i2 = 0;
            }
            atmosphereTag.LIZJ = i2;
            UsPopupCardVO usPopupCardVO7 = LJJIJIIJI().LL;
            if (usPopupCardVO7 != null && (flashSaleAtmosphereInfo = usPopupCardVO7.flashSaleAtmosphereInfo) != null) {
                lValueOf2 = Long.valueOf(flashSaleAtmosphereInfo.activityId);
            } else {
                lValueOf2 = null;
            }
            atmosphereTag.LJFF = lValueOf2;
        } else {
            atmosphereTag = null;
        }
        int i3 = atmosphereTagInfo.tagType;
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            return;
        }
        UsPopupCardVO usPopupCardVO8 = LJJIJIIJI().LL;
        if (usPopupCardVO8 != null && (list2 = usPopupCardVO8.atmosphereTags) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (AtmosphereTag atmosphereTag2 : list2) {
                if (atmosphereTag2.tagType == i3) {
                    arrayList2.add(atmosphereTag2);
                }
            }
            for (Object obj : arrayList2) {
                UsPopupCardVO usPopupCardVO9 = LJJIJIIJI().LL;
                if (usPopupCardVO9 != null && (list3 = usPopupCardVO9.atmosphereTags) != null) {
                    list3.remove(obj);
                }
            }
        }
        if (atmosphereTag != null && (usPopupCardVO = LJJIJIIJI().LL) != null && (list = usPopupCardVO.atmosphereTags) != null) {
            list.add(atmosphereTag);
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LJFF), null, null, new C21174517tf(this, atmosphereTagInfo, atmosphereTag, null), 3);
    }

    public final void LJJIIZ(String str) {
        LJJIJIIJI().getClass();
        LJJIJL().LIZIZ(str);
    }

    public final int LJJIJIL(boolean z) {
        if (Intrinsics.LJFF(this.LLLIZZ, Boolean.TRUE)) {
            return 2;
        }
        if (!z && this.LLLIZZ != null) {
            return 1;
        }
        return 0;
    }

    public final void LJJJIL(GetMoreActionResp getMoreActionResp) {
        String string;
        Integer numValueOf;
        LJJIJIIJI().LJIIJJI(getMoreActionResp, new AwS576S0100000_32(this, 477));
        EnumC21192517wZ enumC21192517wZ = EnumC21192517wZ.FLIP_CARD;
        String strLJJIJIIJIL = LJJIJIIJIL();
        Room room = this.LLJILLL;
        C1563990qnl c1563990qnl = null;
        if (room != null) {
            string = Long.valueOf(room.getId()).toString();
        } else {
            string = null;
        }
        boolean z = this.LLJJI;
        boolean z2 = this.LLLI;
        boolean z3 = this.LLLFFI;
        UsPopupCardVO usPopupCardVO = LJJIJIIJI().LL;
        if (usPopupCardVO != null) {
            numValueOf = Integer.valueOf(usPopupCardVO.cardType);
        } else {
            numValueOf = null;
        }
        UsPopupCardVO usPopupCardVO2 = LJJIJIIJI().LL;
        if (usPopupCardVO2 != null) {
            c1563990qnl = usPopupCardVO2.chainInfo;
        }
        C21192417wY.LJFF(enumC21192517wZ, strLJJIJIIJIL, string, null, z, z2, z3, false, numValueOf, c1563990qnl);
    }

    public final void LJJJJJL(long j) {
        if (!this.LLLFZ && j <= 0) {
            return;
        }
        AnonymousClass0956 anonymousClass0956 = this.LLLIIII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLLIIII = C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LJFF), null, null, new C21184017vC(j, this, null), 3);
    }

    public final void LJJJJZ(String str) {
        String string;
        Integer numValueOf;
        C1563990qnl c1563990qnl;
        EnumC21192517wZ enumC21192517wZ;
        String strLJJIJIIJIL = LJJIJIIJIL();
        Room room = this.LLJILLL;
        if (room != null) {
            string = Long.valueOf(room.getId()).toString();
        } else {
            string = null;
        }
        boolean z = this.LLJJI;
        boolean z2 = this.LLLI;
        boolean z3 = this.LLLFFI;
        UsPopupCardVO usPopupCardVO = LJJIJIIJI().LL;
        if (usPopupCardVO != null) {
            numValueOf = Integer.valueOf(usPopupCardVO.cardType);
        } else {
            numValueOf = null;
        }
        UsPopupCardVO usPopupCardVO2 = LJJIJIIJI().LL;
        if (usPopupCardVO2 != null) {
            c1563990qnl = usPopupCardVO2.chainInfo;
        } else {
            c1563990qnl = null;
        }
        try {
            if (Intrinsics.LJFF(str, "button")) {
                enumC21192517wZ = EnumC21192517wZ.CLICK_BUTTON;
            } else if (Intrinsics.LJFF(str, "close")) {
                enumC21192517wZ = EnumC21192517wZ.CLICK_CLOSE;
            } else {
                enumC21192517wZ = EnumC21192517wZ.CLICK_OTHER;
            }
            if (!Intrinsics.LJFF(C1865520ye6.LIZ("rd_ttec_pin_card_event"), Boolean.FALSE)) {
                String strName = enumC21192517wZ.name();
                Locale locale = Locale.ROOT;
                C21192417wY.LJIIIIZZ(C2097608Jq.LJIIJ(new kotlin.Pair("step", strName.toLowerCase(locale)), new kotlin.Pair("role", strLJJIJIIJIL.toLowerCase(locale)), new kotlin.Pair("room_id", string), new kotlin.Pair("product_id", null), new kotlin.Pair("is_page_visible", Integer.valueOf(z ? 1 : 0)), new kotlin.Pair("is_keyboard_showing", Integer.valueOf(z2 ? 1 : 0)), new kotlin.Pair("has_ec_perm", Integer.valueOf(z3 ? 1 : 0)), new kotlin.Pair("is_from_message", 0), new kotlin.Pair("card_type", numValueOf), new kotlin.Pair("code_type", C21192417wY.LIZ())), c1563990qnl);
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJJJLZIJ(String str) {
        String string;
        Integer numValueOf;
        this.LLJILJILJ.LJIIIIZZ("quit_type", str, false);
        this.LLJILJILJ.LJII(System.currentTimeMillis() - this.LLJILJILJ.LIZ("start_time"), "stay_time");
        LJJIJL().LJIIIIZZ(str);
        EnumC21192517wZ enumC21192517wZ = EnumC21192517wZ.CLOSE;
        String strLJJIJIIJIL = LJJIJIIJIL();
        Room room = this.LLJILLL;
        C1563990qnl c1563990qnl = null;
        if (room != null) {
            string = Long.valueOf(room.getId()).toString();
        } else {
            string = null;
        }
        boolean z = this.LLJJI;
        boolean z2 = this.LLLI;
        boolean z3 = this.LLLFFI;
        UsPopupCardVO usPopupCardVO = LJJIJIIJI().LL;
        if (usPopupCardVO != null) {
            numValueOf = Integer.valueOf(usPopupCardVO.cardType);
        } else {
            numValueOf = null;
        }
        UsPopupCardVO usPopupCardVO2 = LJJIJIIJI().LL;
        if (usPopupCardVO2 != null) {
            c1563990qnl = usPopupCardVO2.chainInfo;
        }
        C21192417wY.LJFF(enumC21192517wZ, strLJJIJIIJIL, string, null, z, z2, z3, false, numValueOf, c1563990qnl);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onCreate(Bundle bundle) {
        FragmentManager supportFragmentManager;
        ActivityStack.addAppBackGroundListener(this);
        this.LLJI.LIZ = new WeakReference<>(this);
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LLILZLL);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            supportFragmentManager.LJZL(this.LLL, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:328:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:571:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0235  */
    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r22) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 2532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC21194117wp.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.17wz] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.17ud] */
    public AbstractC21194117wp(Context context, boolean z) {
        super(z);
        this.LLILZLL = context;
        this.LLIZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 480));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 478));
        this.LLJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 479));
        this.LLJI = new C21194917wx();
        this.LLJILJILJ = new C1743900vTw();
        this.LLJJIII = Boolean.FALSE;
        this.LLJJIJI = new HashMap();
        this.LLJJJJ = new HashMap();
        this.LLJLLIL = new HashMap();
        this.LLJLLL = new C1519570pe7();
        this.LLJZIJLIL = new BPEAHandler(new C21523419Lc(this, 1));
        this.LLL = new AbstractC813200VvC() { // from class: X.17wz
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
                C21194917wx c21194917wx = this.LL.LLJI;
                if (!c21194917wx.LIZLLL || !c21194917wx.LIZJ || !c21194917wx.LJ) {
                    return;
                }
                c21194917wx.LJ = false;
                c21194917wx.LIZIZ();
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
                        C21194917wx c21194917wx = this.LL.LLJI;
                        c21194917wx.LJIIIIZZ = "next";
                        if (!c21194917wx.LIZLLL || !c21194917wx.LIZJ || c21194917wx.LJ) {
                            return;
                        }
                        c21194917wx.LJ = true;
                        c21194917wx.LIZ();
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
                C21194917wx c21194917wx2 = this.LL.LLJI;
                c21194917wx2.LJIIIIZZ = "other";
                if (!c21194917wx2.LIZLLL || !c21194917wx2.LIZJ || c21194917wx2.LJ) {
                    return;
                }
                c21194917wx2.LJ = true;
                c21194917wx2.LIZ();
            }
        };
        this.LLLF = "";
        final C054G c054gLIZ = C2296808zG.LIZ(C2126308Ur.LJFF);
        this.LLLFF = c054gLIZ;
        this.LLLIIIL = -1L;
        this.LLLIIL = new C598730Ne3(c054gLIZ);
        this.LLLIILIL = new Object(c054gLIZ) { // from class: X.17ud
            public final InterfaceC497601wk LIZ;

            {
                this.LIZ = c054gLIZ;
            }
        };
        this.LLLILZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3023));
        this.LLLJ = new AObserverS234S0100000_32(this, 31);
        this.LLLJIL = new C21182517ux(this);
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

    public static final void LJJJJL(JSONObject jSONObject, Integer num) throws JSONException {
        IEventCenter iEventCenter = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
        JSONObject jSONObject2 = new JSONObject();
        if (num != null) {
            jSONObject2.put("action_type", num.intValue());
        }
        jSONObject2.put("data", jSONObject);
        iEventCenter.LIZ("ec_audience_message_event", C786410Ut5.J3(jSONObject2));
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0321  */
    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    /* JADX INFO: renamed from: LJJJJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LLIZ(com.bytedance.android.live.slot.IFrameSlot.SlotViewModel r100, X.InterfaceC21213717zz r101) {
        /*
            Method dump skipped, instruction units count: 1305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC21194117wp.LLIZ(com.bytedance.android.live.slot.IFrameSlot$SlotViewModel, X.17zz):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0232  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJLI(long r66, X.InterfaceC1364105Vn<? super kotlin.Unit> r68) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC21194117wp.LJJJJLI(long, X.05Vn):java.lang.Object");
    }

    public final void LJJJLIIL(Long l, boolean z) {
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
        String strLJJIJIIJIL = LJJIJIIJIL();
        String str2 = this.LLJJIJIL;
        Map<String, String> map = this.LLJJJJ;
        Integer num = this.LLLILZJ;
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
            jSONObject.put("live_role", strLJJIJIIJIL);
            jSONObject.put("enter_from_merge", str2);
            if (map != null) {
                for (Map.Entry entry : ((HashMap) map).entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
            jSONObject.put("card_type", num);
            jSONObject.put("code_region", C21189317w3.LIZ(EnumC21189117w1.US));
            jSONObject.put("product_id", l);
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

    @Override // X.InterfaceC1740480vOQ
    public final void mG(View view, LifecycleOwner lifecycleOwner) {
        C1756050vnX.LIZ(this, view, lifecycleOwner);
    }

    @Override // X.InterfaceC1164530gPT
    public void onEvent(String str, String str2) {
        if (Intrinsics.LJFF(str, "ec_page_quit")) {
            LJJL(0L, "pdp_exit", false);
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

    /* JADX WARN: Type inference failed for: r12v0, types: [T, com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO] */
    public final void LJJL(long j, String str, boolean z) {
        String idStr;
        if (this.LLLIIIL > 0 && LJJIZ() && LJJIJIIJI().LL != null) {
            C598730Ne3 c598730Ne3 = this.LLLIIL;
            AbstractC21198517xX<?> abstractC21198517xXLJJIJIIJI = LJJIJIIJI();
            Room room = this.LLJILLL;
            if (room == null || (idStr = room.getIdStr()) == null) {
                idStr = "";
            }
            String str2 = this.LLLF;
            int iLJJIJIL = LJJIJIL(false);
            long j2 = this.LLLIIIL;
            boolean z2 = this.LLLFZ;
            c598730Ne3.getClass();
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
            ?? r12 = abstractC21198517xXLJJIJIIJI.LL;
            c259800zU.element = r12;
            if (r12 == 0) {
                return;
            }
            long j3 = c598730Ne3.LIZJ;
            if (j3 <= 0) {
                j3 = r12.createTime;
            }
            c598730Ne3.LIZJ = j3;
            if (!z && SystemClock.elapsedRealtime() - c598730Ne3.LIZJ < EcomRefreshPincardSettings.LIZ().min) {
                C2341109Fh.LJII("interval is so short");
                return;
            }
            c598730Ne3.LIZLLL = true;
            AnonymousClass0956 anonymousClass0956 = c598730Ne3.LIZIZ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            c598730Ne3.LIZIZ = C23250099c.LIZLLL(c598730Ne3.LIZ, null, null, new C21193717wl(j, str, c598730Ne3, j2, abstractC21198517xXLJJIJIIJI, z2, idStr, c259800zU, str2, iLJJIJIL, null), 3);
        }
    }

    public final void LJJJJLL(ECommerceMessage eCommerceMessage, long j, C1563990qnl c1563990qnl, boolean z) {
        if (!this.LLJJI) {
            this.LLLIL = new C443120HZe<>(eCommerceMessage, Long.valueOf(j), c1563990qnl);
            C21192417wY.LIZIZ(EnumC21192517wZ.CHAIN_FAILED, c1563990qnl, C2097908Jt.LIZJ(new kotlin.Pair("reason", "page_invisible_delayed")));
        } else {
            this.LLLIL = null;
            this.LLJLLL.LIZIZ(ViewModelKt.getViewModelScope(this.LL), eCommerceMessage, new C1735550vGT(z, eCommerceMessage, j, this, c1563990qnl));
        }
    }

    public final void LJJJJZI(boolean z, int i, boolean z2, long j, Map map) {
        String idStr;
        int i2;
        int i3;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJL;
        Room room = this.LLJILLL;
        if (room != null) {
            idStr = room.getIdStr();
        } else {
            idStr = null;
        }
        String str = this.LLJJJIL;
        if (i == 1) {
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
        } else {
            i2 = 2;
        }
        String strLJJIJIIJIL = LJJIJIIJIL();
        String str2 = this.LLJJIJIL;
        Map<String, String> map2 = this.LLJJJJ;
        Integer num = this.LLLILZJ;
        try {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("room_id", idStr);
            jSONObject.put("user_action_type", str);
            jSONObject.put("is_prefetch", i2);
            jSONObject.put("live_role", strLJJIJIIJIL);
            if (z2) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            jSONObject.put("is_first_click", i3);
            jSONObject.put("enter_from_merge", str2);
            jSONObject.put("card_show_duration", j);
            jSONObject.put("live_stay_duration", jCurrentTimeMillis);
            if (map2 != null) {
                for (Map.Entry entry : ((HashMap) map2).entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
            jSONObject.put("card_type", num);
            jSONObject.put("card_rank", i);
            for (Map.Entry entry2 : ((HashMap) map).entrySet()) {
                jSONObject.put((String) entry2.getKey(), entry2.getValue());
            }
            jSONObject.put("code_region", C21189317w3.LIZ(EnumC21189117w1.US));
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_livesdk_tiktokec_product_click", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJJJJI(PopProductResp popProductResp, boolean z, boolean z2, ECommerceMessage eCommerceMessage, boolean z3, JSONObject jSONObject) {
        String string;
        boolean z4;
        Map<String, BuyButtonProperty> map;
        Room room;
        String idStr;
        String string2;
        String string3;
        boolean z5;
        String string4;
        if (C21195217x0.LIZIZ(popProductResp.pinCardConfig)) {
            Room room2 = this.LLJILLL;
            if (room2 == null || (string4 = Long.valueOf(room2.getId()).toString()) == null) {
                string4 = "";
            }
            C21188617vw.LIZ(string4).LIZ("room_is_pin_coupon", "1");
        }
        if (C21194717wv.LJ(popProductResp) != null) {
            String strLJII = C21194717wv.LJII(popProductResp);
            String strLJI = C21194717wv.LJI(popProductResp);
            Room room3 = this.LLJILLL;
            if (room3 != null) {
                string2 = Long.valueOf(room3.getId()).toString();
            } else {
                string2 = null;
            }
            C21198317xV.LJII(strLJII, strLJI, string2, LJJIJ(), CardStruct.IStatusCode.DEFAULT, LJJIJIIJIL(), ActivityStack.isAppBackGround(), this.LLJJI, this.LLLFFI, this.LLLFZ);
            EnumC21192917wd enumC21192917wd = EnumC21192917wd.ON_DATA_READY;
            String strLJJIJIIJIL = LJJIJIIJIL();
            Room room4 = this.LLJILLL;
            if (room4 != null) {
                string3 = Long.valueOf(room4.getId()).toString();
            } else {
                string3 = null;
            }
            String strLJI2 = C21194717wv.LJI(popProductResp);
            boolean z6 = this.LLJJI;
            boolean z7 = this.LLLI;
            boolean z8 = this.LLLFFI;
            if (eCommerceMessage != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            C21192417wY.LJI(enumC21192917wd, strLJJIJIIJIL, string3, strLJI2, z6, z7, z8, z5, Integer.valueOf(popProductResp.cardType), popProductResp.LIZLLL);
        }
        EnumC21192917wd enumC21192917wd2 = EnumC21192917wd.ON_SLOT_CREATED_FROM_RESPONSE;
        String strLJJIJIIJIL2 = LJJIJIIJIL();
        Room room5 = this.LLJILLL;
        if (room5 != null) {
            string = Long.valueOf(room5.getId()).toString();
        } else {
            string = null;
        }
        String strLJI3 = C21194717wv.LJI(popProductResp);
        boolean z9 = this.LLJJI;
        boolean z10 = this.LLLI;
        boolean z11 = this.LLLFFI;
        if (eCommerceMessage != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        C21192417wY.LJI(enumC21192917wd2, strLJJIJIIJIL2, string, strLJI3, z9, z10, z11, z4, Integer.valueOf(popProductResp.cardType), popProductResp.LIZLLL);
        if (C21194717wv.LJ(popProductResp) != null) {
            Product product = popProductResp.product;
            if (product == null) {
                product = new Product("", "", null, null, "", "", 0, null, 0, "", "", "", 0, "", "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null);
            }
            C182R c182r = UsPopupCardVO.Companion;
            String str = popProductResp.LIZIZ;
            Long lValueOf = Long.valueOf(popProductResp.LIZJ);
            long j = popProductResp.LIZ;
            long j2 = popProductResp.serverTime;
            FlashSaleAtmosphereInfo flashSaleAtmosphereInfo = popProductResp.flashSaleAtmosphereInfo;
            FlashSaleControl flashSaleControl = popProductResp.flashSaleControl;
            int i = popProductResp.bagIndex;
            PromotionStyleConfig promotionStyleConfig = popProductResp.promotionStyleConfig;
            Boolean bool = popProductResp.assistantSwitch;
            int i2 = popProductResp.cardType;
            ShoppingBagList shoppingBagList = popProductResp.shoppingBagList;
            BuyButtonConfig buyButtonConfig = popProductResp.buyButtonConfig;
            if (buyButtonConfig != null) {
                map = buyButtonConfig.pinCardBuyButtonConfig;
            } else {
                map = null;
            }
            PdpTopBubble pdpTopBubble = popProductResp.pdpTopBubble;
            NextActionInfo nextActionInfo = popProductResp.nextActionInfo;
            long j3 = popProductResp.popCardId;
            LynxCardInfo lynxCardInfo = popProductResp.lynxCardInfo;
            PinCardConfig pinCardConfig = popProductResp.pinCardConfig;
            ProductCardConfig productCardConfig = popProductResp.productCardConfig;
            AuctionData auctionData = popProductResp.auctionData;
            PopupCardBffData popupCardBffData = popProductResp.bffData;
            String str2 = popProductResp.popMsgCtxStr;
            c182r.getClass();
            UsPopupCardVO usPopupCardVOLIZ = C182R.LIZ(null, str, lValueOf, product, j, j2, flashSaleAtmosphereInfo, flashSaleControl, i, promotionStyleConfig, bool, i2, shoppingBagList, map, pdpTopBubble, nextActionInfo, j3, lynxCardInfo, pinCardConfig, productCardConfig, auctionData, popupCardBffData, jSONObject, str2);
            if (eCommerceMessage != null) {
                usPopupCardVOLIZ.fromMessage(eCommerceMessage);
            }
            usPopupCardVOLIZ.setBagIndex(popProductResp.bagIndex);
            usPopupCardVOLIZ.setLiveBagAndPinCardType(popProductResp.liveBagAndPinCardType);
            List<AtmosphereTag> list = popProductResp.atmosphereTags;
            if (list != null) {
                for (AtmosphereTag atmosphereTag : list) {
                    if (atmosphereTag != null && ((room = this.LLJILLL) == null || (idStr = room.getIdStr()) == null || LJJI(atmosphereTag.tagType, idStr))) {
                        atmosphereTag.LJII = product.productId;
                        usPopupCardVOLIZ.atmosphereTags.add(atmosphereTag);
                    }
                }
            }
            usPopupCardVOLIZ.setChainInfo(popProductResp.LIZLLL);
            C21194717wv.LJIIIZ(popProductResp, C21195917x7.LIZ(LJJIJIIJI().LLILLL));
            LJJIJIIJI().LJJIJIL(usPopupCardVOLIZ, LJJIZ());
            LJJIJL().LJFF(popProductResp, z, z2, z3);
            C21194917wx c21194917wx = this.LLJI;
            c21194917wx.LJI = true;
            c21194917wx.LJII = System.currentTimeMillis();
            c21194917wx.LJFF = false;
        }
    }

    public static void LJJLI(final AbstractC21194117wp abstractC21194117wp, final boolean z, ECommerceMessage eCommerceMessage, C1563990qnl c1563990qnl, boolean z2, final Integer num, int i) {
        String string;
        String string2;
        Integer numValueOf;
        Long lValueOf;
        DispersionInfo dispersionInfoLIZIZ;
        PopProduct popProduct;
        final boolean z3 = z2;
        C1563990qnl c1563990qnl2 = c1563990qnl;
        ECommerceMessage eCommerceMessage2 = eCommerceMessage;
        Long lValueOf2 = null;
        if ((i & 2) != 0) {
            eCommerceMessage2 = null;
        }
        if ((i & 4) != 0) {
            c1563990qnl2 = null;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        abstractC21194117wp.getClass();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (C0C01.LIZ() && eCommerceMessage2 != null && (popProduct = eCommerceMessage2.popProduct) != null) {
            string = Long.valueOf(popProduct.productId).toString();
        } else {
            string = null;
        }
        if (abstractC21194117wp.LJJIJLIJ()) {
            try {
                if (!C0C64.LJIILLIIL().LJIIIZ(31744, "affiliate_pin_card", true, true)) {
                    C21192417wY.LIZIZ(EnumC21192517wZ.CHAIN_FAILED, c1563990qnl2, C2097908Jt.LIZJ(new kotlin.Pair("reason", "broadcast_show_pincard_setting_disable")));
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        EnumC21192517wZ enumC21192517wZ = EnumC21192517wZ.POP_REQUEST_SEND;
        String strLJJIJIIJIL = abstractC21194117wp.LJJIJIIJIL();
        Room room = abstractC21194117wp.LLJILLL;
        if (room != null) {
            string2 = Long.valueOf(room.getId()).toString();
        } else {
            string2 = null;
        }
        boolean z4 = abstractC21194117wp.LLJJI;
        boolean z5 = abstractC21194117wp.LLLI;
        boolean z6 = abstractC21194117wp.LLLFFI;
        UsPopupCardVO usPopupCardVO = abstractC21194117wp.LJJIJIIJI().LL;
        if (usPopupCardVO != null) {
            numValueOf = Integer.valueOf(usPopupCardVO.cardType);
        } else {
            numValueOf = null;
        }
        C21192417wY.LIZLLL(enumC21192517wZ, strLJJIJIIJIL, string2, z4, z5, z6, numValueOf, c1563990qnl2);
        if (abstractC21194117wp.LJJIJLIJ()) {
            dispersionInfoLIZIZ = null;
        } else {
            Room room2 = abstractC21194117wp.LLJILLL;
            if (room2 != null) {
                lValueOf = Long.valueOf(room2.getId());
            } else {
                lValueOf = null;
            }
            dispersionInfoLIZIZ = C598410NdX.LIZIZ(1, String.valueOf(lValueOf));
        }
        Room room3 = abstractC21194117wp.LLJILLL;
        if (room3 != null) {
            lValueOf2 = Long.valueOf(room3.getId());
        }
        final C1563990qnl c1563990qnl3 = c1563990qnl2;
        final ECommerceMessage eCommerceMessage3 = eCommerceMessage2;
        C598360NdS.LJFF(String.valueOf(lValueOf2), 1, false, dispersionInfoLIZIZ, new C21179717uV(abstractC21194117wp, num, string, z3, eCommerceMessage2, c1563990qnl2), new InterfaceC594300NSq<BaseResponse<PopProductResp>>() { // from class: X.17uS
            @Override // X.InterfaceC594300NSq
            public final void onFailure(C0X9S<BaseResponse<PopProductResp>> c0x9s, Throwable th2) {
                String string3;
                boolean z7;
                String str;
                String string4;
                String string5;
                Integer numValueOf2;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                String strLJJIJ = AbstractC21194117wp.LJJIJ();
                Room room4 = this.LL.LLJILLL;
                if (room4 != null) {
                    string3 = Long.valueOf(room4.getId()).toString();
                } else {
                    string3 = null;
                }
                String message = th2.getMessage();
                if (eCommerceMessage3 != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                String strLJJIJIIJIL2 = this.LL.LJJIJIIJIL();
                if (eCommerceMessage3 != null) {
                    str = "message_request";
                } else {
                    str = "other";
                }
                C21198317xV.LIZLLL(strLJJIJ, string3, false, jCurrentTimeMillis2, -7, message, z7, strLJJIJIIJIL2, false, false, str, z3, this.LL.LLJJJJ, num);
                Room room5 = this.LL.LLJILLL;
                if (room5 != null) {
                    string4 = Long.valueOf(room5.getId()).toString();
                } else {
                    string4 = null;
                }
                C21197617xO.LIZJ(string4, th2.getMessage(), false, false);
                EnumC21192517wZ enumC21192517wZ2 = EnumC21192517wZ.POP_REQUEST_FAIL;
                String strLJJIJIIJIL3 = this.LL.LJJIJIIJIL();
                Room room6 = this.LL.LLJILLL;
                if (room6 != null) {
                    string5 = Long.valueOf(room6.getId()).toString();
                } else {
                    string5 = null;
                }
                AbstractC21194117wp abstractC21194117wp2 = this.LL;
                boolean z8 = abstractC21194117wp2.LLJJI;
                boolean z9 = abstractC21194117wp2.LLLI;
                boolean z10 = abstractC21194117wp2.LLLFFI;
                UsPopupCardVO usPopupCardVO2 = abstractC21194117wp2.LJJIJIIJI().LL;
                if (usPopupCardVO2 != null) {
                    numValueOf2 = Integer.valueOf(usPopupCardVO2.cardType);
                } else {
                    numValueOf2 = null;
                }
                C21192417wY.LIZLLL(enumC21192517wZ2, strLJJIJIIJIL3, string5, z8, z9, z10, numValueOf2, c1563990qnl3);
            }

            @Override // X.InterfaceC594300NSq
            public final void onResponse(C0X9S<BaseResponse<PopProductResp>> c0x9s, C0X52<BaseResponse<PopProductResp>> c0x52) {
                boolean z7;
                String string3;
                boolean z8;
                int code;
                String message;
                boolean z9;
                Integer numValueOf2;
                Integer numValueOf3;
                String str;
                Integer numValueOf4;
                boolean z10;
                EnumC21192517wZ enumC21192517wZ2;
                String string4;
                BaseResponse<PopProductResp> baseResponse;
                PopProductResp data;
                PopProductResp data2;
                BaseResponse<PopProductResp> baseResponse2;
                PopProductResp data3;
                EnumC21179517uT enumC21179517uT;
                String string5;
                String requestId;
                PopProductResp data4;
                PopProductResp data5;
                boolean z11;
                MutableLiveData<Pair<Boolean, String>> mutableLiveData;
                Pair<Boolean, String> value;
                UsPopupCardVO usPopupCardVO2;
                String string6;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                C1743900vTw c1743900vTw = this.LL.LLJILJILJ;
                c1743900vTw.LJII(jCurrentTimeMillis2, "api_end_time");
                c1743900vTw.LJIIIIZZ("isFirst", CardStruct.IStatusCode.DEFAULT, false);
                long j = jCurrentTimeMillis2 - jCurrentTimeMillis;
                if (c0x52.LIZJ()) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                Integer numValueOf5 = null;
                if (z7) {
                    C21191817wS c21191817wS = C21191817wS.LIZ;
                    if (this.LL.LJJIJLIJ()) {
                        enumC21179517uT = EnumC21179517uT.ANCHOR_POP_CARD;
                    } else {
                        enumC21179517uT = EnumC21179517uT.AUDIENCE_POP_CARD;
                    }
                    String value2 = enumC21179517uT.getValue();
                    String value3 = EnumC21186317vZ.US.getValue();
                    Room room4 = this.LL.LLJILLL;
                    if (room4 != null) {
                        string5 = Long.valueOf(room4.getId()).toString();
                    } else {
                        string5 = null;
                    }
                    Room room5 = this.LL.LLJILLL;
                    if (room5 != null) {
                        requestId = room5.getRequestId();
                    } else {
                        requestId = null;
                    }
                    c21191817wS.getClass();
                    C21191817wS.LIZ(value2, value3, string5, requestId);
                    BaseResponse<PopProductResp> baseResponse3 = c0x52.LIZIZ;
                    if (baseResponse3 != null) {
                        data4 = baseResponse3.getData();
                    } else {
                        data4 = null;
                    }
                    if (data4 == null) {
                        Room room6 = this.LL.LLJILLL;
                        if (room6 != null) {
                            string6 = Long.valueOf(room6.getId()).toString();
                        } else {
                            string6 = null;
                        }
                        C21197617xO.LIZJ(string6, "", false, true);
                        C21192417wY.LIZIZ(EnumC21192517wZ.CHAIN_FAILED, c1563990qnl3, C2097908Jt.LIZJ(new kotlin.Pair("reason", "pop_api_data_empty")));
                    }
                    BaseResponse<PopProductResp> baseResponse4 = c0x52.LIZIZ;
                    if (baseResponse4 != null && (data5 = baseResponse4.getData()) != null) {
                        C1563990qnl c1563990qnl4 = c1563990qnl3;
                        long j2 = jCurrentTimeMillis;
                        AbstractC21194117wp abstractC21194117wp2 = this.LL;
                        ECommerceMessage eCommerceMessage4 = eCommerceMessage3;
                        boolean z12 = z;
                        boolean z13 = z3;
                        data5.LIZLLL = c1563990qnl4;
                        C598030Ncv.LIZ.getClass();
                        data5.LIZIZ = C598030Ncv.LIZLLL(c0x52);
                        data5.LIZJ = j2;
                        C21194017wo.LIZ(data5, abstractC21194117wp2.LJJIJLIJ());
                        if (eCommerceMessage4 != null && ((Boolean) abstractC21194117wp2.LLLILZ.getValue()).booleanValue() && eCommerceMessage4.cardType != data5.cardType && eCommerceMessage4.actionType != 9) {
                            C21192417wY.LIZIZ(EnumC21192517wZ.CHAIN_FAILED, c1563990qnl4, C2097908Jt.LIZJ(new kotlin.Pair("reason", "card_type_mismatch")));
                        } else {
                            if (!abstractC21194117wp2.LJJIJLIJ() && (eCommerceMessage4 == null || eCommerceMessage4.actionType == 1)) {
                                C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZIZ), null, null, new C21176717u1(data5, c0x52, abstractC21194117wp2, null), 3);
                            }
                            IFrameSlot.SlotViewModel slotViewModel = abstractC21194117wp2.LLJIJIL;
                            if (slotViewModel == null || (mutableLiveData = slotViewModel.LL) == null || (value = mutableLiveData.getValue()) == null || !Intrinsics.LJFF(value.first, Boolean.TRUE) || ((usPopupCardVO2 = abstractC21194117wp2.LJJIJIIJI().LL) != null && usPopupCardVO2.cardType == data5.cardType)) {
                                z11 = false;
                            } else {
                                abstractC21194117wp2.LJJIIZ("repin");
                                z11 = true;
                            }
                            C21194017wo.LIZ(data5, abstractC21194117wp2.LJJIJLIJ());
                            C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LJFF), null, null, new C1735520vGQ(z11, abstractC21194117wp2, data5, z12, eCommerceMessage4, z13, null), 3);
                            abstractC21194117wp2.LJJIIJ(true);
                        }
                    }
                }
                String strLJJIJ = AbstractC21194117wp.LJJIJ();
                Room room7 = this.LL.LLJILLL;
                if (room7 != null) {
                    string3 = Long.valueOf(room7.getId()).toString();
                } else {
                    string3 = null;
                }
                if (c0x52.LIZJ() && (baseResponse2 = c0x52.LIZIZ) != null && (data3 = baseResponse2.getData()) != null && C21194717wv.LJ(data3) != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                BaseResponse<PopProductResp> baseResponse5 = c0x52.LIZIZ;
                if (baseResponse5 != null) {
                    code = baseResponse5.getCode();
                } else {
                    code = 0;
                }
                BaseResponse<PopProductResp> baseResponse6 = c0x52.LIZIZ;
                if (baseResponse6 != null) {
                    message = baseResponse6.getMessage();
                } else {
                    message = null;
                }
                if (eCommerceMessage3 != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                String strLJJIJIIJIL2 = this.LL.LJJIJIIJIL();
                ECommerceMessage eCommerceMessage5 = eCommerceMessage3;
                if (eCommerceMessage5 != null) {
                    numValueOf2 = Integer.valueOf(eCommerceMessage5.cardType);
                } else {
                    numValueOf2 = null;
                }
                BaseResponse<PopProductResp> baseResponse7 = c0x52.LIZIZ;
                if (baseResponse7 != null && (data2 = baseResponse7.getData()) != null) {
                    numValueOf3 = Integer.valueOf(data2.cardType);
                } else {
                    numValueOf3 = null;
                }
                boolean z14 = !Intrinsics.LJFF(numValueOf2, numValueOf3);
                if (eCommerceMessage3 != null) {
                    str = "message_request";
                } else {
                    str = "other";
                }
                PopProductResp data6 = c0x52.LIZIZ.getData();
                if (data6 != null) {
                    numValueOf4 = Integer.valueOf(data6.cardType);
                } else {
                    numValueOf4 = null;
                }
                C21198317xV.LIZLLL(strLJJIJ, string3, z8, j, code, message, z9, strLJJIJIIJIL2, false, z14, str, z3, this.LL.LLJJJJ, numValueOf4);
                if (c0x52.LIZJ() && (baseResponse = c0x52.LIZIZ) != null && (data = baseResponse.getData()) != null && C21194717wv.LJ(data) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    enumC21192517wZ2 = EnumC21192517wZ.POP_REQUEST_SUCCESS;
                } else {
                    enumC21192517wZ2 = EnumC21192517wZ.POP_REQUEST_FAIL;
                }
                String strLJJIJIIJIL3 = this.LL.LJJIJIIJIL();
                Room room8 = this.LL.LLJILLL;
                if (room8 != null) {
                    string4 = Long.valueOf(room8.getId()).toString();
                } else {
                    string4 = null;
                }
                AbstractC21194117wp abstractC21194117wp3 = this.LL;
                boolean z15 = abstractC21194117wp3.LLJJI;
                boolean z16 = abstractC21194117wp3.LLLI;
                boolean z17 = abstractC21194117wp3.LLLFFI;
                UsPopupCardVO usPopupCardVO3 = abstractC21194117wp3.LJJIJIIJI().LL;
                if (usPopupCardVO3 != null) {
                    numValueOf5 = Integer.valueOf(usPopupCardVO3.cardType);
                }
                C21192417wY.LIZLLL(enumC21192517wZ2, strLJJIJIIJIL3, string4, z15, z16, z17, numValueOf5, c1563990qnl3);
            }
        });
    }
}
