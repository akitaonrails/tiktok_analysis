package X;

import Y.ALAdapterS26S0100000_32;
import Y.AObserverS188S0200000_28;
import Y.AObserverS234S0100000_32;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.LiveShopAddPermissionBusinessSetting;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.AtmosphereTagInfo;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.ext.ECTaskRegisterMessage;
import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.android.livesdk.model.message.ext.EcTaskRegisterMessageEntity;
import com.bytedance.android.livesdk.model.message.ext.PopProduct;
import com.bytedance.android.livesdkapi.depend.model.live.AggregationData;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.bagicon.BagGuideTooltipController;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.config.EcomShopBagDailyAnimModel;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings.ShopBagIconGuidanceAnimConfigSettings;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.api.EcMessageApi;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.settings.EcShopBagBubbleNoImageSetting;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.settings.SeaLiveBagIconEducationBubbleSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.ecommerce.IECHalfSearchAbility;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS146S1100000_32;
import kotlin.jvm.internal.AwS398S0200000_32;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.17zj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21212117zj extends AbstractC21213617zy implements InterfaceC212386189o, InterfaceC756370Tlj, InterfaceC1141530foN, InterfaceC1164530gPT, InterfaceC1740480vOQ, InterfaceC484670IzZ {
    public static final List<String> LLLLILI = Collections.singletonList("fe_tiktok_ecommerce_shop_cart");
    public static final List<String> LLLLJ = Collections.singletonList("fe_tiktok_ecommerce_live_room_shop_bag");
    public final Context LLIZLLLIL;
    public IIconSlot.SlotViewModel LLJ;
    public InterfaceC21213717zz LLJI;
    public WeakReference<LifecycleOwner> LLJIJIL;
    public Room LLJILJIL;
    public C314900CWa<Map<String, String>> LLJJ;
    public String LLJJI;
    public boolean LLJJIII;
    public String LLJJIJI;
    public String LLJJJ;
    public String LLJJJIL;
    public String LLJJJJ;
    public String LLJJJJJIL;
    public Boolean LLJJJJLIIL;
    public Integer LLJJL;
    public String LLJL;
    public String LLJLIL;
    public long LLJLILLLLZIIL;
    public long LLJLL;
    public long LLJLLIL;
    public long LLJLLL;
    public OecInitData LLJZIJLIL;
    public boolean LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public boolean LLLIIII;
    public long LLLIIIIL;
    public final C054G LLLIIIL;
    public AnonymousClass0956 LLLIIL;
    public final BagGuideTooltipController LLLIILIL;
    public C1741650vQJ LLLIL;
    public final C01GW LLLILZ;
    public final C01GW LLLILZJ;
    public final C01GW LLLILZLLLI;
    public final C01GW LLLIZZ;
    public final List<InterfaceC21213517zx> LLLJ;
    public InterfaceC1892740zM0 LLLJIL;
    public final AnonymousClass1803 LLLJL;
    public boolean LLLL;
    public final C1743900vTw LLLLII;
    public final C180E LLLLIIIILLL;
    public final C01GW LLLLIIL;
    public int LLLLIILL;
    public int LLLLIILLL;
    public boolean LLLLIL;
    public Boolean LLJILJILJ = Boolean.FALSE;
    public Map<String, String> LLJILLL = new HashMap();
    public long LLJJIJIIJIL = -1;
    public long LLJJIJIL = -1;
    public Map<String, String> LLJJLIIIJLLLLLLLZ = new HashMap();
    public String LLJZ = "";
    public final Map<String, String> LLL = new HashMap();
    public String LLLF = "";

    @Override // X.InterfaceC1124060fMC
    public final String LIZ() {
        return "ec_shop";
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final String LLILZIL() {
        return "AudienceLeftShoppingBag";
    }

    @Override // X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final List<Integer> getMessageType() {
        return C21182917v1.LIZ(2);
    }

    @Override // X.InterfaceC1748820vbs
    public final String getPageName() {
        return "shop_bag_icon";
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onPause() {
        this.LLLI = false;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "ec_refactor_short_touch_code_disable", true, true)) {
            this.LLJZ = "";
        } else {
            List<InterfaceC21213517zx> list = this.LLLJ;
            if (list != null) {
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC21213517zx) it2.next()).onPause();
                }
            }
        }
        LJJIIZI(null);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onResume() {
        this.LLLI = true;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "ec_refactor_short_touch_code_disable", true, true)) {
            if (Intrinsics.LJFF(this.LLJZ, "")) {
                return;
            }
            SmartRouter.buildRoute(this.LLIZLLLIL, this.LLJZ).open();
            this.LLJZ = "";
            return;
        }
        List<InterfaceC21213517zx> list = this.LLLJ;
        if (list != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                ((InterfaceC21213517zx) it2.next()).onResume();
            }
        }
    }

    @Override // X.InterfaceC1748820vbs
    public final void sh() {
    }

    @Override // X.AbstractC21213317zv
    public final TuxIconDrawable LJJ() {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_bag;
        return c419910GdJ.LIZ(this.LLIZLLLIL);
    }

    @Override // X.AbstractC21213317zv
    public final TuxIconDrawable LJJIFFI() {
        EnumC1102990eoD enumC1102990eoDLIZLLL;
        InterfaceC21213717zz interfaceC21213717zz = this.LLJI;
        if (interfaceC21213717zz != null && (enumC1102990eoDLIZLLL = interfaceC21213717zz.LIZLLL()) != null && C1103030eoH.LIZ[enumC1102990eoDLIZLLL.ordinal()] == 1) {
            return LJJ();
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_bag_fill;
        c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.exs, this.LLIZLLLIL);
        return c419910GdJ.LIZ(this.LLIZLLLIL);
    }

    public final boolean LJJIIJZLJL() {
        IEcommerceLiveService iEcommerceLiveService;
        Room room = this.LLJILJIL;
        if (room == null || (iEcommerceLiveService = (IEcommerceLiveService) PluggableExtentionKt.pluggableSpi$default(IEcommerceLiveService.class, false, false, false, 14, null)) == null) {
            return false;
        }
        return iEcommerceLiveService.isECVisible(room);
    }

    public final boolean LJJIIZ() {
        if (!this.LLLL) {
            return false;
        }
        C21209717zL.LIZ.getClass();
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        return iLiveOuterService != null && iLiveOuterService.D3();
    }

    public final C21212917zr LJJIJIIJIL() {
        C21213217zu c21213217zu = C21213217zu.LIZ;
        Room room = this.LLJILJIL;
        C21212917zr c21212917zrLIZIZ = c21213217zu.LIZIZ(room != null ? Long.valueOf(room.getId()) : null);
        if (c21212917zrLIZIZ == null) {
            return null;
        }
        BagGuideTooltipController bagGuideTooltipController = this.LLLIILIL;
        if (!C290560BaA.LIZ()) {
            c21212917zrLIZIZ.LIZLLL = new WeakReference<>(bagGuideTooltipController);
        }
        return c21212917zrLIZIZ;
    }

    public final int LJJIJIL() {
        return ((Number) this.LLLIZZ.getValue()).intValue();
    }

    public final void LJJJJL() {
        if (this.LLLIIII) {
            this.LLLLII.LJIIIIZZ("ec_access_forbidden", "1", false);
        } else if (this.LLLLII.LJFF("ec_access_forbidden")) {
            this.LLLLII.LJIIJJI("ec_access_forbidden");
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final List<EnumC742820TBw> LJLI() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(EnumC742820TBw.LIVE_ROOM_EC_LIVE_STATUS);
        return arrayList;
    }

    @Override // X.InterfaceC484670IzZ
    public final Integer getComponentType() {
        return 164;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onStart() {
        Iterator<InterfaceC21213517zx> it2 = this.LLLJ.iterator();
        while (it2.hasNext()) {
            it2.next().onStart();
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onStop() {
        Iterator<InterfaceC21213517zx> it2 = this.LLLJ.iterator();
        while (it2.hasNext()) {
            it2.next().onStop();
        }
    }

    public final void LJJIJL() {
        if (LJJIIJZLJL()) {
            String str = this.LLLLIILL > 0 ? "product_available" : "product_not_available";
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.LLLLII.LJIIIIZZ("shopping_status", str, false);
        }
    }

    @Override // X.InterfaceC1748810vbr
    public final InterfaceC1748810vbr d8() {
        return C960603pE.LIZJ(this);
    }

    @Override // X.AbstractC21213417zw, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDestroy() throws JSONException {
        LifecycleOwner lifecycleOwner;
        ILiveOuterService iLiveOuterService;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        IECHalfSearchAbility iECHalfSearchAbility;
        String idStr;
        MutableLiveData<Pair<Boolean, Integer>> mutableLiveData;
        super.onDestroy();
        C21212717zp.LIZ.getClass();
        C21212717zp.LIZIZ = null;
        C21212717zp.LIZJ.clear();
        IIconSlot.SlotViewModel slotViewModel = this.LLJ;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LLJJL) != null) {
            mutableLiveData.postValue(Pair.create(Boolean.FALSE, Integer.valueOf(LJJIJIL())));
        }
        if (LJJIIZ()) {
            Room room = this.LLJILJIL;
            C596460NaO.LIZ(room != null ? room.getIdStr() : null);
        }
        Room room2 = this.LLJILJIL;
        if (room2 != null && (idStr = room2.getIdStr()) != null) {
            C19378910rj.LIZJ(idStr, "SLOT_BAG_BUBBLE_SHOW");
            C19378910rj.LIZJ(idStr, "SLOT_SHOP_BAG_GUIDE_BUBBLE");
            C212343187x.LIZ.remove(idStr);
        }
        C2296808zG.LIZJ(this.LLLIIIL, null);
        ((C1739460vMm) C1125004ae.LIZ.getValue()).LL = false;
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            JSONObject jSONObject = new JSONObject();
            Room room3 = this.LLJILJIL;
            jSONObject.put("room_id", room3 != null ? Long.valueOf(room3.getId()) : "");
            iEventCenter.LIZ("ec_live_shop_widget_on_destroy", C786410Ut5.J3(jSONObject));
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LLIZLLLIL);
        if (c19egLIZIZ != null && (iECHalfSearchAbility = (IECHalfSearchAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19egLIZIZ, null), IECHalfSearchAbility.class, null)) != null) {
            iECHalfSearchAbility.LY0();
        }
        C622680Oba.LIZLLL(this);
        if (!this.LLLLIL) {
            C2232408os c2232408os = C341050DYp.LIZ;
            Room room4 = this.LLJILJIL;
            String idStr2 = room4 != null ? room4.getIdStr() : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str = this.LLJJI;
            linkedHashMap.put("enter_from_merge", str != null ? str : "");
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(AbstractC21213417zw.LJJII(this.LLJILJIL));
            linkedHashMap.put("is_followed", (numLJIIJJI == null || numLJIIJJI.intValue() <= 0) ? CardStruct.IStatusCode.DEFAULT : "1");
            C341050DYp.LJI("live_view_action", idStr2, linkedHashMap);
            this.LLLLIL = true;
        }
        C212148180k.LLJJI.getClass();
        C212149180l.LLJJIJI = false;
        Iterator it2 = ((ArrayList) this.LLLJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC21213517zx) it2.next()).onDestroy();
        }
        WeakReference<LifecycleOwner> weakReference = this.LLJIJIL;
        if (weakReference != null && (lifecycleOwner = weakReference.get()) != null && (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null) {
            interfaceC20673515v3K4.k7(lifecycleOwner);
        }
        this.LLJIJIL = null;
        this.LLJI = null;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDispose() {
        List<InterfaceC21213517zx> list;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "ec_refactor_short_touch_code_disable", true, true) || (list = this.LLLJ) == null) {
            return;
        }
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            ((InterfaceC21213517zx) it2.next()).onDispose();
        }
    }

    @Override // X.InterfaceC1748820vbs
    public final Map<String, String> Aa() {
        return C988803tm.LIZIZ;
    }

    @Override // X.InterfaceC1124060fMC
    public final Object LLILZLL() {
        return this.LLLJL;
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC756810TmR.SLOT_LIVE_WATCHER_TOOLBAR;
    }

    @Override // X.InterfaceC1748810vbr
    public final List<String> getRegisteredLane() {
        return C988803tm.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [X.180E] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.1803] */
    public C21212117zj(Context context) {
        this.LLIZLLLIL = context;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLLIIIL = C2296808zG.LIZ(C2107308Nj.LIZ);
        this.LLLIILIL = new BagGuideTooltipController(new WeakReference(this.LLIZLLLIL), new AwS576S0100000_32(this, 826));
        this.LLLILZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 827));
        this.LLLILZJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 828));
        this.LLLILZLLLI = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(525));
        this.LLLIZZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(527));
        this.LLLJ = new ArrayList();
        final AnonymousClass1805 anonymousClass1805 = new AnonymousClass1805(this);
        final ALAdapterS26S0100000_32 aLAdapterS26S0100000_32 = new ALAdapterS26S0100000_32(this, 26);
        this.LLLJL = new IIconSlot(anonymousClass1805, aLAdapterS26S0100000_32) { // from class: X.1803
            public final InterfaceC752610Tff LIZ;
            public final Animator.AnimatorListener LIZIZ;

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final void getScheme() {
            }

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final Animator.AnimatorListener LIZ() {
                return this.LIZIZ;
            }

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final InterfaceC752610Tff LIZJ() {
                return this.LIZ;
            }

            {
                this.LIZ = anonymousClass1805;
                this.LIZIZ = aLAdapterS26S0100000_32;
            }
        };
        this.LLLLII = new C1743900vTw();
        this.LLLLIIIILLL = new Object() { // from class: X.180E
        };
        this.LLLLIIL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(526));
    }

    @Override // X.InterfaceC756370Tlj
    public final void LJIIIZ(InterfaceC1892740zM0 interfaceC1892740zM0) {
        if (!LiveShopAddPermissionBusinessSetting.INSTANCE.isEnabled()) {
            return;
        }
        this.LLLJIL = interfaceC1892740zM0;
        LJJJ(this.LLLLIILL);
    }

    @Override // X.InterfaceC212387189p
    public final void LJIILIIL(final Function1<? super C1892750zM1, Unit> function1) {
        if (!LiveShopAddPermissionBusinessSetting.INSTANCE.isEnabled()) {
            return;
        }
        this.LLLJIL = new InterfaceC1892740zM0() { // from class: X.0zM2
            @Override // X.InterfaceC1892740zM0
            public final void LIZ(C1892750zM1 c1892750zM1) {
                function1.invoke(c1892750zM1);
            }
        };
        LJJJ(this.LLLLIILL);
    }

    @Override // X.InterfaceC212387189p
    public final void LJIJI(C756930Tmd c756930Tmd) {
        IIconSlot.SlotViewModel slotViewModel;
        MutableLiveData<Boolean> mutableLiveData;
        if (Intrinsics.LJFF("ec_shop", c756930Tmd.LIZJ)) {
            IIconSlot.SlotViewModel slotViewModel2 = this.LLJ;
            if ((slotViewModel2 != null && (mutableLiveData = slotViewModel2.LLILZ) != null && Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.valueOf(c756930Tmd.LIZIZ))) || (slotViewModel = this.LLJ) == null) {
                return;
            }
            C21207817z2.LIZJ(slotViewModel, c756930Tmd.LIZIZ);
        }
    }

    public final void LJJIIZI(Integer num) {
        MutableLiveData<Boolean> mutableLiveData;
        if (num != null) {
            int iIntValue = num.intValue();
            IIconSlot.SlotViewModel slotViewModel = this.LLJ;
            if (slotViewModel != null) {
                slotViewModel.LLJZ = Integer.valueOf(iIntValue);
            }
        }
        LJJIZ(true);
        IIconSlot.SlotViewModel slotViewModel2 = this.LLIZ;
        if (slotViewModel2 != null && (mutableLiveData = slotViewModel2.LLJJIJI) != null) {
            mutableLiveData.setValue(Boolean.FALSE);
        }
        IIconSlot.SlotViewModel slotViewModel3 = this.LLIZ;
        if (slotViewModel3 != null) {
            slotViewModel3.LLJLILLLLZIIL = null;
            slotViewModel3.LLJLL = null;
            slotViewModel3.LLJLLL = null;
            slotViewModel3.LLJZ = 0;
        }
    }

    public final void LJJIJ(Map<Integer, Integer> map) {
        boolean z;
        String idStr;
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        Integer num;
        boolean z2 = this.LLLL;
        if (map != null && (num = map.get(5)) != null && num.intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z2 != z) {
            this.LLLL = z;
            List<InterfaceC21213517zx> list = this.LLLJ;
            if (list != null) {
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC21213517zx) it2.next()).onAudiencePermissionChanged(this.LLLL);
                }
            }
            try {
                SettingsManager.LIZLLL().getClass();
                if (!SettingsManager.LIZ("ec_anchor_or_moderator_permission_check_enable", true)) {
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (LJJIIZ()) {
                AnonymousClass0956 anonymousClass0956 = this.LLLIIL;
                if (anonymousClass0956 != null && true == anonymousClass0956.isActive()) {
                    return;
                }
                IIconSlot.SlotViewModel slotViewModel = this.LLJ;
                if (slotViewModel != null && (mutableLiveData2 = slotViewModel.LLJJJJ) != null) {
                    mutableLiveData2.setValue(Boolean.FALSE);
                }
                this.LLLIIL = C23250099c.LIZLLL(this.LLLIIIL, null, null, new C1741870vQf(this, null), 3);
                return;
            }
            AnonymousClass0956 anonymousClass09562 = this.LLLIIL;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
            IIconSlot.SlotViewModel slotViewModel2 = this.LLJ;
            if (slotViewModel2 != null && (mutableLiveData = slotViewModel2.LLJJJJ) != null) {
                mutableLiveData.setValue(Boolean.TRUE);
            }
            Room room = this.LLJILJIL;
            if (room != null && (idStr = room.getIdStr()) != null) {
                C212343187x.LIZ.remove(idStr);
            }
        }
    }

    public final void LJJIJLIJ(int i) {
        boolean z;
        Map<EnumC742820TBw, MutableLiveData<Object>> map;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLLFF != z) {
            this.LLLFF = z;
            IIconSlot.SlotViewModel slotViewModel = this.LLJ;
            if (slotViewModel != null && (map = slotViewModel.LLJJIJIIJIL) != null) {
                LiveData liveData = (LiveData) ((ConcurrentHashMap) map).get(EnumC742820TBw.LIVE_ROOM_EC_LIVE_STATUS);
                if (liveData != null) {
                    liveData.postValue(Boolean.valueOf(this.LLLFF));
                }
            }
        }
    }

    public final void LJJIL(int i) throws JSONException {
        EnumC21192817wc enumC21192817wc;
        String idStr;
        if (i > 0) {
            enumC21192817wc = EnumC21192817wc.PRODUCT_NUM_GREATER_THAN_ZERO;
        } else {
            enumC21192817wc = EnumC21192817wc.PRODUCT_NUM_NOT_GREATER_THAN_ZERO;
        }
        Room room = this.LLJILJIL;
        if (room != null) {
            idStr = room.getIdStr();
        } else {
            idStr = null;
        }
        C21196417xC.LIZ(enumC21192817wc, idStr, null, null, null, this.LLLIIII, null, null, 220);
        LJJJJIZL(i);
        this.LLLLIILLL = 0;
        int i2 = C21197617xO.LIZ;
        C21197617xO.LIZ = this.LLLLIILL;
        LJJJJJL(true, EnumC598510Ndh.MESSAGE_REFRESH);
        LJJIJLIJ(i);
        if (LiveShopAddPermissionBusinessSetting.INSTANCE.isEnabled()) {
            LJJJ(this.LLLLIILL);
        }
    }

    public final void LJJIZ(boolean z) {
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<String> mutableLiveData2;
        IIconSlot.SlotViewModel slotViewModel;
        MutableLiveData<String> mutableLiveData3;
        IIconSlot.SlotViewModel slotViewModel2;
        MutableLiveData<Drawable> mutableLiveData4;
        IIconSlot.SlotViewModel slotViewModel3;
        MutableLiveData<Drawable> mutableLiveData5;
        IIconSlot.SlotViewModel slotViewModel4 = this.LLJ;
        if (slotViewModel4 != null) {
            Integer num = slotViewModel4.LLJZ;
            slotViewModel4.LLJLILLLLZIIL = null;
            slotViewModel4.LLJLL = null;
            slotViewModel4.LLJLLL = null;
            slotViewModel4.LLJZ = 0;
            if (num != null) {
                if (num.intValue() == 3) {
                    C1440005kM.LIZ(new IEvent() { // from class: X.17yH
                        @Override // com.ss.android.ugc.governance.eventbus.IEvent
                        public final /* synthetic */ IEvent post() {
                            C1440005kM.LIZ(this);
                            return this;
                        }

                        @Override // com.ss.android.ugc.governance.eventbus.IEvent
                        public final /* synthetic */ IEvent postSticky() {
                            C1440005kM.LIZIZ(this);
                            return this;
                        }
                    });
                    if (C21206517yp.LIZJ() && (slotViewModel3 = this.LLJ) != null && (mutableLiveData5 = slotViewModel3.LLJI) != null) {
                        mutableLiveData5.setValue(LJJI(C800330VaR.LIZIZ(this.LLIZLLLIL, R.drawable.bmp)));
                        return;
                    }
                    return;
                }
                if (num.intValue() == 4) {
                    if (!C21206517yp.LIZJ() || (slotViewModel2 = this.LLJ) == null || (mutableLiveData4 = slotViewModel2.LLJI) == null) {
                        return;
                    }
                    mutableLiveData4.setValue(LJJI(C800330VaR.LIZIZ(this.LLIZLLLIL, R.drawable.bmo)));
                    return;
                }
                if (num.intValue() == 5) {
                    C21212917zr c21212917zrLJJIJIIJIL = LJJIJIIJIL();
                    if (c21212917zrLJJIJIIJIL == null) {
                        return;
                    }
                    if (z) {
                        AnonymousClass1800 anonymousClass1800LIZIZ = c21212917zrLJJIJIIJIL.LIZIZ();
                        if (anonymousClass1800LIZIZ == null) {
                            return;
                        }
                        anonymousClass1800LIZIZ.destroy();
                        return;
                    }
                    AnonymousClass1800 anonymousClass1800LIZIZ2 = c21212917zrLJJIJIIJIL.LIZIZ();
                    if (anonymousClass1800LIZIZ2 == null) {
                        return;
                    }
                    anonymousClass1800LIZIZ2.LIZJ();
                    return;
                }
                if (num.intValue() != 7 && num.intValue() != 6) {
                    if (num.intValue() != 8 || (slotViewModel = this.LLJ) == null || (mutableLiveData3 = slotViewModel.LLILZLL) == null) {
                        return;
                    }
                    C21213117zt c21213117zt = C21213117zt.LIZ;
                    int i = this.LLLLIILL;
                    c21213117zt.getClass();
                    mutableLiveData3.setValue(C21213117zt.LIZLLL(i));
                    return;
                }
                IIconSlot.SlotViewModel slotViewModel5 = this.LLJ;
                if (slotViewModel5 != null && (mutableLiveData2 = slotViewModel5.LLILZLL) != null) {
                    C21213117zt c21213117zt2 = C21213117zt.LIZ;
                    int i2 = this.LLLLIILL;
                    c21213117zt2.getClass();
                    mutableLiveData2.setValue(C21213117zt.LIZLLL(i2));
                }
                IIconSlot.SlotViewModel slotViewModel6 = this.LLJ;
                if (slotViewModel6 != null && (mutableLiveData = slotViewModel6.LLJJJJLIIL) != null) {
                    mutableLiveData.setValue(Boolean.FALSE);
                }
                C21212917zr c21212917zrLJJIJIIJIL2 = LJJIJIIJIL();
                if (c21212917zrLJJIJIIJIL2 == null) {
                    return;
                }
                AnonymousClass1800 anonymousClass1800LIZIZ3 = c21212917zrLJJIJIIJIL2.LIZIZ();
                if (anonymousClass1800LIZIZ3 != null) {
                    anonymousClass1800LIZIZ3.LIZIZ();
                }
                c21212917zrLJJIJIIJIL2.LIZJ();
                if (z) {
                    return;
                }
                c21212917zrLJJIJIIJIL2.LIZLLL("after_anim", null, true);
            }
        }
    }

    public final void LJJJ(int i) {
        boolean zBooleanValue;
        MutableLiveData<Boolean> mutableLiveData;
        Boolean value;
        InterfaceC1892740zM0 interfaceC1892740zM0 = this.LLLJIL;
        if (interfaceC1892740zM0 != null) {
            EnumC756810TmR enumC756810TmR = EnumC756810TmR.SLOT_LIVE_WATCHER_TOOLBAR;
            IIconSlot.SlotViewModel slotViewModel = this.LLJ;
            if (slotViewModel != null && (mutableLiveData = slotViewModel.LLILZ) != null && (value = mutableLiveData.getValue()) != null) {
                zBooleanValue = value.booleanValue();
            } else {
                zBooleanValue = false;
            }
            interfaceC1892740zM0.LIZ(new C1892750zM1("ec_shop", enumC756810TmR, zBooleanValue, i, this.LLLIIIIL));
        }
    }

    public final void LJJJIL(boolean z) throws JSONException {
        Long lValueOf;
        String str;
        if (!this.LLLFZ) {
            Room room = this.LLJILJIL;
            String string = null;
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            } else {
                lValueOf = null;
            }
            boolean z2 = this.LLLI;
            boolean z3 = this.LLLII;
            EnumC21192817wc enumC21192817wc = EnumC21192817wc.PREPARE_TO_SHOW;
            if (lValueOf != null) {
                string = lValueOf.toString();
            }
            C21196417xC.LIZ(enumC21192817wc, string, Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z), false, null, null, 192);
            C21196317xB.LIZ.getClass();
            if (C21196317xB.LIZ(lValueOf)) {
                C21196317xB.LJI = true;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - C21194817ww.LJIIIZ;
            kotlin.Pair[] pairArr = new kotlin.Pair[10];
            pairArr[0] = new kotlin.Pair("EVENT_ORIGIN_FEATURE", "TEMAI");
            pairArr[1] = new kotlin.Pair("anchor_show_type", "live_cart_tag");
            pairArr[2] = new kotlin.Pair("entrance_form", "live_cart");
            pairArr[3] = new kotlin.Pair("page_name", "live");
            pairArr[4] = new kotlin.Pair(Scene.SCENE_SERVICE, "bag");
            pairArr[5] = new kotlin.Pair("duration", Long.valueOf(jCurrentTimeMillis));
            pairArr[6] = new kotlin.Pair("user_type", C21196317xB.LJIIIIZZ);
            if (z) {
                str = "im";
            } else {
                str = "api";
            }
            pairArr[7] = new kotlin.Pair("source", str);
            pairArr[8] = new kotlin.Pair("is_page_visible", Integer.valueOf(z2 ? 1 : 0));
            pairArr[9] = new kotlin.Pair("has_ec_perm", Integer.valueOf(z3 ? 1 : 0));
            C1421105hJ.LIZLLL("rd_tiktokec_entrance_preshow", pairArr);
            this.LLLFZ = true;
        }
    }

    public final void LJJJJ(boolean z) {
        Long lValueOf;
        String str;
        if (!this.LLLFFI) {
            this.LLLLII.LJII(System.currentTimeMillis(), "first_show_shop_bag_icon_time");
            Room room = this.LLJILJIL;
            String string = null;
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            } else {
                lValueOf = null;
            }
            boolean z2 = this.LLLI;
            boolean z3 = this.LLLII;
            EnumC21192817wc enumC21192817wc = EnumC21192817wc.ON_SLOT_CREATED;
            if (lValueOf != null) {
                string = lValueOf.toString();
            }
            C21196417xC.LIZ(enumC21192817wc, string, Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z), false, null, null, 192);
            C21196317xB.LIZ.getClass();
            if (C21196317xB.LIZ(lValueOf)) {
                C21196317xB.LJFF = true;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - C21194817ww.LJIIIZ;
            kotlin.Pair[] pairArr = new kotlin.Pair[10];
            pairArr[0] = new kotlin.Pair("EVENT_ORIGIN_FEATURE", "TEMAI");
            pairArr[1] = new kotlin.Pair("anchor_show_type", "live_cart_tag");
            pairArr[2] = new kotlin.Pair("entrance_form", "live_cart");
            pairArr[3] = new kotlin.Pair("page_name", "live");
            pairArr[4] = new kotlin.Pair(Scene.SCENE_SERVICE, "bag");
            pairArr[5] = new kotlin.Pair("duration", Long.valueOf(jCurrentTimeMillis));
            pairArr[6] = new kotlin.Pair("user_type", C21196317xB.LJIIIIZZ);
            if (z) {
                str = "im";
            } else {
                str = "api";
            }
            pairArr[7] = new kotlin.Pair("source", str);
            pairArr[8] = new kotlin.Pair("is_page_visible", Integer.valueOf(z2 ? 1 : 0));
            pairArr[9] = new kotlin.Pair("has_ec_perm", Integer.valueOf(z3 ? 1 : 0));
            C1421105hJ.LIZLLL("rd_tiktokec_entrance_show", pairArr);
            this.LLLFFI = true;
        }
    }

    public final void LJJJJI(boolean z) {
        EnumC21192817wc enumC21192817wc;
        String idStr;
        InterfaceC1012330cRz interfaceC1012330cRzF4;
        WeakReference<Context> weakReference;
        if (z) {
            enumC21192817wc = EnumC21192817wc.NOTIFY_SHOW;
        } else {
            enumC21192817wc = EnumC21192817wc.NOTIFY_HIDE;
        }
        Room room = this.LLJILJIL;
        Long lValueOf = null;
        if (room != null) {
            idStr = room.getIdStr();
        } else {
            idStr = null;
        }
        C21196417xC.LIZ(enumC21192817wc, idStr, null, null, null, this.LLLIIII, null, null, 220);
        IIconSlot.SlotViewModel slotViewModel = this.LLJ;
        if (slotViewModel != null) {
            C21207817z2.LIZJ(slotViewModel, z);
        }
        C21212917zr c21212917zrLJJIJIIJIL = LJJIJIIJIL();
        if (c21212917zrLJJIJIIJIL != null) {
            Context context = this.LLIZLLLIL;
            c21212917zrLJJIJIIJIL.LJIIJJI = z;
            if (context != null) {
                weakReference = new WeakReference<>(context);
            } else {
                weakReference = null;
            }
            c21212917zrLJJIJIIJIL.LJIIZILJ = weakReference;
            if (z) {
                c21212917zrLJJIJIIJIL.LIZ();
            } else {
                AnonymousClass1800 anonymousClass1800 = c21212917zrLJJIJIIJIL.LJJII;
                if (anonymousClass1800 != null) {
                    anonymousClass1800.LIZ();
                }
            }
        }
        C1440005kM.LIZ(new C21203017yG(z));
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (interfaceC1012330cRzF4 = iLiveOuterService.F4()) != null) {
            Room room2 = this.LLJILJIL;
            if (room2 != null) {
                lValueOf = Long.valueOf(room2.getId());
            }
            interfaceC1012330cRzF4.LJ(lValueOf, z);
        }
    }

    public final void LJJJJIZL(int i) {
        this.LLLLIILL = i;
        List<InterfaceC21213517zx> list = this.LLLJ;
        if (list != null) {
            Iterator<InterfaceC21213517zx> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().onProductNumChange(i);
            }
        }
    }

    public final void LJJJJJ(int i) {
        IIconSlot.SlotViewModel slotViewModel;
        MutableLiveData<String> mutableLiveData;
        String strValueOf;
        AnonymousClass1800 anonymousClass1800;
        C21212917zr c21212917zrLJJIJIIJIL = LJJIJIIJIL();
        if ((c21212917zrLJJIJIIJIL == null || ((c21212917zrLJJIJIIJIL.LJIL == null || c21212917zrLJJIJIIJIL.LIZJ != 1) && ((anonymousClass1800 = c21212917zrLJJIJIIJIL.LJJII) == null || !anonymousClass1800.isShowing()))) && (slotViewModel = this.LLJ) != null && (mutableLiveData = slotViewModel.LLILZLL) != null) {
            if (C0C64.LJIILLIIL().LJIJ(31744, 1, "ec_shop_bag_icon_product_num_visible", true) != 0 && i > 0) {
                if (i >= 100) {
                    strValueOf = "99+";
                } else {
                    strValueOf = String.valueOf(i);
                }
            } else {
                strValueOf = "";
            }
            mutableLiveData.postValue(strValueOf);
        }
        C21212917zr c21212917zrLJJIJIIJIL2 = LJJIJIIJIL();
        if (c21212917zrLJJIJIIJIL2 != null) {
            c21212917zrLJJIJIIJIL2.LJIJ = i;
        }
        if (LiveShopAddPermissionBusinessSetting.INSTANCE.isEnabled()) {
            LJJJ(i);
        }
    }

    @C14EU
    public final void ecSeaPdpAdaptionHeight(C1756750vof c1756750vof) {
        IIconSlot.SlotViewModel slotViewModel;
        MutableLiveData<Float> mutableLiveData;
        MutableLiveData<Float> mutableLiveData2;
        if (c1756750vof instanceof C1756730vod) {
            IIconSlot.SlotViewModel slotViewModel2 = this.LLJ;
            if (slotViewModel2 != null && (mutableLiveData2 = slotViewModel2.LLJL) != null) {
                mutableLiveData2.setValue(Float.valueOf(c1756750vof.LIZ));
                return;
            }
            return;
        }
        if (!(c1756750vof instanceof C1756740voe) || (slotViewModel = this.LLJ) == null || (mutableLiveData = slotViewModel.LLJL) == null) {
            return;
        }
        mutableLiveData.setValue(Float.valueOf(c1756750vof.LIZ));
    }

    @C14EU
    public final void onCheckVisible(C033Z c033z) {
        MutableLiveData<Boolean> mutableLiveData;
        FragmentManager supportFragmentManager;
        SparkContext sparkContext;
        String strLJIJI;
        IIconSlot.SlotViewModel slotViewModel = this.LLJ;
        boolean z = false;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LLILZ) != null && Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE)) {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LLIZLLLIL);
            if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                if (supportFragmentManager.LJJJJZI("pdp_fragment") == null) {
                    Iterator<Fragment> it2 = supportFragmentManager.LJJLIIIJL().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Fragment next = it2.next();
                        Fragment fragment = next;
                        if ((fragment instanceof SparkPopup) && fragment != null && (sparkContext = ((SparkPopup) fragment).LLJIJIL) != null && (strLJIJI = sparkContext.LJIJI()) != null && a0.LJJIIZI(strLJIJI, "fe_tiktok_ecommerce_live_room_shop_bag", false)) {
                            if (next != null) {
                            }
                        }
                    }
                } else {
                    z = true;
                }
            }
            c033z.LIZ.invoke(Boolean.valueOf(!z));
            return;
        }
        c033z.LIZ.invoke(Boolean.FALSE);
    }

    @Override // X.AbstractC21213417zw, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C622680Oba.LIZJ(this);
        C21212917zr c21212917zrLJJIJIIJIL = LJJIJIIJIL();
        if (c21212917zrLJJIJIIJIL != null) {
            c21212917zrLJJIJIIJIL.LJIIL = true;
            c21212917zrLJJIJIIJIL.LIZ();
        }
        Iterator it2 = ((ArrayList) this.LLLJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC21213517zx) it2.next()).onCreate(bundle);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onExposure(String str) {
        String idStr;
        EnumC21192817wc enumC21192817wc = EnumC21192817wc.ON_EXPOSURE;
        Room room = this.LLJILJIL;
        if (room != null) {
            idStr = room.getIdStr();
        } else {
            idStr = null;
        }
        C21196417xC.LIZ(enumC21192817wc, idStr, null, null, null, this.LLLIIII, null, null, 220);
        Iterator it2 = ((ArrayList) this.LLLJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC21213517zx) it2.next()).onExposure(str);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onMessage(IMessage iMessage) throws JSONException {
        Long lValueOf;
        EnumC21196517xD enumC21196517xD;
        String str;
        long jIntValue;
        boolean zLJFF;
        boolean zLIZ;
        IECHalfSearchAbility iECHalfSearchAbility;
        Long lValueOf2;
        int i;
        MutableLiveData<Boolean> mutableLiveData;
        Room room = this.LLJILJIL;
        Long lValueOf3 = null;
        String idStr = null;
        Integer numValueOf = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        String strValueOf = String.valueOf(lValueOf);
        if (iMessage != null) {
            Iterator<WeakReference<InterfaceC1741780vQW>> it2 = C1514860pWW.LIZ.iterator();
            while (it2.hasNext()) {
                InterfaceC1741780vQW interfaceC1741780vQW = it2.next().get();
                if (interfaceC1741780vQW != null && interfaceC1741780vQW.LIZ(iMessage)) {
                    interfaceC1741780vQW.onMessage(iMessage);
                }
            }
            C21182917v1.LIZJ(strValueOf, 2, iMessage);
        }
        long j = 0;
        if (iMessage instanceof ECommerceMessage) {
            ECommerceMessage eCommerceMessage = (ECommerceMessage) iMessage;
            CommonMessageData commonMessageData = eCommerceMessage.baseMessage;
            if (commonMessageData != null) {
                j = commonMessageData.createTime;
            }
            this.LLLIIIIL = j;
            int i2 = eCommerceMessage.actionType;
            IIconSlot.SlotViewModel slotViewModel = this.LLJ;
            if (slotViewModel != null && (mutableLiveData = slotViewModel.LLILZ) != null) {
                zLJFF = Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE);
            } else {
                zLJFF = false;
            }
            if (!zLJFF) {
                Room room2 = this.LLJILJIL;
                if (room2 != null) {
                    lValueOf2 = Long.valueOf(room2.getId());
                } else {
                    lValueOf2 = null;
                }
                String strValueOf2 = String.valueOf(lValueOf2);
                C21196317xB.LIZ.getClass();
                String str2 = C21196317xB.LJIIIIZZ;
                if (C21197617xO.LIZJ) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 != 5) {
                                        if (i2 == 7) {
                                            i = 1008;
                                        }
                                    } else {
                                        i = 1007;
                                    }
                                } else {
                                    i = 1006;
                                }
                            } else {
                                i = 1005;
                            }
                        } else {
                            i = 1004;
                        }
                    } else {
                        i = 1003;
                    }
                    EnumC1778650wNz enumC1778650wNz = EnumC1778650wNz.SHOP_BAG_ICON;
                    Integer numValueOf2 = Integer.valueOf(i);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("room_id", strValueOf2);
                    if (str2 == null) {
                        str2 = "";
                    }
                    linkedHashMap.put("live_role", str2);
                    C05D4.LIZIZ("rd_tiktokec_shop_bag_icon_exception", enumC1778650wNz, numValueOf2, null, linkedHashMap);
                }
            }
            int i3 = eCommerceMessage.actionType;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 7) {
                        if (i3 != 8) {
                            if (i3 == 9 && C1894507bT.LIZ()) {
                                this.LLLIIII = false;
                                this.LLLII = true;
                                LJJJJL();
                                if (LJJIIZ()) {
                                    LJJIL(0);
                                    return;
                                } else {
                                    C23250099c.LIZLLL(this.LLLIIIL, null, null, new C21177217u6(this, 0, null), 3);
                                    return;
                                }
                            }
                            return;
                        }
                        if (!C1894507bT.LIZ()) {
                            return;
                        }
                        this.LLLIIII = true;
                        this.LLLII = false;
                        LJJJJIZL(0);
                        this.LLLLIILLL = 0;
                        LJJJJL();
                        LJJJJJL(false, EnumC598510Ndh.REQUEST_SCENE_DEFAULT);
                        LJJIJLIJ(0);
                        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LLIZLLLIL);
                        if (c19egLIZIZ == null || (iECHalfSearchAbility = (IECHalfSearchAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19egLIZIZ, null), IECHalfSearchAbility.class, null)) == null) {
                            return;
                        }
                        iECHalfSearchAbility.LY0();
                        return;
                    }
                    AtmosphereTagInfo atmosphereTagInfo = eCommerceMessage.atmosphereTagInfo;
                    if (atmosphereTagInfo == null) {
                        return;
                    }
                    if (LJJIIZ()) {
                        int i4 = atmosphereTagInfo.tagType;
                        if (LJJIIZ()) {
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    if (i4 != 3) {
                                        if (i4 == 4) {
                                            zLIZ = C212343187x.LIZJ(strValueOf, true);
                                        }
                                    } else {
                                        zLIZ = C212343187x.LIZLLL(strValueOf, true);
                                    }
                                } else {
                                    zLIZ = C212343187x.LIZIZ(strValueOf, true);
                                }
                            } else {
                                zLIZ = C212343187x.LIZ(strValueOf, true);
                            }
                            if (!zLIZ) {
                                return;
                            }
                        }
                        C23250099c.LIZLLL(this.LLLIIIL, null, null, new C502901xb(atmosphereTagInfo, null), 3);
                        return;
                    }
                    C23250099c.LIZLLL(this.LLLIIIL, null, null, new C503101xd(atmosphereTagInfo, null), 3);
                    return;
                }
                PopProduct popProduct = eCommerceMessage.popProduct;
                if (popProduct == null) {
                    return;
                }
                this.LLLF = String.valueOf(Long.valueOf(popProduct.productId).longValue());
                C2232408os c2232408os = C341050DYp.LIZ;
                Room room3 = this.LLJILJIL;
                if (room3 != null) {
                    idStr = room3.getIdStr();
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("show_product_id", this.LLLF);
                C341050DYp.LJII("live_view_action", idStr, linkedHashMap2);
                return;
            }
            int i5 = eCommerceMessage.liveProductNumber;
            if (LJJIIZ()) {
                LJJIL(i5);
                return;
            } else {
                C23250099c.LIZLLL(this.LLLIIIL, null, null, new C21177217u6(this, i5, null), 3);
                return;
            }
        }
        if (iMessage instanceof ECTaskRegisterMessage) {
            String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
            if (!C123100dR.LIZ(strValueOf) || !C123100dR.LIZ(currentUserID)) {
                return;
            }
            C0NSX c0nsx = EcMessageApi.LIZ;
            ECTaskRegisterMessage eCTaskRegisterMessage = (ECTaskRegisterMessage) iMessage;
            EcTaskRegisterMessageEntity ecTaskRegisterMessageEntity = eCTaskRegisterMessage.entity;
            if (ecTaskRegisterMessageEntity != null) {
                str = ecTaskRegisterMessageEntity.taskId;
            } else {
                str = null;
            }
            String strValueOf3 = String.valueOf(str);
            EcTaskRegisterMessageEntity ecTaskRegisterMessageEntity2 = eCTaskRegisterMessage.entity;
            if (ecTaskRegisterMessageEntity2 != null) {
                numValueOf = Integer.valueOf(ecTaskRegisterMessageEntity2.interval);
            }
            if (numValueOf != null) {
                jIntValue = numValueOf.intValue();
            } else {
                jIntValue = 0;
            }
            C0NSX.LIZIZ(c0nsx, strValueOf, currentUserID, strValueOf3, C13LZ.LJIIJJI(AbstractC19994813Le.Default, new C354710DvR(0L, jIntValue)) + ((long) 0), null, 16);
            return;
        }
        if (!(iMessage instanceof MemberMessage)) {
            return;
        }
        MemberMessage memberMessage = (MemberMessage) iMessage;
        int i6 = memberMessage.action;
        if (i6 != 5 && i6 != 6 && i6 != 20) {
            return;
        }
        LJJIJ(memberMessage.adminPermissions);
        C21196317xB c21196317xB = C21196317xB.LIZ;
        Room room4 = this.LLJILJIL;
        if (room4 != null) {
            lValueOf3 = Long.valueOf(room4.getId());
        }
        boolean z = this.LLLL;
        c21196317xB.getClass();
        if (C21196317xB.LIZ(lValueOf3)) {
            if (z) {
                enumC21196517xD = EnumC21196517xD.MODERATOR;
            } else {
                enumC21196517xD = EnumC21196517xD.AUDIENCE;
            }
            C21196317xB.LJIIIIZZ = enumC21196517xD.getRoleStr();
        }
        if (this.LLLLIILLL > 0) {
            return;
        }
        LJJJJJL(true, EnumC598510Ndh.MESSAGE_REFRESH);
    }

    @C14EU(sticky = true)
    public final void onPopCardChangeStatus(C591940NJo c591940NJo) {
        IIconSlot.SlotViewModel slotViewModel;
        Integer num;
        Integer num2;
        IIconSlot.SlotViewModel slotViewModel2;
        Integer num3;
        Integer num4;
        IIconSlot.SlotViewModel slotViewModel3;
        IIconSlot.SlotViewModel slotViewModel4;
        Integer num5;
        Integer num6;
        Integer num7;
        String strLIZLLL;
        IIconSlot.SlotViewModel slotViewModel5;
        IIconSlot.SlotViewModel slotViewModel6;
        Integer num8;
        Integer num9;
        int i = c591940NJo.LIZ;
        String str = null;
        LinkedHashMap linkedHashMap = null;
        switch (i) {
            case 1:
                if (c591940NJo.LIZIZ) {
                    OecInitData oecInitData = this.LLJZIJLIL;
                    if (oecInitData != null) {
                        str = oecInitData.bagAnimation;
                    }
                    LJJIIJ(1, str);
                    break;
                } else {
                    IIconSlot.SlotViewModel slotViewModel7 = this.LLJ;
                    if ((slotViewModel7 != null && (num2 = slotViewModel7.LLJZ) != null && num2.intValue() == 1) || (slotViewModel = this.LLJ) == null || slotViewModel.LLJZ == null || (slotViewModel != null && (num = slotViewModel.LLJZ) != null && num.intValue() == 0)) {
                        LJJIIZI(null);
                        break;
                    }
                }
                break;
            case 2:
                if (c591940NJo.LIZIZ) {
                    if ((C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_live_room_animation_timing_type", true) != 1 || System.currentTimeMillis() - 0 >= ((Number) this.LLLILZLLLI.getValue()).longValue()) && !C2274811E2d.LIZIZ()) {
                        C21206717yr c21206717yr = C21206717yr.LIZ;
                        C1743900vTw c1743900vTw = this.LLLLII;
                        c21206717yr.getClass();
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        String strLIZJ = c1743900vTw.LIZJ("author_id");
                        String str2 = "";
                        if (strLIZJ == null) {
                            strLIZJ = "";
                        }
                        c2344009Gk.LJIIIIZZ("author_id", strLIZJ);
                        c2344009Gk.LJIIIIZZ("EVENT_ORIGIN_FEATURE", "TEMAI");
                        String strLIZJ2 = c1743900vTw.LIZJ("room_id");
                        if (strLIZJ2 == null) {
                            strLIZJ2 = "";
                        }
                        c2344009Gk.LJIIIIZZ("room_id", strLIZJ2);
                        String strLIZJ3 = c1743900vTw.LIZJ("enter_from_merge");
                        if (strLIZJ3 == null) {
                            strLIZJ3 = "";
                        }
                        c2344009Gk.LJIIIIZZ("enter_from_merge", strLIZJ3);
                        String strLIZJ4 = c1743900vTw.LIZJ("enter_method");
                        if (strLIZJ4 == null) {
                            strLIZJ4 = "";
                        }
                        c2344009Gk.LJIIIIZZ("enter_method", strLIZJ4);
                        String strLIZJ5 = c1743900vTw.LIZJ("action_type");
                        if (strLIZJ5 == null) {
                            strLIZJ5 = "";
                        }
                        c2344009Gk.LJIIIIZZ("action_type", strLIZJ5);
                        String strLIZJ6 = c1743900vTw.LIZJ("is_ad");
                        if (strLIZJ6 != null) {
                            str2 = strLIZJ6;
                        }
                        c2344009Gk.LJIIIIZZ("is_ad", str2);
                        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                        Map<String, String> map = c2344009Gk.LIZ;
                        c1507790pL7.getClass();
                        C1507790pL7.LIZJ("livesdk_tiktokec_cart_effect_show", map);
                        C21213117zt.LIZ.getClass();
                        if (C21206517yp.LIZIZ() == 4) {
                            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
                            EcomShopBagDailyAnimModel ecomShopBagDailyAnimModel = C21201117xx.LIZ;
                            EcomShopBagDailyAnimModel ecomShopBagDailyAnimModel2 = (EcomShopBagDailyAnimModel) c0c64LJIILLIIL.LJJII(EcomShopBagDailyAnimModel.class, ecomShopBagDailyAnimModel, "ecom_cart_daily_anim_setting", true);
                            if (ecomShopBagDailyAnimModel2 != null) {
                                ecomShopBagDailyAnimModel = ecomShopBagDailyAnimModel2;
                            }
                            String str3 = ecomShopBagDailyAnimModel.animDailyBag;
                            if (str3 != null) {
                                LJJIIJ(2, str3);
                            }
                        }
                    }
                    break;
                } else {
                    IIconSlot.SlotViewModel slotViewModel8 = this.LLJ;
                    if ((slotViewModel8 != null && (num4 = slotViewModel8.LLJZ) != null && num4.intValue() == 2) || (slotViewModel2 = this.LLJ) == null || slotViewModel2.LLJZ == null || (slotViewModel2 != null && (num3 = slotViewModel2.LLJZ) != null && num3.intValue() == 0)) {
                        LJJIIZI(null);
                        break;
                    }
                }
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                if (c591940NJo.LIZIZ) {
                    if (i == 3 && (((slotViewModel5 = this.LLJ) != null && (num9 = slotViewModel5.LLJZ) != null && num9.intValue() == 1) || ((slotViewModel6 = this.LLJ) != null && (num8 = slotViewModel6.LLJZ) != null && num8.intValue() == 2))) {
                        LJJIIZI(null);
                    }
                    C21213117zt c21213117zt = C21213117zt.LIZ;
                    int i2 = c591940NJo.LIZ;
                    c21213117zt.getClass();
                    boolean zLJIIJJI = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).B4().LJIIJJI();
                    switch (i2) {
                        case 3:
                            strLIZLLL = C1309630kBV.LIZLLL(C21213117zt.LJIIIIZZ(true));
                            break;
                        case 4:
                            strLIZLLL = C1309630kBV.LIZLLL(C21213117zt.LJIIIIZZ(false));
                            break;
                        case 5:
                            strLIZLLL = C1309630kBV.LIZLLL(C21213117zt.LJ(zLJIIJJI, true));
                            break;
                        case 6:
                        case 7:
                            strLIZLLL = C1309630kBV.LIZLLL(C21213117zt.LJ(zLJIIJJI, false));
                            break;
                        case 8:
                            strLIZLLL = C1309630kBV.LIZLLL(C21213117zt.LIZIZ.getValue().getSecond());
                            break;
                    }
                    if (strLIZLLL != null) {
                        IIconSlot.SlotViewModel slotViewModel9 = this.LLJ;
                        if (slotViewModel9 != null) {
                            Context context = this.LLIZLLLIL;
                            int i3 = c591940NJo.LIZ;
                            int i4 = this.LLLLIILL;
                            if (i3 == 5 || i3 == 6 || i3 == 7) {
                                View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.bvx, null, false);
                                C16F5 c16f5 = (C16F5) viewTd.findViewById(R.id.gl_);
                                C384050F3z c384050F3z = new C384050F3z();
                                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(15));
                                c384050F3z.LIZIZ = Integer.valueOf(R.attr.bx);
                                c16f5.setBackground(c384050F3z.LIZ(context));
                                linkedHashMap = new LinkedHashMap();
                                String strLIZLLL2 = C21213117zt.LIZLLL(i4);
                                int iLIZ = C341940Daq.LIZ(34.0d);
                                int iLIZ2 = C341940Daq.LIZ(15.0d);
                                C786410Ut5.LLJJJJ(c16f5, 0);
                                c16f5.setText(strLIZLLL2);
                                viewTd.measure(View.MeasureSpec.makeMeasureSpec(iLIZ, 1073741824), View.MeasureSpec.makeMeasureSpec(iLIZ2, 1073741824));
                                viewTd.layout(0, 0, viewTd.getMeasuredWidth(), viewTd.getMeasuredHeight());
                                if (strLIZLLL2.length() <= 1) {
                                    c16f5.setMaxWidth(C341940Daq.LIZ(15.0d));
                                    c16f5.setPadding(0, C341940Daq.LIZ(0.5d), 0, 0);
                                } else {
                                    c16f5.setMaxWidth(C341940Daq.LIZ(36.0d));
                                    c16f5.setPadding(C341940Daq.LIZ(5.0d), C341940Daq.LIZ(0.5d), C341940Daq.LIZ(5.0d), 0);
                                }
                                c16f5.measure(View.MeasureSpec.makeMeasureSpec(iLIZ, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iLIZ2, Integer.MIN_VALUE));
                                c16f5.layout(viewTd.getWidth() - c16f5.getMeasuredWidth(), 0, viewTd.getWidth(), viewTd.getHeight());
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(viewTd.getWidth(), viewTd.getHeight(), Bitmap.Config.ARGB_8888);
                                viewTd.draw(new Canvas(bitmapCreateBitmap));
                                C786410Ut5.LLJJJJ(c16f5, 8);
                                if (45 != iLIZ2) {
                                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(102, 45, Bitmap.Config.ARGB_8888);
                                    Matrix matrix = new Matrix();
                                    matrix.postScale((102 * 1.0f) / iLIZ, (45 * 1.0f) / iLIZ2);
                                    new Canvas(bitmapCreateBitmap2).drawBitmap(bitmapCreateBitmap, matrix, new Paint());
                                    bitmapCreateBitmap = bitmapCreateBitmap2;
                                }
                                linkedHashMap.put("image_0", bitmapCreateBitmap);
                            }
                            slotViewModel9.LLJLLL = linkedHashMap;
                        }
                        LJJIIJ(c591940NJo.LIZ, strLIZLLL);
                    }
                    break;
                } else {
                    IIconSlot.SlotViewModel slotViewModel10 = this.LLJ;
                    if ((slotViewModel10 != null && (num7 = slotViewModel10.LLJZ) != null && num7.intValue() == i) || (slotViewModel3 = this.LLJ) == null || slotViewModel3.LLJZ == null || ((slotViewModel3 != null && (num6 = slotViewModel3.LLJZ) != null && num6.intValue() == 0) || ((slotViewModel4 = this.LLJ) != null && (num5 = slotViewModel4.LLJZ) != null && num5.intValue() == 5 && c591940NJo.LIZ == 6))) {
                        LJJIIZI(Integer.valueOf(c591940NJo.LIZ));
                        break;
                    }
                }
                break;
        }
    }

    @C14EU(sticky = true)
    public final void onShopBagTooltipChange(C2037907yb c2037907yb) {
        this.LLLIILIL.handleLiveBagIconAnimationInfos(c2037907yb.LIZ);
        EventBus.LIZLLL().LJIL(c2037907yb);
    }

    @C14EU
    public final void onShowBagList(C1726130v1H c1726130v1H) {
        Long lValueOf;
        if (c1726130v1H.LIZ) {
            String str = c1726130v1H.LIZIZ;
            Room room = this.LLJILJIL;
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            } else {
                lValueOf = null;
            }
            if (Intrinsics.LJFF(str, String.valueOf(lValueOf))) {
                LJJIJIIJI(c1726130v1H.LIZJ, c1726130v1H.LIZLLL, c1726130v1H.LJ);
            }
        }
    }

    @Override // X.InterfaceC212386189o
    public final void LJIILJJIL(LifecycleOwner lifecycleOwner, AwS146S1100000_32 awS146S1100000_32) {
        MutableLiveData<Boolean> mutableLiveData;
        if (!LiveShopAddPermissionBusinessSetting.INSTANCE.isEnabled()) {
            return;
        }
        AObserverS188S0200000_28 aObserverS188S0200000_28 = new AObserverS188S0200000_28((Object) awS146S1100000_32, (View) this, (ViewPagerBottomSheetBehavior<View>) 21);
        IIconSlot.SlotViewModel slotViewModel = this.LLJ;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LLILZ) != null) {
            mutableLiveData.observe(lifecycleOwner, aObserverS188S0200000_28);
        }
    }

    @Override // X.AbstractC21213617zy
    /* JADX INFO: renamed from: LJJIII */
    public final void LLIZ(IIconSlot.SlotViewModel slotViewModel, InterfaceC21213717zz interfaceC21213717zz) {
        String idStr;
        String idStr2;
        String idStr3;
        String string;
        boolean z;
        MutableLiveData<Boolean> mutableLiveData;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        Room room;
        AggregationData aggregationData;
        User user;
        UserAttr userAttr;
        AggregationData aggregationData2;
        User user2;
        UserAttr userAttr2;
        String str;
        InterfaceC2262081DgM interfaceC2262081DgMAuthor;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSlotCreated, roomid = ");
        Room room2 = this.LLJILJIL;
        Map<Integer, Integer> map = null;
        if (room2 != null) {
            idStr = room2.getIdStr();
        } else {
            idStr = null;
        }
        sbLIZ.append(idStr);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        super.LLIZ(slotViewModel, interfaceC21213717zz);
        Iterator it2 = ((ArrayList) this.LLLJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC21213517zx) it2.next()).onSlotCreated(slotViewModel, interfaceC21213717zz);
        }
        C2232408os c2232408os = C341050DYp.LIZ;
        Room room3 = this.LLJILJIL;
        if (room3 != null) {
            idStr2 = room3.getIdStr();
        } else {
            idStr2 = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Room room4 = this.LLJILJIL;
        String str2 = "";
        if (room4 == null || (idStr3 = room4.getIdStr()) == null) {
            idStr3 = "";
        }
        linkedHashMap.put("room_id", idStr3);
        Room room5 = this.LLJILJIL;
        if (room5 == null || (interfaceC2262081DgMAuthor = room5.author()) == null || (string = Long.valueOf(interfaceC2262081DgMAuthor.getId()).toString()) == null) {
            string = "";
        }
        linkedHashMap.put("author_id", string);
        linkedHashMap.put("timestamp", Integer.valueOf((int) (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT))));
        String str3 = this.LLJJI;
        if (str3 != null) {
            str2 = str3;
        }
        linkedHashMap.put("enter_from_merge", str2);
        OecInitData oecInitData = this.LLJZIJLIL;
        if (oecInitData != null && (str = oecInitData.popProductId) != null) {
            linkedHashMap.put("show_product_id", str);
        }
        C341050DYp.LJII("live_view_action", idStr2, linkedHashMap);
        C1756030vnV.LIZ(this);
        ((C1739460vMm) C1125004ae.LIZ.getValue()).LL = true;
        LifecycleOwner lifecycleOwner = interfaceC21213717zz.getLifecycleOwner();
        if (lifecycleOwner != null) {
            this.LLJIJIL = new WeakReference<>(lifecycleOwner);
            slotViewModel.LLILLJJLI.observe(lifecycleOwner, new AObserverS234S0100000_32(this, 43));
            slotViewModel.LLILLL.observe(lifecycleOwner, new AObserverS234S0100000_32(this, 44));
        }
        C21212917zr c21212917zrLJJIJIIJIL = LJJIJIIJIL();
        if (c21212917zrLJJIJIIJIL != null) {
            c21212917zrLJJIJIIJIL.LJIJI = new AwS576S0100000_32(interfaceC21213717zz, 829);
        }
        C21212917zr c21212917zrLJJIJIIJIL2 = LJJIJIIJIL();
        if (c21212917zrLJJIJIIJIL2 != null) {
            c21212917zrLJJIJIIJIL2.LJIJJ = new AwS576S0100000_32(interfaceC21213717zz, 830);
        }
        C180E c180e = this.LLLLIIIILLL;
        AwS433S0200000_32 awS433S0200000_32 = new AwS433S0200000_32(this, slotViewModel, 82);
        AwS398S0200000_32 awS398S0200000_32 = new AwS398S0200000_32(this, interfaceC21213717zz, 104);
        c180e.getClass();
        if (!C20595415iS.LIZIZ() && !C20595415iS.LIZJ()) {
            z = false;
        } else {
            z = true;
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_anr_opt_accurate", true) != 0 && z) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C332901Qx(null, awS433S0200000_32, awS398S0200000_32), 2);
        } else {
            awS398S0200000_32.invoke(awS433S0200000_32.invoke());
        }
        if (LiveShopAddPermissionBusinessSetting.INSTANCE.isEnabled() && (room = this.LLJILJIL) != null && (aggregationData = room.aggregationData) != null && (user = aggregationData.audience) != null && (userAttr = user.getUserAttr()) != null && userAttr.adminPermissions != null) {
            Room room6 = this.LLJILJIL;
            if (room6 != null && (aggregationData2 = room6.aggregationData) != null && (user2 = aggregationData2.audience) != null && (userAttr2 = user2.getUserAttr()) != null) {
                map = userAttr2.adminPermissions;
            }
            LJJIJ(map);
        }
        LifecycleOwner lifecycleOwner2 = interfaceC21213717zz.getLifecycleOwner();
        if (lifecycleOwner2 != null) {
            WeakReference<LifecycleOwner> weakReference = this.LLJIJIL;
            if (weakReference == null || weakReference.get() == null) {
                this.LLJIJIL = new WeakReference<>(lifecycleOwner2);
            }
            ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
            if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null) {
                interfaceC20673515v3K4.cb(lifecycleOwner2, new AwS611S0100000_32(this, 377));
            }
            IIconSlot.SlotViewModel slotViewModel2 = this.LLJ;
            if (slotViewModel2 != null && (mutableLiveData = slotViewModel2.LLILZ) != null) {
                mutableLiveData.observe(lifecycleOwner2, new AObserverS234S0100000_32(this, 45));
            }
        }
    }

    public final void LJJJJJL(boolean z, EnumC598510Ndh enumC598510Ndh) throws JSONException {
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        Long lValueOf4;
        C21208517z9 c21208517z9;
        String str;
        Map map;
        C21208517z9 c21208517z92;
        MutableLiveData<Boolean> mutableLiveData;
        Long lValueOf5 = null;
        if (this.LLLLIILL <= 0 && !LJJIIZ() && !this.LLLIIII) {
            LJJJJI(false);
            LJJIIZI(null);
            return;
        }
        LJJJJJ(this.LLLLIILL);
        IIconSlot.SlotViewModel slotViewModel = this.LLJ;
        if (slotViewModel == null || (mutableLiveData = slotViewModel.LLILZ) == null || !Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE)) {
            LJJJJI(true);
            Map mapLIZ = C7936038c.LIZ("c3091.d84820", C520170Kad.LIZ(this.LLIZLLLIL));
            C1743900vTw c1743900vTw = this.LLLLII;
            Room room = this.LLJILJIL;
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            } else {
                lValueOf = null;
            }
            String strValueOf = String.valueOf(lValueOf);
            Boolean bool = this.LLJILJILJ;
            Map<String, String> map2 = this.LLJILLL;
            HashMap map3 = new HashMap();
            C314900CWa<Map<String, String>> c314900CWa = this.LLJJ;
            if (c314900CWa != null && (map = (Map) C314900CWa.LIZ(c314900CWa)) != null) {
                map3.putAll(map);
                map3.put("refer", "icon");
                map3.put("label", "user_othershow");
            }
            C21206717yr.LJFF(c1743900vTw, bool, strValueOf, map2, map3, mapLIZ);
            Room room2 = this.LLJILJIL;
            if (room2 != null) {
                lValueOf2 = Long.valueOf(room2.getId());
            } else {
                lValueOf2 = null;
            }
            C21196417xC.LIZIZ(lValueOf2, true, this.LLLII);
            LJJJIL(true);
            LJJJJ(true);
            OecInitData oecInitData = this.LLJZIJLIL;
            if (oecInitData == null || (str = oecInitData.bagAnimation) == null || str.length() == 0) {
                C21213217zu c21213217zu = C21213217zu.LIZ;
                Room room3 = this.LLJILJIL;
                if (room3 != null) {
                    lValueOf3 = Long.valueOf(room3.getId());
                } else {
                    lValueOf3 = null;
                }
                C21213017zs c21213017zsLIZ = c21213217zu.LIZ(lValueOf3);
                if (c21213017zsLIZ != null) {
                    Room room4 = this.LLJILJIL;
                    if (room4 != null) {
                        lValueOf4 = Long.valueOf(room4.getId());
                    } else {
                        lValueOf4 = null;
                    }
                    Room room5 = this.LLJILJIL;
                    if (room5 != null) {
                        lValueOf5 = Long.valueOf(room5.getOwnerUserId());
                    }
                    C21213017zs.LIZ(c21213017zsLIZ, lValueOf4, lValueOf5, this.LLLLIILL, this.LLJLILLLLZIIL, this.LLJJI, this.LLJJIII, false, this.LLJJJ, enumC598510Ndh, 160);
                }
            }
            C1741650vQJ c1741650vQJ = this.LLLIL;
            if (c1741650vQJ != null && (c21208517z9 = c1741650vQJ.LL) != null) {
                c21208517z9.LJIILIIL();
            }
        }
        C1741650vQJ c1741650vQJ2 = this.LLLIL;
        if (c1741650vQJ2 == null || (c21208517z92 = c1741650vQJ2.LL) == null) {
            return;
        }
        c21208517z92.is1(z);
    }

    @Override // X.AbstractC21213617zy, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final /* bridge */ /* synthetic */ void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) {
        LLIZ((IIconSlot.SlotViewModel) viewModel, interfaceC21213717zz);
    }

    @Override // X.InterfaceC1740480vOQ
    public final void mG(View view, LifecycleOwner lifecycleOwner) {
        C1756050vnX.LIZ(this, view, lifecycleOwner);
    }

    @Override // X.InterfaceC1124060fMC
    public final void prepareToShow(Map<String, ? extends Object> map, InterfaceC756140TlM interfaceC756140TlM) throws JSONException {
        Room room;
        Boolean bool;
        Map map2;
        String str;
        Boolean bool2;
        Boolean bool3;
        boolean zBooleanValue;
        int i;
        Map<String, String> map3;
        String str2;
        String str3;
        boolean z;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        long jLongValue;
        long jLongValue2;
        String str9;
        String str10;
        C1743900vTw c1743900vTw;
        Room room2;
        Map map4;
        Map<String, String> map5;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        long jLongValue3;
        long jLongValue4;
        String string;
        Lifecycle lifecycle;
        int i2;
        LifecycleOwner lifecycleOwner;
        Map map6;
        long j;
        long j2;
        long j3;
        String str19;
        String str20;
        String str21;
        String str22;
        int iIntValue;
        boolean z2;
        Integer num;
        Long lValueOf;
        Long lValueOf2;
        String str23;
        String requestId;
        User owner;
        FollowInfo followInfo;
        String str24;
        C1743900vTw c1743900vTw2;
        Long l;
        Long l2;
        Integer num2;
        Integer num3;
        Boolean bool4;
        Boolean bool5;
        String strOptString;
        JSONObject jSONObject;
        Long l3;
        Long l4;
        CommerceStruct commerceStruct;
        String str25;
        Map<String, String> map7;
        Object obj = map.get("param_room");
        if (obj instanceof Room) {
            room = (Room) obj;
        } else {
            room = null;
        }
        this.LLJILJIL = room;
        Object obj2 = map.get("param_enter_from_effect_ad_bool");
        if (obj2 instanceof Boolean) {
            bool = (Boolean) obj2;
        } else {
            bool = null;
        }
        this.LLJILJILJ = bool;
        Object obj3 = map.get("param_effect_ad_extra");
        if (C19719512Dh.LJII(obj3)) {
            map2 = (Map) obj3;
        } else {
            map2 = null;
        }
        this.LLJILLL = map2;
        if (map2 != null) {
            Object obj4 = map.get("param_effect_ad_id");
            if (!(obj4 instanceof String) || obj4 == null) {
                obj4 = "";
            }
            map2.put("ad_id", obj4);
        }
        Map<String, String> map8 = this.LLJILLL;
        if (map8 != null && (str25 = map8.get("creative_id")) != null && (map7 = this.LLJILLL) != null) {
            map7.put("value", str25);
        }
        Map<String, String> map9 = this.LLJILLL;
        if (map9 != null) {
            this.LLLLII.LJIIIZ("effect_ad_extra", map9);
        }
        Object obj5 = map.get("param_extra_auto_route_schema");
        if (!(obj5 instanceof String) || (str = (String) obj5) == null) {
            str = "";
        }
        this.LLJJJJJIL = str;
        Object obj6 = map.get("param_enter_room_from_click_product_card");
        if (!(obj6 instanceof Boolean) || (bool2 = (Boolean) obj6) == null) {
            bool2 = Boolean.FALSE;
        }
        this.LLJJJJLIIL = bool2;
        Object obj7 = map.get("param_enter_room_has_shown_ec_preview_card");
        if (obj7 instanceof Boolean) {
            bool3 = (Boolean) obj7;
        } else {
            bool3 = null;
        }
        if (bool3 != null) {
            zBooleanValue = bool3.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLJJIII = zBooleanValue;
        Object obj8 = map.get("param_extra_opt_auto_route_schema_routing_timing");
        if (!(obj8 instanceof Integer) || (i = (Integer) obj8) == null) {
            i = 0;
        }
        this.LLJJL = i;
        Object obj9 = map.get("param_extra_ec_common_extra_param");
        if (C19719512Dh.LJII(obj9)) {
            map3 = (Map) obj9;
        } else {
            map3 = null;
        }
        this.LLJJLIIIJLLLLLLLZ = map3;
        this.LLLLII.LJIIIZ("param_extra_ec_common_extra_param", map3);
        Object obj10 = map.get("param_search_id");
        if (!(obj10 instanceof String) || (str2 = (String) obj10) == null) {
            str2 = "";
        }
        this.LLJL = str2;
        Object obj11 = map.get("param_search_result_id");
        if (!(obj11 instanceof String) || (str3 = (String) obj11) == null) {
            str3 = "";
        }
        this.LLJLIL = str3;
        this.LLLLII.LJIIIIZZ("param_search_result_id", str3, false);
        LJJJI("param_search_is_inner", "is_inner", map);
        LJJJI("param_inner_search_id", "inner_search_id", map);
        LJJJI("param_rank_inner", "rank_inner", map);
        LJJJI("param_is_slide", "is_slide", map);
        LJJJI("param_slide_rank", "slide_rank", map);
        if (!TextUtils.isEmpty(this.LLJLIL)) {
            C1766860w4y c1766860w4y = C1766860w4y.LIZ;
            String str26 = this.LLJLIL;
            if (str26 == null) {
                str26 = "";
            }
            C1766860w4y.LJIIL(c1766860w4y, "search_result_id", str26, "b4180");
        }
        Room room3 = this.LLJILJIL;
        if (room3 != null && (commerceStruct = room3.getCommerceStruct()) != null && commerceStruct.commercePermission == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LLLII = z;
        C314900CWa<Map<String, String>> c314900CWa = new C314900CWa<>(new AwS576S0100000_32(this, 831));
        synchronized (c314900CWa) {
            try {
                if (c314900CWa.LIZIZ == null) {
                    c314900CWa.LIZIZ = C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C0CWZ(c314900CWa, null), 2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LLJJ = c314900CWa;
        Object obj12 = map.get("param_live_enter_from_merge");
        if (obj12 instanceof String) {
            str4 = (String) obj12;
        } else {
            str4 = null;
        }
        this.LLJJI = str4;
        Object obj13 = map.get("param_live_enter_method_merge");
        if (obj13 instanceof String) {
            str5 = (String) obj13;
        } else {
            str5 = null;
        }
        this.LLJJIJI = str5;
        Object obj14 = map.get("param_live_action_type");
        if (obj14 instanceof String) {
            str6 = (String) obj14;
        } else {
            str6 = null;
        }
        this.LLJJJ = str6;
        Object obj15 = map.get("param_live_rec_content_id");
        if (obj15 instanceof String) {
            str7 = (String) obj15;
        } else {
            str7 = null;
        }
        this.LLJJJIL = str7;
        Object obj16 = map.get("param_live_rec_content_type");
        if (obj16 instanceof String) {
            str8 = (String) obj16;
        } else {
            str8 = null;
        }
        this.LLJJJJ = str8;
        Object obj17 = map.get("param_live_begin_time");
        if ((obj17 instanceof Long) && (l4 = (Long) obj17) != null) {
            jLongValue = l4.longValue();
        } else {
            jLongValue = -1;
        }
        this.LLJJIJIIJIL = jLongValue;
        Object obj18 = map.get("param_live_begin_time_real");
        if ((obj18 instanceof Long) && (l3 = (Long) obj18) != null) {
            jLongValue2 = l3.longValue();
        } else {
            jLongValue2 = -1;
        }
        this.LLJJIJIL = jLongValue2;
        HashMap map10 = (HashMap) this.LLL;
        map10.clear();
        String str27 = this.LLJJI;
        if (str27 == null) {
            str27 = "";
        }
        map10.put("enter_from_merge", str27);
        String str28 = this.LLJJIJI;
        if (str28 == null) {
            str28 = "";
        }
        map10.put("enter_method", str28);
        String str29 = this.LLJJJ;
        if (str29 == null) {
            str29 = "";
        }
        map10.put("action_type", str29);
        Object obj19 = map.get("param_live_window_mode");
        if (!(obj19 instanceof String) || obj19 == null) {
            obj19 = "";
        }
        map10.put("live_window_mode", obj19);
        Object obj20 = map.get("param_ec_recommend_info");
        if (obj20 instanceof String) {
            str9 = (String) obj20;
            if (str9 != null && str9.length() > 0) {
                this.LLLLII.LJIIIIZZ("ecom_live_rcmd_info", str9, false);
            }
        } else {
            str9 = null;
        }
        BcmParams bcmParams = new BcmParams();
        String strOptString2 = "";
        if (str9 == null || str9.length() <= 0) {
            str10 = "";
        } else {
            try {
                jSONObject = new JSONObject(str9);
                strOptString = jSONObject.optString("pontos_id");
            } catch (Exception e) {
                e = e;
                strOptString = "";
            }
            try {
                strOptString2 = jSONObject.optString("pontos_attr");
            } catch (Exception e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
            }
            str10 = strOptString2;
            strOptString2 = strOptString;
        }
        if (C123100dR.LIZ(strOptString2) && C123100dR.LIZ(str10)) {
            bcmParams.put("pontos_id", strOptString2);
            bcmParams.put("pontos_attr", str10);
        } else {
            bcmParams.put("pontos_id", "-1");
            bcmParams.put("pontos_attr", "-1");
        }
        BtmSDK.INSTANCE.setBcmPageParams(C520170Kad.LIZ(this.LLIZLLLIL), bcmParams, Boolean.FALSE);
        C21212717zp.LIZ.getClass();
        try {
            c1743900vTw = new C1743900vTw();
        } catch (IllegalArgumentException e3) {
            TryCatchGuardChecker.doCheck(e3);
            c1743900vTw = new C1743900vTw();
        }
        C21212717zp.LIZIZ = c1743900vTw;
        Object obj21 = map.get("param_room");
        if (obj21 instanceof Room) {
            room2 = (Room) obj21;
        } else {
            room2 = null;
        }
        Object obj22 = map.get("param_enter_from_effect_ad_bool");
        if (!(obj22 instanceof Boolean)) {
            obj22 = null;
        }
        Object obj23 = map.get("param_effect_ad_extra");
        if (C19719512Dh.LJII(obj23)) {
            map4 = (Map) obj23;
        } else {
            map4 = null;
        }
        String str30 = "";
        if (map4 != null) {
            Object obj24 = map.get("param_effect_ad_id");
            if (!(obj24 instanceof String) || obj24 == null) {
                obj24 = "";
            }
            map4.put("ad_id", obj24);
            Object obj25 = map4.get("creative_id");
            if (obj25 != null) {
                map4.put("value", obj25);
            }
        }
        boolean z3 = map.get("param_extra_auto_route_schema") instanceof String;
        Object obj26 = map.get("param_enter_room_from_click_product_card");
        if ((obj26 instanceof Boolean) && (bool5 = (Boolean) obj26) != null) {
            bool5.booleanValue();
        }
        Object obj27 = map.get("param_enter_room_has_shown_ec_preview_card");
        if ((obj27 instanceof Boolean) && (bool4 = (Boolean) obj27) != null) {
            bool4.booleanValue();
        }
        Object obj28 = map.get("param_extra_opt_auto_route_schema_routing_timing");
        if ((obj28 instanceof Integer) && (num3 = (Integer) obj28) != null) {
            num3.intValue();
        }
        Object obj29 = map.get("param_extra_auto_open_product_bag");
        if ((obj29 instanceof Integer) && (num2 = (Integer) obj29) != null) {
            num2.intValue();
        }
        boolean z4 = map.get("param_extra_auto_open_product_bag_params") instanceof String;
        Object obj30 = map.get("param_extra_ec_common_extra_param");
        if (C19719512Dh.LJII(obj30)) {
            map5 = (Map) obj30;
        } else {
            map5 = null;
        }
        Object obj31 = map.get("param_product_bag_page_params");
        if (!(obj31 instanceof String) || (str11 = (String) obj31) == null) {
            str11 = "{}";
        }
        C1741890vQh.LJIIJ(str11);
        C1743900vTw c1743900vTw3 = C21212717zp.LIZIZ;
        if (c1743900vTw3 != null) {
            c1743900vTw3.LJIIIZ("param_extra_ec_common_extra_param", map5);
        }
        Object obj32 = map.get("param_search_id");
        if (!(obj32 instanceof String) || (str12 = (String) obj32) == null) {
            str12 = "";
        }
        Object obj33 = map.get("param_search_result_id");
        if (!(obj33 instanceof String) || (str13 = (String) obj33) == null) {
            str13 = "";
        }
        C1743900vTw c1743900vTw4 = C21212717zp.LIZIZ;
        if (c1743900vTw4 != null) {
            c1743900vTw4.LJIIIIZZ("param_search_result_id", str13, false);
        }
        C21212717zp.LIZIZ("param_search_is_inner", "is_inner", map);
        C21212717zp.LIZIZ("param_inner_search_id", "inner_search_id", map);
        C21212717zp.LIZIZ("param_rank_inner", "rank_inner", map);
        C21212717zp.LIZIZ("param_is_slide", "is_slide", map);
        C21212717zp.LIZIZ("param_slide_rank", "slide_rank", map);
        if (!TextUtils.isEmpty(str13)) {
            C1766860w4y.LJIIL(C1766860w4y.LIZ, "search_result_id", str13, "b4180");
        }
        if (room2 != null) {
            room2.getCommerceStruct();
        }
        Object obj34 = map.get("param_live_enter_from_merge");
        if (obj34 instanceof String) {
            str14 = (String) obj34;
        } else {
            str14 = null;
        }
        Object obj35 = map.get("param_live_enter_method_merge");
        if (obj35 instanceof String) {
            str15 = (String) obj35;
        } else {
            str15 = null;
        }
        Object obj36 = map.get("param_live_action_type");
        if (obj36 instanceof String) {
            str16 = (String) obj36;
        } else {
            str16 = null;
        }
        Object obj37 = map.get("param_live_rec_content_id");
        if (obj37 instanceof String) {
            str17 = (String) obj37;
        } else {
            str17 = null;
        }
        Object obj38 = map.get("param_live_rec_content_type");
        if (obj38 instanceof String) {
            str18 = (String) obj38;
        } else {
            str18 = null;
        }
        Object obj39 = map.get("param_live_begin_time");
        if ((obj39 instanceof Long) && (l2 = (Long) obj39) != null) {
            jLongValue3 = l2.longValue();
        } else {
            jLongValue3 = -1;
        }
        Object obj40 = map.get("param_live_begin_time_real");
        if ((obj40 instanceof Long) && (l = (Long) obj40) != null) {
            jLongValue4 = l.longValue();
        } else {
            jLongValue4 = -1;
        }
        Object obj41 = map.get("param_ec_recommend_info");
        if ((obj41 instanceof String) && (str24 = (String) obj41) != null && str24.length() > 0 && (c1743900vTw2 = C21212717zp.LIZIZ) != null) {
            c1743900vTw2.LJIIIIZZ("ecom_live_rcmd_info", str24, false);
        }
        if (room2 == null || (owner = room2.getOwner()) == null || (followInfo = owner.getFollowInfo()) == null || (string = Long.valueOf(followInfo.getFollowStatus()).toString()) == null) {
            string = "-1";
        }
        C1743900vTw c1743900vTw5 = C21212717zp.LIZIZ;
        if (c1743900vTw5 != null) {
            if (room2 != null) {
                lValueOf = Long.valueOf(room2.getOwnerUserId());
            } else {
                lValueOf = null;
            }
            c1743900vTw5.LJIIIIZZ("author_id", String.valueOf(lValueOf), false);
            c1743900vTw5.LJIIIIZZ("EVENT_ORIGIN_FEATURE", "TEMAI", false);
            if (room2 != null) {
                lValueOf2 = Long.valueOf(room2.getId());
            } else {
                lValueOf2 = null;
            }
            c1743900vTw5.LJIIIIZZ("room_id", String.valueOf(lValueOf2), false);
            if (str14 == null) {
                str14 = "";
            }
            c1743900vTw5.LJIIIIZZ("enter_from_merge", str14, true);
            if (str15 == null) {
                str15 = "";
            }
            c1743900vTw5.LJIIIIZZ("enter_method", str15, false);
            if (str16 != null) {
                str30 = str16;
            }
            c1743900vTw5.LJIIIIZZ("action_type", str30, false);
            c1743900vTw5.LJIIIIZZ("page_type", "live", false);
            c1743900vTw5.LJIIIIZZ("follow_status", string, false);
            c1743900vTw5.LJIIIIZZ("page_name", "live", false);
            c1743900vTw5.LJIIIIZZ("source_page_type", "live", false);
            if (Intrinsics.LJFF(obj22, Boolean.TRUE)) {
                str23 = "1";
            } else {
                str23 = CardStruct.IStatusCode.DEFAULT;
            }
            c1743900vTw5.LJIIIIZZ("is_ad", str23, false);
            c1743900vTw5.LJIIIIZZ("rec_content_id", str17, false);
            c1743900vTw5.LJIIIIZZ("rec_content_type", str18, false);
            if (room2 != null) {
                requestId = room2.getRequestId();
            } else {
                requestId = null;
            }
            c1743900vTw5.LJIIIIZZ("request_id", requestId, true);
            c1743900vTw5.LJIIIIZZ("search_id", str12, true);
            c1743900vTw5.LJIIIIZZ("search_result_id", str13, false);
            c1743900vTw5.LJIIIIZZ("param_live_begin_time", String.valueOf(jLongValue3), false);
            c1743900vTw5.LJIIIIZZ("param_live_begin_time_real", String.valueOf(jLongValue4), false);
            if (map5 != null) {
                String str31 = map5.get("rec_params");
                if (str31 != null) {
                    c1743900vTw5.LJIIIIZZ("rec_params", str31, false);
                }
                String str32 = map5.get("source_module");
                if (str32 != null) {
                    c1743900vTw5.LJIIIIZZ("source_module", str32, false);
                }
            }
            String str33 = C21212717zp.LIZJ.get("entrance_form");
            if (str33 != null && C123100dR.LIZ(str33)) {
                c1743900vTw5.LJIIIIZZ("entrance_form", str33, false);
                c1743900vTw5.LJIIIIZZ("anchor_show_type", str33, false);
            }
        }
        if (this.LLLII) {
            Object obj42 = map.get("param_extra_auto_open_product_bag");
            if ((obj42 instanceof Integer) && (num = (Integer) obj42) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            C21212917zr c21212917zrLJJIJIIJIL = LJJIJIIJIL();
            if (c21212917zrLJJIJIIJIL != null) {
                String str34 = this.LLJJI;
                String str35 = this.LLJJIJI;
                String str36 = this.LLJJJ;
                if (!C123100dR.LIZ(this.LLJJJJJIL) && iIntValue != 1) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, 832);
                c21212917zrLJJIJIIJIL.LJI = str34;
                c21212917zrLJJIJIIJIL.LJII = str35;
                c21212917zrLJJIJIIJIL.LJIIIIZZ = str36;
                c21212917zrLJJIJIIJIL.LJIILLIIL = z2;
                c21212917zrLJJIJIIJIL.LJIJJLI = awS576S0100000_32;
            }
        }
        try {
            Object obj43 = map.get("param_live_show_time");
            if (obj43 instanceof Map) {
                map6 = (Map) obj43;
            } else {
                map6 = null;
            }
            long j4 = 0;
            if (map6 == null || (str22 = (String) map6.get("param_live_enter_room_start_time")) == null) {
                j = 0;
            } else {
                j = CastLongProtector.parseLong(str22);
            }
            this.LLJLILLLLZIIL = j;
            if (map6 == null || (str21 = (String) map6.get("param_live_enter_room_api_start_time")) == null) {
                j2 = 0;
            } else {
                j2 = CastLongProtector.parseLong(str21);
            }
            this.LLJLL = j2;
            if (map6 == null || (str20 = (String) map6.get("param_live_enter_room_api_end_time")) == null) {
                j3 = 0;
            } else {
                j3 = CastLongProtector.parseLong(str20);
            }
            this.LLJLLIL = j3;
            if (map6 != null && (str19 = (String) map6.get("param_live_slot_load_time")) != null) {
                j4 = CastLongProtector.parseLong(str19);
            }
            this.LLJLLL = j4;
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        OecInitData oecInitDataLIZ = C1733990vDx.LIZ(this.LLJILJIL);
        if (oecInitDataLIZ != null) {
            this.LLJZIJLIL = oecInitDataLIZ;
            if (LJJIIJZLJL()) {
                LJJJIL(false);
            }
        }
        if (this.LLLII) {
            ((ArrayList) this.LLLJ).add(this.LLLIILIL);
            List<InterfaceC21213517zx> list = this.LLLJ;
            Room room4 = this.LLJILJIL;
            Context context = this.LLIZLLLIL;
            InterfaceC21213717zz interfaceC21213717zz = this.LLJI;
            if (interfaceC21213717zz != null && (lifecycleOwner = interfaceC21213717zz.getLifecycleOwner()) != null) {
                lifecycle = lifecycleOwner.getLifecycle();
            } else {
                lifecycle = null;
            }
            ((ArrayList) list).add(new C1741600vQE(room4, context, lifecycle));
            C1741650vQJ c1741650vQJ = new C1741650vQJ(this.LLJLILLLLZIIL, this.LLLLII, new WeakReference(this));
            this.LLLIL = c1741650vQJ;
            ((ArrayList) this.LLLJ).add(c1741650vQJ);
            C212148180k.LLJJI.getClass();
            SeaLiveBagIconEducationBubbleSetting.LIZ.getClass();
            SeaLiveBagIconEducationBubbleSetting.SeaLiveBagIconEducationBubbleConfig seaLiveBagIconEducationBubbleConfig = (SeaLiveBagIconEducationBubbleSetting.SeaLiveBagIconEducationBubbleConfig) SeaLiveBagIconEducationBubbleSetting.LIZJ.getValue();
            if (seaLiveBagIconEducationBubbleConfig.enable) {
                try {
                    i2 = C212148180k.LLJJIII.getInt("education_bubble_shown", 0);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                    i2 = 0;
                }
                int i3 = seaLiveBagIconEducationBubbleConfig.maxTotalShowTimes;
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("canShowBubble, showTimes=");
                sbLIZ.append(i2);
                sbLIZ.append(", maxShowTimes=");
                sbLIZ.append(i3);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LIZ(strLIZIZ);
                if (i2 < i3) {
                    ((ArrayList) this.LLLJ).add(this.LLLILZJ.getValue());
                }
            }
            OecInitData oecInitData = this.LLJZIJLIL;
            if (oecInitData != null && oecInitData.isNewUserFixed && EcShopBagBubbleNoImageSetting.LIZ().enable && new C212152180o().LIZ()) {
                C212149180l.LLJJIJI = true;
                ((ArrayList) this.LLLJ).add(this.LLLILZ.getValue());
            } else {
                C212149180l.LLJJIJI = false;
            }
            Iterator it2 = ((ArrayList) this.LLLJ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC21213517zx) it2.next()).prepareToShow(map, interfaceC756140TlM);
            }
        }
        interfaceC756140TlM.LIZ(this.LLLII);
    }

    public final void LJJIJIIJI(String str, String str2, Map<String, ? extends Object> map) {
        String str3;
        Long lValueOf;
        Object obj;
        String str4;
        ShopBagIconGuidanceAnimConfigSettings.ECShopBagAnimConfig eCShopBagAnimConfig;
        Integer num;
        Map map2;
        Long lValueOf2;
        Long lValueOf3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String currentUserID = null;
        if (LJJIIZ()) {
            if (!Intrinsics.LJFF(str, "live_popup_list")) {
                C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                kotlin.Pair[] pairArr = new kotlin.Pair[5];
                pairArr[0] = new kotlin.Pair("EVENT_ORIGIN_FEATURE", "TEMAI");
                Room room = this.LLJILJIL;
                if (room != null) {
                    lValueOf2 = Long.valueOf(room.getId());
                } else {
                    lValueOf2 = null;
                }
                pairArr[1] = new kotlin.Pair("room_id", String.valueOf(lValueOf2));
                Room room2 = this.LLJILJIL;
                if (room2 != null) {
                    lValueOf3 = Long.valueOf(room2.getOwnerUserId());
                } else {
                    lValueOf3 = null;
                }
                pairArr[2] = new kotlin.Pair("author_id", String.valueOf(lValueOf3));
                IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
                if (iUserService != null) {
                    currentUserID = iUserService.getCurrentUserID();
                }
                pairArr[3] = new kotlin.Pair("moderator_id", String.valueOf(currentUserID));
                pairArr[4] = new kotlin.Pair("user_type", "moderator");
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                c1507790pL7.getClass();
                C1507790pL7.LIZJ("livesdk_tiktokec_product_icon_click", mapLJIIIIZZ);
            }
            Iterator it2 = ((ArrayList) this.LLLJ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC21213517zx) it2.next()).onClick(jCurrentTimeMillis, null, map, str);
            }
            return;
        }
        LJJIJL();
        if (Intrinsics.LJFF(str, "live_cart")) {
            Map mapLIZ = C7936038c.LIZ("c3091.d84820", C520170Kad.LIZ(this.LLIZLLLIL));
            for (Map.Entry<String, String> entry : this.LLLIILIL.getShowParams().entrySet()) {
                this.LLLLII.LJIIIIZZ(entry.getKey(), entry.getValue(), false);
            }
            C21206717yr c21206717yr = C21206717yr.LIZ;
            C1743900vTw c1743900vTw = this.LLLLII;
            Room room3 = this.LLJILJIL;
            if (room3 != null) {
                lValueOf = Long.valueOf(room3.getId());
            } else {
                lValueOf = null;
            }
            String strValueOf = String.valueOf(lValueOf);
            Boolean bool = this.LLJILJILJ;
            Map<String, String> map3 = this.LLJILLL;
            HashMap map4 = new HashMap();
            C314900CWa<Map<String, String>> c314900CWa = this.LLJJ;
            if (c314900CWa != null && (map2 = (Map) C314900CWa.LIZ(c314900CWa)) != null) {
                map4.putAll(map2);
                map4.put("refer", "icon");
                map4.put("label", "user_otherclick");
            }
            if (map != null) {
                obj = map.get("entrance_form");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str4 = (String) obj;
            } else {
                str4 = null;
            }
            c21206717yr.getClass();
            C21206717yr.LJ(c1743900vTw, strValueOf, bool, map3, map4, "icon", "shopping_list", null, mapLIZ, str4);
            C21212917zr c21212917zrLJJIJIIJIL = LJJIJIIJIL();
            if (c21212917zrLJJIJIIJIL != null && c21212917zrLJJIJIIJIL.LIZJ != 0 && (eCShopBagAnimConfig = c21212917zrLJJIJIIJIL.LIZIZ) != null && (num = eCShopBagAnimConfig.shopBagClickMaxTime) != null) {
                int iIntValue = num.intValue();
                int iLIZ = c21212917zrLJJIJIIJIL.LIZ.LIZ(c21212917zrLJJIJIIJIL.LJFF);
                if (iLIZ <= iIntValue) {
                    C19343010lw c19343010lw = c21212917zrLJJIJIIJIL.LIZ;
                    int i = iLIZ + 1;
                    String str5 = c21212917zrLJJIJIIJIL.LJFF;
                    Keva keva = c19343010lw.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("click_shop_bag_count_");
                    sbLIZ.append(str5);
                    keva.storeInt(C2188811AlT.LIZIZ(sbLIZ), i);
                }
            }
        }
        C1735100vFk.LIZ.getClass();
        C1735100vFk.LIZIZ("shop_bag", null, null, null);
        String strLIZLLL = C1739720vNC.LIZLLL(new C1741520vQ6("c3091").LIZ("d84820"), C520170Kad.LIZ(this.LLIZLLLIL));
        for (InterfaceC21213517zx interfaceC21213517zx : (ArrayList) this.LLLJ) {
            if (str2 == null) {
                str3 = strLIZLLL;
            } else {
                str3 = str2;
            }
            interfaceC21213517zx.onClick(jCurrentTimeMillis, str3, map, str);
        }
    }

    public final void LJJJI(String str, String str2, Map map) {
        String str3;
        Object obj = map.get(str2);
        if ((obj instanceof String) && (str3 = (String) obj) != null) {
            this.LLLLII.LJIIIIZZ(str, str3, true);
            C1766860w4y.LIZ.getClass();
            C1766860w4y.LJIILL(null, str2, str3, true);
        }
    }
}
