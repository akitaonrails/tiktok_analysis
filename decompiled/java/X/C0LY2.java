package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.ss.android.ugc.aweme.aigc.asynctask.experiment.AigcArchSeparatePollingTaskFromServerTaskExperiment;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LY2, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LY2 extends AbstractC426101lD {
    public final InterfaceC497601wk LIZ;
    public final C2252321DDq LIZIZ;
    public AnonymousClass0956 LIZJ;
    public final C2252321DDq LIZLLL;

    public final void LIZIZ() {
        AnonymousClass0956 anonymousClass0956 = this.LIZJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LIZJ = null;
        this.LIZIZ.setValue(new Pair(0L, Boolean.FALSE));
    }

    public C0LY2(LifecycleCoroutineScope lifecycleCoroutineScope) {
        this.LIZ = lifecycleCoroutineScope;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new Pair(0L, Boolean.FALSE));
        this.LIZIZ = c2252321DDqLIZ;
        this.LIZLLL = c2252321DDqLIZ;
    }

    public final void LIZJ(long j, boolean z) {
        if (j > 3600) {
            this.LIZIZ.setValue(new Pair(Long.valueOf(-C814420VxA.LIZJ(j / ((double) 3600))), Boolean.valueOf(z)));
        } else {
            this.LIZIZ.setValue(new Pair(Long.valueOf(C814420VxA.LIZJ(j / ((double) 60))), Boolean.valueOf(z)));
        }
    }

    public final void LIZ(C0LY5 c0ly5, int i, long j, long j2) {
        String str;
        String str2 = c0ly5.LIZLLL;
        String str3 = c0ly5.LJ;
        int i2 = c0ly5.LJFF;
        int i3 = c0ly5.LJI;
        if (this.LIZJ == null && !Intrinsics.LJFF(str3, "FINISHED") && !Intrinsics.LJFF(str3, "FAILED")) {
            if (AigcArchSeparatePollingTaskFromServerTaskExperiment.isEnabled()) {
                str = "PROGRESS";
            } else {
                str = "SERVER";
            }
            if (Intrinsics.LJFF(str2, str) && i2 == 2) {
                boolean z = false;
                if (i3 <= 0) {
                    i3 = 0;
                }
                if (i3 > 1800000) {
                    z = true;
                }
                long j3 = (i3 / LSPassThroughRecordSizeConfig.DEFAULT) + i;
                C238400w2 c238400w2 = new C238400w2();
                long j4 = j3 - j;
                c238400w2.element = j4;
                if (j4 <= 0) {
                    this.LIZIZ.setValue(new Pair(1L, Boolean.valueOf(z)));
                } else {
                    this.LIZJ = C23250099c.LIZLLL(this.LIZ, C0PEM.LIZ, null, new C05HD(this, c238400w2, z, j, null), 2);
                }
            }
        }
    }
}
