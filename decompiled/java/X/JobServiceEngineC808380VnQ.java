package X;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.Intent;
import androidx.core.app.JobIntentService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VnQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class JobServiceEngineC808380VnQ extends JobServiceEngine implements InterfaceC808430VnV {
    public final JobIntentService LIZ;
    public final Object LIZIZ;
    public JobParameters LIZJ;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VnR] */
    public final C808390VnR LIZ() {
        synchronized (this.LIZIZ) {
            try {
                JobParameters jobParameters = this.LIZJ;
                if (jobParameters == null) {
                    return null;
                }
                final JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                if (jobWorkItemDequeueWork == null) {
                    return null;
                }
                jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.LIZ.getClassLoader());
                return new InterfaceC808420VnU(jobWorkItemDequeueWork) { // from class: X.0VnR
                    public final JobWorkItem LIZ;

                    @Override // X.InterfaceC808420VnU
                    public final void LJFF() {
                        synchronized (this.LIZIZ.LIZIZ) {
                            try {
                                JobParameters jobParameters2 = this.LIZIZ.LIZJ;
                                if (jobParameters2 != null) {
                                    jobParameters2.completeWork(this.LIZ);
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }

                    @Override // X.InterfaceC808420VnU
                    public final Intent getIntent() {
                        return this.LIZ.getIntent();
                    }

                    {
                        this.LIZ = jobWorkItemDequeueWork;
                    }
                };
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public JobServiceEngineC808380VnQ(JobIntentService jobIntentService) {
        super(jobIntentService);
        this.LIZIZ = new Object();
        this.LIZ = jobIntentService;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStartJob(JobParameters jobParameters) {
        this.LIZJ = jobParameters;
        this.LIZ.ensureProcessorRunningLocked(false);
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zDoStopCurrentWork = this.LIZ.doStopCurrentWork();
        synchronized (this.LIZIZ) {
            try {
                this.LIZJ = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zDoStopCurrentWork;
    }
}
