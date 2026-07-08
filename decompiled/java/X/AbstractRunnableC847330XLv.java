package X;

/* JADX INFO: renamed from: X.0XLv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractRunnableC847330XLv implements Runnable {
    public final long mInitialDelay;
    public boolean mIsLoop;
    public long mLoopInterval;
    public final String mTaskIdentifier;

    public AbstractRunnableC847330XLv() {
        this(0L);
    }

    public final long getInitialDelay() {
        return this.mInitialDelay;
    }

    public final long getLoopInterval() {
        return this.mLoopInterval;
    }

    public final String getTaskIdentifier() {
        return this.mTaskIdentifier;
    }

    public final boolean isLoop() {
        return this.mIsLoop;
    }

    public AbstractRunnableC847330XLv(long j) {
        this(j, 0L, "");
    }

    public AbstractRunnableC847330XLv(long j, String str) {
        this(j, 0L, str);
    }

    public AbstractRunnableC847330XLv(long j, long j2, String str) {
        this.mInitialDelay = j;
        this.mLoopInterval = j2;
        this.mTaskIdentifier = str;
        if (j2 > 0) {
            this.mIsLoop = true;
        }
    }
}
