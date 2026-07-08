package X;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.settings.EcShopBagBubbleNoImageSetting;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.180l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212149180l implements InterfaceC21213517zx, InterfaceC19379010rk {
    public static boolean LLJJIJI;
    public final Function0<Room> LL;
    public final Function0<Map<String, String>> LLILLJJLI;
    public final Function0<C1743900vTw> LLILLL;
    public final Function0<Integer> LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public String LLIZLLLIL = "";
    public String LLJ = "";
    public String LLJI = "";
    public String LLJIJIL = "";
    public final C054G LLJILJIL;
    public IIconSlot.SlotViewModel LLJILJILJ;
    public final C01GW LLJILLL;
    public Room LLJJ;
    public boolean LLJJI;
    public final C01GW LLJJIII;

    @Override // X.InterfaceC21213517zx
    public final void onAudiencePermissionChanged(boolean z) {
    }

    @Override // X.InterfaceC21213517zx
    public final void onClick(long j, String str, Map<String, ? extends Object> map, String str2) {
    }

    @Override // X.InterfaceC21213517zx
    public final void onCreate(Bundle bundle) {
    }

    @Override // X.InterfaceC21213517zx
    public final void onDispose() {
    }

    @Override // X.InterfaceC21213517zx
    public final void onExposure(String str) {
    }

    @Override // X.InterfaceC21213517zx
    public final void onPause() {
    }

    @Override // X.InterfaceC21213517zx
    public final void onProductNumChange(int i) {
    }

    @Override // X.InterfaceC21213517zx
    public final void onResume() {
    }

    @Override // X.InterfaceC21213517zx
    public final void onShopBagIconDrawableLoaded() {
    }

    @Override // X.InterfaceC21213517zx
    public final void onStart() {
    }

    @Override // X.InterfaceC21213517zx
    public final void onStop() {
    }

    @Override // X.InterfaceC21213517zx
    public final void prepareToShow(Map<String, ? extends Object> map, InterfaceC756140TlM interfaceC756140TlM) {
    }

    public final boolean LIZ() {
        return this.LLILZIL || this.LLILZ.invoke().intValue() < LIZJ().minProductNum;
    }

    public final EcShopBagBubbleNoImageSetting.EcShopBagBubbleNoImageConfig LIZJ() {
        return (EcShopBagBubbleNoImageSetting.EcShopBagBubbleNoImageConfig) this.LLJILLL.getValue();
    }

    public final boolean LJ() {
        int iLIZ = C19378910rj.LIZ(this.LLJI, "SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("otherCardShow, pinCardWidgetState = ");
        sbLIZ.append(iLIZ);
        LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        return iLIZ == 2 || iLIZ == 5;
    }

    @Override // X.InterfaceC21213517zx
    public final void onDestroy() {
        C2296808zG.LIZJ(this.LLJILJIL, null);
        LJIIIZ();
    }

    public final void LJII() {
        MutableLiveData<C785100Uqy> mutableLiveData;
        if (LIZ() || LJ() || this.LLIZLLLIL.length() == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("can't show bubble, otherCardShow=");
            sbLIZ.append(LJ());
            sbLIZ.append(", canNotShow=");
            sbLIZ.append(LIZ());
            sbLIZ.append(", bubbleStr=");
            sbLIZ.append(this.LLIZLLLIL);
            LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        LIZIZ("start show bubble!");
        final C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = -1L;
        final C1743900vTw c1743900vTwInvoke = this.LLILLL.invoke();
        IIconSlot.SlotViewModel slotViewModel = this.LLJILJILJ;
        if (slotViewModel != null) {
            slotViewModel.LLL = new InterfaceC784990Uqn(this) { // from class: X.180n
                public final /* synthetic */ C212149180l LIZJ;

                {
                    this.LIZJ = this;
                }

                @Override // X.InterfaceC784990Uqn
                public final void LIZ() {
                    c238400w2.element = SystemClock.elapsedRealtime();
                    c1743900vTwInvoke.LJIIIIZZ("guidance_text_type", this.LIZJ.LLJ, false);
                    C21206717yr.LJII(c1743900vTwInvoke);
                    C212152180o c212152180o = (C212152180o) this.LIZJ.LLJJIII.getValue();
                    c212152180o.getClass();
                    try {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(String.valueOf(System.currentTimeMillis()));
                        for (String str : c212152180o.LIZIZ()) {
                            arrayList.add(str);
                        }
                        if (arrayList.size() > 1) {
                            C08XD.LJJ(arrayList, new C512401z8(20));
                        }
                        c212152180o.LIZ.storeStringArray("bubble_shown_v2", (String[]) arrayList.toArray(new String[0]));
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                    C212149180l c212149180l = this.LIZJ;
                    c212149180l.LLILZIL = true;
                    c212149180l.LJIIIZ();
                    C19378910rj.LIZLLL(2, this.LIZJ.LLJI, null, "SLOT_BAG_BUBBLE_SHOW");
                    C212149180l.LIZIZ("bubble did show");
                }
            };
            slotViewModel.LLLF = new InterfaceC785110Uqz(this) { // from class: X.180t
                public final /* synthetic */ C212149180l LIZJ;

                {
                    this.LIZJ = this;
                }

                @Override // X.InterfaceC785110Uqz
                public final void LIZ(int i) {
                    String str;
                    long jElapsedRealtime;
                    if (i != 1) {
                        if (i != 6) {
                            str = "others";
                        } else {
                            str = "click_cart";
                        }
                    } else {
                        str = "time_out";
                    }
                    C1743900vTw c1743900vTw = c1743900vTwInvoke;
                    if (c238400w2.element <= 0) {
                        jElapsedRealtime = this.LIZJ.LIZJ().showDuration;
                    } else {
                        jElapsedRealtime = SystemClock.elapsedRealtime() - c238400w2.element;
                    }
                    C21206717yr.LJI(c1743900vTw, str, jElapsedRealtime);
                    C19378910rj.LIZLLL(3, this.LIZJ.LLJI, null, "SLOT_BAG_BUBBLE_SHOW");
                    C212149180l.LIZIZ("bubble dismiss");
                }
            };
            slotViewModel.LLJLIL = LIZJ().showDuration;
        }
        IIconSlot.SlotViewModel slotViewModel2 = this.LLJILJILJ;
        if (slotViewModel2 == null || (mutableLiveData = slotViewModel2.LLJJI) == null) {
            return;
        }
        mutableLiveData.setValue(new C785100Uqy("BOTTOM_LEFT_ICON_CLICK_GUIDE", this.LLIZLLLIL));
    }

    public final void LJIIIZ() {
        if (LIZJ().triggerCondition == 1 && this.LLJJI) {
            LIZIZ("unregisterWidgetStateListener");
            C19378910rj.LJ(this.LLJI, "SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE", this);
            this.LLJJI = false;
        }
    }

    public static final void LIZIZ(String str) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EC_NEW_USER_BUBBLE : ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C314630CUz
            if (r0 == 0) goto L78
            r4 = r6
            X.0CUz r4 = (X.C314630CUz) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L78
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L66
            if (r0 != r2) goto L7e
            X.C155000ia.LIZIZ(r3)
        L22:
            boolean r0 = r5.LLILZIL
            r3 = r0 ^ 1
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "registerWidgetStateListener, triggerCondition="
            r1.append(r0)
            com.ss.android.ugc.aweme.ecommercelive.common.infra.settings.EcShopBagBubbleNoImageSetting$EcShopBagBubbleNoImageConfig r0 = r5.LIZJ()
            int r0 = r0.triggerCondition
            r1.append(r0)
            java.lang.String r0 = ", canShow="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            LIZIZ(r0)
            com.ss.android.ugc.aweme.ecommercelive.common.infra.settings.EcShopBagBubbleNoImageSetting$EcShopBagBubbleNoImageConfig r0 = r5.LIZJ()
            int r0 = r0.triggerCondition
            if (r0 != r2) goto L63
            if (r3 == 0) goto L63
            boolean r0 = r5.LLJJI
            if (r0 != 0) goto L63
            java.lang.String r0 = "registerWidgetStateListener startRegister"
            LIZIZ(r0)
            java.lang.String r1 = r5.LLJI
            java.lang.String r0 = "SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE"
            X.C19378910rj.LIZIZ(r1, r0, r5)
            r5.LLJJI = r2
        L63:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L66:
            X.C155000ia.LIZIZ(r3)
            boolean r0 = r5.LJ()
            if (r0 != 0) goto L22
            r4.LLILLL = r2
            java.lang.Object r0 = r5.LJI(r4)
            if (r0 != r1) goto L22
            return r1
        L78:
            X.0CUz r4 = new X.0CUz
            r4.<init>(r5, r6)
            goto L12
        L7e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C212149180l.LIZLLL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C212149180l.LJI(X.05Vn):java.lang.Object");
    }

    public final Object LJIIIIZZ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLJI;
        LIZIZ("tryShow");
        int i = LIZJ().triggerCondition;
        if (i != 0) {
            if (i != 1) {
                return Unit.LIZ;
            }
            Object objLIZLLL = LIZLLL(interfaceC1364105Vn);
            if (objLIZLLL == C099R.LJFF()) {
                return objLIZLLL;
            }
            return Unit.LIZ;
        }
        int iLIZ = C19378910rj.LIZ(this.LLJI, "SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleNoShowCardCondition, pinCard=");
        sbLIZ.append(iLIZ);
        LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (iLIZ != 1 || (objLJI = LJI(interfaceC1364105Vn)) != C099R.LJFF()) {
            objLJI = Unit.LIZ;
        }
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC21213517zx
    public final void onSlotCreated(IIconSlot.SlotViewModel slotViewModel, InterfaceC21213717zz interfaceC21213717zz) {
        String idStr;
        Room room;
        OecInitData oecInitDataLIZ;
        OecInitData oecInitDataLIZ2;
        Boolean boolValueOf;
        CommerceStruct commerceStruct;
        String string;
        this.LLJILJILJ = slotViewModel;
        Room roomInvoke = this.LL.invoke();
        this.LLJJ = roomInvoke;
        String str = "";
        if (roomInvoke == null || (idStr = roomInvoke.getIdStr()) == null) {
            idStr = "";
        }
        this.LLJI = idStr;
        Room room2 = this.LLJJ;
        if (room2 != null && (string = Long.valueOf(room2.getOwnerUserId()).toString()) != null) {
            str = string;
        }
        this.LLJIJIL = str;
        Room room3 = this.LLJJ;
        if (room3 != null && room3.getIdStr() != null && (room = this.LLJJ) != null && Long.valueOf(room.getOwnerUserId()).toString() != null && (oecInitDataLIZ = C1733990vDx.LIZ(this.LLJJ)) != null && oecInitDataLIZ.isNewUserFixed && LIZJ().enable) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("meetInitCondition, config=");
            sbLIZ.append(LIZJ());
            LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            boolean zLIZ = ((C212152180o) this.LLJJIII.getValue()).LIZ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("tryShowNewUserBubble, checkLimit=");
            sbLIZ2.append(zLIZ);
            LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
            if (zLIZ) {
                if (LIZJ().triggerCondition == 0 && (oecInitDataLIZ2 = C1733990vDx.LIZ(this.LLJJ)) != null) {
                    Room room4 = this.LLJJ;
                    if (room4 != null && (commerceStruct = room4.getCommerceStruct()) != null) {
                        boolValueOf = Boolean.valueOf(commerceStruct.asyncLoad);
                    } else {
                        boolValueOf = null;
                    }
                    if (C21194717wv.LIZ(oecInitDataLIZ2, boolValueOf)) {
                        LIZIZ("tryShowNewUserBubble, hasPopCard will not show bubble");
                        return;
                    }
                }
                C23250099c.LIZLLL(this.LLJILJIL, null, null, new C314620CUy(this, null), 3);
            }
        }
    }

    public C212149180l(AwS576S0100000_32 awS576S0100000_32, AwS576S0100000_32 awS576S0100000_322, AwS576S0100000_32 awS576S0100000_323, AwS576S0100000_32 awS576S0100000_324) {
        this.LL = awS576S0100000_32;
        this.LLILLJJLI = awS576S0100000_322;
        this.LLILLL = awS576S0100000_323;
        this.LLILZ = awS576S0100000_324;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJILJIL = C2296808zG.LIZ(C2107308Nj.LIZ);
        this.LLJILLL = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(278));
        this.LLJJIII = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(279));
    }

    @Override // X.InterfaceC19379010rk
    public final void LJFF(int i, String str, Integer num, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStateChange, stateChange=");
        sbLIZ.append(i);
        sbLIZ.append(", widgetName=");
        sbLIZ.append(str);
        LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (3 == i) {
            LIZIZ("onStateChange close widget and try show");
            C23250099c.LIZLLL(this.LLJILJIL, null, null, new C314610CUx(this, null), 3);
        }
    }
}
