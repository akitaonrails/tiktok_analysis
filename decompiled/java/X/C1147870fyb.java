package X;

import Y.ARunnableS106S0100000_6;
import android.app.Activity;
import android.os.CountDownTimer;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.data.QuickProductCheck;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fyb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.duringlive.slot.quickproduct.QuickProductSlot$onCreate$3$2$1", f = "QuickProductSlot.kt", l = {}, m = "invokeSuspend")
public final class C1147870fyb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BaseResponse<QuickProductCheck> LL;
    public final /* synthetic */ C14GT LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1147870fyb(BaseResponse<QuickProductCheck> baseResponse, C14GT c14gt, InterfaceC1364105Vn<? super C1147870fyb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = baseResponse;
        this.LLILLJJLI = c14gt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1147870fyb(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String str;
        QuickProductCheck data;
        QuickProductCheck data2;
        QuickProductCheck data3;
        C1C7U.LIZ("QuickProductSlot@467f.onCreate$3$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        BaseResponse<QuickProductCheck> baseResponse = this.LL;
        if (baseResponse != null && (data3 = baseResponse.getData()) != null && data3.available) {
            z = true;
        } else {
            z = false;
        }
        String string = null;
        if (z) {
            C14GT c14gt = this.LLILLJJLI;
            c14gt.getClass();
            c14gt.LIZ(C14GV.CAPTURE);
            final C421410Gfj c421410Gfj = c14gt.LLIZLLLIL;
            if (c421410Gfj == null) {
                c421410Gfj = null;
            }
            int visibility = c421410Gfj.getVisibility();
            c421410Gfj.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c421410Gfj);
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJIIZILJ(true);
            final long j = c421410Gfj.LLILZ;
            new CountDownTimer(j) { // from class: X.0Gfm
                @Override // android.os.CountDownTimer
                public final void onFinish() {
                    if (c421410Gfj.LLILZIL) {
                        C421410Gfj c421410Gfj2 = c421410Gfj;
                        HandlerHook.viewPost(c421410Gfj2, new ARunnableS106S0100000_6((Object) c421410Gfj2, 79));
                        C421410Gfj c421410Gfj3 = c421410Gfj;
                        int visibility2 = c421410Gfj3.getVisibility();
                        c421410Gfj3.setVisibility(8);
                        C1602160rnK.LIZIZ(visibility2, 8, c421410Gfj3);
                    }
                    InterfaceC421430Gfl interfaceC421430Gfl = c421410Gfj.LLILLL;
                    if (interfaceC421430Gfl != null) {
                        interfaceC421430Gfl.LIZ();
                    }
                }

                @Override // android.os.CountDownTimer
                public final void onTick(long j2) {
                    C16F5 c16f5 = c421410Gfj.LLILLJJLI;
                    long j3 = j2 / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                    c16f5.setText(String.valueOf(1 + j3));
                    if (j3 < 2) {
                        C421410Gfj c421410Gfj2 = c421410Gfj;
                        c421410Gfj2.LL.setAnimationListener(new C0IDK(c421410Gfj2, 0));
                    }
                    c421410Gfj.LL.reset();
                    C421410Gfj c421410Gfj3 = c421410Gfj;
                    c421410Gfj3.LLILLJJLI.startAnimation(c421410Gfj3.LL);
                }
            }.start();
            IFrameSlot.SlotViewModel slotViewModel = c14gt.LLJJI;
            if (slotViewModel == null) {
                slotViewModel = null;
            }
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(slotViewModel), (AbstractC23273099z) c14gt.LLJILLL.getValue(), null, new C2186808hW(null), 2);
        } else {
            Activity activityLIZ = C1388190mED.LIZ(this.LLILLJJLI.LL);
            if (activityLIZ != null) {
                BaseResponse<QuickProductCheck> baseResponse2 = this.LL;
                C14GT c14gt2 = this.LLILLJJLI;
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                if (baseResponse2 != null && (data2 = baseResponse2.getData()) != null) {
                    str = data2.blockReason;
                } else {
                    str = null;
                }
                if (C123100dR.LIZ(str)) {
                    if (baseResponse2 != null && (data = baseResponse2.getData()) != null) {
                        string = data.blockReason;
                    }
                } else {
                    string = c14gt2.LL.getResources().getString(2131836618);
                }
                c1389890mGx.LJIIJ(string);
                c1389890mGx.LJIIJJI();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("QuickProductSlot@467f.onCreate$3$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
