package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.android.editor.track.PlayPositionState;
import com.ss.ugc.android.editor.track.SeekInfo;
import com.ss.ugc.android.editor.track.TrackPanelActionListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ebw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368100Ebw extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C368000Ebm LL;
    public final /* synthetic */ PlayPositionState LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C368100Ebw(C368000Ebm c368000Ebm, PlayPositionState playPositionState, boolean z, boolean z2) {
        super(0);
        this.LL = c368000Ebm;
        this.LLILLJJLI = playPositionState;
        this.LLILLL = z;
        this.LLILZ = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String str = this.LL.TAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updatePlayState ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(' ');
        C355090Dw3.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        long j = this.LLILLJJLI.position;
        long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
        long jLIZJ = j / j2;
        int iLIZJ = (int) (jLIZJ * C360610EBv.LIZJ());
        int desireMaxScrollX = this.LL.getFrameScrollerFromXml().getDesireMaxScrollX();
        if (iLIZJ > desireMaxScrollX) {
            jLIZJ = C814420VxA.LIZJ(desireMaxScrollX / C360610EBv.LIZJ());
            iLIZJ = desireMaxScrollX;
        }
        if (this.LL.isRTL()) {
            iLIZJ = -iLIZJ;
        }
        if (this.LL.getFrameScrollerFromXml().getScrollX() != iLIZJ) {
            C368680Ecs.e0(this.LL.getScrollContainerFromXml(), iLIZJ, false, this.LLILLL, 2);
        }
        C368000Ebm c368000Ebm = this.LL;
        c368000Ebm.timestamp = jLIZJ;
        TrackPanelActionListener trackPanelActionListener = c368000Ebm.getTrackPanelActionListener();
        if (trackPanelActionListener != null) {
            trackPanelActionListener.onVideoPositionChanged(new SeekInfo(this.LL.timestamp * j2, false, 1, 0.0f, 0.0f, this.LLILZ || this.LLILLJJLI.isSeek(), false));
        }
        InterfaceC368580Eci innerListener = this.LL.getInnerListener();
        if (innerListener != null) {
            innerListener.LIZIZ(this.LL.timestamp);
        }
        return Unit.LIZ;
    }
}
