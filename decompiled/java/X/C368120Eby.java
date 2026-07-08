package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Eby, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368120Eby extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C368000Ebm LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C368120Eby(C368000Ebm c368000Ebm, float f, boolean z) {
        super(0);
        this.LL = c368000Ebm;
        this.LLILLJJLI = f;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        float f = C368130Ebz.LIZJ;
        float f2 = C368130Ebz.LIZLLL;
        C368000Ebm c368000Ebm = this.LL;
        c368000Ebm.scale = c368000Ebm.getScale() * ((double) this.LLILLJJLI);
        if (this.LLILLL) {
            double d = f;
            if (this.LL.getScale() <= d) {
                this.LL.scale = d;
            }
            double d2 = f2;
            if (this.LL.getScale() >= d2) {
                this.LL.scale = d2;
            }
        }
        int i = C360610EBv.LIZ;
        C360610EBv.LIZ = (int) (((double) LSPassThroughRecordSizeConfig.DEFAULT) / this.LL.getScale());
        InterfaceC368580Eci innerListener = this.LL.getInnerListener();
        if (innerListener != null) {
            innerListener.LJ(this.LL.getScale());
        }
        C368060Ebs c368060Ebs = this.LL.dropTrack;
        if (c368060Ebs != null) {
            c368060Ebs.requestLayout();
            c368060Ebs.LLILLJJLI.invalidate();
        }
        this.LL.updateLineTrackScale();
        this.LL.getTimeRulerFromXml().requestLayout();
        C368000Ebm c368000Ebm2 = this.LL;
        c368000Ebm2.tryRefreshLimitBg(c368000Ebm2.getTimeRulerFromXml().getDurationTime());
        this.LL.getScrollContainerFromXml().setTimelineScale(C360610EBv.LIZJ());
        C368000Ebm c368000Ebm3 = this.LL;
        long j = c368000Ebm3.timestamp;
        if (c368000Ebm3.isRTL()) {
            float f3 = j;
            if (this.LL.getScrollContainerFromXml().getScrollX() != (-((int) (C360610EBv.LIZJ() * f3)))) {
                C368680Ecs.e0(this.LL.getScrollContainerFromXml(), -((int) (f3 * C360610EBv.LIZJ())), false, false, 6);
            }
        } else {
            float f4 = j;
            if (this.LL.getScrollContainerFromXml().getScrollX() != ((int) (C360610EBv.LIZJ() * f4))) {
                C368680Ecs.e0(this.LL.getScrollContainerFromXml(), (int) (f4 * C360610EBv.LIZJ()), false, false, 6);
            }
        }
        InterfaceC368580Eci innerListener2 = this.LL.getInnerListener();
        if (innerListener2 != null) {
            innerListener2.LIZJ(this.LL.getFrameScrollerFromXml().getScrollX(), false, true);
        }
        return Unit.LIZ;
    }
}
