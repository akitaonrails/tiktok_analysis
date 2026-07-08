package androidx.lifecycle;

import X.AbstractActivityC1602020rn6;
import X.AbstractC1563340qmi;
import X.C05YD;
import X.C09IC;
import X.C11KI;
import X.C1565730qqZ;
import X.C19348610mq;
import X.C19505911Td;
import X.C19506011Te;
import X.C199Y;
import X.C19EG;
import X.C1BNE;
import X.C2188811AlT;
import X.C2474509mp;
import X.C665300Q7s;
import X.EnumC682280QpW;
import X.InterfaceC1294060jmO;
import X.InterfaceC332260D0u;
import X.RunnableC171800lI;
import android.content.Context;
import android.os.Looper;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainRootFragment;
import com.ss.android.ugc.aweme.service.IStrictModeService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public class LifecycleRegistry extends Lifecycle {
    public static final Companion Companion = new Companion();
    public final InterfaceC332260D0u<Lifecycle.State> _currentStateFlow;
    public int addingObserverCounter;
    public final boolean enforceMainThread;
    public boolean handlingEvent;
    public final WeakReference<LifecycleOwner> lifecycleOwner;
    public boolean newEventOccurred;
    public C19505911Td<LifecycleObserver, ObserverWithState> observerMap;
    public ArrayList<Lifecycle.State> parentStates;
    public Lifecycle.State state;

    public static final LifecycleRegistry createUnsafe(LifecycleOwner lifecycleOwner) {
        return Companion.createUnsafe(lifecycleOwner);
    }

    private final void enforceMainThreadIfNeeded(String str) {
        androidx_lifecycle_LifecycleRegistry_com_ss_android_ugc_aweme_lancet_SAFLancet_enforceMainThreadIfNeeded(this, str);
    }

    private final void sync() {
        androidx_lifecycle_LifecycleRegistry_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_sync(this);
    }

    @Override // androidx.lifecycle.Lifecycle
    public void addObserver(LifecycleObserver lifecycleObserver) {
        androidx_lifecycle_LifecycleRegistry_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_addObserver(this, lifecycleObserver);
    }

    @Override // androidx.lifecycle.Lifecycle
    public Lifecycle.State getCurrentState() {
        return androidx_lifecycle_LifecycleRegistry_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCurrentState(this);
    }

    private final boolean isSynced() {
        if (this.observerMap.size() == 0) {
            return true;
        }
        Lifecycle.State state = this.observerMap.eldest().getValue().getState();
        Lifecycle.State state2 = this.observerMap.newest().getValue().getState();
        return state == state2 && this.state == state2;
    }

    private final void popParentState() {
        ListProtector.remove(this.parentStates, r1.size() - 1);
    }

    public final void androidx_lifecycle_LifecycleRegistry__sync$___twin___() {
        LifecycleOwner lifecycleOwner = this.lifecycleOwner.get();
        if (lifecycleOwner == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!isSynced()) {
            this.newEventOccurred = false;
            if (this.state.compareTo(this.observerMap.eldest().getValue().getState()) < 0) {
                backwardPass(lifecycleOwner);
            }
            Map.Entry<LifecycleObserver, ObserverWithState> entryNewest = this.observerMap.newest();
            if (!this.newEventOccurred && entryNewest != null && this.state.compareTo(entryNewest.getValue().getState()) > 0) {
                forwardPass(lifecycleOwner);
            }
        }
        this.newEventOccurred = false;
        this._currentStateFlow.setValue(getCurrentState());
    }

    @Override // androidx.lifecycle.Lifecycle
    public C05YD<Lifecycle.State> getCurrentStateFlow() {
        return C09IC.LIZIZ(this._currentStateFlow);
    }

    public int getObserverCount() {
        androidx_lifecycle_LifecycleRegistry_com_ss_android_ugc_aweme_lancet_SAFLancet_enforceMainThreadIfNeeded(this, "getObserverCount");
        return this.observerMap.size();
    }

    public static final class ObserverWithState {
        public LifecycleEventObserver lifecycleObserver;
        public Lifecycle.State state;

        public final LifecycleEventObserver getLifecycleObserver() {
            return this.lifecycleObserver;
        }

        public final Lifecycle.State getState() {
            return this.state;
        }

        public final void setLifecycleObserver(LifecycleEventObserver lifecycleEventObserver) {
            this.lifecycleObserver = lifecycleEventObserver;
        }

        public final void setState(Lifecycle.State state) {
            this.state = state;
        }

        public ObserverWithState(LifecycleObserver lifecycleObserver, Lifecycle.State state) {
            this.lifecycleObserver = Lifecycling.lifecycleEventObserver(lifecycleObserver);
            this.state = state;
        }

        public final void dispatchEvent(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Lifecycle.State targetState = event.getTargetState();
            this.state = LifecycleRegistry.Companion.min$lifecycle_runtime_release(this.state, targetState);
            this.lifecycleObserver.onStateChanged(lifecycleOwner, event);
            this.state = targetState;
        }
    }

    public Lifecycle.State androidx_lifecycle_LifecycleRegistry__getCurrentState$___twin___() {
        return this.state;
    }

    public static final class Companion {
        public final LifecycleRegistry createUnsafe(LifecycleOwner lifecycleOwner) {
            return new LifecycleRegistry(lifecycleOwner, false);
        }

        public final Lifecycle.State min$lifecycle_runtime_release(Lifecycle.State state, Lifecycle.State state2) {
            if (state2 != null && state2.compareTo(state) < 0) {
                return state2;
            }
            return state;
        }
    }

    public LifecycleRegistry(LifecycleOwner lifecycleOwner) {
        this(lifecycleOwner, true);
    }

    public static Lifecycle.State androidx_lifecycle_LifecycleRegistry_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCurrentState(LifecycleRegistry lifecycleRegistry) {
        if (lifecycleRegistry instanceof AbstractC1563340qmi) {
            AbstractC1563340qmi abstractC1563340qmi = (AbstractC1563340qmi) lifecycleRegistry;
            if (abstractC1563340qmi.LJI(EnumC682280QpW.GET_CURRENT_STATE)) {
                C19EG c19eg = (C19EG) abstractC1563340qmi.LL;
                if (c19eg instanceof MainActivity) {
                    AbstractActivityC1602020rn6 abstractActivityC1602020rn6 = (AbstractActivityC1602020rn6) c19eg;
                    MainRootFragment mainSAFFragmentOrNull = abstractActivityC1602020rn6.getMainSAFFragmentOrNull();
                    if (mainSAFFragmentOrNull != null && abstractActivityC1602020rn6.getNavigationScene() != null && SAFExtensionKt.LJIILLIIL(c19eg) != mainSAFFragmentOrNull) {
                        C11KI.LIZ().LIZJ();
                        ((C199Y) c19eg).throwSAFLifecycleCheckException("activity.lifecycle.getCurrentState");
                        C11KI.LIZ().LJFF();
                        Lifecycle.State stateAndroidx_lifecycle_LifecycleRegistry__getCurrentState$___twin___ = lifecycleRegistry.androidx_lifecycle_LifecycleRegistry__getCurrentState$___twin___();
                        IStrictModeService iStrictModeServiceLIZ = C11KI.LIZ();
                        abstractC1563340qmi.LJ();
                        iStrictModeServiceLIZ.LJII();
                        return stateAndroidx_lifecycle_LifecycleRegistry__getCurrentState$___twin___;
                    }
                } else {
                    ((C199Y) c19eg).throwSAFLifecycleCheckException("activity.lifecycle.getCurrentState");
                }
            }
        }
        return lifecycleRegistry.androidx_lifecycle_LifecycleRegistry__getCurrentState$___twin___();
    }

    public static void androidx_lifecycle_LifecycleRegistry_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_sync(LifecycleRegistry lifecycleRegistry) {
        Context context;
        Integer numLIZ;
        if (lifecycleRegistry instanceof AbstractC1563340qmi) {
            AbstractC1563340qmi abstractC1563340qmi = (AbstractC1563340qmi) lifecycleRegistry;
            EnumC682280QpW enumC682280QpW = EnumC682280QpW.GET_CURRENT_STATE;
            if (abstractC1563340qmi.LJI(enumC682280QpW)) {
                Object obj = abstractC1563340qmi.LL;
                if ((obj instanceof C19EG) && (numLIZ = C1565730qqZ.LIZ(enumC682280QpW.getValue(), (context = (Context) obj))) != null) {
                    lifecycleRegistry.androidx_lifecycle_LifecycleRegistry__sync$___twin___();
                    C1565730qqZ.LIZIZ(numLIZ.intValue(), context);
                    return;
                }
            }
        }
        lifecycleRegistry.androidx_lifecycle_LifecycleRegistry__sync$___twin___();
    }

    private final void backwardPass(LifecycleOwner lifecycleOwner) {
        Iterator<Map.Entry<LifecycleObserver, ObserverWithState>> itDescendingIterator = this.observerMap.descendingIterator();
        while (itDescendingIterator.hasNext() && !this.newEventOccurred) {
            Map.Entry<LifecycleObserver, ObserverWithState> next = itDescendingIterator.next();
            LifecycleObserver key = next.getKey();
            ObserverWithState value = next.getValue();
            while (value.getState().compareTo(this.state) > 0 && !this.newEventOccurred && this.observerMap.LL.containsKey(key)) {
                Lifecycle.Event eventDownFrom = Lifecycle.Event.Companion.downFrom(value.getState());
                if (eventDownFrom != null) {
                    pushParentState(eventDownFrom.getTargetState());
                    value.dispatchEvent(lifecycleOwner, eventDownFrom);
                    popParentState();
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("no event down from ");
                    sbLIZ.append(value.getState());
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
    }

    private final Lifecycle.State calculateTargetState(LifecycleObserver lifecycleObserver) {
        Lifecycle.State state;
        C19506011Te<LifecycleObserver, ObserverWithState> c19506011Te;
        ObserverWithState observerWithState;
        C19505911Td<LifecycleObserver, ObserverWithState> c19505911Td = this.observerMap;
        Lifecycle.State state2 = null;
        if (c19505911Td.LL.containsKey(lifecycleObserver) && (c19506011Te = c19505911Td.LL.get(lifecycleObserver).LLILZ) != null && (observerWithState = c19506011Te.LLILLJJLI) != null) {
            state = observerWithState.getState();
        } else {
            state = null;
        }
        if (!this.parentStates.isEmpty()) {
            state2 = (Lifecycle.State) ListProtector.get(this.parentStates, r1.size() - 1);
        }
        Companion companion = Companion;
        return companion.min$lifecycle_runtime_release(companion.min$lifecycle_runtime_release(this.state, state), state2);
    }

    private final void forwardPass(LifecycleOwner lifecycleOwner) {
        SafeIterableMap<LifecycleObserver, ObserverWithState>.d dVarIteratorWithAdditions = this.observerMap.iteratorWithAdditions();
        while (dVarIteratorWithAdditions.hasNext() && !this.newEventOccurred) {
            Map.Entry entry = (Map.Entry) dVarIteratorWithAdditions.next();
            Object key = entry.getKey();
            ObserverWithState observerWithState = (ObserverWithState) entry.getValue();
            while (observerWithState.getState().compareTo(this.state) < 0 && !this.newEventOccurred && this.observerMap.LL.containsKey(key)) {
                pushParentState(observerWithState.getState());
                Lifecycle.Event eventUpFrom = Lifecycle.Event.Companion.upFrom(observerWithState.getState());
                if (eventUpFrom != null) {
                    observerWithState.dispatchEvent(lifecycleOwner, eventUpFrom);
                    popParentState();
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("no event up from ");
                    sbLIZ.append(observerWithState.getState());
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
    }

    private final void moveToState(Lifecycle.State state) {
        if (this.state == state) {
            return;
        }
        LifecycleRegistryKt.androidx_lifecycle_LifecycleRegistryKt_com_ss_android_ugc_aweme_utils_LifecycleStateCheckLancet_checkLifecycleStateTransition(this.lifecycleOwner.get(), this.state, state);
        this.state = state;
        if (!this.handlingEvent && this.addingObserverCounter == 0) {
            this.handlingEvent = true;
            androidx_lifecycle_LifecycleRegistry_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_sync(this);
            this.handlingEvent = false;
            if (this.state == Lifecycle.State.DESTROYED) {
                this.observerMap = new C19505911Td<>();
                return;
            }
            return;
        }
        this.newEventOccurred = true;
    }

    private final void pushParentState(Lifecycle.State state) {
        this.parentStates.add(state);
    }

    public void androidx_lifecycle_LifecycleRegistry__addObserver$___twin___(LifecycleObserver lifecycleObserver) {
        LifecycleOwner lifecycleOwner;
        boolean z;
        androidx_lifecycle_LifecycleRegistry_com_ss_android_ugc_aweme_lancet_SAFLancet_enforceMainThreadIfNeeded(this, "addObserver");
        Lifecycle.State state = this.state;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        ObserverWithState observerWithState = new ObserverWithState(lifecycleObserver, state2);
        if (this.observerMap.putIfAbsent(lifecycleObserver, observerWithState) != null || (lifecycleOwner = this.lifecycleOwner.get()) == null) {
            return;
        }
        if (this.addingObserverCounter == 0 && !this.handlingEvent) {
            z = false;
        } else {
            z = true;
        }
        Lifecycle.State stateCalculateTargetState = calculateTargetState(lifecycleObserver);
        this.addingObserverCounter++;
        while (observerWithState.getState().compareTo(stateCalculateTargetState) < 0 && this.observerMap.LL.containsKey(lifecycleObserver)) {
            pushParentState(observerWithState.getState());
            Lifecycle.Event eventUpFrom = Lifecycle.Event.Companion.upFrom(observerWithState.getState());
            if (eventUpFrom != null) {
                observerWithState.dispatchEvent(lifecycleOwner, eventUpFrom);
                popParentState();
                stateCalculateTargetState = calculateTargetState(lifecycleObserver);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("no event up from ");
                sbLIZ.append(observerWithState.getState());
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (!z) {
            androidx_lifecycle_LifecycleRegistry_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_sync(this);
        }
        this.addingObserverCounter--;
    }

    public final void androidx_lifecycle_LifecycleRegistry__enforceMainThreadIfNeeded$___twin___(String str) {
        if (this.enforceMainThread && !LifecycleRegistry_androidKt.isMainThread()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Method ");
            sbLIZ.append(str);
            sbLIZ.append(" must be called on the main thread");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalStateException(strLIZIZ);
        }
    }

    public void handleLifecycleEvent(Lifecycle.Event event) {
        androidx_lifecycle_LifecycleRegistry_com_ss_android_ugc_aweme_lancet_SAFLancet_enforceMainThreadIfNeeded(this, "handleLifecycleEvent");
        moveToState(event.getTargetState());
    }

    @InterfaceC1294060jmO
    public void markState(Lifecycle.State state) {
        androidx_lifecycle_LifecycleRegistry_com_ss_android_ugc_aweme_lancet_SAFLancet_enforceMainThreadIfNeeded(this, "markState");
        setCurrentState(state);
    }

    @Override // androidx.lifecycle.Lifecycle
    public void removeObserver(LifecycleObserver lifecycleObserver) {
        androidx_lifecycle_LifecycleRegistry_com_ss_android_ugc_aweme_lancet_SAFLancet_enforceMainThreadIfNeeded(this, "removeObserver");
        this.observerMap.remove(lifecycleObserver);
    }

    public void setCurrentState(Lifecycle.State state) {
        androidx_lifecycle_LifecycleRegistry_com_ss_android_ugc_aweme_lancet_SAFLancet_enforceMainThreadIfNeeded(this, "setCurrentState");
        moveToState(state);
    }

    public LifecycleRegistry(LifecycleOwner lifecycleOwner, boolean z) {
        this.enforceMainThread = z;
        this.observerMap = new C19505911Td<>();
        Lifecycle.State state = Lifecycle.State.INITIALIZED;
        this.state = state;
        this.parentStates = new ArrayList<>();
        this.lifecycleOwner = new WeakReference<>(lifecycleOwner);
        this._currentStateFlow = C1BNE.LIZ(state);
    }

    public static void androidx_lifecycle_LifecycleRegistry_com_ss_android_ugc_aweme_lancet_LifecycleRegistryLancet_addObserver(LifecycleRegistry lifecycleRegistry, LifecycleObserver lifecycleObserver) {
        Looper mainLooper = Looper.getMainLooper();
        Looper looperMyLooper = Looper.myLooper();
        if (!C665300Q7s.LIZ() && !Intrinsics.LJFF(mainLooper, looperMyLooper)) {
            C2474509mp.LIZ(new RunnableC171800lI(new C19348610mq(lifecycleRegistry, lifecycleObserver)));
        } else {
            lifecycleRegistry.androidx_lifecycle_LifecycleRegistry__addObserver$___twin___(lifecycleObserver);
        }
    }

    public static void androidx_lifecycle_LifecycleRegistry_com_ss_android_ugc_aweme_lancet_SAFLancet_enforceMainThreadIfNeeded(LifecycleRegistry lifecycleRegistry, String str) {
        if (C665300Q7s.LIZ()) {
            return;
        }
        lifecycleRegistry.androidx_lifecycle_LifecycleRegistry__enforceMainThreadIfNeeded$___twin___(str);
    }

    public static void androidx_lifecycle_LifecycleRegistry_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_addObserver(LifecycleRegistry lifecycleRegistry, LifecycleObserver lifecycleObserver) {
        if (!(lifecycleRegistry instanceof AbstractC1563340qmi)) {
            androidx_lifecycle_LifecycleRegistry_com_ss_android_ugc_aweme_lancet_LifecycleRegistryLancet_addObserver(lifecycleRegistry, lifecycleObserver);
            return;
        }
        AbstractC1563340qmi abstractC1563340qmi = (AbstractC1563340qmi) lifecycleRegistry;
        if (!abstractC1563340qmi.LJI(EnumC682280QpW.ADD_OBSERVER)) {
            androidx_lifecycle_LifecycleRegistry_com_ss_android_ugc_aweme_lancet_LifecycleRegistryLancet_addObserver(lifecycleRegistry, lifecycleObserver);
            return;
        }
        for (Class cls : C1565730qqZ.LIZIZ) {
            if (cls.isAssignableFrom(lifecycleObserver.getClass())) {
                androidx_lifecycle_LifecycleRegistry_com_ss_android_ugc_aweme_lancet_LifecycleRegistryLancet_addObserver(lifecycleRegistry, lifecycleObserver);
                return;
            }
        }
        String name = lifecycleObserver.getClass().getName();
        if (!name.startsWith("androidx.compose.ui") && !name.startsWith("androidx.lifecycle.LiveData")) {
            C11KI.LIZ().LIZJ();
            C199Y c199y = (C199Y) abstractC1563340qmi.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("activity.lifecycle.addObserver ");
            sbLIZ.append(name);
            c199y.throwSAFLifecycleCheckException(C2188811AlT.LIZIZ(sbLIZ));
            C11KI.LIZ().LIZ();
            androidx_lifecycle_LifecycleRegistry_com_ss_android_ugc_aweme_lancet_LifecycleRegistryLancet_addObserver(lifecycleRegistry, lifecycleObserver);
            IStrictModeService iStrictModeServiceLIZ = C11KI.LIZ();
            abstractC1563340qmi.LJ();
            iStrictModeServiceLIZ.LJIIIIZZ();
            return;
        }
        androidx_lifecycle_LifecycleRegistry_com_ss_android_ugc_aweme_lancet_LifecycleRegistryLancet_addObserver(lifecycleRegistry, lifecycleObserver);
    }
}
