package X;

import Y.ALAdapterS23S0100000_28;
import Y.AObserverS188S0200000_28;
import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.LiveShopAddPermissionBusinessSetting;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.TTLSLiveControlMessage;
import com.bytedance.android.livesdkapi.depend.model.live.AggregationData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.TTLSRoomInfo;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.localservice.live.common.config.TtlsLiveConfigSettings;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS146S1100000_32;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zLm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1892600zLm extends AbstractC21213317zv<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> implements InterfaceC212386189o, InterfaceC756370Tlj, InterfaceC1706670uVt {
    public static final /* synthetic */ int LLJJIJIL = 0;
    public Room LLIZ;
    public WeakReference<LifecycleOwner> LLIZLLLIL;
    public boolean LLJ;
    public String LLJI;
    public Integer LLJIJIL;
    public InterfaceC1892740zM0 LLJILJIL;
    public IIconSlot.SlotViewModel LLJILJILJ;
    public boolean LLJILLL;
    public Function0<Unit> LLJJ;
    public boolean LLJJI;
    public String LLJJIII;
    public long LLJJIJIIJIL;
    public final /* synthetic */ C1892620zLo LLILZIL = new C1892620zLo();
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(689));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(690));

    @Override // X.InterfaceC1124060fMC
    public final String LIZ() {
        return "local_service";
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final String LLILZIL() {
        return "LocalServiceLiveShopBag";
    }

    @Override // X.InterfaceC1706670uVt
    public final void LJII() {
        LJJIIZI("StepAnimEndFinish", new JSONObject());
    }

    @Override // X.AbstractC21213317zv
    public final TuxIconDrawable LJJ() {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_storefront_smile;
        return c419910GdJ.LIZ(this.LLILLJJLI.getContext());
    }

    @Override // X.AbstractC21213317zv
    public final TuxIconDrawable LJJIFFI() {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_storefront_smile;
        c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.exs, this.LLILLJJLI.getContext());
        c419910GdJ.LJ = Integer.valueOf(R.attr.exs);
        return c419910GdJ.LIZ(this.LLILLJJLI.getContext());
    }

    @Override // X.InterfaceC1124060fMC
    public final Object LLILZLL() {
        return new IIconSlot() { // from class: X.0zLu
            @Override // com.bytedance.android.live.slot.IIconSlot
            public final /* bridge */ /* synthetic */ void getScheme() {
            }

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final Animator.AnimatorListener LIZ() {
                return new ALAdapterS23S0100000_28(this.LIZ, 8);
            }

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final InterfaceC752610Tff LIZJ() {
                final C1892600zLm c1892600zLm = this.LIZ;
                return new InterfaceC752610Tff() { // from class: X.0zLn
                    @Override // X.InterfaceC752610Tff
                    public final void LIZ(View view, String str) throws JSONException {
                        String idStr;
                        String string;
                        String requestId;
                        String str2;
                        int iIntValue;
                        InterfaceC2262081DgM interfaceC2262081DgMAuthor;
                        PageFinder pageFinderLIZ = C520160Kac.LIZ(c1892600zLm.LLILLJJLI.getContext());
                        c1892600zLm.LJJIIJ(null);
                        Room room = c1892600zLm.LLIZ;
                        String str3 = "";
                        if (room == null || (idStr = room.getIdStr()) == null) {
                            idStr = "";
                        }
                        Room room2 = c1892600zLm.LLIZ;
                        if (room2 == null || (interfaceC2262081DgMAuthor = room2.author()) == null || (string = Long.valueOf(interfaceC2262081DgMAuthor.getId()).toString()) == null) {
                            string = "";
                        }
                        C1892600zLm c1892600zLm2 = c1892600zLm;
                        C1892620zLo c1892620zLo = c1892600zLm2.LLILZIL;
                        String str4 = c1892620zLo.LJIIIIZZ;
                        if (str4 == null) {
                            str4 = "";
                        }
                        String str5 = c1892620zLo.LIZ;
                        if (str5 == null) {
                            str5 = "";
                        }
                        Room room3 = c1892600zLm2.LLIZ;
                        if (room3 == null || (requestId = room3.getRequestId()) == null) {
                            requestId = "";
                        }
                        C1892620zLo c1892620zLo2 = c1892600zLm.LLILZIL;
                        String str6 = c1892620zLo2.LIZLLL;
                        String str7 = c1892620zLo2.LJ;
                        String str8 = c1892620zLo2.LJFF;
                        String str9 = c1892620zLo2.LJI;
                        String str10 = c1892620zLo2.LJII;
                        String str11 = c1892620zLo2.LIZIZ;
                        if (str11 == null) {
                            str11 = "";
                        }
                        String str12 = c1892620zLo2.LIZJ;
                        if (str12 != null) {
                            str3 = str12;
                        }
                        boolean zLJFF = Intrinsics.LJFF(c1892620zLo2.LJIIIZ, Boolean.TRUE);
                        String str13 = CardStruct.IStatusCode.DEFAULT;
                        if (zLJFF) {
                            str2 = "1";
                        } else {
                            str2 = CardStruct.IStatusCode.DEFAULT;
                        }
                        String str14 = c1892600zLm.LLILZIL.LJIIJ;
                        if (str14 != null) {
                            str13 = str14;
                        }
                        BtmSDK btmSDK = BtmSDK.INSTANCE;
                        Map mapCreateReportParams$default = BtmSDK.createReportParams$default(btmSDK, "c46805.d96209", pageFinderLIZ, null, 4, null);
                        JSONObject jSONObject = new JSONObject();
                        C1892600zLm c1892600zLm3 = c1892600zLm;
                        Integer num = c1892600zLm3.LLJIJIL;
                        int iIntValue2 = 0;
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        jSONObject.put("product_quantity", iIntValue);
                        Integer num2 = c1892600zLm3.LLJIJIL;
                        if (num2 != null) {
                            iIntValue2 = num2.intValue();
                        }
                        jSONObject.put("valid_product_quantity", iIntValue2);
                        C21244318Bt c21244318Bt = new C21244318Bt();
                        c21244318Bt.LIZ = "c46805.d96209";
                        c21244318Bt.LIZIZ = pageFinderLIZ;
                        jSONObject.put("bcm_chain", C786410Ut5.J3(btmSDK.getBcmChainByBtmModel(c21244318Bt, 20, false).LIZ()));
                        String str15 = str4;
                        C1892630zLp.LIZ("ttls_live_shelf_icon_click", idStr, string, str15, str5, requestId, str6, str7, str8, str9, str10, str11, str3, str2, str13, mapCreateReportParams$default, jSONObject, new C1185050gwZ(pageFinderLIZ));
                        c1892600zLm.LJJIIZI("StepClick", new JSONObject());
                    }
                };
            }
        };
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final List<Integer> getMessageType() {
        return Collections.singletonList(Integer.valueOf(C001A.T_T_L_S_LIVE_CONTROL_MESSAGE.getIntType()));
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDestroy() throws JSONException {
        String idStr;
        LifecycleOwner lifecycleOwner;
        ILiveOuterService iLiveOuterService;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        Function0<Unit> function0 = this.LLJJ;
        if (function0 != null) {
            function0.invoke();
        }
        this.LLJJ = null;
        if (Intrinsics.LJFF(C1706660uVs.LIZLLL, this)) {
            C1706660uVs.LIZLLL = null;
            C1706660uVs.LIZIZ = null;
            C09AE c09ae = C1706660uVs.LIZJ;
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            C1706660uVs.LIZJ = null;
        }
        WeakReference<LifecycleOwner> weakReference = this.LLIZLLLIL;
        if (weakReference != null && (lifecycleOwner = weakReference.get()) != null && (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null) {
            interfaceC20673515v3K4.k7(lifecycleOwner);
        }
        this.LLIZLLLIL = null;
        JSONObject jSONObject = new JSONObject();
        Room room = this.LLIZ;
        if (room == null || (idStr = room.getIdStr()) == null) {
            idStr = "";
        }
        jSONObject.put("room_id", idStr);
        C326830CrZ.LIZ("ttls_live_shop_widget_on_destroy", jSONObject);
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC756810TmR.SLOT_LIVE_WATCHER_TOOLBAR;
    }

    @Override // X.InterfaceC756370Tlj
    public final void LJIIIZ(InterfaceC1892740zM0 interfaceC1892740zM0) {
        int iIntValue;
        if (!LiveShopAddPermissionBusinessSetting.INSTANCE.isEnabled()) {
            return;
        }
        this.LLJILJIL = interfaceC1892740zM0;
        Integer num = this.LLJIJIL;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        LJJIII(iIntValue);
    }

    @Override // X.InterfaceC1706670uVt
    public final void LJIIJJI(AFwS215S0000000_26 aFwS215S0000000_26) throws JSONException {
        boolean zLJFF;
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        JSONObject jSONObject = new JSONObject();
        IIconSlot.SlotViewModel slotViewModel = this.LLJILJILJ;
        if (slotViewModel != null && (mutableLiveData2 = slotViewModel.LLILZ) != null) {
            zLJFF = Intrinsics.LJFF(mutableLiveData2.getValue(), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        jSONObject.put("isVisible", zLJFF);
        LJJIIZI("StepStartShrinkToBagAnim", jSONObject);
        IIconSlot.SlotViewModel slotViewModel2 = this.LLJILJILJ;
        if (slotViewModel2 != null && (mutableLiveData = slotViewModel2.LLILZ) != null && Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE)) {
            Function0<Unit> function0 = this.LLJJ;
            if (function0 != null) {
                function0.invoke();
            }
            this.LLJJ = aFwS215S0000000_26;
            IIconSlot.SlotViewModel slotViewModel3 = this.LLJILJILJ;
            if (slotViewModel3 != null) {
                slotViewModel3.LLJLLIL = Integer.valueOf(R.raw.tux_lottie_common_ttls_shopping_icon_shut);
                slotViewModel3.LLJZ = Integer.valueOf(C0N5K.SHRINK_TO_BAG.getCode());
                MutableLiveData<Boolean> mutableLiveData3 = slotViewModel3.LLJJIJI;
                if (mutableLiveData3 != null) {
                    mutableLiveData3.setValue(Boolean.TRUE);
                    return;
                }
                return;
            }
            return;
        }
        aFwS215S0000000_26.invoke();
    }

    @Override // X.InterfaceC212387189p
    public final void LJIILIIL(final Function1<? super C1892750zM1, Unit> function1) {
        int iIntValue;
        if (!LiveShopAddPermissionBusinessSetting.INSTANCE.isEnabled()) {
            return;
        }
        this.LLJILJIL = new InterfaceC1892740zM0() { // from class: X.0zLt
            @Override // X.InterfaceC1892740zM0
            public final void LIZ(C1892750zM1 c1892750zM1) {
                function1.invoke(c1892750zM1);
            }
        };
        Integer num = this.LLJIJIL;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        LJJIII(iIntValue);
    }

    @Override // X.InterfaceC212387189p
    public final void LJIJI(C756930Tmd c756930Tmd) {
        MutableLiveData<Boolean> mutableLiveData;
        if (Intrinsics.LJFF("local_service", c756930Tmd.LIZJ)) {
            IIconSlot.SlotViewModel slotViewModel = this.LLJILJILJ;
            if (slotViewModel != null && (mutableLiveData = slotViewModel.LLILZ) != null && Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.valueOf(c756930Tmd.LIZIZ))) {
                return;
            }
            LJJIIZ(c756930Tmd.LIZIZ);
        }
    }

    public final void LJJII(Map<Integer, Integer> map) {
        boolean z;
        Integer num;
        Integer num2;
        Integer num3;
        boolean z2 = true;
        if (map != null && (((num2 = map.get(19)) != null && num2.intValue() == 1) || ((num3 = map.get(20)) != null && num3.intValue() == 1))) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLJ != z) {
            this.LLJ = z;
            if (!z && ((num = this.LLJIJIL) == null || num.intValue() <= 0)) {
                z2 = false;
            }
            LJJIIZ(z2);
        }
    }

    public final void LJJIII(int i) {
        boolean zBooleanValue;
        MutableLiveData<Boolean> mutableLiveData;
        Boolean value;
        InterfaceC1892740zM0 interfaceC1892740zM0 = this.LLJILJIL;
        if (interfaceC1892740zM0 != null) {
            EnumC756810TmR enumC756810TmR = EnumC756810TmR.SLOT_LIVE_WATCHER_TOOLBAR;
            IIconSlot.SlotViewModel slotViewModel = this.LLJILJILJ;
            if (slotViewModel != null && (mutableLiveData = slotViewModel.LLILZ) != null && (value = mutableLiveData.getValue()) != null) {
                zBooleanValue = value.booleanValue();
            } else {
                zBooleanValue = false;
            }
            interfaceC1892740zM0.LIZ(new C1892750zM1("local_service", enumC756810TmR, zBooleanValue, i, this.LLJJIJIIJIL));
        }
    }

    public final void LJJIIJ(String str) {
        TtlsLiveConfigSettings.ShopBagConfigModel shopBagConfigModel;
        String idStr;
        String string;
        String string2;
        String idStr2;
        String idStr3;
        String requestId;
        String idStr4;
        InterfaceC2262081DgM interfaceC2262081DgMAuthor;
        InterfaceC2262081DgM interfaceC2262081DgMAuthor2;
        InterfaceC2262081DgM interfaceC2262081DgMAuthor3;
        String str2;
        String idStr5;
        String str3 = "";
        if (this.LLJ) {
            Context context = this.LLILLJJLI.getContext();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            TtlsLiveConfigSettings.ShopBagConfigModel shopBagConfigModel2 = TtlsLiveConfigSettings.LIZ().shopBagConfig;
            if (shopBagConfigModel2 == null || (str2 = shopBagConfigModel2.audienceAdminBagClickJumpUrl) == null) {
                str2 = "aweme://roma_redirect/?spark_page=ttls_live_creator_showcase&enter_from=room";
            }
            sbLIZ.append(str2);
            sbLIZ.append("&room_id=");
            Room room = this.LLIZ;
            if (room != null && (idStr5 = room.getIdStr()) != null) {
                str3 = idStr5;
            }
            sbLIZ.append(str3);
            SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ)).open();
            return;
        }
        String str4 = this.LLJI;
        String string3 = null;
        if ((str4 == null || !C1533950q1J.LJ(str4)) && ((shopBagConfigModel = TtlsLiveConfigSettings.LIZ().shopBagConfig) == null || (str4 = shopBagConfigModel.audienceBagClickJumpUrl) == null)) {
            str4 = "aweme://roma_redirect/?spark_page=poi_live_shelf";
        }
        Uri.Builder builderBuildUpon = UriProtector.parse(str4).buildUpon();
        Room room2 = this.LLIZ;
        if (room2 == null || (idStr = room2.getIdStr()) == null) {
            idStr = "";
        }
        builderBuildUpon.appendQueryParameter("room_id", idStr);
        Room room3 = this.LLIZ;
        if (room3 == null || (interfaceC2262081DgMAuthor3 = room3.author()) == null || (string = Long.valueOf(interfaceC2262081DgMAuthor3.getId()).toString()) == null) {
            string = "";
        }
        builderBuildUpon.appendQueryParameter("author_id", string);
        if (str != null && C1533950q1J.LJ(str)) {
            builderBuildUpon.appendQueryParameter("anchor_product_id", str);
        }
        JSONObject jSONObjectLIZ = this.LLILZIL.LIZ();
        Room room4 = this.LLIZ;
        if (room4 != null && (interfaceC2262081DgMAuthor2 = room4.author()) != null) {
            string2 = Long.valueOf(interfaceC2262081DgMAuthor2.getId()).toString();
        } else {
            string2 = null;
        }
        C1189060h32.LJIL(jSONObjectLIZ, "anchor_id", string2);
        Room room5 = this.LLIZ;
        if (room5 != null) {
            idStr2 = room5.getIdStr();
        } else {
            idStr2 = null;
        }
        C1189060h32.LJIL(jSONObjectLIZ, "room_id", idStr2);
        Room room6 = this.LLIZ;
        if (room6 != null) {
            idStr3 = room6.getIdStr();
        } else {
            idStr3 = null;
        }
        C1189060h32.LJIL(jSONObjectLIZ, "ttls_room_id", idStr3);
        Room room7 = this.LLIZ;
        if (room7 != null && (interfaceC2262081DgMAuthor = room7.author()) != null) {
            string3 = Long.valueOf(interfaceC2262081DgMAuthor.getId()).toString();
        }
        C1189060h32.LJIL(jSONObjectLIZ, "ttls_anchor_id", string3);
        jSONObjectLIZ.put("is_local_service_live", "1");
        Room room8 = this.LLIZ;
        if (room8 == null || (requestId = room8.getRequestId()) == null) {
            requestId = "";
        }
        jSONObjectLIZ.put("request_id", requestId);
        builderBuildUpon.appendQueryParameter("pt_info", C786410Ut5.J3(jSONObjectLIZ));
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        PageFinder pageFinderLIZ = C520160Kac.LIZ(this.LLILLJJLI.getContext());
        BcmParams bcmParams = new BcmParams();
        Room room9 = this.LLIZ;
        if (room9 != null && (idStr4 = room9.getIdStr()) != null) {
            str3 = idStr4;
        }
        bcmParams.put("ttls_room_id", str3);
        builderBuildUpon.appendQueryParameter("source_btm_token", btmSDK.createJumpSourceBtmToken("c46805.d96209", pageFinderLIZ, bcmParams));
        SmartRouter.buildRoute(this.LLILLJJLI.getContext(), builderBuildUpon.toString()).open();
    }

    public final void LJJIIJZLJL(int i) {
        MutableLiveData<String> mutableLiveData;
        String strValueOf;
        this.LLJIJIL = Integer.valueOf(i);
        IIconSlot.SlotViewModel slotViewModel = this.LLJILJILJ;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LLILZLL) != null) {
            if (i > 99) {
                strValueOf = "99+";
            } else if (i > 0) {
                strValueOf = String.valueOf(i);
            } else {
                strValueOf = "";
            }
            mutableLiveData.setValue(strValueOf);
        }
        int iIntValue = 0;
        if (i <= 0 && !this.LLJ) {
            if (!this.LLJILLL) {
                LJJIIZ(false);
            }
        } else {
            LJJIIZ(true);
        }
        if (LiveShopAddPermissionBusinessSetting.INSTANCE.isEnabled()) {
            Integer num = this.LLJIJIL;
            if (num != null) {
                iIntValue = num.intValue();
            }
            LJJIII(iIntValue);
        }
    }

    public final void LJJIIZ(boolean z) {
        IIconSlot.SlotViewModel slotViewModel;
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        IIconSlot.SlotViewModel slotViewModel2 = this.LLJILJILJ;
        if ((slotViewModel2 == null || (mutableLiveData2 = slotViewModel2.LLILZ) == null || !Intrinsics.LJFF(Boolean.valueOf(z), mutableLiveData2.getValue())) && (slotViewModel = this.LLJILJILJ) != null && (mutableLiveData = slotViewModel.LLILZ) != null) {
            mutableLiveData.setValue(Boolean.valueOf(z));
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onExposure(String str) throws JSONException {
        String idStr;
        String string;
        String requestId;
        String str2;
        int iIntValue;
        InterfaceC2262081DgM interfaceC2262081DgMAuthor;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("exposure_scene", str);
        LJJIIZI("StepExposure", jSONObject);
        PageFinder pageFinderLIZ = C520160Kac.LIZ(this.LLILLJJLI.getContext());
        Room room = this.LLIZ;
        String str3 = "";
        if (room == null || (idStr = room.getIdStr()) == null) {
            idStr = "";
        }
        Room room2 = this.LLIZ;
        if (room2 == null || (interfaceC2262081DgMAuthor = room2.author()) == null || (string = Long.valueOf(interfaceC2262081DgMAuthor.getId()).toString()) == null) {
            string = "";
        }
        C1892620zLo c1892620zLo = this.LLILZIL;
        String str4 = c1892620zLo.LJIIIIZZ;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = c1892620zLo.LIZ;
        if (str5 == null) {
            str5 = "";
        }
        Room room3 = this.LLIZ;
        if (room3 == null || (requestId = room3.getRequestId()) == null) {
            requestId = "";
        }
        C1892620zLo c1892620zLo2 = this.LLILZIL;
        String str6 = c1892620zLo2.LIZLLL;
        String str7 = c1892620zLo2.LJ;
        String str8 = c1892620zLo2.LJFF;
        String str9 = c1892620zLo2.LJI;
        String str10 = c1892620zLo2.LJII;
        String str11 = c1892620zLo2.LIZIZ;
        if (str11 == null) {
            str11 = "";
        }
        String str12 = c1892620zLo2.LIZJ;
        if (str12 != null) {
            str3 = str12;
        }
        boolean zLJFF = Intrinsics.LJFF(c1892620zLo2.LJIIIZ, Boolean.TRUE);
        String str13 = CardStruct.IStatusCode.DEFAULT;
        if (zLJFF) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        String str14 = this.LLILZIL.LJIIJ;
        if (str14 != null) {
            str13 = str14;
        }
        Map mapCreateReportParams$default = BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "c46805.d96209", pageFinderLIZ, null, 4, null);
        JSONObject jSONObject2 = new JSONObject();
        Integer num = this.LLJIJIL;
        int iIntValue2 = 0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        jSONObject2.put("product_quantity", iIntValue);
        Integer num2 = this.LLJIJIL;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        jSONObject2.put("valid_product_quantity", iIntValue2);
        String str15 = str4;
        C1892630zLp.LIZ("ttls_live_shelf_icon_show", idStr, string, str15, str5, requestId, str6, str7, str8, str9, str10, str11, str3, str2, str13, mapCreateReportParams$default, jSONObject2, new C1185050gwZ(pageFinderLIZ));
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onMessage(IMessage iMessage) throws JSONException {
        String idStr;
        long j;
        Object c098200Yq;
        if (iMessage instanceof TTLSLiveControlMessage) {
            TTLSLiveControlMessage tTLSLiveControlMessage = (TTLSLiveControlMessage) iMessage;
            String str = tTLSLiveControlMessage.roomId;
            Room room = this.LLIZ;
            if (room != null) {
                idStr = room.getIdStr();
            } else {
                idStr = null;
            }
            if (Intrinsics.LJFF(str, idStr)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action_type", tTLSLiveControlMessage.actionType);
                LJJIIZI("StepReceiveLiveMessage", jSONObject);
                int i = tTLSLiveControlMessage.actionType;
                if (i != 0) {
                    if (i != 6) {
                        if (i == 7) {
                            LJJIJIIJI("setRoomBannedState", null, false);
                        }
                    } else {
                        try {
                            if (Intrinsics.LJFF(JSONObjectProtectorUtils.getString(new JSONObject(((TTLSLiveControlMessage) iMessage).extra), "punish_type"), "2")) {
                                LJJIIZ(false);
                            }
                            c098200Yq = Unit.LIZ;
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        C189200o6.m1boximpl(c098200Yq);
                    }
                } else {
                    CommonMessageData commonMessageData = tTLSLiveControlMessage.baseMessage;
                    if (commonMessageData != null) {
                        j = commonMessageData.createTime;
                    } else {
                        j = 0;
                    }
                    this.LLJJIJIIJIL = j;
                    LJJIJIIJI("LS_ACTION_TYPE_LIVE_PRODUCT_NUMBER_CHANGE", null, true);
                }
                try {
                    C326830CrZ.LIZ("ttls_live_message", new JSONObject(((Gson) this.LLILZLL.getValue()).LJIILL(iMessage)));
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2276471E8n.LIZIZ.LIZJ("ttls-live", e, "LSLiveShopBagWidget", "onMessage===send js message error==");
                    return;
                }
            }
        }
        if (iMessage instanceof MemberMessage) {
            MemberMessage memberMessage = (MemberMessage) iMessage;
            int i2 = memberMessage.action;
            if (i2 == 5 || i2 == 6 || i2 == 20) {
                LJJII(memberMessage.adminPermissions);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("message_type", "MemberMessage");
            jSONObject2.put("action_type", memberMessage.action);
            LJJIIZI("StepReceiveLiveMessage", jSONObject2);
        }
    }

    @Override // X.InterfaceC212386189o
    public final void LJIILJJIL(LifecycleOwner lifecycleOwner, AwS146S1100000_32 awS146S1100000_32) {
        MutableLiveData<Boolean> mutableLiveData;
        AObserverS188S0200000_28 aObserverS188S0200000_28 = new AObserverS188S0200000_28((Object) awS146S1100000_32, (View) this, (ViewPagerBottomSheetBehavior<View>) 19);
        IIconSlot.SlotViewModel slotViewModel = this.LLJILJILJ;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LLILZ) != null) {
            mutableLiveData.observe(lifecycleOwner, aObserverS188S0200000_28);
        }
    }

    public final void LJJIIZI(String str, JSONObject jSONObject) {
        String idStr;
        InterfaceC2262081DgM interfaceC2262081DgMAuthor;
        String string;
        Room room = this.LLIZ;
        String str2 = "";
        if (room == null || (idStr = room.getIdStr()) == null) {
            idStr = "";
        }
        Room room2 = this.LLIZ;
        if (room2 != null && (interfaceC2262081DgMAuthor = room2.author()) != null && (string = Long.valueOf(interfaceC2262081DgMAuthor.getId()).toString()) != null) {
            str2 = string;
        }
        jSONObject.put("product_num", String.valueOf(this.LLJIJIL));
        C1892660zLs.LIZ("ttls_rd_live_audience_shopping_bag_step_event", jSONObject, str, idStr, str2);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) throws JSONException {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        Room room;
        AggregationData aggregationData;
        User user;
        UserAttr userAttr;
        Map<Integer, Integer> map;
        AggregationData aggregationData2;
        User user2;
        UserAttr userAttr2;
        String string;
        boolean z;
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) viewModel;
        this.LL = slotViewModel;
        this.LLILLJJLI = interfaceC21213717zz;
        LJJIIZI("StepSlotCreated", new JSONObject());
        Integer num = this.LLJIJIL;
        if (num != null) {
            int iIntValue = num.intValue();
            MutableLiveData<Boolean> mutableLiveData = slotViewModel.LLILZ;
            if (iIntValue > 0) {
                z = true;
            } else {
                z = false;
            }
            mutableLiveData.setValue(Boolean.valueOf(z));
        }
        slotViewModel.LLJILJILJ.setValue(interfaceC21213717zz.getContext().getString(2131857080));
        MutableLiveData<Drawable> mutableLiveData2 = slotViewModel.LLJI;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_storefront_smile;
        mutableLiveData2.setValue(LJJI(c419910GdJ.LIZ(interfaceC21213717zz.getContext())));
        LiveShopAddPermissionBusinessSetting liveShopAddPermissionBusinessSetting = LiveShopAddPermissionBusinessSetting.INSTANCE;
        if (liveShopAddPermissionBusinessSetting.isEnabled()) {
            slotViewModel.LLJIJIL.setValue(new TuxIconDrawable(interfaceC21213717zz.getContext(), R.raw.icon_storefront_smile));
            slotViewModel.LLJILLL.setValue(interfaceC21213717zz.getContext().getString(2131857074));
        }
        this.LLJILJILJ = slotViewModel;
        Room room2 = this.LLIZ;
        if (room2 != null) {
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            PageFinder pageFinderLIZ = C520160Kac.LIZ(interfaceC21213717zz.getContext());
            BcmParams bcmParams = new BcmParams();
            bcmParams.put("ttls_room_id", room2.getIdStr());
            InterfaceC2262081DgM interfaceC2262081DgMAuthor = room2.author();
            if (interfaceC2262081DgMAuthor == null || (string = Long.valueOf(interfaceC2262081DgMAuthor.getId()).toString()) == null) {
                string = "";
            }
            bcmParams.put("ttls_live_author_id", string);
            btmSDK.setBcmPageParams(pageFinderLIZ, bcmParams, Boolean.FALSE);
        }
        LJJIJIIJI("slotCreate", new AwS572S0100000_28(this, 982), false);
        C1706660uVs.LIZLLL = this;
        if (liveShopAddPermissionBusinessSetting.isEnabled() && (room = this.LLIZ) != null && (aggregationData = room.aggregationData) != null && (user = aggregationData.audience) != null && (userAttr = user.getUserAttr()) != null && userAttr.adminPermissions != null) {
            Room room3 = this.LLIZ;
            if (room3 != null && (aggregationData2 = room3.aggregationData) != null && (user2 = aggregationData2.audience) != null && (userAttr2 = user2.getUserAttr()) != null) {
                map = userAttr2.adminPermissions;
            } else {
                map = null;
            }
            LJJII(map);
        }
        LifecycleOwner lifecycleOwner = interfaceC21213717zz.getLifecycleOwner();
        if (lifecycleOwner != null) {
            this.LLIZLLLIL = new WeakReference<>(lifecycleOwner);
            ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
            if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null) {
                interfaceC20673515v3K4.cb(lifecycleOwner, new AwS607S0100000_28(this, 349));
            }
        }
    }

    @Override // X.InterfaceC1124060fMC
    public final void prepareToShow(Map<String, ? extends Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        Room room;
        String str;
        TTLSRoomInfo tTLSRoomInfo;
        Object obj = map.get("param_room");
        Integer numValueOf = null;
        if (obj instanceof Room) {
            room = (Room) obj;
        } else {
            room = null;
        }
        this.LLIZ = room;
        if (room != null && (tTLSRoomInfo = room.ttlsRoomInfo) != null) {
            numValueOf = Integer.valueOf(tTLSRoomInfo.productCount);
        }
        this.LLJIJIL = numValueOf;
        this.LLILZIL.LIZIZ(map);
        boolean z = true;
        this.LLJJI = Intrinsics.LJFF(map.get("param_extra_ttls_auto_bag_route_params"), 1);
        Object obj2 = map.get("param_extra_ttls_bag_auto_anchor_product_id");
        if (!(obj2 instanceof String) || (str = (String) obj2) == null) {
            str = "";
        }
        this.LLJJIII = str;
        Room room2 = this.LLIZ;
        if (room2 == null || (!room2.existedTtlsGoods && !room2.hasTtlsLivePermission)) {
            z = false;
        }
        interfaceC756140TlM.LIZ(z);
    }

    public final void LJJIJIIJI(String str, Function0 function0, boolean z) throws JSONException {
        long jNextInt;
        InterfaceC497601wk viewModelScope;
        int iIntValue;
        Integer num;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("source", str);
        jSONObject.put("needDelay", z);
        LJJIIZI("StepRequestData", jSONObject);
        if (z) {
            Random random = (Random) this.LLJJIJI.getValue();
            TtlsLiveConfigSettings.ShopBagConfigModel shopBagConfigModel = TtlsLiveConfigSettings.LIZ().shopBagConfig;
            if (shopBagConfigModel != null && (num = shopBagConfigModel.requestDelayRange) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 800;
            }
            jNextInt = random.nextInt(iIntValue);
        } else {
            jNextInt = 0;
        }
        IIconSlot.SlotViewModel slotViewModel = this.LLJILJILJ;
        if (slotViewModel != null && (viewModelScope = ViewModelKt.getViewModelScope(slotViewModel)) != null) {
            C23250099c.LIZLLL(viewModelScope, null, null, new C1892300zLI(jNextInt, this, function0, str, null), 3);
        }
    }
}
