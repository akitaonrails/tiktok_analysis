package X;

import android.os.SystemClock;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.180m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.sea.marketing.bubble.SeaLiveBagIconEducationBubbleController$startShowBubble$2", f = "SeaLiveBagIconEducationBubbleController.kt", l = {}, m = "invokeSuspend")
public final class C212150180m extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C212148180k LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C212150180m(C212148180k c212148180k, InterfaceC1364105Vn<? super C212150180m> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c212148180k;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C212150180m(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaLiveBagIconEducationBubbleController@4d1c.startShowBubble$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C212148180k c212148180k = this.LL;
        if (!c212148180k.LLJI && !c212148180k.LIZIZ() && this.LL.LLJILLL.length() != 0) {
            C212148180k.LIZ("start show bubble!");
            final C238400w2 c238400w2 = new C238400w2();
            c238400w2.element = -1L;
            final C1743900vTw c1743900vTwInvoke = this.LL.LLILLL.invoke();
            final C212148180k c212148180k2 = this.LL;
            IIconSlot.SlotViewModel slotViewModel = c212148180k2.LLILZ;
            if (slotViewModel != null) {
                slotViewModel.LLL = new InterfaceC784990Uqn() { // from class: X.180j
                    @Override // X.InterfaceC784990Uqn
                    public final void LIZ() {
                        int i;
                        c238400w2.element = SystemClock.elapsedRealtime();
                        c1743900vTwInvoke.LJIIIIZZ("guidance_text_type", c212148180k2.LLJJ, false);
                        C21206717yr.LJII(c1743900vTwInvoke);
                        C212148180k.LLJJI.getClass();
                        Keva keva = C212148180k.LLJJIII;
                        try {
                            i = keva.getInt("education_bubble_shown", 0);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                            i = 0;
                        }
                        keva.storeInt("education_bubble_shown", i + 1);
                        C212148180k c212148180k3 = c212148180k2;
                        c212148180k3.LLJI = true;
                        if (c212148180k3.LLJ) {
                            C212148180k.LIZ("unregisterWidgetStateListener");
                            C19378910rj.LJ(c212148180k3.LLILZLL, "SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE", c212148180k3);
                            c212148180k3.LLJ = false;
                        }
                        C19378910rj.LIZLLL(2, c212148180k2.LLILZLL, null, "SLOT_BAG_BUBBLE_SHOW");
                        C212148180k.LIZ("bubble did show");
                    }
                };
                slotViewModel.LLLF = new InterfaceC785110Uqz() { // from class: X.180s
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
                            jElapsedRealtime = c212148180k2.LLIZLLLIL.showDuration;
                        } else {
                            jElapsedRealtime = SystemClock.elapsedRealtime() - c238400w2.element;
                        }
                        C21206717yr.LJI(c1743900vTw, str, jElapsedRealtime);
                        C19378910rj.LIZLLL(3, c212148180k2.LLILZLL, null, "SLOT_BAG_BUBBLE_SHOW");
                        C212148180k.LIZ("bubble dismiss");
                    }
                };
                slotViewModel.LLJLIL = c212148180k2.LLIZLLLIL.showDuration;
                MutableLiveData<C785100Uqy> mutableLiveData = slotViewModel.LLJJI;
                if (mutableLiveData != null) {
                    mutableLiveData.setValue(new C785100Uqy("ECOM_SHOP_BAG_GUIDE", c212148180k2.LLJILLL));
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SeaLiveBagIconEducationBubbleController@4d1c.startShowBubble$2");
            return unit;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("can't show bubble, otherCardShow=");
        sbLIZ.append(this.LL.LIZIZ());
        sbLIZ.append(", hasShown=");
        sbLIZ.append(this.LL.LLJI);
        sbLIZ.append(", bubbleStr=");
        sbLIZ.append(this.LL.LLJILLL);
        C212148180k.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SeaLiveBagIconEducationBubbleController@4d1c.startShowBubble$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
