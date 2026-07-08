package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import com.lynx.tasm.LynxView;
import java.lang.ref.WeakReference;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0phW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1521680phW implements InterfaceC1530230pvJ {
    public static final JavaOnlyMap LJ;
    public static final JavaOnlyMap LJFF;
    public static final com.lynx.react.bridge.JavaOnlyMap LJI;
    public static final com.lynx.react.bridge.JavaOnlyMap LJII;
    public final Object LIZ;
    public final InterfaceC1521790phh LIZIZ;
    public final Queue<Pair<Object, Object[]>> LIZJ = new ArrayBlockingQueue(512);
    public WeakReference<View> LIZLLL;

    static {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putInt("errorCode", 0);
        javaOnlyMap.putString("errorMessage", "success");
        LJ = javaOnlyMap;
        JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
        javaOnlyMap2.putInt("errorCode", -1);
        javaOnlyMap2.putString("errorMessage", "bad parameters");
        LJFF = javaOnlyMap2;
        com.lynx.react.bridge.JavaOnlyMap javaOnlyMap3 = new com.lynx.react.bridge.JavaOnlyMap();
        javaOnlyMap3.putInt("errorCode", 0);
        javaOnlyMap3.putString("errorMessage", "success");
        LJI = javaOnlyMap3;
        com.lynx.react.bridge.JavaOnlyMap javaOnlyMap4 = new com.lynx.react.bridge.JavaOnlyMap();
        javaOnlyMap4.putInt("errorCode", -1);
        javaOnlyMap4.putString("errorMessage", "bad parameters");
        LJII = javaOnlyMap4;
    }

    public final LynxView LIZIZ() {
        LynxView lynxView;
        WeakReference<View> weakReference = this.LIZLLL;
        View view = weakReference != null ? weakReference.get() : null;
        return (!(view instanceof LynxView) || (lynxView = (LynxView) view) == null) ? LIZJ() : lynxView;
    }

    public final LynxView LIZJ() {
        LynxView lynxView;
        String str;
        View viewLIZ;
        Object obj = this.LIZ;
        if (!(obj instanceof C1521690phX)) {
            return null;
        }
        C1521690phX c1521690phX = (C1521690phX) obj;
        c1521690phX.getClass();
        C1520380pfQ.LIZ.getClass();
        if (C1520380pfQ.LJIILJJIL) {
            WeakReference<LynxView> weakReference = c1521690phX.LIZIZ;
            if (weakReference != null) {
                lynxView = weakReference.get();
            }
            str = ((C1521690phX) this.LIZ).LIZ;
            if (str == null && (viewLIZ = C1514790pWP.LIZ(str)) != null && (viewLIZ instanceof LynxView)) {
                return (LynxView) viewLIZ;
            }
            return null;
        }
        lynxView = c1521690phX.LIZJ;
        if (lynxView != null) {
            return lynxView;
        }
        str = ((C1521690phX) this.LIZ).LIZ;
        return str == null ? null : null;
    }

    public final void LJ() {
        while (!this.LIZJ.isEmpty()) {
            Pair pair = (Pair) ((ArrayBlockingQueue) this.LIZJ).poll();
            if (pair != null) {
                LIZ(pair.getFirst(), (Object[]) pair.getSecond());
            }
        }
    }

    @Override // X.InterfaceC1530230pvJ
    public final void n5() {
        LJ();
    }

    @Override // X.InterfaceC1530230pvJ
    public final void p5() {
        LJ();
    }

    @Override // X.InterfaceC1530230pvJ
    public final void o5(View view) {
        this.LIZLLL = new WeakReference<>(view);
        LJ();
    }

    public C1521680phW(Object obj, InterfaceC1521790phh interfaceC1521790phh) {
        this.LIZ = obj;
        this.LIZIZ = interfaceC1521790phh;
        if (obj instanceof C1521690phX) {
            ((C1521690phX) obj).LIZLLL = this;
        }
        LynxView lynxViewLIZJ = LIZJ();
        if (lynxViewLIZJ != null) {
            this.LIZLLL = new WeakReference<>(lynxViewLIZJ);
        }
    }

    public final void LIZ(Object obj, Object[] objArr) {
        Object c098200Yq;
        try {
            this.LIZIZ.onMethodInvoked(obj, objArr);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1520960pgM.LIZIZ(thM5exceptionOrNullimpl);
        }
    }

    public final void LIZLLL(Object obj, Object... objArr) {
        if (this.LIZLLL != null) {
            LIZ(obj, objArr);
            return;
        }
        ((ArrayBlockingQueue) this.LIZJ).offer(new Pair(obj, objArr));
    }
}
