package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.PlayMaskScoreUpdateEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01I6, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01I6 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C01I4 LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01I6(C01I4 c01i4, long j, long j2) {
        super(0);
        this.LL = c01i4;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        DataChannel dataChannel = this.LL.LIZ;
        if (dataChannel != null) {
            dataChannel.LC0(PlayMaskScoreUpdateEvent.class, new C938130aWJ(this.LLILLJJLI, this.LLILLL, 12));
        }
        return Unit.LIZ;
    }
}
