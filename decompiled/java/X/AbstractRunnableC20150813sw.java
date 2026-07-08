package X;

import X.InterfaceC20153313tL;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.ies.powerpreload.task.TaskTraceMetric;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: renamed from: X.13sw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractRunnableC20150813sw<T extends InterfaceC20153313tL> implements InterfaceC20153313tL, Runnable {
    public static final /* synthetic */ InterfaceC2217461Bqa[] LLIZ;
    public final C1555660qaK LL = new C1555660qaK(AFwS219S0000000_30.get$arr$(229));
    public final C1555660qaK LLILLJJLI = new C1555660qaK(AFwS219S0000000_30.get$arr$(230));
    public final C1555660qaK LLILLL = new C1555660qaK(AFwS219S0000000_30.get$arr$(228));
    public final T LLILZ;
    public final C20152313tB LLILZIL;
    public final Bundle LLILZLL;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C13LE.LIZ(AbstractRunnableC20150813sw.class), "owner", "getOwner()Landroid/app/Activity;");
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217371BqR, new C2217371BqR(C13LE.LIZ(AbstractRunnableC20150813sw.class), "stubOwner", "getStubOwner()Landroidx/fragment/app/Fragment;"), new C2217371BqR(C13LE.LIZ(AbstractRunnableC20150813sw.class), "callback", "getCallback()Lcom/bytedance/ies/powerpreload/task/Task$Callback;")};
    }

    public void LIZ(Bundle bundle) {
    }

    public abstract Object LIZJ();

    @Override // X.InterfaceC20153313tL
    public final boolean enable(Bundle bundle) {
        return true;
    }

    public final void LIZIZ() throws Exception {
        TaskTraceMetric taskTraceMetricLIZ;
        Set<Class<?>> setKeySet;
        InterfaceC1726320v1a<?> interfaceC1726320v1a;
        TaskTraceMetric taskTraceMetricLIZ2;
        TaskTraceMetric taskTraceMetricLIZ3;
        TaskTraceMetric taskTraceMetricLIZ4;
        TaskTraceMetric taskTraceMetricLIZ5;
        TaskTraceMetric taskTraceMetricLIZ6;
        try {
            Bundle bundle = this.LLILZLL;
            if (bundle != null && (taskTraceMetricLIZ6 = C1203010hPX.LIZ(bundle)) != null) {
                taskTraceMetricLIZ6.taskExecuteStartTime = SystemClock.elapsedRealtime();
            }
            Object objLIZJ = LIZJ();
            Bundle bundle2 = this.LLILZLL;
            if (bundle2 != null && (taskTraceMetricLIZ5 = C1203010hPX.LIZ(bundle2)) != null) {
                taskTraceMetricLIZ5.taskExecuteEndTime = SystemClock.elapsedRealtime();
            }
            if (objLIZJ != null) {
                HashMap<Class<?>, InterfaceC1726320v1a<?>> map = C20152413tC.LIZ.LJ;
                if (map != null && (setKeySet = map.keySet()) != null) {
                    Iterator<T> it2 = setKeySet.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (((Class) next).isAssignableFrom(objLIZJ.getClass())) {
                            if (next != null) {
                                HashMap<Class<?>, InterfaceC1726320v1a<?>> map2 = C20152413tC.LIZ.LJ;
                                if (map2 == null || (interfaceC1726320v1a = map2.get(next)) == null) {
                                    return;
                                }
                                try {
                                    Bundle bundle3 = this.LLILZLL;
                                    if (bundle3 != null && (taskTraceMetricLIZ4 = C1203010hPX.LIZ(bundle3)) != null) {
                                        taskTraceMetricLIZ4.shootStartTime = SystemClock.elapsedRealtime();
                                    }
                                    interfaceC1726320v1a.LIZ(objLIZJ, LIZLLL());
                                    Bundle bundle4 = this.LLILZLL;
                                    if (bundle4 == null || (taskTraceMetricLIZ3 = C1203010hPX.LIZ(bundle4)) == null) {
                                        return;
                                    }
                                    taskTraceMetricLIZ3.shootEndTime = SystemClock.elapsedRealtime();
                                    return;
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    Bundle bundle5 = this.LLILZLL;
                                    if (bundle5 != null && (taskTraceMetricLIZ2 = C1203010hPX.LIZ(bundle5)) != null) {
                                        taskTraceMetricLIZ2.taskExecuteStartTime = 0L;
                                        taskTraceMetricLIZ2.taskExecuteEndTime = 0L;
                                        taskTraceMetricLIZ2.shootStartTime = 0L;
                                        taskTraceMetricLIZ2.shootEndTime = 0L;
                                    }
                                    T t = this.LLILZ;
                                    if (t instanceof InterfaceC727570SgN) {
                                        ((InterfaceC727570SgN) t).handleException(e);
                                        return;
                                    } else {
                                        if (LIZLLL() == null) {
                                            throw e;
                                        }
                                        InterfaceC1726310v1Z interfaceC1726310v1ZLIZLLL = LIZLLL();
                                        if (interfaceC1726310v1ZLIZLLL != null) {
                                            interfaceC1726310v1ZLIZLLL.LIZ(e);
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                InterfaceC1726310v1Z interfaceC1726310v1ZLIZLLL2 = LIZLLL();
                if (interfaceC1726310v1ZLIZLLL2 != null) {
                    interfaceC1726310v1ZLIZLLL2.onSuccess(objLIZJ);
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            Bundle bundle6 = this.LLILZLL;
            if (bundle6 != null && (taskTraceMetricLIZ = C1203010hPX.LIZ(bundle6)) != null) {
                taskTraceMetricLIZ.taskExecuteStartTime = 0L;
                taskTraceMetricLIZ.taskExecuteEndTime = 0L;
                taskTraceMetricLIZ.shootStartTime = 0L;
                taskTraceMetricLIZ.shootEndTime = 0L;
            }
            T t2 = this.LLILZ;
            if (t2 instanceof InterfaceC727570SgN) {
                ((InterfaceC727570SgN) t2).handleException(e2);
            } else {
                if (LIZLLL() == null) {
                    throw e2;
                }
                InterfaceC1726310v1Z interfaceC1726310v1ZLIZLLL3 = LIZLLL();
                if (interfaceC1726310v1ZLIZLLL3 != null) {
                    interfaceC1726310v1ZLIZLLL3.LIZ(e2);
                }
            }
        }
    }

    public final InterfaceC1726310v1Z LIZLLL() {
        C1555660qaK c1555660qaK = this.LLILLL;
        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = LLIZ;
        return (InterfaceC1726310v1Z) c1555660qaK.LIZ.get();
    }

    public void onDetach() {
        C1555660qaK c1555660qaK = this.LL;
        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = LLIZ;
        if (c1555660qaK.LIZ.get() != null) {
            C1555660qaK c1555660qaK2 = this.LL;
            c1555660qaK2.getClass();
            c1555660qaK2.LIZ = new WeakReference<>(null);
        }
        if (this.LLILLJJLI.LIZ.get() != null) {
            C1555660qaK c1555660qaK3 = this.LLILLJJLI;
            c1555660qaK3.getClass();
            c1555660qaK3.LIZ = new WeakReference<>(null);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("Task@35c4.run");
        try {
            LIZIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Task@35c4.run");
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Task(preload=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", relationData=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AbstractRunnableC20150813sw(T t, C20152313tB c20152313tB, Bundle bundle) {
        this.LLILZ = t;
        this.LLILZIL = c20152313tB;
        this.LLILZLL = bundle;
    }
}
