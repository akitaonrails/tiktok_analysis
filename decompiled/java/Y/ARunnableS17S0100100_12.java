package Y;

import X.AbstractC775660Ubk;
import X.C098200Yq;
import X.C0UBW;
import X.C189200o6;
import X.C1C7U;
import X.C20743716Ff;
import X.C2095008Iq;
import X.C773830UXd;
import X.C775670Ubl;
import X.C775740Ubs;
import X.C778170Ufn;
import X.C778290Ufz;
import X.C781890Uln;
import X.C786410Ut5;
import X.EnumC778330Ug3;
import X.RunnableC781530UlD;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import com.bytedance.android.live.effect.singleselector.SingleMusicSelectorDialog;
import com.bytedance.android.livesdk.broadcast.stablemode.StableModeViewModel;
import com.bytedance.android.livesdk.dataChannel.CaptchaLivePauseTimeChannel;
import com.bytedance.pipo.stellar.base.card.CarouselBannerCard;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes13.dex */
public class ARunnableS17S0100100_12 implements Runnable {
    public final int $t;
    public long j1;
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        String str;
        Integer numLJIIJJI;
        C20743716Ff c20743716Ff = ((C775670Ubl) this.l0).LLILZIL;
        int i = 0;
        int iIntValue = 1;
        if (c20743716Ff != null && c20743716Ff.isChecked()) {
            i = 1;
        }
        StableModeViewModel stableModeViewModelLIZJ = AbstractC775660Ubk.LIZJ();
        ((C775670Ubl) this.l0).getClass();
        String strValueOf = String.valueOf(this.j1);
        C773830UXd c773830UXd = ((C775670Ubl) this.l0).LLILZLL;
        if (c773830UXd != null && (str = c773830UXd.LIZJ) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
            iIntValue = numLJIIJJI.intValue();
        }
        stableModeViewModelLIZJ.vQ2(new C775740Ubs("center", strValueOf, iIntValue, i));
    }

    public final void LIZ$1() {
        CarouselBannerCard carouselBannerCard = (CarouselBannerCard) this.l0;
        long j = this.j1;
        try {
            int i = (carouselBannerCard.LLILZLL + 1) % carouselBannerCard.LLIZ;
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oDLJI = carouselBannerCard.LJI();
            if (viewOnAttachStateChangeListenerC20631115oDLJI != null) {
                viewOnAttachStateChangeListenerC20631115oDLJI.setCurrentItem(i, true);
            }
            C189200o6.m2constructorimpl(Boolean.valueOf(C786410Ut5.LJLIIL(j, carouselBannerCard.LLJ, this)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final void run$0(ARunnableS17S0100100_12 aRunnableS17S0100100_12) {
        ((C781890Uln) aRunnableS17S0100100_12.l0).LJ.LLILZIL.zW(CaptchaLivePauseTimeChannel.class, Long.valueOf(aRunnableS17S0100100_12.j1));
    }

    public static final void run$1(ARunnableS17S0100100_12 aRunnableS17S0100100_12) {
        boolean zLIZ;
        C1C7U.LIZ("PreviewSettingStableModeCell@d807.<init>$1");
        try {
            aRunnableS17S0100100_12.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreviewSettingStableModeCell@d807.<init>$1");
    }

    public static final void run$2(ARunnableS17S0100100_12 aRunnableS17S0100100_12) {
        boolean zLIZ;
        C1C7U.LIZ("CarouselBannerCard@53a1.startAutoScroll$1");
        try {
            aRunnableS17S0100100_12.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CarouselBannerCard@53a1.startAutoScroll$1");
    }

    public static final void run$3(ARunnableS17S0100100_12 aRunnableS17S0100100_12) {
        boolean zLIZ;
        RunnableC781530UlD runnableC781530UlD;
        C1C7U.LIZ("SingleMusicSelectorDialog@57c1.initMusicData$1$1");
        try {
            C0UBW c0ubw = ((SingleMusicSelectorDialog) aRunnableS17S0100100_12.l0).LLIZ;
            if (c0ubw != null) {
                int iLLLI = c0ubw.LLLI(aRunnableS17S0100100_12.j1);
                SingleMusicSelectorDialog singleMusicSelectorDialog = (SingleMusicSelectorDialog) aRunnableS17S0100100_12.l0;
                if (iLLLI != -1 && (runnableC781530UlD = singleMusicSelectorDialog.LLILZLL) != null) {
                    runnableC781530UlD.smoothScrollToPosition(iLLLI);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SingleMusicSelectorDialog@57c1.initMusicData$1$1");
    }

    public static final void run$4(ARunnableS17S0100100_12 aRunnableS17S0100100_12) {
        boolean zLIZ;
        C1C7U.LIZ("PushStreamBitrateController@681e.onPushStreamBitrate$1");
        try {
            ((C778170Ufn) aRunnableS17S0100100_12.l0).LJIIIIZZ(aRunnableS17S0100100_12.j1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PushStreamBitrateController@681e.onPushStreamBitrate$1");
    }

    public static final void run$5(ARunnableS17S0100100_12 aRunnableS17S0100100_12) {
        boolean zLIZ;
        C1C7U.LIZ("LowDevicesPerformanceTipsManager@e2e8.tryShowTipsIfInNeed$1");
        try {
            ((C778290Ufz) aRunnableS17S0100100_12.l0).LIZIZ(EnumC778330Ug3.LOW_DEVICE_TIP, aRunnableS17S0100100_12.j1, false);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LowDevicesPerformanceTipsManager@e2e8.tryShowTipsIfInNeed$1");
    }

    public ARunnableS17S0100100_12(C775670Ubl c775670Ubl, int i) {
        this.$t = i;
        this.l0 = c775670Ubl;
        this.j1 = 0L;
    }

    public ARunnableS17S0100100_12(Object obj, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j1 = j;
    }
}
