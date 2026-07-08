package X;

import Y.ALAdapterS6S0000000_32;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.LiveShopAddPermissionBusinessSetting;
import com.bytedance.android.livesdk.model.message.AtmosphereTagInfo;
import com.bytedance.android.livesdk.model.message.BillboardInfo;
import com.bytedance.android.livesdk.model.message.CampaignBannerDisplay;
import com.bytedance.android.livesdk.model.message.FlashSaleAtmosphereInfo;
import com.bytedance.android.livesdk.model.message.LivePermissionInfo;
import com.bytedance.android.livesdk.model.message.OecLiveForwardedMessage;
import com.bytedance.android.livesdk.model.message.OecLiveSmartPinMessage;
import com.bytedance.android.livesdk.model.message.OecLiveSuggestMessage;
import com.bytedance.android.livesdk.model.message.Voucher;
import com.bytedance.android.livesdk.model.message.ext.ECShortItemRefreshMessage;
import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.android.livesdk.model.message.ext.EcDrawMessage;
import com.bytedance.android.livesdk.model.message.ext.EcTaskRefreshCouponListMessage;
import com.bytedance.android.livesdk.model.message.ext.PopProduct;
import com.bytedance.android.livesdk.model.message.ext.ShortItemRefreshEntity;
import com.bytedance.android.livesdk.tunnel.BroadcastTunnelVM;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.CreatorProductListLynxConfigSettings;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.settings.EcAnchorLiveStartApiRequestConfigSettings;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.settings.ECBroadcastShoppingIconSetting;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.settings.AnchorLiveBagListOptConfig;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.180M, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C180M extends AnonymousClass1802<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> implements InterfaceC756370Tlj, InterfaceC1141530foN {
    public final Context LLILZ;
    public IIconSlot.SlotViewModel LLILZIL;
    public InterfaceC21213717zz LLILZLL;
    public boolean LLIZLLLIL;
    public boolean LLJI;
    public C1397510mTF LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public int LLJILLL;
    public C1729300v6O LLJJ;
    public long LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public InterfaceC1892740zM0 LLJJJ;
    public final C180Z LLJJJIL;
    public Room LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C1743900vTw LLIZ = new C1743900vTw();
    public boolean LLJ = true;
    public final C054G LLJJI = C2296808zG.LIZ(C2126308Ur.LJFF);
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 701));

    @Override // X.InterfaceC1124060fMC
    public final String LIZ() {
        return "ec_shop";
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final List<Integer> getMessageType() {
        return C1697810uHb.LJIILJJIL(100003, 10000, 100002, 10004, Integer.valueOf(C001A.OEC_LIVE_SMART_PIN_MESSAGE.getIntType()), Integer.valueOf(C001A.OEC_LIVE_SUGGEST_MESSAGE.getIntType()), Integer.valueOf(C001A.OEC_LIVE_FORWARDED_MESSAGE.getIntType()));
    }

    public final String LJJI() {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        InterfaceC2262081DgM currentUser;
        InterfaceC2262081DgM interfaceC2262081DgMAuthor;
        String string;
        Room room = this.LLJJJJ;
        if (room != null && (interfaceC2262081DgMAuthor = room.author()) != null && (string = Long.valueOf(interfaceC2262081DgMAuthor.getId()).toString()) != null) {
            return string;
        }
        ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        return String.valueOf((iLiveOuterService == null || (interfaceC20673515v3K4 = iLiveOuterService.k4()) == null || (currentUser = interfaceC20673515v3K4.getCurrentUser()) == null) ? null : Long.valueOf(currentUser.getId()));
    }

    public final String LJJIFFI() {
        String string;
        Room room = this.LLJJJJ;
        return (room == null || (string = Long.valueOf(room.getId()).toString()) == null) ? CardStruct.IStatusCode.DEFAULT : string;
    }

    public final void LJJIJIIJI() {
        MutableLiveData<Drawable> mutableLiveData;
        MutableLiveData<Drawable> mutableLiveData2;
        MutableLiveData<Drawable> mutableLiveData3;
        if (!this.LLJILJILJ) {
            IIconSlot.SlotViewModel slotViewModel = this.LLILZIL;
            if (slotViewModel == null || (mutableLiveData = slotViewModel.LLJI) == null) {
                return;
            }
            C1731220v9U.LJ(this.LLILZ, mutableLiveData, ECBroadcastShoppingIconSetting.LIZ().liveIconImage, R.drawable.bm0, LJJIFFI(), LJJI());
            return;
        }
        IIconSlot.SlotViewModel slotViewModel2 = this.LLILZIL;
        if (slotViewModel2 != null && (mutableLiveData3 = slotViewModel2.LLJI) != null) {
            C1731220v9U.LJ(this.LLILZ, mutableLiveData3, ECBroadcastShoppingIconSetting.LIZ().liveGrayIconImage, R.drawable.blz, LJJIFFI(), LJJI());
        }
        if (this.LLJI) {
            this.LLJI = false;
            IIconSlot.SlotViewModel slotViewModel3 = this.LLILZIL;
            if (slotViewModel3 == null || (mutableLiveData2 = slotViewModel3.LLJILJIL) == null) {
                return;
            }
            mutableLiveData2.setValue(null);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final List<EnumC742820TBw> LJLI() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(EnumC742820TBw.LIVE_ROOM_EC_LIVE_STATUS);
        return arrayList;
    }

    @Override // X.AnonymousClass1802, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDestroy() {
        String idStr;
        String idStr2;
        C180A c180a = this.LLILLL;
        c180a.LIZ = 0L;
        c180a.LIZIZ = true;
        C2296808zG.LIZJ(this.LLJJI, null);
        Room room = this.LLJJJJ;
        if (room != null && (idStr2 = room.getIdStr()) != null) {
            C212343187x.LIZ.remove(idStr2);
        }
        C180A c180a2 = this.LLILLL;
        c180a2.LIZ = 0L;
        c180a2.LIZIZ = true;
        C1548820qPI.LJIIIIZZ("set_live_continue", this);
        C1548820qPI.LJIIIIZZ("talent_live_product_has_pin", this);
        C1548820qPI.LJIIIIZZ("open_admin_list_dialog", this);
        C622680Oba.LIZLLL(this);
        Room room2 = this.LLJJJJ;
        C596460NaO.LIZ(room2 != null ? room2.getIdStr() : null);
        C1729300v6O c1729300v6O = this.LLJJ;
        if (c1729300v6O != null) {
            Room room3 = this.LLJJJJ;
            if (room3 == null || (idStr = room3.getIdStr()) == null) {
                idStr = CardStruct.IStatusCode.DEFAULT;
            }
            String strLJJI = LJJI();
            C1729400v6Y.LIZ.getClass();
            C054G c054g = C1729400v6Y.LJFF;
            if (c054g != null) {
                C2296808zG.LIZLLL(c054g, "");
            }
            C1729400v6Y.LJFF = null;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZ), null, null, new C1729080v62(c1729300v6O, strLJJI, idStr, null), 3);
        }
        this.LLJJ = null;
        C21211017zY c21211017zY = C21211017zY.LIZ;
        Room room4 = this.LLJJJJ;
        String idStr3 = room4 != null ? room4.getIdStr() : null;
        c21211017zY.getClass();
        if (idStr3 != null && idStr3.length() != 0) {
            C21211017zY.LJIIIIZZ.remove(idStr3);
        }
        C1097680efe c1097680efe = C21211017zY.LIZIZ;
        if (c1097680efe != null) {
            C1537060q6K c1537060q6K = C1529590puH.LIZ;
            C1537060q6K.LJIILL(c1097680efe.LIZ);
        }
        C21211017zY.LIZIZ = null;
        C21211017zY.LIZJ = null;
        if (C21211017zY.LIZLLL) {
            C1546560qLe.LIZ.getClass();
            C1546500qLY.LJIIIIZZ("ec_anchor_shop_bag_biz");
            C21211017zY.LIZLLL = false;
        }
        C21210917zX.LIZ.getClass();
        C23118094a.LJ(C21210917zX.LIZIZ.LL);
        C21211017zY.LJFF = null;
        C21211017zY.LJI = 0L;
        C21211017zY.LJII = 0L;
        C21211017zY.LJ = null;
    }

    public final String LJJ() {
        String strLJJIFFI = u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(CreatorProductListLynxConfigSettings.LIZ(), "_roomId_", LJJIFFI(), false), "_isLiving_", "true", false), "_liveStatus_", "during_live", false);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJJIFFI);
        sbLIZ.append("&user_type=author");
        return ((C180O) this.LLJJIJIL.getValue()).LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJJIII() {
        AnchorLiveBagListOptConfig anchorLiveBagListOptConfigLIZ = C21211217za.LIZ();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, ? extends Object> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("user_type", "author"), new Pair("page_size", 20), new Pair("full_data", 1));
        String strLJJ = LJJ();
        if (anchorLiveBagListOptConfigLIZ.reuseEnabled) {
            C21211017zY.LIZ.getClass();
            C21211017zY.LIZ();
        } else if (!anchorLiveBagListOptConfigLIZ.nativePrefetchEnabled && !anchorLiveBagListOptConfigLIZ.crossPageReuseEnabled && !anchorLiveBagListOptConfigLIZ.preloadEnabled && !anchorLiveBagListOptConfigLIZ.fcpEnabled) {
            SmartRouter.buildRoute(this.LLILZ, strLJJ).open();
            return;
        }
        C21210917zX.LIZ.LIZLLL(this.LLILZ, this.LLJJJJ, jCurrentTimeMillis, EnumC612320Nzy.DURING_LIVE, mapLJIIJ, strLJJ);
    }

    public final Context LJJIIZI() {
        Context contextLJIIIIZZ;
        if (!C290160BYw.LIZ() && !C07MW.LIZ()) {
            return C1388190mED.LIZIZ(this.LLILZ);
        }
        AbstractC1387200mCc abstractC1387200mCcLIZJ = C520150Kab.LIZJ(this.LLILZ);
        return (abstractC1387200mCcLIZJ == null || (contextLJIIIIZZ = abstractC1387200mCcLIZJ.LJIIIIZZ()) == null) ? C1388190mED.LIZIZ(this.LLILZ) : contextLJIIIIZZ;
    }

    @Override // X.InterfaceC1124060fMC
    public final Object LLILZLL() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC756810TmR.SLOT_LIVE_ANCHOR_TOOLBAR;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.180S] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.180Z] */
    public C180M(Context context) {
        this.LLILZ = context;
        final ?? r0 = new AbstractC757140Tmy() { // from class: X.180S
            @Override // X.AbstractC757140Tmy
            public final void LIZIZ() {
                MutableLiveData<String> mutableLiveData;
                C180M c180m = this.LJ;
                if (c180m.LLJILJILJ) {
                    this.LJ.LJJIJ(null, true);
                } else {
                    c180m.LJJIII();
                    Room room = this.LJ.LLJJJJ;
                    if (room != null) {
                        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).u6(room.getId());
                    }
                }
                IIconSlot.SlotViewModel slotViewModel = this.LJ.LLILZIL;
                if (slotViewModel != null && (mutableLiveData = slotViewModel.LLJJ) != null) {
                    mutableLiveData.setValue("");
                }
                C180M c180m2 = this.LJ;
                if (c180m2.LLJJIJIIJIL) {
                    c180m2.LLIZ.LJIIIIZZ("bubble_type_info", "live_pin_education", false);
                } else {
                    c180m2.LLIZ.LJIIIIZZ("bubble_type_info", "", false);
                }
                Map<String, String> map = C180R.LIZ(this.LJ.LLIZ).LIZ;
                ((HashMap) map).put("user_type", "author");
                C1507790pL7.LIZ.getClass();
                C1507790pL7.LIZJ("livesdk_tiktokec_product_icon_click", map);
            }
        };
        this.LLJJJIL = new IIconSlot(r0) { // from class: X.180Z
            public final InterfaceC752610Tff LIZ;

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final void getScheme() {
            }

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final Animator.AnimatorListener LIZ() {
                return new ALAdapterS6S0000000_32(3);
            }

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final InterfaceC752610Tff LIZJ() {
                return this.LIZ;
            }

            {
                this.LIZ = r0;
            }
        };
        this.LLJJJJJIL = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(221));
    }

    public static void LJJIIJZLJL(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "live");
        linkedHashMap.put("popup_name", "author_ec_access_forbidden");
        linkedHashMap.put("action_type", str);
        C1018703yb.LIZIZ("tiktokec_popup_click", linkedHashMap);
    }

    @Override // X.InterfaceC756370Tlj
    public final void LJIIIZ(InterfaceC1892740zM0 interfaceC1892740zM0) {
        if (!LiveShopAddPermissionBusinessSetting.INSTANCE.isEnabled()) {
            return;
        }
        this.LLJJJ = interfaceC1892740zM0;
    }

    public final void LJJIIZ(boolean z) {
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJJIII;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("stay_time", Long.valueOf(jCurrentTimeMillis));
        linkedHashMap.put("page_name", "sale_rank_notification");
        linkedHashMap.put("live_status", "during_live");
        if (z) {
            str = "view_setting";
        } else {
            str = "continue";
        }
        linkedHashMap.put("quit_type", str);
        C1018703yb.LIZIZ("livesdk_tiktokec_stay_page", linkedHashMap);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        DialogFragment dialogFragmentS5;
        String strLJFF;
        MutableLiveData<Drawable> mutableLiveData;
        boolean zLIZIZ;
        MutableLiveData<EnumC517850KSp> mutableLiveData2;
        EnumC517850KSp enumC517850KSp;
        Context contextLJJIIZI = LJJIIZI();
        if (contextLJJIIZI != null) {
            int iLIZLLL = 0;
            boolean zLIZIZ2 = false;
            if (Intrinsics.LJFF("set_live_continue", c262100zr.LIZ)) {
                InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                if (interfaceC1107590evd != null) {
                    zLIZIZ = C1871910yoP.LIZIZ(interfaceC1107590evd, "continue", false);
                } else {
                    zLIZIZ = true;
                }
                BroadcastTunnelVM broadcastTunnelVMLIZIZ = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).K3().LIZIZ(contextLJJIIZI);
                if (broadcastTunnelVMLIZIZ != null && (mutableLiveData2 = broadcastTunnelVMLIZIZ.LL) != null) {
                    if (zLIZIZ) {
                        enumC517850KSp = EnumC517850KSp.STREAM_ON;
                    } else {
                        enumC517850KSp = EnumC517850KSp.STREAM_PAUSE;
                    }
                    mutableLiveData2.setValue(enumC517850KSp);
                    return;
                }
                return;
            }
            FragmentManager fragmentManagerLJ = null;
            C19LH c19lhLIZ = null;
            fragmentManagerLJ = null;
            if (Intrinsics.LJFF("talent_live_product_has_pin", c262100zr.LIZ) && this.LLJ) {
                InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
                if (interfaceC1107590evd2 != null) {
                    zLIZIZ2 = C1871910yoP.LIZIZ(interfaceC1107590evd2, "hasPin", false);
                }
                this.LLJI = zLIZIZ2;
                IIconSlot.SlotViewModel slotViewModel = this.LLILZIL;
                if (slotViewModel == null || (mutableLiveData = slotViewModel.LLJILJIL) == null) {
                    return;
                }
                if (zLIZIZ2) {
                    c19lhLIZ = C19LH.LIZ(contextLJJIIZI.getResources(), R.drawable.bm1, null);
                }
                mutableLiveData.setValue(c19lhLIZ);
                return;
            }
            if (Intrinsics.LJFF("open_admin_list_dialog", c262100zr.LIZ)) {
                if (!C290160BYw.LIZ() && !C07MW.LIZ()) {
                    C19EG c19egLIZIZ = C1388190mED.LIZIZ(contextLJJIIZI);
                    if (c19egLIZIZ != null) {
                        fragmentManagerLJ = c19egLIZIZ.getSupportFragmentManager();
                    }
                } else {
                    AbstractC1387200mCc abstractC1387200mCcLIZJ = C520150Kab.LIZJ(contextLJJIIZI);
                    if (abstractC1387200mCcLIZJ != null) {
                        fragmentManagerLJ = abstractC1387200mCcLIZJ.LJ();
                    }
                }
                InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
                String str = "";
                if (interfaceC1107590evd3 != null && (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd3, "page", "")) != null) {
                    str = strLJFF;
                }
                if (!Intrinsics.LJFF("during_live", str) || fragmentManagerLJ == null || (dialogFragmentS5 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).S5(EnumC752540TfY.MODERATOR_LIST)) == null) {
                    return;
                }
                dialogFragmentS5.show(fragmentManagerLJ, "LiveAdminSettingDialog");
                return;
            }
            if (!Intrinsics.LJFF("talent_live_product_list_num", c262100zr.LIZ)) {
                return;
            }
            InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
            if (interfaceC1107590evd4 != null) {
                iLIZLLL = C1871910yoP.LIZLLL(interfaceC1107590evd4, "productNum", 0);
            }
            C0O01.LIZ = iLIZLLL;
            C180O c180o = (C180O) this.LLJJIJIL.getValue();
            String str2 = c180o.LIZIZ;
            if (str2 == null) {
                return;
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZIZ), null, null, new C180P(str2, c180o, null), 3);
        }
    }

    @Override // X.AnonymousClass1802, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C622680Oba.LIZJ(this);
    }

    @C14EU
    public final void onECBillboardVersionEvent(C7824033u c7824033u) {
        this.LLJJIJI = c7824033u.LIZ;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onExposure(String str) {
        if (Intrinsics.LJFF(str, "during_live")) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LJFF), null, null, new C438801nG(this, null), 3);
            String strLJJI = LJJI();
            String strLJJIFFI = LJJIFFI();
            C180A c180a = this.LLILLL;
            if (c180a.LIZIZ) {
                c180a.LIZIZ = false;
                C2010807uE.LIZ(System.currentTimeMillis() - c180a.LIZ, "rd_tiktokec_during_live_icon_show", strLJJI, strLJJIFFI);
            }
        }
        C1743900vTw c1743900vTw = this.LLIZ;
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map<String, String> map = C180R.LIZ(c1743900vTw).LIZ;
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_product_icon_show", map);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onMessage(IMessage iMessage) throws JSONException {
        ShortItemRefreshEntity shortItemRefreshEntity;
        CampaignBannerDisplay campaignBannerDisplay;
        BillboardInfo billboardInfo;
        BillboardInfo billboardInfo2;
        String idStr;
        boolean zLIZ;
        C1397510mTF c1397510mTF;
        String strLIZLLL;
        if (iMessage instanceof EcTaskRefreshCouponListMessage) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZIZ), null, null, new C388701fB(null), 3);
            C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LJFF), null, null, new C434301mX(this, iMessage, null), 3);
            return;
        }
        boolean z = false;
        if (iMessage instanceof ECommerceMessage) {
            ECommerceMessage eCommerceMessage = (ECommerceMessage) iMessage;
            int i = eCommerceMessage.actionType;
            long j = 0;
            if (i != 0) {
                if (i != 19) {
                    if (i != 15) {
                        if (i != 16) {
                            switch (i) {
                                case 7:
                                    AtmosphereTagInfo atmosphereTagInfo = eCommerceMessage.atmosphereTagInfo;
                                    if (atmosphereTagInfo == null) {
                                        return;
                                    }
                                    Room room = this.LLJJJJ;
                                    if (room != null && (idStr = room.getIdStr()) != null) {
                                        int i2 = atmosphereTagInfo.tagType;
                                        if (i2 != 1) {
                                            if (i2 != 2) {
                                                if (i2 != 3) {
                                                    if (i2 == 4) {
                                                        zLIZ = C212343187x.LIZJ(idStr, false);
                                                    }
                                                } else {
                                                    zLIZ = C212343187x.LIZLLL(idStr, false);
                                                }
                                            } else {
                                                zLIZ = C212343187x.LIZIZ(idStr, false);
                                            }
                                        } else {
                                            zLIZ = C212343187x.LIZ(idStr, false);
                                        }
                                        if (!zLIZ) {
                                            return;
                                        }
                                    }
                                    C23250099c.LIZLLL(this.LLJJI, null, null, new C502301xV(atmosphereTagInfo, null), 3);
                                    break;
                                    break;
                                case 8:
                                    if (C1894507bT.LIZ()) {
                                        this.LLJILJILJ = true;
                                        LJJIJ(eCommerceMessage.livePermissionInfo, false);
                                        LJJIJIIJI();
                                        CommonMessageData commonMessageData = eCommerceMessage.baseMessage;
                                        if (commonMessageData != null) {
                                            j = commonMessageData.createTime;
                                        }
                                        LJJII(0, j, true);
                                    }
                                    break;
                                case BdTuring.TYPE_ECAF /* 9 */:
                                    if (C1894507bT.LIZ()) {
                                        this.LLJILJILJ = false;
                                        if (this.LLJILJIL && (c1397510mTF = this.LLJIJIL) != null) {
                                            c1397510mTF.LIZIZ(null);
                                        }
                                        this.LLJIJIL = null;
                                        LJJIJIIJI();
                                        int i3 = this.LLJILLL;
                                        CommonMessageData commonMessageData2 = eCommerceMessage.baseMessage;
                                        if (commonMessageData2 != null) {
                                            j = commonMessageData2.createTime;
                                        }
                                        LJJII(i3, j, false);
                                    }
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                    if (!this.LLJJIJI) {
                                        C23250099c.LIZLLL(this.LLJJI, null, null, new C1730600v8U(this, iMessage, null), 3);
                                    }
                                    break;
                                case BdTuring.TYPE_EMAIL /* 11 */:
                                    List<FlashSaleAtmosphereInfo> list = eCommerceMessage.flashSaleAtmosphereInfo;
                                    if (list != null) {
                                        strLIZLLL = C08JS.LIZLLL(list);
                                    } else {
                                        strLIZLLL = null;
                                    }
                                    C23250099c.LIZLLL(this.LLJJI, null, null, new C503301xf(iMessage, strLIZLLL, null), 3);
                                    break;
                            }
                        } else if (!this.LLJJIJI && (billboardInfo2 = eCommerceMessage.billboardInfo) != null && billboardInfo2.sourceFrom == 2) {
                            int i4 = billboardInfo2.billboardType;
                            C1729400v6Y.LIZ.getClass();
                            C1730290v7z.LIZ.getClass();
                            if (i4 == 0) {
                                z = true;
                            }
                            C1440005kM.LIZ(new C7835034f(z));
                        }
                    } else if (!this.LLJJIJI && (billboardInfo = eCommerceMessage.billboardInfo) != null && billboardInfo.sourceFrom == 2) {
                        C1729400v6Y c1729400v6Y = C1729400v6Y.LIZ;
                        Context context = this.LLILZ;
                        String strLJJIFFI = LJJIFFI();
                        String strLJJI = LJJI();
                        c1729400v6Y.getClass();
                        C1729400v6Y.LJI(context, strLJJIFFI, strLJJI, billboardInfo);
                    }
                } else if (!this.LLJJIJI && (campaignBannerDisplay = eCommerceMessage.campaignBannerDisplay) != null && campaignBannerDisplay.sourceFrom == 2) {
                    try {
                        C1729400v6Y c1729400v6Y2 = C1729400v6Y.LIZ;
                        String strLJJIFFI2 = LJJIFFI();
                        String strLJJI2 = LJJI();
                        boolean z2 = campaignBannerDisplay.campaignBannerIsDisplay;
                        String str = campaignBannerDisplay.imageUrl;
                        c1729400v6Y2.getClass();
                        InterfaceC497601wk interfaceC497601wkLJFF = C1729400v6Y.LJFF();
                        if (interfaceC497601wkLJFF != null) {
                            C23250099c.LIZLLL(interfaceC497601wkLJFF, null, null, new C0NT0(strLJJI2, strLJJIFFI2, str, z2, null), 3);
                        }
                    } catch (CancellationException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw e;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } else {
                int i5 = eCommerceMessage.liveProductNumber;
                CommonMessageData commonMessageData3 = eCommerceMessage.baseMessage;
                if (commonMessageData3 != null) {
                    j = commonMessageData3.createTime;
                }
                LJJII(i5, j, false);
            }
            int i6 = eCommerceMessage.actionType;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2 && i6 != 3 && i6 != 4 && i6 != 5) {
                        if (i6 != 8 && i6 != 9) {
                            if (i6 != 23) {
                                return;
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("card_type", eCommerceMessage.cardType);
                            jSONObject.put("anchor_pin_card_reset_type", eCommerceMessage.anchorPinCardResetType);
                            PopProduct popProduct = eCommerceMessage.popProduct;
                            if (popProduct != null) {
                                jSONObject.put("product_id", String.valueOf(Long.valueOf(popProduct.productId).longValue()));
                            }
                            Voucher voucher = eCommerceMessage.voucher;
                            if (voucher != null) {
                                jSONObject.put("voucher_type_id", String.valueOf(Long.valueOf(voucher.voucherTypeId).longValue()));
                            }
                            LJJIIJ(i6, jSONObject);
                            return;
                        }
                        if (!C1894507bT.LIZ()) {
                            return;
                        }
                        LJJIIJ(eCommerceMessage.actionType, null);
                        return;
                    }
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    PopProduct popProduct2 = eCommerceMessage.popProduct;
                    if (popProduct2 != null) {
                        jSONObject2.put("product_id", String.valueOf(Long.valueOf(popProduct2.productId).longValue()));
                    }
                    LJJIIJ(i6, jSONObject2);
                    return;
                }
            }
            LJJIIJ(i6, null);
            return;
        }
        if (!(iMessage instanceof ECShortItemRefreshMessage) || ((shortItemRefreshEntity = ((ECShortItemRefreshMessage) iMessage).entity) != null && shortItemRefreshEntity.refreshMsgType == 1)) {
            if (iMessage instanceof EcDrawMessage) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZIZ), null, null, new C320601Me(this, iMessage, null), 3);
                return;
            }
            if (iMessage instanceof OecLiveSmartPinMessage) {
                OecLiveSmartPinMessage oecLiveSmartPinMessage = (OecLiveSmartPinMessage) iMessage;
                if (oecLiveSmartPinMessage.messageType != 1) {
                    return;
                }
                C23250099c.LIZLLL(this.LLJJI, null, null, new C458501qR(this, oecLiveSmartPinMessage.noPinEducationText, null), 3);
                return;
            }
            if (iMessage instanceof OecLiveSuggestMessage) {
                OecLiveSuggestMessage oecLiveSuggestMessage = (OecLiveSuggestMessage) iMessage;
                if (oecLiveSuggestMessage.messageType != 1) {
                    return;
                }
                this.LLILLJJLI.LJFF("ECOM_ANCHOR_SMART_RECOMMEND", oecLiveSuggestMessage.description, new InterfaceC1123790fLl() { // from class: X.180c
                    @Override // X.InterfaceC1123790fLl
                    public final void onDismiss() {
                        C2341109Fh.LIZ.getClass();
                        C2341109Fh.LJ("chengongguo16 showSmartRecommendToolTip onDismiss()");
                    }

                    @Override // X.InterfaceC1123790fLl
                    public final void onShow() {
                        C2341109Fh.LIZ.getClass();
                        C2341109Fh.LJ("chengongguo16 showSmartRecommendToolTip onShow()");
                    }
                });
                return;
            }
            if (!(iMessage instanceof OecLiveForwardedMessage)) {
                return;
            }
            EnumC147100hJ enumC147100hJ = EnumC147100hJ.ANCHOR;
            try {
                JSONObject jSONObject3 = new JSONObject(C1741890vQh.LJIIIIZZ(iMessage));
                IEventCenter iEventCenter = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("message_type", iMessage.getMethodName());
                jSONObject4.put("data", jSONObject3);
                jSONObject4.put("source", enumC147100hJ.getValue());
                iEventCenter.LIZ("ec_content_message_event", C786410Ut5.J3(jSONObject4));
                return;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return;
            }
        }
        String strLJJIFFI3 = LJJIFFI();
        String strLJJI3 = LJJI();
        if (!C123100dR.LIZ(strLJJIFFI3) || !C123100dR.LIZ(strLJJI3)) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZIZ), null, null, new C1741620vQG(strLJJIFFI3, strLJJI3, iMessage, this, null), 3);
    }

    @C14EU
    public final void onSeaLiveBillboardVersionEvent(C7825033v c7825033v) {
        this.LLJJIJI = c7825033v.LIZ;
    }

    @C14EU
    public final void onShowBagList(C1726130v1H c1726130v1H) {
        Long lValueOf;
        if (c1726130v1H.LIZ) {
            String str = c1726130v1H.LIZIZ;
            Room room = this.LLJJJJ;
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            } else {
                lValueOf = null;
            }
            if (Intrinsics.LJFF(str, String.valueOf(lValueOf))) {
                LJJIII();
            }
        }
    }

    @C14EU
    public final void onShowStateEvent(C083G c083g) {
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Drawable> mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3;
        MutableLiveData<Drawable> mutableLiveData4;
        MutableLiveData<Drawable> mutableLiveData5;
        MutableLiveData<Boolean> mutableLiveData6;
        if (this.LLJ) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJII("show tag by js callback");
            return;
        }
        int i = c083g.LIZ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 || !this.LLJI) {
                    return;
                }
                this.LLJI = false;
                IIconSlot.SlotViewModel slotViewModel = this.LLILZIL;
                if (slotViewModel != null && (mutableLiveData6 = slotViewModel.LLJJJ) != null) {
                    mutableLiveData6.setValue(Boolean.FALSE);
                }
                IIconSlot.SlotViewModel slotViewModel2 = this.LLILZIL;
                if (slotViewModel2 != null && (mutableLiveData5 = slotViewModel2.LLJILJIL) != null) {
                    mutableLiveData5.setValue(null);
                    return;
                }
                return;
            }
            this.LLJI = true;
            IIconSlot.SlotViewModel slotViewModel3 = this.LLILZIL;
            if (slotViewModel3 != null && (mutableLiveData4 = slotViewModel3.LLJILJIL) != null) {
                mutableLiveData4.setValue(C19LH.LIZ(this.LLILZ.getResources(), R.drawable.bm1, null));
            }
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) View.SCALE_X, 1.0f, 1.3f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) View.SCALE_Y, 1.0f, 1.3f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.setDuration(100L);
            animatorSet2.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).after(200L);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) View.SCALE_X, 1.3f, 0.9f);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) View.SCALE_Y, 1.3f, 0.9f);
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.setDuration(200L);
            animatorSet3.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) View.SCALE_X, 0.9f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) View.SCALE_Y, 0.9f, 1.0f);
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.setDuration(100L);
            animatorSet4.playTogether(objectAnimatorOfFloat5, objectAnimatorOfFloat6);
            animatorSet.playSequentially(animatorSet2, animatorSet3, animatorSet4);
            IIconSlot.SlotViewModel slotViewModel4 = this.LLILZIL;
            if (slotViewModel4 != null && (mutableLiveData3 = slotViewModel4.LLJJJ) != null) {
                mutableLiveData3.setValue(Boolean.FALSE);
            }
            IIconSlot.SlotViewModel slotViewModel5 = this.LLILZIL;
            if (slotViewModel5 != null) {
                slotViewModel5.LLLFF = animatorSet;
                MutableLiveData<Boolean> mutableLiveData7 = slotViewModel5.LLJJJ;
                if (mutableLiveData7 != null) {
                    mutableLiveData7.setValue(Boolean.TRUE);
                    return;
                }
                return;
            }
            return;
        }
        if (this.LLJI) {
            return;
        }
        this.LLJI = true;
        IIconSlot.SlotViewModel slotViewModel6 = this.LLILZIL;
        if (slotViewModel6 != null && (mutableLiveData2 = slotViewModel6.LLJILJIL) != null) {
            mutableLiveData2.setValue(C19LH.LIZ(this.LLILZ.getResources(), R.drawable.bm1, null));
        }
        IIconSlot.SlotViewModel slotViewModel7 = this.LLILZIL;
        if (slotViewModel7 != null && (mutableLiveData = slotViewModel7.LLJJJ) != null) {
            mutableLiveData.setValue(Boolean.FALSE);
        }
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) View.SCALE_X, 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) View.SCALE_Y, 0.0f, 1.0f);
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.setDuration(150L);
        animatorSet5.playTogether(objectAnimatorOfFloat7, objectAnimatorOfFloat8);
        IIconSlot.SlotViewModel slotViewModel8 = this.LLILZIL;
        if (slotViewModel8 != null) {
            slotViewModel8.LLLFF = animatorSet5;
            MutableLiveData<Boolean> mutableLiveData8 = slotViewModel8.LLJJJ;
            if (mutableLiveData8 != null) {
                mutableLiveData8.setValue(Boolean.TRUE);
            }
        }
    }

    public static final void LJJIIJ(int i, JSONObject jSONObject) throws JSONException {
        IEventCenter iEventCenter = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("action_type", i);
        if (jSONObject != null) {
            jSONObject2.put("data", jSONObject);
        }
        iEventCenter.LIZ("ec_author_message_event", C786410Ut5.J3(jSONObject2));
    }

    public final void LJJIJ(LivePermissionInfo livePermissionInfo, boolean z) {
        String str;
        String str2;
        if (!z) {
            if (livePermissionInfo == null) {
                return;
            }
        } else if (!this.LLJILJIL) {
            C1397510mTF c1397510mTF = this.LLJIJIL;
            if (c1397510mTF != null) {
                c1397510mTF.LIZLLL();
                return;
            }
            return;
        }
        Context contextLJJIIZI = LJJIIZI();
        if (contextLJJIIZI == null) {
            contextLJJIIZI = this.LLILZ;
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(contextLJJIIZI);
        String strLJI = null;
        TuxIconView tuxIconView = new TuxIconView(contextLJJIIZI, null, 0, 6, null);
        tuxIconView.setIconRes(R.drawable.blv);
        tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)));
        tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)));
        C19ME c19me = new C19ME(-2, -2);
        c19me.topToTop = 0;
        c19me.startToStart = 0;
        c19me.endToEnd = 0;
        ((ViewGroup.MarginLayoutParams) c19me).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        C786410Ut5.M6(tuxIconView, c19me);
        constraintLayout.addView(tuxIconView);
        C1397580mTM c1397580mTM = new C1397580mTM(contextLJJIIZI);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        C340170DVf c340170DVf = new C340170DVf(0, contextLJJIIZI, constraintLayout);
        c340170DVf.LJFF = iLIZIZ;
        c1397580mTM.LJIIIZ = c340170DVf;
        c1397580mTM.LJI(C20642515q3.LJI(2131832652));
        if (livePermissionInfo != null && (str = livePermissionInfo.reason) != null) {
            if (Intrinsics.LJFF(str, "ecom_creator_permission_ban_live_temporary")) {
                if (livePermissionInfo.endTime > 0) {
                    try {
                        str2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.valueOf(livePermissionInfo.endTime));
                    } catch (CancellationException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw e;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    strLJI = this.LLILZ.getString(2131832797, str2);
                } else {
                    str2 = "";
                    strLJI = this.LLILZ.getString(2131832797, str2);
                }
            } else if (Intrinsics.LJFF(str, "ecom_creator_permission_ban_live_permanent")) {
                strLJI = C20642515q3.LJI(2131832796);
            }
        }
        c1397580mTM.LIZIZ(strLJI);
        TuxTextView tuxTextView = new TuxTextView(contextLJJIIZI, null, 6, 0);
        tuxTextView.setText(C20642515q3.LJI(2131858544));
        tuxTextView.setTuxFont(42);
        tuxTextView.setTextColor(C960203pA.LIZ(R.attr.a1k, contextLJJIIZI));
        tuxTextView.setGravity(17);
        C384000F3u.LIZ(c1397580mTM, tuxTextView);
        C1238130iKB.LIZ(c1397580mTM, new AwS397S0200000_31(contextLJJIIZI, this, 99));
        c1397580mTM.LJII = false;
        c1397580mTM.LJ(new AwS611S0100000_32(this, 326));
        c1397580mTM.LIZLLL(new AwS610S0100000_31(this, 457));
        C1397510mTF c1397510mTF2 = new C1397510mTF(c1397580mTM);
        this.LLJIJIL = c1397510mTF2;
        c1397510mTF2.LIZLLL();
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) throws JSONException {
        String idStr;
        boolean zLIZ;
        EcAnchorLiveStartApiRequestConfigSettings.LiveStartSettings liveStartSettings;
        CommerceStruct commerceStruct;
        IIconSlot.SlotViewModel slotViewModel;
        EcAnchorLiveStartApiRequestConfigSettings.LiveStartSettings liveStartSettings2;
        IIconSlot.SlotViewModel slotViewModel2 = (IIconSlot.SlotViewModel) viewModel;
        this.LL = slotViewModel2;
        this.LLILLJJLI = interfaceC21213717zz;
        Room room = this.LLJJJJ;
        if (room != null) {
            idStr = room.getIdStr();
        } else {
            idStr = null;
        }
        try {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("ec_anchor_or_moderator_permission_check_enable", true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            zLIZ = true;
        }
        if (zLIZ) {
            C23250099c.LIZLLL(this.LLJJI, null, null, new C1741860vQe(this, idStr, null), 3);
        }
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            liveStartSettings = EcAnchorLiveStartApiRequestConfigSettings.LIZ;
            EcAnchorLiveStartApiRequestConfigSettings.LiveStartSettings liveStartSettings3 = (EcAnchorLiveStartApiRequestConfigSettings.LiveStartSettings) settingsManagerLIZLLL.LJIIIIZZ("ttec_anchor_live_start_api_request_config", EcAnchorLiveStartApiRequestConfigSettings.LiveStartSettings.class, liveStartSettings);
            if (liveStartSettings3 != null) {
                liveStartSettings = liveStartSettings3;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            liveStartSettings = EcAnchorLiveStartApiRequestConfigSettings.LIZ;
        }
        if (liveStartSettings.enableApiCalling && idStr != null) {
            try {
                SettingsManager settingsManagerLIZLLL2 = SettingsManager.LIZLLL();
                liveStartSettings2 = EcAnchorLiveStartApiRequestConfigSettings.LIZ;
                EcAnchorLiveStartApiRequestConfigSettings.LiveStartSettings liveStartSettings4 = (EcAnchorLiveStartApiRequestConfigSettings.LiveStartSettings) settingsManagerLIZLLL2.LJIIIIZZ("ttec_anchor_live_start_api_request_config", EcAnchorLiveStartApiRequestConfigSettings.LiveStartSettings.class, liveStartSettings2);
                if (liveStartSettings4 != null) {
                    liveStartSettings2 = liveStartSettings4;
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                liveStartSettings2 = EcAnchorLiveStartApiRequestConfigSettings.LIZ;
            }
            C23250099c.LIZLLL(this.LLJJI, null, null, new C01QF(new C118300cf(), liveStartSettings2.maxRetryCount, new C238400w2(), idStr, null), 3);
        }
        C21207817z2.LIZJ(slotViewModel2, true);
        C1731220v9U.LJ(this.LLILZ, slotViewModel2.LLJ, ECBroadcastShoppingIconSetting.LIZ().liveIconImage, R.drawable.bly, LJJIFFI(), LJJI());
        C1731220v9U.LJ(this.LLILZ, slotViewModel2.LLJI, ECBroadcastShoppingIconSetting.LIZ().liveIconImage, R.drawable.bm0, LJJIFFI(), LJJI());
        slotViewModel2.LLJILJILJ.setValue(C1731220v9U.LIZIZ(this.LLILZ, 2131843184, ECBroadcastShoppingIconSetting.LIZ().iconTitle));
        C1731220v9U.LJ(this.LLILZ, slotViewModel2.LLJIJIL, ECBroadcastShoppingIconSetting.LIZ().innerIconImage, R.drawable.blq, LJJIFFI(), LJJI());
        slotViewModel2.LLJILLL.setValue(C1731220v9U.LIZIZ(this.LLILZ, 2131822047, ECBroadcastShoppingIconSetting.LIZ().iconInnerTitle));
        slotViewModel2.LLL = new InterfaceC784990Uqn() { // from class: X.01nK
            @Override // X.InterfaceC784990Uqn
            public final void LIZ() {
                C438901nH.LIZ.storeBoolean("need_show_ec_tip_in_living_room", false);
            }
        };
        this.LLILZIL = slotViewModel2;
        this.LLILZLL = interfaceC21213717zz;
        Room room2 = this.LLJJJJ;
        if (room2 != null && (commerceStruct = room2.getCommerceStruct()) != null) {
            int i = (int) commerceStruct.productNum;
            if (i > 0 && (slotViewModel = this.LLILZIL) != null) {
                slotViewModel.LLJZIJLIL = Integer.valueOf(i);
            }
            LJJII(i, 0L, false);
        }
        C1548820qPI.LJFF("set_live_continue", this, "ECDuringLiveBroadcasterWidget");
        C1548820qPI.LJFF("talent_live_product_has_pin", this, "ECDuringLiveBroadcasterWidget");
        C1548820qPI.LJFF("open_admin_list_dialog", this, "ECDuringLiveBroadcasterWidget");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x015c  */
    @Override // X.InterfaceC1124060fMC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void prepareToShow(java.util.Map<java.lang.String, ? extends java.lang.Object> r10, X.InterfaceC756140TlM r11) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C180M.prepareToShow(java.util.Map, X.0TlM):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ec A[PHI: r11
      0x00ec: PHI (r11v4 ??) = (r11v19 ??), (r11v20 ??) binds: [B:57:0x00e3, B:47:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v9, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJII(int r16, long r17, boolean r19) {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C180M.LJJII(int, long, boolean):void");
    }
}
