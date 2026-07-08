package X;

import android.animation.Animator;
import android.view.ViewGroup;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.chatroom.model.BigCardInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0eje, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1100160eje implements InterfaceC1101940emW {
    public final Object LIZ;
    public final Animator LIZIZ;
    public final /* synthetic */ C1100170ejf LIZJ;

    @Override // X.InterfaceC1101940emW
    public final Function1<Animator.AnimatorListener, Unit> LIZ() {
        return new AwS596S0100000_17(this, 591);
    }

    @Override // X.InterfaceC1101940emW
    public final void LIZIZ() {
        Animator animator = this.LIZIZ;
        if (animator != null) {
            animator.cancel();
        }
    }

    @Override // X.InterfaceC1101940emW
    public final void LIZJ() {
        C1100170ejf c1100170ejf = this.LIZJ;
        AbstractC1098830ehV abstractC1098830ehV = c1100170ejf.LLJJ;
        if (abstractC1098830ehV != null && c1100170ejf.LLIZLLLIL.resourceLoadStrategy != 1) {
            abstractC1098830ehV.LJI(null);
        }
        Animator animator = this.LIZIZ;
        if (animator != null) {
            animator.start();
        }
    }

    @Override // X.InterfaceC1101940emW
    public final boolean isRunning() {
        Animator animator = this.LIZIZ;
        return animator != null && animator.isRunning();
    }

    public C1100160eje(C1100170ejf c1100170ejf, ViewGroup viewGroup, boolean z) {
        Object objValueOf;
        long jLongValue;
        Long l;
        this.LIZJ = c1100170ejf;
        BigCardInfo bigCardInfo = c1100170ejf.LLIZLLLIL.bigCardInfo;
        if (bigCardInfo != null) {
            objValueOf = Integer.valueOf(bigCardInfo.holdDuration);
        } else {
            objValueOf = 0L;
        }
        this.LIZ = objValueOf;
        if ((objValueOf instanceof Long) && (l = (Long) objValueOf) != null && l.longValue() > 0) {
            jLongValue = ((Long) objValueOf).longValue();
        } else {
            jLongValue = 660;
        }
        this.LIZIZ = ((IShortTouchService) C1161920gLG.LIZJ(IShortTouchService.class)).xM1(viewGroup, jLongValue, z);
    }
}
