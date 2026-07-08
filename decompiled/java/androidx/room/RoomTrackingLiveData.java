package androidx.room;

import X.AbstractC796540VMm;
import X.AbstractC796650VMx;
import X.C796670VMz;
import Y.ARunnableS113S0100000_13;
import androidx.lifecycle.LiveData;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes14.dex */
public class RoomTrackingLiveData<T> extends LiveData<T> {
    public final Callable<T> mComputeFunction;
    public final C796670VMz mContainer;
    public final AbstractC796540VMm mDatabase;
    public final boolean mInTransaction;
    public final AbstractC796650VMx mObserver;
    public final AtomicBoolean mInvalid = new AtomicBoolean(true);
    public final AtomicBoolean mComputing = new AtomicBoolean(false);
    public final AtomicBoolean mRegisteredObserver = new AtomicBoolean(false);
    public final Runnable mRefreshRunnable = new ARunnableS113S0100000_13(this, 9);
    public final Runnable mInvalidationRunnable = new ARunnableS113S0100000_13(this, 10);

    public Executor getQueryExecutor() {
        return this.mInTransaction ? this.mDatabase.mTransactionExecutor : this.mDatabase.mQueryExecutor;
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        this.mContainer.LIZ.add(this);
        getQueryExecutor().execute(this.mRefreshRunnable);
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        this.mContainer.LIZ.remove(this);
    }

    public RoomTrackingLiveData(AbstractC796540VMm abstractC796540VMm, C796670VMz c796670VMz, boolean z, Callable<T> callable, final String[] strArr) {
        this.mDatabase = abstractC796540VMm;
        this.mInTransaction = z;
        this.mComputeFunction = callable;
        this.mContainer = c796670VMz;
        this.mObserver = new AbstractC796650VMx(strArr) { // from class: X.0VMy
            @Override // X.AbstractC796650VMx
            public final void LIZ(Set<String> set) {
                C08D9.LIZLLL().LIZ(this.LIZIZ.mInvalidationRunnable);
            }
        };
    }
}
