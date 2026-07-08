package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ml.ab.SmartIdleDetectionConfig;
import com.ss.android.ugc.aweme.video.IPlayerManagerService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NWM, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NWM extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ IPlayerManagerService LLILLJJLI;
    public final /* synthetic */ SmartIdleDetectionConfig LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NWM(int i, IPlayerManagerService iPlayerManagerService, SmartIdleDetectionConfig smartIdleDetectionConfig, boolean z) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = iPlayerManagerService;
        this.LLILLL = smartIdleDetectionConfig;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object c098200Yq;
        if (this.LL == C0NWL.LIZJ.get() && !C0NWL.LJFF) {
            try {
                this.LLILLJJLI.LIZ();
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            SmartIdleDetectionConfig smartIdleDetectionConfig = this.LLILLL;
            boolean z = this.LLILZ;
            if (C189200o6.m8isSuccessimpl(c098200Yq) && smartIdleDetectionConfig.isFeedbackSuppressEnabled() && z) {
                C0NWL.LJFF = true;
                C0NWL.LJI = System.currentTimeMillis();
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
        return Unit.LIZ;
    }
}
