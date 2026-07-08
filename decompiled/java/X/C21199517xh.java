package X;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.ISeaLiveContextAbility;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphere;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.settings.PinCardStyleConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.Pair;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.17xh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21199517xh extends AbstractC21194217wq implements InterfaceC21200917xv, InterfaceC19379010rk, InterfaceC1141530foN {
    public final Context LLLLIIL;
    public final boolean LLLLIILL;
    public boolean LLLLIILLL;
    public C21200117xn LLLLIL;
    public C21200017xm LLLLILI;
    public final boolean LLLLJ;
    public final C01GW LLLLJI;
    public C21199217xe LLLLL;
    public boolean LLLLLIL;
    public final C21199817xk LLLLLILLIL;
    public final C21203617yM LLLLLJIL;

    @Override // X.AbstractC21194217wq
    public final boolean LJJIL() {
        return false;
    }

    @Override // X.AbstractC21194217wq
    public final boolean LJJJIL() {
        return true;
    }

    @Override // X.InterfaceC21200917xv
    public final void LIZJ() {
        C21200017xm c21200017xm;
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("checkToDismiss");
        C21199217xe c21199217xe = this.LLLLL;
        if (c21199217xe != null) {
            c21199217xe.LIZJ();
        }
        this.LLLLL = null;
        C21200117xn c21200117xn = this.LLLLIL;
        if (c21200117xn != null && (c21200017xm = this.LLLLILI) != null) {
            c21200017xm.LJFF(c21200117xn, true);
        }
        this.LLLLIL = null;
        LJJLIIIJILLIZJL(false);
    }

    @Override // X.AbstractC21194217wq
    public final void LJJIFFI() {
        C21200017xm c21200017xm;
        this.LLLLLJIL.LLJJJJJIL = !ActivityStack.isAppBackGround() ? "time_out" : this.LLJI.LJIIIIZZ;
        C21199217xe c21199217xe = this.LLLLL;
        if (c21199217xe != null) {
            c21199217xe.LIZJ();
        }
        this.LLLLL = null;
        C21200117xn c21200117xn = this.LLLLIL;
        if (c21200117xn != null && (c21200017xm = this.LLLLILI) != null) {
            c21200017xm.LJFF(c21200117xn, true);
        }
        this.LLLLIL = null;
        LJJLIIIJILLIZJL(false);
    }

    public final void LJJLI() {
        C1783930wWV c1783930wWVN0;
        C1783920wWU c1783920wWU;
        AbstractC21200217xo abstractC21200217xo;
        Integer num;
        InterfaceC599740Nfg interfaceC599740NfgSU1;
        String str = null;
        LJJJLZIJ(EnumC21193117wf.PREPARE_TO_SHOW, null);
        PopupCardVO popupCardVO = this.LLLLLJIL.LL;
        C21199217xe c21199217xe = this.LLLLL;
        if (c21199217xe != null) {
            c21199217xe.LIZJ();
        }
        this.LLLLL = null;
        C21193917wn.LIZ.getClass();
        Pair pairLIZJ = C21193917wn.LIZJ(popupCardVO);
        boolean zBooleanValue = ((Boolean) pairLIZJ.getFirst()).booleanValue();
        String str2 = (String) pairLIZJ.getSecond();
        PopupCardVO popupCardVO2 = this.LLLLLJIL.LL;
        if (popupCardVO2 == null || popupCardVO2.cardType != 3) {
            if (!zBooleanValue) {
                LJJLIIIIJ();
                return;
            }
        } else if (!zBooleanValue) {
            LJJJLZIJ(EnumC21193117wf.FAIL_LYNX_LOAD_FAIL, "coupon lynx config missing");
            return;
        }
        if (popupCardVO == null) {
            return;
        }
        ISeaLiveContextAbility iSeaLiveContextAbility = this.LLJZIJLIL;
        Object objLIZIZ = (iSeaLiveContextAbility == null || (interfaceC599740NfgSU1 = iSeaLiveContextAbility.SU1()) == null) ? null : interfaceC599740NfgSU1.LIZIZ("role_type", EnumC599400Nf8.NATIVE, C2097608Jq.LJ());
        int iIntValue = (!(objLIZIZ instanceof Integer) || (num = (Integer) objLIZIZ) == null) ? 2 : num.intValue();
        T t = this.LLLLLJIL.LLILZIL;
        if (!(t instanceof C21197717xP) || (abstractC21200217xo = (AbstractC21200217xo) t) == null) {
            c1783930wWVN0 = null;
        } else {
            c1783930wWVN0 = abstractC21200217xo.n0(popupCardVO, str2, iIntValue, this.LLLLLIL);
            if (c1783930wWVN0 != null) {
                str = c1783930wWVN0.LIZ;
            }
        }
        if (c1783930wWVN0 == null || (c1783920wWU = c1783930wWVN0.LIZIZ) == null) {
            c1783920wWU = new C1783920wWU(popupCardVO.cardType, str2, iIntValue);
        }
        C599810Nfn.LIZ.getClass();
        C599810Nfn.LIZ("ECLiveWatcherExplanationCardWidget", "addShowTask: start load & pending");
        C21200317xp c21200317xp = (C21200317xp) this.LLL.getValue();
        C21199217xe c21199217xe2 = new C21199217xe(c21200317xp, this);
        this.LLLLL = c21199217xe2;
        c21200317xp.LIZIZ(this.LLLLIIL, c1783920wWU, str, this.LLJZIJLIL, c21199217xe2);
    }

    public final void LJJLIIIIJ() {
        C21200117xn c21200117xn;
        if (this.LLLLILI == null) {
            C21199917xl c21199917xl = C21199917xl.LIZ;
            Room room = this.LLJILLL;
            this.LLLLILI = c21199917xl.LIZ(room != null ? Long.valueOf(room.getId()) : null);
        }
        if (this.LLLLIL == null) {
            C21200017xm c21200017xm = this.LLLLILI;
            if (c21200017xm == null || (c21200117xn = c21200017xm.LIZLLL(0)) == null) {
                c21200117xn = new C21200117xn(0, 200);
            }
            this.LLLLIL = c21200117xn;
        }
        C21200117xn c21200117xn2 = this.LLLLIL;
        if (c21200117xn2 != null) {
            c21200117xn2.LIZJ = new AwS611S0100000_32(this, 382);
        }
        C21200017xm c21200017xm2 = this.LLLLILI;
        if (c21200017xm2 != null) {
            c21200017xm2.LIZIZ(this.LLLLIL);
        }
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [X.09AY, kotlin.jvm.functions.Function0] */
    public final void LJJLIIIJ() {
        PopupCardVO popupCardVO;
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo;
        FlashSaleAtmosphere flashSaleAtmosphere;
        Integer numValueOf;
        C21213117zt.LIZ.getClass();
        if (C21213117zt.LIZIZ(false) && !this.LLLLIILLL) {
            this.LLLLIILLL = true;
            C1440005kM.LIZ(new C591940NJo(3, true));
            return;
        }
        PopupCardVO popupCardVO2 = this.LLLLLJIL.LL;
        String strValueOf = String.valueOf(popupCardVO2 != null ? Long.valueOf(popupCardVO2.productId) : null);
        Room room = this.LLJILLL;
        String string = room != null ? Long.valueOf(room.getId()).toString() : null;
        String strLJJIJ = AbstractC21194217wq.LJJIJ();
        boolean z = this.LLLI;
        String strLJJIJIL = LJJIJIL();
        boolean z2 = this.LLJJI;
        PopupCardVO popupCardVO3 = this.LLLLLJIL.LL;
        Integer numValueOf2 = popupCardVO3 != null ? Integer.valueOf(popupCardVO3.cardType) : null;
        try {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("product_id", strValueOf);
            jSONObject.put("room_id", string);
            jSONObject.put("author_id", strLJJIJ);
            jSONObject.put("has_ec_perm", z ? 1 : 0);
            jSONObject.put("live_role", strLJJIJIL);
            jSONObject.put("is_waiting_coupon", 0);
            jSONObject.put("is_page_visible", z2 ? 1 : 0);
            jSONObject.put("card_type", numValueOf2);
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_rd_tiktokec_live_pop_product_show_start", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LLLLIILLL = false;
        LJJLIIIJILLIZJL(true);
        PopupCardVO popupCardVO4 = this.LLLLLJIL.LL;
        if (popupCardVO4 != null && (flashSaleAtmosphereInfo = popupCardVO4.flashSaleAtmosphereInfo) != null && (flashSaleAtmosphere = flashSaleAtmosphereInfo.flashSaleAtmosphere) != null && (numValueOf = Integer.valueOf(flashSaleAtmosphere.status)) != null && (numValueOf.intValue() == 2 || numValueOf.intValue() == 3)) {
            ?? r0 = this.LLLLLJIL.LLJILJIL;
            if (r0 != 0) {
                r0.invoke();
                return;
            }
            return;
        }
        C21199817xk c21199817xk = this.LLLLLILLIL;
        c21199817xk.LIZ.LLLF.removeMessages(0);
        C21193917wn c21193917wn = C21193917wn.LIZ;
        PopupCardVO popupCardVO5 = c21199817xk.LIZ.LJJIJIIJI().LL;
        c21193917wn.getClass();
        if (C21193917wn.LJFF(popupCardVO5) && (popupCardVO = c21199817xk.LIZ.LJJIJIIJI().LL) != null && popupCardVO.cardType == 99) {
            return;
        }
        BPEAHandler bPEAHandler = c21199817xk.LIZ.LLLF;
        PinCardStyleConfig pinCardStyleConfigLIZ = C21196617xE.LIZ();
        PopupCardVO popupCardVO6 = c21199817xk.LIZ.LJJIJIIJI().LL;
        C786410Ut5.LJLJJI(0, pinCardStyleConfigLIZ.LIZIZ(popupCardVO6 != null ? Integer.valueOf(popupCardVO6.cardType) : null), bPEAHandler);
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return this.LLLLIILL ? EnumC1124020fM8.SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE : EnumC1124020fM8.SLOT_LIVE_WATCHER_L3_POP;
    }

    @Override // X.AbstractC21194217wq, X.AbstractC21206817ys, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDestroy() {
        String idStr;
        C21200017xm c21200017xm;
        C21199217xe c21199217xe = this.LLLLL;
        if (c21199217xe != null) {
            c21199217xe.LIZJ();
        }
        this.LLLLL = null;
        C21200117xn c21200117xn = this.LLLLIL;
        if (c21200117xn != null && (c21200017xm = this.LLLLILI) != null) {
            c21200017xm.LJFF(c21200117xn, false);
        }
        this.LLLLIL = null;
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ("ec_live_end_event", "{}");
        EventBus.LIZLLL().LJJI(this);
        C1548820qPI.LJIIIIZZ("live_refresh_pin_product", this);
        C1548820qPI.LJIIIIZZ("ec_shop_bag_claim_surprise_coupon", this);
        Room room = this.LLJILLL;
        if (room != null && (idStr = room.getIdStr()) != null) {
            if (LJJII(this.LLLLLJIL.LLILLL)) {
                C19378910rj.LIZJ(idStr, "SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE");
            }
            C19378910rj.LJ(idStr, "SLOT_BAG_BUBBLE_SHOW", this);
            C19378910rj.LJ(idStr, "SLOT_SHOP_BAG_GUIDE_BUBBLE", this);
        }
        super.onDestroy();
    }

    @Override // X.AbstractC21194217wq
    public final /* bridge */ /* synthetic */ AbstractC21198617xY LJJIJIIJI() {
        return this.LLLLLJIL;
    }

    @Override // X.AbstractC21194217wq
    public final AbstractC21196217xA LJJIJLIJ() {
        return this.LLLLLILLIL;
    }

    public C21199517xh(Context context) {
        super(context, true);
        this.LLLLIIL = context;
        this.LLLLIILL = true;
        this.LLLLJ = C21200717xt.LIZ();
        this.LLLLJI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 852));
        C21199817xk c21199817xk = new C21199817xk(this, this, this.LLJI);
        this.LLLLLILLIL = c21199817xk;
        C21203617yM c21203617yM = new C21203617yM(c21199817xk.LJIIJJI, this.LLJI);
        c21203617yM.LLILZLL = this;
        c21203617yM.LLJJ = new C21194617wu(this);
        this.LLLLLJIL = c21203617yM;
    }

    @Override // X.InterfaceC21200917xv
    public final void LIZIZ(boolean z) {
        String idStr;
        this.LLLLLIL = z;
        Room room = this.LLJILLL;
        if (room != null && (idStr = room.getIdStr()) != null) {
            if (2 == C19378910rj.LIZ(idStr, "SLOT_BAG_BUBBLE_SHOW")) {
                C2341109Fh.LIZ.getClass();
                C2341109Fh.LJ("wait for bubble dismiss");
                C19378910rj.LIZIZ(idStr, "SLOT_BAG_BUBBLE_SHOW", this);
                return;
            } else if (2 == C19378910rj.LIZ(idStr, "SLOT_SHOP_BAG_GUIDE_BUBBLE")) {
                C2341109Fh.LIZ.getClass();
                C2341109Fh.LJ("wait for bubble dismiss");
                C19378910rj.LIZIZ(idStr, "SLOT_SHOP_BAG_GUIDE_BUBBLE", this);
                return;
            }
        }
        if (!this.LLLLJ) {
            LJJLIIIJ();
        }
        if (this.LLLLJ) {
            LJJLI();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
    @Override // X.AbstractC21194217wq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJII(int r4) {
        /*
            r3 = this;
            boolean r0 = r3.LLLLIILL
            r2 = 1
            if (r0 == 0) goto L19
            X.17xz r0 = X.InterfaceC21201417y0.LJIJ
            r0.getClass()
            if (r4 == r2) goto L28
            r1 = 0
            r0 = 4
            if (r4 != r0) goto L2b
            r0 = 1
        L11:
            r1 = r1 | r0
            r0 = 5
            if (r4 != r0) goto L29
            r0 = 1
        L16:
            r1 = r1 | r0
            if (r1 != 0) goto L28
        L19:
            boolean r0 = r3.LLLLIILL
            if (r0 != 0) goto L2d
            X.17xz r0 = X.InterfaceC21201417y0.LJIJ
            r0.getClass()
            boolean r0 = X.C21201317xz.LIZ(r4)
            if (r0 == 0) goto L2d
        L28:
            return r2
        L29:
            r0 = 0
            goto L16
        L2b:
            r0 = 0
            goto L11
        L2d:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21199517xh.LJJII(int):boolean");
    }

    public final void LJJLIIIJILLIZJL(boolean z) {
        int i;
        Integer numValueOf;
        IFrameSlot.SlotViewModel slotViewModel;
        MutableLiveData<android.util.Pair<Boolean, String>> mutableLiveData;
        android.util.Pair<Boolean, String> value;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSlotVisible isVisible = ");
        sbLIZ.append(z);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        if (this.LLILLL) {
            InterfaceC21180617ue interfaceC21180617ue = this.LLILZ;
            if (interfaceC21180617ue != null) {
                interfaceC21180617ue.LJIIZILJ(this, z);
            }
        } else {
            IFrameSlot.SlotViewModel slotViewModel2 = this.LLJIJIL;
            if (slotViewModel2 != null) {
                C21207817z2.LIZIZ(slotViewModel2, z);
            }
        }
        Room room = this.LLJILLL;
        if (room != null) {
            String strValueOf = String.valueOf(room.getId());
            ViewModel viewModel = this.LL;
            if ((viewModel instanceof IFrameSlot.SlotViewModel) && (slotViewModel = (IFrameSlot.SlotViewModel) viewModel) != null && (mutableLiveData = slotViewModel.LL) != null && (value = mutableLiveData.getValue()) != null && Intrinsics.LJFF(value.first, Boolean.TRUE)) {
                i = 2;
            } else {
                i = 3;
            }
            PopupCardVO popupCardVO = this.LLLLLJIL.LL;
            if (popupCardVO != null) {
                numValueOf = Integer.valueOf(popupCardVO.cardType);
            } else {
                numValueOf = null;
            }
            C19378910rj.LIZLLL(i, strValueOf, numValueOf, "SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE");
        }
        if (z) {
            LJJJLZIJ(EnumC21193117wf.NOTIFY_SHOW, null);
            PopupCardVO popupCardVO2 = this.LLLLLJIL.LL;
            if (popupCardVO2 != null && Intrinsics.LJFF(popupCardVO2.needRetry, Boolean.TRUE)) {
                LJJJLZIJ(EnumC21193117wf.DID_SHOW_WITH_SAMPLE_INFO, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    @Override // X.InterfaceC1141530foN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mh2(X.C262100zr r9) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21199517xh.mh2(X.00zr):void");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void subscribeLottieBeforeFinishShow(C21203117yH c21203117yH) {
        LJJLIIIJ();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void subscribeShopIconVisibleChangeEvent(C21203017yG c21203017yG) {
        if (c21203017yG.LIZ) {
            this.LLLLLILLIL.LJIIJ();
        }
    }

    @Override // X.AbstractC21194217wq
    /* JADX INFO: renamed from: LJJJJ */
    public final void LLIZ(IFrameSlot.SlotViewModel slotViewModel, InterfaceC21213717zz interfaceC21213717zz) {
        EventBus.LIZLLL().LJIJJ(this);
        C1548820qPI.LIZLLL("live_refresh_pin_product", this);
        C1548820qPI.LIZLLL("ec_shop_bag_claim_surprise_coupon", this);
        super.LLIZ(slotViewModel, interfaceC21213717zz);
    }

    @Override // X.AbstractC21194217wq, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final /* bridge */ /* synthetic */ void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) {
        LLIZ((IFrameSlot.SlotViewModel) viewModel, interfaceC21213717zz);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        if (r1 < r0) goto L37;
     */
    @Override // X.AbstractC21194217wq, X.InterfaceC1164530gPT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onEvent(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "ec_page_quit"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r0)
            r3 = 0
            if (r0 == 0) goto L2f
            java.util.HashMap r1 = X.C1741890vQh.LJIIJ(r7)
            if (r1 == 0) goto L17
            java.lang.String r0 = "product_id"
            java.lang.Object r2 = r1.get(r0)
            if (r2 != 0) goto L19
        L17:
            java.lang.String r2 = ""
        L19:
            X.17yM r0 = r5.LLLLLJIL
            com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO r4 = r0.LL
            r1 = 1
            if (r4 == 0) goto L2f
            int r0 = r4.cardType
            if (r0 != r1) goto L2f
            java.lang.Integer r0 = r4.productType
            if (r0 == 0) goto L33
            int r1 = r0.intValue()
            r0 = 2
            if (r1 != r0) goto L33
        L2f:
            super.onEvent(r6, r7)
            return
        L33:
            X.17yM r0 = r5.LLLLLJIL
            com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO r1 = r0.LL
            r4 = 0
            if (r1 == 0) goto L4b
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo r0 = r1.flashSaleAtmosphereInfo
            if (r0 != 0) goto L2f
            if (r1 == 0) goto L4b
            java.lang.Boolean r1 = r1.advancedFlashSale
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L4b
            goto L2f
        L4b:
            X.14fY r0 = X.C20322614fY.LIZ
            r0.getClass()
            java.lang.String r0 = X.C20322614fY.LIZJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            if (r0 == 0) goto L2f
            X.01GW r2 = X.C258250AAd.LIZ
            java.lang.Object r0 = r2.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 < 0) goto L97
            com.bytedance.keva.Keva r1 = X.C20322614fY.LIZIZ
            java.lang.String r0 = X.C20322614fY.LIZ()
            int r1 = r1.getInt(r0, r3)
            java.lang.Object r0 = r2.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r1 < r0) goto L97
            X.11Xd r0 = X.C19516311Xd.LIZ
            r0.getClass()
            com.bytedance.keva.Keva r1 = X.C19516311Xd.LIZIZ
            java.lang.String r2 = "pdp_close"
            java.lang.String r0 = X.C19516311Xd.LIZ(r2)
            int r1 = r1.getInt(r0, r3)
            com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings.EcShopBagTooltipConfig r0 = X.C19517011Xk.LIZ(r2)
            if (r0 == 0) goto Lb2
            int r0 = r0.frequencyLimit
        L95:
            if (r1 >= r0) goto L2f
        L97:
            java.lang.String r0 = "force_close_from_pdp"
            r5.LJJIIZ(r0)
            com.bytedance.keva.Keva r2 = X.C20322614fY.LIZIZ
            java.lang.String r0 = X.C20322614fY.LIZ()
            int r0 = r2.getInt(r0, r3)
            java.lang.String r1 = X.C20322614fY.LIZ()
            int r0 = r0 + 1
            r2.storeInt(r1, r0)
            X.C20322614fY.LIZJ = r4
            return
        Lb2:
            r0 = 0
            goto L95
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21199517xh.onEvent(java.lang.String, java.lang.String):void");
    }

    @Override // X.InterfaceC19379010rk
    public final void LJFF(int i, String str, Integer num, String str2) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("wait for bubble show onStateChange = ");
        sbLIZ.append(i);
        sbLIZ.append(", widgetName = ");
        sbLIZ.append(str);
        sbLIZ.append(" , roomId = ");
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        if (2 != i) {
            C19378910rj.LJ(str2, str, this);
            if (this.LLLLJ) {
                LJJLI();
            } else {
                LJJLIIIJ();
            }
        }
    }
}
