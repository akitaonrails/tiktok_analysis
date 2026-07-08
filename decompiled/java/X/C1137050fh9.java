package X;

import Y.ARunnableS117S0100000_17;
import android.animation.Animator;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.RemoteTrayIndividualContainerHeight;
import com.bytedance.android.livesdk.livesetting.gift.GiftUseNewGiftTrayV3;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0fh9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1137050fh9 extends C1136990fh3 implements InterfaceC1137450fhn {
    public EnumC1137330fhb LLJJIJI;
    public int LLJJIJIIJIL;
    public final C1137300fhY LLJJIJIL;

    @Override // X.C1136990fh3, X.InterfaceC1138270fj7
    public final void LJIIL() {
        LJJII(0);
        super.LJIIL();
    }

    @Override // X.InterfaceC1137450fhn
    public final void release() {
        Handler handler;
        if (GiftUseNewGiftTrayV3.INSTANCE.isPhaseTwo()) {
            LJIILJJIL();
            return;
        }
        C1137060fhA giftTrayAnimationManager = getGiftTrayAnimationManager();
        if (giftTrayAnimationManager != null) {
            Animator animator = giftTrayAnimationManager.LIZJ;
            if (animator != null && animator.isRunning()) {
                Animator animator2 = giftTrayAnimationManager.LIZJ;
                if (animator2 != null) {
                    animator2.removeAllListeners();
                }
                Animator animator3 = giftTrayAnimationManager.LIZJ;
                if (animator3 != null) {
                    animator3.cancel();
                }
                giftTrayAnimationManager.LIZJ = null;
            }
            ARunnableS117S0100000_17 aRunnableS117S0100000_17 = giftTrayAnimationManager.LIZLLL;
            if (aRunnableS117S0100000_17 != null && (handler = giftTrayAnimationManager.LIZ.getHandler()) != null) {
                handler.removeCallbacks(aRunnableS117S0100000_17);
            }
            giftTrayAnimationManager.LIZLLL = null;
        }
        setDataChannel(null);
    }

    @Override // X.C1136990fh3, X.InterfaceC1138270fj7
    public final void LIZLLL() {
        LJJII(getOccupiedHeight());
        super.LIZLLL();
    }

    @Override // X.InterfaceC1137450fhn
    public final void LJIIJJI() {
        LJIJJ(-C497820Jfg.LIZIZ(getContext()));
    }

    public int getContainerHeight() {
        ViewGroup containerView = getContainerView();
        if (containerView != null) {
            return containerView.getHeight();
        }
        return 0;
    }

    public final int getOccupiedHeight() {
        int dimensionPixelSize;
        int index = 2 - getIndex();
        try {
            dimensionPixelSize = getContext().getResources().getDimensionPixelSize(getCurrentStyle().getDefaultHeightDimen());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            dimensionPixelSize = 50;
        }
        int iLIZIZ = (int) C497740JfY.LIZIZ(getCurrentStyle().getGapDp());
        int i = index - 1;
        if (i < 0) {
            i = 0;
        }
        return (dimensionPixelSize * index) + (iLIZIZ * i);
    }

    @Override // X.C1136990fh3
    public InterfaceC1137410fhj getAnimCallback() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC1137450fhn
    public int getTrayNum() {
        return this.LLJJIJIIJIL;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0fhY] */
    public C1137050fh9(Context context) {
        super(context);
        setTrayType(EnumC1137240fhS.REMOTE);
        this.LLJJIJIL = new InterfaceC1137410fhj() { // from class: X.0fhY
            @Override // X.InterfaceC1137410fhj
            public final void LIZ() {
                if (!GiftUseNewGiftTrayV3.INSTANCE.isPhaseTwo()) {
                    this.LIZ.LJJII(0);
                }
                super/*X.0fh3*/.getAnimCallback().LIZ();
            }

            @Override // X.InterfaceC1137410fhj
            public final void LIZIZ() {
                if (!GiftUseNewGiftTrayV3.INSTANCE.isPhaseTwo()) {
                    C1137050fh9 c1137050fh9 = this.LIZ;
                    c1137050fh9.LJJII(c1137050fh9.getOccupiedHeight());
                }
                super/*X.0fh3*/.getAnimCallback().LIZIZ();
            }

            @Override // X.InterfaceC1137410fhj
            public final void LIZJ() {
                super/*X.0fh3*/.getAnimCallback().LIZJ();
            }

            @Override // X.InterfaceC1137410fhj
            public final void LIZLLL() {
                super/*X.0fh3*/.getAnimCallback().LIZLLL();
            }

            @Override // X.InterfaceC1137410fhj
            public final void LJ() {
                super/*X.0fh3*/.getAnimCallback().LJ();
            }

            @Override // X.InterfaceC1137410fhj
            public final void LJFF() {
                super/*X.0fh3*/.getAnimCallback().LJFF();
            }
        };
    }

    @Override // X.C1136990fh3
    public EnumC1136790fgj LJIILLIIL(boolean z) {
        return EnumC1136790fgj.ONE_HOST_MEDIUM_V3;
    }

    public final void LJJII(int i) {
        DataChannel dataChannel = getDataChannel();
        if (dataChannel != null) {
            dataChannel.LC0(RemoteTrayIndividualContainerHeight.class, new C1137370fhf(getTrayNum(), i));
        }
    }

    @Override // X.InterfaceC1137450fhn
    public void setTrayNum(int i) {
        this.LLJJIJIIJIL = i;
    }

    @Override // X.C1136990fh3, X.InterfaceC1137350fhd
    public final void LJIIIZ(C1137530fhv c1137530fhv, View view) {
        C1137060fhA giftTrayAnimationManager;
        Animator animator;
        if (c1137530fhv.LIZIZ == EnumC1137330fhb.ENTER && this.LLJJIJI == EnumC1137330fhb.EXIT && (animator = (giftTrayAnimationManager = getGiftTrayAnimationManager()).LIZJ) != null && animator.isStarted()) {
            giftTrayAnimationManager.LIZIZ.LIZ();
            Animator animator2 = giftTrayAnimationManager.LIZJ;
            if (animator2 != null) {
                animator2.removeAllListeners();
            }
            Animator animator3 = giftTrayAnimationManager.LIZJ;
            if (animator3 != null) {
                animator3.cancel();
            }
        }
        super.LJIIIZ(c1137530fhv, this);
        this.LLJJIJI = c1137530fhv.LIZIZ;
    }
}
