package Y;

import X.C1109010exv;
import X.C1109020exw;
import X.C1116450f9v;
import X.C1116500fA0;
import X.C1135790ff7;
import X.C1135810ff9;
import X.C1135820ffA;
import X.C1135830ffB;
import X.C1C7U;
import X.EnumC1088820eRM;
import com.bytedance.android.livesdk.impl.revenue.starcomment.paymentdialog.StarCommentPaymentDialog;
import com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget;
import com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveGiftPollEffectWidget;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class ARunnableS1S0100200_17 implements Runnable {
    public final int $t;
    public long j1;
    public long j2;
    public Object l0;

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
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        LiveAbsPollEffectWidget liveAbsPollEffectWidget = (LiveAbsPollEffectWidget) this.l0;
        if (liveAbsPollEffectWidget.LLJJJIL) {
            liveAbsPollEffectWidget.A1().LJII(this.j1, this.j2, 0L);
            ((LiveAbsPollEffectWidget) this.l0).LLJJJIL = false;
        } else if (liveAbsPollEffectWidget.LL == 257) {
            liveAbsPollEffectWidget.A1().LJII(this.j1, this.j2, 300L);
        } else {
            liveAbsPollEffectWidget.A1().LJII(this.j1, this.j2, 600L);
        }
    }

    public final void LIZ$1() {
        LiveGiftPollEffectWidget liveGiftPollEffectWidget = (LiveGiftPollEffectWidget) this.l0;
        if (liveGiftPollEffectWidget.LLJJJIL) {
            liveGiftPollEffectWidget.A1().LJII(this.j1, this.j2, 0L);
            ((LiveGiftPollEffectWidget) this.l0).LLJJJIL = false;
        } else if (liveGiftPollEffectWidget.LLJJJJLIIL == 257) {
            liveGiftPollEffectWidget.A1().LJII(this.j1, this.j2, 300L);
        } else {
            liveGiftPollEffectWidget.A1().LJII(this.j1, this.j2, 600L);
        }
    }

    public final void LIZ$2() {
        C1116450f9v c1116450f9v;
        C1116450f9v next;
        Iterator<C1116450f9v> it2 = ((StarCommentPaymentDialog) this.l0).LLJ.iterator();
        while (true) {
            c1116450f9v = null;
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (next.LJ == EnumC1088820eRM.LOW) {
                    break;
                }
            }
        }
        C1116450f9v c1116450f9v2 = next;
        if (c1116450f9v2 != null) {
            c1116450f9v2.LIZ = this.j1;
        }
        Iterator<C1116450f9v> it3 = ((StarCommentPaymentDialog) this.l0).LLJ.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            C1116450f9v next2 = it3.next();
            if (next2.LJ == EnumC1088820eRM.HIGH) {
                c1116450f9v = next2;
                break;
            }
        }
        C1116450f9v c1116450f9v3 = c1116450f9v;
        if (c1116450f9v3 != null) {
            c1116450f9v3.LIZ = this.j2;
        }
        StarCommentPaymentDialog starCommentPaymentDialog = (StarCommentPaymentDialog) this.l0;
        C1116500fA0 c1116500fA0 = starCommentPaymentDialog.LLJIJIL;
        if (c1116500fA0 != null) {
            List<C1116450f9v> list = starCommentPaymentDialog.LLJ;
            c1116500fA0.LL = list;
            c1116500fA0.notifyItemRangeChanged(0, ((ArrayList) list).size(), "AdjustPrice");
        }
    }

    public static final void run$0(ARunnableS1S0100200_17 aRunnableS1S0100200_17) {
        boolean zLIZ;
        C1C7U.LIZ("GiftMessageIMInterceptor@b42d.logMessageReceive$1");
        try {
            C1135820ffA.LIZ((GiftMessage) aRunnableS1S0100200_17.l0, aRunnableS1S0100200_17.j1, aRunnableS1S0100200_17.j2);
            C1135830ffB c1135830ffB = C1135830ffB.LIZ;
            GiftMessage giftMessage = (GiftMessage) aRunnableS1S0100200_17.l0;
            long j = aRunnableS1S0100200_17.j1;
            long j2 = aRunnableS1S0100200_17.j2;
            c1135830ffB.getClass();
            C1135830ffB.LIZIZ(giftMessage, j, j2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftMessageIMInterceptor@b42d.logMessageReceive$1");
    }

    public static final void run$1(ARunnableS1S0100200_17 aRunnableS1S0100200_17) {
        boolean zLIZ;
        C1C7U.LIZ("PinMessageManager@ae43.countDown$2");
        try {
            C1109010exv c1109010exv = C1109010exv.LIZ;
            long j = aRunnableS1S0100200_17.j1;
            long j2 = aRunnableS1S0100200_17.j2;
            C1109020exw c1109020exw = (C1109020exw) aRunnableS1S0100200_17.l0;
            c1109010exv.getClass();
            C1109010exv.LJIILLIIL(j, j2 - (j2 % 1000), c1109020exw);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PinMessageManager@ae43.countDown$2");
    }

    public static final void run$2(ARunnableS1S0100200_17 aRunnableS1S0100200_17) {
        boolean zLIZ;
        C1C7U.LIZ("PinMessageManager@ae43.promoteCountDown$2");
        try {
            C1109010exv c1109010exv = C1109010exv.LIZ;
            long j = aRunnableS1S0100200_17.j1;
            long j2 = aRunnableS1S0100200_17.j2 - 1000;
            C1109020exw c1109020exw = (C1109020exw) aRunnableS1S0100200_17.l0;
            c1109010exv.getClass();
            C1109010exv.LJIILLIIL(j, j2, c1109020exw);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PinMessageManager@ae43.promoteCountDown$2");
    }

    public static final void run$3(ARunnableS1S0100200_17 aRunnableS1S0100200_17) {
        boolean zLIZ;
        C1C7U.LIZ("LiveAbsPollEffectWidget@6e12.setContentText$1");
        try {
            aRunnableS1S0100200_17.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveAbsPollEffectWidget@6e12.setContentText$1");
    }

    public static final void run$4(ARunnableS1S0100200_17 aRunnableS1S0100200_17) {
        boolean zLIZ;
        C1C7U.LIZ("LiveGiftPollEffectWidget@53e9.setContentText$1");
        try {
            aRunnableS1S0100200_17.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveGiftPollEffectWidget@53e9.setContentText$1");
    }

    public static final void run$5(ARunnableS1S0100200_17 aRunnableS1S0100200_17) {
        boolean zLIZ;
        C1C7U.LIZ("StarCommentPaymentDialog@9fd7.checkPriceAdjustment$4");
        try {
            aRunnableS1S0100200_17.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StarCommentPaymentDialog@9fd7.checkPriceAdjustment$4");
    }

    public static final void run$6(ARunnableS1S0100200_17 aRunnableS1S0100200_17) {
        boolean zLIZ;
        C1C7U.LIZ("LiveGiftTrayDisplayController@5e3.onExitEnd$2");
        try {
            C1135790ff7.LJFF((C1135810ff9) aRunnableS1S0100200_17.l0, aRunnableS1S0100200_17.j1, aRunnableS1S0100200_17.j2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveGiftTrayDisplayController@5e3.onExitEnd$2");
    }

    public ARunnableS1S0100200_17(long j, long j2, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.j2 = j2;
        this.l0 = obj;
    }
}
