package X;

import com.ss.android.ugc.aweme.wavepublish.experiment.EnableParallelPublishSchedulerV2Exp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nPq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC1433840nPq implements InterfaceC20334914hX {
    @Override // X.InterfaceC20334914hX
    public final int LIZ() {
        Integer num = EnableParallelPublishSchedulerV2Exp.LIZ().nodeParallelLimitedNum.get(LIZIZ());
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }

    @Override // X.InterfaceC20334914hX
    public final Long LIZJ() {
        return EnableParallelPublishSchedulerV2Exp.LIZ().nodeTimeoutNum.get(LIZIZ());
    }

    @Override // X.InterfaceC20334914hX
    public final boolean LIZLLL() {
        return Intrinsics.LJFF(EnableParallelPublishSchedulerV2Exp.LIZ().nodeTimeoutNeedFinishNet.get(LIZIZ()), Boolean.TRUE);
    }
}
