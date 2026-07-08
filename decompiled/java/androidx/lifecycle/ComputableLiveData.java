package androidx.lifecycle;

import X.C08D9;
import androidx.lifecycle.ComputableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ComputableLiveData<T> {
    public final LiveData<T> _liveData;
    public final AtomicBoolean computing;
    public final Executor executor;
    public final AtomicBoolean invalid;
    public final Runnable invalidationRunnable;
    public final LiveData<T> liveData;
    public final Runnable refreshRunnable;

    public static /* synthetic */ void getInvalidationRunnable$lifecycle_livedata_release$annotations() {
    }

    public static /* synthetic */ void getRefreshRunnable$lifecycle_livedata_release$annotations() {
    }

    public abstract T compute();

    public ComputableLiveData() {
        this(C08D9.LIZLLL);
    }

    public void invalidate() {
        C08D9.LIZLLL().LIZ(this.invalidationRunnable);
    }

    public final AtomicBoolean getComputing$lifecycle_livedata_release() {
        return this.computing;
    }

    public final Executor getExecutor$lifecycle_livedata_release() {
        return this.executor;
    }

    public final AtomicBoolean getInvalid$lifecycle_livedata_release() {
        return this.invalid;
    }

    public LiveData<T> getLiveData() {
        return this.liveData;
    }

    public ComputableLiveData(Executor executor) {
        this.executor = executor;
        LiveData<T> liveData = new LiveData<T>(this) { // from class: androidx.lifecycle.ComputableLiveData$_liveData$1
            public final /* synthetic */ ComputableLiveData<T> this$0;

            @Override // androidx.lifecycle.LiveData
            public void onActive() {
                this.this$0.getExecutor$lifecycle_livedata_release().execute(this.this$0.refreshRunnable);
            }

            {
                this.this$0 = this;
            }
        };
        this._liveData = liveData;
        this.liveData = liveData;
        this.invalid = new AtomicBoolean(true);
        this.computing = new AtomicBoolean(false);
        this.refreshRunnable = new Runnable() { // from class: X.0J1K
            @Override // java.lang.Runnable
            public final void run() {
                ComputableLiveData.refreshRunnable$lambda$0(this.LL);
            }
        };
        this.invalidationRunnable = new Runnable() { // from class: X.0J1L
            @Override // java.lang.Runnable
            public final void run() {
                ComputableLiveData.invalidationRunnable$lambda$1(this.LL);
            }
        };
    }

    public static final void invalidationRunnable$lambda$1(ComputableLiveData computableLiveData) {
        boolean zHasActiveObservers = computableLiveData.getLiveData().hasActiveObservers();
        if (computableLiveData.invalid.compareAndSet(false, true) && zHasActiveObservers) {
            computableLiveData.executor.execute(computableLiveData.refreshRunnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void refreshRunnable$lambda$0(ComputableLiveData computableLiveData) {
        while (computableLiveData.computing.compareAndSet(false, true)) {
            Object objCompute = null;
            boolean z = false;
            while (computableLiveData.invalid.compareAndSet(true, false)) {
                try {
                    objCompute = computableLiveData.compute();
                    z = true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    computableLiveData.computing.set(false);
                    throw th;
                }
            }
            if (z) {
                computableLiveData.getLiveData().postValue(objCompute);
            }
            computableLiveData.computing.set(false);
            if (!z || !computableLiveData.invalid.get()) {
                return;
            }
        }
    }
}
