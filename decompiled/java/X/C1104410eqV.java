package X;

import android.animation.Animator;
import android.view.ViewGroup;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.widget.ActivityTreasureBoxWidget;
import com.bytedance.android.livesdk.livesetting.shorttouch.LiveShortTouchAllInOneReportSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0eqV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104410eqV implements InterfaceC1101940emW {
    public final Animator LIZ;
    public final /* synthetic */ C1104400eqU LIZIZ;
    public final /* synthetic */ ActivityTreasureBoxWidget LIZJ;
    public final /* synthetic */ C238400w2 LIZLLL;

    @Override // X.InterfaceC1101940emW
    public final Function1<Animator.AnimatorListener, Unit> LIZ() {
        return new AwS596S0100000_17(this, 178);
    }

    @Override // X.InterfaceC1101940emW
    public final void LIZIZ() {
        Animator animator = this.LIZ;
        if (animator != null) {
            animator.cancel();
        }
    }

    @Override // X.InterfaceC1101940emW
    public final void LIZJ() {
        if (LiveShortTouchAllInOneReportSetting.INSTANCE.enable()) {
            IShortTouchService iShortTouchService = (IShortTouchService) C1161920gLG.LIZJ(IShortTouchService.class);
            C1104400eqU c1104400eqU = this.LIZIZ;
            c1104400eqU.getClass();
            C1101820emK c1101820emKTd = iShortTouchService.Td(C1099470eiX.LIZ(c1104400eqU));
            if (c1101820emKTd != null) {
                ActivityTreasureBoxWidget activityTreasureBoxWidget = this.LIZJ;
                C238400w2 c238400w2 = this.LIZLLL;
                c1101820emKTd.LIZJ = !activityTreasureBoxWidget.LLILZ ? 1 : 0;
                c1101820emKTd.LIZLLL = c238400w2.element;
            }
        }
        Animator animator = this.LIZ;
        if (animator != null) {
            animator.start();
        }
    }

    @Override // X.InterfaceC1101940emW
    public final boolean isRunning() {
        Animator animator = this.LIZ;
        if (animator != null) {
            return animator.isRunning();
        }
        return false;
    }

    public C1104410eqV(ViewGroup viewGroup, boolean z, C1104400eqU c1104400eqU, ActivityTreasureBoxWidget activityTreasureBoxWidget, C238400w2 c238400w2) {
        this.LIZIZ = c1104400eqU;
        this.LIZJ = activityTreasureBoxWidget;
        this.LIZLLL = c238400w2;
        this.LIZ = ((IShortTouchService) C1161920gLG.LIZJ(IShortTouchService.class)).rb0(viewGroup, z);
    }
}
