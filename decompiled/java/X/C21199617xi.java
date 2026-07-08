package X;

import Y.ARunnableS131S0100000_31;
import android.content.Context;
import android.os.Handler;
import android.util.Pair;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphere;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LynxCardInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS108S1000000_24;
import kotlin.jvm.internal.AwS173S1100000_24;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.17xi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21199617xi extends AbstractC21194117wp implements InterfaceC21201017xw, InterfaceC19379010rk, InterfaceC1141530foN {
    public final Context LLLJL;
    public final boolean LLLL;
    public boolean LLLLII;
    public C21200117xn LLLLIIIILLL;
    public C21200017xm LLLLIIL;
    public final boolean LLLLIILL;
    public boolean LLLLIILLL;
    public final C01GW LLLLIL;
    public final C21199717xj LLLLILI;
    public final C21203517yL LLLLJ;

    @Override // X.AbstractC21194117wp
    public final boolean LJJIJLIJ() {
        return false;
    }

    @Override // X.AbstractC21194117wp
    public final boolean LJJJI() {
        return true;
    }

    @Override // X.InterfaceC21201017xw
    public final void LIZJ() {
        C21200017xm c21200017xm;
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("checkToDismiss");
        C21200117xn c21200117xn = this.LLLLIIIILLL;
        if (c21200117xn != null && (c21200017xm = this.LLLLIIL) != null) {
            c21200017xm.LJFF(c21200117xn, true);
        }
        this.LLLLIIIILLL = null;
        LJJLIIIJJIZ(false);
    }

    @Override // X.AbstractC21194117wp
    public final void LJJIFFI() {
        C21200017xm c21200017xm;
        this.LLLLJ.LLJJJIL = !ActivityStack.isAppBackGround() ? "time_out" : this.LLJI.LJIIIIZZ;
        C21200117xn c21200117xn = this.LLLLIIIILLL;
        if (c21200117xn != null && (c21200017xm = this.LLLLIIL) != null) {
            c21200017xm.LJFF(c21200117xn, true);
        }
        this.LLLLIIIILLL = null;
        LJJLIIIJJIZ(false);
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [X.09AY, kotlin.jvm.functions.Function0] */
    public final void LJJLIIIJILLIZJL() {
        UsPopupCardVO usPopupCardVO;
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo;
        FlashSaleAtmosphere flashSaleAtmosphere;
        Integer numValueOf;
        C21213117zt.LIZ.getClass();
        if (C21213117zt.LIZIZ(false) && !this.LLLLII) {
            this.LLLLII = true;
            LJJLIIIJJI(EnumC21192917wd.MORE_WAIT_FOR_SHOW, "wait_reason=lottie");
            C1440005kM.LIZ(new C591940NJo(3, true));
            return;
        }
        UsPopupCardVO usPopupCardVO2 = this.LLLLJ.LL;
        String strValueOf = String.valueOf(usPopupCardVO2 != null ? Long.valueOf(usPopupCardVO2.productId) : null);
        Room room = this.LLJILLL;
        String string = room != null ? Long.valueOf(room.getId()).toString() : null;
        String strLJJIJ = AbstractC21194117wp.LJJIJ();
        boolean z = this.LLLFFI;
        String strLJJIJIIJIL = LJJIJIIJIL();
        boolean z2 = this.LLJJI;
        UsPopupCardVO usPopupCardVO3 = this.LLLLJ.LL;
        Integer numValueOf2 = usPopupCardVO3 != null ? Integer.valueOf(usPopupCardVO3.cardType) : null;
        try {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("product_id", strValueOf);
            jSONObject.put("room_id", string);
            jSONObject.put("author_id", strLJJIJ);
            jSONObject.put("has_ec_perm", z ? 1 : 0);
            jSONObject.put("live_role", strLJJIJIIJIL);
            jSONObject.put("is_waiting_coupon", 0);
            jSONObject.put("is_page_visible", z2 ? 1 : 0);
            jSONObject.put("card_type", numValueOf2);
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_rd_tiktokec_live_pop_product_show_start", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LLLLII = false;
        if (C293290BeZ.LIZ().delay <= 0) {
            LJJLIIIJJIZ(true);
        } else if (!C293290BeZ.LIZ().delayProductOnly || ((usPopupCardVO = this.LLLLJ.LL) != null && usPopupCardVO.cardType == 1)) {
            ((Handler) this.LLLLIL.getValue()).removeCallbacksAndMessages(null);
            C786410Ut5.LJLIIL(C293290BeZ.LIZ().delay, (Handler) this.LLLLIL.getValue(), new ARunnableS131S0100000_31(this, 178));
        } else {
            LJJLIIIJJIZ(true);
        }
        UsPopupCardVO usPopupCardVO4 = this.LLLLJ.LL;
        if (usPopupCardVO4 == null || (flashSaleAtmosphereInfo = usPopupCardVO4.flashSaleAtmosphereInfo) == null || (flashSaleAtmosphere = flashSaleAtmosphereInfo.flashSaleAtmosphere) == null || (numValueOf = Integer.valueOf(flashSaleAtmosphere.status)) == null || !(numValueOf.intValue() == 2 || numValueOf.intValue() == 3)) {
            this.LLLLILI.LJIIL(true);
            return;
        }
        ?? r0 = this.LLLLJ.LLJILJIL;
        if (r0 != 0) {
            r0.invoke();
        }
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return this.LLLL ? EnumC1124020fM8.SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE : EnumC1124020fM8.SLOT_LIVE_WATCHER_L3_POP;
    }

    @Override // X.AbstractC21194117wp, X.AbstractC21203317yJ, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDestroy() {
        String idStr;
        C21200017xm c21200017xm;
        C21200117xn c21200117xn = this.LLLLIIIILLL;
        if (c21200117xn != null && (c21200017xm = this.LLLLIIL) != null) {
            c21200017xm.LJFF(c21200117xn, false);
        }
        this.LLLLIIIILLL = null;
        ((Handler) this.LLLLIL.getValue()).removeCallbacksAndMessages(null);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ("ec_live_end_event", "{}");
        EventBus.LIZLLL().LJJI(this);
        C1548820qPI.LJIIIIZZ("live_refresh_pin_product", this);
        Room room = this.LLJILLL;
        if (room != null && (idStr = room.getIdStr()) != null) {
            if (LJJII(this.LLLLJ.LLILLL)) {
                C19378910rj.LIZJ(idStr, "SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE");
            }
            C19378910rj.LJ(idStr, "SLOT_BAG_BUBBLE_SHOW", this);
            C19378910rj.LJ(idStr, "SLOT_SHOP_BAG_GUIDE_BUBBLE", this);
        }
        super.onDestroy();
    }

    @Override // X.AbstractC21194117wp
    public final /* bridge */ /* synthetic */ AbstractC21198517xX LJJIJIIJI() {
        return this.LLLLJ;
    }

    @Override // X.AbstractC21194117wp
    public final AbstractC21196817xG LJJIJL() {
        return this.LLLLILI;
    }

    public C21199617xi(Context context) {
        super(context, true);
        this.LLLJL = context;
        this.LLLL = true;
        this.LLLLIILL = C21200717xt.LIZ();
        this.LLLLIL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(583));
        C21199717xj c21199717xj = new C21199717xj(this, this, this.LLJI);
        this.LLLLILI = c21199717xj;
        C21203517yL c21203517yL = new C21203517yL(c21199717xj.LJIIJJI, this.LLJI);
        c21203517yL.LLILZLL = this;
        c21203517yL.LLJJ = new C21194517wt(this);
        this.LLLLJ = c21203517yL;
    }

    @Override // X.InterfaceC21201017xw
    public final void LIZIZ(boolean z) throws Throwable {
        String idStr;
        this.LLLLIILLL = z;
        Room room = this.LLJILLL;
        if (room != null && (idStr = room.getIdStr()) != null) {
            if (2 == C19378910rj.LIZ(idStr, "SLOT_BAG_BUBBLE_SHOW")) {
                C2341109Fh.LIZ.getClass();
                C2341109Fh.LJ("wait for bubble dismiss");
                LJJLIIIJJI(EnumC21192917wd.WAIT_FOR_SHOW, "wait_reason=bubble");
                C19378910rj.LIZIZ(idStr, "SLOT_BAG_BUBBLE_SHOW", this);
                return;
            }
            if (2 == C19378910rj.LIZ(idStr, "SLOT_SHOP_BAG_GUIDE_BUBBLE")) {
                C2341109Fh.LIZ.getClass();
                C2341109Fh.LJ("wait for bubble dismiss");
                LJJLIIIJJI(EnumC21192917wd.WAIT_FOR_SHOW, "wait_reason=bubble");
                C19378910rj.LIZIZ(idStr, "SLOT_SHOP_BAG_GUIDE_BUBBLE", this);
                return;
            }
        }
        if (!this.LLLLIILL) {
            LJJLIIIJILLIZJL();
        }
        if (this.LLLLIILL) {
            LJJLIIIIJ(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
    @Override // X.AbstractC21194117wp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJII(int r4) {
        /*
            r3 = this;
            boolean r0 = r3.LLLL
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
            boolean r0 = r3.LLLL
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
        throw new UnsupportedOperationException("Method not decompiled: X.C21199617xi.LJJII(int):boolean");
    }

    public final void LJJLIIIIJ(boolean z) throws Throwable {
        Long lValueOf;
        C21200117xn c21200117xn;
        Long lValueOf2;
        Long lValueOf3;
        String string;
        Object obj;
        long jLongValue;
        String str;
        String str2;
        String string2;
        Long lLJIILIIL;
        C21199917xl c21199917xl = C21199917xl.LIZ;
        Room room = this.LLJILLL;
        Long lValueOf4 = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        C21200017xm c21200017xmLIZ = c21199917xl.LIZ(lValueOf);
        if (c21200017xmLIZ != null) {
            c21200017xmLIZ.LJI(4, null);
        }
        UsPopupCardVO usPopupCardVO = this.LLLLJ.LL;
        if (usPopupCardVO != null && C21194017wo.LIZIZ(usPopupCardVO)) {
            C21208117z5 c21208117z5 = C21208117z5.LIZ;
            Context context = this.LLLJL;
            Room room2 = this.LLJILLL;
            String str3 = CardStruct.IStatusCode.DEFAULT;
            if (room2 == null || (string = Long.valueOf(room2.getId()).toString()) == null) {
                string = CardStruct.IStatusCode.DEFAULT;
            }
            String strLIZJ = C21194017wo.LIZJ(usPopupCardVO);
            int i = usPopupCardVO.cardType;
            Long lValueOf5 = Long.valueOf(usPopupCardVO.productId);
            Room room3 = this.LLJILLL;
            if (room3 != null) {
                lValueOf4 = Long.valueOf(room3.getId());
            }
            C21192617wa c21192617wa = new C21192617wa(usPopupCardVO, lValueOf4);
            C21199717xj c21199717xj = this.LLLLILI;
            C1743900vTw c1743900vTw = this.LLJILJILJ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str4 = "1";
            if (z) {
                obj = "1";
            } else {
                obj = "1";
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_enter_room_card", str4);
            if (this.LLLILZLLLI) {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_sync_enter_room", obj);
            String strLIZJ2 = this.LLJILJILJ.LIZJ("click_enter_room_time");
            if (strLIZJ2 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strLIZJ2)) != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            linkedHashMap.put("click_enter_room_time", Long.valueOf(jLongValue));
            C21208217z6 c21208217z6 = new C21208217z6(context, string, strLIZJ, i, null, lValueOf5, c21192617wa, new C21196717xF(c21199717xj, c1743900vTw, linkedHashMap), usPopupCardVO.latencyInfo, usPopupCardVO.chainInfo, 16);
            c21208117z5.getClass();
            C21208117z5.LIZLLL(c21208217z6);
            List<C1556460qbc> list = C1563970qnj.LIZ;
            String lynxCardData = usPopupCardVO.getLynxCardData();
            Room room4 = this.LLJILLL;
            if (room4 != null && (string2 = Long.valueOf(room4.getId()).toString()) != null) {
                str3 = string2;
            }
            C1563970qnj.LJ(new AwS173S1100000_24(lynxCardData, new C1564050qnr(str3, usPopupCardVO.cardType, Long.valueOf(usPopupCardVO.popCardId), C21194017wo.LIZJ(usPopupCardVO), usPopupCardVO.requestTime, usPopupCardVO.latencyInfo, usPopupCardVO.chainInfo), 11));
            LynxCardInfo lynxCardInfo = usPopupCardVO.lynxCardInfo;
            if (lynxCardInfo != null) {
                str = lynxCardInfo.popupSchemaMiddle;
            } else {
                str = null;
            }
            if (C770702zh.LIZ(str)) {
                LJJLIIIJ(str, "acting_area", z);
            }
            LynxCardInfo lynxCardInfo2 = usPopupCardVO.lynxCardInfo;
            if (lynxCardInfo2 != null) {
                str2 = lynxCardInfo2.popupSchemaBottomRight;
            } else {
                str2 = null;
            }
            if (C770702zh.LIZ(str2)) {
                LJJLIIIJ(str2, "acting_area_bottom", z);
            }
        }
        if (this.LLLLIIL == null) {
            Room room5 = this.LLJILLL;
            if (room5 != null) {
                lValueOf3 = Long.valueOf(room5.getId());
            } else {
                lValueOf3 = null;
            }
            this.LLLLIIL = c21199917xl.LIZ(lValueOf3);
        }
        if (this.LLLLIIIILLL == null) {
            C21200017xm c21200017xm = this.LLLLIIL;
            if (c21200017xm == null || (c21200117xn = c21200017xm.LIZLLL(0)) == null) {
                c21200117xn = new C21200117xn(0, 200);
            }
            this.LLLLIIIILLL = c21200117xn;
            UsPopupCardVO usPopupCardVO2 = this.LLLLJ.LL;
            if (usPopupCardVO2 != null) {
                lValueOf2 = Long.valueOf(usPopupCardVO2.popCardId);
            } else {
                lValueOf2 = null;
            }
            c21200117xn.LJ = lValueOf2;
        }
        C21200117xn c21200117xn2 = this.LLLLIIIILLL;
        if (c21200117xn2 != null) {
            c21200117xn2.LIZJ = new AwS610S0100000_31(this, 524);
        }
        C21200017xm c21200017xm2 = this.LLLLIIL;
        if (c21200017xm2 != null) {
            c21200017xm2.LIZIZ(this.LLLLIIIILLL);
        }
    }

    public final void LJJLIIIJJIZ(boolean z) {
        String string;
        Long lValueOf;
        Integer numValueOf;
        int i;
        IFrameSlot.SlotViewModel slotViewModel;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSlotVisible isVisible = ");
        sbLIZ.append(z);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        if (this.LLILLL) {
            InterfaceC21180717uf interfaceC21180717uf = this.LLILZ;
            if (interfaceC21180717uf != null) {
                interfaceC21180717uf.LJIIIIZZ(this, z);
            }
        } else {
            IFrameSlot.SlotViewModel slotViewModel2 = this.LLJIJIL;
            if (slotViewModel2 != null) {
                C21207817z2.LIZIZ(slotViewModel2, z);
            }
        }
        Room room = this.LLJILLL;
        boolean zIsFromMessage = false;
        C1563990qnl c1563990qnl = null;
        if (room != null) {
            String strValueOf = String.valueOf(room.getId());
            ViewModel viewModel = this.LL;
            if ((viewModel instanceof IFrameSlot.SlotViewModel) && (slotViewModel = (IFrameSlot.SlotViewModel) viewModel) != null && (mutableLiveData = slotViewModel.LL) != null && (value = mutableLiveData.getValue()) != null && Intrinsics.LJFF(value.first, Boolean.TRUE)) {
                i = 2;
            } else {
                i = 3;
            }
            C19378910rj.LIZLLL(i, strValueOf, null, "SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE");
        }
        if (z) {
            EnumC21192917wd enumC21192917wd = EnumC21192917wd.NOTIFY_SHOW;
            String strLJJIJIIJIL = LJJIJIIJIL();
            Room room2 = this.LLJILLL;
            if (room2 != null) {
                string = Long.valueOf(room2.getId()).toString();
            } else {
                string = null;
            }
            UsPopupCardVO usPopupCardVO = this.LLLLJ.LL;
            if (usPopupCardVO != null) {
                lValueOf = Long.valueOf(usPopupCardVO.productId);
            } else {
                lValueOf = null;
            }
            String strValueOf2 = String.valueOf(lValueOf);
            boolean z2 = this.LLJJI;
            boolean z3 = this.LLLI;
            boolean z4 = this.LLLFFI;
            UsPopupCardVO usPopupCardVO2 = this.LLLLJ.LL;
            if (usPopupCardVO2 != null) {
                zIsFromMessage = usPopupCardVO2.isFromMessage();
            }
            UsPopupCardVO usPopupCardVO3 = this.LLLLJ.LL;
            if (usPopupCardVO3 != null) {
                numValueOf = Integer.valueOf(usPopupCardVO3.cardType);
            } else {
                numValueOf = null;
            }
            UsPopupCardVO usPopupCardVO4 = this.LLLLJ.LL;
            if (usPopupCardVO4 != null) {
                c1563990qnl = usPopupCardVO4.chainInfo;
            }
            C21192417wY.LJI(enumC21192917wd, strLJJIJIIJIL, string, strValueOf2, z2, z3, z4, zIsFromMessage, numValueOf, c1563990qnl);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    @Override // X.InterfaceC1141530foN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mh2(X.C262100zr r9) {
        /*
            r8 = this;
            java.lang.String r1 = r9.LIZ
            java.lang.String r0 = "live_refresh_pin_product"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L35
            X.09Fh r0 = X.C2341109Fh.LIZ
            r0.getClass()
            java.lang.String r0 = "onReceiveJsEvent LIVE_REFRESH_PIN_PRODUCT"
            X.C2341109Fh.LJ(r0)
            X.0evd r0 = r9.LIZIZ
            r7 = 0
            if (r0 == 0) goto L60
            java.util.Map r4 = r0.LIZ()
            if (r4 == 0) goto L61
            java.lang.String r0 = "card_type"
            java.lang.Object r1 = r4.get(r0)
        L25:
            java.lang.String r0 = "shopping_list"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r6 = 1
            r2 = 0
            java.lang.String r5 = "shop_bag_notify"
            if (r0 == 0) goto L36
            r8.LJJL(r2, r5, r6)
        L35:
            return
        L36:
            if (r4 == 0) goto L35
            java.lang.String r0 = "product_id"
            java.lang.Object r0 = r4.get(r0)
            if (r0 == 0) goto L35
            java.lang.String r4 = r0.toString()
            if (r4 == 0) goto L35
            X.17yL r0 = r8.LLLLJ
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO r0 = r0.LL
            if (r0 == 0) goto L52
            long r0 = r0.productId
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
        L52:
            java.lang.String r0 = java.lang.String.valueOf(r7)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r4)
            if (r0 == 0) goto L35
            r8.LJJL(r2, r5, r6)
            return
        L60:
            r4 = r7
        L61:
            r1 = r7
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21199617xi.mh2(X.00zr):void");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void subscribeLottieBeforeFinishShow(C21203117yH c21203117yH) {
        LJJLIIIJILLIZJL();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void subscribeShopIconVisibleChangeEvent(C21203017yG c21203017yG) {
        if (c21203017yG.LIZ) {
            this.LLLLILI.LJIIJ();
        }
    }

    @Override // X.AbstractC21194117wp
    /* JADX INFO: renamed from: LJJJJ */
    public final void LLIZ(IFrameSlot.SlotViewModel slotViewModel, InterfaceC21213717zz interfaceC21213717zz) {
        EventBus.LIZLLL().LJIJJ(this);
        C1548820qPI.LIZLLL("live_refresh_pin_product", this);
        super.LLIZ(slotViewModel, interfaceC21213717zz);
    }

    public final void LJJLIIIJJI(EnumC21192917wd enumC21192917wd, String str) {
        String string;
        Long lValueOf;
        Integer numValueOf;
        EnumC21192517wZ enumC21192517wZLJIIIZ = C21192417wY.LJIIIZ(enumC21192917wd);
        Room room = this.LLJILLL;
        C1563990qnl c1563990qnl = null;
        if (room != null) {
            string = Long.valueOf(room.getId()).toString();
        } else {
            string = null;
        }
        UsPopupCardVO usPopupCardVO = this.LLLLJ.LL;
        if (usPopupCardVO != null) {
            lValueOf = Long.valueOf(usPopupCardVO.productId);
        } else {
            lValueOf = null;
        }
        String strValueOf = String.valueOf(lValueOf);
        UsPopupCardVO usPopupCardVO2 = this.LLLLJ.LL;
        if (usPopupCardVO2 != null) {
            numValueOf = Integer.valueOf(usPopupCardVO2.cardType);
        } else {
            numValueOf = null;
        }
        UsPopupCardVO usPopupCardVO3 = this.LLLLJ.LL;
        if (usPopupCardVO3 != null) {
            c1563990qnl = usPopupCardVO3.chainInfo;
        }
        C21192417wY.LJ(enumC21192517wZLJIIIZ, string, strValueOf, numValueOf, str, c1563990qnl);
    }

    @Override // X.AbstractC21194117wp, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final /* bridge */ /* synthetic */ void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) {
        LLIZ((IFrameSlot.SlotViewModel) viewModel, interfaceC21213717zz);
    }

    @Override // X.AbstractC21194117wp, X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        Object obj;
        if (Intrinsics.LJFF(str, "ec_page_quit")) {
            HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(str2);
            if (mapLJIIJ == null || (obj = mapLJIIJ.get("product_id")) == null) {
                obj = "";
            }
            UsPopupCardVO usPopupCardVO = this.LLLLJ.LL;
            if (usPopupCardVO != null && usPopupCardVO.cardType == 1 && (usPopupCardVO == null || (usPopupCardVO.flashSaleAtmosphereInfo == null && (usPopupCardVO == null || !Intrinsics.LJFF(usPopupCardVO.advancedFlashSale, Boolean.TRUE))))) {
                C20322614fY.LIZ.getClass();
                if (Intrinsics.LJFF(C20322614fY.LIZJ, obj)) {
                    LJJIIZ("force_close_from_pdp");
                    Keva keva = C20322614fY.LIZIZ;
                    keva.storeInt(C20322614fY.LIZ(), keva.getInt(C20322614fY.LIZ(), 0) + 1);
                    C20322614fY.LIZJ = null;
                    return;
                }
            }
        }
        super.onEvent(str, str2);
    }

    public final void LJJLIIIJ(String str, final String str2, boolean z) throws Throwable {
        String string;
        Object obj;
        long jLongValue;
        Long lLJIILIIL;
        final UsPopupCardVO usPopupCardVO = this.LLLLJ.LL;
        if (usPopupCardVO != null) {
            List<C1556460qbc> list = C1563970qnj.LIZ;
            C1563970qnj.LJ(new AwS108S1000000_24(str2, 6));
            C21208117z5 c21208117z5 = C21208117z5.LIZ;
            Context context = this.LLLJL;
            Room room = this.LLJILLL;
            String str3 = CardStruct.IStatusCode.DEFAULT;
            if (room == null || (string = Long.valueOf(room.getId()).toString()) == null) {
                string = CardStruct.IStatusCode.DEFAULT;
            }
            int i = usPopupCardVO.cardType;
            Long lValueOf = Long.valueOf(usPopupCardVO.productId);
            InterfaceC21208317z7 interfaceC21208317z7 = new InterfaceC21208317z7() { // from class: X.17xU
                @Override // X.InterfaceC21208317z7
                public final void onLoading() {
                }

                @Override // X.InterfaceC21208317z7
                public final void onShow() {
                }

                @Override // X.InterfaceC21208317z7
                public final void LIZ(String str4, boolean z2) {
                    if (z2) {
                        List<C1556460qbc> list2 = C1563970qnj.LIZ;
                        C1563970qnj.LJ(new AwS108S1000000_24(str2, 7));
                    } else {
                        Map mapLJIIJ = C2097608Jq.LJIIJ(new kotlin.Pair("sub_scene", str2));
                        C21183117v3.LIZ(mapLJIIJ, usPopupCardVO.chainInfo);
                        C21198117xT.LIZ.getClass();
                        C21198117xT.LIZIZ("auction_acting_area_preload_fail", mapLJIIJ);
                    }
                }
            };
            C21199717xj c21199717xj = this.LLLLILI;
            C1743900vTw c1743900vTw = this.LLJILJILJ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (z) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_enter_room_card", obj);
            if (!this.LLLILZLLLI) {
                str3 = "1";
            }
            linkedHashMap.put("is_sync_enter_room", str3);
            String strLIZJ = this.LLJILJILJ.LIZJ("click_enter_room_time");
            if (strLIZJ != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strLIZJ)) != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            linkedHashMap.put("click_enter_room_time", Long.valueOf(jLongValue));
            C21208217z6 c21208217z6 = new C21208217z6(context, string, str, i, str2, lValueOf, interfaceC21208317z7, new C21196717xF(c21199717xj, c1743900vTw, linkedHashMap), usPopupCardVO.latencyInfo, null, 512);
            c21208117z5.getClass();
            C21208117z5.LIZLLL(c21208217z6);
        }
    }

    @Override // X.InterfaceC19379010rk
    public final void LJFF(int i, String str, Integer num, String str2) throws Throwable {
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
            if (this.LLLLIILL) {
                LJJLIIIIJ(this.LLLLIILLL);
            } else {
                LJJLIIIJILLIZJL();
            }
        }
    }
}
