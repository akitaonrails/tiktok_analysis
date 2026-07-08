package X;

import X.C05YF;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.lazy.MultipleInstanceCreatedCallbackWithLifecycleWrapper;
import com.bytedance.als.lazy.SingleInstanceCreatedCallbackWithLifecycleWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS401S0200000_35;
import kotlin.jvm.internal.AwS436S0200000_35;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DQs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2255721DQs<T extends C05YF> implements LifecycleOwner {
    public String featureName;
    public String hostFeatureName;
    public InterfaceC2255791DQz registeredObjectContainerName;
    public final LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
    public final C1688800u34 performanceMonitorCalculate = new C1688800u34(this);
    public final String componentName = getClass().getSimpleName();

    public abstract T getApiComponent();

    public final void dispatchOnCreate$als_release() {
        C1688800u34 c1688800u34 = this.performanceMonitorCalculate;
        c1688800u34.getClass();
        c1688800u34.LIZJ = SystemClock.uptimeMillis();
        onCreate();
        C1688800u34 c1688800u342 = this.performanceMonitorCalculate;
        c1688800u342.LIZ(c1688800u342.LIZ, EnumC1910370zoR.ON_CREATE, SystemClock.uptimeMillis() - c1688800u342.LIZJ);
    }

    public final void dispatchOnDestroy$als_release() {
        C1688800u34 c1688800u34 = this.performanceMonitorCalculate;
        c1688800u34.getClass();
        c1688800u34.LIZJ = SystemClock.uptimeMillis();
        onDestroy();
        C1688800u34 c1688800u342 = this.performanceMonitorCalculate;
        c1688800u342.LIZ(c1688800u342.LIZ, EnumC1910370zoR.ON_DESTROY, SystemClock.uptimeMillis() - c1688800u342.LIZJ);
    }

    public final void dispatchOnPause$als_release() {
        C1688800u34 c1688800u34 = this.performanceMonitorCalculate;
        c1688800u34.getClass();
        c1688800u34.LIZJ = SystemClock.uptimeMillis();
        onPause();
        C1688800u34 c1688800u342 = this.performanceMonitorCalculate;
        c1688800u342.LIZ(c1688800u342.LIZ, EnumC1910370zoR.ON_PAUSE, SystemClock.uptimeMillis() - c1688800u342.LIZJ);
    }

    public final void dispatchOnResume$als_release() {
        C1688800u34 c1688800u34 = this.performanceMonitorCalculate;
        c1688800u34.getClass();
        c1688800u34.LIZJ = SystemClock.uptimeMillis();
        onResume();
        C1688800u34 c1688800u342 = this.performanceMonitorCalculate;
        c1688800u342.LIZ(c1688800u342.LIZ, EnumC1910370zoR.ON_RESUME, SystemClock.uptimeMillis() - c1688800u342.LIZJ);
    }

    public final void dispatchOnStart$als_release() {
        C1688800u34 c1688800u34 = this.performanceMonitorCalculate;
        c1688800u34.getClass();
        c1688800u34.LIZJ = SystemClock.uptimeMillis();
        onStart();
        C1688800u34 c1688800u342 = this.performanceMonitorCalculate;
        c1688800u342.LIZ(c1688800u342.LIZ, EnumC1910370zoR.ON_START, SystemClock.uptimeMillis() - c1688800u342.LIZJ);
    }

    public final void dispatchOnStop$als_release() {
        C1688800u34 c1688800u34 = this.performanceMonitorCalculate;
        c1688800u34.getClass();
        c1688800u34.LIZJ = SystemClock.uptimeMillis();
        onStop();
        C1688800u34 c1688800u342 = this.performanceMonitorCalculate;
        c1688800u342.LIZ(c1688800u342.LIZ, EnumC1910370zoR.ON_STOP, SystemClock.uptimeMillis() - c1688800u342.LIZJ);
    }

    public final StackTraceElement[] getRegisteredObjectContainerStackTrace() {
        InterfaceC2255791DQz interfaceC2255791DQz = this.registeredObjectContainerName;
        if (interfaceC2255791DQz != null) {
            return interfaceC2255791DQz.LIZ();
        }
        return null;
    }

    public void onCreate() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    public void onDestroy() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    public void onPause() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    public void onResume() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    public void onStart() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    public void onStop() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    public String getComponentName() {
        return this.componentName;
    }

    public final String getFeatureName$als_release() {
        return this.featureName;
    }

    public final String getHostFeatureName$als_release() {
        return this.hostFeatureName;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    public final C1688800u34 getPerformanceMonitorCalculate$als_release() {
        return this.performanceMonitorCalculate;
    }

    public final InterfaceC2255791DQz getRegisteredObjectContainerName() {
        return this.registeredObjectContainerName;
    }

    public final InterfaceC2255791DQz getRegisteredObjectContainerName$als_release() {
        return this.registeredObjectContainerName;
    }

    public final void afterInit$als_release(long j) {
        C1688800u34 c1688800u34 = this.performanceMonitorCalculate;
        c1688800u34.LIZ(c1688800u34.LIZ, EnumC1910370zoR.ON_INIT, SystemClock.uptimeMillis() - j);
    }

    public final <T extends C05YF> T findReadyComponent(InterfaceC379610EuV interfaceC379610EuV) {
        Intrinsics.LJIILIIL();
        throw null;
    }

    public final void setFeatureName$als_release(String str) {
        this.featureName = str;
    }

    public final void setHostFeatureName$als_release(String str) {
        this.hostFeatureName = str;
    }

    public final void setRegisteredObjectContainerName$als_release(InterfaceC2255791DQz interfaceC2255791DQz) {
        this.registeredObjectContainerName = interfaceC2255791DQz;
    }

    public final <T extends C05YF> T findReadyComponent(InterfaceC379610EuV interfaceC379610EuV, Class<T> cls) {
        AbstractC2255721DQs<?> abstractC2255721DQsLIZIZ;
        if (!interfaceC379610EuV.getDiContainer().LIZJ(cls) || (abstractC2255721DQsLIZIZ = ((InterfaceC2255741DQu) interfaceC379610EuV.getDiContainer().LJII(InterfaceC2255741DQu.class, null)).LIZIZ(cls)) == null) {
            return null;
        }
        return (T) abstractC2255721DQsLIZIZ.getApiComponent();
    }

    public final <TYPE> void observe(C385670FAf<TYPE> c385670FAf, InterfaceC1441305kZ<TYPE> interfaceC1441305kZ) {
        c385670FAf.LIZ(this, interfaceC1441305kZ);
    }

    public final <T extends C05YF> void whenReady(InterfaceC379610EuV interfaceC379610EuV, Function1<? super T, Unit> function1) {
        Intrinsics.LJIILIIL();
        throw null;
    }

    public final <T extends C05YF> void whenReadyOrThrow(InterfaceC379610EuV interfaceC379610EuV, Function1<? super T, Unit> function1) {
        interfaceC379610EuV.getDiContainer();
        Intrinsics.LJIILIIL();
        throw null;
    }

    public final <TYPE> void observe(LiveData<TYPE> liveData, InterfaceC1441305kZ<TYPE> interfaceC1441305kZ) {
        liveData.observe(this, interfaceC1441305kZ);
    }

    public final <TYPE> void observe(LiveEvent<TYPE> liveEvent, InterfaceC1441305kZ<TYPE> interfaceC1441305kZ) {
        liveEvent.LIZ(this, interfaceC1441305kZ);
    }

    public final <T extends C05YF> void whenReady(InterfaceC379610EuV interfaceC379610EuV, Class<T> cls, Function1<? super T, Unit> function1) {
        if (!interfaceC379610EuV.getDiContainer().LIZJ(cls)) {
            return;
        }
        whenReadyOrThrowInternal(interfaceC379610EuV.getDiContainer(), cls, new AwS604S0100000_25((Function1) function1, (Function1<? super EnumC1678550tmX, Boolean>) 50));
    }

    public final <T extends C05YF> void whenReadyOrThrow(InterfaceC379610EuV interfaceC379610EuV, Class<T> cls, Function1<? super T, Unit> function1) {
        whenReadyOrThrowInternal(interfaceC379610EuV.getDiContainer(), cls, new AwS587S0100000_8(function1, 23));
    }

    public final <T extends C05YF> void whenReadyOrThrowInternal(C1DRG c1drg, Class<T> cls, Function1<? super T, Unit> function1) {
        InterfaceC2255741DQu interfaceC2255741DQu = (InterfaceC2255741DQu) c1drg.LJII(InterfaceC2255741DQu.class, null);
        AbstractC2255721DQs<?> abstractC2255721DQsLIZIZ = interfaceC2255741DQu.LIZIZ(cls);
        if (abstractC2255721DQsLIZIZ != null) {
            function1.invoke(abstractC2255721DQsLIZIZ.getApiComponent());
            return;
        }
        if (c1drg.LIZJ(cls)) {
            if (this.lifecycleRegistry.getCurrentState() == Lifecycle.State.DESTROYED) {
                return;
            }
            C2255751DQv c2255751DQvLIZ = interfaceC2255741DQu.LIZ(cls);
            if (c2255751DQvLIZ != null) {
                C2255731DQt c2255731DQt = new C2255731DQt();
                C2255731DQt c2255731DQt2 = new C2255731DQt();
                AwS401S0200000_35 awS401S0200000_35 = new AwS401S0200000_35(function1, new C013C(), 28);
                AwS436S0200000_35 awS436S0200000_35 = new AwS436S0200000_35(c1drg, c2255751DQvLIZ, 5);
                AwS436S0200000_35 awS436S0200000_352 = new AwS436S0200000_35(c1drg, c2255751DQvLIZ, 6);
                final SingleInstanceCreatedCallbackWithLifecycleWrapper singleInstanceCreatedCallbackWithLifecycleWrapper = new SingleInstanceCreatedCallbackWithLifecycleWrapper(c2255751DQvLIZ.LIZ, c1drg, this.lifecycleRegistry, awS401S0200000_35, c2255731DQt, c2255731DQt2, awS436S0200000_35, awS436S0200000_352);
                singleInstanceCreatedCallbackWithLifecycleWrapper.LLILZ.addObserver(singleInstanceCreatedCallbackWithLifecycleWrapper);
                C1DRG c1drg2 = singleInstanceCreatedCallbackWithLifecycleWrapper.LLILLL;
                Class<?> cls2 = singleInstanceCreatedCallbackWithLifecycleWrapper.LLILLJJLI;
                c1drg2.getClass();
                if (c1drg2.LJIILJJIL(new C1287930jcV(null, cls2), singleInstanceCreatedCallbackWithLifecycleWrapper)) {
                    singleInstanceCreatedCallbackWithLifecycleWrapper.LLILZLL.LIZIZ(new C1DR1() { // from class: X.1DQy
                        @Override // X.C1DR1
                        public final void onCancel() {
                            singleInstanceCreatedCallbackWithLifecycleWrapper.LIZJ();
                        }
                    });
                    if (!(!c2255751DQvLIZ.LIZIZ.isEmpty())) {
                        return;
                    }
                    final MultipleInstanceCreatedCallbackWithLifecycleWrapper multipleInstanceCreatedCallbackWithLifecycleWrapper = new MultipleInstanceCreatedCallbackWithLifecycleWrapper(c2255751DQvLIZ.LIZIZ, c1drg, this.lifecycleRegistry, awS401S0200000_35, c2255731DQt, c2255731DQt2, awS436S0200000_35, awS436S0200000_352);
                    multipleInstanceCreatedCallbackWithLifecycleWrapper.LLILZ.addObserver(multipleInstanceCreatedCallbackWithLifecycleWrapper);
                    for (Class<? extends C05YF> cls3 : multipleInstanceCreatedCallbackWithLifecycleWrapper.LLILLJJLI) {
                        C1DRG c1drg3 = multipleInstanceCreatedCallbackWithLifecycleWrapper.LLILLL;
                        c1drg3.getClass();
                        if (!c1drg3.LJIILJJIL(new C1287930jcV(null, cls3), multipleInstanceCreatedCallbackWithLifecycleWrapper)) {
                            throw new C1DR0("registerInstanceCreatedCallbacks failed");
                        }
                    }
                    multipleInstanceCreatedCallbackWithLifecycleWrapper.LLIZ.LIZIZ(new C1DR1() { // from class: X.1DQx
                        @Override // X.C1DR1
                        public final void onCancel() {
                            multipleInstanceCreatedCallbackWithLifecycleWrapper.LIZJ();
                        }
                    });
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("registerInstanceCreatedCallbacks failed, instanceType: ");
                sbLIZ.append(singleInstanceCreatedCallbackWithLifecycleWrapper.LLILLJJLI);
                throw new C1DR0(C2188811AlT.LIZIZ(sbLIZ));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Impossible! Dependency not registered ");
            sbLIZ2.append(cls.getName());
            throw new C1DR0(C2188811AlT.LIZIZ(sbLIZ2));
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Dependency not registered ");
        sbLIZ3.append(cls.getName());
        throw new C1664780tQK(C2188811AlT.LIZIZ(sbLIZ3));
    }
}
