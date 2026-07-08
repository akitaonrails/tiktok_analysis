package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.199n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214933199n {
    public static C20025513Wz LIZ;
    public static boolean LIZIZ;
    public static final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());

    public static void LIZ(List list) {
        for (Object obj : list) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[ReuseManager] Destroying ");
            sbLIZ.append(list.hashCode());
            sbLIZ.append(" on main thread");
            C2188811AlT.LIZIZ(sbLIZ);
            try {
                if (obj instanceof Scene) {
                    LIZIZ((Scene) obj);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[ReuseManager] Error destroying scene: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(", error: ");
                sbLIZ2.append(e.getMessage());
                C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
    }

    public static void LIZIZ(Scene scene) {
        EnumC214943199x enumC214943199x = scene.mState;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[ReuseManager] Start destroying scene: ");
        sbLIZ.append(scene);
        sbLIZ.append(", initial state: ");
        sbLIZ.append(enumC214943199x);
        C2188811AlT.LIZIZ(sbLIZ);
        try {
            LIZJ(scene, EnumC214943199x.NONE);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[ReuseManager] Error destroying scene: ");
            sbLIZ2.append(scene);
            sbLIZ2.append(", error: ");
            sbLIZ2.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }

    public static void LIZJ(Scene scene, EnumC214943199x enumC214943199x) {
        EnumC214943199x enumC214943199x2 = scene.mState;
        if (enumC214943199x2 == enumC214943199x) {
            return;
        }
        if (enumC214943199x2.value < enumC214943199x.value) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[ReuseManager] Current state lower than target, skip: ");
            sbLIZ.append(scene);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        switch (C214934199o.LIZ[enumC214943199x2.ordinal()]) {
            case 1:
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[ReuseManager] RESUMED -> STARTED (dispatchPause): ");
                sbLIZ2.append(scene);
                C2188811AlT.LIZIZ(sbLIZ2);
                scene.dispatchPause();
                LIZJ(scene, enumC214943199x);
                return;
            case 2:
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("[ReuseManager] STARTED -> ACTIVITY_CREATED (dispatchStop): ");
                sbLIZ3.append(scene);
                C2188811AlT.LIZIZ(sbLIZ3);
                scene.dispatchStop();
                LIZJ(scene, enumC214943199x);
                return;
            case 3:
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("[ReuseManager] ACTIVITY_CREATED -> CREATED (dispatchDestroyView): ");
                sbLIZ4.append(scene);
                C2188811AlT.LIZIZ(sbLIZ4);
                scene.dispatchDestroyView();
                LIZJ(scene, enumC214943199x);
                return;
            case 4:
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("[ReuseManager] VIEW_CREATED -> CREATED (dispatchDestroyView): ");
                sbLIZ5.append(scene);
                C2188811AlT.LIZIZ(sbLIZ5);
                scene.dispatchDestroyView();
                LIZJ(scene, enumC214943199x);
                return;
            case 5:
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("[ReuseManager] CREATED -> NONE (dispatchDestroy + detach): ");
                sbLIZ6.append(scene);
                C2188811AlT.LIZIZ(sbLIZ6);
                scene.dispatchDestroy();
                scene.dispatchDetachScene();
                scene.dispatchDetachActivity();
                LIZJ(scene, enumC214943199x);
                return;
            case 6:
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("[ReuseManager] Scene already at NONE state: ");
                sbLIZ7.append(scene);
                C2188811AlT.LIZIZ(sbLIZ7);
                return;
            default:
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("[ReuseManager] Unknown state: ");
                sbLIZ8.append(scene);
                sbLIZ8.append(", state: ");
                sbLIZ8.append(enumC214943199x2);
                C2188811AlT.LIZIZ(sbLIZ8);
                return;
        }
    }
}
