package Y;

import X.AnimationAnimationListenerC1123830fLp;
import X.C1149620g1Q;
import X.C1C7U;
import X.C770580UKq;
import X.C786410Ut5;
import X.InterfaceC1124060fMC;
import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.slot.FrameL2SlotWidget;
import com.bytedance.android.live.slot.HighPrioritySlotWidget;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.wallet.model.ExchangeParams;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;

/* JADX INFO: loaded from: classes18.dex */
public class ARunnableS11S0500000_17 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        View view = (View) this.l0;
        if (view instanceof ViewGroup) {
            C786410Ut5.LJJJJI((ViewGroup) view);
            ((HighPrioritySlotWidget) this.l1).hide();
            ((IFrameSlot) this.l2).LJIJJ((String) ((Pair) this.l3).second);
            C770580UKq.LIZIZ((InterfaceC1124060fMC) this.l4, null);
        }
    }

    public static final void run$0(ARunnableS11S0500000_17 aRunnableS11S0500000_17) {
        boolean zLIZ;
        C1C7U.LIZ("HighPrioritySlotWidget@59d.showSlot$1$3$onAnimationEnd$1");
        try {
            aRunnableS11S0500000_17.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("HighPrioritySlotWidget@59d.showSlot$1$3$onAnimationEnd$1");
    }

    public static final void run$1(ARunnableS11S0500000_17 aRunnableS11S0500000_17) {
        AnimationAnimationListenerC1123830fLp animationAnimationListenerC1123830fLp = (AnimationAnimationListenerC1123830fLp) aRunnableS11S0500000_17.l0;
        View view = (View) aRunnableS11S0500000_17.l1;
        IFrameSlot iFrameSlot = (IFrameSlot) aRunnableS11S0500000_17.l2;
        Pair pair = (Pair) aRunnableS11S0500000_17.l3;
        InterfaceC1124060fMC interfaceC1124060fMC = (InterfaceC1124060fMC) aRunnableS11S0500000_17.l4;
        animationAnimationListenerC1123830fLp.getClass();
        C1C7U.LIZ("FrameL2SlotWidget$2@ef02.onChanged$1$onAnimationEnd$1L");
        if (view instanceof ViewGroup) {
            C786410Ut5.LJJJJI((ViewGroup) view);
            ((FrameL2SlotWidget) animationAnimationListenerC1123830fLp.LIZJ.l1).hide();
            iFrameSlot.LJIJJ((String) pair.second);
            C770580UKq.LIZIZ(interfaceC1124060fMC, null);
        }
        C1C7U.LIZIZ("FrameL2SlotWidget$2@ef02.onChanged$1$onAnimationEnd$1L");
    }

    public static final void run$2(ARunnableS11S0500000_17 aRunnableS11S0500000_17) {
        boolean zLIZ;
        String penaltyWarningSkip;
        C1C7U.LIZ("ExchangeCoinsForLiveMethod@101a.goExchangeToCoins$1$onExchangeFail$1");
        try {
            ExchangeParams exchangeParams = (ExchangeParams) aRunnableS11S0500000_17.l0;
            exchangeParams.skipKycReminder = true;
            CustomErrorExtra customErrorExtra = (CustomErrorExtra) aRunnableS11S0500000_17.l1;
            if (customErrorExtra == null) {
                penaltyWarningSkip = "";
            } else {
                penaltyWarningSkip = customErrorExtra.getPenaltyWarningSkip();
            }
            exchangeParams.penaltyWarningSkip = penaltyWarningSkip;
            ((C1149620g1Q) aRunnableS11S0500000_17.l2).LIZLLL((Context) aRunnableS11S0500000_17.l3, (ExchangeParams) aRunnableS11S0500000_17.l0, (CompletionBlock) aRunnableS11S0500000_17.l4);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExchangeCoinsForLiveMethod@101a.goExchangeToCoins$1$onExchangeFail$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS11S0500000_17(Object obj, View view, HighPrioritySlotWidget highPrioritySlotWidget, IFrameSlot iFrameSlot, Pair<Boolean, String> pair, InterfaceC1124060fMC<?, ?, ?> interfaceC1124060fMC) {
        this.$t = interfaceC1124060fMC;
        this.l0 = obj;
        this.l1 = view;
        this.l2 = highPrioritySlotWidget;
        this.l3 = iFrameSlot;
        this.l4 = pair;
    }
}
