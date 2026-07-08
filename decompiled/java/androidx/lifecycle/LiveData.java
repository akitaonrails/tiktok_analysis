package androidx.lifecycle;

import X.AbstractC1563340qmi;
import X.C08D9;
import X.C0C64;
import X.C1565730qqZ;
import X.C19506511Tj;
import X.C199Y;
import X.C19FO;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C665300Q7s;
import X.EnumC682280QpW;
import android.content.Context;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes30.dex */
public abstract class LiveData<T> {
    public static final Object NOT_SET = new Object();
    public int mActiveCount;
    public boolean mChangingActiveState;
    public volatile Object mData;
    public final Object mDataLock;
    public boolean mDispatchInvalidated;
    public boolean mDispatchingValue;
    public SafeIterableMap<Observer<? super T>, LiveData<T>.ObserverWrapper> mObservers;
    public volatile Object mPendingData;
    public final Runnable mPostValueRunnable;
    public int mVersion;

    public class LifecycleBoundObserver extends LiveData<T>.ObserverWrapper implements LifecycleEventObserver {
        public final LifecycleOwner mOwner;

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            androidx_lifecycle_LiveData$LifecycleBoundObserver_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_onStateChanged(this, lifecycleOwner, event);
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public boolean shouldBeActive() {
            return androidx_lifecycle_LiveData$LifecycleBoundObserver_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_shouldBeActive(this);
        }

        public boolean androidx_lifecycle_LiveData$LifecycleBoundObserver__shouldBeActive$___twin___() {
            return this.mOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED);
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public void detachObserver() {
            this.mOwner.getLifecycle().removeObserver(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean androidx_lifecycle_LiveData$LifecycleBoundObserver_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_shouldBeActive(LifecycleBoundObserver lifecycleBoundObserver) {
            Context context;
            Integer numLIZ;
            LifecycleOwner lifecycleOwner = lifecycleBoundObserver.mOwner;
            if (lifecycleOwner instanceof C199Y) {
                AbstractC1563340qmi abstractC1563340qmi = (AbstractC1563340qmi) lifecycleOwner.getLifecycle();
                EnumC682280QpW enumC682280QpW = EnumC682280QpW.GET_CURRENT_STATE;
                if (abstractC1563340qmi.LJI(enumC682280QpW) && (numLIZ = C1565730qqZ.LIZ(enumC682280QpW.getValue(), (context = (Context) lifecycleOwner))) != null) {
                    boolean zAndroidx_lifecycle_LiveData$LifecycleBoundObserver__shouldBeActive$___twin___ = lifecycleBoundObserver.androidx_lifecycle_LiveData$LifecycleBoundObserver__shouldBeActive$___twin___();
                    C1565730qqZ.LIZIZ(numLIZ.intValue(), context);
                    return zAndroidx_lifecycle_LiveData$LifecycleBoundObserver__shouldBeActive$___twin___;
                }
            }
            return lifecycleBoundObserver.androidx_lifecycle_LiveData$LifecycleBoundObserver__shouldBeActive$___twin___();
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public boolean isAttachedTo(LifecycleOwner lifecycleOwner) {
            if (this.mOwner == lifecycleOwner) {
                return true;
            }
            return false;
        }

        public void androidx_lifecycle_LiveData$LifecycleBoundObserver__onStateChanged$___twin___(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Lifecycle.State currentState = this.mOwner.getLifecycle().getCurrentState();
            if (currentState == Lifecycle.State.DESTROYED) {
                LiveData.this.removeObserver(this.mObserver);
                return;
            }
            Lifecycle.State state = null;
            while (state != currentState) {
                activeStateChanged(shouldBeActive());
                state = currentState;
                currentState = this.mOwner.getLifecycle().getCurrentState();
            }
        }

        public LifecycleBoundObserver(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
            super(observer);
            this.mOwner = lifecycleOwner;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void androidx_lifecycle_LiveData$LifecycleBoundObserver_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_onStateChanged(LifecycleBoundObserver lifecycleBoundObserver, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Context context;
            Integer numLIZ;
            LifecycleOwner lifecycleOwner2 = lifecycleBoundObserver.mOwner;
            if (lifecycleOwner2 instanceof C199Y) {
                AbstractC1563340qmi abstractC1563340qmi = (AbstractC1563340qmi) lifecycleOwner2.getLifecycle();
                EnumC682280QpW enumC682280QpW = EnumC682280QpW.GET_CURRENT_STATE;
                if (abstractC1563340qmi.LJI(enumC682280QpW) && (numLIZ = C1565730qqZ.LIZ(enumC682280QpW.getValue() | EnumC682280QpW.LIVEDATA_OBSERVE.getValue(), (context = (Context) lifecycleOwner2))) != null) {
                    lifecycleBoundObserver.androidx_lifecycle_LiveData$LifecycleBoundObserver__onStateChanged$___twin___(lifecycleOwner, event);
                    C1565730qqZ.LIZIZ(numLIZ.intValue(), context);
                    return;
                }
            }
            lifecycleBoundObserver.androidx_lifecycle_LiveData$LifecycleBoundObserver__onStateChanged$___twin___(lifecycleOwner, event);
        }
    }

    public static void assertMainThread(String str) {
        androidx_lifecycle_LiveData_com_ss_android_ugc_aweme_lancet_SAFLancet_assertMainThread(str);
    }

    public void observe(LifecycleOwner lifecycleOwner, Observer observer) {
        androidx_lifecycle_LiveData_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_observe(this, lifecycleOwner, observer);
    }

    public void onActive() {
    }

    public void onInactive() {
    }

    public void removeObserver(Observer observer) {
        androidx_lifecycle_LiveData_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_removeObserver(this, observer);
    }

    public T getValue() {
        T t = (T) this.mData;
        if (t != NOT_SET) {
            return t;
        }
        return null;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        return this.mObservers.size() > 0;
    }

    public boolean isInitialized() {
        return this.mData != NOT_SET;
    }

    public LiveData() {
        this.mDataLock = new Object();
        this.mObservers = new SafeIterableMap<>();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new Runnable() { // from class: androidx.lifecycle.LiveData.1
            @Override // java.lang.Runnable
            public void run() {
                androidx_lifecycle_LiveData$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public void androidx_lifecycle_LiveData$1__run$___twin___() {
                Object obj2;
                synchronized (LiveData.this.mDataLock) {
                    try {
                        obj2 = LiveData.this.mPendingData;
                        LiveData.this.mPendingData = LiveData.NOT_SET;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                LiveData.this.setValue(obj2);
            }

            public static void androidx_lifecycle_LiveData$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                try {
                    anonymousClass1.androidx_lifecycle_LiveData$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        };
        this.mData = obj;
        this.mVersion = -1;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public abstract class ObserverWrapper {
        public boolean mActive;
        public int mLastVersion = -1;
        public final Observer<? super T> mObserver;

        public void detachObserver() {
        }

        public boolean isAttachedTo(LifecycleOwner lifecycleOwner) {
            return false;
        }

        public abstract boolean shouldBeActive();

        public void activeStateChanged(boolean z) {
            int i;
            if (z == this.mActive) {
                return;
            }
            this.mActive = z;
            LiveData liveData = LiveData.this;
            if (z) {
                i = 1;
            } else {
                i = -1;
            }
            liveData.changeActiveCounter(i);
            if (this.mActive) {
                LiveData.this.dispatchingValue(this);
            }
        }

        public ObserverWrapper(Observer<? super T> observer) {
            this.mObserver = observer;
        }
    }

    public LiveData(T t) {
        this.mDataLock = new Object();
        this.mObservers = new SafeIterableMap<>();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new Runnable() { // from class: androidx.lifecycle.LiveData.1
            @Override // java.lang.Runnable
            public void run() {
                androidx_lifecycle_LiveData$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public void androidx_lifecycle_LiveData$1__run$___twin___() {
                Object obj2;
                synchronized (LiveData.this.mDataLock) {
                    try {
                        obj2 = LiveData.this.mPendingData;
                        LiveData.this.mPendingData = LiveData.NOT_SET;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                LiveData.this.setValue(obj2);
            }

            public static void androidx_lifecycle_LiveData$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                try {
                    anonymousClass1.androidx_lifecycle_LiveData$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        };
        this.mData = t;
        this.mVersion = 0;
    }

    public static void androidx_lifecycle_LiveData__assertMainThread$___twin___(String str) {
        if (C08D9.LIZLLL().LIZIZ()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cannot invoke ");
        sbLIZ.append(str);
        sbLIZ.append(" on a background thread");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void androidx_lifecycle_LiveData_com_ss_android_ugc_aweme_lancet_SAFLancet_assertMainThread(String str) {
        if (C665300Q7s.LIZ()) {
            return;
        }
        androidx_lifecycle_LiveData__assertMainThread$___twin___(str);
    }

    private void considerNotify(LiveData<T>.ObserverWrapper observerWrapper) {
        if (!observerWrapper.mActive) {
            return;
        }
        if (!observerWrapper.shouldBeActive()) {
            observerWrapper.activeStateChanged(false);
            return;
        }
        int i = observerWrapper.mLastVersion;
        int i2 = this.mVersion;
        if (i >= i2) {
            return;
        }
        observerWrapper.mLastVersion = i2;
        observerWrapper.mObserver.onChanged((Object) this.mData);
    }

    public void androidx_lifecycle_LiveData__removeObserver$___twin___(Observer<? super T> observer) {
        androidx_lifecycle_LiveData_com_ss_android_ugc_aweme_lancet_SAFLancet_assertMainThread("removeObserver");
        LiveData<T>.ObserverWrapper observerWrapperRemove = this.mObservers.remove(observer);
        if (observerWrapperRemove == null) {
            return;
        }
        observerWrapperRemove.detachObserver();
        observerWrapperRemove.activeStateChanged(false);
    }

    public void changeActiveCounter(int i) {
        boolean z;
        int i2 = this.mActiveCount;
        this.mActiveCount = i + i2;
        if (this.mChangingActiveState) {
            return;
        }
        this.mChangingActiveState = true;
        while (true) {
            try {
                int i3 = this.mActiveCount;
                if (i2 != i3) {
                    if (i2 == 0) {
                        if (i3 > 0) {
                            onActive();
                        }
                    } else {
                        if (i2 > 0 && i3 == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (0 == 0) {
                            if (z) {
                                onInactive();
                            }
                        } else {
                            onActive();
                        }
                    }
                    i2 = i3;
                } else {
                    this.mChangingActiveState = false;
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.mChangingActiveState = false;
                throw th;
            }
        }
    }

    public void dispatchingValue(LiveData<T>.ObserverWrapper observerWrapper) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (observerWrapper != null) {
                considerNotify(observerWrapper);
                observerWrapper = null;
            } else {
                SafeIterableMap<Observer<? super T>, LiveData<T>.ObserverWrapper>.d dVarIteratorWithAdditions = this.mObservers.iteratorWithAdditions();
                while (dVarIteratorWithAdditions.hasNext()) {
                    considerNotify((ObserverWrapper) ((Map.Entry) dVarIteratorWithAdditions.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public void observeForever(Observer<? super T> observer) {
        androidx_lifecycle_LiveData_com_ss_android_ugc_aweme_lancet_SAFLancet_assertMainThread("observeForever");
        AlwaysActiveObserver alwaysActiveObserver = new AlwaysActiveObserver(observer);
        LiveData<T>.ObserverWrapper observerWrapperPutIfAbsent = this.mObservers.putIfAbsent(observer, alwaysActiveObserver);
        if (!(observerWrapperPutIfAbsent instanceof LifecycleBoundObserver)) {
            if (observerWrapperPutIfAbsent != null) {
                return;
            }
            alwaysActiveObserver.activeStateChanged(true);
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    public void postValue(T t) {
        boolean z;
        synchronized (this.mDataLock) {
            try {
                if (this.mPendingData == NOT_SET) {
                    z = true;
                } else {
                    z = false;
                }
                this.mPendingData = t;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (!z) {
            return;
        }
        C08D9.LIZLLL().LIZJ(this.mPostValueRunnable);
    }

    public void removeObservers(LifecycleOwner lifecycleOwner) {
        androidx_lifecycle_LiveData_com_ss_android_ugc_aweme_lancet_SAFLancet_assertMainThread("removeObservers");
        for (Map.Entry<Observer<? super T>, LiveData<T>.ObserverWrapper> entry : this.mObservers) {
            if (entry.getValue().isAttachedTo(lifecycleOwner)) {
                removeObserver(entry.getKey());
            }
        }
    }

    public void setValue(T t) {
        androidx_lifecycle_LiveData_com_ss_android_ugc_aweme_lancet_SAFLancet_assertMainThread("setValue");
        this.mVersion++;
        this.mData = t;
        dispatchingValue(null);
    }

    public class AlwaysActiveObserver extends LiveData<T>.ObserverWrapper {
        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public boolean shouldBeActive() {
            return true;
        }

        public AlwaysActiveObserver(Observer<? super T> observer) {
            super(observer);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void androidx_lifecycle_LiveData_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_removeObserver(LiveData liveData, Observer observer) {
        C19506511Tj c19506511Tj;
        if (C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "fix_observer_leak_exp", true, false)) {
            WeakReference<C19506511Tj> weakReferenceRemove = C1565730qqZ.LIZ.remove(observer);
            if (weakReferenceRemove != null && (c19506511Tj = weakReferenceRemove.get()) != null) {
                observer = c19506511Tj;
            }
            liveData.androidx_lifecycle_LiveData__removeObserver$___twin___(observer);
            return;
        }
        liveData.androidx_lifecycle_LiveData__removeObserver$___twin___(observer);
    }

    public void androidx_lifecycle_LiveData__observe$___twin___(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
        androidx_lifecycle_LiveData_com_ss_android_ugc_aweme_lancet_SAFLancet_assertMainThread("observe");
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(lifecycleOwner, observer);
        LiveData<T>.ObserverWrapper observerWrapperPutIfAbsent = this.mObservers.putIfAbsent(observer, lifecycleBoundObserver);
        if (observerWrapperPutIfAbsent != null) {
            if (observerWrapperPutIfAbsent.isAttachedTo(lifecycleOwner)) {
            } else {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            }
        } else {
            lifecycleOwner.getLifecycle().addObserver(lifecycleBoundObserver);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void androidx_lifecycle_LiveData_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_observe(LiveData liveData, LifecycleOwner lifecycleOwner, final Observer observer) {
        Integer numLIZ;
        Context context;
        Integer numLIZ2;
        Observer<T> observer2;
        if (lifecycleOwner instanceof MainActivity) {
            final AbstractC1563340qmi abstractC1563340qmi = (AbstractC1563340qmi) lifecycleOwner.getLifecycle();
            if (abstractC1563340qmi.LJI(EnumC682280QpW.LIVEDATA_OBSERVE)) {
                if (C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "fix_observer_leak_exp", true, false)) {
                    final MainActivity mainActivity = (MainActivity) lifecycleOwner;
                    observer2 = new Observer<T>(observer, mainActivity, abstractC1563340qmi) { // from class: X.11Tj
                        public final Observer<T> LL;
                        public final MainActivity LLILLJJLI;
                        public final StackTraceElement[] LLILLL = new Throwable().getStackTrace();

                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(T t) {
                            if (this.LLILLJJLI.getMainSAFFragmentOrNull() != null && !this.LLILLJJLI.getMainSAFFragmentOrNull().getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                                C11KI.LIZ().LIZJ();
                                ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJII();
                                if (!((IDetailFeedSafService) ServiceManager.get().getService(IDetailFeedSafService.class)).LJ() || this.LLILLJJLI.getMainSAFFragmentOrNull() == SAFExtensionKt.LJIILLIIL(this.LLILLJJLI)) {
                                    this.LLILLJJLI.throwSAFLifecycleCheckException("activity.liveData.observe", true, true, this.LLILLL[3].toString());
                                }
                                this.LL.onChanged(t);
                                return;
                            }
                            this.LL.onChanged(t);
                        }

                        {
                            this.LL = observer;
                            this.LLILLJJLI = mainActivity;
                        }
                    };
                    C1565730qqZ.LIZ.put(observer, new WeakReference<>(observer2));
                } else {
                    final MainActivity mainActivity2 = (MainActivity) lifecycleOwner;
                    observer2 = new Observer<T>(observer, mainActivity2, abstractC1563340qmi) { // from class: X.11Tj
                        public final Observer<T> LL;
                        public final MainActivity LLILLJJLI;
                        public final StackTraceElement[] LLILLL = new Throwable().getStackTrace();

                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(T t) {
                            if (this.LLILLJJLI.getMainSAFFragmentOrNull() != null && !this.LLILLJJLI.getMainSAFFragmentOrNull().getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                                C11KI.LIZ().LIZJ();
                                ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJII();
                                if (!((IDetailFeedSafService) ServiceManager.get().getService(IDetailFeedSafService.class)).LJ() || this.LLILLJJLI.getMainSAFFragmentOrNull() == SAFExtensionKt.LJIILLIIL(this.LLILLJJLI)) {
                                    this.LLILLJJLI.throwSAFLifecycleCheckException("activity.liveData.observe", true, true, this.LLILLL[3].toString());
                                }
                                this.LL.onChanged(t);
                                return;
                            }
                            this.LL.onChanged(t);
                        }

                        {
                            this.LL = observer;
                            this.LLILLJJLI = mainActivity2;
                        }
                    };
                }
                observer = observer2;
            }
            C19FO c19fo = (C19FO) lifecycleOwner;
            AbstractC1563340qmi abstractC1563340qmi2 = (AbstractC1563340qmi) c19fo.getLifecycle();
            EnumC682280QpW enumC682280QpW = EnumC682280QpW.ADD_OBSERVER;
            if ((abstractC1563340qmi2.LJI(enumC682280QpW) || ((AbstractC1563340qmi) c19fo.getLifecycle()).LJI(EnumC682280QpW.GET_CURRENT_STATE)) && (numLIZ2 = C1565730qqZ.LIZ(enumC682280QpW.getValue() | EnumC682280QpW.GET_CURRENT_STATE.getValue(), (context = (Context) lifecycleOwner))) != null) {
                liveData.androidx_lifecycle_LiveData__observe$___twin___(lifecycleOwner, observer);
                C1565730qqZ.LIZIZ(numLIZ2.intValue(), context);
                return;
            }
        } else if (lifecycleOwner instanceof C199Y) {
            if (((AbstractC1563340qmi) lifecycleOwner.getLifecycle()).LJI(EnumC682280QpW.LIVEDATA_OBSERVE)) {
                ((C199Y) lifecycleOwner).throwSAFLifecycleCheckException("activity.lifecycle");
            }
            C19FO c19fo2 = (C19FO) lifecycleOwner;
            AbstractC1563340qmi abstractC1563340qmi3 = (AbstractC1563340qmi) c19fo2.getLifecycle();
            EnumC682280QpW enumC682280QpW2 = EnumC682280QpW.ADD_OBSERVER;
            if ((abstractC1563340qmi3.LJI(enumC682280QpW2) || ((AbstractC1563340qmi) c19fo2.getLifecycle()).LJI(EnumC682280QpW.GET_CURRENT_STATE)) && (numLIZ = C1565730qqZ.LIZ(enumC682280QpW2.getValue() | EnumC682280QpW.GET_CURRENT_STATE.getValue(), c19fo2)) != null) {
                liveData.androidx_lifecycle_LiveData__observe$___twin___(lifecycleOwner, observer);
                C1565730qqZ.LIZIZ(numLIZ.intValue(), c19fo2);
                return;
            }
        }
        liveData.androidx_lifecycle_LiveData__observe$___twin___(lifecycleOwner, observer);
    }
}
