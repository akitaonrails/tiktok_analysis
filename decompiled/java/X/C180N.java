package X;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.broadcast.model.GoLiveECIconInfo;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.beforelive.slot.preview.model.ECBeforeBroadcastSourceParams;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.beforelive.slot.preview.model.ECParams;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.settings.ECBroadcastShoppingIconSetting;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.settings.AnchorLiveBagListOptConfig;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

/* JADX INFO: renamed from: X.180N, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C180N extends AnonymousClass1802<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> implements C01SH, InterfaceC1141530foN {
    public final Context LLILZ;
    public IIconSlot.SlotViewModel LLILZLL;
    public C594370NSx LLIZLLLIL;
    public GoLiveECIconInfo LLJ;
    public boolean LLJILLL;
    public ECParams LLJJ;
    public final C180Q LLJJI;
    public final C212142180e LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public InterfaceC21213717zz LLJJIJIL;
    public final C1743900vTw LLILZIL = new C1743900vTw();
    public final C054G LLIZ = C2296808zG.LIZ(C2126308Ur.LJFF);
    public Integer LLJI = 0;
    public String LLJIJIL = "";
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 653));
    public String LLJILJILJ = "homepage";

    @Override // X.InterfaceC1124060fMC
    public String LIZ() {
        return "ec_shop";
    }

    @Override // X.C01SH
    public final Object LJIILLIIL(String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return LJJIIZI(this, interfaceC1364105Vn);
    }

    public String LJJI() {
        return "ECProductBeforeLiveWidget";
    }

    public final C180O LJJII() {
        return (C180O) this.LLJILJIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJZLJL() {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C180N.LJJIIJZLJL():void");
    }

    public boolean LJJIIZ() {
        GoLiveECIconInfo goLiveECIconInfo = this.LLJ;
        return (goLiveECIconInfo == null || !goLiveECIconInfo.displayEcIcon || goLiveECIconInfo.independentDisplayEcIcon) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.180T] */
    public final void LJJIJ() {
        String str;
        GoLiveECIconInfo goLiveECIconInfo = this.LLJ;
        if (goLiveECIconInfo == null || (str = goLiveECIconInfo.bubbleText) == null || str.length() == 0) {
            return;
        }
        C23250099c.LIZLLL(this.LLIZ, null, null, new C1568890qvf(this, str, new InterfaceC1123790fLl() { // from class: X.180T
            @Override // X.InterfaceC1123790fLl
            public final void onDismiss() {
                C608200NtK.LIZ(C608200NtK.LIZ, "ec_icon_bubble_hidden", null, null, null, null, null, 62);
            }

            @Override // X.InterfaceC1123790fLl
            public final void onShow() {
                C180N c180n = this.LIZ;
                IIconSlot.SlotViewModel slotViewModel = c180n.LLILZLL;
                if (slotViewModel != null) {
                    slotViewModel.LLLFZ = Boolean.TRUE;
                }
                C180R.LIZIZ(c180n.LLILZIL, new AwS611S0100000_32(c180n, 314));
                C608200NtK.LIZ(C608200NtK.LIZ, "ec_icon_bubble_show", null, null, null, null, null, 62);
            }
        }, null), 3);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final List<EnumC742820TBw> LJLI() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(EnumC742820TBw.LIVE_PREVIEW_BC_TOGGLE_INFO);
        return arrayList;
    }

    @Override // X.AnonymousClass1802, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDestroy() {
        C180W c180wLIZ;
        C180A c180a = this.LLILLL;
        c180a.LIZ = 0L;
        c180a.LIZIZ = true;
        C622680Oba.LIZLLL(this);
        C1548820qPI.LJIIIIZZ("talent_live_product_list_num", this);
        C1548820qPI.LJIIIIZZ("open_admin_list_dialog", this);
        C1548820qPI.LJIIIIZZ("creator_go_live_bubble", this);
        C2296808zG.LIZJ(this.LLIZ, null);
        if (LJJIIZ()) {
            C180O c180oLJJII = LJJII();
            int iHashCode = hashCode();
            c180oLJJII.LIZ = null;
            c180oLJJII.LIZLLL = true;
            c180oLJJII.LJ = 3;
            Set<Integer> set = C180O.LJI;
            set.remove(Integer.valueOf(iHashCode));
            if (set.isEmpty() && (c180wLIZ = C180Y.LIZ()) != null) {
                c180wLIZ.destroy();
            }
            c180oLJJII.LIZIZ = null;
            c180oLJJII.LJFF = null;
        }
        C594370NSx c594370NSx = this.LLIZLLLIL;
        if (c594370NSx != null) {
            if (c594370NSx.LIZ != null) {
                C596950NbB.LIZ.clear();
                C596970NbD.LIZIZ.LIZIZ(EnumC1733330vCt.EC_LIVE_BILLBOARD_DISPLAY);
            }
            C1729400v6Y.LIZ.getClass();
            C054G c054g = C1729400v6Y.LJFF;
            if (c054g != null) {
                C2296808zG.LIZLLL(c054g, "");
            }
            C1729400v6Y.LJFF = null;
        }
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).startLiveManager().LJ((C0URV) this.LLJJIJIIJIL.getValue());
        if (!((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).t5()) {
            C21211017zY.LIZ.getClass();
            if (C21211017zY.LIZLLL) {
                C1546560qLe.LIZ.getClass();
                C1546500qLY.LJIIIIZZ("ec_anchor_shop_bag_biz");
                C21211017zY.LIZLLL = false;
            }
        }
        if (((AtomicBoolean) this.LLJJIJI.getValue()).get()) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZIZ), null, null, new C594150NSb(null), 3);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onResume() {
        ((AtomicBoolean) this.LLJJIJI.getValue()).compareAndSet(false, true);
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).startLiveManager().LJI((C0URV) this.LLJJIJIIJIL.getValue());
    }

    public static final String LJJ() {
        String currentUserID;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        return (iUserService == null || (currentUserID = iUserService.getCurrentUserID()) == null) ? "" : currentUserID;
    }

    @Override // X.InterfaceC1124060fMC
    public final Object LLILZLL() {
        return LJJIII();
    }

    public Context LJJIFFI() {
        return this.LLILZ;
    }

    public C212142180e LJJIII() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC1124060fMC
    /* JADX INFO: renamed from: LJJIIJ, reason: merged with bridge method [inline-methods] */
    public EnumC756810TmR LLJ() {
        return EnumC756810TmR.SLOT_BROADCAST_PREVIEW_TOOLBAR;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.180Q] */
    public C180N(Context context) {
        this.LLILZ = context;
        ?? r1 = new AbstractC757140Tmy() { // from class: X.180Q
            @Override // X.AbstractC757140Tmy
            public final void LIZIZ() {
                MutableLiveData<Boolean> mutableLiveData;
                AnchorLiveBagListOptConfig anchorLiveBagListOptConfigLIZ = C21211217za.LIZ();
                C180N c180n = this.LJ;
                C1743900vTw c1743900vTw = c180n.LLILZIL;
                IIconSlot.SlotViewModel slotViewModel = c180n.LLILZLL;
                c1743900vTw.LJIIIIZZ("is_bubble_show", slotViewModel != null ? Intrinsics.LJFF(slotViewModel.LLLFZ, Boolean.TRUE) : false ? "1" : CardStruct.IStatusCode.DEFAULT, false);
                Map<String, String> map = C180R.LIZ(this.LJ.LLILZIL).LIZ;
                ((HashMap) map).put("user_type", "author");
                C1507790pL7.LIZ.getClass();
                C1507790pL7.LIZJ("livesdk_tiktokec_product_icon_click", map);
                C608200NtK.LIZ(C608200NtK.LIZ, "ec_icon_click", null, null, null, null, null, 62);
                IIconSlot.SlotViewModel slotViewModel2 = this.LJ.LLILZLL;
                if (slotViewModel2 != null && (mutableLiveData = slotViewModel2.LLIZ) != null) {
                    mutableLiveData.setValue(Boolean.FALSE);
                }
                this.LJ.LLILZIL.LJIIIIZZ("is_red_dot", CardStruct.IStatusCode.DEFAULT, false);
                C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZIZ), null, null, new C612280Nzu(anchorLiveBagListOptConfigLIZ, this.LJ, null), 3);
            }

            {
                super(500L);
            }
        };
        this.LLJJI = r1;
        this.LLJJIII = new C212142180e(r1);
        this.LLJJIJI = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(209));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 654));
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        long jLIZLLL;
        Map<String, Object> mapLIZ;
        InterfaceC1107590evd interfaceC1107590evdLJ;
        String strLJFF;
        MutableLiveData<String> mutableLiveData;
        InterfaceC1012330cRz interfaceC1012330cRzF4;
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        DialogFragment dialogFragmentX4;
        String strLJFF2;
        String str = c262100zr.LIZ;
        int iHashCode = str.hashCode();
        String strValueOf = "";
        int iLIZLLL = 0;
        if (iHashCode != -1801535781) {
            if (iHashCode != 543288725) {
                if (iHashCode == 2004463716 && str.equals("open_admin_list_dialog") && (c19egLIZIZ = C1388190mED.LIZIZ(LJJIFFI())) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                    InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                    if (interfaceC1107590evd != null && (strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd, "page", "")) != null) {
                        strValueOf = strLJFF2;
                    }
                    if (Intrinsics.LJFF("before_live", strValueOf) && (dialogFragmentX4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).X4(EnumC752540TfY.MODERATOR_LIST)) != null) {
                        dialogFragmentX4.show(supportFragmentManager, "BasePreviewSettingDialog");
                        return;
                    }
                    return;
                }
                return;
            }
            if (!str.equals("talent_live_product_list_num")) {
                return;
            }
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 != null) {
                iLIZLLL = C1871910yoP.LIZLLL(interfaceC1107590evd2, "productNum", 0);
            }
            C0O01.LIZ = iLIZLLL;
            ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
            if (iLiveOuterService != null && (interfaceC1012330cRzF4 = iLiveOuterService.F4()) != null) {
                interfaceC1012330cRzF4.LIZJ(iLIZLLL);
            }
            IIconSlot.SlotViewModel slotViewModel = this.LLILZLL;
            if (slotViewModel != null && (mutableLiveData = slotViewModel.LLILZLL) != null) {
                if (iLIZLLL > 0) {
                    strValueOf = String.valueOf(iLIZLLL);
                }
                mutableLiveData.setValue(strValueOf);
            }
            C180O c180oLJJII = LJJII();
            String str2 = c180oLJJII.LIZIZ;
            if (str2 == null) {
                return;
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZIZ), null, null, new C180P(str2, c180oLJJII, null), 3);
            return;
        }
        if (!str.equals("creator_go_live_bubble")) {
            return;
        }
        InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
        if (interfaceC1107590evd3 != null && (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd3, "bubble_text", "")) != null) {
            strValueOf = strLJFF;
        }
        InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
        if (interfaceC1107590evd4 != null) {
            jLIZLLL = C1871910yoP.LIZLLL(interfaceC1107590evd4, "delay", 0);
        } else {
            jLIZLLL = 0;
        }
        InterfaceC1107590evd interfaceC1107590evd5 = c262100zr.LIZIZ;
        if (interfaceC1107590evd5 != null && (interfaceC1107590evdLJ = C1871910yoP.LJ(interfaceC1107590evd5, "event_params")) != null) {
            mapLIZ = interfaceC1107590evdLJ.LIZ();
        } else {
            mapLIZ = null;
        }
        if (strValueOf.length() <= 0) {
            return;
        }
        C23250099c.LIZLLL(this.LLIZ, null, null, new C1568900qvg(jLIZLLL, this, strValueOf, mapLIZ, null), 3);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget
    public final void onAggregateExposure(String str) {
        super.onAggregateExposure(str);
        this.LLJILLL = true;
        LJJIJ();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onECJsBroadCastEvent(C034G c034g) {
        String str;
        String str2 = c034g.LIZ;
        if (str2 == null) {
            return;
        }
        switch (str2.hashCode()) {
            case -2046421746:
                if (!str2.equals("notify_kyc_status_refresh")) {
                    return;
                }
                break;
            case 469438145:
                if (!str2.equals("affiliate_tos_page_close")) {
                    return;
                }
                break;
            case 1650323674:
                if (!str2.equals("affiliate_self_apply_page_close")) {
                    return;
                }
                break;
            case 1676071340:
                if (!str2.equals("notify_kyc_id_verification_popup")) {
                    return;
                }
                break;
            default:
                return;
        }
        String strLIZLLL = C1731220v9U.LIZLLL(str2, c034g.LIZIZ);
        this.LLJILJILJ = strLIZLLL;
        this.LLILZIL.LJIIIIZZ("previous_page", strLIZLLL, false);
        ECParams eCParams = this.LLJJ;
        if (eCParams == null || (str = eCParams.ecIconBubbleText) == null) {
            return;
        }
        C23250099c.LIZLLL(this.LLIZ, null, null, new C1568910qvh(this, str, null), 3);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onECOpenProductListEvent(C767402zA c767402zA) {
        SmartRouter.buildRoute(LJJIFFI(), LJJII().LIZJ()).open();
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onExposure(String str) {
        C608200NtK.LIZ(C608200NtK.LIZ, "ec_icon_show", null, null, null, null, null, 62);
        this.LLILZIL.LJIIIIZZ("ec_icon_show_position", C1731220v9U.LIZ(null, this.LLJ), false);
        C1743900vTw c1743900vTw = this.LLILZIL;
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map<String, String> map = C180R.LIZ(c1743900vTw).LIZ;
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_product_icon_show", map);
        String strLJJ = LJJ();
        C180A c180a = this.LLILLL;
        if (c180a.LIZIZ) {
            c180a.LIZIZ = false;
            C2010807uE.LIZ(System.currentTimeMillis() - c180a.LIZ, "rd_tiktokec_before_live_icon_show", strLJJ, CardStruct.IStatusCode.DEFAULT);
        }
        if (!this.LLJILLL) {
            LJJIJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LJJIIZI(X.C180N r11, X.InterfaceC1364105Vn r12) {
        /*
            boolean r0 = r12 instanceof X.C1568930qvj
            if (r0 == 0) goto L80
            r3 = r12
            X.0qvj r3 = (X.C1568930qvj) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L80
            int r2 = r2 - r1
            r3.LLILZ = r2
        L12:
            java.lang.Object r2 = r3.LLILLJJLI
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r3.LLILZ
            r4 = 3
            r10 = 0
            r6 = 1
            if (r0 == 0) goto L5a
            if (r0 != r6) goto L8c
            X.180N r11 = r3.LL
            X.C155000ia.LIZIZ(r2)
        L26:
            X.0NSP r2 = (X.C0NSP) r2
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse<java.lang.String> r0 = r2.LIZ
            if (r0 == 0) goto L86
            boolean r0 = r0.isSuccess()
            if (r0 != r6) goto L86
            com.bytedance.android.live.slot.IIconSlot$SlotViewModel r0 = r11.LLILZLL
            if (r0 == 0) goto L3f
            androidx.lifecycle.MutableLiveData<java.lang.String> r1 = r0.LLILZLL
            if (r1 == 0) goto L3f
            java.lang.String r0 = ""
            r1.postValue(r0)
        L3f:
            X.180O r3 = r11.LJJII()
            java.lang.String r2 = r3.LIZIZ
            if (r2 == 0) goto L55
            X.08Us r0 = X.C2126308Ur.LIZIZ
            X.054G r1 = X.C2296808zG.LIZ(r0)
            X.180P r0 = new X.180P
            r0.<init>(r2, r3, r10)
            X.C23250099c.LIZLLL(r1, r10, r10, r0, r4)
        L55:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        L5a:
            X.C155000ia.LIZIZ(r2)
            X.0NSR r9 = new X.0NSR
            r9.<init>()
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            r3.LL = r11
            r3.LLILZ = r6
            X.08Us r0 = X.C2126308Ur.LIZIZ
            X.054G r0 = X.C2296808zG.LIZ(r0)
            X.0NSO r5 = new X.0NSO
            r5.<init>(r6, r7, r8, r9, r10)
            X.099G r0 = X.C23250099c.LIZIZ(r0, r10, r10, r5, r4)
            java.lang.Object r2 = r0.LJLIIIL(r3)
            if (r2 != r1) goto L26
            return r1
        L80:
            X.0qvj r3 = new X.0qvj
            r3.<init>(r11, r12)
            goto L12
        L86:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L8c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C180N.LJJIIZI(X.180N, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) throws JSONException {
        String str;
        boolean z;
        MutableLiveData<Boolean> mutableLiveData;
        String str2;
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) viewModel;
        this.LL = slotViewModel;
        this.LLILLJJLI = interfaceC21213717zz;
        slotViewModel.LLLI = EnumC756890TmZ.ECOMMERCE;
        this.LLILZLL = slotViewModel;
        this.LLJJIJIL = interfaceC21213717zz;
        boolean z2 = true;
        C21207817z2.LIZJ(slotViewModel, true);
        Integer num = this.LLJI;
        if (num != null && num.intValue() == 0) {
            str = ECBroadcastShoppingIconSetting.LIZ().guideIconImage;
        } else {
            str = this.LLJIJIL;
        }
        C1731220v9U.LJ(LJJIFFI(), slotViewModel.LLJ, str, R.drawable.bm4, CardStruct.IStatusCode.DEFAULT, LJJ());
        slotViewModel.LLJILJILJ.setValue(C1731220v9U.LIZIZ(LJJIFFI(), 2131822055, ECBroadcastShoppingIconSetting.LIZ().iconTitle));
        C1731220v9U.LJ(LJJIFFI(), slotViewModel.LLJIJIL, ECBroadcastShoppingIconSetting.LIZ().innerIconImage, R.drawable.blq, CardStruct.IStatusCode.DEFAULT, LJJ());
        slotViewModel.LLJILLL.setValue(C1731220v9U.LIZIZ(LJJIFFI(), 2131822047, ECBroadcastShoppingIconSetting.LIZ().iconInnerTitle));
        GoLiveECIconInfo goLiveECIconInfo = this.LLJ;
        if (goLiveECIconInfo != null && goLiveECIconInfo.isOldRedDotLogic) {
            z = true;
        } else {
            z = false;
        }
        String str3 = "1";
        if (z) {
            Keva keva = C438901nH.LIZ;
            if (keva.getBoolean("need_show_ec_red_dot_IN_PREVIEW_LIVEING_ROOM", true)) {
                slotViewModel.LLIZ.setValue(Boolean.TRUE);
                this.LLILZIL.LJIIIIZZ("is_red_dot", "1", false);
                keva.storeBoolean("need_show_ec_red_dot_IN_PREVIEW_LIVEING_ROOM", false);
            } else {
                slotViewModel.LLIZ.setValue(Boolean.FALSE);
                this.LLILZIL.LJIIIIZZ("is_red_dot", CardStruct.IStatusCode.DEFAULT, false);
                C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZIZ), null, null, new C0NSU(System.currentTimeMillis(), this, null), 3);
            }
        } else {
            if (goLiveECIconInfo == null || !goLiveECIconInfo.displayRedDot) {
                z2 = false;
            }
            IIconSlot.SlotViewModel slotViewModel2 = this.LLILZLL;
            if (slotViewModel2 != null && (mutableLiveData = slotViewModel2.LLIZ) != null) {
                mutableLiveData.setValue(Boolean.valueOf(z2));
            }
            C1743900vTw c1743900vTw = this.LLILZIL;
            if (!z2) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c1743900vTw.LJIIIIZZ("is_red_dot", str3, false);
            C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZIZ), null, null, new C0NSU(System.currentTimeMillis(), this, null), 3);
        }
        LJJIIJZLJL();
        C622680Oba.LIZJ(this);
        C1548820qPI.LJFF("talent_live_product_list_num", this, LJJI());
        C1548820qPI.LJFF("open_admin_list_dialog", this, LJJI());
        C1548820qPI.LJFF("creator_go_live_bubble", this, LJJI());
        ECParams eCParams = this.LLJJ;
        if (eCParams != null && (str2 = eCParams.autoSchema) != null) {
            SmartRouter.buildRoute(LJJIFFI(), str2).open();
        }
    }

    @Override // X.InterfaceC1124060fMC
    public final void prepareToShow(Map<String, ? extends Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        GoLiveECIconInfo goLiveECIconInfo;
        Integer num;
        String str;
        ECParams eCParams;
        boolean z;
        Boolean boolValueOf;
        String str2;
        ECBeforeBroadcastSourceParams eCBeforeBroadcastSourceParams;
        Object obj = map.get("param_create_info_ec_icon_info");
        if (obj instanceof GoLiveECIconInfo) {
            goLiveECIconInfo = (GoLiveECIconInfo) obj;
        } else {
            goLiveECIconInfo = null;
        }
        this.LLJ = goLiveECIconInfo;
        Object obj2 = map.get("param_live_revision_lib");
        if (obj2 instanceof Integer) {
            num = (Integer) obj2;
        } else {
            num = null;
        }
        this.LLJI = num;
        Object obj3 = map.get("param_live_revision_shop_icon_url");
        if (obj3 instanceof String) {
            str = (String) obj3;
        } else {
            str = null;
        }
        this.LLJIJIL = str;
        Object obj4 = map.get("param_is_hidden_ec_widget");
        if (!(obj4 instanceof Boolean)) {
            obj4 = null;
        }
        try {
            Gson gson = C7740030o.LIZ().getGson();
            Object obj5 = map.get("param_before_live_ec_params");
            if (obj5 instanceof String) {
                str2 = (String) obj5;
            } else {
                str2 = null;
            }
            eCBeforeBroadcastSourceParams = (ECBeforeBroadcastSourceParams) gson.LJII(str2, ECBeforeBroadcastSourceParams.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (eCBeforeBroadcastSourceParams != null) {
            eCParams = eCBeforeBroadcastSourceParams.ecParams;
        } else {
            eCParams = null;
        }
        this.LLJJ = eCParams;
        LJJIIJZLJL();
        if (LJJIIZ() && !Intrinsics.LJFF(obj4, Boolean.TRUE)) {
            z = true;
        } else {
            z = false;
        }
        interfaceC756140TlM.LIZ(z);
        GoLiveECIconInfo goLiveECIconInfo2 = this.LLJ;
        if (goLiveECIconInfo2 != null) {
            boolValueOf = Boolean.valueOf(goLiveECIconInfo2.hasEcLivePermission);
        } else {
            boolValueOf = null;
        }
        if (LJJIIZ() && Intrinsics.LJFF(boolValueOf, Boolean.TRUE) && ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).isLiveCreatorBCToggleAvailable()) {
            LJJII().LJ(LJJ());
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            C23250099c.LIZLLL(this.LLIZ, null, null, new C594340NSu(this, null), 3);
        }
    }
}
