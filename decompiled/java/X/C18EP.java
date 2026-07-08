package X;

import android.os.SystemClock;
import com.bytedance.android.btm.api.BtmPageLifecycle;
import com.bytedance.android.btm.impl.page.model.PageInfoStack;

/* JADX INFO: renamed from: X.18EP, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18EP {
    public static void LIZIZ(Object obj) {
        C21248618Dk c21248618Dk = C21248618Dk.LIZ;
        c21248618Dk.getClass();
        PageInfoStack pageInfoStackLJIIIZ = C21248618Dk.LJIIIZ(obj);
        if (pageInfoStackLJIIIZ != null) {
            pageInfoStackLJIIIZ.setNativeState(BtmPageLifecycle.State.CREATED);
            LIZ(obj, "onCreated");
        }
        c21248618Dk.getClass();
        C21256818Go c21256818GoLJI = C21248618Dk.LJI(obj);
        if (c21256818GoLJI != null) {
            c21256818GoLJI.LIZIZ = BtmPageLifecycle.State.CREATED;
        }
    }

    public static void LIZJ(Object obj) {
        C21248618Dk.LIZ.getClass();
        PageInfoStack pageInfoStackLJIIIZ = C21248618Dk.LJIIIZ(obj);
        if (pageInfoStackLJIIIZ != null) {
            pageInfoStackLJIIIZ.setNativeState(BtmPageLifecycle.State.DESTROYED);
            LIZ(obj, "onDestroyed");
        }
        if (obj != null) {
            C21248618Dk.LJFF.remove(new C589920NBu(obj));
        }
    }

    public static void LIZLLL(Object obj) {
        C21248618Dk c21248618Dk = C21248618Dk.LIZ;
        c21248618Dk.getClass();
        PageInfoStack pageInfoStackLJIIIZ = C21248618Dk.LJIIIZ(obj);
        if (pageInfoStackLJIIIZ != null) {
            pageInfoStackLJIIIZ.setNativeState(BtmPageLifecycle.State.PAUSED);
            LIZ(obj, "onPaused");
        }
        c21248618Dk.getClass();
        C21256818Go c21256818GoLJI = C21248618Dk.LJI(obj);
        if (c21256818GoLJI != null) {
            c21256818GoLJI.LIZIZ = BtmPageLifecycle.State.PAUSED;
            c21256818GoLJI.LIZ = 0L;
        }
    }

    public static void LJ(Object obj) {
        C21248618Dk c21248618Dk = C21248618Dk.LIZ;
        c21248618Dk.getClass();
        PageInfoStack pageInfoStackLJIIIZ = C21248618Dk.LJIIIZ(obj);
        if (pageInfoStackLJIIIZ != null) {
            pageInfoStackLJIIIZ.setNativeState(BtmPageLifecycle.State.RESUMED);
            LIZ(obj, "onResumed");
        }
        c21248618Dk.getClass();
        C21256818Go c21256818GoLJI = C21248618Dk.LJI(obj);
        if (c21256818GoLJI != null) {
            c21256818GoLJI.LIZIZ = BtmPageLifecycle.State.RESUMED;
            c21256818GoLJI.LIZ = SystemClock.elapsedRealtime();
        }
    }

    public static void LIZ(Object obj, String str) {
        String canonicalName = obj.getClass().getCanonicalName();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NativeStateWriter_");
        sbLIZ.append(str);
        C18CK.LJFF(C2188811AlT.LIZIZ(sbLIZ), new C18I6(canonicalName));
    }
}
