package X;

import com.ss.android.videoshop.api.stub.AutoPauseResumeLifeCycleHandler;
import com.ss.android.videoshop.context.VideoContext;

/* JADX INFO: renamed from: X.1AOl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2178691AOl {
    public long LIZIZ;
    public boolean LIZJ;
    public boolean LJ;
    public AutoPauseResumeLifeCycleHandler LJFF;
    public final VideoContext LJI;
    public long LIZ = 600000;
    public boolean LJII = true;
    public boolean LJIIIIZZ = true;
    public int LIZLLL = 1;

    public final void LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewPaused ");
        sbLIZ.append(Integer.toHexString(hashCode()));
        C2188811AlT.LIZIZ(sbLIZ);
        LIZJ(2);
    }

    public C2178691AOl(VideoContext videoContext) {
        this.LJI = videoContext;
    }

    public final void LIZ(int i) {
        boolean z;
        int i2 = this.LIZLLL;
        if ((i2 & i) == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("clearStateBitFlag return. mStateBitFlags:");
            sbLIZ.append(this.LIZLLL);
            sbLIZ.append(", stateFlag:");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        this.LIZLLL = i2 & (~i);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("clearStateBitFlag mStateBitFlags ");
        sbLIZ2.append(this.LIZLLL);
        sbLIZ2.append(" mIsWorking:");
        sbLIZ2.append(this.LJ);
        sbLIZ2.append(" mIsAutoPaused:");
        sbLIZ2.append(this.LIZJ);
        sbLIZ2.append(" ");
        sbLIZ2.append(Integer.toHexString(hashCode()));
        C2188811AlT.LIZIZ(sbLIZ2);
        if (this.LJ && this.LIZJ && this.LIZLLL == 0 && i != 0) {
            if (this.LIZIZ > 0 && System.currentTimeMillis() - this.LIZIZ > this.LIZ) {
                z = true;
            } else {
                z = false;
            }
            AutoPauseResumeLifeCycleHandler autoPauseResumeLifeCycleHandler = this.LJFF;
            if (autoPauseResumeLifeCycleHandler != null && autoPauseResumeLifeCycleHandler.onTryAutoResume(z)) {
                this.LIZJ = false;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("autoResumed ");
                sbLIZ3.append(Integer.toHexString(hashCode()));
                sbLIZ3.append(", isAutoResumeTimeout:");
                sbLIZ3.append(z);
                C2188811AlT.LIZIZ(sbLIZ3);
            }
            this.LIZJ = false;
        }
    }

    public final void LIZJ(int i) {
        AutoPauseResumeLifeCycleHandler autoPauseResumeLifeCycleHandler;
        int i2 = this.LIZLLL;
        if ((i2 & i) != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setStateBitFlag return. mStateBitFlags:");
            sbLIZ.append(this.LIZLLL);
            sbLIZ.append(", stateFlag:");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        this.LIZLLL = i2 | i;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("setStateBitFlag mStateBitFlags ");
        sbLIZ2.append(this.LIZLLL);
        sbLIZ2.append(" mIsWorking:");
        sbLIZ2.append(this.LJ);
        sbLIZ2.append(" mIsAutoPaused:");
        sbLIZ2.append(this.LIZJ);
        sbLIZ2.append(" ");
        sbLIZ2.append(Integer.toHexString(hashCode()));
        C2188811AlT.LIZIZ(sbLIZ2);
        if (this.LJ && i != 0 && (autoPauseResumeLifeCycleHandler = this.LJFF) != null && autoPauseResumeLifeCycleHandler.onTryAutoPause()) {
            this.LIZJ = true;
            this.LIZIZ = System.currentTimeMillis();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("autoPaused ");
            sbLIZ3.append(Integer.toHexString(hashCode()));
            C2188811AlT.LIZIZ(sbLIZ3);
        }
    }
}
