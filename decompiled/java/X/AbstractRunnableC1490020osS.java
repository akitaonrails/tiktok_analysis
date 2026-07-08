package X;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0osS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractRunnableC1490020osS implements Runnable {
    public long mInitialDelay;
    public long mLoopInterval;
    public EnumC1490030osT mTaskType;
    public TimeUnit mTimeUnit;

    public boolean isLoop() {
        return this.mLoopInterval > 0;
    }

    public AbstractRunnableC1490020osS() {
        this.mTimeUnit = TimeUnit.MILLISECONDS;
    }

    public long getInitialDelay() {
        return this.mInitialDelay;
    }

    public long getLoopInterval() {
        return this.mLoopInterval;
    }

    public EnumC1490030osT getTaskType() {
        return this.mTaskType;
    }

    public TimeUnit getTimeUnit() {
        return this.mTimeUnit;
    }

    public AbstractRunnableC1490020osS(long j) {
        this.mTimeUnit = TimeUnit.MILLISECONDS;
        this.mLoopInterval = j;
    }

    public void setTaskType(EnumC1490030osT enumC1490030osT) {
        this.mTaskType = enumC1490030osT;
    }

    public AbstractRunnableC1490020osS(long j, long j2) {
        this(j2);
        this.mInitialDelay = j;
    }

    public AbstractRunnableC1490020osS(long j, long j2, TimeUnit timeUnit) {
        this(j, j2);
        this.mTimeUnit = timeUnit;
    }
}
